package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

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
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7567144400243719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.35654371000197d + "'", double1 == 43.35654371000197d);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8511351556504899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014855110845575469d + "'", double1 == 0.014855110845575469d);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.846254174356267d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        double double1 = org.apache.commons.math.util.FastMath.tan(72.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26241737750193517d) + "'", double1 == (-0.26241737750193517d));
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.103676392483125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1036763924831257d + "'", double1 == 2.1036763924831257d);
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        int int2 = org.apache.commons.math.util.FastMath.max((-90), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9181093036277246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6073233140217708d + "'", double1 == 0.6073233140217708d);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        float float1 = org.apache.commons.math.util.FastMath.abs((-36.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.04317538255671398d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5630629629813295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19397647253269037d + "'", double1 == 0.19397647253269037d);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4029365680925863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9859446003833401d + "'", double1 == 0.9859446003833401d);
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        double double1 = org.apache.commons.math.util.FastMath.acos(16.675653009906092d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.49602575992282094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1255639071109433d + "'", double1 == 1.1255639071109433d);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7185746547661834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.013565423875754837d, (-0.5944359846634683d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013565423875754835d + "'", double2 == 0.013565423875754835d);
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.99598501395558d), (-87.99999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.99598501395558d) + "'", double2 == (-0.99598501395558d));
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        double double1 = org.apache.commons.math.util.FastMath.atan((-179.76717759904133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.56523363343332d) + "'", double1 == (-1.56523363343332d));
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8628069656298388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.708062067639405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.589992677140112d + "'", double1 == 2.589992677140112d);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.04599315997198159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21446015940491509d + "'", double1 == 0.21446015940491509d);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2532779128893359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021873826022441593d + "'", double1 == 0.021873826022441593d);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6631489452679061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6222158204326224d + "'", double1 == 0.6222158204326224d);
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8282265872414869d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9262160379374064d) + "'", double1 == (-0.9262160379374064d));
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.940021456376382d + "'", double1 == 0.940021456376382d);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        double double1 = org.apache.commons.math.util.FastMath.ceil(31.98437118343895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1003.824730229931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.683193182347182d + "'", double1 == 31.683193182347182d);
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8816105979527297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7072252667936778d + "'", double1 == 0.7072252667936778d);
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1938123060184203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4982863982470431d + "'", double1 == 1.4982863982470431d);
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.45639522978117497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.149520456364744d + "'", double1 == 26.149520456364744d);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.4177144927409673d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.12619156847664464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12619156847664464d + "'", double1 == 0.12619156847664464d);
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8958467800237574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.09155734763161848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09142991074349947d + "'", double1 == 0.09142991074349947d);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9833476282002843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9944181098753062d + "'", double1 == 0.9944181098753062d);
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.5528752701066448d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02710278633615723d) + "'", double1 == (-0.02710278633615723d));
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0133237292727024d, (-4.277023171696393d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0133237292727024d + "'", double2 == 1.0133237292727024d);
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.05929642259399588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9424273709832203d + "'", double1 == 0.9424273709832203d);
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5101770449416689d, 1.0761361354023782d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.48469430157573956d + "'", double2 == 0.48469430157573956d);
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.101088875655695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.087745443876415d + "'", double1 == 63.087745443876415d);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.3945753355078114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-137.19906045072068d) + "'", double1 == (-137.19906045072068d));
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-36));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6583966420468889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7186865470709461d + "'", double1 == 0.7186865470709461d);
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.010176922302104893d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7678918407989204d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.446339936306401d + "'", double1 == 2.446339936306401d);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.07695912379014387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9970401079464968d + "'", double1 == 0.9970401079464968d);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3153223623952687d + "'", double1 == 0.3153223623952687d);
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.47100149383084566d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-26.986397740864536d) + "'", double1 == (-26.986397740864536d));
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.22612470361587986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7976186295363398d + "'", double1 == 0.7976186295363398d);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.540345878732046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3329722006465774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8471430772574462d + "'", double1 == 0.8471430772574462d);
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9262844623833826d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.7659219106381588E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(97.00000000000009d, 0.656559119563622d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00000000000007d + "'", double2 == 97.00000000000007d);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5071961149184759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7121770249863976d + "'", double1 == 0.7121770249863976d);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7887367149835787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9924642824645422d + "'", double1 == 0.9924642824645422d);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        double double1 = org.apache.commons.math.util.FastMath.acosh(68.78828177486824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.924127750058071d + "'", double1 == 4.924127750058071d);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7854054613844521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8028961524453898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.34001264921737d + "'", double1 == 1.34001264921737d);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.031814983519345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013601830198002032d + "'", double1 == 0.013601830198002032d);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8895257804916458d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41085053990380177d + "'", double1 == 0.41085053990380177d);
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6109592601276898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5736534520715902d + "'", double1 == 0.5736534520715902d);
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.141592653589793d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(89.99479755129386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.481318395714323d + "'", double1 == 4.481318395714323d);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.354638711533299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9377720080115177d + "'", double1 == 0.9377720080115177d);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.11293707858645427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1124593530822633d) + "'", double1 == (-0.1124593530822633d));
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.04298093908493936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.042994173860011545d) + "'", double1 == (-0.042994173860011545d));
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.98714636101983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4710002483851392d + "'", double1 == 1.4710002483851392d);
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7491363778558697d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.025588702964313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5185956241330958d + "'", double1 == 0.5185956241330958d);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 90.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.102016471589204E38d + "'", double1 == 6.102016471589204E38d);
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1559734442091005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0495004257518756d + "'", double1 == 1.0495004257518756d);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5015733900925633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4808057243204342d + "'", double1 == 0.4808057243204342d);
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9821279356034003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3385886465842725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29161581008880105d + "'", double1 == 0.29161581008880105d);
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6807178123186235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7771211630872612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1452603749664034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14629076512480024d + "'", double1 == 0.14629076512480024d);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.013777192971961798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013776321350335262d + "'", double1 == 0.013776321350335262d);
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9878500592531264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9959335057909142d + "'", double1 == 0.9959335057909142d);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9917694073609294d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.011881162631163577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011881442161300177d) + "'", double1 == (-0.011881442161300177d));
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        double double1 = org.apache.commons.math.util.FastMath.floor(63.11868704625112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.0d + "'", double1 == 63.0d);
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.10955796484928033d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10955796484928033d + "'", double1 == 0.10955796484928033d);
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.6906127689845d + "'", double1 == 5557.6906127689845d);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.934717325643677d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.77825917016148d + "'", double1 == 2.77825917016148d);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9389941379013969d + "'", double1 == 0.9389941379013969d);
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5961815394648626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.561486853160206d) + "'", double1 == (-0.561486853160206d));
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7621213855082706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7621213855082707d + "'", double1 == 0.7621213855082707d);
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7820302396610385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.3818004626805414d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2511260027859388d + "'", double1 == 0.2511260027859388d);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3050608935997049E-54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3050608935997049E-54d + "'", double1 == 1.3050608935997049E-54d);
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4645742898914677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4338050377373402d + "'", double1 == 0.4338050377373402d);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8402937512824985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.222172151496141d) + "'", double1 == (-1.222172151496141d));
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0964562107599607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8895943182893177d + "'", double1 == 0.8895943182893177d);
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3649245612979685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7146077110619771d + "'", double1 == 0.7146077110619771d);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6920481310503407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.65143712910102d + "'", double1 == 39.65143712910102d);
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1022931929401623d, (-0.6865874069985795d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.127863827496728d + "'", double2 == 2.127863827496728d);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7257717102239228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.758640818485757d + "'", double1 == 0.758640818485757d);
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5245506190419055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0948410127421968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9468721594070478d + "'", double1 == 0.9468721594070478d);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        long long1 = org.apache.commons.math.util.FastMath.abs((-34L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        int int1 = org.apache.commons.math.util.FastMath.abs(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-33));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-33) + "'", int1 == (-33));
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.17366404762497195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17280275811959592d + "'", double1 == 0.17280275811959592d);
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.978407872665517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1458.6415109709478d + "'", double1 == 1458.6415109709478d);
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-87.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.11083319553050024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11060642241482772d + "'", double1 == 0.11060642241482772d);
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 7, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6046662390891797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6493467552541646d + "'", double1 == 0.6493467552541646d);
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.24282050753856244d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        double double1 = org.apache.commons.math.util.FastMath.exp(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2949672939999967E9d + "'", double1 == 4.2949672939999967E9d);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.0732178989295803E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        int int2 = org.apache.commons.math.util.FastMath.min(6, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.12585691605953508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12519657666689096d) + "'", double1 == (-0.12519657666689096d));
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2865192714065222E297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(33.76335528887579d, 0.7893750108307105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.763355288875786d + "'", double2 == 33.763355288875786d);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.7159162242099002d), 1.0001522971108041d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0001522971108041d + "'", double2 == 1.0001522971108041d);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.48379177581104366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4666679623365474d + "'", double1 == 0.4666679623365474d);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7683757985702275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2092743864724302d + "'", double1 == 1.2092743864724302d);
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 90, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6222158204326224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01085971472454707d + "'", double1 == 0.01085971472454707d);
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6532070891002518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        long long1 = org.apache.commons.math.util.FastMath.round(52.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        double double1 = org.apache.commons.math.util.FastMath.acos(68.78828177486824d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7567144400243719d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7451749797335945d, 16.90472564327378d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006927252325971711d + "'", double2 == 0.006927252325971711d);
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9959335057909142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.098042944007236d + "'", double1 == 3.098042944007236d);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.743980336957493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9593355397176575d + "'", double1 == 0.9593355397176575d);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0865078793721343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.036032880178338736d + "'", double1 == 0.036032880178338736d);
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.1587235990851068d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4359888346861434d) + "'", double1 == (-1.4359888346861434d));
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.876827152556707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.230201256551786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1211238507984955d + "'", double1 == 2.1211238507984955d);
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.22913468643648427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        int int2 = org.apache.commons.math.util.FastMath.min(5507, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999999507776568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999983592552d + "'", double1 == 0.999999983592552d);
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        long long1 = org.apache.commons.math.util.FastMath.round(0.005202425297685839d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.8916039409537213d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567780803774d + "'", double1 == 0.027415567780803774d);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        double double1 = org.apache.commons.math.util.FastMath.sinh(13.188688139030402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 267143.4231367569d + "'", double1 == 267143.4231367569d);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5982251431131134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5982251431131133d) + "'", double1 == (-0.5982251431131133d));
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.40834357456474796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9802576824651943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4917890846793802d + "'", double1 == 1.4917890846793802d);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.405819438223506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9864221511889272d + "'", double1 == 0.9864221511889272d);
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1016289084929765d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.49713280602321935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6440008374361093d + "'", double1 == 1.6440008374361093d);
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8294016629382825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6924134550140497d) + "'", double1 == (-0.6924134550140497d));
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9735760889955918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1348325233605374d + "'", double1 == 1.1348325233605374d);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37960773902752176d + "'", double1 == 0.37960773902752176d);
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.019744903665106207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7045449808342412d) + "'", double1 == (-1.7045449808342412d));
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0000000000000002d, 0.8414709825806045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8414709825806045d + "'", double2 == 0.8414709825806045d);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3552527156068805E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3552527156068805E-20d + "'", double1 == 1.3552527156068805E-20d);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.37242622246109275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.7615790383433858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.10642219731928483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1066231951384488d + "'", double1 == 0.1066231951384488d);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.832346142004121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7395126930984062d + "'", double1 == 0.7395126930984062d);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.04298093908493936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.14604584158491757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8347789329832497d + "'", double1 == 0.8347789329832497d);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6180780088437617d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.345524211214144d, 1.0172993018445189d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1615635294505589d + "'", double2 == 1.1615635294505589d);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        double double1 = org.apache.commons.math.util.FastMath.ceil(56.72239180482502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8766799477951029d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41616230115754416d + "'", double1 == 0.41616230115754416d);
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2968014097523634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2926080088071162d + "'", double1 == 0.2926080088071162d);
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.002094025184076574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0020940267144425725d) + "'", double1 == (-0.0020940267144425725d));
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.010177097973226868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5667290388147144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5667290388147144d + "'", double1 == 0.5667290388147144d);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7854054613844521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0593252184584299d + "'", double1 == 1.0593252184584299d);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.42586106506619514d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9106833602395891d + "'", double1 == 0.9106833602395891d);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9882684920925461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6865786105735532d + "'", double1 == 1.6865786105735532d);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.35049754306911085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7050636517276735d + "'", double1 == 0.7050636517276735d);
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.037010624154675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0006849713335002d + "'", double1 == 1.0006849713335002d);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6416439271862104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9124034991009714d + "'", double1 == 0.9124034991009714d);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2230306629577952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3525448752949314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9762775423515465d + "'", double1 == 0.9762775423515465d);
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2785049464395442d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.009256104707412106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009213398835148425d) + "'", double1 == (-0.009213398835148425d));
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.07998601188716E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079573806109243E-5d + "'", double1 == 9.079573806109243E-5d);
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.568021819492507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2319121888608562d + "'", double1 == 1.2319121888608562d);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        double double1 = org.apache.commons.math.util.FastMath.log(0.022920741006617788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.7757130575265396d) + "'", double1 == (-3.7757130575265396d));
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8323541239940268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07969186436297289d) + "'", double1 == (-0.07969186436297289d));
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.1503666979359498d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.10271662614180668d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0017927433227146066d) + "'", double1 == (-0.0017927433227146066d));
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9651860437766335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.23012809149401298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2343247169751904d + "'", double1 == 0.2343247169751904d);
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        double double1 = org.apache.commons.math.util.FastMath.asinh(46.30686372341393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.528553941618304d + "'", double1 == 4.528553941618304d);
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.692617836018588d, 630998.4197775755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.8645906008931825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.041063771711722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7134711286662471d + "'", double1 == 0.7134711286662471d);
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (long) (-33));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(56.21601340753473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3220.9403093025894d + "'", double1 == 3220.9403093025894d);
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2), (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.11543848214209212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.208405400842924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.935051887835441d + "'", double1 == 0.935051887835441d);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.15443469003188384E17d + "'", double1 == 2.15443469003188384E17d);
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        double double1 = org.apache.commons.math.util.FastMath.cos(1063.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4160646042967595d + "'", double1 == 0.4160646042967595d);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.46904838772645735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4882129761941369d + "'", double1 == 0.4882129761941369d);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9762775423515465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5156335679188826d + "'", double1 == 1.5156335679188826d);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(34.237502387897734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.23750238789774d + "'", double1 == 34.23750238789774d);
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        double double1 = org.apache.commons.math.util.FastMath.cos((-2.4917798526449118d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7961970749229427d) + "'", double1 == (-0.7961970749229427d));
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.991318745538845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.258095456729151d + "'", double1 == 1.258095456729151d);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        double double1 = org.apache.commons.math.util.FastMath.acos(22026.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8337177321043896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7587814125971685d + "'", double1 == 0.7587814125971685d);
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.359770220129362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3073157296860899d + "'", double1 == 0.3073157296860899d);
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9172275689967649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4509843154289277d + "'", double1 == 1.4509843154289277d);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.04747861379422898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04744298624177905d + "'", double1 == 0.04744298624177905d);
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(43.1284181946612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2471.076339629316d + "'", double1 == 2471.076339629316d);
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2522067798460872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6060903200124745d + "'", double1 == 1.6060903200124745d);
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5729063682998855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.756905785616602d + "'", double1 == 0.756905785616602d);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9442157056960552d, 0.017454178629595234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.998998620741038d + "'", double2 == 0.998998620741038d);
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        double double2 = org.apache.commons.math.util.FastMath.pow(63.087745443876415d, 2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19099.184266826574d + "'", double2 == 19099.184266826574d);
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        double double1 = org.apache.commons.math.util.FastMath.log(0.19736244536848485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6227134164421493d) + "'", double1 == (-1.6227134164421493d));
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9978031084482193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4063799899026184d + "'", double1 == 3.4063799899026184d);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.006768150309340383d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0067911581109159295d) + "'", double1 == (-0.0067911581109159295d));
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.3423042232497897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5304588276885431d + "'", double1 == 1.5304588276885431d);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.1162228941264076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9960784226512511d + "'", double1 == 0.9960784226512511d);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3220.9403093025894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.199239450742893d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.050505149493486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.050505149493486d + "'", double1 == 1.050505149493486d);
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        double double1 = org.apache.commons.math.util.FastMath.log(9.079985974456667E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.306852817021582d) + "'", double1 == (-9.306852817021582d));
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.710505431213761E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(22026.465794806718d, 1.4390113332958665d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22026.465794806714d + "'", double2 == 22026.465794806714d);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5873510240640394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9506345816930187d + "'", double1 == 0.9506345816930187d);
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        double double2 = org.apache.commons.math.util.FastMath.min(4.924127750058071d, 0.7523615947576159d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7523615947576159d + "'", double2 == 0.7523615947576159d);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3132565042068824d, 1.5596856707919322d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3132565042068824d + "'", double2 == 1.3132565042068824d);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.045699465809971355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04566767881511902d) + "'", double1 == (-0.04566767881511902d));
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.8645906008931825d), (-295452.57150105695d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8645906008931827d) + "'", double2 == (-1.8645906008931827d));
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7975453910589408d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025172003637337723d + "'", double1 == 0.025172003637337723d);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9859446003833401d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8511351556504899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7051527115392973d + "'", double1 == 0.7051527115392973d);
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.30642979586841934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6741817581261829d) + "'", double1 == (-0.6741817581261829d));
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8089563172728975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09207492916589416d) + "'", double1 == (-0.09207492916589416d));
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5467447399008167d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.013659550437909718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4219732045494788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.952027174244469d + "'", double1 == 1.952027174244469d);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.2028882366758453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02099436026350231d) + "'", double1 == (-0.02099436026350231d));
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9852288378766421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.449454264910415d + "'", double1 == 56.449454264910415d);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        long long2 = org.apache.commons.math.util.FastMath.min(108L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.06820006471439112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-31.191623125197538d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        double double1 = org.apache.commons.math.util.FastMath.exp((-5.124738597288385E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994876574325707d + "'", double1 == 0.9994876574325707d);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-31.17011361997944d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893698d) + "'", double1 == (-0.5440211108893698d));
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        double double2 = org.apache.commons.math.util.FastMath.max(2.3402145963603704d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3402145963603704d + "'", double2 == 2.3402145963603704d);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6361176917519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6361176917519d + "'", double1 == 0.6361176917519d);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.724498129545357d, (-0.5878687580950963d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.208592005262939d + "'", double2 == 1.208592005262939d);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.0901975935206452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        double double1 = org.apache.commons.math.util.FastMath.floor(57.14100608410312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8948825727293745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5412093449191896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5177636638341364d) + "'", double1 == (-0.5177636638341364d));
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        double double2 = org.apache.commons.math.util.FastMath.min(0.770924277655677d, 0.7243120906228638d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7243120906228638d + "'", double2 == 0.7243120906228638d);
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.56340880499775d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9164145587216197d, (-0.009213529184899944d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.009213529184899944d) + "'", double2 == (-0.009213529184899944d));
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8014654691351221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7183763224160971d + "'", double1 == 0.7183763224160971d);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6516488549852545E98d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4857089771942523d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9479821497841773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9736437489062297d + "'", double1 == 0.9736437489062297d);
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6723083385899451d, 0.004063517469127154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5647522726684346d + "'", double2 == 1.5647522726684346d);
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.011881162631163579d), (-43.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.04039798099032E82d) + "'", double2 == (-6.04039798099032E82d));
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 7L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2022162221140908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0633123578142891d + "'", double1 == 1.0633123578142891d);
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.2490457723982544d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.465735902799727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5071961149184759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5319282579302229d + "'", double1 == 0.5319282579302229d);
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0229280659655783d, (-0.008491621659255943d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9254922130248633d + "'", double2 == 1.9254922130248633d);
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000085819143139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000085819143139d + "'", double1 == 1.0000085819143139d);
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.12873439758804212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1283791160097205d) + "'", double1 == (-0.1283791160097205d));
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-5.2464206048444835d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3596546076558127d) + "'", double1 == (-2.3596546076558127d));
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.3368086899420177E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.585445079827193E-10d + "'", double1 == 6.585445079827193E-10d);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.5528752701066448d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) ' ', 0.1450554729350647d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6532184445134213d + "'", double2 == 1.6532184445134213d);
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38186809209174843d + "'", double1 == 0.38186809209174843d);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.101088875655695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.079985949503008E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000090803981927d + "'", double1 == 1.000090803981927d);
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5590814204345168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9775188478584872d + "'", double1 == 0.9775188478584872d);
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 36L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0054029967707723775d, (-0.8211080655056975d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1350126198281596d + "'", double2 == 3.1350126198281596d);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        long long1 = org.apache.commons.math.util.FastMath.round(16.86085826032837d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 17L + "'", long1 == 17L);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 90);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5596856728972892d + "'", double1 == 1.5596856728972892d);
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9607190280136697d, 0.9106833602395891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9641638055990097d + "'", double2 == 0.9641638055990097d);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        double double1 = org.apache.commons.math.util.FastMath.sin(229.1831180523293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15254772534412783d + "'", double1 == 0.15254772534412783d);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.668201510190313d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.615354633267934E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7739153607159681d) + "'", double1 == (-0.7739153607159681d));
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        long long1 = org.apache.commons.math.util.FastMath.round(0.991328918078117d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5059580783195847d, 0.7084452722420731d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7084452722420731d + "'", double2 == 0.7084452722420731d);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.488717734948612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16560936626723188d + "'", double1 == 0.16560936626723188d);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.013787719250806334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9389941379013969d, 0.8347789329832497d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8347789329832497d + "'", double2 == 0.8347789329832497d);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.397041808397797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6776415738141268d + "'", double1 == 0.6776415738141268d);
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36), (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0856069384097307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03567261035491365d + "'", double1 == 0.03567261035491365d);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4566275681581605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.423938653542384d, 1.6060903200124745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4239386535423835d + "'", double2 == 4.4239386535423835d);
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.1307589219114205E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1307588896649874E-4d) + "'", double1 == (-2.1307588896649874E-4d));
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 34L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 34.0f + "'", float1 == 34.0f);
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9067898571222959d), 1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9067898571222958d) + "'", double2 == (-0.9067898571222958d));
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.011983210854855571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01198263731852571d + "'", double1 == 0.01198263731852571d);
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6, 5507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        long long2 = org.apache.commons.math.util.FastMath.min(6013L, (long) (-33));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.010625904569068452d), 0.9179181668776548d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3643741626151842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35675804856959714d + "'", double1 == 0.35675804856959714d);
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        double double2 = org.apache.commons.math.util.FastMath.min(0.014546860357711109d, 0.07352180207555892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014546860357711109d + "'", double2 == 0.014546860357711109d);
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.047067248963123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7315297162371779d + "'", double1 == 1.7315297162371779d);
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9253062643472486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        double double1 = org.apache.commons.math.util.FastMath.log(0.01365785170622981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.293440706151195d) + "'", double1 == (-4.293440706151195d));
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        long long1 = org.apache.commons.math.util.FastMath.round(8.613775297505947d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 802L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        double double2 = org.apache.commons.math.util.FastMath.min(0.35771810361923345d, (-0.12552491762180948d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12552491762180948d) + "'", double2 == (-0.12552491762180948d));
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.116291929305059d), 0.015772404403454655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015772404403454655d + "'", double2 == 0.015772404403454655d);
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.3835707091143927d), (-43.19155203462028d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-43.19155203462028d) + "'", double2 == (-43.19155203462028d));
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.505149978319906d + "'", double1 == 1.505149978319906d);
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        long long1 = org.apache.commons.math.util.FastMath.round(1.535827984130872d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.080810485818935E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.080810473338706E-5d + "'", double1 == 9.080810473338706E-5d);
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.3806633393658063d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1144754686842937d + "'", double1 == 2.1144754686842937d);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        int int2 = org.apache.commons.math.util.FastMath.max(5507, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.5401845586281078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.195756838919679d + "'", double1 == 1.195756838919679d);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3604756670132249d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3604756670132249d + "'", double2 == 0.3604756670132249d);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9647007265430612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.009616414459745d + "'", double1 == 2.009616414459745d);
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5507, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9607387187064872d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        double double2 = org.apache.commons.math.util.FastMath.max(11012.999999999996d, 1.9324784144647662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11012.999999999996d + "'", double2 == 11012.999999999996d);
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 35);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6535124586897125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011405944106938912d + "'", double1 == 0.011405944106938912d);
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1525354798260945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.741022782154216d + "'", double1 == 1.741022782154216d);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.5018027695020755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5044779319962378d + "'", double1 == 1.5044779319962378d);
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.537204015658685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4332738559053477d + "'", double1 == 2.4332738559053477d);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.01745329251994342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998476951563913d + "'", double1 == 0.9998476951563913d);
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0475388422900291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9145923381427385d + "'", double1 == 0.9145923381427385d);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        double double2 = org.apache.commons.math.util.FastMath.min(2.212913171890624d, 0.10955796484928033d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10955796484928033d + "'", double2 == 0.10955796484928033d);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7319013265055243d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.316400181553748d) + "'", double1 == (-1.316400181553748d));
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0533450212094795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.743521917312986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-99.89644735059139d) + "'", double1 == (-99.89644735059139d));
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4320632796393198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007540926806671108d + "'", double1 == 0.007540926806671108d);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6060903200124745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9832900225935894d + "'", double1 == 3.9832900225935894d);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6377640601517166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8922451992629654d + "'", double1 == 1.8922451992629654d);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5490756164177393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8725391511850262d, 0.6865874069985796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9041040508930442d + "'", double2 == 0.9041040508930442d);
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5403025036161081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9388149908366094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8374408889999365d + "'", double1 == 0.8374408889999365d);
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.350250296373916E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3502502963739158E-5d) + "'", double1 == (-1.3502502963739158E-5d));
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.03966067399745926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3410253762829588d + "'", double1 == 0.3410253762829588d);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7006231354388308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3011363260372546d + "'", double1 == 1.3011363260372546d);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9645775706969033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1022931929401623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04229712549613145d + "'", double1 == 0.04229712549613145d);
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 5507);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.613775289262481d + "'", double1 == 8.613775289262481d);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        float float2 = org.apache.commons.math.util.FastMath.min((-90.0f), (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.10475317834218718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10456170333587957d + "'", double1 == 0.10456170333587957d);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.48469430157573956d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6352559049474427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5933835167609286d) + "'", double1 == (-0.5933835167609286d));
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        float float2 = org.apache.commons.math.util.FastMath.min(3.9481478E13f, (float) 37L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0176055895227845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.202551576842064d + "'", double1 == 1.202551576842064d);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0038699713831352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.38186809209174843d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.1591352365493741d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        float float2 = org.apache.commons.math.util.FastMath.min(37.0f, (float) 29L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 29.0f + "'", float2 == 29.0f);
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        double double1 = org.apache.commons.math.util.FastMath.asin(44.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.1124593530822633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0063302204119107d + "'", double1 == 1.0063302204119107d);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.000004865336505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574243910829566d + "'", double1 == 1.5574243910829566d);
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.273561760331577d), 5.438670546795531d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3959575843382047d) + "'", double2 == (-0.3959575843382047d));
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3896127456026699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 7L, 1.0000705818430178d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0d + "'", double2 == 7.0d);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        double double1 = org.apache.commons.math.util.FastMath.sinh(11014.000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.7511679260882128d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-9.306852812898857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.926772007304508d) + "'", double1 == (-2.926772007304508d));
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(50.237955471941575d, 0.5705905238526439d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.23795547194157d + "'", double2 == 50.23795547194157d);
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0850110459822049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0275699290305644d + "'", double1 == 1.0275699290305644d);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1079395657990083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0347577566512203d + "'", double1 == 1.0347577566512203d);
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9999999999999983d), 2.3693300629462564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3993780062099792d) + "'", double2 == (-0.3993780062099792d));
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.07127715650414634d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.694290324463072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15845888697098034d) + "'", double1 == (-0.15845888697098034d));
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.161510274442745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0511733744167922d + "'", double1 == 1.0511733744167922d);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4085654100084491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.409073648516177d + "'", double1 == 23.409073648516177d);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        double double1 = org.apache.commons.math.util.FastMath.log1p(6.414477459402565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0034345023585787d + "'", double1 == 2.0034345023585787d);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3311317153490116d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9999103740052037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853533483917854d) + "'", double1 == (-0.7853533483917854d));
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(11.940141468803501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 684.1197129515763d + "'", double1 == 684.1197129515763d);
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.080398292528045E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000908081057318d + "'", double1 == 1.0000908081057318d);
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.371194766956427d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        int int2 = org.apache.commons.math.util.FastMath.min(33, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2077341857639758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8359985288256988d + "'", double1 == 0.8359985288256988d);
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999999895347724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-17.45973974851091d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.459739748510906d) + "'", double1 == (-17.459739748510906d));
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5262856567377758d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.04229712549613145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.38224104036734E-4d + "'", double1 == 7.38224104036734E-4d);
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        double double1 = org.apache.commons.math.util.FastMath.signum(56.21601340753473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7467135528742425E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.566370614359174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5953181448879166d + "'", double1 == 1.5953181448879166d);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.14773636332088674d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6649659815242346d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011605845791353675d) + "'", double1 == (-0.011605845791353675d));
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7941243666430793d, 0.8966854678967094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7941243666430794d + "'", double2 == 0.7941243666430794d);
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(22025.46579480672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.2318521824d + "'", double1 == 1261966.2318521824d);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9559709842120367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.955970984212037d + "'", double1 == 1.955970984212037d);
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.7735822610963057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7735822610963057d + "'", double1 == 3.7735822610963057d);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        double double2 = org.apache.commons.math.util.FastMath.max(2.7887367149835787d, 0.41884530877048626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7887367149835787d + "'", double2 == 2.7887367149835787d);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8646647167633873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.196231140163579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.012822538313959962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012822889714884954d + "'", double1 == 0.012822889714884954d);
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8939966636005579d), 0.9117659097492966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8939966636005577d) + "'", double2 == (-0.8939966636005577d));
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.12487180307829396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8826100432229077d + "'", double1 == 0.8826100432229077d);
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.44949479120381985d, 0.21178170748056988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1304898565991703d + "'", double2 == 1.1304898565991703d);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(96.11528190732773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6775281307654042d + "'", double1 == 1.6775281307654042d);
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.06558572392439851d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0275699290305644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011811386517645064d + "'", double1 == 0.011811386517645064d);
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1270769738635476d) + "'", double1 == (-0.1270769738635476d));
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.05360906381648784d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05355776652259649d) + "'", double1 == (-0.05355776652259649d));
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 9L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0f + "'", float1 == 9.0f);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3505896985737582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1621487420178873d + "'", double1 == 1.1621487420178873d);
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7578112213568773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030679593441180375d + "'", double1 == 0.030679593441180375d);
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.446339936306401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.627115805918354d + "'", double1 == 1.627115805918354d);
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5161207849481165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8021405098245961d + "'", double1 == 0.8021405098245961d);
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 6013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6013 + "'", int2 == 6013);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8034325040154596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.665951357920044d + "'", double1 == 0.665951357920044d);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5514266812416907d, 1.3440585709080487E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 6013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.634234665783512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.9496302721566d + "'", double1 == 18.9496302721566d);
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        long long2 = org.apache.commons.math.util.FastMath.max(71L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 71L + "'", long2 == 71L);
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(944.8154734160571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.490140834899154d + "'", double1 == 16.490140834899154d);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.4865282353496856d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48652823534968553d) + "'", double1 == (-0.48652823534968553d));
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3080927484239064d, 0.8263364740145374d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3080927484239062d + "'", double2 == 1.3080927484239062d);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.756905785616602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8700033250606586d + "'", double1 == 0.8700033250606586d);
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5965032461018823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.022630443056965113d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.022630443056965113d + "'", double2 == 0.022630443056965113d);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6212147412252023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6212147412252023d + "'", double1 == 0.6212147412252023d);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.99598501395558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08964012059520682d + "'", double1 == 0.08964012059520682d);
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6, (long) (-90));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        double double1 = org.apache.commons.math.util.FastMath.floor((-2.3561944901923444d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9651363175498938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.305963675522467d + "'", double1 == 1.305963675522467d);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        int int2 = org.apache.commons.math.util.FastMath.max(6, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5982251431131133d), 2.0767388768524415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.28046687732159026d) + "'", double2 == (-0.28046687732159026d));
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.830640877860784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        double double1 = org.apache.commons.math.util.FastMath.log10(610.6216028616939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.785772164911324d + "'", double1 == 2.785772164911324d);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.4855215610041086d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22638423669012675d + "'", double1 == 0.22638423669012675d);
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5751415331727446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6127771495623989d + "'", double1 == 0.6127771495623989d);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        double double2 = org.apache.commons.math.util.FastMath.max(0.373743846444029d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.373743846444029d + "'", double2 == 0.373743846444029d);
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6205060806506729d, 1.0000000276592196d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.555361191653509d + "'", double2 == 0.555361191653509d);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.35414242816297d + "'", double1 == 4.35414242816297d);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.43349402349577826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.319130550186172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.869343182858767d + "'", double1 == 1.869343182858767d);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.012055297180161666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012055005199484565d + "'", double1 == 0.012055005199484565d);
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        int int2 = org.apache.commons.math.util.FastMath.max((-90), 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3258176636680326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7652628152693652d + "'", double1 == 2.7652628152693652d);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5577658169136215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.22638463320826d + "'", double1 == 1.22638463320826d);
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3012989023072947d, 0.918131392275503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3012989023072943d + "'", double2 == 2.3012989023072943d);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4556943022324125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9933830721634275d + "'", double1 == 0.9933830721634275d);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.8193451511126453d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        double double1 = org.apache.commons.math.util.FastMath.floor(12.788595248474207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.129071417624954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7080583105044882d + "'", double1 == 1.7080583105044882d);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.7783607304516975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.04317538255671398d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6125374595843227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8739456127896416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.058515593452884325d) + "'", double1 == (-0.058515593452884325d));
    }
}

