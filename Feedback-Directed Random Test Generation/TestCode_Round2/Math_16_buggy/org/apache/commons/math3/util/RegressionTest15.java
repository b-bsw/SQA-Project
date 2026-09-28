package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

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
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.6606133228442809d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        double double2 = org.apache.commons.math3.util.FastMath.log((-36.14246844765979d), 16.252646034500078d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(73.69674459530097d, (double) 2.0282408E32f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 73.69674459530097d + "'", double2 == 73.69674459530097d);
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.4731873725534812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49290533695396277d) + "'", double1 == (-0.49290533695396277d));
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.962109144995424E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.962109144995424E32d + "'", double1 == 1.962109144995424E32d);
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.005159786500818854d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.025145191680879475d, (-0.7764316821660115d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.109218387044385d + "'", double2 == 3.109218387044385d);
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 11014L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.000000000002d + "'", double1 == 11014.000000000002d);
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 1.6077497654366413d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        int int2 = org.apache.commons.math3.util.FastMath.max((-29), 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 14.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.41014226417523d + "'", double1 == 2.41014226417523d);
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.7182816664368272d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.6164048260636456d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6641687893997885d) + "'", double1 == (-0.6641687893997885d));
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.01377146235538802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5570244291020932d + "'", double1 == 1.5570244291020932d);
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.007211420032440578d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007211420032440578d + "'", double2 == 0.007211420032440578d);
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(13.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.000001f + "'", float1 == 13.000001f);
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-6.000001f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-6.0000005f) + "'", float1 == (-6.0000005f));
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1753554136824456d, 1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        float float2 = org.apache.commons.math3.util.FastMath.max(749.9998f, (float) (-17));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.9998f + "'", float2 == 749.9998f);
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 0.0053710933f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0053710933f + "'", float2 == 0.0053710933f);
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-42));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        int int2 = org.apache.commons.math3.util.FastMath.max((-2), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        double double1 = org.apache.commons.math3.util.FastMath.atan(7.31321994264556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4349004398852625d + "'", double1 == 1.4349004398852625d);
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        int int2 = org.apache.commons.math3.util.FastMath.max(3072, 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3072 + "'", int2 == 3072);
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.5707962075856072d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.6812492467611788E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357508E-22d + "'", double1 == 2.1175823681357508E-22d);
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-2045.9999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        int int1 = org.apache.commons.math3.util.FastMath.round(24000.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24000 + "'", int1 == 24000);
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3587246453502182d + "'", double1 == 1.3587246453502182d);
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.82118644197349E-34d, 1.570796044359925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0058456728177067995d) + "'", double2 == (-0.0058456728177067995d));
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.000000000000001d + "'", double1 == 4.000000000000001d);
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.922737656982237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.745236263283738d + "'", double1 == 0.745236263283738d);
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1.80144007E16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8014400656965636E16d + "'", double1 == 1.8014400656965636E16d);
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        long long1 = org.apache.commons.math3.util.FastMath.round((-2.23912643706564d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 14.999999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        int int1 = org.apache.commons.math3.util.FastMath.round(7.392373E-9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(31.910491617380085d, 0.13158548711983195d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.91049161738008d + "'", double2 == 31.91049161738008d);
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 12);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0469529584324009d, 3.813181025133959d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.170598158735594d + "'", double2 == 29.170598158735594d);
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.0000005f, (float) 9223370937343148032L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0000005f + "'", float2 == 4.0000005f);
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.2076478E10f, (-4.8828125E-4f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.8828125E-4f) + "'", float2 == (-4.8828125E-4f));
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 15L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3269017.3724721107d + "'", double1 == 3269017.3724721107d);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        long long2 = org.apache.commons.math3.util.FastMath.max(9223372036854775807L, (long) (-42));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 5.2076478E10f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        double double1 = org.apache.commons.math3.util.FastMath.log10(13.7356002949948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1378476443977752d + "'", double1 == 1.1378476443977752d);
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        int int2 = org.apache.commons.math3.util.FastMath.min(106, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.54742505E26f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.54742505E26f + "'", float1 == 1.54742505E26f);
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-2.290822861412639d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.2207033E-4f, (float) 109);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 109.0f + "'", float2 == 109.0f);
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        int int2 = org.apache.commons.math3.util.FastMath.min(128, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.030084094267563d + "'", double1 == 8.030084094267563d);
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.9527368038560544d, 2.1839570179408234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9296500271102235d + "'", double2 == 2.9296500271102235d);
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-4.50359936E15f), 5.098452070725588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.098452070725588d + "'", double2 == 5.098452070725588d);
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9172908762064605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4510508769333539d + "'", double1 == 1.4510508769333539d);
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 0.9999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.718281504414619d + "'", double1 == 1.718281504414619d);
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-38));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5444866095419745d) + "'", double1 == (-1.5444866095419745d));
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.1691263E29f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.1691265E29f + "'", float1 == 3.1691265E29f);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        double double2 = org.apache.commons.math3.util.FastMath.log(23.472957530972497d, (double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4495975180859562d + "'", double2 == 1.4495975180859562d);
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.09951176E12f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.09951176E12f + "'", float2 == 1.09951176E12f);
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 2.03423776E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04515356978469217d) + "'", double1 == (-0.04515356978469217d));
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-149));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.4390740100324318d, (-0.6036003925924347d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7464043275756789d + "'", double2 == 0.7464043275756789d);
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.209973124492415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.11547140682732d + "'", double1 == 9.11547140682732d);
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        int int2 = org.apache.commons.math3.util.FastMath.max((-11), (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-1024.0f), 6.852374279897447E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1024.0d) + "'", double2 == (-1024.0d));
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.16268839399612045d, 5.8274116272128E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(7.7371252E25f, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.54742505E26f + "'", float2 == 1.54742505E26f);
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.8774718E-37f, 32.000003814697266d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.877472E-37f + "'", float2 == 5.877472E-37f);
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-14L), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0304351312815117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.010043827553259d + "'", double1 == 1.010043827553259d);
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(7.56939756606048E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.25594028828308524d), (-0.6493713266343334d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25594028828308524d) + "'", double2 == (-0.25594028828308524d));
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.953601409492212E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9536014095E10d + "'", double1 == 3.9536014095E10d);
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 51L, (-9.223372E18f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-51.0f) + "'", float2 == (-51.0f));
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        int int1 = org.apache.commons.math3.util.FastMath.round(39.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 3.7778932E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6530981204434476d) + "'", double1 == (-2.6530981204434476d));
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        int int2 = org.apache.commons.math3.util.FastMath.max(15, 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 141 + "'", int2 == 141);
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.11294857116009238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9936280885341204d + "'", double1 == 0.9936280885341204d);
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.1170554140246223d, 1.1331220770383494d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1491887400520766d) + "'", double2 == (-0.1491887400520766d));
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.6738779353175968d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-49));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        double double1 = org.apache.commons.math3.util.FastMath.exp(8.448719238886445E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0008452289287066d + "'", double1 == 1.0008452289287066d);
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.2779131873068914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2804464899342554d) + "'", double1 == (-1.2804464899342554d));
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.60287949E16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.60287949E16f + "'", float1 == 3.60287949E16f);
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.013951266784050122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013951266784050122d + "'", double1 == 0.013951266784050122d);
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.8212977905128216E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951307475d + "'", double1 == 57.29577951307475d);
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-7.9999995f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.013462217145168067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013553240791789689d + "'", double1 == 0.013553240791789689d);
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.94284158531252d + "'", double1 == 104.94284158531252d);
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 192L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 192.00002f + "'", float1 == 192.00002f);
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        int int1 = org.apache.commons.math3.util.FastMath.round(97.000015f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0000269272749114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718355025366619d + "'", double1 == 2.718355025366619d);
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.020431121603772754d, 3.0576995672643544E47d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-5.9029581035870565E20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.9029581035870565E20d) + "'", double1 == (-5.9029581035870565E20d));
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.1765355471794627d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        long long2 = org.apache.commons.math3.util.FastMath.max(750L, (long) (-63));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.5144714273384203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6646152600637135d) + "'", double1 == (-0.6646152600637135d));
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-27.725887222397812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.01583876946393d) + "'", double1 == (-4.01583876946393d));
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.26585954184532E14d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.0000000000000049d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 128L, (-2016.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-128.0f) + "'", float2 == (-128.0f));
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 14L, (float) (-42L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        double double1 = org.apache.commons.math3.util.FastMath.tan(19.608439339962796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9483284583248952d + "'", double1 == 0.9483284583248952d);
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.09834447715602475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001716434927524981d + "'", double1 == 0.001716434927524981d);
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(0.0053710933f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0053710938f + "'", float1 == 0.0053710938f);
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1378476443977752d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-750.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-750L) + "'", long1 == (-750L));
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.14748365E9f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.009850471303251545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 0.013462217145168067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.6423065883854172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.570947820260962d + "'", double1 == 0.570947820260962d);
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        long long2 = org.apache.commons.math3.util.FastMath.max(5L, 74L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 74L + "'", long2 == 74L);
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        long long2 = org.apache.commons.math3.util.FastMath.max(67L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 67L + "'", long2 == 67L);
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        double double1 = org.apache.commons.math3.util.FastMath.log10(237.68018390304016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.375992974827435d + "'", double1 == 2.375992974827435d);
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.010299956639812d, 1.1378476443977752d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.010299956639812d + "'", double2 == 3.010299956639812d);
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        double double2 = org.apache.commons.math3.util.FastMath.min(51.00000000000001d, 27.367864366808018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.367864366808018d + "'", double2 == 27.367864366808018d);
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        double double1 = org.apache.commons.math3.util.FastMath.exp(9.848858576443723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18936.727634511844d + "'", double1 == 18936.727634511844d);
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1025.0000000262442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.015621187574105d + "'", double1 == 32.015621187574105d);
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 44, (-15.749999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-44.0f) + "'", float2 == (-44.0f));
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        double double1 = org.apache.commons.math3.util.FastMath.sin(11.532562594670797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8592532089033494d) + "'", double1 == (-0.8592532089033494d));
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.2676506E30f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2676506E30f + "'", float1 == 1.2676506E30f);
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-26.33959286127792d), 0.925955988934938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.355863609286782d + "'", double2 == 26.355863609286782d);
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(36.01102806275612d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.005969155120433433d, 6.759527733946123E225d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.759527733946123E225d + "'", double2 == 6.759527733946123E225d);
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.570502024105884E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        double double1 = org.apache.commons.math3.util.FastMath.atan(7.736374376643928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) -1, (long) 127);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 192L, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(10.000000003691417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465876115584d + "'", double1 == 22025.465876115584d);
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.151292546497023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.3017603043599186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.626859959358372d + "'", double1 == 3.626859959358372d);
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.33934385609142426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.942973278097104d + "'", double1 == 0.942973278097104d);
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.0045242572063329E92d, (-0.9440892412430647d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-149));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-149L) + "'", long1 == (-149L));
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.8114933394509746d), (double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8114933394509746d) + "'", double2 == (-0.8114933394509746d));
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        int int2 = org.apache.commons.math3.util.FastMath.min(128, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.413832468402249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8476559388593563d + "'", double1 == 1.8476559388593563d);
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.778151250383643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3120498879326579d + "'", double1 == 1.3120498879326579d);
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-100.000015f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.000015f + "'", float1 == 100.000015f);
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.641588833612778d, 0.8133637952951194d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.13457274443050346d) + "'", double2 == (-0.13457274443050346d));
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.768372E-7f, (double) (-10.999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7683716E-7f + "'", float2 == 4.7683716E-7f);
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        int int2 = org.apache.commons.math3.util.FastMath.max(35, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 2016);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6196625787827068d + "'", double1 == 0.6196625787827068d);
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        int int2 = org.apache.commons.math3.util.FastMath.min(1025, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(7677.584358657442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 439893.1806067263d + "'", double1 == 439893.1806067263d);
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.3099240316342194E-25d, 4.018180612889371E87d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.018180612889371E87d + "'", double2 == 4.018180612889371E87d);
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.3826710608239539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.22121624008889d + "'", double1 == 79.22121624008889d);
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.691673596021348E41d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9999991111122963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813729584808803d + "'", double1 == 0.8813729584808803d);
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.0842023E-19f, 4.620233E-10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842023E-19f + "'", float2 == 1.0842023E-19f);
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403126461166524d + "'", double1 == 0.5403126461166524d);
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.5670585390721963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 8, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(224.08464360781855d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.18838862103418857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7249453328133406d) + "'", double1 == (-0.7249453328133406d));
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.1920929665620893E-7d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920929665620893E-7d + "'", double2 == 1.1920929665620893E-7d);
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-149.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.21991180375937053d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-1022.99994f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.08361383430588709d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08731742487847532d) + "'", double1 == (-0.08731742487847532d));
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1500L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.447142425533318d + "'", double1 == 11.447142425533318d);
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0001446299016021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5401805983518602d + "'", double1 == 0.5401805983518602d);
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-49L), 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.10453398E11f) + "'", float2 == (-2.10453398E11f));
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        float float2 = org.apache.commons.math3.util.FastMath.min(32.0f, 6000.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        double double1 = org.apache.commons.math3.util.FastMath.cos(32.000003814697266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342212569745874d + "'", double1 == 0.8342212569745874d);
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(35.999996f, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 71.99999f + "'", float2 == 71.99999f);
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(72.89110995790382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.98216091375236d + "'", double1 == 4.98216091375236d);
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        double double1 = org.apache.commons.math3.util.FastMath.sin(8.881785255792436E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881785255792436E-16d + "'", double1 == 8.881785255792436E-16d);
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.001459633129270294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5475403976954647E-5d + "'", double1 == 2.5475403976954647E-5d);
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.384185791015648E-7d, 0.7615941559679877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615941559679877d + "'", double2 == 0.7615941559679877d);
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.999999f, (double) 3.0000007f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999998f + "'", float2 == 9.999998f);
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.061877705960518836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0600387617261746d + "'", double1 == 0.0600387617261746d);
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.015624999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01562627175205221d + "'", double1 == 0.01562627175205221d);
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.220703125E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2207031310632982E-4d) + "'", double1 == (-1.2207031310632982E-4d));
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.000001f + "'", float1 == 9.000001f);
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.5036453863070315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4844699782158644d) + "'", double1 == (-0.4844699782158644d));
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 43.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7504916449365889d + "'", double1 == 0.7504916449365889d);
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.007570918573144928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4337816812784116d + "'", double1 == 0.4337816812784116d);
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.443593622809233E69d, 5.684341886080639E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1920928955078099E-7d, 2.1576810513783636E-19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.57117967769818E-20d) + "'", double2 == (-6.57117967769818E-20d));
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-2015.9996f), (-8.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2015.9996f) + "'", float2 == (-2015.9996f));
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6200663.850464795d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 230L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.722018499983836E99d + "'", double1 == 7.722018499983836E99d);
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9132079039842687d, (double) 7.392373E-9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999993288339d + "'", double2 == 0.9999999993288339d);
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 230, (-44L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44L) + "'", long2 == (-44L));
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        double double1 = org.apache.commons.math3.util.FastMath.sin(749.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7450729502921023d + "'", double1 == 0.7450729502921023d);
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(20.871061917633263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.871061917633266d + "'", double1 == 20.871061917633266d);
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        float float2 = org.apache.commons.math3.util.FastMath.max(6.7762636E-21f, 416.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416.0f + "'", float2 == 416.0f);
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.7772088E-35f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7772088E-35f + "'", float2 == 4.7772088E-35f);
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.34720030357470333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (double) 8.881784E-16f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-5L), 1.2980742E33f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(12.285091215917852d, (-0.6156266841948422d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.300506591100818d + "'", double2 == 12.300506591100818d);
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.0023620462865979784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5684342783118803d + "'", double1 == 1.5684342783118803d);
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-50), 54.51797669983169d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-49.999996f) + "'", float2 == (-49.999996f));
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.562490436697348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4462809820959918d + "'", double1 == 0.4462809820959918d);
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(57.32153907959692d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.017453292519943295d, (-0.1274905242232915d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017453292519943295d + "'", double2 == 0.017453292519943295d);
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.005969084226160847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18139942342744736d + "'", double1 == 0.18139942342744736d);
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.4414062985774393E-4d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12) + "'", int1 == (-12));
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        float float1 = org.apache.commons.math3.util.FastMath.abs(47.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 47.0f + "'", float1 == 47.0f);
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.1817704800379587E-33d, (double) 20.999998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1817704800379587E-33d + "'", double2 == 1.1817704800379587E-33d);
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(15.000001f, 16);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 983040.06f + "'", float2 == 983040.06f);
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(5.7277862875981045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 306.28826703726253d + "'", double1 == 306.28826703726253d);
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(230.0f, 1.5845631E30f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 230.0f + "'", float2 == 230.0f);
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        int int2 = org.apache.commons.math3.util.FastMath.min(6000, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.5623517462205421d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        int int2 = org.apache.commons.math3.util.FastMath.min(661, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.36832110635936816d, 0.7929669390349671d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43483400047912446d + "'", double2 == 0.43483400047912446d);
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        float float2 = org.apache.commons.math3.util.FastMath.min(99.99999f, 29.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 29.0f + "'", float2 == 29.0f);
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.520090572373501E22d, 0.8133637952951194d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.520090572373501E22d + "'", double2 == 3.520090572373501E22d);
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-4.8828125E-4f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1 == (-11));
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 31855810236609772L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.503188655621596d + "'", double1 == 16.503188655621596d);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 22, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22L + "'", long2 == 22L);
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.0000002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        double double1 = org.apache.commons.math3.util.FastMath.log10(9.085602717697938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9583537426829077d + "'", double1 == 0.9583537426829077d);
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320668d + "'", double1 == 1.8184464592320668d);
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.4403865801148885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.011344117980650029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011344361305298496d + "'", double1 == 0.011344361305298496d);
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.6714065E24f, 271.3685902448305d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.671406E24f + "'", float2 == 9.671406E24f);
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-7.62364218539641d), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-35), 0.02704116433650664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.000010446063705d + "'", double2 == 35.000010446063705d);
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.11835125533092143d, 7.392372908686772E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11835125533092143d + "'", double2 == 0.11835125533092143d);
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        double double1 = org.apache.commons.math3.util.FastMath.floor(51.878049774137445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.0d + "'", double1 == 51.0d);
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-2.14748339E9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.19177788476679059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18947732492435512d + "'", double1 == 0.18947732492435512d);
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.23054050688065747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20745350934872828d + "'", double1 == 0.20745350934872828d);
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.3466753987299895d, 7.50964403924188d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.50740306829112E-4d + "'", double2 == 3.50740306829112E-4d);
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-44L), 4.0000005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.1474839E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        double double1 = org.apache.commons.math3.util.FastMath.sin(201.71573230680755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6082091136848403d + "'", double1 == 0.6082091136848403d);
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 3072);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3072 + "'", int1 == 3072);
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        double double1 = org.apache.commons.math3.util.FastMath.log((-2.2124675420131484E28d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.0012766224843186505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012766217907877948d + "'", double1 == 0.0012766217907877948d);
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.3841857910156025E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.38418579101558E-7d + "'", double1 == 2.38418579101558E-7d);
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 96.99999f, 0.02042970020377229d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570585711315427d + "'", double2 == 1.570585711315427d);
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.14550003380861354d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        int int2 = org.apache.commons.math3.util.FastMath.max((-49), (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-14.0f), 1.1635411564360822d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-13.999999999999998d) + "'", double2 == (-13.999999999999998d));
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(201.71573230680755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.018180612889371E87d + "'", double1 == 4.018180612889371E87d);
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-14.999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.46621207433047d) + "'", double1 == (-2.46621207433047d));
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(192.00002f, (double) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 192.0f + "'", float2 == 192.0f);
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.7724664664710889d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00307574732784d + "'", double2 == 97.00307574732784d);
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.288323357835553E-62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.288323357835553E-62d + "'", double1 == 2.288323357835553E-62d);
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.2207031249999999E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.220703131063298E-4d + "'", double1 == 1.220703131063298E-4d);
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        double double2 = org.apache.commons.math3.util.FastMath.min((-57.29577951308232d), (double) 40.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-57.29577951308232d) + "'", double2 == (-57.29577951308232d));
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        long long2 = org.apache.commons.math3.util.FastMath.max(63L, 20L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.778151250383644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1500624.3457795258d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.5537502203873549d), 1.2930884003786862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5537502203873549d) + "'", double2 == (-0.5537502203873549d));
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(19.085532134423065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6427633708110156d + "'", double1 == 3.6427633708110156d);
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3282.642222003741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0008452289287066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.448719238887184E-4d + "'", double1 == 8.448719238887184E-4d);
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(73.59231792902837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.56780537673735E31d + "'", double1 == 4.56780537673735E31d);
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        float float2 = org.apache.commons.math3.util.FastMath.min(37.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.8136451593772986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2019782203920906d + "'", double1 == 1.2019782203920906d);
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(16.91153452528776d, 207.29648124788534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.911534525287763d + "'", double2 == 16.911534525287763d);
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.06179885322941391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39536067730187796d + "'", double1 == 0.39536067730187796d);
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 128.0d + "'", double1 == 128.0d);
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-117227.15788965272d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 117227.15788965272d + "'", double1 == 117227.15788965272d);
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 750L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.31322083153445d + "'", double1 == 7.31322083153445d);
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.176517423269412E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.386127875258307d + "'", double1 == 27.386127875258307d);
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.361757477043805E67d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.361757477043805E67d + "'", double1 == 4.361757477043805E67d);
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 3.099338555038559d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.4596625685308554d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (-77));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.2142316598443891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2142316598443891d + "'", double1 == 0.2142316598443891d);
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.25000003f, (double) 1.0842023E-19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.25f + "'", float2 == 0.25f);
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.0E21d, 3.9536014095E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267553606d + "'", double2 == 1.5707963267553606d);
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 2.14748352E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        float float1 = org.apache.commons.math3.util.FastMath.abs(39.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 39.0f + "'", float1 == 39.0f);
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (double) 6000.0005f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6000.00048828125d + "'", double2 == 6000.00048828125d);
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(19.608439339962796d, 108.43494882292201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 110.19359790649689d + "'", double2 == 110.19359790649689d);
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 31, 661);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(66.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 5.8274116E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0170751976386376E12d + "'", double1 == 1.0170751976386376E12d);
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.318552944791968E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963263635931d + "'", double1 == 1.5707963263635931d);
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) -1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3486991523486093E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3486991523486093E-6d + "'", double1 == 1.3486991523486093E-6d);
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 121L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7725655913805832E52d + "'", double1 == 1.7725655913805832E52d);
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 9, (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8816764231589202E-6d + "'", double2 == 1.8816764231589202E-6d);
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-48.999996f), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.211487457547996E31d) + "'", double2 == (-6.211487457547996E31d));
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 7);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        double double2 = org.apache.commons.math3.util.FastMath.min((-36.14246844765979d), 0.7615941559679877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-36.14246844765979d) + "'", double2 == (-36.14246844765979d));
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 0, 121.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        double double1 = org.apache.commons.math3.util.FastMath.log(19.608439339962796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9759600521336504d + "'", double1 == 2.9759600521336504d);
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.669418070491609d, (-1.7397064891248464E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.669418070491609d + "'", double2 == 3.669418070491609d);
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        double double1 = org.apache.commons.math3.util.FastMath.log10(38.75229574078433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5882974358235231d + "'", double1 == 1.5882974358235231d);
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.1729791831319734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.172979183131974d + "'", double1 == 2.172979183131974d);
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(36.83394510450251d, (-0.26095515580451434d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.83486947926985d + "'", double2 == 36.83486947926985d);
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-8.0f), 0.433773393518789d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.433773393518789d + "'", double2 == 0.433773393518789d);
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.5896828217829762d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) -1, 512.49994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.6532181001115565E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6532181001115565E38d + "'", double1 == 5.6532181001115565E38d);
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-8.864555516157939E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(6.690663329467393d, 0.844153986113171d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.743706083493738d + "'", double2 == 6.743706083493738d);
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.030461739654624384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030930445539300806d + "'", double1 == 0.030930445539300806d);
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 106);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.5565355E-17f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        float float1 = org.apache.commons.math3.util.FastMath.signum(121.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 121L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 121 + "'", int1 == 121);
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.8750847578455696d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03272640277836577d) + "'", double1 == (-0.03272640277836577d));
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.6293945E-6f, 3.6313226197565623E-11d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.629394E-6f + "'", float2 == 7.629394E-6f);
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9312063052667533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030954092044179104d) + "'", double1 == (-0.030954092044179104d));
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 2016);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.273737E-13f, (float) (-14L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.273737E-13f + "'", float2 == 2.273737E-13f);
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 85, 14.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 85.0f + "'", float2 == 85.0f);
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(749.9999999999994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 749.9999999999995d + "'", double1 == 749.9999999999995d);
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(97.0f, 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4606145E16f + "'", float2 == 5.4606145E16f);
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 2.7079938E27f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8344632077604134d, 1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7897525582362696d + "'", double2 == 0.7897525582362696d);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.7802246589084126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7171517285126258d + "'", double1 == 0.7171517285126258d);
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.02209708691207961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022343035780788705d + "'", double1 == 0.022343035780788705d);
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.9999999801317847d), 0.9735692101318191d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7987897334176897d) + "'", double2 == (-0.7987897334176897d));
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2015.9999f, 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 258047.98f + "'", float2 == 258047.98f);
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(32.000008f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        double double2 = org.apache.commons.math3.util.FastMath.max((-2.5104620932674017E-5d), 4.7683715820308884E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7683715820308884E-7d + "'", double2 == 4.7683715820308884E-7d);
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 9);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.4438388470574063d, 1.000000000014552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000014552d + "'", double2 == 1.000000000014552d);
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 127, (-149.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-2.229020270326605E-63d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(73.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.561942117267558d + "'", double1 == 8.561942117267558d);
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-17));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (byte) 10, 8.881786E-16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 22026L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        double double1 = org.apache.commons.math3.util.FastMath.log(38.22907066290581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.643596238307588d + "'", double1 == 3.643596238307588d);
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 11L, (-22026.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-22026.0f) + "'", float2 == (-22026.0f));
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 8.881785E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881785255792436E-16d + "'", double1 == 8.881785255792436E-16d);
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        double double1 = org.apache.commons.math3.util.FastMath.acos(50.39699624996822d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.4342944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4342944819032518d + "'", double1 == 0.4342944819032518d);
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        long long2 = org.apache.commons.math3.util.FastMath.max(10L, 11014L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11014L + "'", long2 == 11014L);
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1.66633186E17f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.65457130176138d + "'", double1 == 39.65457130176138d);
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.2418773344567871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6230626596813659d + "'", double1 == 0.6230626596813659d);
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-149L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-149.0d) + "'", double1 == (-149.0d));
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(983040.06f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 28.999998f, 0.19068996526228799d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9004857517369393d + "'", double2 == 1.9004857517369393d);
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 6.0f, 0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0317662114902202d + "'", double2 == 1.0317662114902202d);
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(43.42944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.464152347486313d + "'", double1 == 4.464152347486313d);
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.882813E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.882813E-4f + "'", float1 == 4.882813E-4f);
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 6.776264E-21f, 6.796720822921585E297d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.776264385827971E-21d + "'", double2 == 6.776264385827971E-21d);
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.1491887400520766d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.720544106967183d + "'", double1 == 1.720544106967183d);
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9999092042625952d, 0.48941851000927195d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999092042625952d + "'", double2 == 0.9999092042625952d);
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 86, (-50));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.6383344E-14f + "'", float2 == 7.6383344E-14f);
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.1920928955078068E-7d, 29.012614126025312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.108877918858261E-9d + "'", double2 == 4.108877918858261E-9d);
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (-0.49290533695396277d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.9925907227207792d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.8158514E19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0404061971005592E21d + "'", double1 == 1.0404061971005592E21d);
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9893581078632866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8356736066856933d + "'", double1 == 0.8356736066856933d);
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.2304259041251446d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.745236263283738d, (-0.027181889027663657d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.745236263283738d) + "'", double2 == (-0.745236263283738d));
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.2737368E-13f + "'", float1 == 2.2737368E-13f);
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.5705654518541791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8415957046430611d + "'", double1 == 0.8415957046430611d);
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.04453605E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        int int2 = org.apache.commons.math3.util.FastMath.min((-42), (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        long long2 = org.apache.commons.math3.util.FastMath.min((-1L), 112L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 63959947L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 40.0f, 57.29577951307475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 69.8770802911146d + "'", double2 == 69.8770802911146d);
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 21L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.610556285247321E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6106859867876793E-4d + "'", double1 == 1.6106859867876793E-4d);
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-20.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4258259770489514E8d + "'", double1 == 2.4258259770489514E8d);
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(216.47212100905753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 2.028240766937036E32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.5845633E30f, 375.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 375.0f + "'", float2 == 375.0f);
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.10412335356742336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.675108749465012d + "'", double1 == 1.675108749465012d);
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.5207040267328378d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.2360679774997902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3076604860118306d + "'", double1 == 1.3076604860118306d);
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(51.999996f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.07074546404006221d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-35));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(15.0d, 1.0908536532676732E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3750698780782564E-10d + "'", double2 == 1.3750698780782564E-10d);
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6.1035153E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035153E-5f + "'", float1 == 6.1035153E-5f);
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-2.14748365E9f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.9342813E25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9342815E25f + "'", float1 == 1.9342815E25f);
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(9.027538327591038E8d, 3.3495150228208087E50d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.027538327591039E8d + "'", double2 == 9.027538327591039E8d);
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        int int1 = org.apache.commons.math3.util.FastMath.round(192.00002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 192 + "'", int1 == 192);
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.7778932E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.7778936E22f + "'", float1 == 3.7778936E22f);
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 7, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.10899577685250762d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.077727086967487d) + "'", double2 == (-2.077727086967487d));
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.0406148914328552d), 9.536743164059608E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0406148914328552d + "'", double2 == 1.0406148914328552d);
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 128L, 9.671406E24f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 128.0f + "'", float2 == 128.0f);
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.7165256995489035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.34967800989337d + "'", double1 == 98.34967800989337d);
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.0536712127723509E-8d, (double) 2.4758801E27f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2557441367701404E-36d + "'", double2 == 4.2557441367701404E-36d);
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 5.556536E-17f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1836606918946333E-15d + "'", double1 == 3.1836606918946333E-15d);
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1484736.8269696264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1218.4977747085245d + "'", double1 == 1218.4977747085245d);
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.159276472395984E9d, (double) 86L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21342216864750313d + "'", double2 == 0.21342216864750313d);
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.011344117980650029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6499700825897167d + "'", double1 == 0.6499700825897167d);
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.17543140958325787d, 0.2776724662502028d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.563468977130794d + "'", double2 == 0.563468977130794d);
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.7017639929214721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7017639929214722d + "'", double1 == 0.7017639929214722d);
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1.8158514E19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8694396821294437d + "'", double1 == 0.8694396821294437d);
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.31622776601683805d), (-0.007570484655252586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0017325895037705718d + "'", double2 == 0.0017325895037705718d);
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.7182818284590453d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.03417412840354696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0347647729795975d + "'", double1 == 1.0347647729795975d);
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 4.611686E18f, 98.34967800989337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(47.0f, 3282.6426454739853d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47.000004f + "'", float2 == 47.000004f);
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(9.536744300930979E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.53674430093098E-7d + "'", double1 == 9.53674430093098E-7d);
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.52208019114035E-6d, (-1024.0001220703127d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9092973276085183d, 16);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59591.70966215186d + "'", double2 == 59591.70966215186d);
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1023.0f, 47999.996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.0f + "'", float2 == 1023.0f);
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        float float2 = org.apache.commons.math3.util.FastMath.max((-37.999996f), (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-2.10453398E11f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        int int2 = org.apache.commons.math3.util.FastMath.max((-44), (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.04453605E13f, 12.16264444841069d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.04453594E13f + "'", float2 == 1.04453594E13f);
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        double double1 = org.apache.commons.math3.util.FastMath.abs(19.36491594307659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.36491594307659d + "'", double1 == 19.36491594307659d);
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2924697E-26f + "'", float1 == 1.2924697E-26f);
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (-0.733151276556472d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4E-45f) + "'", float2 == (-1.4E-45f));
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0008452289287066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.544074500177084d + "'", double1 == 1.544074500177084d);
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.9759600521336504d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-49), (-14L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49L) + "'", long2 == (-49L));
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(148.40979009083827d, 0.3466753987299895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03271943440277325d + "'", double2 == 0.03271943440277325d);
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.499188385108773d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(8.659189757353836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2881.4316395467454d + "'", double1 == 2881.4316395467454d);
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-11.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999902065507035d + "'", double1 == 0.9999902065507035d);
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(7.941742215644044E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3860955000761808E82d + "'", double1 == 1.3860955000761808E82d);
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.339735781143019E61d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 205 + "'", int1 == 205);
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.0329318964938872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25594028828308535d + "'", double1 == 0.25594028828308535d);
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.7300932779126392d, (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.645438744517836E-4d + "'", double2 == 4.645438744517836E-4d);
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-63.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.146891579734805E27d) + "'", double1 == (-1.146891579734805E27d));
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.5065230921350898E254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5490899152547166E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999999880016d + "'", double1 == 0.999999999880016d);
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1102230246251565E-16d, (double) 749.9999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.04453605E13f), 47.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.04453605E13f) + "'", float2 == (-1.04453605E13f));
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.7667766979320225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 116618.90399762228d + "'", double1 == 116618.90399762228d);
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(512.49994f, (double) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.4999f + "'", float2 == 512.4999f);
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        double double1 = org.apache.commons.math3.util.FastMath.sin(7.56939756606048E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8538433260930435d) + "'", double1 == (-0.8538433260930435d));
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.8158514E19f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1351374985682157d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        int int2 = org.apache.commons.math3.util.FastMath.max(109, 6000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6000 + "'", int2 == 6000);
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8192955636350346d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.973552586323384d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 149.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.600540585471551d + "'", double1 == 2.600540585471551d);
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.010848054736368648d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.581644594309574d + "'", double1 == 1.581644594309574d);
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.361975406798963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 2.47588E27f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.769540551910325d + "'", double1 == 63.769540551910325d);
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4162.307786953581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.026972122043814d + "'", double1 == 9.026972122043814d);
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.6435381333569995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.6247955454703815d, (double) 3.7778932E22f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.624795545470382d + "'", double2 == 4.624795545470382d);
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.686997580331529d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.686997580331529d + "'", double2 == 3.686997580331529d);
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.8641086300492958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.372890020158183d + "'", double1 == 1.372890020158183d);
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        long long2 = org.apache.commons.math3.util.FastMath.max(1025L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.521546720938896d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.884004301644022E-4d, 0.07621974786783883d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5592671935213395d + "'", double2 == 0.5592671935213395d);
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 85);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 85.0d + "'", double1 == 85.0d);
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.230031164371132d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.953601409492212E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.0936250232611d + "'", double1 == 25.0936250232611d);
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        int int1 = org.apache.commons.math3.util.FastMath.round(0.3789063f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-4.061174760331545d), 6.103515625000001E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.061174760790191d + "'", double2 == 4.061174760790191d);
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        int int2 = org.apache.commons.math3.util.FastMath.min((-63), (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(8.946190480851357d, 25.049964412474072d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.946190480851357d + "'", double2 == 8.946190480851357d);
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-12), (-1023.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-12.0f) + "'", float2 == (-12.0f));
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 512L, (-0.10412335356742336d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5709996927170293d + "'", double2 == 1.5709996927170293d);
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 3072);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.517583445039835d) + "'", double1 == (-0.517583445039835d));
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.8865094960340845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.426644638684448d + "'", double1 == 2.426644638684448d);
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(63.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 63.000004f + "'", float1 == 63.000004f);
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        int int2 = org.apache.commons.math3.util.FastMath.max(18, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.2207032644558522E-4d, 0.323937163077181d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2207032644558525E-4d + "'", double2 == 1.2207032644558525E-4d);
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(13.0d, 0.8338268425894415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.999999999999998d + "'", double2 == 12.999999999999998d);
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 0.029101516801199417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-724));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 724L + "'", long1 == 724L);
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.620233E-10f, (float) (-67));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.620233E-10f) + "'", float2 == (-4.620233E-10f));
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        int int1 = org.apache.commons.math3.util.FastMath.round(37.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        int int1 = org.apache.commons.math3.util.FastMath.round(112.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 112 + "'", int1 == 112);
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.0000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.556536E-17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.556537E-17f + "'", float1 == 5.556537E-17f);
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5.886605660288295E11d, 5.999999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.886605660288293E11d + "'", double2 == 5.886605660288293E11d);
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1500L, 205);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(6.018531E-36f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.018531E-36f + "'", float2 == 6.018531E-36f);
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5707963267948584d, 0.8406759214397472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3843128629669922d) + "'", double2 == (-0.3843128629669922d));
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1500.0001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.3138869129594495d + "'", double1 == 7.3138869129594495d);
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 123.08755801768092d + "'", double1 == 123.08755801768092d);
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        long long2 = org.apache.commons.math3.util.FastMath.min(85L, 1024L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 85L + "'", long2 == 85L);
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 4.3368087E-19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.4428418403909626d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        double double1 = org.apache.commons.math3.util.FastMath.log10(19.44297075773338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2887626229935416d + "'", double1 == 1.2887626229935416d);
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-7277.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-6.1035153E-5f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.6379788E-12f + "'", float1 == 3.6379788E-12f);
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.24034274195624494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9999999701976777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023309459289d + "'", double1 == 0.5403023309459289d);
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.007570773926109965d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.991374238398652E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.619625924888008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9630315308191313d + "'", double1 == 0.9630315308191313d);
    }
}

