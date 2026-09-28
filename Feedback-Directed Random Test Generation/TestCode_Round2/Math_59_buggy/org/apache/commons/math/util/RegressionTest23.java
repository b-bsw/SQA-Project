package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7950499969146666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8814965284854296d + "'", double1 == 0.8814965284854296d);
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.3313563464012605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3259776994478216d + "'", double1 == 1.3259776994478216d);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.012209562553744127d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(97.00000000000007d, 0.013659550437909718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00000000000006d + "'", double2 == 97.00000000000006d);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        long long1 = org.apache.commons.math.util.FastMath.round(0.003029269128215333d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        double double1 = org.apache.commons.math.util.FastMath.log(0.38863652572621304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9451107533364372d) + "'", double1 == (-0.9451107533364372d));
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4654361418867731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3821529059354064d + "'", double1 == 0.3821529059354064d);
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.8962960182679E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7134244790186055d) + "'", double1 == (-0.7134244790186055d));
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.15289141269055143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9883348580330177d + "'", double1 == 0.9883348580330177d);
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9608236039126866d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2281786100136092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.36945084202367d + "'", double1 == 70.36945084202367d);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9185957173539762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0533450212094793d + "'", double1 == 1.0533450212094793d);
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(68.78828177486825d, 1.5430806348132406d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 68.78828177486824d + "'", double2 == 68.78828177486824d);
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.2806068627910445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0027783491013417426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.8858983761156365d) + "'", double1 == (-5.8858983761156365d));
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9984979022832193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.989417798345493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14560850479387782d + "'", double1 == 0.14560850479387782d);
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.45639522978117497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8100237733214718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.142563876395169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5056327657028756d + "'", double1 == 1.5056327657028756d);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        double double1 = org.apache.commons.math.util.FastMath.atan((-23.607181098414166d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5284616441409065d) + "'", double1 == (-1.5284616441409065d));
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        double double1 = org.apache.commons.math.util.FastMath.tan(96.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904827536d) + "'", double1 == (-0.41032129904827536d));
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7534784835329845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12292914496356966d) + "'", double1 == (-0.12292914496356966d));
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.07898096151940606d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0788171427246101d) + "'", double1 == (-0.0788171427246101d));
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4991939135618992d, 6.585445079827193E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.499193913561899d + "'", double2 == 1.499193913561899d);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8414709848078964d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4112593504149052d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6733112569964226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0424724406933767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018194576451400744d + "'", double1 == 0.018194576451400744d);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5161207849481165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7184154681993675d + "'", double1 == 0.7184154681993675d);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4150429164256951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4270618957987685d + "'", double1 == 0.4270618957987685d);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5854136570121198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01021739580100228d + "'", double1 == 0.01021739580100228d);
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.202774714925223d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        double double2 = org.apache.commons.math.util.FastMath.max(2.2303098228266975d, (double) 17L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.0d + "'", double2 == 17.0d);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4.644483341943245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.703675447601967d) + "'", double1 == (-14.703675447601967d));
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7369048799450005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.07351901771299219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41892206142578736d + "'", double1 == 0.41892206142578736d);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5707963309172037d, 0.021278590635779138d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021278590635779138d + "'", double2 == 0.021278590635779138d);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.01518445968368543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015185626861059363d + "'", double1 == 0.015185626861059363d);
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.048491623229691465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9526653195309732d + "'", double1 == 0.9526653195309732d);
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.8427842873511954E202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.38405980272115d + "'", double1 == 2.38405980272115d);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        double double1 = org.apache.commons.math.util.FastMath.asin((-5.123425674293008E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.123425898438558E-4d) + "'", double1 == (-5.123425898438558E-4d));
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.017454178629595234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2593979097038231d + "'", double1 == 0.2593979097038231d);
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.19374578338773524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0033815018319717136d) + "'", double1 == (-0.0033815018319717136d));
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        double double2 = org.apache.commons.math.util.FastMath.pow(83.42421822005818d, 0.17801955779564485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.197999443548337d + "'", double2 == 2.197999443548337d);
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 37L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 802L, (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.47859127706984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5596856707919322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.9999829445067d + "'", double1 == 89.9999829445067d);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.0089148066056253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3646144421401343d + "'", double1 == 0.3646144421401343d);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7558926889211433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6978546661716846d) + "'", double1 == (-0.6978546661716846d));
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.298292365610484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8402785435782612d + "'", double1 == 1.8402785435782612d);
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2085905988795835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2085905988795838d + "'", double1 == 1.2085905988795838d);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.1889187462913355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9966081767263744d + "'", double1 == 0.9966081767263744d);
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2083.76558392283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2084.0d + "'", double1 == 2084.0d);
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 34L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.095563752817182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4575452611538434d + "'", double1 == 0.4575452611538434d);
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5788404741295278d, 68.78828177486824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5788404741295279d + "'", double2 == 0.5788404741295279d);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9380411276052492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3538628998456904d + "'", double1 == 0.3538628998456904d);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        double double2 = org.apache.commons.math.util.FastMath.max(9.873069731935379E-5d, 0.01530032932138615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01530032932138615d + "'", double2 == 0.01530032932138615d);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7734137622334678d, 2.1620169140071894d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.34354270242763657d + "'", double2 == 0.34354270242763657d);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3311317153490116d, (-0.7831804032231446d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3311317153490116d + "'", double2 == 1.3311317153490116d);
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 6013.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.701845363548474d + "'", double1 == 8.701845363548474d);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0014503265856423578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001450326585642358d + "'", double1 == 0.001450326585642358d);
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.7564440907858547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7564440907858547d + "'", double2 == 0.7564440907858547d);
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        long long2 = org.apache.commons.math.util.FastMath.max((-90L), 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562597358306d + "'", double1 == 21.487562597358306d);
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0593061654437441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0593061654437441d + "'", double1 == 1.0593061654437441d);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.12585691605953506d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.39880384582236217d), 0.9607190280136697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.39880384582236217d) + "'", double2 == (-0.39880384582236217d));
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.590466459908002E-72d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9219747220141766E-70d + "'", double1 == 4.9219747220141766E-70d);
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.09007362435487686d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.29161581008880105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28374723914547584d + "'", double1 == 0.28374723914547584d);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6177159347513663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48101523755619796d + "'", double1 == 0.48101523755619796d);
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        long long1 = org.apache.commons.math.util.FastMath.round(0.2916723657064345d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        double double2 = org.apache.commons.math.util.FastMath.max(0.07352180207555892d, 8.984871312738818d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.984871312738818d + "'", double2 == 8.984871312738818d);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5486620049392715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5018153790904591d + "'", double1 == 0.5018153790904591d);
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8325008986719311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9836065573770494d + "'", double1 == 0.9836065573770494d);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.942359898401499d, 1.5517788711824279d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2665679891237833d + "'", double2 == 1.2665679891237833d);
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6502731920226421d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9982900983985065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994297076279386d + "'", double1 == 0.9994297076279386d);
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.21517385352860152d), 0.9233367034353793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.21517385352860152d) + "'", double2 == (-0.21517385352860152d));
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4654361418867731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5022376695662525d + "'", double1 == 0.5022376695662525d);
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.1008763214519655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9705029153445035d) + "'", double1 == (-0.9705029153445035d));
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.007857650033781347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007857730892738682d + "'", double1 == 0.007857730892738682d);
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7415548299632772d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012942573366925888d) + "'", double1 == (-0.012942573366925888d));
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.022636240226945933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022894384034724012d + "'", double1 == 0.022894384034724012d);
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        double double1 = org.apache.commons.math.util.FastMath.atanh(73.68391074271467d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2291346864364843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.662169352997253d + "'", double1 == 0.662169352997253d);
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.569589266007452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.162149518672594d + "'", double1 == 1.162149518672594d);
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.44248081051227434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4424808105122744d + "'", double1 == 0.4424808105122744d);
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.000000004123056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818396666732d + "'", double1 == 1.7182818396666732d);
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8280552495725928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5432690102198382d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5432690102198382d + "'", double1 == 0.5432690102198382d);
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        double double2 = org.apache.commons.math.util.FastMath.max((-9.551474405271228E-4d), 5.586825283057189d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.586825283057189d + "'", double2 == 5.586825283057189d);
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2039980656902276d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2039980656902274d + "'", double2 == 1.2039980656902274d);
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        double double1 = org.apache.commons.math.util.FastMath.ceil(44.9999998819046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.0d + "'", double1 == 45.0d);
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.7025722210756764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9987845065987333d + "'", double1 == 0.9987845065987333d);
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5079431519740254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.517429565901664d + "'", double1 == 4.517429565901664d);
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9647007265430613d, (-0.5873521856970938d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5873521856970938d) + "'", double2 == (-0.5873521856970938d));
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, (long) 6013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6013L + "'", long2 == 6013L);
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9145014161184981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7922584566255138d + "'", double1 == 0.7922584566255138d);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5695861191798108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9169599029679749d + "'", double1 == 0.9169599029679749d);
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.30888908362985534d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9526718767949643d + "'", double1 == 0.9526718767949643d);
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.017447763349069056d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        int int2 = org.apache.commons.math.util.FastMath.min((-90), 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4241182307716767d, 0.69482111198402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4241182307716764d + "'", double2 == 1.4241182307716764d);
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5672637267613392d, 0.7491363778558697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5672637267613392d + "'", double2 == 1.5672637267613392d);
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.855146420814099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5680032523292624d + "'", double1 == 1.5680032523292624d);
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.8414621219996845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9635930942557552d + "'", double1 == 0.9635930942557552d);
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.4960257599228209d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47765433426214554d) + "'", double1 == (-0.47765433426214554d));
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        double double1 = org.apache.commons.math.util.FastMath.expm1(172.4066401663162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.503302708588075E74d + "'", double1 == 7.503302708588075E74d);
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152435d + "'", double1 == 1.5430806348152435d);
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        float float2 = org.apache.commons.math.util.FastMath.max(108.0f, 17.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17.0f + "'", float2 == 17.0f);
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(23.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.000000000000004d + "'", double1 == 23.000000000000004d);
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0320977775721407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8583770774785965d + "'", double1 == 0.8583770774785965d);
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.6489408307901663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 94.47735027107215d + "'", double1 == 94.47735027107215d);
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3973434260602215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.017606491205851706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01760558158488829d + "'", double1 == 0.01760558158488829d);
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1310143745245964d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02586747778105082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0258703634187639d + "'", double1 == 0.0258703634187639d);
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9185957173539763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40628400561935313d + "'", double1 == 0.40628400561935313d);
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-90));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6807178123186235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.167032885078557d) + "'", double1 == (-0.167032885078557d));
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7307284381561119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7514079390441956d + "'", double1 == 0.7514079390441956d);
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9735760889955918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9735760889955918d + "'", double1 == 0.9735760889955918d);
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-90), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 36, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.7620587253843047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.8846211948025005d + "'", double1 == 7.8846211948025005d);
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        long long1 = org.apache.commons.math.util.FastMath.round(46.2263037084224d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 46L + "'", long1 == 46L);
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.305845133982261E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.49714987269413385d, 1.242924991852436d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3804924193810362d + "'", double2 == 0.3804924193810362d);
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7771338887377971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771338887377971d + "'", double1 == 0.7771338887377971d);
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.021278590635779134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021055362526791663d + "'", double1 == 0.021055362526791663d);
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.463380064402346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4996656139755338d + "'", double1 == 0.4996656139755338d);
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 6013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-0.009213529184899942d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4416883280587693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7875196816685027d, 1.1628200628694079d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7875196816685027d + "'", double2 == 0.7875196816685027d);
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.537204015658685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2152246803346891d + "'", double1 == 1.2152246803346891d);
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.009401702312512087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009401702312512087d + "'", double1 == 0.009401702312512087d);
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(153298.37563315977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 153298.3756331598d + "'", double1 == 153298.3756331598d);
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5404195002705843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49545799766920356d + "'", double1 == 0.49545799766920356d);
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6185257010730183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0616615272241692d + "'", double1 == 1.0616615272241692d);
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (-1), 9.383464577367716d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1844562330844421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.268908813636015d + "'", double1 == 2.268908813636015d);
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        double double2 = org.apache.commons.math.util.FastMath.min(0.12931063444698587d, 0.013657851706229811d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013657851706229811d + "'", double2 == 0.013657851706229811d);
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5707448354574094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.10456170333587957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.990944299844879d + "'", double1 == 5.990944299844879d);
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.05360906381648784d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.053609063816487834d) + "'", double1 == (-0.053609063816487834d));
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0084759594740231d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0084759594740231d + "'", double2 == 1.0084759594740231d);
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        double double1 = org.apache.commons.math.util.FastMath.cos((-4.083880243381031d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5879391217765398d) + "'", double1 == (-0.5879391217765398d));
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.934714363860833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 513.663371073101d + "'", double1 == 513.663371073101d);
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.09256090192802896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09269312812966453d) + "'", double1 == (-0.09269312812966453d));
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        double double1 = org.apache.commons.math.util.FastMath.cos((-2.4402148842036297E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999702267568d + "'", double1 == 0.9999999702267568d);
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3678794411714424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999998d) + "'", double1 == (-0.9999999999999998d));
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5705448125620591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45142257353539367d + "'", double1 == 0.45142257353539367d);
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.010625904569068452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21984772223262658d) + "'", double1 == (-0.21984772223262658d));
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8189894035442021E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0422041580210173E-10d + "'", double1 == 1.0422041580210173E-10d);
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.37960773902752176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4617111047443176d + "'", double1 == 1.4617111047443176d);
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8911152217347937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4273158777269557d) + "'", double1 == (-1.4273158777269557d));
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7853533483917854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.010131850050463726d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010131850050463726d + "'", double2 == 0.010131850050463726d);
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        long long2 = org.apache.commons.math.util.FastMath.max(17L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.00936323361755153d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009363507257291518d) + "'", double1 == (-0.009363507257291518d));
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.932254498110376E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963074723517d + "'", double1 == 1.5707963074723517d);
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8700054540617282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8700054540617284d + "'", double1 == 0.8700054540617284d);
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999282021879747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5571618073961846d + "'", double1 == 1.5571618073961846d);
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        double double1 = org.apache.commons.math.util.FastMath.atanh(50.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.815758426184901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.2334031175112168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8435636080687685d) + "'", double1 == (-0.8435636080687685d));
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3940358404305488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3322030225031952d + "'", double1 == 0.3322030225031952d);
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.84147096835031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6663667576640543d + "'", double1 == 0.6663667576640543d);
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5410013896544883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1499455503852931d + "'", double1 == 1.1499455503852931d);
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        double double2 = org.apache.commons.math.util.FastMath.max((-34.882786993956714d), 0.9226350743220142d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9226350743220142d + "'", double2 == 0.9226350743220142d);
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.096131571179496E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5700867135782244d + "'", double1 == 1.5700867135782244d);
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4453238447142773d, 0.09463914472538534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4453238447142773d + "'", double2 == 1.4453238447142773d);
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9988747933673575d, 0.9651363175498938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9988747933673574d + "'", double2 == 0.9988747933673574d);
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.08964012059520682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08976021714468738d + "'", double1 == 0.08976021714468738d);
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9278183521288984d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7295751186144906d) + "'", double1 == (-0.7295751186144906d));
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9869537583815866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7788323064487026d + "'", double1 == 0.7788323064487026d);
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9645397928556647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        double double1 = org.apache.commons.math.util.FastMath.asinh(72.13036685698037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9716703607957085d + "'", double1 == 4.9716703607957085d);
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9578816255865316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.02627284444545242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026278892002119223d + "'", double1 == 0.026278892002119223d);
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.838249024841735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4575452611538434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6764209201036315d + "'", double1 == 0.6764209201036315d);
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        int int2 = org.apache.commons.math.util.FastMath.min(34, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9950547536867305d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6220107246567897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1653657392500323E-156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0339469139850778E-158d + "'", double1 == 2.0339469139850778E-158d);
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.01673555107976653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        long long1 = org.apache.commons.math.util.FastMath.round(0.01745329251994342d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6535124586897125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(802.0d, 0.9125795808248863d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 801.9999999999999d + "'", double2 == 801.9999999999999d);
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2990612758127336d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-33.40828846862413d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4110955828127631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.880081242881385d + "'", double1 == 0.880081242881385d);
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.013751546232231121d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01375154623223112d + "'", double2 == 0.01375154623223112d);
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6L, (float) (-34L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.0f) + "'", float2 == (-34.0f));
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.5456293329809854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6782270771780905d) + "'", double1 == (-0.6782270771780905d));
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.501051375145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        int int2 = org.apache.commons.math.util.FastMath.max(9, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.2793491738997593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.695994948662414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6959949486624142d + "'", double1 == 1.6959949486624142d);
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-34));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9179704868072519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.841927185055936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2952006000149083d) + "'", double1 == (-0.2952006000149083d));
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.0100191552952706d, (-89.3634064240365d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.01001915529527d + "'", double2 == 2.01001915529527d);
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.021820077951851258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2501983752875385d + "'", double1 == 1.2501983752875385d);
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.020731076784300594d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        double double1 = org.apache.commons.math.util.FastMath.log10((-4.5688409855135115d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.2317761278577954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.711868061804981d + "'", double1 == 4.711868061804981d);
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.11710370870180292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11657277845242872d) + "'", double1 == (-0.11657277845242872d));
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.23470120688042762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26453087915412205d + "'", double1 == 0.26453087915412205d);
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5034300733007516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.709528063786593d + "'", double1 == 0.709528063786593d);
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 802.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 802.0d + "'", double1 == 802.0d);
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.09687988476337266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.09927770074216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.267909768656306d + "'", double1 == 2.267909768656306d);
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.002094025184076574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0020940221233559852d) + "'", double1 == (-0.0020940221233559852d));
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.3886016769558134d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0948410127421968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9887074792121637d + "'", double1 == 1.9887074792121637d);
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.09506557725167404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09973097009612605d + "'", double1 == 0.09973097009612605d);
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1471972199216043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14667078256560037d + "'", double1 == 0.14667078256560037d);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.016670433674032956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998610515384583d + "'", double1 == 0.9998610515384583d);
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.079985949503008E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009528896027086772d + "'", double1 == 0.009528896027086772d);
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1610795826858162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.19337893245079d + "'", double1 == 3.19337893245079d);
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        double double1 = org.apache.commons.math.util.FastMath.ulp(53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.006432259873866778d, 0.7327731746566131d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008777743094630818d + "'", double2 == 0.008777743094630818d);
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        double double1 = org.apache.commons.math.util.FastMath.atanh(32.826740701209424d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9933731825245955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.016630608822953d) + "'", double1 == (-5.016630608822953d));
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        double double1 = org.apache.commons.math.util.FastMath.atanh(12.73187726534497d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.4099056480256106d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.16483384729345077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16409640061781955d + "'", double1 == 0.16409640061781955d);
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
        double double1 = org.apache.commons.math.util.FastMath.cos((-5.1749143444037795d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44620954766611454d + "'", double1 == 0.44620954766611454d);
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6013, 71L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6013L + "'", long2 == 6013L);
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(257.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.357861179734201d + "'", double1 == 6.357861179734201d);
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.832500898671931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7396168575501335d + "'", double1 == 0.7396168575501335d);
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.488717734948612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.080376232694411d + "'", double1 == 3.080376232694411d);
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.711773033643908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0376007925466757d + "'", double1 == 1.0376007925466757d);
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1018538754645497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.19337893245079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4335068367384134d + "'", double1 == 1.4335068367384134d);
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.101088875655695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.800889806549669d + "'", double1 == 0.800889806549669d);
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.011871072036275292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.809267629578519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 275.5507377237349d + "'", double1 == 275.5507377237349d);
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        double double1 = org.apache.commons.math.util.FastMath.signum((-89.3634064240365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8625222728658756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5305630902165211d + "'", double1 == 0.5305630902165211d);
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8089563172728975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6801783019998602d + "'", double1 == 0.6801783019998602d);
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7429945002163879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2970666364231494d) + "'", double1 == (-0.2970666364231494d));
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4407143401175706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44071434011757066d + "'", double1 == 0.44071434011757066d);
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.380291914558474E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.40934278535333d + "'", double1 == 89.40934278535333d);
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8456138577445713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4292937520162936d + "'", double1 == 0.4292937520162936d);
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        double double1 = org.apache.commons.math.util.FastMath.sin((-466.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8645665970913422d) + "'", double1 == (-0.8645665970913422d));
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.0012649829165658245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0012649825791987493d) + "'", double1 == (-0.0012649825791987493d));
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.3133467281133133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7367464541147153d + "'", double1 == 0.7367464541147153d);
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        double double1 = org.apache.commons.math.util.FastMath.log((-7.23128532145735E11d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4960257599228209d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39105404552993434d) + "'", double1 == (-0.39105404552993434d));
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.3423042232497897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9816963579924517d + "'", double1 == 0.9816963579924517d);
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9731097152599588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.562731642290163d + "'", double1 == 0.562731642290163d);
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.876754074008976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16362601462406903d + "'", double1 == 0.16362601462406903d);
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.485943101132887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 39481480091340L, 11014.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11014.0f + "'", float2 == 11014.0f);
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.08876808407117655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0039424741719003d + "'", double1 == 1.0039424741719003d);
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4519959879128448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8960868442071974d + "'", double1 == 0.8960868442071974d);
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.10955796484928035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.534938999763997d), 0.5904534978892476d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2035700853597895d) + "'", double2 == (-1.2035700853597895d));
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5639111943713004d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6416439271862104d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-33), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5707042962783768d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        double double1 = org.apache.commons.math.util.FastMath.tan((-8.306852824943364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0550711617230255d + "'", double1 == 2.0550711617230255d);
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        double double2 = org.apache.commons.math.util.FastMath.max(1.192465179596234d, 6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021347E41d + "'", double2 == 6.691673596021347E41d);
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        double double1 = org.apache.commons.math.util.FastMath.floor(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.0d + "'", double1 == 2979.0d);
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5788404741295279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5470536685178345d + "'", double1 == 0.5470536685178345d);
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.3818004626805416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2885768600359788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.354638711533299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0061896131712864556d + "'", double1 == 0.0061896131712864556d);
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.527472836267328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40990564802561047d) + "'", double1 == (-0.40990564802561047d));
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 36L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5563025007672873d + "'", double1 == 1.5563025007672873d);
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.43450228702824d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.3590146193143267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        long long1 = org.apache.commons.math.util.FastMath.round(0.017168240873498188d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(46.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5909973827212776d + "'", double1 == 3.5909973827212776d);
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.03700049997605E9d + "'", double1 == 3.03700049997605E9d);
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.582203397533547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5822033975335471d + "'", double1 == 0.5822033975335471d);
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        long long1 = org.apache.commons.math.util.FastMath.round((-30.24580420121606d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-30L) + "'", long1 == (-30L));
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        float float2 = org.apache.commons.math.util.FastMath.max(33.0f, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        double double1 = org.apache.commons.math.util.FastMath.log(0.68491668142343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3784580810762963d) + "'", double1 == (-0.3784580810762963d));
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7927663921466835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6599733370687696d + "'", double1 == 0.6599733370687696d);
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.256972793019976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.158783182388476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5000511820594848d) + "'", double1 == (-1.5000511820594848d));
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.05167897363437805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.7159162242099002d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5707958182283288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1062.1024200991178d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        long long2 = org.apache.commons.math.util.FastMath.min(90L, (long) 5507);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0475388422900291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5440211108893683d, 0.015105430502911008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5440211108893682d + "'", double2 == 0.5440211108893682d);
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.062883717585775d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0628837175857748d) + "'", double1 == (-1.0628837175857748d));
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5669767943827976d + "'", double1 == 0.5669767943827976d);
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5496267729847464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1548857127733951d + "'", double1 == 1.1548857127733951d);
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4855755420534185d, 0.005215981409945167d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5600548862721078d + "'", double2 == 1.5600548862721078d);
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1697242825201424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0536454640779438d + "'", double1 == 1.0536454640779438d);
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4753299107316371d + "'", double1 == 0.4753299107316371d);
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1748086632901192E-91d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        double double2 = org.apache.commons.math.util.FastMath.max(0.899352280489793d, (-0.5540437953657898d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.899352280489793d + "'", double2 == 0.899352280489793d);
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        long long1 = org.apache.commons.math.util.FastMath.round(51.99471985749452d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5672637267613392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5672637267613394d + "'", double1 == 1.5672637267613394d);
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.19724455153345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02089585937582163d) + "'", double1 == (-0.02089585937582163d));
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.07695912379014387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.2474367440965453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2451441188040047d + "'", double1 == 1.2451441188040047d);
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        long long1 = org.apache.commons.math.util.FastMath.round(0.44830029897233037d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 29L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 29.0f + "'", float1 == 29.0f);
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.6207831908859206d), 1.584756519423936E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6207831908859206d) + "'", double2 == (-0.6207831908859206d));
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4060921415682228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
        double double1 = org.apache.commons.math.util.FastMath.atanh(802.1409131831525d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4833023923748323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-0.24282050753856244d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.24282050753856244d) + "'", double2 == (-0.24282050753856244d));
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6258415492713906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.247006371437946d + "'", double1 == 2.247006371437946d);
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6858739404357614E-7d, 157.88718339239696d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9716189987139436d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8257998510753926d) + "'", double1 == (-0.8257998510753926d));
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.36301029014320507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44008106397471025d) + "'", double1 == (-0.44008106397471025d));
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7073875782300506d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9699398265477828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-4.0052823489951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5880995117952945d) + "'", double1 == (-1.5880995117952945d));
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2657156711620368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23563771015862317d + "'", double1 == 0.23563771015862317d);
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.009446037147747973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0247503508374223d) + "'", double1 == (-2.0247503508374223d));
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2602577590774198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23131627073801989d + "'", double1 == 0.23131627073801989d);
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5516730959931526d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8516488233446612d + "'", double1 == 0.8516488233446612d);
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.5000511820594848d), 0.019016309312897422d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5805651145852763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6559764355896974d) + "'", double1 == (-0.6559764355896974d));
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.468196043089957E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.09216692107539105d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9955742875642762d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.006768150309340383d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006768253657005019d) + "'", double1 == (-0.006768253657005019d));
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8298698279324331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9109719139097721d + "'", double1 == 0.9109719139097721d);
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2431671594873386d + "'", double1 == 1.2431671594873386d);
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 71);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 71.0f + "'", float2 == 71.0f);
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2085905988795835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.348761576658479d + "'", double1 == 2.348761576658479d);
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6046661120266558d, 1003.8247302299309d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6046661120266558d + "'", double2 == 0.6046661120266558d);
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8663783583972496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.176652023291366d + "'", double1 == 1.176652023291366d);
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.374414814620351d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3870653233249402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.472652686701176d + "'", double1 == 1.472652686701176d);
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.41892206142578736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9135279504660664d + "'", double1 == 0.9135279504660664d);
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 34, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2979L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2979.0f + "'", float1 == 2979.0f);
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.01745240643728351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.19735170462481363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19484782997154398d) + "'", double1 == (-0.19484782997154398d));
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9960788823760445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7076439954018021d + "'", double1 == 1.7076439954018021d);
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0039823074904044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0039823074904046d + "'", double1 == 1.0039823074904046d);
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(32.33722455228312d, (-28.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.33722455228311d + "'", double2 == 32.33722455228311d);
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.013344586776258159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6361176917519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1854652182422678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17013528677808595d + "'", double1 == 0.17013528677808595d);
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3693701490342281d, 0.019238645539126947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3693701490342281d + "'", double2 == 0.3693701490342281d);
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        double double1 = org.apache.commons.math.util.FastMath.log10(39.65143712910102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.59825893253452d + "'", double1 == 1.59825893253452d);
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        double double1 = org.apache.commons.math.util.FastMath.signum((-3980.715929598703d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3050608935997049E-54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3050608935997049E-54d + "'", double1 == 1.3050608935997049E-54d);
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-3.055627941708065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.640804259441584d + "'", double1 == 10.640804259441584d);
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
        double double2 = org.apache.commons.math.util.FastMath.min(7.0d, (-0.7098734309871929d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7098734309871929d) + "'", double2 == (-0.7098734309871929d));
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.5669483416477585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.6901960800285136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6901960800285138d + "'", double1 == 1.6901960800285138d);
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.301744614394251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1152913097540962d) + "'", double1 == (-1.1152913097540962d));
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0865078793721343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9008738248423098d + "'", double1 == 1.9008738248423098d);
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        double double2 = org.apache.commons.math.util.FastMath.min(0.37695480406821247d, 0.6807178123186235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37695480406821247d + "'", double2 == 0.37695480406821247d);
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2665679891237833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0579012827456076d + "'", double1 == 1.0579012827456076d);
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02263430714392747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022636240226945936d + "'", double1 == 0.022636240226945936d);
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9756299818288702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9918097637737807d) + "'", double1 == (-0.9918097637737807d));
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.06558572392439851d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) 9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.10385869980070621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10385869980070621d + "'", double1 == 0.10385869980070621d);
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        double double2 = org.apache.commons.math.util.FastMath.max(0.32410684590028493d, 0.004063517469127154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32410684590028493d + "'", double2 == 0.32410684590028493d);
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.012283379416347176d, 0.9775188478584872d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.012283379416347178d + "'", double2 == 0.012283379416347178d);
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707042962783768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.99472703981701d + "'", double1 == 89.99472703981701d);
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        double double1 = org.apache.commons.math.util.FastMath.tan(10.747031677944916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.940264236964402d + "'", double1 == 3.940264236964402d);
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.82989504995974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.039708058408028d + "'", double1 == 23.039708058408028d);
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9988747933673575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8083866399530157d, 1.1624473515096263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6076440724911297d + "'", double2 == 0.6076440724911297d);
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9921731399155099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007857650721784517d) + "'", double1 == (-0.007857650721784517d));
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.44041795078162516d), 0.3345269173680483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4404179507816251d) + "'", double2 == (-0.4404179507816251d));
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.7159162242099002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.418520666024257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.938631593746798d + "'", double1 == 2.938631593746798d);
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2926117730048923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.642286970674797d + "'", double1 == 3.642286970674797d);
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        double double2 = org.apache.commons.math.util.FastMath.min(31.104051098596297d, 0.2343247169751904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2343247169751904d + "'", double2 == 0.2343247169751904d);
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.999999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7433261306201424d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4917890846793804d, 2.384185791015625E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4917890846793804d + "'", double2 == 1.4917890846793804d);
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        double double1 = org.apache.commons.math.util.FastMath.sin(32.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9572152776210291d + "'", double1 == 0.9572152776210291d);
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.17013528677808595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16851249397912132d + "'", double1 == 0.16851249397912132d);
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5408008620104859d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.158150094628595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0391542596450605d + "'", double1 == 2.0391542596450605d);
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (-90.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        int int2 = org.apache.commons.math.util.FastMath.min(37, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9945570439269725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.98392110202275d + "'", double1 == 56.98392110202275d);
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0039823074904044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017522796897477686d + "'", double1 == 0.017522796897477686d);
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.693027562108987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2499102951044259d + "'", double1 == 1.2499102951044259d);
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4566275681581605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4283517263101274d + "'", double1 == 0.4283517263101274d);
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.006768253657005019d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        double double1 = org.apache.commons.math.util.FastMath.atanh(178.09723865519027d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.32858228057636046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6900513023371356d + "'", double1 == 0.6900513023371356d);
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5402900236323281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5707817307143671d + "'", double1 == 0.5707817307143671d);
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.132522905681207d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.444076826648015d) + "'", double1 == (-11.444076826648015d));
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        long long2 = org.apache.commons.math.util.FastMath.min(2979L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1628200628694076d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.006768253657005019d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8867182812524047d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7750020135843377d) + "'", double1 == (-0.7750020135843377d));
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4925340484482445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45622535850181634d) + "'", double1 == (-0.45622535850181634d));
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.019682439712373E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.004888098971863d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8848257745809853d) + "'", double1 == (-0.8848257745809853d));
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.01204197997900222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012041397963350523d + "'", double1 == 0.012041397963350523d);
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5403025036161081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.903903800587639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.789872859506495d + "'", double1 == 51.789872859506495d);
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-32.999999999999886d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.99999999999988d) + "'", double1 == (-32.99999999999988d));
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-32.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5759586531581287d) + "'", double1 == (-0.5759586531581287d));
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.28046687732159026d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2733371310966756d) + "'", double1 == (-0.2733371310966756d));
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.934717325643677d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.06526029511396493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9431910296713536d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6154095886644868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8505922463804043d) + "'", double1 == (-0.8505922463804043d));
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5430891022283284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9957926485451821d + "'", double1 == 0.9957926485451821d);
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
        double double1 = org.apache.commons.math.util.FastMath.cos(212.75275683459444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.640579519524661d + "'", double1 == 0.640579519524661d);
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.0812030006757882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06035295366660003d + "'", double1 == 0.06035295366660003d);
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6616777349179331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17935347887456568d) + "'", double1 == (-0.17935347887456568d));
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.9607387187064872d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9652889733989565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7466267520921613d + "'", double1 == 0.7466267520921613d);
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.2089948465116955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20747672351902835d) + "'", double1 == (-0.20747672351902835d));
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9756299818288702d), (-56.72239180482502d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.080376232694411d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4.488422915776307d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.390055938922822d) + "'", double1 == (-4.390055938922822d));
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-33L), (float) (-34L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.0f) + "'", float2 == (-34.0f));
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7950781550795927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.795078155079593d + "'", double1 == 1.795078155079593d);
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
        long long1 = org.apache.commons.math.util.FastMath.round(0.34693731331800054d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        double double1 = org.apache.commons.math.util.FastMath.log(153298.37563315977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.940141468803505d + "'", double1 == 11.940141468803505d);
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.016627912719738187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01649118258835379d + "'", double1 == 0.01649118258835379d);
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        long long2 = org.apache.commons.math.util.FastMath.max(9L, (long) 29);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.0142079431235729d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6071820345634262d) + "'", double1 == (-1.6071820345634262d));
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.26241737750193517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8373449589690629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014614426508986972d + "'", double1 == 0.014614426508986972d);
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.710505431213761E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.710505431213761E-20d + "'", double1 == 2.710505431213761E-20d);
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9050824179664846d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.356194490192344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3306700394914686d) + "'", double1 == (-1.3306700394914686d));
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599210498948732d + "'", double1 == 1.2599210498948732d);
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4991939135618992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9825456043459503d + "'", double1 == 0.9825456043459503d);
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-34), (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.0f) + "'", float2 == (-34.0f));
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        double double2 = org.apache.commons.math.util.FastMath.min(0.61391130652238d, (-0.4195903379527587d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4195903379527587d) + "'", double2 == (-0.4195903379527587d));
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.008678526287959096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008678635231483104d + "'", double1 == 0.008678635231483104d);
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
        double double2 = org.apache.commons.math.util.FastMath.max(Double.NEGATIVE_INFINITY, (-0.09698324645938282d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09698324645938282d) + "'", double2 == (-0.09698324645938282d));
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.011669273072701132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011668743425722598d + "'", double1 == 0.011668743425722598d);
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.991328918078117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.532948251968783d + "'", double1 == 1.532948251968783d);
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
        int int2 = org.apache.commons.math.util.FastMath.min(108, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.36221568869946325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0663204755250903d + "'", double1 == 1.0663204755250903d);
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4401195096142341d, (double) 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003198853440157745d + "'", double2 == 0.003198853440157745d);
    }
}

