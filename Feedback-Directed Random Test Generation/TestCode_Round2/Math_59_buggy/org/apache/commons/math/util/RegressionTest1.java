package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7456241416655579d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9234560495448352d) + "'", double1 == (-0.9234560495448352d));
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011983210854855571d) + "'", double1 == (-0.011983210854855571d));
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        int int1 = org.apache.commons.math.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012989023072947d + "'", double1 == 2.3012989023072947d);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.03799291018846901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5261303806882357d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.3273845772164694d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6557942026326724d + "'", double1 == 0.6557942026326724d);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E52d + "'", double1 == 1.0E52d);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0392740995950414d, 1.451863517420987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8139497520487735d + "'", double2 == 2.8139497520487735d);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.5596856728972892d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.0d), 0.5404195002705842d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.33452691736804824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3408013099384417d + "'", double1 == 0.3408013099384417d);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7853981613362947d, (-0.9234560495448352d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2499132869489418d + "'", double2 == 1.2499132869489418d);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.0392740995950414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3393416562538205d + "'", double1 == 1.3393416562538205d);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        double double1 = org.apache.commons.math.util.FastMath.sin(51.99999915301149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866277300914504d + "'", double1 == 0.9866277300914504d);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5278888682247538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5830846312335454d) + "'", double1 == (-0.5830846312335454d));
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        long long1 = org.apache.commons.math.util.FastMath.abs(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.7330383821741316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        double double1 = org.apache.commons.math.util.FastMath.atanh(6.691673596021348E41d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.33452691736804824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32832234898519613d + "'", double1 == 0.32832234898519613d);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.492757420590521E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1331999452259886E-46d + "'", double1 == 1.1331999452259886E-46d);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 97.0f, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004625338125320674d + "'", double2 == 0.004625338125320674d);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8065537826828391d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5536062115091314d) + "'", double1 == (-0.5536062115091314d));
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.4626264090759076d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999969540041d + "'", double1 == 0.999999969540041d);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.492757420590521E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6284217534373299d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.250318945146276d + "'", double1 == 2.250318945146276d);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8065537826828391d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8968903759882284d) + "'", double1 == (-0.8968903759882284d));
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.824475489000561E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.214782272526239E-5d + "'", double1 == 9.214782272526239E-5d);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8700054540617281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4029365680925863d + "'", double1 == 1.4029365680925863d);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.492757420590521E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.492757420590521E-45d + "'", double1 == 6.492757420590521E-45d);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9647007265430612d + "'", double1 == 0.9647007265430612d);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2407288686697961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.845663344538835d + "'", double1 == 0.845663344538835d);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6487212707001282d + "'", double1 == 1.6487212707001282d);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        double double2 = org.apache.commons.math.util.FastMath.min(6012.84549645786d, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.8860316424407535E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2355196537783045E15d + "'", double1 == 1.2355196537783045E15d);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        double double1 = org.apache.commons.math.util.FastMath.tan(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569482d) + "'", double1 == (-0.5872139151569482d));
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1748021039363996d + "'", double1 == 3.1748021039363996d);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1331999452259886E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 100, 3.3648280517791587E-23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.994294500487108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1664162281198318d + "'", double1 == 1.1664162281198318d);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.0950379321938843d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3273845772164696d) + "'", double1 == (-1.3273845772164696d));
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 10, 4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.0432322944097698d), (-1.0269835496406734d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0269835496406734d) + "'", double2 == (-1.0269835496406734d));
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.017453292519943295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.845663344538835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7019710183189237d + "'", double1 == 0.7019710183189237d);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        double double1 = org.apache.commons.math.util.FastMath.rint(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6035270795055018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5675499795375124d) + "'", double1 == (-0.5675499795375124d));
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        double double1 = org.apache.commons.math.util.FastMath.cos(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0E52d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.834046549311538E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.278210815113034d) + "'", double1 == (-3.278210815113034d));
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.577951308233d + "'", double1 == 5729.577951308233d);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268069E13d + "'", double1 == 7.896296018268069E13d);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        double double1 = org.apache.commons.math.util.FastMath.tanh(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7825372599825183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01365785170622981d + "'", double1 == 0.01365785170622981d);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.566370614359173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6483608274590867d) + "'", double1 == (-0.6483608274590867d));
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        long long1 = org.apache.commons.math.util.FastMath.round(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        double double1 = org.apache.commons.math.util.FastMath.log(7.824475489000561E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.87634950490267d) + "'", double1 == (-27.87634950490267d));
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        long long1 = org.apache.commons.math.util.FastMath.round(0.03799291018846901d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5872139151569482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9113950174654148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        float float1 = org.apache.commons.math.util.FastMath.abs(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.004625338125320674d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        double double2 = org.apache.commons.math.util.FastMath.max(2979.3805346802806d, 0.3408013099384417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2979.3805346802806d + "'", double2 == 2979.3805346802806d);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        double double1 = org.apache.commons.math.util.FastMath.abs(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.3012989023072947d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.0269835496406734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0089148066056253d) + "'", double1 == (-1.0089148066056253d));
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        float float1 = org.apache.commons.math.util.FastMath.abs((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0000000485233538d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        float float1 = org.apache.commons.math.util.FastMath.abs(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5330785122775574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5944359846634683d) + "'", double1 == (-0.5944359846634683d));
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7949577687638787d) + "'", double1 == (-0.7949577687638787d));
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 120.42757201625032d + "'", double1 == 120.42757201625032d);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079986011887159E-5d + "'", double1 == 9.079986011887159E-5d);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5278888682247538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009213398835148427d) + "'", double1 == (-0.009213398835148427d));
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8157584261849007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.0269835496406734d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6487212707001282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.274526125422991d + "'", double1 == 1.274526125422991d);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000007d + "'", double1 == 1.000000000000007d);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9388149908366094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7346773280347003d + "'", double1 == 0.7346773280347003d);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1574487915559275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.075847940722074d + "'", double1 == 1.075847940722074d);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2407288686697966d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4251878220010183d, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4251878220010183d + "'", double2 == 1.4251878220010183d);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7735389809079516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8844064800831344d + "'", double1 == 0.8844064800831344d);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.03799291018846901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03799291018846901d + "'", double1 == 0.03799291018846901d);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 'a', 0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999986258976d + "'", double2 == 0.9999999986258976d);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        int int1 = org.apache.commons.math.util.FastMath.abs(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        double double2 = org.apache.commons.math.util.FastMath.min(1.075847940722074d, (-0.5261303806882357d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5261303806882357d) + "'", double2 == (-0.5261303806882357d));
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-27.87634950490267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.876349504902667d) + "'", double1 == (-27.876349504902667d));
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5540437953657898d), 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8250752499738025d, 0.7853981613362947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8598331705908712d + "'", double2 == 0.8598331705908712d);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.2710663101885897d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.265653458137023d + "'", double1 == 1.265653458137023d);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3845369719462828d) + "'", double1 == (-0.3845369719462828d));
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7853981613362947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0593061654437441d + "'", double1 == 1.0593061654437441d);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 52.0f, 0.9866277300914504d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.99999999999999d + "'", double2 == 51.99999999999999d);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6284217534373299d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8089563172728976d + "'", double1 == 0.8089563172728976d);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9647007265430612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9880923460971159d + "'", double1 == 0.9880923460971159d);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5872139151569482d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.298342365610589d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2407288686697966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.918853748407959d + "'", double1 == 2.918853748407959d);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.233403117511217d) + "'", double1 == (-1.233403117511217d));
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        int int1 = org.apache.commons.math.util.FastMath.abs(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9555128717466592d), 51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9555128717466592d) + "'", double2 == (-0.9555128717466592d));
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        long long2 = org.apache.commons.math.util.FastMath.max((-90L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09698324645938282d) + "'", double1 == (-0.09698324645938282d));
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6610060414837632d, 3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.174802103936399d + "'", double2 == 3.174802103936399d);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999999d + "'", double1 == 0.9999999999999999d);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5515659755035023d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1071487177940904d + "'", double1 == 1.1071487177940904d);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9647007265430612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26649174055900055d + "'", double1 == 0.26649174055900055d);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.9155023779490905E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9630272572571656d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5710374582913385d + "'", double1 == 0.5710374582913385d);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6995216443485196d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5596856728972892d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.559685672897289d) + "'", double2 == (-1.559685672897289d));
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6795226183513794d), 2.103676392483125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.103676392483125d + "'", double2 == 2.103676392483125d);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.9625468178726484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0691594887363018d + "'", double1 == 0.0691594887363018d);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7893750108307105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8739456127896416d + "'", double1 == 0.8739456127896416d);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.04323229440977d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7162978893146719d) + "'", double1 == (-1.7162978893146719d));
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        double double1 = org.apache.commons.math.util.FastMath.atan((-27.876349504902667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.534938999763997d) + "'", double1 == (-1.534938999763997d));
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1425465430742778d) + "'", double1 == (-0.1425465430742778d));
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.053671212772351E-8d + "'", double1 == 1.053671212772351E-8d);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0536712127723509E-8d + "'", double1 == 1.0536712127723509E-8d);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4862913247812135d + "'", double1 == 2.4862913247812135d);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0000000485233538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182819603591994d + "'", double1 == 2.7182819603591994d);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1331999452259886E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.999942448217206d) + "'", double1 == (-0.999942448217206d));
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9955742875642764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6795226183513794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8282265872414869d) + "'", double1 == (-0.8282265872414869d));
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8598331705908712d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2407288686697964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.918853748407957d + "'", double1 == 2.918853748407957d);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.9625468178726484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9625468178726484d + "'", double1 == 3.9625468178726484d);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.3273845772164696d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3273845772164694d) + "'", double2 == (-1.3273845772164694d));
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.199239450742893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0154861513366447d + "'", double1 == 1.0154861513366447d);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0826779851380144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7336545584598283d + "'", double1 == 0.7336545584598283d);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1016289084929765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0090635232033223d + "'", double1 == 3.0090635232033223d);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        double double1 = org.apache.commons.math.util.FastMath.floor(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        double double1 = org.apache.commons.math.util.FastMath.exp(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418160975E43d + "'", double1 == 2.6881171418160975E43d);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        double double2 = org.apache.commons.math.util.FastMath.min((-27.876349504902667d), (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-27.876349504902667d) + "'", double2 == (-27.876349504902667d));
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.6487212707001282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2003257647899614d + "'", double1 == 5.2003257647899614d);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 10L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        double double1 = org.apache.commons.math.util.FastMath.sin(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404864d + "'", double1 == 0.9866275920404864d);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 10L, 0.005402970483400532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005402970483400532d + "'", double2 == 0.005402970483400532d);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9836065573770492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18131977440149033d + "'", double1 == 0.18131977440149033d);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        double double2 = org.apache.commons.math.util.FastMath.pow((-5.227971924677803d), 22025.465794806718d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(31.98437118343895d, 1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.984371183438945d + "'", double2 == 31.984371183438945d);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        double double1 = org.apache.commons.math.util.FastMath.log1p(11.7910068511973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.548742334243514d + "'", double1 == 2.548742334243514d);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        double double1 = org.apache.commons.math.util.FastMath.log(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8334737036630135d + "'", double1 == 0.8334737036630135d);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764523d) + "'", double1 == (-0.8390715290764523d));
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 100L, (-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8640359722236105d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2355196537783045E15d, (-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2355196537783045E15d + "'", double2 == 1.2355196537783045E15d);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        double double2 = org.apache.commons.math.util.FastMath.pow(32.0d, (-0.9234560495448352d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04074367013117616d + "'", double2 == 0.04074367013117616d);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        double double2 = org.apache.commons.math.util.FastMath.max(2.250318945146276d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.250318945146276d + "'", double2 == 2.250318945146276d);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        double double2 = org.apache.commons.math.util.FastMath.max((double) '4', (-0.8065537826828391d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.566370614359173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        double double1 = org.apache.commons.math.util.FastMath.ceil(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        double double1 = org.apache.commons.math.util.FastMath.log10(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041945072145264d + "'", double1 == 4.041945072145264d);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.079986011887159E-5d, 22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.07998601188716E-5d + "'", double2 == 9.07998601188716E-5d);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.999999969540041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.46819606815034E-4d + "'", double1 == 2.46819606815034E-4d);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985961979837E-5d + "'", double1 == 9.079985961979837E-5d);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6035270795055018d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6035270795055017d) + "'", double2 == (-0.6035270795055017d));
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        double double1 = org.apache.commons.math.util.FastMath.acos(66029.68355238467d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2355196537783045E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.44341522934086d + "'", double1 == 35.44341522934086d);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.158638853279167d, 0.01365785170622981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.158638853279166d + "'", double2 == 4.158638853279166d);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.0432322944097698d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0806165313998193E47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.191476652127584E48d + "'", double1 == 6.191476652127584E48d);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7330383821741316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-3.8551464208140986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.628351601695012d + "'", double1 == 23.628351601695012d);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8089563172728976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6801783019998602d + "'", double1 == 0.6801783019998602d);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9836065573770492d, 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948961d + "'", double2 == 1.5707963267948961d);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.041945072145264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.010458920780344d + "'", double1 == 2.010458920780344d);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4505495340698077d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4223506181800103d) + "'", double1 == (-0.4223506181800103d));
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        double double1 = org.apache.commons.math.util.FastMath.tan(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3956124250860895d + "'", double1 == 1.3956124250860895d);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.011983210854855571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(97.0d, 0.3408013099384417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999999999999d + "'", double2 == 96.99999999999999d);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.61391130652238d + "'", double1 == 0.61391130652238d);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6212147412252023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8611875304425891d + "'", double1 == 0.8611875304425891d);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.32832234898519613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.0432322944097698d), 3.1622776601683795d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5574077246549023d), 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 10, 1.5707055269358083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.21392919076789d + "'", double2 == 37.21392919076789d);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.4505495340698077d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45054953406980763d) + "'", double1 == (-0.45054953406980763d));
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.0090635232033223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.265653458137023d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.1284181946612d + "'", double1 == 43.1284181946612d);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8282265872414869d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7615790383433858d) + "'", double1 == (-1.7615790383433858d));
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        double double2 = org.apache.commons.math.util.FastMath.max(32.0d, 0.7825372599825183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292447995462d + "'", double1 == 0.017453292447995462d);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.005402970483400532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.429962432340893E-5d + "'", double1 == 9.429962432340893E-5d);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5729.577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5730.0d + "'", double1 == 5730.0d);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.011983210854855571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011983210854855571d + "'", double1 == 0.011983210854855571d);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3440585709080678E43d, (-1.0432322944097698d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0432322944097698d) + "'", double2 == (-1.0432322944097698d));
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5675499795375124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5675499795375124d + "'", double1 == 0.5675499795375124d);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        long long1 = org.apache.commons.math.util.FastMath.abs(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        double double1 = org.apache.commons.math.util.FastMath.acosh(23.628351601695012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8551464208140986d + "'", double1 == 3.8551464208140986d);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6416439271862105d) + "'", double1 == (-0.6416439271862105d));
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8700054540617281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01518445968368543d + "'", double1 == 0.01518445968368543d);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        long long1 = org.apache.commons.math.util.FastMath.round(97.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5515659755035023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2534690753051354d + "'", double1 == 2.2534690753051354d);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7346773280347003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8571332032039712d + "'", double1 == 0.8571332032039712d);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        double double2 = org.apache.commons.math.util.FastMath.min(23.140692632779267d, 108.29903111138356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.140692632779267d + "'", double2 == 23.140692632779267d);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        long long1 = org.apache.commons.math.util.FastMath.abs(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        double double2 = org.apache.commons.math.util.FastMath.min(4.15912713462618d, (-27.876349504902667d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-27.876349504902667d) + "'", double2 == (-27.876349504902667d));
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.8139497520487735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        double double1 = org.apache.commons.math.util.FastMath.tan((-323.0051853474518d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6535374302343122d + "'", double1 == 0.6535374302343122d);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        double double1 = org.apache.commons.math.util.FastMath.exp((-323.0051853474518d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.25569770210804E-141d + "'", double1 == 5.25569770210804E-141d);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        double double1 = org.apache.commons.math.util.FastMath.tan(6012.84549645786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16429734860675368d) + "'", double1 == (-0.16429734860675368d));
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        long long1 = org.apache.commons.math.util.FastMath.round(5507.000045396766d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5507L + "'", long1 == 5507L);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8334737036630135d, (-2.3012989023072947d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8334737036630134d + "'", double2 == 0.8334737036630134d);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 97.0f, (-0.888945622903398d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5799604581126996d + "'", double2 == 1.5799604581126996d);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.233403117511217d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7987095471340483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9278183521288984d) + "'", double1 == (-0.9278183521288984d));
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        double double1 = org.apache.commons.math.util.FastMath.acosh(66029.68355238467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.7910068511973d + "'", double1 == 11.7910068511973d);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745329251994342d + "'", double1 == 0.01745329251994342d);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1854652182422676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4833023923748323d + "'", double1 == 1.4833023923748323d);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        int int1 = org.apache.commons.math.util.FastMath.abs(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.0947125472611012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.0269835496406734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.772695717397461d) + "'", double1 == (-0.772695717397461d));
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6035270795055018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6893272594363031d) + "'", double1 == (-0.6893272594363031d));
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3953649341158527d, 1.1331999452259886E-46d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3953649341158527d + "'", double2 == 1.3953649341158527d);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6893272594363031d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.169015201985079d) + "'", double1 == (-1.169015201985079d));
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8373983731296124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5671648645968973d) + "'", double1 == (-0.5671648645968973d));
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6610060414837632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5840734641020677d + "'", double1 == 0.5840734641020677d);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.743980336957493d + "'", double1 == 0.743980336957493d);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (-90L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.102016471589204E38d + "'", double1 == 6.102016471589204E38d);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8700054540617281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7864052920748482d + "'", double1 == 0.7864052920748482d);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3393416562538205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.73862422940539d + "'", double1 == 76.73862422940539d);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0536712127723509E-8d, 0.999999969540041d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.053671212772351E-8d + "'", double2 == 1.053671212772351E-8d);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6212147412252023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6702918784382802d + "'", double1 == 0.6702918784382802d);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.40934278535333d + "'", double1 == 89.40934278535333d);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3945753355078114d) + "'", double1 == (-2.3945753355078114d));
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-3.278210815113034d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4855215610041086d) + "'", double1 == (-1.4855215610041086d));
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10903143175231947d + "'", double1 == 0.10903143175231947d);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.845663344538835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        double double1 = org.apache.commons.math.util.FastMath.log1p(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970291913552122d + "'", double1 == 3.970291913552122d);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.433803554543751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9979202349577406d + "'", double1 == 0.9979202349577406d);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        double double1 = org.apache.commons.math.util.FastMath.log(1.265653458137023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2355885565015715d + "'", double1 == 0.2355885565015715d);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        double double1 = org.apache.commons.math.util.FastMath.cosh(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3275811425819994d, 0.9880923460971159d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.327581142581999d + "'", double2 == 2.327581142581999d);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1664162281198318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0668535532697389d + "'", double1 == 0.0668535532697389d);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        double double1 = org.apache.commons.math.util.FastMath.atan(89.40934278535333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5596122796450436d + "'", double1 == 1.5596122796450436d);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9630272572571656d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.437600971038334d) + "'", double1 == (-1.437600971038334d));
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3953649341158527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.4855215610041086d), 3.433803554543751d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4083045276232639d) + "'", double2 == (-0.4083045276232639d));
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        long long1 = org.apache.commons.math.util.FastMath.round(2.0392740995950414d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4657359027997265d + "'", double1 == 3.4657359027997265d);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9880923460971159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9880923460971159d + "'", double1 == 0.9880923460971159d);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 1L, (-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9955742875642764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5378946274303924d + "'", double1 == 1.5378946274303924d);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9526653195309732d + "'", double1 == 0.9526653195309732d);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5675499795375124d, 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9113950174654148d, 120.42757201625032d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9113950174654148d + "'", double2 == 0.9113950174654148d);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.302585092994046d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(44.99809670330265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.708062067639405d + "'", double1 == 6.708062067639405d);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6035270795055018d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        double double1 = org.apache.commons.math.util.FastMath.tanh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5707963267948961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9555128717466592d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3846148358776134d + "'", double1 == 0.3846148358776134d);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.04323229440977d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7791612621104443d) + "'", double1 == (-0.7791612621104443d));
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.011983210854855571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012055297180161666d + "'", double1 == 0.012055297180161666d);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8598331705908712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7577337065923179d + "'", double1 == 0.7577337065923179d);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.041945072145264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.936981707418624d + "'", double1 == 56.936981707418624d);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3796077390275217d, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0037960591563502375d + "'", double2 == 0.0037960591563502375d);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        double double1 = org.apache.commons.math.util.FastMath.sin(76.73862422940539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9735760889955917d + "'", double1 == 0.9735760889955917d);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.3273845772164696d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4251878220010183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9894177983454929d + "'", double1 == 0.9894177983454929d);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7864052920748482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5802053839637672d + "'", double1 == 0.5802053839637672d);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.61391130652238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.9075758706536994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        int int1 = org.apache.commons.math.util.FastMath.round(32.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6d, (-0.7987095471340483d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7987095471340483d) + "'", double2 == (-0.7987095471340483d));
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.824475489000561E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.055410749812933396d + "'", double1 == 0.055410749812933396d);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.227971924677803d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1482743665672453d + "'", double2 == 0.1482743665672453d);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6801783019998602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8089563172728975d + "'", double1 == 0.8089563172728975d);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8282265872414869d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5631767322193112d) + "'", double1 == (-0.5631767322193112d));
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3953649341158527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3331559825783589d + "'", double1 == 0.3331559825783589d);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        double double1 = org.apache.commons.math.util.FastMath.log(5507.000045396766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.613775297505947d + "'", double1 == 8.613775297505947d);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-27.876349504902667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0321124266229886d) + "'", double1 == (-3.0321124266229886d));
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        long long1 = org.apache.commons.math.util.FastMath.abs(2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7735389809079516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6583966420468889d + "'", double1 == 0.6583966420468889d);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1071487177940904d + "'", double1 == 1.1071487177940904d);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.918853748407959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.994185913465727d + "'", double1 == 0.994185913465727d);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012208955882846451d) + "'", double1 == (-0.012208955882846451d));
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.18131977440149033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943295d + "'", double1 == 1.7453292519943295d);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9894177983454929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1589375003169515d + "'", double1 == 1.1589375003169515d);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9880923460971159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5830846312335454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010176746632802332d) + "'", double1 == (-0.010176746632802332d));
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8655103306675354d + "'", double1 == 0.8655103306675354d);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999998d) + "'", double1 == (-0.9999999999999998d));
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8373983731296124d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7577337065923179d, 89.40934278535333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7577337065923179d + "'", double2 == 0.7577337065923179d);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1071487177940904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10178798778736835d + "'", double1 == 0.10178798778736835d);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2407288686697964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32410684590028493d + "'", double1 == 0.32410684590028493d);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1574487915559275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.433759246577862d + "'", double1 == 1.433759246577862d);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9630272572571656d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9630272572571655d) + "'", double1 == (-0.9630272572571655d));
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6995216443485195d), 5.2003257647899614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.13371234504895402d) + "'", double2 == (-0.13371234504895402d));
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5830846312335454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.40828846862413d) + "'", double1 == (-33.40828846862413d));
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        long long2 = org.apache.commons.math.util.FastMath.min((-90L), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1589375003169515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06406001577433591d + "'", double1 == 0.06406001577433591d);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0826779851380144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03449930605017342d + "'", double1 == 0.03449930605017342d);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6487212707001282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0255887029643131d + "'", double1 == 1.0255887029643131d);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0E-323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-323d + "'", double1 == 1.0E-323d);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9526653195309732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016627146495379323d + "'", double1 == 0.016627146495379323d);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3408013099384417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34080130993844177d + "'", double1 == 0.34080130993844177d);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7456241416655579d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6896428168918044d) + "'", double1 == (-0.6896428168918044d));
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7735389809079516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1674231661645518d + "'", double1 == 1.1674231661645518d);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        double double1 = org.apache.commons.math.util.FastMath.tanh(89.40934278535333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.26649174055900055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9647007265430612d + "'", double1 == 0.9647007265430612d);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8089563172728976d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        double double1 = org.apache.commons.math.util.FastMath.asin(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8739456127896416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8739456127896416d + "'", double1 == 0.8739456127896416d);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        double double2 = org.apache.commons.math.util.FastMath.max(1.8157584261849007d, 0.61391130652238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8157584261849007d + "'", double2 == 1.8157584261849007d);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5404195002705842d, (-0.7791612621104443d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5404195002705842d + "'", double2 == 0.5404195002705842d);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7893750108307105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7243500169114551d + "'", double1 == 0.7243500169114551d);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5507L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.492757420590521E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.492757420590522E-45d + "'", double1 == 6.492757420590522E-45d);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        double double1 = org.apache.commons.math.util.FastMath.cos((-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9736862425967708d + "'", double1 == 0.9736862425967708d);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5830846312335454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9866277300914504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7786671247869191d + "'", double1 == 0.7786671247869191d);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        long long1 = org.apache.commons.math.util.FastMath.round(2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.6865874069985796d), (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.005402970483400531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005402996770772377d + "'", double1 == 0.005402996770772377d);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7160033436347992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.838249024841735d) + "'", double1 == (-6.838249024841735d));
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7786671247869191d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7893184915864662d) + "'", double1 == (-0.7893184915864662d));
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-90L), (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2097152.0d + "'", double1 == 2097152.0d);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.8860316424407535E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8860316424407535E45d + "'", double1 == 1.8860316424407535E45d);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.46285676099588835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8947805892373116d + "'", double1 == 0.8947805892373116d);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6035270795055018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6986765821769388d) + "'", double1 == (-0.6986765821769388d));
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.3012989023072947d), 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.023008927771751345d) + "'", double2 == (-0.023008927771751345d));
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        double double2 = org.apache.commons.math.util.FastMath.max(35.44341522934086d, 1.000000000000007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.44341522934086d + "'", double2 == 35.44341522934086d);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4833023923748323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025888510549649656d + "'", double1 == 0.025888510549649656d);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8700054540617282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5155829442931129d + "'", double1 == 0.5155829442931129d);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.824475489000561E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.824475489000561E-13d + "'", double1 == 7.824475489000561E-13d);
    }
}

