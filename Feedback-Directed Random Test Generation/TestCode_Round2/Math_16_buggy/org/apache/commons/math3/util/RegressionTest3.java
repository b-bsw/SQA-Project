package org.apache.commons.math3.util;

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
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.9132181397411985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1511132905840549d) + "'", double1 == (-1.1511132905840549d));
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-63L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-63.0d) + "'", double1 == (-63.0d));
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-26.33959286127792d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        double double1 = org.apache.commons.math3.util.FastMath.rint(7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.7200786095266942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30196465536956996d + "'", double1 == 0.30196465536956996d);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.1425465430742778d), 0.6420149920119997d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(160.80803418105256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8066296601189507d + "'", double1 == 2.8066296601189507d);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        int int2 = org.apache.commons.math3.util.FastMath.max((-2), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.007334883977608064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.9932229419742513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-2), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1025.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.19611987703015263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.5872036550391518d), (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.451272896403611E-39d) + "'", double2 == (-3.451272896403611E-39d));
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(7.62364218539641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.968131753285203d + "'", double1 == 1.968131753285203d);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612778d + "'", double1 == 4.641588833612778d);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0842021724855044E-19d + "'", double1 == 1.0842021724855044E-19d);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        float float1 = org.apache.commons.math3.util.FastMath.signum(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.061290475572342844d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39427356861218293d) + "'", double1 == (-0.39427356861218293d));
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000002f + "'", float1 == 3.0000002f);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8446874961776067d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.7224284372420832d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-41.392100454203025d) + "'", double1 == (-41.392100454203025d));
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5670585390721963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5670585390721965d + "'", double1 == 1.5670585390721965d);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        double double1 = org.apache.commons.math3.util.FastMath.atan(22026.474197238054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570750926882484d + "'", double1 == 1.570750926882484d);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, (-5.9029581035870565E20d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.9029581035870565E20d) + "'", double2 == (-5.9029581035870565E20d));
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.4844222297453324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9483582177369652d + "'", double1 == 0.9483582177369652d);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.03417412840354696d, 0.8524213316116924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04006919567109118d + "'", double2 == 0.04006919567109118d);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1L, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9735692101318192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0267863625707878d) + "'", double1 == (-0.0267863625707878d));
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.3440585709080678E43d, (-0.5687609160957652d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3440585709080678E43d) + "'", double2 == (-1.3440585709080678E43d));
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-14.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.778151250383643d, (-0.9719903465379038d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7781512503836425d + "'", double2 == 3.7781512503836425d);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 4L, 4.768373E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        double double1 = org.apache.commons.math3.util.FastMath.acos(5.795192390859045E46d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.9999999403953551d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453291479645992d) + "'", double1 == (-0.017453291479645992d));
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-14));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.19589283408591d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.03417412840354696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9580333260613905d + "'", double1 == 1.9580333260613905d);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(52.0d, 1.503897021644941d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6363957575729347d) + "'", double2 == (-0.6363957575729347d));
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 1, (long) (-29));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.20824159849321072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 1025, 2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11030288331712183d + "'", double2 == 0.11030288331712183d);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        long long2 = org.apache.commons.math3.util.FastMath.min(1023L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(7.737125E25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.611686E18f + "'", float1 == 4.611686E18f);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        int int2 = org.apache.commons.math3.util.FastMath.min((-6), 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.37438953472E11d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.37438953472E11d) + "'", double1 == (-1.37438953472E11d));
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-63L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 63L + "'", long1 == 63L);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.00001f + "'", float1 == 97.00001f);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.0272356433182504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30087022627717525d + "'", double1 == 0.30087022627717525d);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.4489023749402996d, 0.8524213316116924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25594028828308524d) + "'", double2 == (-0.25594028828308524d));
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-1), 0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6483608274590866d + "'", double2 == 0.6483608274590866d);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.3012989023072947d, (-63));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4950732694200756E-19d + "'", double2 == 2.4950732694200756E-19d);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        double double1 = org.apache.commons.math3.util.FastMath.sin(7.313219942645561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8573168196649732d + "'", double1 == 0.8573168196649732d);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.9999999403953551d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574075204780884d) + "'", double1 == (-1.5574075204780884d));
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.224719895935548d) + "'", double1 == (-7.224719895935548d));
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        float float1 = org.apache.commons.math3.util.FastMath.signum(99.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        float float1 = org.apache.commons.math3.util.FastMath.signum(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.2679114584199251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.64597536373867d + "'", double1 == 72.64597536373867d);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.010988398859591287d, 1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010988398859591287d + "'", double2 == 0.010988398859591287d);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8745129512124437d + "'", double1 == 0.8745129512124437d);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 8L, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.8828122E-4f, 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.19902312E12f + "'", float2 == 2.19902312E12f);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.9999999f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        double double1 = org.apache.commons.math3.util.FastMath.exp(148.40979009083827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.841534261491385E64d + "'", double1 == 2.841534261491385E64d);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.9982230451921064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950371911495349d + "'", double1 == 0.9950371911495349d);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(5.795192390859045E46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108.36909013398466d + "'", double1 == 108.36909013398466d);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.75502076286542E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000705009d + "'", double1 == 1.000000000705009d);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-8.45477224674693d), 1.569820717348332d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6056686600052703d) + "'", double2 == (-0.6056686600052703d));
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.385850023714672d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.0000000000000004d, (-0.17364804653184446d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0000000000000004d) + "'", double2 == (-2.0000000000000004d));
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 1.2207033E-4f, 1.9732551840809704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9732551878567528d + "'", double2 == 1.9732551878567528d);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0000000000291038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000014552d + "'", double1 == 1.000000000014552d);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        double double1 = org.apache.commons.math3.util.FastMath.floor(749.9999389648439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 749.0d + "'", double1 == 749.0d);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0000000000291038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175201193688711d + "'", double1 == 1.175201193688711d);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 512.5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-9.632848614896423E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        double double1 = org.apache.commons.math3.util.FastMath.abs(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9981953489305545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.841534261491385E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8460065493236117E48d + "'", double1 == 5.8460065493236117E48d);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 32, 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207031E-4f + "'", float2 == 1.2207031E-4f);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 6000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6000.0d + "'", double1 == 6000.0d);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 6.0000005f, 97.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.000000476837158d + "'", double2 == 6.000000476837158d);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1023.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.623641707626563d + "'", double1 == 7.623641707626563d);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-6.1035153E-5f), 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0019531248835846782d) + "'", double2 == (-0.0019531248835846782d));
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.1305288720633906E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.0591403123201d) + "'", double1 == (-13.0591403123201d));
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.017453291479645992d), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.2124675420131484E28d) + "'", double2 == (-2.2124675420131484E28d));
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 63L, 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2064384.0f + "'", float2 == 2064384.0f);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.11321160719436832d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8929616830058433d + "'", double1 == 0.8929616830058433d);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(97.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(10.127541722024175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-1023L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-1023.99994f), (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-15.999999046325684d) + "'", double2 == (-15.999999046325684d));
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        double double1 = org.apache.commons.math3.util.FastMath.signum(10.082648376090521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9466715061814477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.981898135071284d + "'", double1 == 0.981898135071284d);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.09453594272628993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.416510530506886d + "'", double1 == 5.416510530506886d);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.666140437719302E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.5642090973306d + "'", double1 == 21.5642090973306d);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.999999999999999d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 46655.999999999956d + "'", double2 == 46655.999999999956d);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 1, (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.015625f + "'", float2 == 0.015625f);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-1), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.8011238661903161d, (-0.0267863625707878d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0024670109333179424d) + "'", double2 == (-0.0024670109333179424d));
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        double double1 = org.apache.commons.math3.util.FastMath.tan(10.000000953674316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483621820319939d + "'", double1 == 0.6483621820319939d);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.39567227992801673d, (-0.005519215703220059d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5847443794151275d + "'", double2 == 1.5847443794151275d);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        int int1 = org.apache.commons.math3.util.FastMath.abs(38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 3.8146973E-6f, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.814697265625E-6d + "'", double2 == 3.814697265625E-6d);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        int int2 = org.apache.commons.math3.util.FastMath.min(1023, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(0.015625f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.015625002f + "'", float1 == 0.015625002f);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.094947E-13f, 1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207033E-4f + "'", float2 == 1.2207033E-4f);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.15566292355646663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15693881177778274d + "'", double1 == 0.15693881177778274d);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.13158548711983195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36274713936822706d + "'", double1 == 0.36274713936822706d);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(6.1035156E-5f, 47999.996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1035156E-5f + "'", float2 == 6.1035156E-5f);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-25.30591789243267d), 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.30591789243267364d) + "'", double2 == (-0.30591789243267364d));
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.4359738368E11d, 3.443593622809233E69d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.027800920562904d + "'", double2 == 6.027800920562904d);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6000.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6000.0f + "'", float1 == 6000.0f);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        long long2 = org.apache.commons.math3.util.FastMath.max(1500L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2), (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 374.99997f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.36491594307659d + "'", double1 == 19.36491594307659d);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.8460065493236117E48d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3495150228208087E50d + "'", double1 == 3.3495150228208087E50d);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 7.737125E25f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.8640954259078427d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 97, 749.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00000000000001d + "'", double2 == 97.00000000000001d);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(42971.83113775489d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.16227766016838d + "'", double1 == 2.16227766016838d);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2.8E-45f, 0.31358451852720004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0691650524286674E-14d + "'", double2 == 1.0691650524286674E-14d);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.118326675304813E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) -1, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.499188385108773d, 5.268356063861754E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.268356063861754E-9d + "'", double2 == 5.268356063861754E-9d);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.7802246589084126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 6, (long) 1024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(11.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        long long2 = org.apache.commons.math3.util.FastMath.min((-63L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5403023058681398d, (double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5403023058681398d + "'", double2 == 0.5403023058681398d);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.9982230451921064d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9982230451921064d + "'", double2 == 2.9982230451921064d);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-2));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.1771933557663626E-8d + "'", double1 == 5.1771933557663626E-8d);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.648361369288039d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(6.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.000001f + "'", float1 == 6.000001f);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 32, 1500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5847443794151275d, 1.2202849466483139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5847443794151275d + "'", double2 == 1.5847443794151275d);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        double double1 = org.apache.commons.math3.util.FastMath.atan(148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.564058481760474d + "'", double1 == 1.564058481760474d);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1190346870425511E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1190346870425513E-15d + "'", double1 == 1.1190346870425513E-15d);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.0f, 1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842022E-19f + "'", float2 == 1.0842022E-19f);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8582226493088282d) + "'", double1 == (-0.8582226493088282d));
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-1.7397064891248464E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.739706489124846E-4d) + "'", double1 == (-1.739706489124846E-4d));
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2227587494850775E-162d + "'", double1 == 2.2227587494850775E-162d);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.027800920562904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.482576781564405d + "'", double1 == 2.482576781564405d);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.58351893845611d + "'", double1 == 3.58351893845611d);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.7853981633974483d), 0.02283062218882923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.444667861009766d + "'", double1 == 1.444667861009766d);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 7.827881037133875E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6973483401028054d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8344632077604134d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.18792839447947E-5d + "'", double2 == 8.18792839447947E-5d);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.999938966709995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(8.918828546453101d, 26.562736412595044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.323937163077181d + "'", double2 == 0.323937163077181d);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.2042575597576729d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.0861605114833828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48941851000927195d + "'", double1 == 0.48941851000927195d);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.000000033134038d + "'", double1 == 2.000000033134038d);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.2207031E-4f, (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0517578E-5f + "'", float2 == 3.0517578E-5f);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-1024.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0f + "'", float1 == 1024.0f);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5125258378901132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-8.45477224674693d), (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.905037623592521E11d) + "'", double2 == (-2.905037623592521E11d));
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.814697265625009E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625000000000014d + "'", double1 == 0.015625000000000014d);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1025.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5.268356063861754E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000005268356d + "'", double1 == 1.000000005268356d);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033391107665127d + "'", double1 == 0.9033391107665127d);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        double double2 = org.apache.commons.math3.util.FastMath.max(155.74607629780772d, (double) (-29));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 155.74607629780772d + "'", double2 == 155.74607629780772d);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 0, 7.623641707626563d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.5872036550391518d), (double) 1024.0001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.734409381589459E-4d) + "'", double2 == (-5.734409381589459E-4d));
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1003275537854505E-17d + "'", double1 == 3.1003275537854505E-17d);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1500L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1500.0d + "'", double1 == 1500.0d);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.569462994251686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999991111122963d + "'", double1 == 0.9999991111122963d);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.0000002f, 1.2980741E33f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000002f + "'", float2 == 1.0000002f);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.768371582031611E-7d + "'", double1 == 4.768371582031611E-7d);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.1920928955078157E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796207585607d + "'", double1 == 1.570796207585607d);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.267909768656307d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(8.18792839447947E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.187928385330529E-5d + "'", double1 == 8.187928385330529E-5d);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9999999999998679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.174119582065703d + "'", double1 == 15.174119582065703d);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.778151250383643d, 3.8104773809653514d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7811383772589705d + "'", double2 == 0.7811383772589705d);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.571098934738399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9735692101318192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(6.000001f, (-6.1035153E-5f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.000001f) + "'", float2 == (-6.000001f));
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 1023L, 1.6718308188647008E103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.0d + "'", double2 == 1023.0d);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(15.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.856115509710435E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794411d + "'", double1 == 1.570796326794411d);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.000001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-26.33959286127792d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1368887786267312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8133637952951194d + "'", double1 == 0.8133637952951194d);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.2401310215141802E-16d, (-0.11294857116009238d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1415926535897922d + "'", double2 == 3.1415926535897922d);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        double double2 = org.apache.commons.math3.util.FastMath.max((-5.305943194514724d), 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.000000000705009d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000705009d + "'", double2 == 1.000000000705009d);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        double double2 = org.apache.commons.math3.util.FastMath.min(11.7910068511973d, 0.9866275920404852d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9866275920404852d + "'", double2 == 0.9866275920404852d);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-1023.99994f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.99994f + "'", float1 == 1023.99994f);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.99999994f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.9982230451921064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.248867982141762d + "'", double1 == 1.248867982141762d);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-1.1511132905840549d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0480275261378338d) + "'", double1 == (-1.0480275261378338d));
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 137 + "'", int1 == 137);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 1, 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.0f + "'", float2 == 512.0f);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-0.99999994f), 3.1415926535897922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999403953552d) + "'", double2 == (-0.9999999403953552d));
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-127.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23235910202965793d + "'", double1 == 0.23235910202965793d);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.814697265625E-6d, 0.3683211063593682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3683211063593682d + "'", double2 == 0.3683211063593682d);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.02909330424175981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029101516801199417d + "'", double1 == 0.029101516801199417d);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        double double1 = org.apache.commons.math3.util.FastMath.acos(231.46791666571625d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2097152.0d + "'", double1 == 2097152.0d);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.8133637952951194d, 0.029101516801199417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.029101516801199417d + "'", double2 == 0.029101516801199417d);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        double double2 = org.apache.commons.math3.util.FastMath.max((-57.29577951308232d), 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 0.015625002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625637653511198d + "'", double1 == 0.015625637653511198d);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1.5111573E23f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.443593622809233E69d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69.53701189487664d + "'", double1 == 69.53701189487664d);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        int int2 = org.apache.commons.math3.util.FastMath.max(39, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.2207033E-4f, (-1023.99994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2207033E-4f) + "'", float2 == (-1.2207033E-4f));
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.671830818864701E103d, (-0.006517711624664084d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.671830818864701E103d + "'", double2 == 1.671830818864701E103d);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.466528223471357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24339128723952508d) + "'", double1 == (-0.24339128723952508d));
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(512.5f, (float) 1024L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.5f + "'", float2 == 512.5f);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3.8146973E-6f, 137);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 2.8E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.802596928649635E-45d + "'", double1 == 2.802596928649635E-45d);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.5705654518541791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9734594443576854d, (double) 6.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 512.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07977109790154036d) + "'", double1 == (-0.07977109790154036d));
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(36.871107594012706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.030192941051162E16d + "'", double1 == 1.030192941051162E16d);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.0267863625707878d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 10L, 0.17453294184418977d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.8795935176771806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.39699624996822d + "'", double1 == 50.39699624996822d);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.17452205010929986d), (-0.31622776601683805d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17452205010929986d) + "'", double2 == (-0.17452205010929986d));
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.9999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0517578E-5f + "'", float2 == 3.0517578E-5f);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        long long2 = org.apache.commons.math3.util.FastMath.max(2147483647L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.7371252E25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 4.641588833612778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.641588833612778d + "'", double2 == 4.641588833612778d);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1500.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0f + "'", float1 == 1500.0f);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        float float2 = org.apache.commons.math3.util.FastMath.max(47999.996f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47999.996f + "'", float2 == 47999.996f);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(11.7910068511973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-63), (-1023.99994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-63.0f) + "'", float2 == (-63.0f));
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.820766E-11f + "'", float1 == 5.820766E-11f);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.25594028828308524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2956339896854956d) + "'", double1 == (-0.2956339896854956d));
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0000000000000002E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002E100d + "'", double1 == 1.0000000000000002E100d);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.9539726886959428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.599187944144099d + "'", double1 == 3.599187944144099d);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.011048543456039806d, (double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011048543456039806d + "'", double2 == 0.011048543456039806d);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        double double1 = org.apache.commons.math3.util.FastMath.rint(74.38989177586092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.0d + "'", double1 == 74.0d);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.4255617839730704E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4247223454937545E21d + "'", double1 == 2.4247223454937545E21d);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.922737656982237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        float float2 = org.apache.commons.math3.util.FastMath.min(1025.0f, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-127.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7276.563998161455d) + "'", double1 == (-7276.563998161455d));
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-14));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.315287191035679E-7d + "'", double1 == 8.315287191035679E-7d);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.000004f + "'", float1 == 32.000004f);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.2794150403540232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2794150403540232d + "'", double1 == 0.2794150403540232d);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.0019531248835846782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.0f, 1.7200786095266942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 63, (-63L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        double double2 = org.apache.commons.math3.util.FastMath.max(108.43494882292201d, 1.2679114584199251d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 108.43494882292201d + "'", double2 == 108.43494882292201d);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4657022738769552d + "'", double1 == 1.4657022738769552d);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-8.45477224674693d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-2L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8849970445005177d + "'", double1 == 0.8849970445005177d);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        double double1 = org.apache.commons.math3.util.FastMath.atan(15.174119582065703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5049898015397962d + "'", double1 == 1.5049898015397962d);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-63), 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2016.0f) + "'", float2 == (-2016.0f));
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 5.820766E-11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326736689d + "'", double1 == 1.570796326736689d);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.24187733445678708d, 7.629365427493558E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707647845032549d + "'", double2 == 1.5707647845032549d);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-26.33959286127792d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.569462994251686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.92360567258659d + "'", double1 == 89.92360567258659d);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.2233715E18f, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233715E18f + "'", float2 == 9.2233715E18f);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(89.92360567258659d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3043045862358962d + "'", double1 == 1.3043045862358962d);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-2.0000000000000004d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13533528323661262d + "'", double1 == 0.13533528323661262d);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        long long2 = org.apache.commons.math3.util.FastMath.min((-63L), 1025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0141204E32f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.4801364395941514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9766253859580151d + "'", double1 == 0.9766253859580151d);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.6379788E-12f + "'", float1 == 3.6379788E-12f);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9073862646776047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4337733935187889d + "'", double1 == 0.4337733935187889d);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        double double1 = org.apache.commons.math3.util.FastMath.acos(7.571098934738399d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        double double1 = org.apache.commons.math3.util.FastMath.floor(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.4411627128891868d, 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4411627128891868d + "'", double2 == 1.4411627128891868d);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-1024));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1920928955078097E-7d, 5.416510530506886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078099E-7d + "'", double2 == 1.1920928955078099E-7d);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.3495150228208087E50d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        int int2 = org.apache.commons.math3.util.FastMath.min(9, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1024);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.010299956639812d + "'", double1 == 3.010299956639812d);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        double double1 = org.apache.commons.math3.util.FastMath.log(230.25850929940458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.439202631236047d + "'", double1 == 5.439202631236047d);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.48168124860751377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.029101516801199417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1), (-1024));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1024) + "'", int2 == (-1024));
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950547536867305d + "'", double1 == 0.9950547536867305d);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(74.20994852478785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6942252369286008E32d + "'", double1 == 1.6942252369286008E32d);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        double double2 = org.apache.commons.math3.util.FastMath.min(Double.NaN, 57.29577951307475d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.029101516801199417d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014550758400599708d + "'", double2 == 0.014550758400599708d);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.02909330424175981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029101515410080516d + "'", double1 == 0.029101515410080516d);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        int int2 = org.apache.commons.math3.util.FastMath.min(52, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9029845678036967d, 1.0003709130606282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09738634525693146d) + "'", double2 == (-0.09738634525693146d));
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        float float1 = org.apache.commons.math3.util.FastMath.signum(512.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.570796326736689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356580291d + "'", double1 == 0.9171523356580291d);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.6420149920119997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.8066296601189507d, (-0.11321160719436832d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8897341156536202d + "'", double2 == 0.8897341156536202d);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        int int2 = org.apache.commons.math3.util.FastMath.min((-63), 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 39);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 39.0f + "'", float1 == 39.0f);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        float float2 = org.apache.commons.math3.util.FastMath.max(100.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 750L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42971.83463481174d + "'", double1 == 42971.83463481174d);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.288323357835553E-62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(374.99997f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 375.0f + "'", float1 == 375.0f);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5670585390721963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2919361797649715d + "'", double1 == 2.2919361797649715d);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(750.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0842021724855044E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0842021724855044E-19d + "'", double1 == 1.0842021724855044E-19d);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 97, 1024.0001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0001f + "'", float2 == 1024.0001f);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        double double1 = org.apache.commons.math3.util.FastMath.asin(5.8460065493236117E48d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.267909768656307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 0L, 0.3683211063593682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.2676506E30f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5111573E23f + "'", float1 == 1.5111573E23f);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.09738634525693146d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0016997123712174172d) + "'", double1 == (-0.0016997123712174172d));
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0000002f + "'", float1 == 2.0000002f);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 1023.0f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2046.0d + "'", double2 == 2046.0d);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        double double1 = org.apache.commons.math3.util.FastMath.sin(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 39);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1500.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 0, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1025);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1025 + "'", int1 == 1025);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-63L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(9.974937185533099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.990700744648233d + "'", double1 == 2.990700744648233d);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1024.0f), 100.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1024.0f) + "'", float2 == (-1024.0f));
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 63);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 63L + "'", long1 == 63L);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 4.882813E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.882813E-4f + "'", float2 == 4.882813E-4f);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.7615941559679877d, 0.04006919567109118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.812917954340138d + "'", double2 == 11.812917954340138d);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-6.000001f), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.000001f) + "'", float2 == (-6.000001f));
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0000123108260284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000123108260286d + "'", double1 == 1.0000123108260286d);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 97.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 99.99999f, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999960327225621E103d + "'", double2 == 9.999960327225621E103d);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        double double1 = org.apache.commons.math3.util.FastMath.signum(230.25850929940458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        float float1 = org.apache.commons.math3.util.FastMath.abs(374.99997f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 374.99997f + "'", float1 == 374.99997f);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        double double2 = org.apache.commons.math3.util.FastMath.log(69.53701189487664d, 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08640384017873165d) + "'", double2 == (-0.08640384017873165d));
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2456194955503825d + "'", double1 == 1.2456194955503825d);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        int int2 = org.apache.commons.math3.util.FastMath.max(1024, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-3.137566414384587E306d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.17453294184418977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7581225909916248d) + "'", double1 == (-0.7581225909916248d));
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.99999994f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        double double1 = org.apache.commons.math3.util.FastMath.atan(7.56939756606048E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267816856d + "'", double1 == 1.5707963267816856d);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.768373E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.684342E-14f + "'", float1 == 5.684342E-14f);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6000.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4731873725534812d) + "'", double1 == (-0.4731873725534812d));
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.1628723067131066d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.2233715E18f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233715E18f + "'", float2 == 9.2233715E18f);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000004f + "'", float1 == 52.000004f);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 35L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 97, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.778151250383643d, 0.9466715061814477d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7781512503836425d + "'", double2 == 3.7781512503836425d);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-9.632848614896423E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005519215703220059d) + "'", double1 == (-0.005519215703220059d));
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1023.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.4012984643248174E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0517578129736954E-5d + "'", double1 == 3.0517578129736954E-5d);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.6871714861810375d, 0.9977630759545902d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005969084226160847d + "'", double2 == 0.005969084226160847d);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.7581225909916248d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5314547471274426d) + "'", double1 == (-0.5314547471274426d));
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        long long1 = org.apache.commons.math3.util.FastMath.round(9.094947017729286E-13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(7.31321994264556d, 0.19611987703015263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.31321994264556d + "'", double2 == 7.31321994264556d);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-1), 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.441162712889187d, 1500);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.684342E-14f + "'", float1 == 5.684342E-14f);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.463965950463316E102d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.2676506E30f, 1.0003709130606282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.300664126286459E30d + "'", double2 == 1.300664126286459E30d);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2064384.0f, 6000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2064384.0f + "'", float2 == 2064384.0f);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(9.999999999999998d, (-0.017453291479645996d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999996d + "'", double2 == 9.999999999999996d);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        int int2 = org.apache.commons.math3.util.FastMath.max(3, 6000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6000 + "'", int2 == 6000);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        int int1 = org.apache.commons.math3.util.FastMath.round(6.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.8582226493088282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-49.17253568793199d) + "'", double1 == (-49.17253568793199d));
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-1L), 3.010299956639812d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.9719903465379038d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8260092206769861d) + "'", double1 == (-0.8260092206769861d));
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 1023);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.6026819659087781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6398352529683655d + "'", double1 == 0.6398352529683655d);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.0019531248835846782d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0000002f, 1.1368887786267312d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000004f + "'", float2 == 1.0000004f);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0202140366142471d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.8640954259078427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.7371252E25f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86 + "'", int1 == 86);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7476805260785286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7262340257027773d + "'", double1 == 0.7262340257027773d);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0d + "'", double1 == 750.0d);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-4.999750016661555E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.999875008328899E-5d) + "'", double1 == (-4.999875008328899E-5d));
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        long long2 = org.apache.commons.math3.util.FastMath.max(9223372036854775807L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        double double2 = org.apache.commons.math3.util.FastMath.max(69.53701189487664d, 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 69.53701189487664d + "'", double2 == 69.53701189487664d);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 4.8828122E-4f, 1.151292546497023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.882812208961696E-4d + "'", double2 == 4.882812208961696E-4d);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        long long1 = org.apache.commons.math3.util.FastMath.abs(127L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 4.768372E-7f, 0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.76837215046544E-7d + "'", double2 == 4.76837215046544E-7d);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.130647803622625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1306478036226255d + "'", double1 == 2.1306478036226255d);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-7.224719895935548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6754111826338143d) + "'", double1 == (-2.6754111826338143d));
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        long long1 = org.apache.commons.math3.util.FastMath.abs(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-14.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.999999999999998d) + "'", double1 == (-13.999999999999998d));
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.6812492467611788E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9466715061814477d, 1.5604874144594285d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9466715061814477d + "'", double2 == 0.9466715061814477d);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2147483647L, 6.0000005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 5L, 32.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000004f + "'", float2 == 32.000004f);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 63);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 38, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.9539726886959428d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.5872036550391518d), (double) 1500);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(6.103515625000001E-5d, 1.4489023749402996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4489023762258555d + "'", double2 == 1.4489023762258555d);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9999999999999998d) + "'", double1 == (-1.9999999999999998d));
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 14L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.70805020110221d + "'", double1 == 2.70805020110221d);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 89.92360567258659d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.61512051684126d, 6.027800920562904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1746142944486795d + "'", double2 == 1.1746142944486795d);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 137);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(10.0f, 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        double double1 = org.apache.commons.math3.util.FastMath.sin(32.01562118716424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5643904318910452d + "'", double1 == 0.5643904318910452d);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1024.0f, 1.5707647845032549d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.99994f + "'", float2 == 1023.99994f);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(108222.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.5707963267948966d), 1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.734723475976807E-18d + "'", double2 == 1.734723475976807E-18d);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.768373E-7f, 2064384.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2064384.0f + "'", float2 == 2064384.0f);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(8.187928385330529E-5d, (-0.0267863625707878d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.187928385330527E-5d + "'", double2 == 8.187928385330527E-5d);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 1.0000002f, (double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.39599474488673E7d) + "'", double2 == (-6.39599474488673E7d));
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(7.62939453139803E-6d, (double) 4.611686E18f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.62939453139803E-6d + "'", double2 == 7.62939453139803E-6d);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(97.0d, 1.1920928955078157E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796325565935d + "'", double2 == 1.570796325565935d);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        double double1 = org.apache.commons.math3.util.FastMath.log10(8.699681400989514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9395033482133572d + "'", double1 == 0.9395033482133572d);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5668734864610468d + "'", double1 == 0.5668734864610468d);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-1.2207033E-4f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        int int2 = org.apache.commons.math3.util.FastMath.max(6, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308232d + "'", double1 == 572.9577951308232d);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-1023), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1023.0f) + "'", float2 == (-1023.0f));
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1.5845633E30f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.623641707626563d, 0.6420149920119997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6420149920119997d + "'", double2 == 0.6420149920119997d);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.6321205588285577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6842868307608122d + "'", double1 == 0.6842868307608122d);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9466715061814477d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027041164336506635d + "'", double2 == 0.027041164336506635d);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5694629941431792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4507335189035081d + "'", double1 == 0.4507335189035081d);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0279410268437934d, 0.7502685605935906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2776724662502028d + "'", double2 == 0.2776724662502028d);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 230);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 230L + "'", long1 == 230L);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(10.082648376090521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.768373E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683733E-7f + "'", float1 == 4.7683733E-7f);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.0000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000002f + "'", float1 == 1.0000002f);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.1425465430742778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0101769735763335d + "'", double1 == 1.0101769735763335d);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078964d) + "'", double1 == (-0.8414709848078964d));
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(15.174119582065703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3890776.558273805d + "'", double1 == 3890776.558273805d);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.21991180375937056d), 0.17453294184418977d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.21991180375937053d) + "'", double2 == (-0.21991180375937053d));
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 9, (-2.349101754933678d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.0d) + "'", double2 == (-9.0d));
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5771174481917147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        float float2 = org.apache.commons.math3.util.FastMath.min(97.0f, 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.09738634525693146d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        long long1 = org.apache.commons.math3.util.FastMath.round(8.918828546453101d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-2.2124675420131484E28d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 42971.83113775489d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42971.83113775489d + "'", double2 == 42971.83113775489d);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.4505495340698077d), 2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.6973483401028054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7665477425729947d + "'", double1 == 0.7665477425729947d);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.971286084435162d), 0.9866275920404852d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015341507605323268d + "'", double2 == 0.015341507605323268d);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.11004516131854963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11026848715132712d) + "'", double1 == (-0.11026848715132712d));
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 32, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.009967783941837574d), 1.4012984643248174E-45d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.441162712889187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.022832605602534084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022834589947065314d + "'", double1 == 0.022834589947065314d);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.2664005294302816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2664005294302818d + "'", double1 == 1.2664005294302818d);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0101769735763335d, (-2.6754111826338143d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0101769735763335d) + "'", double2 == (-1.0101769735763335d));
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.2676506E30f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2676506E30f + "'", float2 == 1.2676506E30f);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(47.65470400249466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.599187944144099d, 5.795192390859045E46d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5991879441440995d + "'", double2 == 3.5991879441440995d);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.7665477425729947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        double double2 = org.apache.commons.math3.util.FastMath.pow(74.3898917758609d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0831675322560934E97d + "'", double2 == 2.0831675322560934E97d);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) '#', (-0.99999994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-49.17253568793199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1024.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        double double2 = org.apache.commons.math3.util.FastMath.min(343.7746497577372d, (-3.9133899457889196d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.9133899457889196d) + "'", double2 == (-3.9133899457889196d));
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4436354751788103d + "'", double1 == 1.4436354751788103d);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.9132181397411985d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.960170286650366d + "'", double1 == 0.960170286650366d);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 10L, 0.30196465536956996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30196465536956996d + "'", double2 == 0.30196465536956996d);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.610125138662287d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.112095380568981d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        double double1 = org.apache.commons.math3.util.FastMath.abs(47.65470400249466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.65470400249466d + "'", double1 == 47.65470400249466d);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.7371252E25f, 15.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.737125E25f + "'", float2 == 7.737125E25f);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(50.39699624996822d, 1.5640537039872793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.42126034728076d + "'", double2 == 50.42126034728076d);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        long long2 = org.apache.commons.math3.util.FastMath.min(127L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-127), (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }
}

