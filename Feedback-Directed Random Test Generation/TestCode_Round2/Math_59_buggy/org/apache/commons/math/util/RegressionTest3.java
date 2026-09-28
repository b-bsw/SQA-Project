package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1674231661645518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7735389809079516d + "'", double1 == 0.7735389809079516d);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        long long1 = org.apache.commons.math.util.FastMath.round((-32.57791748631743d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-33L) + "'", long1 == (-33L));
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7735389809079516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        long long1 = org.apache.commons.math.util.FastMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.69482111198402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8857088863088404d + "'", double1 == 0.8857088863088404d);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5730.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 6.102016471589204E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1016289084929765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.11868704625112d + "'", double1 == 63.11868704625112d);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7047567822517626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7820802611773309d + "'", double1 == 0.7820802611773309d);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.999448616881847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        float float1 = org.apache.commons.math.util.FastMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-32.267649876135856d), (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-32.26764987613585d) + "'", double2 == (-32.26764987613585d));
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.4862913247812135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7928643348714102d) + "'", double1 == (-0.7928643348714102d));
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818247238476d + "'", double1 == 1.7182818247238476d);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7825372599825183d, (-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2145517147893816d + "'", double2 == 2.2145517147893816d);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.42041931513487113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0896856194228446d + "'", double1 == 1.0896856194228446d);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732511156817248d + "'", double1 == 3.732511156817248d);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        double double2 = org.apache.commons.math.util.FastMath.min(5730.0d, 1.0896856194228446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0896856194228446d + "'", double2 == 1.0896856194228446d);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        double double1 = org.apache.commons.math.util.FastMath.asin(37.21392919076789d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        int int1 = org.apache.commons.math.util.FastMath.abs(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6563678204210392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6563678204210394d + "'", double1 == 0.6563678204210394d);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 90L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.192987713658941d + "'", double1 == 5.192987713658941d);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.8139497520487735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.675653009906092d + "'", double1 == 15.675653009906092d);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5847577751518754E-6d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5050276162256437E-186d + "'", double2 == 2.5050276162256437E-186d);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9999999999999999d), 9.346544339204282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999998d) + "'", double2 == (-0.9999999999999998d));
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.845663344538835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3295225782386857d + "'", double1 == 2.3295225782386857d);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.951187273260123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4343845205023977d + "'", double1 == 1.4343845205023977d);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.3648280517791587E-23d, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.590466459908002E-72d + "'", double2 == 8.590466459908002E-72d);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6535374302343122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9223289201784547d + "'", double1 == 0.9223289201784547d);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 35L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-32.57791748631743d), (-1.437600971038334d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6148957975355112d) + "'", double2 == (-1.6148957975355112d));
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9933731825245955d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557407710533861d + "'", double1 == 1.557407710533861d);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2499132869489418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        double double1 = org.apache.commons.math.util.FastMath.acosh(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.43450228702824d + "'", double1 == 5.43450228702824d);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        double double2 = org.apache.commons.math.util.FastMath.min(2.951187273260123d, (-0.009213398835148427d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.009213398835148427d) + "'", double2 == (-0.009213398835148427d));
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        double double2 = org.apache.commons.math.util.FastMath.min(9.079985986933498E-5d, (-0.6284217534373299d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6284217534373299d) + "'", double2 == (-0.6284217534373299d));
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.496025759922821d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6852301231749561d) + "'", double1 == (-0.6852301231749561d));
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.005402996770772377d, 71.6197243913529d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0054029967707723775d + "'", double2 == 0.0054029967707723775d);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, 5507.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7791612621104443d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.04323229440977d) + "'", double1 == (-1.04323229440977d));
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.041945072145264d, (-0.009213529184899942d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9872136726111863d + "'", double2 == 0.9872136726111863d);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        double double1 = org.apache.commons.math.util.FastMath.ulp(120.42757201625032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999999958776928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.57070552693625d + "'", double1 == 1.57070552693625d);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.017454178737585296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.017452406437283508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5882496193148399d + "'", double1 == 1.5882496193148399d);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4195903379527587d) + "'", double1 == (-0.4195903379527587d));
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5261303806882357d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5540437953657898d) + "'", double1 == (-0.5540437953657898d));
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1589375003169518d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.371194766956427d + "'", double2 == 4.371194766956427d);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.544137102816975d + "'", double1 == 7.544137102816975d);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8334737036630134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9853647714477322d + "'", double1 == 0.9853647714477322d);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.09478022484215487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09506557725167404d + "'", double1 == 0.09506557725167404d);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (short) 0, (-0.010176746632802332d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        double double1 = org.apache.commons.math.util.FastMath.expm1(71.6197243913529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2707236083120753E31d + "'", double1 == 1.2707236083120753E31d);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8184464592320668d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        double double1 = org.apache.commons.math.util.FastMath.acos(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.444667861009766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4099056480256106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9931469449749069d + "'", double1 == 1.9931469449749069d);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1727924348551592d + "'", double1 == 0.1727924348551592d);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5404195002705842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6154095886644868d) + "'", double1 == (-0.6154095886644868d));
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-90L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 90.0f + "'", float1 == 90.0f);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-466.4266135928925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8427842873511956E202d + "'", double1 == 1.8427842873511956E202d);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        long long1 = org.apache.commons.math.util.FastMath.round(100.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3956124250860895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8948825727293745d + "'", double1 == 1.8948825727293745d);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.927271896797736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4616178806179598d + "'", double1 == 1.4616178806179598d);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.46819606815034E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.468196043089957E-4d + "'", double1 == 2.468196043089957E-4d);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5404195002705842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7167268785408383d + "'", double1 == 1.7167268785408383d);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7167268785408383d, 2.3295225782386857d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5216140716751916d + "'", double2 == 3.5216140716751916d);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0530637390494224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        double double1 = org.apache.commons.math.util.FastMath.log10((-6.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.613775297505947d, 0.7019710183189237d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4894820176053498d + "'", double2 == 1.4894820176053498d);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.06558580471017249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06549192716803806d) + "'", double1 == (-0.06549192716803806d));
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904824216d) + "'", double1 == (-0.41032129904824216d));
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1844562330844421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07351901771299219d + "'", double1 == 0.07351901771299219d);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.9075758706536994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5907801071923648d + "'", double1 == 1.5907801071923648d);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7645662682374061d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4444561992238574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2018553154285492d + "'", double1 == 1.2018553154285492d);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-4.122307281809905E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1223072818099046E-9d) + "'", double1 == (-4.1223072818099046E-9d));
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.7791612621104443d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.89543714211785d) + "'", double1 == (-13.89543714211785d));
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5536062115091314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8211080655056974d) + "'", double1 == (-0.8211080655056974d));
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2407288686697961d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.4215467286739085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5561319766247041d + "'", double1 == 1.5561319766247041d);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        double double1 = org.apache.commons.math.util.FastMath.log(212.75275683459444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.360130725463979d + "'", double1 == 5.360130725463979d);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.58351893845611d + "'", double1 == 3.58351893845611d);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.999999969540041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.84147096835031d + "'", double1 == 0.84147096835031d);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.13371234504895402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8748416809531622d + "'", double1 == 0.8748416809531622d);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1016289084929765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1016289084929765d + "'", double1 == 1.1016289084929765d);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.5261303806882357d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.180265029949425E20d + "'", double1 == 8.180265029949425E20d);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6088496173769596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.356194490192345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-135.0d) + "'", double1 == (-135.0d));
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.01518445968368543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01530032932138615d + "'", double1 == 0.01530032932138615d);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        double double1 = org.apache.commons.math.util.FastMath.sin(6013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00833887421809711d) + "'", double1 == (-0.00833887421809711d));
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7893750108307105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013777192971961798d + "'", double1 == 0.013777192971961798d);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9647007265430612d, 2.4215467286739085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9647007265430613d + "'", double2 == 0.9647007265430613d);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.013777192971961798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2397288196990742d + "'", double1 == 0.2397288196990742d);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-2.5287649310207496d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5604874136486533d, (-0.13371234504895402d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.560487413648653d + "'", double2 == 1.560487413648653d);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7987095471340483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7316602644632267d) + "'", double1 == (-0.7316602644632267d));
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.07998601188716E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005202448765189584d + "'", double1 == 0.005202448765189584d);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5840734641020677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11.940141468803507d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.940141468803505d + "'", double2 == 11.940141468803505d);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6156614753256583d + "'", double1 == 0.6156614753256583d);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8968903759882284d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8968903759882284d + "'", double1 == 0.8968903759882284d);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3408013099384417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.526476712002587d + "'", double1 == 19.526476712002587d);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.7162978893146719d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.233403117511217d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5278888682247538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.142599163434008d + "'", double1 == 1.142599163434008d);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.10903143175231947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10903143175231948d + "'", double1 == 0.10903143175231948d);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.460256182988026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        long long1 = org.apache.commons.math.util.FastMath.round(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        double double2 = org.apache.commons.math.util.FastMath.min((double) ' ', (-0.6852301231749561d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6852301231749561d) + "'", double2 == (-0.6852301231749561d));
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2499132869489418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.61475609949856d + "'", double1 == 71.61475609949856d);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6583966420468889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2355885565015715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6278458088294271d) + "'", double1 == (-0.6278458088294271d));
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.437600971038334d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1331999452259886E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1331999452259886E-46d + "'", double1 == 1.1331999452259886E-46d);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.0374464491245434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48250862996283855d + "'", double1 == 0.48250862996283855d);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1674231661645518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06722830713210516d + "'", double1 == 0.06722830713210516d);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        double double1 = org.apache.commons.math.util.FastMath.rint((-466.4266135928925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-466.0d) + "'", double1 == (-466.0d));
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.1748021039363996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.16429734860675368d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15151031285994174d) + "'", double1 == (-0.15151031285994174d));
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        double double2 = org.apache.commons.math.util.FastMath.max(6.191476652127584E48d, (-0.8065537826828391d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.191476652127584E48d + "'", double2 == 6.191476652127584E48d);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.06820006471439112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0683060003022046d + "'", double1 == 0.0683060003022046d);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (-33L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1898842314256335d) + "'", double1 == (-4.1898842314256335d));
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.327581142581999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5812207450977618d + "'", double1 == 1.5812207450977618d);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (-33L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5405025668761214d) + "'", double1 == (-1.5405025668761214d));
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.46285676099588835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5886057758090093d + "'", double1 == 1.5886057758090093d);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6483608274590867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.217652850343311d + "'", double1 == 1.217652850343311d);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        double double1 = org.apache.commons.math.util.FastMath.abs((-2.0565321053670247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0565321053670247d + "'", double1 == 2.0565321053670247d);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.5805651145852763d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        double double1 = org.apache.commons.math.util.FastMath.tan(43.1284181946612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.147277566020156d) + "'", double1 == (-1.147277566020156d));
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1071487177940904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.691673596021348E41d, (-0.4099056480256106d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021347E41d + "'", double2 == 6.691673596021347E41d);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3408013099384417d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.32410684590028493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3134238597771562d + "'", double1 == 0.3134238597771562d);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.927271896797736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9751446278717821d + "'", double1 == 0.9751446278717821d);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.12931063444698587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9333701257923868d + "'", double1 == 0.9333701257923868d);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8939966636005579d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.441486971549388d) + "'", double1 == (-1.441486971549388d));
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5596122796450436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2273817004129048d + "'", double1 == 1.2273817004129048d);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (-90.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.0269835496406734d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.3504116548137945d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7408664348929599d) + "'", double1 == (-0.7408664348929599d));
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.00000000000001d + "'", double1 == 52.00000000000001d);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) 90L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-3.8551464208140986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2722218725854069E-14d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7408664348929599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8105257933460475d) + "'", double1 == (-0.8105257933460475d));
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.7182819603591994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 155.74608385512988d + "'", double1 == 155.74608385512988d);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8211080655056974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8211080655056973d) + "'", double1 == (-0.8211080655056973d));
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2707236083120753E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.104051098596297d + "'", double1 == 31.104051098596297d);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6156614753256583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48505801955099925d) + "'", double1 == (-0.48505801955099925d));
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7735389809079516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3393416562538205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.102293192940162d + "'", double1 == 1.102293192940162d);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9036922050915067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2697583504133625d + "'", double1 == 1.2697583504133625d);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.69482111198402d, 0.13211426394445566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3828979036148312d + "'", double2 == 1.3828979036148312d);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.42944819032518d + "'", double1 == 43.42944819032518d);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8962302130072298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10955796484928035d) + "'", double1 == (-0.10955796484928035d));
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1016289084929765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8337177321043896d + "'", double1 == 0.8337177321043896d);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0896856194228446d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459045d + "'", double2 == 2.718281828459045d);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        double double2 = org.apache.commons.math.util.FastMath.min(5.43450228702824d, 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.61512051684126d + "'", double2 == 4.61512051684126d);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 5507L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        double double1 = org.apache.commons.math.util.FastMath.tan(37.574240039999225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12552491762180948d) + "'", double1 == (-0.12552491762180948d));
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6156614753256583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6156614753256584d + "'", double1 == 0.6156614753256584d);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        double double1 = org.apache.commons.math.util.FastMath.abs(212.75275683459444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 212.75275683459444d + "'", double1 == 212.75275683459444d);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.322723236313804d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.079985961979837E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.080398205182299E-5d + "'", double1 == 9.080398205182299E-5d);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.17011361997944d) + "'", double1 == (-31.17011361997944d));
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6865874069985795d) + "'", double1 == (-0.6865874069985795d));
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-6.838249024841735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.620982778800085d) + "'", double1 == (-2.620982778800085d));
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.306922469822426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.999999999996d + "'", double1 == 11013.999999999996d);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        int int1 = org.apache.commons.math.util.FastMath.round(1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8947805892373116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8947805892373116d + "'", double1 == 0.8947805892373116d);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.298342365610588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.5050276162256437E-186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6535374302343122d, 0.33452691736804824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.33452691736804824d + "'", double2 == 0.33452691736804824d);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.5287649310207496d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (-1L), (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707963267948961d, (-1.233403117511217d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5729347079345366d + "'", double2 == 0.5729347079345366d);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078964d) + "'", double1 == (-0.8414709848078964d));
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4251878220010183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1525354798260945d + "'", double1 == 1.1525354798260945d);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-2.5922362574545064d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.191476652127584E48d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.25569770210804E-141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-140.2793696225354d) + "'", double1 == (-140.2793696225354d));
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(37.87285640966904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.154092655271697d + "'", double1 == 6.154092655271697d);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000000000001d + "'", double1 == 32.00000000000001d);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2397288196990742d, 1.5886057758090093d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14977507862289408d + "'", double2 == 0.14977507862289408d);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-27.87634950490267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48653408229724276d) + "'", double1 == (-0.48653408229724276d));
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        double double1 = org.apache.commons.math.util.FastMath.rint((-36.005914226169836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9376558078861459d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        int int1 = org.apache.commons.math.util.FastMath.round((-90.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-90) + "'", int1 == (-90));
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5707963267948963d), 120.01818825115909d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 120.01818825115909d + "'", double2 == 120.01818825115909d);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        double double1 = org.apache.commons.math.util.FastMath.log(3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1552453009332422d + "'", double1 == 1.1552453009332422d);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9634526785268085d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.374102388374377E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.374102388374377E-9d) + "'", double1 == (-1.374102388374377E-9d));
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.45054953406980763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6372778494888827d + "'", double1 == 0.6372778494888827d);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.01365785170622981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999067329932104d + "'", double1 == 0.9999067329932104d);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.559685672897289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.3634064240365d) + "'", double1 == (-89.3634064240365d));
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.666408003094785d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.10955796484928035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1093389265928446d) + "'", double1 == (-0.1093389265928446d));
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.174802103936399d + "'", double1 == 3.174802103936399d);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8482836399575129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8482836399575129d + "'", double1 == 0.8482836399575129d);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.5922362574545064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.202619401730384d) + "'", double1 == (-1.202619401730384d));
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2191734374167393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021278590635779134d + "'", double1 == 0.021278590635779134d);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0683060003022046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.539788332061041E-13d, 0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.450721885123068E-11d + "'", double2 == 3.450721885123068E-11d);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8337177321043896d, (-1.169015201985079d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.522076013060139d + "'", double2 == 2.522076013060139d);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.227971924677803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7645662682374061d) + "'", double1 == (-1.7645662682374061d));
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.46749874460386d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        double double1 = org.apache.commons.math.util.FastMath.exp((-33.40828846862413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.097167320859874E-15d + "'", double1 == 3.097167320859874E-15d);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1071487177940904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5760630454288633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.025293885879535d + "'", double1 == 2.025293885879535d);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7456241416655579d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8166592361428845d) + "'", double1 == (-0.8166592361428845d));
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (-33L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0530637390494226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8334737036630135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.101088875655695d + "'", double1 == 1.101088875655695d);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.169015201985079d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.99598501395558d) + "'", double1 == (-0.99598501395558d));
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948957d + "'", double1 == 1.5707963267948957d);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        long long2 = org.apache.commons.math.util.FastMath.min(90L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.053671212772351E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.053671212772351E-8d + "'", double1 == 1.053671212772351E-8d);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7577337065923179d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9555128717466592d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8916039409537213d) + "'", double1 == (-1.8916039409537213d));
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9979202349577406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7408664348929599d), 0.10903143175231947d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8089563172728976d, 0.3846148358776134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9216936941393117d + "'", double2 == 0.9216936941393117d);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        float float2 = org.apache.commons.math.util.FastMath.min((-90.0f), (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7853981613362947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6657737487535582d + "'", double1 == 0.6657737487535582d);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.830640877860784d + "'", double1 == 0.830640877860784d);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.075847940722074d, 0.8813736213307353d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0665578081381937d + "'", double2 == 1.0665578081381937d);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948961d) + "'", double1 == (-1.5707963267948961d));
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.011983210854855571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999282021879747d + "'", double1 == 0.9999282021879747d);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.1752011936438014d), 2.0565321053670247d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5191607731424398d) + "'", double2 == (-0.5191607731424398d));
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) (-90));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        long long1 = org.apache.commons.math.util.FastMath.round(6.708062067639405d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.01745240643728351d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.005656731589213857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005656701421335315d + "'", double1 == 0.005656701421335315d);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.445323844714277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2432260666726136d + "'", double1 == 3.2432260666726136d);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6657737487535582d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 5507L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8947805892373116d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0683060003022046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.845663344538835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9979202349577406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8799022061561323d + "'", double1 == 0.8799022061561323d);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1674231661645518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9853647714477322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7651502649370375d + "'", double1 == 0.7651502649370375d);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7047567822517626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.656559119563622d + "'", double1 == 0.656559119563622d);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        double double1 = org.apache.commons.math.util.FastMath.log(0.17543139267904395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.74050723741301d) + "'", double1 == (-1.74050723741301d));
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.250318945146276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.490762386278728d + "'", double1 == 8.490762386278728d);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.09506557725167404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45639522978117497d + "'", double1 == 0.45639522978117497d);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8390715290764523d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.566370614359173d + "'", double1 == 2.566370614359173d);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3494089883469367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9330380764829064d + "'", double1 == 0.9330380764829064d);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5631767322193112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5982251431131134d) + "'", double1 == (-0.5982251431131134d));
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.437600971038334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1286157825604266d) + "'", double1 == (-1.1286157825604266d));
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 90.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        double double1 = org.apache.commons.math.util.FastMath.tan(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.755849220270756d) + "'", double1 == (-6.755849220270756d));
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3710356884721411d + "'", double1 == 0.3710356884721411d);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-4.187482763357499d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-33L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 33.0f + "'", float1 == 33.0f);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7928643348714102d), 0.69482111198402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.69482111198402d + "'", double2 == 0.69482111198402d);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.6881171418160975E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9955924691418044E14d + "'", double1 == 2.9955924691418044E14d);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        double double1 = org.apache.commons.math.util.FastMath.acos((-6.838249024841735d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9894177983454929d, 2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.989417798345493d + "'", double2 == 0.989417798345493d);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.011658811940024915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6887971054572842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9376558078861459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.72372042780569d + "'", double1 == 53.72372042780569d);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.046019547268505E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745284947299009d + "'", double1 == 0.01745284947299009d);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7218011448664199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6180237337779616d + "'", double1 == 0.6180237337779616d);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5982251431131134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.926672077942048d + "'", double1 == 1.926672077942048d);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5515659755035023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.99471985749452d + "'", double1 == 51.99471985749452d);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        double double2 = org.apache.commons.math.util.FastMath.max(2.566370614359173d, (-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.566370614359173d + "'", double2 == 2.566370614359173d);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.918853748407959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7084653196386397d + "'", double1 == 1.7084653196386397d);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11.548739357257746d, (-4.1898842314256335d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.91882856777121d + "'", double2 == 1.91882856777121d);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        double double1 = org.apache.commons.math.util.FastMath.log(1.445323844714277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3683334104437261d + "'", double1 == 0.3683334104437261d);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        double double1 = org.apache.commons.math.util.FastMath.expm1(34.37746770784939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.510293288140764E14d + "'", double1 == 8.510293288140764E14d);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.534938999763997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-87.94552649650909d) + "'", double1 == (-87.94552649650909d));
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 33.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6893272594363031d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 90L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.91882856777121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03348987628893477d + "'", double1 == 0.03348987628893477d);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3710356884721411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7185746547661834d + "'", double1 == 0.7185746547661834d);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        float float1 = org.apache.commons.math.util.FastMath.abs(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.999448616881847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1083832032431884d + "'", double1 == 3.1083832032431884d);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0176055895227847d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8571332032039712d, (-36.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 257.19381419176113d + "'", double2 == 257.19381419176113d);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9278183521288984d), 0.005402996770772377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005402996770772377d + "'", double2 == 0.005402996770772377d);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.169015201985079d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7456241416655579d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3689423485032375d) + "'", double1 == (-1.3689423485032375d));
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3705561619927477d + "'", double1 == 0.3705561619927477d);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        double double1 = org.apache.commons.math.util.FastMath.ulp(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0947125472611012d + "'", double1 == 2.0947125472611012d);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8674595620891006d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7615941559557649d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4029365680925863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.09698324645938282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0924287889629486d) + "'", double1 == (-0.0924287889629486d));
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 630998.4197775756d + "'", double1 == 630998.4197775756d);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) (-33L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.011983210854855571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011983210854855571d + "'", double1 == 0.011983210854855571d);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7853981613362947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.9999998819046d + "'", double1 == 44.9999998819046d);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.202619401730384d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.814615669229906d + "'", double1 == 1.814615669229906d);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.872983346207419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1312.6929859424645d + "'", double1 == 1312.6929859424645d);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-89.3634064240365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.0d) + "'", double1 == (-89.0d));
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.743980336957493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7317887661991493d + "'", double1 == 0.7317887661991493d);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.989874861238103d, (-0.7791612621104443d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0079608471186376d + "'", double2 == 1.0079608471186376d);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        double double1 = org.apache.commons.math.util.FastMath.acos(46.23553270010918d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082317d + "'", double1 == 1.5607966601082317d);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6269791532528178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.761141324937584d + "'", double1 == 4.761141324937584d);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.5663706143591734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9882684920925461d + "'", double1 == 0.9882684920925461d);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.46360058552194d, 1.835438933818835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4636005855219394d + "'", double2 == 2.4636005855219394d);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9020848703947254d, 0.999999969540041d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999999969540041d + "'", double2 == 0.999999969540041d);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.9473741150701356d, (-0.6852301231749561d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9091395677903495d + "'", double2 == 1.9091395677903495d);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9091395677903495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9091395677903498d + "'", double1 == 1.9091395677903498d);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9091395677903498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.841927185055935d) + "'", double1 == (-2.841927185055935d));
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.13211426394445566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13249892381659706d + "'", double1 == 0.13249892381659706d);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.991318745538845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3280247521861903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5707055269358083d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 8.490762386278728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6487212707001282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2707236083120753E31d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.105427357601002E-15d, 1.6117713285146709d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4084587136495436E-15d + "'", double2 == 4.4084587136495436E-15d);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.2145517147893816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4881369946309988d + "'", double1 == 1.4881369946309988d);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        double double1 = org.apache.commons.math.util.FastMath.asinh(45.057704222641604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5012142829615005d + "'", double1 == 4.5012142829615005d);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3846148358776134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3752021393940158d + "'", double1 == 0.3752021393940158d);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9036922050915067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6437952663115192d + "'", double1 == 0.6437952663115192d);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.1286157825604266d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.010176922302104895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21670660727375085d) + "'", double1 == (-0.21670660727375085d));
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.4505495340698077d), 1.3953649341158527d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3953649341158527d + "'", double2 == 1.3953649341158527d);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        long long1 = org.apache.commons.math.util.FastMath.round(0.011983210854855573d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.005402996770772377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1482743665672453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1471972199216043d + "'", double1 == 0.1471972199216043d);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 7L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.21020213304517052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3590146193143267d + "'", double1 == 1.3590146193143267d);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.01745329251994342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000007d + "'", double1 == 1.000000000000007d);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8844064800831344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48557554205341846d + "'", double1 == 0.48557554205341846d);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9473741150701356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2860268482059916d + "'", double1 == 1.2860268482059916d);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.841927185055935d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9416868226777982d) + "'", double1 == (-0.9416868226777982d));
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.0392740995950414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4610626787992866d + "'", double1 == 1.4610626787992866d);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6154095886644868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.0089148066056253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.002962815258153d) + "'", double1 == (-1.002962815258153d));
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.830640877860784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0948410127421968d + "'", double1 == 1.0948410127421968d);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7591415563789915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3022547416014814d + "'", double1 == 1.3022547416014814d);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        double double1 = org.apache.commons.math.util.FastMath.sin(34.37746770784939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1790802230737255d + "'", double1 == 0.1790802230737255d);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.433759246577862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13660857585579214d + "'", double1 == 0.13660857585579214d);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.989417798345493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7651502649370375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6995216443485196d + "'", double1 == 0.6995216443485196d);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.358221623915482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6657737487535582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6176678238363069d + "'", double1 == 0.6176678238363069d);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8968903759882284d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        int int2 = org.apache.commons.math.util.FastMath.max((-90), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        long long1 = org.apache.commons.math.util.FastMath.abs(4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        double double1 = org.apache.commons.math.util.FastMath.floor((-27.876349504902667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-28.0d) + "'", double1 == (-28.0d));
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        long long2 = org.apache.commons.math.util.FastMath.min(7L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6633147175924029d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7130376554537363d) + "'", double1 == (-0.7130376554537363d));
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3710356884721411d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.9091395677903498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2808376786846926d + "'", double1 == 0.2808376786846926d);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.539788332061041E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.539788332061041E-13d + "'", double1 == 2.539788332061041E-13d);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5631767322193112d), 0.3846148358776134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3846148358776134d + "'", double2 == 0.3846148358776134d);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.358221623915482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.738038368372738d + "'", double1 == 28.738038368372738d);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.441486971549388d), 0.6535374302343122d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6535374302343122d + "'", double2 == 0.6535374302343122d);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1071487177940904d) + "'", double1 == (-1.1071487177940904d));
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.192987713658941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9180159690299023d) + "'", double1 == (-1.9180159690299023d));
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4551915228366852E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267803446d + "'", double1 == 1.5707963267803446d);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5507L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7591415563789915d, 0.8962302130072298d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7811629682982569d + "'", double2 == 0.7811629682982569d);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.4084587136495436E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1552453009332422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020162834169477797d + "'", double1 == 0.020162834169477797d);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.102293192940162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8922451992629652d + "'", double1 == 0.8922451992629652d);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8196150146861299d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        double double2 = org.apache.commons.math.util.FastMath.max(2.4862913247812135d, (-27.876349504902667d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4862913247812135d + "'", double2 == 2.4862913247812135d);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        double double1 = org.apache.commons.math.util.FastMath.rint((-2.5922362574545064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5840734641020677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7642469915557848d + "'", double1 == 0.7642469915557848d);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.761141324937584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08309759227292604d + "'", double1 == 0.08309759227292604d);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        double double1 = org.apache.commons.math.util.FastMath.sinh(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080487E43d + "'", double1 == 1.3440585709080487E43d);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6672440571753369d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5884022289215687d) + "'", double1 == (-0.5884022289215687d));
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        double double2 = org.apache.commons.math.util.FastMath.pow((-89.0d), 48980.58846231743d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948957d + "'", double2 == 1.5707963267948957d);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3010299956639812d + "'", double1 == 0.3010299956639812d);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.13371234504895402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.661153040102054d) + "'", double1 == (-7.661153040102054d));
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-90L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-90) + "'", int1 == (-90));
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.194315997789401d + "'", double1 == 1.194315997789401d);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.3648280517791587E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        double double1 = org.apache.commons.math.util.FastMath.atan(56.936981707418624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.553234855038964d + "'", double1 == 1.553234855038964d);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5558726996235265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7434618395438615d + "'", double1 == 1.7434618395438615d);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        double double1 = org.apache.commons.math.util.FastMath.cos(51.99999915301149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16298994513340984d) + "'", double1 == (-0.16298994513340984d));
    }
}

