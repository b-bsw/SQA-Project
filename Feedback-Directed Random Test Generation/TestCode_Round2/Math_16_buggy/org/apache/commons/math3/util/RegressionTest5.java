package org.apache.commons.math3.util;

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
        float float1 = org.apache.commons.math3.util.FastMath.abs(14.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.0f + "'", float1 == 14.0f);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9998140668686113d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998140668686113d + "'", double2 == 0.9998140668686113d);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.5643904318910452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5643904318910452d + "'", double1 == 0.5643904318910452d);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 1025);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1025.0f + "'", float1 == 1025.0f);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        int int2 = org.apache.commons.math3.util.FastMath.max(6, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 106);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(99.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.6398352529683655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(9.536743164059608E-7d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.768371582029804E-7d + "'", double2 == 4.768371582029804E-7d);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.027800920562904d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.027800920562904d + "'", double2 == 6.027800920562904d);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.9999999f) + "'", float1 == (-1.9999999f));
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-127L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.026525695313479d) + "'", double1 == (-5.026525695313479d));
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.359610000063081E-28d, 0.0272356433182504d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0272356433182504d + "'", double2 == 0.0272356433182504d);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.9843788128357573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.5628219188284785d, 3.155849015173716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5628219188284787d + "'", double2 == 0.5628219188284787d);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 52.000004f, 0.19077079376318204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.41928129253470725d) + "'", double2 == (-0.41928129253470725d));
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.636436139626906d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192092966562089E-7d + "'", double1 == 1.192092966562089E-7d);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9358793340080341d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.4825767815644055d, (double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4825767815644055d + "'", double2 == 2.4825767815644055d);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        float float1 = org.apache.commons.math3.util.FastMath.signum(8.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.7755575615628914E-17d, 0.9977630759545902d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7755575615628914E-17d + "'", double2 == 2.7755575615628914E-17d);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 3.6379788E-12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.637978807091713E-12d + "'", double1 == 3.637978807091713E-12d);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.122104641351006d + "'", double1 == 10.122104641351006d);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.882812208961696E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999880790727d + "'", double1 == 0.999999880790727d);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-6.000001f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.0d) + "'", double1 == (-7.0d));
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.29807406E33f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-7276.563998161455d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7277.0d) + "'", double1 == (-7277.0d));
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9111477955680065d, 0.8929616830058433d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7954782038978773d + "'", double2 == 0.7954782038978773d);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        double double1 = org.apache.commons.math3.util.FastMath.abs(10.082648376090521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.082648376090521d + "'", double1 == 10.082648376090521d);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        double double1 = org.apache.commons.math3.util.FastMath.abs(26.562736412595044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.562736412595044d + "'", double1 == 26.562736412595044d);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.768373E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9734594443576854d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0678869494090629d + "'", double2 == 0.0678869494090629d);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.768372150465441E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707958499576815d + "'", double1 == 1.5707958499576815d);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 38);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5927965878556878E16d + "'", double1 == 1.5927965878556878E16d);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.8828122E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.910383E-11f + "'", float1 == 2.910383E-11f);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.04402615488638885d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6148367167674555d + "'", double1 == 1.6148367167674555d);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.4063956532774693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.081218734622052d + "'", double1 == 4.081218734622052d);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.2983485416910245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.04402615488638885d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.684013597604755E-4d) + "'", double1 == (-7.684013597604755E-4d));
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.5872036550391518d), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.702986674926819d) + "'", double2 == (-1.702986674926819d));
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        int int2 = org.apache.commons.math3.util.FastMath.min(39, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(5.1771933557663626E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.1771933557663606E-8d + "'", double1 == 5.1771933557663606E-8d);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-2016.0f), 2.2227587494850775E-162d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2015.9999f) + "'", float2 == (-2015.9999f));
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.37438953472E11d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.398762258581692E9d) + "'", double1 == (-2.398762258581692E9d));
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0000061553940698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000030776922988d + "'", double1 == 1.0000030776922988d);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.019686241372257017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01968878488836084d + "'", double1 == 0.01968878488836084d);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.000004f + "'", float1 == 35.000004f);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1025.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6668706760619807d + "'", double1 == 0.6668706760619807d);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.7262340257027773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6207559578256505d + "'", double1 == 0.6207559578256505d);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-2.6754111826338143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0688785009277558d + "'", double1 == 0.0688785009277558d);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.80038650342911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2264012739454784d + "'", double1 == 2.2264012739454784d);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (byte) 10, (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.027800920562904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.796382254433037d + "'", double1 == 1.796382254433037d);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-1), 86);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.271684935418713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.9580333260613905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0845246306421101d + "'", double1 == 1.0845246306421101d);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 32L, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-2.349101754933678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5896828217829762d) + "'", double1 == (-1.5896828217829762d));
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1.5845633E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.4788975654116d + "'", double1 == 286.4788975654116d);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        long long2 = org.apache.commons.math3.util.FastMath.min(750L, 86L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 86L + "'", long2 == 86L);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 9223372036854775807L, 0.017281906236058166d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233715E18f + "'", float2 == 9.2233715E18f);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(7.629394531472045E-6d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4414062500710543E-4d + "'", double2 == 2.4414062500710543E-4d);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        int int1 = org.apache.commons.math3.util.FastMath.abs(85);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 85 + "'", int1 == 85);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 1.0955641261303417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0955641261303417d + "'", double2 == 1.0955641261303417d);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-5.748134494412303E-34d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(74.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3733829795401761E32d + "'", double1 == 1.3733829795401761E32d);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.011973124835819249d, 1.570796326794411d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794411d + "'", double2 == 1.570796326794411d);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.25594028828308524d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-5.305943194514724d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999507580093402d) + "'", double1 == (-0.9999507580093402d));
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.007334883977608064d, 1025.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1025.0000000262442d + "'", double2 == 1025.0000000262442d);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 37, 512.49994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.4489023749402996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8956399139416201d + "'", double1 == 0.8956399139416201d);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) ' ', 3.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0000000000000049d) + "'", double2 == (-1.0000000000000049d));
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 4.768372E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.768371013597152E-7d + "'", double1 == 4.768371013597152E-7d);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.5314547471274426d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5067879719422177d) + "'", double1 == (-0.5067879719422177d));
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.796382254433037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3402918541993147d + "'", double1 == 1.3402918541993147d);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 35L, 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9957901442164847d + "'", double1 == 0.9957901442164847d);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        float float1 = org.apache.commons.math3.util.FastMath.signum(47999.996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1500L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(749.9999389648439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.313219861265277d + "'", double1 == 7.313219861265277d);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599455d + "'", double1 == 0.6931471805599455d);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        int int2 = org.apache.commons.math3.util.FastMath.min(3, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.089627549827865E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.089627549827866E13d + "'", double1 == 4.089627549827866E13d);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 3.732511156817248d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.19902312E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.20824159849321072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3610195264493026d + "'", double1 == 1.3610195264493026d);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1025.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.625595310085968d + "'", double1 == 7.625595310085968d);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1024);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.011032585021104841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011032137432646739d + "'", double1 == 0.011032137432646739d);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        long long1 = org.apache.commons.math3.util.FastMath.round((-1.933186133561807d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.5597692393574885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5894638344822235d + "'", double1 == 0.5894638344822235d);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.2949673E9f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.447327196772732E34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.086097232552573E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03444315284990291d + "'", double1 == 0.03444315284990291d);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.739706489124846E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 29.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0601456127484035d + "'", double1 == 4.0601456127484035d);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.993222750278501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999046325682d + "'", double1 == 9.999999046325682d);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.081218734622052d, 2.2919361797649715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5026536249078912d) + "'", double2 == (-0.5026536249078912d));
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (double) 2.8E-45f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        double double1 = org.apache.commons.math3.util.FastMath.log10(11.085564054390163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.044757795734393d + "'", double1 == 1.044757795734393d);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.24187733445678708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3264961565739686d + "'", double1 == 1.3264961565739686d);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 8);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1025, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.0141204E32f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.739706489124846E-4d), 8.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.739706489124846E-4d + "'", double2 == 1.739706489124846E-4d);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.151292546497023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.242265591335951d + "'", double1 == 2.242265591335951d);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8133637952951194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.949911109190508d + "'", double1 == 0.949911109190508d);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-49.17253568793199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.550462574188602d) + "'", double1 == (-1.550462574188602d));
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        float float2 = org.apache.commons.math3.util.FastMath.min(7.7371252E25f, Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.7371252E25f + "'", float2 == 7.7371252E25f);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-29), 0.99999994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-29.0f) + "'", float2 == (-29.0f));
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0000000000000002E100d, 3.814697265625E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002E100d + "'", double2 == 1.0000000000000002E100d);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.8774718E-37f, (float) (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.8774718E-37f) + "'", float2 == (-5.8774718E-37f));
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536744E-7f + "'", float1 == 9.536744E-7f);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.029101515410080516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-2015.9999f), (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2015.9999f + "'", float2 == 2015.9999f);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.36274713936822706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.8414709848078964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        long long2 = org.apache.commons.math3.util.FastMath.max((-1023L), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.33934385609142426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6975039373827737d + "'", double1 == 0.6975039373827737d);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8344632077604134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9134895772587739d + "'", double1 == 0.9134895772587739d);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 39);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39L + "'", long1 == 39L);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.981898135071284d, 108.43494882292201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.981898135071284d + "'", double2 == 0.981898135071284d);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 48000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        double double2 = org.apache.commons.math3.util.FastMath.pow(44.29429222643544d, 1.5927965878556878E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-5.026525695313479d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 63);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 63.0f + "'", float1 == 63.0f);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.569820717348332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.144920592687449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.59911783860761d + "'", double1 == 65.59911783860761d);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.841534261491385E64d, 1.7160033436347992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.841534261491385E64d + "'", double2 == 2.841534261491385E64d);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8414439706668982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6865731271200475d + "'", double1 == 0.6865731271200475d);
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.630805074209827d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        float float2 = org.apache.commons.math3.util.FastMath.min(6.1035156E-5f, (float) 127L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1035156E-5f + "'", float2 == 6.1035156E-5f);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.335747329235344d, (double) (-29));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.335747329235344d + "'", double2 == 2.335747329235344d);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 7.6293945E-6f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.62939453125E-6d + "'", double2 == 7.62939453125E-6d);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.99797342105242d + "'", double1 == 100.99797342105242d);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.443593622809233E69d, (-0.007570918573144928d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0024883905848449408d + "'", double2 == 0.0024883905848449408d);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(458.3662361046586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45282434280595096d) + "'", double1 == (-0.45282434280595096d));
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.0075707739244519d), 6.620073206530356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.007570773924451899d) + "'", double2 == (-0.007570773924451899d));
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-29.012614126025312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.0d) + "'", double1 == (-29.0d));
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1024);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.872171540421935d + "'", double1 == 17.872171540421935d);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 230L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.7461777875704901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6328631366109571d + "'", double1 == 0.6328631366109571d);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        double double1 = org.apache.commons.math3.util.FastMath.log(9.21052320575111E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.318429737814974d) + "'", double1 == (-32.318429737814974d));
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        double double2 = org.apache.commons.math3.util.FastMath.min(97.0463806640928d, 100.2188872880747d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0463806640928d + "'", double2 == 97.0463806640928d);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6.3890552180865745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10626723781312271d + "'", double1 == 0.10626723781312271d);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9766253859580151d, (-63));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.437470063761967d + "'", double2 == 4.437470063761967d);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 10, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.5988104444497883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8428749020844278d + "'", double1 == 0.8428749020844278d);
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0955641261303417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9433862044896946d + "'", double1 == 1.9433862044896946d);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1, 97.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.00001f + "'", float2 == 97.00001f);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.4322216757321002d, 2.242265591335951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6606416351184965d + "'", double2 == 2.6606416351184965d);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(286.4788975654116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.661149457771029d + "'", double1 == 5.661149457771029d);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.6812492467611788E-6d), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.001721599228683447d) + "'", double2 == (-0.001721599228683447d));
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        float float1 = org.apache.commons.math3.util.FastMath.signum(34.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9239385290558519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3925448875977896d + "'", double1 == 0.3925448875977896d);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.220703128031649E-4d + "'", double1 == 1.220703128031649E-4d);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(460.51701859880916d, 38);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2658595418453178E14d + "'", double2 == 1.2658595418453178E14d);
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 5.9604645E-8f, (double) (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.9604644775390625E-8d + "'", double2 == 5.9604644775390625E-8d);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(6.000001f, (-2015.9999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.000001f) + "'", float2 == (-6.000001f));
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(6.103515625E-5d, 6.037091348627933E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5609054788787597d + "'", double2 == 1.5609054788787597d);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        double double1 = org.apache.commons.math3.util.FastMath.asin(89.94410169625876d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.503897021644941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.499188385108773d + "'", double1 == 4.499188385108773d);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        double double1 = org.apache.commons.math3.util.FastMath.abs(74.38989177586092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.38989177586092d + "'", double1 == 74.38989177586092d);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.569462994251686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.232686862584267d + "'", double1 == 1.232686862584267d);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.009967783941837574d), 3.715289172677667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.715289172677667d + "'", double2 == 3.715289172677667d);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        int int1 = org.apache.commons.math3.util.FastMath.abs(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000002f + "'", float1 == 3.0000002f);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(63.0f, 375.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 750, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 9L, 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.671830818864701E103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.671830818864701E103d + "'", double1 == 1.671830818864701E103d);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        double double1 = org.apache.commons.math3.util.FastMath.signum(20.049877523736615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        double double1 = org.apache.commons.math3.util.FastMath.acos(12.285091215917852d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-63.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        long long1 = org.apache.commons.math3.util.FastMath.round((-5.9029581035870565E20d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.051757812026305E-5d + "'", double1 == 3.051757812026305E-5d);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9999999999999999d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4359738367999996E10d + "'", double2 == 3.4359738367999996E10d);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.1691265E29f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.7778932E22f + "'", float1 == 3.7778932E22f);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(512.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 4.882813E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.522116504168896E-6d + "'", double1 == 8.522116504168896E-6d);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.3826710608239539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1182202459195336d + "'", double1 == 2.1182202459195336d);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-8));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5670585390721965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037377790192319412d + "'", double1 == 0.0037377790192319412d);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.013462623778017066d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.34967110883676E-4d) + "'", double1 == (-2.34967110883676E-4d));
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.300664126286459E30d, 4.761141328797799d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.300664126286459E30d + "'", double2 == 1.300664126286459E30d);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.1920929E-7f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(6.0000005f, 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 192.00002f + "'", float2 == 192.00002f);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(96.99999999999999d, (-0.433773393518789d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0009698887435d + "'", double2 == 97.0009698887435d);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0090262908655008d, (-2.2124675420131484E28d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2124675420131484E28d + "'", double2 == 2.2124675420131484E28d);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.0f, 512.5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.5f + "'", float2 == 512.5f);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.9576597548889478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        int int1 = org.apache.commons.math3.util.FastMath.abs(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.7241400178893854d, (-1024));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.02816255926152E-309d + "'", double2 == 4.02816255926152E-309d);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1023.99994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        double double1 = org.apache.commons.math3.util.FastMath.log(6000.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.699514748210191d + "'", double1 == 8.699514748210191d);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 39L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(89.92360567258659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6532181001114764E38d + "'", double1 == 5.6532181001114764E38d);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        double double1 = org.apache.commons.math3.util.FastMath.log(9.999960327225621E103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 239.46884570409546d + "'", double1 == 239.46884570409546d);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.7781512503836425d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0000123108260284d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1.2676506E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48917865697472146d + "'", double1 == 0.48917865697472146d);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(74.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-149));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 9.536744E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.53674430092943E-7d + "'", double1 == 9.53674430092943E-7d);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(19.085532134423065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.368699135260182d + "'", double1 == 4.368699135260182d);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(100.00000763058662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.0d + "'", double1 == 101.0d);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.570796325565935d, 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.746518846982659E9d + "'", double2 == 6.746518846982659E9d);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 14L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        long long2 = org.apache.commons.math3.util.FastMath.min(1024L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.03417412840354696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994161213018331d + "'", double1 == 0.9994161213018331d);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(69.53701189487664d, 10.122104641351006d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 70.26985858558899d + "'", double2 == 70.26985858558899d);
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        int int2 = org.apache.commons.math3.util.FastMath.min(12, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.499188385108773d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.129248571153767E29d + "'", double2 == 7.129248571153767E29d);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.015625f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0688785009277558d, 4.368699135260182d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.393386194531972E-6d + "'", double2 == 8.393386194531972E-6d);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 100, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-57.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(6.0f, (float) 48000);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 0.6871714861810375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6931471805599455d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-1023L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 0.99999994f, 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999940395531084d + "'", double2 == 0.9999940395531084d);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1023);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(52.0f, 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3328.0f + "'", float2 == 3328.0f);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-2.905037623592521E11d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9934325699263659d) + "'", double1 == (-0.9934325699263659d));
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 0.015625f, (double) (-6.000001f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015624999999999998d + "'", double2 == 0.015624999999999998d);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 230, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.933186133561807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.093419873184702d) + "'", double1 == (-1.093419873184702d));
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4342944819032518d + "'", double1 == 0.4342944819032518d);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-1024), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1024.0f) + "'", float2 == (-1024.0f));
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        double double1 = org.apache.commons.math3.util.FastMath.exp(343.7746497577372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.992660940609293E149d + "'", double1 == 1.992660940609293E149d);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        double double1 = org.apache.commons.math3.util.FastMath.exp(21.5642090973306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.318552944791968E9d + "'", double1 == 2.318552944791968E9d);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6483621820319939d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        float float1 = org.apache.commons.math3.util.FastMath.abs(97.000015f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.000015f + "'", float1 == 97.000015f);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.7811383772589705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8838203308698949d + "'", double1 == 0.8838203308698949d);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        float float1 = org.apache.commons.math3.util.FastMath.abs(37.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 37.0f + "'", float1 == 37.0f);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        double double1 = org.apache.commons.math3.util.FastMath.atan(74.20994852478785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5573218601131689d + "'", double1 == 1.5573218601131689d);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.3495150228208087E50d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 116.33807021575196d + "'", double1 == 116.33807021575196d);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.854277055161758d, 5.8460065493236117E48d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.171869616492817E-49d + "'", double2 == 3.171869616492817E-49d);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 4.768373E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.5560905533403d) + "'", double1 == (-14.5560905533403d));
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        int int1 = org.apache.commons.math3.util.FastMath.round(48000.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48000 + "'", int1 == 48000);
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5658388325948494d + "'", double1 == 1.5658388325948494d);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.4505495340698077d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42331082513074814d) + "'", double1 == (-0.42331082513074814d));
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.2207033E-4f, 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5474252E26f + "'", float2 == 1.5474252E26f);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-1023.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.130647803622625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.389301394574591d + "'", double1 == 1.389301394574591d);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9073862646776047d, 0.0688785009277558d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.528474355042587d + "'", double2 == 27.528474355042587d);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42971.83463481174d + "'", double1 == 42971.83463481174d);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430661936490957d + "'", double1 == 1.5430661936490957d);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 749.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 749.0d + "'", double1 == 749.0d);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        int int2 = org.apache.commons.math3.util.FastMath.min(12, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-9.632848599998937E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.882813E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1 == (-11));
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.4489023762258555d, 1.1920928955078099E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4489023762258555d + "'", double2 == 1.4489023762258555d);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(84.73931296875567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3923301810454625d + "'", double1 == 4.3923301810454625d);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-57.0d), 0.6931471805599455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-56.99999999999999d) + "'", double2 == (-56.99999999999999d));
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        long long2 = org.apache.commons.math3.util.FastMath.min(106L, (long) (-14));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14L) + "'", long2 == (-14L));
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0908536532676732E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 8);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 100.000015f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.578825572446d + "'", double1 == 5729.578825572446d);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.4E-45f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(11.812917954340138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2061743125711886d + "'", double1 == 0.2061743125711886d);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.2658595418453178E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-38));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-37.999996f) + "'", float1 == (-37.999996f));
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.1029798377113775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45093845821887724d + "'", double1 == 0.45093845821887724d);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        float float2 = org.apache.commons.math3.util.FastMath.max(3.7778932E22f, 1.5845633E30f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845633E30f + "'", float2 == 1.5845633E30f);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8795935176771806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2086633304722194d + "'", double1 == 1.2086633304722194d);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.3925448875977896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006851200750452483d + "'", double1 == 0.006851200750452483d);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.029101515410080516d, 1.5670585390721965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5670585390721965d + "'", double2 == 1.5670585390721965d);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(44.294292226435445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.813181025133959d + "'", double1 == 3.813181025133959d);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.4255617839730704E64d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.6328631366109571d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.0678869494090629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0678869494090629d + "'", double1 == 0.0678869494090629d);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1.2676506E30f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.248867982141762d, 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40922.90603882126d + "'", double2 == 40922.90603882126d);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.0861605114833828d, 0.981898135071284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0861605114833828d + "'", double2 == 3.0861605114833828d);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-5.8774718E-37f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.376517822945031E-13d) + "'", double1 == (-8.376517822945031E-13d));
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        int int1 = org.apache.commons.math3.util.FastMath.round(37.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        double double2 = org.apache.commons.math3.util.FastMath.min(15.174271293851463d, 3.0517578129736954E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0517578129736954E-5d + "'", double2 == 3.0517578129736954E-5d);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.384185791015648E-7d + "'", double1 == 2.384185791015648E-7d);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 39L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.0d + "'", double1 == 39.0d);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        int int1 = org.apache.commons.math3.util.FastMath.round(100.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        float float2 = org.apache.commons.math3.util.FastMath.min(6.000001f, 192.00002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.000001f + "'", float2 == 6.000001f);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1024L, 0.9999999966478914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999966478914d + "'", double2 == 0.9999999966478914d);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-15.999999046325684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(8.000001f, (-1.702986674926819d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.21991180375937053d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        int int1 = org.apache.commons.math3.util.FastMath.abs(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7683715820308884E-7d + "'", double1 == 4.7683715820308884E-7d);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        double double1 = org.apache.commons.math3.util.FastMath.tan(7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.283188721677932d + "'", double1 == 4.283188721677932d);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6888366918779438d) + "'", double1 == (-0.6888366918779438d));
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-14), (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 12, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(100.00001f, (float) 14L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.00001f + "'", float2 == 100.00001f);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1500, (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 1023);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1023L + "'", long1 == 1023L);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5049898015397962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9182846632869422d + "'", double1 == 0.9182846632869422d);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.7615941559679877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.09951163E12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.5574075204780884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9149994625016323d) + "'", double1 == (-0.9149994625016323d));
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5574077246549025d, (double) 1.09951176E12f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 62.58344286260509d + "'", double2 == 62.58344286260509d);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.8383231924340317d, 0.4768639379495386d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4043418471644635d + "'", double2 == 1.4043418471644635d);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.477888730288475d, (double) (-1024.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.477888730288475d) + "'", double2 == (-2.477888730288475d));
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 2, (long) (-63));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.1367205671564067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5031586665657326d + "'", double1 == 1.5031586665657326d);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        long long2 = org.apache.commons.math3.util.FastMath.max(4L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.9149994625016323d), (-0.7224284372420832d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.23912643706564d) + "'", double2 == (-2.23912643706564d));
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.1546709519529927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1729791831319734d + "'", double1 == 2.1729791831319734d);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(192.00002f, (-8));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.75000006f + "'", float2 == 0.75000006f);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        int int1 = org.apache.commons.math3.util.FastMath.round(97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.7615941309233423d), 0.09545486558053895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09545486558053895d + "'", double2 == 0.09545486558053895d);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.7976931348623157E308d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        int int2 = org.apache.commons.math3.util.FastMath.min(137, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 137, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-137.0f) + "'", float2 == (-137.0f));
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(74.38989177586092d, 1.503897021644941d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.550582663979663d + "'", double2 == 1.550582663979663d);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.03444315284990291d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.516965851669841d, (double) 1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5169658516698409d + "'", double2 == 0.5169658516698409d);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(15.174271293851463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.413832468402249d + "'", double1 == 3.413832468402249d);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.0831675322560934E97d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 224.08464360781855d + "'", double1 == 224.08464360781855d);
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        long long1 = org.apache.commons.math3.util.FastMath.round((-8.45477224674693d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-8L) + "'", long1 == (-8L));
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.4337733935187889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7569856324386435d + "'", double1 == 0.7569856324386435d);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.7778932E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5035996E15f + "'", float1 == 4.5035996E15f);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(39.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(9.2233715E18f, (float) 106);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233715E18f + "'", float2 == 9.2233715E18f);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.061328855954495554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9981199750914416d + "'", double1 == 0.9981199750914416d);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.2246467991473532E-16d, 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2246467991473535E-16d + "'", double2 == 1.2246467991473535E-16d);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7786670548322335d + "'", double1 == 0.7786670548322335d);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(9.974937185533099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3956142355310157d + "'", double1 == 2.3956142355310157d);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 6.0000005f, (double) 100.000015f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.000000476837158d + "'", double2 == 6.000000476837158d);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-6), (long) (-29));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29L) + "'", long2 == (-29L));
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.3021117240420959d, 9.094947017729286E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.38388025641375E-13d) + "'", double2 == (-2.38388025641375E-13d));
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-1024.0f), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1024.0d) + "'", double2 == (-1024.0d));
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 2.19902312E12f, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.292469630076908E-26d + "'", double2 == 1.292469630076908E-26d);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.1425465430742778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0024879065139820676d) + "'", double1 == (-0.0024879065139820676d));
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.0914126326390014E99d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        int int1 = org.apache.commons.math3.util.FastMath.abs(39);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) Float.POSITIVE_INFINITY, 51.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.718315292959719d, 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.16264444841069d + "'", double2 == 12.16264444841069d);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.7405240741728077d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6294616902487444d) + "'", double1 == (-0.6294616902487444d));
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.01968878488836084d, 42971.83113775489d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01968878488836084d + "'", double2 == 0.01968878488836084d);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-2016.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2016.0f + "'", float1 == 2016.0f);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        double double1 = org.apache.commons.math3.util.FastMath.rint(36.07140440247247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        double double1 = org.apache.commons.math3.util.FastMath.rint(286.4788975654116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.0d + "'", double1 == 286.0d);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5.848890218459358d, 1.300664126286459E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.848890218459359d + "'", double2 == 5.848890218459359d);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.0d, (double) 137);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.000000000000001d + "'", double2 == 6.000000000000001d);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        int int2 = org.apache.commons.math3.util.FastMath.max(1023, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.0000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        double double2 = org.apache.commons.math3.util.FastMath.log(12.285091215917852d, (double) (-1.2207033E-4f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        long long2 = org.apache.commons.math3.util.FastMath.max(2147483647L, 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.569820717348332d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7185540823899328d + "'", double1 == 0.7185540823899328d);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.5872036550391518d), 97.0009698887435d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0009698887435d + "'", double2 == 97.0009698887435d);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03937253280921479d + "'", double1 == 0.03937253280921479d);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9232666633273902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9232666633273902d + "'", double1 == 0.9232666633273902d);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1.0141204E32f, 4.361757477043805E67d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.014120383468518E32d + "'", double2 == 1.014120383468518E32d);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.2227587494850775E-162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.882813082076609E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.882812888051005E-4d + "'", double1 == 4.882812888051005E-4d);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.844537546692157E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6865756866183495E-6d + "'", double1 == 1.6865756866183495E-6d);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-37.999996f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        double double1 = org.apache.commons.math3.util.FastMath.exp(9.094947017729284E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000009095d + "'", double1 == 1.0000000000009095d);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        float float2 = org.apache.commons.math3.util.FastMath.max(10.000001f, (float) 8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        int int1 = org.apache.commons.math3.util.FastMath.round(4.768372E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.9358793340080341d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0f, 32.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000004f + "'", float2 == 32.000004f);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.72983346207417d + "'", double1 == 38.72983346207417d);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.89793739384485E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9925907227207792d) + "'", double1 == (-0.9925907227207792d));
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6061093801777693d + "'", double1 == 1.6061093801777693d);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        int int2 = org.apache.commons.math3.util.FastMath.max(100, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.0d, 1.5658388325948494d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5658388325948494d + "'", double2 == 1.5658388325948494d);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6332917887909931d + "'", double1 == 0.6332917887909931d);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.8199525775350112d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(21.5642090973306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.159276472395984E9d + "'", double1 == 1.159276472395984E9d);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        float float1 = org.apache.commons.math3.util.FastMath.abs(5.820766E-11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.820766E-11f + "'", float1 == 5.820766E-11f);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.10626723781312271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9943589486530622d + "'", double1 == 0.9943589486530622d);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 11.7910068511973d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.7480575296890003d), 0.7615941559679877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7764316821660115d) + "'", double2 == (-0.7764316821660115d));
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(116.33807021575196d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        int int2 = org.apache.commons.math3.util.FastMath.min(2147483647, 106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        float float1 = org.apache.commons.math3.util.FastMath.abs(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(99.99999999999999d, 0.02909330424175981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 39L, 0.323937163077181d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.562490436697348d + "'", double2 == 1.562490436697348d);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-11), 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-11.0f) + "'", float2 == (-11.0f));
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.7200786095266942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8820097754150913d + "'", double1 == 2.8820097754150913d);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(9.53674430092943E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536744300927985E-7d + "'", double1 == 9.536744300927985E-7d);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 0, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.11294857116009238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1808226863465245d) + "'", double1 == (-2.1808226863465245d));
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.933186133561807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9589901563876679d) + "'", double1 == (-0.9589901563876679d));
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.013462623778017066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013462217145168067d + "'", double1 == 0.013462217145168067d);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.16227766016838d, 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.16227766016838d + "'", double2 == 2.16227766016838d);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2679114584199251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6360022856629775d + "'", double1 == 1.6360022856629775d);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.027800920562904d, (-57.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.027800920562903d + "'", double2 == 6.027800920562903d);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        double double1 = org.apache.commons.math3.util.FastMath.floor(8.315287191035679E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-4.999875008328899E-5d), 1.9916154164156743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.5104620932674017E-5d) + "'", double2 == (-2.5104620932674017E-5d));
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.5628219188284785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5366847334153032d + "'", double1 == 0.5366847334153032d);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 2.19902312E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.30087022627717525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2922549758657981d + "'", double1 == 0.2922549758657981d);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9802322387695312E-8d + "'", double1 == 2.9802322387695312E-8d);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        int int1 = org.apache.commons.math3.util.FastMath.abs(6000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6000 + "'", int1 == 6000);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        float float2 = org.apache.commons.math3.util.FastMath.min(8.0f, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-11));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-41.392100454203025d), 36.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.392100454203025d + "'", double2 == 41.392100454203025d);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.856115509710435E-13d, 3.156007379756452E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5386895293271398E-26d + "'", double2 == 1.5386895293271398E-26d);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.433773393518789d), (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.433773393518789d + "'", double2 == 0.433773393518789d);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 8.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999997749296758d + "'", double1 == 0.9999997749296758d);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-63.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.836344889159275d) + "'", double1 == (-4.836344889159275d));
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        int int2 = org.apache.commons.math3.util.FastMath.max((-11), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 8.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.992760093696703E-17d, 6.118326675323529E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.992760093696703E-17d + "'", double2 == 7.992760093696703E-17d);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.0d, 1.3222026309922488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.398079445262944d + "'", double2 == 8.398079445262944d);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-15.999999046325684d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1023.99994f, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.536744300930979E-7d + "'", double2 == 9.536744300930979E-7d);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5640537039872793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.778151250383644d + "'", double1 == 3.778151250383644d);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 11, 1.5587103146581684d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.999999f + "'", float2 == 10.999999f);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(35.0f, 86);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7079938E27f + "'", float2 == 2.7079938E27f);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.051757812026305E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000004656613d + "'", double1 == 1.0000000004656613d);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.3956142355310157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5200669294466767d + "'", double1 == 1.5200669294466767d);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-7.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        double double1 = org.apache.commons.math3.util.FastMath.exp(460.51701859880916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000022E200d + "'", double1 == 1.000000000000022E200d);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.3458247401995457E41d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.8897341156536202d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-127), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        long long2 = org.apache.commons.math3.util.FastMath.max(32L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.13512126156864773d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 6, 97.000015f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        float float2 = org.apache.commons.math3.util.FastMath.min(52.000004f, 5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9604645E-8f + "'", float2 == 5.9604645E-8f);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        int int2 = org.apache.commons.math3.util.FastMath.min((-8), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        float float1 = org.apache.commons.math3.util.FastMath.signum(29.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        long long1 = org.apache.commons.math3.util.FastMath.round(22026.474197238054d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22026L + "'", long1 == 22026L);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(32.0f, 156.43922347836767d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000004f + "'", float2 == 32.000004f);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(42971.83113775489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 207.29648124788537d + "'", double1 == 207.29648124788537d);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 39, 86L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 86L + "'", long2 == 86L);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9950547536867305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.704872438963137d + "'", double1 == 2.704872438963137d);
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(8.448719238886445E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.445152205030682E-4d + "'", double1 == 8.445152205030682E-4d);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.570750926882484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707509268824842d + "'", double1 == 1.5707509268824842d);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        long long2 = org.apache.commons.math3.util.FastMath.max(2L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2220482392758836d + "'", double1 == 1.2220482392758836d);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.0861605114833828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.969268007009038d + "'", double1 == 10.969268007009038d);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.4359738367999996E10d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(9.094947017729284E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.5367431640625E-7d + "'", double1 == 9.5367431640625E-7d);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 1.0000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853983422113506d + "'", double1 == 0.7853983422113506d);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.3925448875977896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1025);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1025 + "'", int1 == 1025);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(201.71573230680755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.000012765099144d + "'", double1 == 6.000012765099144d);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(6.1035156E-5f, (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.6714065E24f + "'", float2 == 9.6714065E24f);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-6.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        double double1 = org.apache.commons.math3.util.FastMath.abs(7.624618747740734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.624618747740734d + "'", double1 == 7.624618747740734d);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 149, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2.14748365E9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.14748352E9f) + "'", float1 == (-2.14748352E9f));
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.2679114584199251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.853230586269599d + "'", double1 == 0.853230586269599d);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        int int2 = org.apache.commons.math3.util.FastMath.min(1025, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 7.7371252E25f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 60.30380470871524d + "'", double1 == 60.30380470871524d);
    }
}

