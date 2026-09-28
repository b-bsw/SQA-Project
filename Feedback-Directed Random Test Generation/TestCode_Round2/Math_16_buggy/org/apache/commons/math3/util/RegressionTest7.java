package org.apache.commons.math3.util;

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
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.17512404686688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        double double1 = org.apache.commons.math3.util.FastMath.tan(9.536743164059608E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.5367431640625E-7d + "'", double1 == 9.5367431640625E-7d);
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9124034991009714d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-9.632848614896421E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005519215703220058d) + "'", double1 == (-0.005519215703220058d));
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0000009536748848d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-127));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.185891831851989d) + "'", double1 == (-4.185891831851989d));
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(7.38905609893065d, 3.413832468402249d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.137998254238577d + "'", double2 == 1.137998254238577d);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.8E-45f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.8E-45f + "'", float1 == 2.8E-45f);
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.150779711560351d, 0.9977630759545902d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15972740774199012d + "'", double2 == 0.15972740774199012d);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(10.000000953674316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978953594960317d + "'", double1 == 2.3978953594960317d);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.1977594109665195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(375.0f, 5.439202631236047d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 374.99997f + "'", float2 == 374.99997f);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 8);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14550003380861354d) + "'", double1 == (-0.14550003380861354d));
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.9103830456733704E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.910383045673371E-11d + "'", double1 == 2.910383045673371E-11d);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.821637045374455E-17d) + "'", double1 == (-4.821637045374455E-17d));
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9466715061814477d, 8.398079445262944d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.398079445262944d + "'", double2 == 8.398079445262944d);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.8880936454516588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4304918528519632d + "'", double1 == 1.4304918528519632d);
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1023.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.62364218539641d + "'", double1 == 7.62364218539641d);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.8215975647065147d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-15.999999046325684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.4667109783961534d) + "'", double1 == (-3.4667109783961534d));
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7.313219861265277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8641086300492958d + "'", double1 == 0.8641086300492958d);
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        double double2 = org.apache.commons.math3.util.FastMath.max((-57.29577951308232d), 52.548958003770906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.548958003770906d + "'", double2 == 52.548958003770906d);
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-63959947L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.570796311160112d) + "'", double1 == (-1.570796311160112d));
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        float float2 = org.apache.commons.math3.util.FastMath.max(6.0000005f, 3.1691265E29f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1691265E29f + "'", float2 == 3.1691265E29f);
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.8199525775350112d, 12.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.14973832340422d + "'", double2 == 4.14973832340422d);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.620073206530356d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.3956124250860895d, (double) 137);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3956124250860895d + "'", double2 == 1.3956124250860895d);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5997382704646929d, 0.5894638344822235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8409242565311499d + "'", double2 == 0.8409242565311499d);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.5628219188284787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5126339703518791d + "'", double1 == 0.5126339703518791d);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8284271247461903d + "'", double1 == 2.8284271247461903d);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.5126339703518791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5662961598647253d + "'", double1 == 0.5662961598647253d);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6543612251060553E-24d + "'", double1 == 1.6543612251060553E-24d);
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(89.92360567258659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.9236056725866d + "'", double1 == 89.9236056725866d);
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.715289172677667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.523056711799125d + "'", double1 == 20.523056711799125d);
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 32, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1025.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        int int2 = org.apache.commons.math3.util.FastMath.max((-14), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5565511495583535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.938659142988208d + "'", double1 == 0.938659142988208d);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.64926731E12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.64926744E12f + "'", float1 == 1.64926744E12f);
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        double double1 = org.apache.commons.math3.util.FastMath.signum(286.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5200669294466767d, (double) 7.737125E25f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5200669294466769d + "'", double2 == 1.5200669294466769d);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9977630759545902d, 22025.465794806678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9977630759545904d + "'", double2 == 0.9977630759545904d);
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9432571842576234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8406759214397472d + "'", double1 == 0.8406759214397472d);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.192092966562089E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000001192093038d + "'", double1 == 1.0000001192093038d);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(224.08464360781855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.1051760129492685d + "'", double1 == 6.1051760129492685d);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 149L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.9999999f), 10.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.2676506E30f, 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1024L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        int int2 = org.apache.commons.math3.util.FastMath.min((-127), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 749.99994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.085602717697938d + "'", double1 == 9.085602717697938d);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 1.2207031189367021E-4d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7185540823899328d, 1.0908536532676732E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7185540823899328d + "'", double2 == 0.7185540823899328d);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 2147483647, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(39.0f, 0.34198014841116886d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.999996f + "'", float2 == 38.999996f);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5670585390721963d, (-6.020599913279624d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.2211972947867284d + "'", double2 == 6.2211972947867284d);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.1546709519529927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404852d + "'", double1 == 0.9866275920404852d);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.099338555038559d, 0.35366137659382735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08361383430588709d) + "'", double2 == (-0.08361383430588709d));
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 750, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        double double1 = org.apache.commons.math3.util.FastMath.asin(96.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.011032585021104841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6321205588285577d + "'", double1 == 0.6321205588285577d);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.6885686776071497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6030126644276035d + "'", double1 == 0.6030126644276035d);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.7853981633974483d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.53711887601422E15d + "'", double2 == 3.53711887601422E15d);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        int int1 = org.apache.commons.math3.util.FastMath.abs(86);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86 + "'", int1 == 86);
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(97.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744345002d + "'", double1 == 1.6929693744345002d);
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        int int2 = org.apache.commons.math3.util.FastMath.max(63, 106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.4359738367999996E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 52.0f, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.984137914278307E171d + "'", double2 == 3.984137914278307E171d);
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0101769735763335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0033808812856155d + "'", double1 == 1.0033808812856155d);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.949911109190508d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.562490436697348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999655062931482d + "'", double1 == 0.9999655062931482d);
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) ' ', (-63959947L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63959947L) + "'", long2 == (-63959947L));
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.018180612889371E87d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.018180612889371E87d + "'", double1 == 4.018180612889371E87d);
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.75502076286542E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.9719903465379038d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9905748953335048d) + "'", double1 == (-0.9905748953335048d));
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '#', 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-29L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 10L, 0.1635222099724446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.025145191680879475d + "'", double2 == 0.025145191680879475d);
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(512.5789572728952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.946190480851357d + "'", double1 == 8.946190480851357d);
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.300664126286459E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.81474976710656E14d + "'", double1 == 2.81474976710656E14d);
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.1626899390303921E-17d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1626899390303921E-17d) + "'", double1 == (-1.1626899390303921E-17d));
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        float float2 = org.apache.commons.math3.util.FastMath.max(100.00001f, 39.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.00001f + "'", float2 == 100.00001f);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.6931471805599455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000004d + "'", double1 == 1.0000000000000004d);
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.5662961598647253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7525265177153063d + "'", double1 == 0.7525265177153063d);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.1645206134117347E-165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.1102230246251565E-16d, (-0.17364804653184446d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1102230246251565E-16d + "'", double2 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.154056433601276E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.154056433601276E39d + "'", double1 == 1.154056433601276E39d);
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.54742505E26f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5474252E26f + "'", float1 == 1.5474252E26f);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.6942252369286008E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-9223372036854775808L), 2015.9999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.223372E18f) + "'", float2 == (-9.223372E18f));
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.4012984643248174E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4012984643248174E-45d + "'", double1 == 1.4012984643248174E-45d);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 0.015625002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01562373042059934d + "'", double1 == 0.01562373042059934d);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        double double1 = org.apache.commons.math3.util.FastMath.exp(8.398079445262944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4438.5341089142175d + "'", double1 == 4438.5341089142175d);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        double double1 = org.apache.commons.math3.util.FastMath.signum(375.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        long long1 = org.apache.commons.math3.util.FastMath.round(74.38989177586092d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 74L + "'", long1 == 74L);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8171205928321397d + "'", double1 == 1.8171205928321397d);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(460.51701859880916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 8.000001f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.192092966562089E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920929665620893E-7d + "'", double1 == 1.1920929665620893E-7d);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0000009536748848d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        long long2 = org.apache.commons.math3.util.FastMath.max(86L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 86L + "'", long2 == 86L);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.0f, 99.99999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.6812492467611788E-6d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1.9999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03490658295929199d + "'", double1 == 0.03490658295929199d);
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.503897021644941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.138463037954397d + "'", double1 == 2.138463037954397d);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        int int2 = org.apache.commons.math3.util.FastMath.min(230, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        float float1 = org.apache.commons.math3.util.FastMath.signum(9.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.6843418860808015E-14d, 0.11030288331712183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11030288331712183d + "'", double2 == 0.11030288331712183d);
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.017281906236058166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01728276659971805d + "'", double1 == 0.01728276659971805d);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.629395E-6f + "'", float1 == 7.629395E-6f);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(8.699514748210191d, 0.2558427881104495d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.699514748210191d + "'", double2 == 8.699514748210191d);
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.0634370688955608d, 1.292469630076908E-26d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.292469630076908E-26d + "'", double2 == 1.292469630076908E-26d);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5707963267816856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 750, (-3.137566414384587E306d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-750.0d) + "'", double2 == (-750.0d));
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1022.99994f), (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.06243896f) + "'", float2 == (-0.06243896f));
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        float float2 = org.apache.commons.math3.util.FastMath.max(97.0f, 5.9999995f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-3.9133899457889196d), 1.5573218601131689d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.758575634550587d + "'", double2 == 0.758575634550587d);
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 86);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        double double1 = org.apache.commons.math3.util.FastMath.sin(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097466d) + "'", double1 == (-0.5063656411097466d));
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5705654518541791d, (-1.093419873184702d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8469725489740325d + "'", double2 == 1.8469725489740325d);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-6.39599474488673E7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.395994744886729E7d) + "'", double1 == (-6.395994744886729E7d));
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.7456061400682787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        double double1 = org.apache.commons.math3.util.FastMath.signum(46655.999999999956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8255079892949791d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0000030776922988d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 750);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 750 + "'", int1 == 750);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        long long1 = org.apache.commons.math3.util.FastMath.abs(22026L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22026L + "'", long1 == 22026L);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.9132181397411985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(25.493967590237556d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(19.085532134423065d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.6215477523208264d), (-29));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-975527.4450396402d) + "'", double2 == (-975527.4450396402d));
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-975527.4450396402d), (-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-975527.4450396402d) + "'", double2 == (-975527.4450396402d));
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.01968878488836084d, (-56.99999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 44.0070091039492d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(572.9577951308232d, 8.44871722863096E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.1244601392439496E-4d) + "'", double2 == (-4.1244601392439496E-4d));
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        double double1 = org.apache.commons.math3.util.FastMath.tan(11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4731139338934116d) + "'", double1 == (-1.4731139338934116d));
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(192.00001525878906d, 31.499999999999993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 192.00001525878906d + "'", double2 == 192.00001525878906d);
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.1029798377113775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019250629751176255d + "'", double1 == 0.019250629751176255d);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.1182202459195336d, 3.599187944144099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.176243631242751d + "'", double2 == 4.176243631242751d);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1024.0496050813779d, 20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6084956416610713E60d + "'", double2 == 1.6084956416610713E60d);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.1645206134117347E-165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1645206134117347E-165d + "'", double1 == 1.1645206134117347E-165d);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 126.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 126.99999237060548d + "'", double1 == 126.99999237060548d);
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-9.2233715E18f) + "'", float1 == (-9.2233715E18f));
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.993222846126381d, (-0.0015093903479832123d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9983465473243199d + "'", double2 == 0.9983465473243199d);
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.6929693744345002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22864910185707277d + "'", double1 == 0.22864910185707277d);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9403184054350179d + "'", double1 == 0.9403184054350179d);
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-38.22907066290581d), 0.3925448875977896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 38.22907066290581d + "'", double2 == 38.22907066290581d);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.3923301810454625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.637689859280612d + "'", double1 == 1.637689859280612d);
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-6.020599913279624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-205.9115765284781d) + "'", double1 == (-205.9115765284781d));
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-4.821637045374455E-17d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-6.305123299389195d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9981730791033734d) + "'", double1 == (-0.9981730791033734d));
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.8402864822065013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        double double1 = org.apache.commons.math3.util.FastMath.log(38.72983346207417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6566101935451507d + "'", double1 == 3.6566101935451507d);
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.138463037954397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8431577997039656d + "'", double1 == 0.8431577997039656d);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.129248571153767E29d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.849653111851499E7d, 0.026871352843612424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.849653111851499E7d + "'", double2 == 2.849653111851499E7d);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (-0.9999999403953551d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4E-45f) + "'", float2 == (-1.4E-45f));
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0955641261303417d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.48941851000927195d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.820766E-11f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34) + "'", int1 == (-34));
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-17.854718247901992d), 2.3978953594960317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.854718247901992d + "'", double2 == 17.854718247901992d);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.6321205588285577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8865094960340845d + "'", double1 == 0.8865094960340845d);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 0.758575634550587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.0000000000291038d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.4242728127018156d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4242728127018154d + "'", double2 == 1.4242728127018154d);
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.895475622246554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7805065035757566d + "'", double1 == 0.7805065035757566d);
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.991641660703783d, 749.9999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.991641660703783d + "'", double2 == 4.991641660703783d);
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.636436139626906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45187119653358443d) + "'", double1 == (-0.45187119653358443d));
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9738115534140308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.648018311881701d + "'", double1 == 2.648018311881701d);
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-20), (long) 1024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        int int2 = org.apache.commons.math3.util.FastMath.max(6000, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6000 + "'", int2 == 6000);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078068E-7d + "'", double1 == 1.1920928955078068E-7d);
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.008837747656337245d), 0.9073862646776047d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.009739477614549555d) + "'", double2 == (-0.009739477614549555d));
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-63L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.3458247401995457E41d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        double double2 = org.apache.commons.math3.util.FastMath.max(31.499999999999993d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.499999999999993d + "'", double2 == 31.499999999999993d);
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.189528855605421E-47d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.882812208961696E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8828120149361966E-4d + "'", double1 == 4.8828120149361966E-4d);
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.41928129253470725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4071041039658141d) + "'", double1 == (-0.4071041039658141d));
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-29.0f), 1.0000123108260286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000123108260286d + "'", double2 == 1.0000123108260286d);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-6));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.5628219188284785d, 1.9433862044896946d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5628219188284785d + "'", double2 == 0.5628219188284785d);
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        float float2 = org.apache.commons.math3.util.FastMath.min((-35.0f), 2.910383E-11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.0f) + "'", float2 == (-35.0f));
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        double double1 = org.apache.commons.math3.util.FastMath.cos(70.26985858558899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40408300167069183d + "'", double1 == 0.40408300167069183d);
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.007570918573144928d), 1.2401309032460812E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007570918573144928d + "'", double2 == 0.007570918573144928d);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.0554544523933395E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-20));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        long long1 = org.apache.commons.math3.util.FastMath.abs(230L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 230L + "'", long1 == 230L);
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.64926744E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-8.781516350303278d), 0.9432571842576234d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.384185791015648E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.0d + "'", double1 == 11014.0d);
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 32.000004f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.4322216757321002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9612687236353933d + "'", double1 == 0.9612687236353933d);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.8828120149362145E-4d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.768371582031611E-7d, (double) 37.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.0d + "'", double2 == 37.0d);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-2045.9999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-117227.15788965272d) + "'", double1 == (-117227.15788965272d));
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20321057778875d + "'", double1 == 74.20321057778875d);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.5670585390721965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 5.9999995f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 402.4286011229416d + "'", double1 == 402.4286011229416d);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.7665477425729947d, (double) (-35.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.119694790316062d + "'", double2 == 3.119694790316062d);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 112L, 1.5845631E30f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 112.0f + "'", float2 == 112.0f);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.4247223454937545E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(163354.18244889102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9103830456733704E-11d + "'", double1 == 2.9103830456733704E-11d);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        double double1 = org.apache.commons.math3.util.FastMath.atan(11.812917954340138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4863445844633245d + "'", double1 == 1.4863445844633245d);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.695330298047765d, (-34));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.733041938654942E-10d + "'", double2 == 2.733041938654942E-10d);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.2658595418453178E14d, 0.5628219188284785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2658595418453177E14d + "'", double2 == 1.2658595418453177E14d);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.009812364279302056d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.23752928622151E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.51021370567213d + "'", double1 == 42.51021370567213d);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.029101515410080516d, 1.4242728127018154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02042970020377229d + "'", double2 == 0.02042970020377229d);
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.5126339703518791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5353836659458734d + "'", double1 == 0.5353836659458734d);
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9950547536867306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        double double2 = org.apache.commons.math3.util.FastMath.max(5.729577951308233E21d, 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.729577951308233E21d + "'", double2 == 5.729577951308233E21d);
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6.0000005f, (double) 11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.000001f + "'", float2 == 6.000001f);
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.885078775995249E-32d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.770157551990498E-32d + "'", double2 == 3.770157551990498E-32d);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1023.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        double double2 = org.apache.commons.math3.util.FastMath.log(9.536743164059608E-7d, 0.8505583393414862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011675895096193602d + "'", double2 == 0.011675895096193602d);
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0842022E-19f, (-2.14748352E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842022E-19f + "'", float2 == 1.0842022E-19f);
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(8.881785E-16f, (double) 86L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.881786E-16f + "'", float2 == 8.881786E-16f);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9998140668686113d, 686.4773600637391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998140668686113d + "'", double2 == 0.9998140668686113d);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.848890218459358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7670734698904623d + "'", double1 == 0.7670734698904623d);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066029033894E7d + "'", double1 == 3.748066029033894E7d);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.45282434280595096d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.932447891572509d + "'", double1 == 6.932447891572509d);
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 8.881786E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.88178631458362E-16d + "'", double1 == 8.88178631458362E-16d);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        double double1 = org.apache.commons.math3.util.FastMath.tan(42.51021370567213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.097464363504391d) + "'", double1 == (-10.097464363504391d));
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.4411627128891868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2256061285123683d + "'", double1 == 3.2256061285123683d);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.19902312E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        int int2 = org.apache.commons.math3.util.FastMath.min(39, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.027181889027663657d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02718858648935137d) + "'", double1 == (-0.02718858648935137d));
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(10.122104641351006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999967708991d + "'", double1 == 0.9999999967708991d);
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 0, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 85 + "'", int2 == 85);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.2949673E9f, (float) (-38));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.6414445250304635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.848890218459359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.6026819659087781d, 0.853230586269599d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.853230586269599d + "'", double2 == 0.853230586269599d);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7802246589084126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6625659571216381d + "'", double1 == 0.6625659571216381d);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.736374376643928d, (-0.005159786500818854d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.005159786500818854d) + "'", double2 == (-0.005159786500818854d));
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5698207173483318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.506934503488869d + "'", double1 == 2.506934503488869d);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.1977594109665195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.809812962444004d + "'", double1 == 0.809812962444004d);
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.3728503949255086E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000001372850489d + "'", double1 == 1.0000001372850489d);
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.005159786500818854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0051598093960231765d) + "'", double1 == (-0.0051598093960231765d));
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 9.999999f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999046325682d + "'", double2 == 9.999999046325682d);
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.089627549827866E13d, 1.5694629941431792d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948581d + "'", double2 == 1.5707963267948581d);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.70805020110221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.70805020110221d + "'", double1 == 2.70805020110221d);
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 9L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.2207031189367021E-4d, 2.70805020110221d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.507682751276436E-5d + "'", double2 == 4.507682751276436E-5d);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(8.445152205030682E-4d, (double) 3.0000002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.445152205030683E-4d + "'", double2 == 8.445152205030683E-4d);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.6602039004484537d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.079409548469555d) + "'", double1 == (-1.079409548469555d));
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-7277.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.7683716E-7f, (double) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.768372E-7f + "'", float2 == 4.768372E-7f);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) '#', 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.8838203308698949d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        int int2 = org.apache.commons.math3.util.FastMath.min(137, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-5.8774718E-37f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.5574077246549023d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574077246549023d + "'", double2 == 1.5574077246549023d);
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.8524213316116924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06934569072070507d) + "'", double1 == (-0.06934569072070507d));
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-2.2343605386104213d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.234360538610421d) + "'", double1 == (-2.234360538610421d));
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.433773393518789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0075707739244519d + "'", double1 == 0.0075707739244519d);
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.848890218459359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42077103379809366d) + "'", double1 == (-0.42077103379809366d));
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.300478955492525d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.030765742067207565d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.030765742067207565d + "'", double2 == 0.030765742067207565d);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        int int2 = org.apache.commons.math3.util.FastMath.max(38, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.03467284536035253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6054761232346983d + "'", double1 == 1.6054761232346983d);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        long long2 = org.apache.commons.math3.util.FastMath.min(74L, (-127L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127L) + "'", long2 == (-127L));
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 750L, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0045242572063329E92d + "'", double2 == 1.0045242572063329E92d);
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(36.01102806275611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.01102806275612d + "'", double1 == 36.01102806275612d);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        long long1 = org.apache.commons.math3.util.FastMath.abs(2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.2065299964591305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18774846815194648d + "'", double1 == 0.18774846815194648d);
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        float float1 = org.apache.commons.math3.util.FastMath.abs(5.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.999999f + "'", float1 == 5.999999f);
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.5845633E30f, (float) (-20));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845633E30f + "'", float2 == 1.5845633E30f);
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 3071.9998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3072.0d + "'", double1 == 3072.0d);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.31321994264556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        int int1 = org.apache.commons.math3.util.FastMath.round(3071.9998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3072 + "'", int1 == 3072);
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.126610105220086E-39d, (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.471710130960498E228d + "'", double2 == 3.471710130960498E228d);
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.0073385494569225725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000269272749114d + "'", double1 == 1.0000269272749114d);
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        int int2 = org.apache.commons.math3.util.FastMath.min(5, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.5063656411097466d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48689816668285923d) + "'", double1 == (-0.48689816668285923d));
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.778151250383644d, 0.9182846632869422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06413302264162797d) + "'", double2 == (-0.06413302264162797d));
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        double double2 = org.apache.commons.math3.util.FastMath.log(9.536744300927985E-7d, (double) 4.7683733E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0499999832316724d + "'", double2 == 1.0499999832316724d);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1500624.3457795258d, (double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1500624.3457795258d + "'", double2 == 1500624.3457795258d);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.991641660703783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.59231792902837d + "'", double1 == 73.59231792902837d);
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5209980537883248d, 2.3841857910156255E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000999848258d + "'", double2 == 1.0000000999848258d);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 85);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.2207031E-4f, 6.037091348628667E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2207031249999999E-4d + "'", double2 == 1.2207031249999999E-4d);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 10L, (-1024));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 5.0000005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.29243176689515d + "'", double1 == 2.29243176689515d);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(39.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6806784082777886d + "'", double1 == 0.6806784082777886d);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.4731873725534812d), (-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8414709848078965d) + "'", double2 == (-0.8414709848078965d));
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.037091348627933E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999998178d + "'", double1 == 0.9999999999998178d);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.000004f + "'", float1 == 35.000004f);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(66.44679360118879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) '4', (float) 1023);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.6532181001114764E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.75229574078433d + "'", double1 == 38.75229574078433d);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.9934325699263659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8767220797745886d) + "'", double1 == (-0.8767220797745886d));
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.5991879441440995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.1511132905840549d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1511132905840549d + "'", double2 == 1.1511132905840549d);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.01968878488836084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7057810859219986d) + "'", double1 == (-1.7057810859219986d));
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 127L, (-34));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.392373E-9f + "'", float2 == 7.392373E-9f);
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.220703128031649E-4d, 100.99797342105242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.99797342105242d + "'", double2 == 100.99797342105242d);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        int int2 = org.apache.commons.math3.util.FastMath.max(5, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.3925448875977896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.491165328790636d + "'", double1 == 22.491165328790636d);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5209980537883248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2063546836314982d + "'", double1 == 1.2063546836314982d);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2.6754111826338143d), 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.8634010859072955E41d) + "'", double2 == (-2.8634010859072955E41d));
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.7182816124294233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132616294189077d + "'", double1 == 1.3132616294189077d);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.25594028828308524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22581180448153443d) + "'", double1 == (-0.22581180448153443d));
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.80038650342911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0304351312815117d + "'", double1 == 1.0304351312815117d);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-63L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-62.999996f) + "'", float1 == (-62.999996f));
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500627E-16d + "'", double1 == 4.440892098500627E-16d);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.234360538610421d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        float float2 = org.apache.commons.math3.util.FastMath.max(749.9999f, (-0.99999994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.9999f + "'", float2 == 749.9999f);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        long long2 = org.apache.commons.math3.util.FastMath.min(230L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.276858964458208d + "'", double1 == 4.276858964458208d);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        double double1 = org.apache.commons.math3.util.FastMath.tan(5.8460065493236117E48d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.874875480886718d + "'", double1 == 10.874875480886718d);
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.4950732694200756E-19d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.953601409492212E10d + "'", double2 == 3.953601409492212E10d);
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(48000.0f, (double) 3072.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47999.996f + "'", float2 == 47999.996f);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-29.012614126025312d), 2.782135461917777E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.012614126025312d + "'", double2 == 29.012614126025312d);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8.49495711583675E13d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        double double2 = org.apache.commons.math3.util.FastMath.max(44.0d, (double) 1.0842023E-19f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.0d + "'", double2 == 44.0d);
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.007570773924451899d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1024L, 57.29577951308232d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.99994f + "'", float2 == 1023.99994f);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        float float1 = org.apache.commons.math3.util.FastMath.abs(512.49994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 512.49994f + "'", float1 == 512.49994f);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 512.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.996833390848202d) + "'", double1 == (-0.996833390848202d));
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-49.83704065529883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4154539484374528d + "'", double1 == 0.4154539484374528d);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.80143985E16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999999958776927d, 1.5694629941431792d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999935301913d + "'", double2 == 0.9999999935301913d);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.9843788128357573d, 1.0909305359822086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.984378812835757d + "'", double2 == 2.984378812835757d);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.31622776601683805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32152464392844765d) + "'", double1 == (-0.32152464392844765d));
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.802596928649635E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4098953577674319E-15d + "'", double1 == 1.4098953577674319E-15d);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 47999.996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 38, (long) 106);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106L + "'", long2 == 106L);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.29807406E33f, (float) (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-14.0f) + "'", float2 == (-14.0f));
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(100.00001f, (-1024));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0E200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-127));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-126.99999f) + "'", float1 == (-126.99999f));
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 112L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 112.00001f + "'", float1 == 112.00001f);
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-14));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1367372182078336d + "'", double1 == 0.1367372182078336d);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-57.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.736275386267657d) + "'", double1 == (-4.736275386267657d));
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.0024883905848449408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00248838801679664d + "'", double1 == 0.00248838801679664d);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.405955456193999d + "'", double1 == 1.405955456193999d);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0033808812856155d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (float) 39L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.1029798377113775d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(66.44679360118879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.050338712741454d + "'", double1 == 4.050338712741454d);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-38));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.08648169657722073d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7262340257027773d, (double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.27376591469257794d) + "'", double2 == (-0.27376591469257794d));
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(35.000004f, (double) 2.19902312E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000008f + "'", float2 == 35.000008f);
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.0000002f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0000002f + "'", float2 == 2.0000002f);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9735525863233839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866876842868689d + "'", double1 == 0.9866876842868689d);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        long long2 = org.apache.commons.math3.util.FastMath.min(35L, (-14L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14L) + "'", long2 == (-14L));
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.1368887786267312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.141491290551085E-6d, (-3.137566414384587E306d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.856115509710435E-13d, 0.04402615488638885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.856115509710436E-13d + "'", double2 == 4.856115509710436E-13d);
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9605905730125122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7445401778338758d + "'", double1 == 0.7445401778338758d);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.9999999403953552d), (-0.48689816668285923d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1122363532585344d + "'", double2 == 1.1122363532585344d);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5.729577951308233E21d, 2.9351525542706054d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.729577951308231E21d + "'", double2 == 5.729577951308231E21d);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(11.548739357257748d, 0.8573168196649732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4966975745298134d + "'", double2 == 1.4966975745298134d);
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        int int2 = org.apache.commons.math3.util.FastMath.max((-44), 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.1597153257338444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7513003742396658d + "'", double1 == 1.7513003742396658d);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.013462217145168067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3862943611198906d + "'", double1 == 1.3862943611198906d);
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.298342365610589d, (double) (-126.99999f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.11046571371325d + "'", double2 == 127.11046571371325d);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.636436139626906d, 3.471710130960498E228d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.103515628789562E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.103701897094335E-5d + "'", double1 == 6.103701897094335E-5d);
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0d + "'", double1 == 750.0d);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.817120640969395d, (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.028392510015146796d + "'", double2 == 0.028392510015146796d);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.8460065493236117E48d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 112.28984325071114d + "'", double1 == 112.28984325071114d);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.81474976710656E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12949601773888192d + "'", double1 == 0.12949601773888192d);
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-6.000001f), 74.3898917758609d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0000005f) + "'", float2 == (-6.0000005f));
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.1367372182078336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13631466637301434d + "'", double1 == 0.13631466637301434d);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.2246467991473535E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.63870901270898d) + "'", double1 == (-36.63870901270898d));
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.3021117240420959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-16.628369761528415d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        int int2 = org.apache.commons.math3.util.FastMath.max(3072, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.137998254238577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7598699960630332d + "'", double1 == 0.7598699960630332d);
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 3072, (long) (-14));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14L) + "'", long2 == (-14L));
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(7.7371252E25f, 2.9999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.7371252E25f + "'", float2 == 7.7371252E25f);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.29971680358919567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29105342757312413d + "'", double1 == 0.29105342757312413d);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        long long2 = org.apache.commons.math3.util.FastMath.max(5L, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.5223347012340139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009116460333954432d + "'", double1 == 0.009116460333954432d);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.02042970020377229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(35.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-2.23912643706564d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(20.049877523736615d, (double) 46);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.049877523736615d + "'", double2 == 20.049877523736615d);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.4449632606147725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4304247186494576d + "'", double1 == 0.4304247186494576d);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        int int2 = org.apache.commons.math3.util.FastMath.max(6000, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6000 + "'", int2 == 6000);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8416713321019201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.1808787385219026E67d, 44.29429222643544d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.29429222643544d + "'", double2 == 44.29429222643544d);
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857801796104d + "'", double1 == 9.848857801796104d);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.5707963267876206d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.0075707739244519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0075995046923094d + "'", double1 == 1.0075995046923094d);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.13533528323661265d, (-1.4012984643248174E-45d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13533528323661265d + "'", double2 == 0.13533528323661265d);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.13158548711983195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13158548711983198d + "'", double1 == 0.13158548711983198d);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(8.49495711583675E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.07307891586857d + "'", double1 == 32.07307891586857d);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(8.881785E-16f, 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4210856E-14f + "'", float2 == 1.4210856E-14f);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.853230586269599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3472175051613533d + "'", double1 == 2.3472175051613533d);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.3472175051613533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.456434234561673d + "'", double1 == 9.456434234561673d);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.8774718E-37f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-121) + "'", int1 == (-121));
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.7976931348623157E308d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.3978953594960317d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.97480452983425E36d + "'", double2 == 6.97480452983425E36d);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.0073385494569225725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2808185034374068E-4d) + "'", double1 == (-1.2808185034374068E-4d));
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        float float2 = org.apache.commons.math3.util.FastMath.min(37.0f, 0.015625f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.015625f + "'", float2 == 0.015625f);
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.0877197964243557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(74.38989177586092d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.38989177586092d + "'", double2 == 74.38989177586092d);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5777218104420236E-30d + "'", double1 == 1.5777218104420236E-30d);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.010518784647500397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010518784647500399d + "'", double1 == 0.010518784647500399d);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.856115509710435E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.8414443782266199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.42077103379809366d), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.21038551689904683d) + "'", double2 == (-0.21038551689904683d));
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-49.17253568793199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1332635352315577E21d) + "'", double1 == (-1.1332635352315577E21d));
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.267909768656307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.5662961598647253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.7057810859219986d), (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013951266784050122d + "'", double2 == 0.013951266784050122d);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.21038551689904683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-750.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(17.872173670950808d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.000000001862645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000006208816d + "'", double1 == 1.0000000006208816d);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        double double1 = org.apache.commons.math3.util.FastMath.atan(13.7356002949948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4981210310577606d + "'", double1 == 1.4981210310577606d);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.141592653589793d, 17.854718247901992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1025L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1025L + "'", long1 == 1025L);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.6286665988545064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.252646034500078d + "'", double1 == 16.252646034500078d);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 9.0f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9216.0d + "'", double2 == 9216.0d);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(36.01102806275612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.011028062756125d + "'", double1 == 36.011028062756125d);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.75000006f, 0.636436139626906d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.75f + "'", float2 == 0.75f);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0842022E-19f, 1.2664005294302818d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842023E-19f + "'", float2 == 1.0842023E-19f);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        double double1 = org.apache.commons.math3.util.FastMath.acos(108.43494882292201d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.0000000000291038d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 85, 4.7683733E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7683733E-7f + "'", float2 == 4.7683733E-7f);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.23632416484367985d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.702986674926819d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8178612782693988d) + "'", double1 == (-0.8178612782693988d));
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9975054538602377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1713555603103292d + "'", double1 == 1.1713555603103292d);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        double double1 = org.apache.commons.math3.util.FastMath.rint(32.07307891586857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-37.999996f), (-2.0964636728249658E-8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-37.999996185302734d) + "'", double2 == (-37.999996185302734d));
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.960170286650366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5733804803696215d + "'", double1 == 0.5733804803696215d);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (double) (-127.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.0d + "'", double2 == 127.0d);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-750.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-749.9999999999999d) + "'", double1 == (-749.9999999999999d));
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        double double2 = org.apache.commons.math3.util.FastMath.pow(17.76076974417489d, 0.8865094960340845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.813262883197634d + "'", double2 == 12.813262883197634d);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.0016997123712174172d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 20);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 20L + "'", long1 == 20L);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 7.7371252E25f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07074546404006221d) + "'", double1 == (-0.07074546404006221d));
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5342424578144773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03654572906696694d + "'", double1 == 0.03654572906696694d);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 22026L, 0.31358451852720004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.999999999996d + "'", double2 == 22025.999999999996d);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-7.224719895935548d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9738671125025468d + "'", double1 == 0.9738671125025468d);
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.21991180375937056d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7925203868835002d + "'", double1 == 1.7925203868835002d);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.015625002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.015625002f + "'", float1 == 0.015625002f);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 7.629395E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0027621360286460735d + "'", double1 == 0.0027621360286460735d);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3258176636680326d + "'", double1 == 1.3258176636680326d);
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.6625659571216381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7973736912471375d + "'", double1 == 0.7973736912471375d);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        long long2 = org.apache.commons.math3.util.FastMath.max(5L, (long) (-14));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.6469779601696886E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6469779601696886E-23d + "'", double1 == 2.6469779601696886E-23d);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.5353836659458734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5353836659458734d + "'", double1 == 0.5353836659458734d);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5597471089165569d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5597471089165569d + "'", double2 == 1.5597471089165569d);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.1626899390303921E-17d), 0.9893581078632866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1626899390303921E-17d) + "'", double2 == (-1.1626899390303921E-17d));
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-20));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 20L + "'", long1 == 20L);
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        double double2 = org.apache.commons.math3.util.FastMath.min(17.854718247901992d, 9.013560982203286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.013560982203286d + "'", double2 == 9.013560982203286d);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017485284275232642d + "'", double1 == 0.0017485284275232642d);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(48000.0f, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 24000.0f + "'", float2 == 24000.0f);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.37438953472E11d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-29));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1024.0001220703127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.93244801066549d + "'", double1 == 6.93244801066549d);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.6493713266343334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2775537824944787d + "'", double1 == 2.2775537824944787d);
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9983465473243199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05751362495359344d + "'", double1 == 0.05751362495359344d);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9735692101318192d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.14748365E9f, 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0368744E13f + "'", float2 == 7.0368744E13f);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.1029798377113775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09801546060418229d + "'", double1 == 0.09801546060418229d);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9943589486530622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.934003745760645d + "'", double1 == 2.934003745760645d);
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        int int2 = org.apache.commons.math3.util.FastMath.max(3072, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3072 + "'", int2 == 3072);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.018864831372454823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26620587907525334d + "'", double1 == 0.26620587907525334d);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.02042970020377229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020431121366449895d + "'", double1 == 0.020431121366449895d);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.491826999074709E93d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-63.0d), 0.8344632077604134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 63.0d + "'", double2 == 63.0d);
    }
}

