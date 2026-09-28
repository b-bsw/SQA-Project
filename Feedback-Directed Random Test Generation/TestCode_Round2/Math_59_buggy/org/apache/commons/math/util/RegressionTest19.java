package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

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
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.019070115239284053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0192531112878567d + "'", double1 == 1.0192531112878567d);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11014L, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9210231484373848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.008678526287959096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        double double2 = org.apache.commons.math.util.FastMath.max(3.8340465493115374E43d, 1.4726612473342131E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8340465493115374E43d + "'", double2 == 3.8340465493115374E43d);
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2246467991473532E-16d) + "'", double1 == (-1.2246467991473532E-16d));
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5982251431131133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.27577589899106d) + "'", double1 == (-34.27577589899106d));
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        int int1 = org.apache.commons.math.util.FastMath.round(3.9481478E13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.094712547261101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8658666377179234d + "'", double1 == 0.8658666377179234d);
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7591415563789915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7591415563789916d + "'", double1 == 0.7591415563789916d);
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8954124969826761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6251969292911949d + "'", double1 == 0.6251969292911949d);
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.41884530877048626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) (-90));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.6390573296152584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2085905988795835d + "'", double1 == 1.2085905988795835d);
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        int int1 = org.apache.commons.math.util.FastMath.round(90.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7771211630872612d, 0.07695912379014387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07695912379014387d + "'", double2 == 0.07695912379014387d);
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5729063682998855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.542076640466978d + "'", double1 == 0.542076640466978d);
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) 5507L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0665578081381937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6247763546367353d + "'", double1 == 1.6247763546367353d);
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, 11014.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11014.0f + "'", float2 == 11014.0f);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-90), (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5087165920964498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17860766651630908d + "'", double1 == 0.17860766651630908d);
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-5.625384808364832E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.818148659763657E-6d) + "'", double1 == (-9.818148659763657E-6d));
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.3582216239154814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4975101841521485d + "'", double1 == 1.4975101841521485d);
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7134711286662471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8942185941087609d + "'", double1 == 0.8942185941087609d);
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2273817004129048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9416104378179703d + "'", double1 == 0.9416104378179703d);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.23669574761529574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0281434657352284d + "'", double1 == 1.0281434657352284d);
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.07127715650414634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07127715650414634d + "'", double1 == 0.07127715650414634d);
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.3012989023072943d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.058968184019892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2721838516383022d + "'", double1 == 1.2721838516383022d);
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7997951320060821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5876728428724609d + "'", double1 == 0.5876728428724609d);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3924150230910621d, 0.3752021393940158d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3924150230910621d + "'", double2 == 1.3924150230910621d);
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9559709842120365d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8833851034664961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0028467388584879d + "'", double1 == 1.0028467388584879d);
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.009256104707412106d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9330817719775168d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        int int2 = org.apache.commons.math.util.FastMath.max((-90), 6013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6013 + "'", int2 == 6013);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6983819079412873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0104969050107275d + "'", double1 == 2.0104969050107275d);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.359770220129362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34501162170677324d + "'", double1 == 0.34501162170677324d);
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.01204168896484698d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8134592121885016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.147355184182097d + "'", double1 == 3.147355184182097d);
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9821933800072388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4980506396634663d) + "'", double1 == (-1.4980506396634663d));
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6416439271862105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0262281700866953d) + "'", double1 == (-1.0262281700866953d));
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9756299818288702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8280552495725928d) + "'", double1 == (-0.8280552495725928d));
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-70.66879307167105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2107461918092115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5571007519706128d) + "'", double1 == (-1.5571007519706128d));
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9630272572571656d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.454221088609291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9202997082519613d + "'", double1 == 0.9202997082519613d);
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5401776706283436E45d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5249037881284782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.806665040322384d) + "'", double1 == (-0.806665040322384d));
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        float float1 = org.apache.commons.math.util.FastMath.abs(71.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 71.0f + "'", float1 == 71.0f);
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.720075976020836E-43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.720075976020836E-43d + "'", double1 == 3.720075976020836E-43d);
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8334224771468441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.100975548671853d + "'", double1 == 1.100975548671853d);
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.7182819603591994d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.1650012094878277d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8614641037356726d) + "'", double1 == (-0.8614641037356726d));
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9656414365486929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6502731920226421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8663604471187333d + "'", double1 == 0.8663604471187333d);
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2969610063487869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7527638666111103d + "'", double1 == 0.7527638666111103d);
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        double double2 = org.apache.commons.math.util.FastMath.max(53.0d, (-0.39434669070330697d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.0d + "'", double2 == 53.0d);
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9336979767153191d, (-0.7551415795108877d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2508585468745586d + "'", double2 == 2.2508585468745586d);
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        int int2 = org.apache.commons.math.util.FastMath.min(71, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6441005621312442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6441005621312442d + "'", double1 == 0.6441005621312442d);
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        double double1 = org.apache.commons.math.util.FastMath.acos((-5.195945676325781d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.147784570106808d, 0.9562768485549252d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8976543336734655d + "'", double2 == 3.8976543336734655d);
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4661996943871322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44949479120381985d + "'", double1 == 0.44949479120381985d);
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.23606797749979d + "'", double1 == 2.23606797749979d);
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.021873826022441593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02187731563898631d + "'", double1 == 0.02187731563898631d);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.4402149326390393E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06248983243787372d) + "'", double1 == (-0.06248983243787372d));
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        int int1 = org.apache.commons.math.util.FastMath.abs(71);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 71 + "'", int1 == 71);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2814145124371763d, (-0.7893309947689875d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8222374069787943d + "'", double2 == 0.8222374069787943d);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.10715694715827395d), 1.1621487420178873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10715694715827395d) + "'", double2 == (-0.10715694715827395d));
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5498264316201034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        float float2 = org.apache.commons.math.util.FastMath.max(36.0f, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5574243910829566d, 1.5874010519681996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574243910829566d + "'", double2 == 1.5574243910829566d);
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        int int1 = org.apache.commons.math.util.FastMath.abs(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9555984013705581d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5771201712143844d + "'", double1 == 0.5771201712143844d);
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        long long2 = org.apache.commons.math.util.FastMath.max(11014L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11014L + "'", long2 == 11014L);
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6476859432225454d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1312996469029764d, (-0.9224795186524118d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9224795186524118d) + "'", double2 == (-0.9224795186524118d));
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.67205714044531d), 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000000000001d + "'", double2 == 100.00000000000001d);
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.013777192971961798d, (-1.7591770905221553d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013777192971961796d + "'", double2 == 0.013777192971961796d);
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6013L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.23669574761529574d, (-0.31656378283939074d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23669574761529572d + "'", double2 == 0.23669574761529572d);
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.8414398880534d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-48.21095429942027d) + "'", double1 == (-48.21095429942027d));
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 29L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.019016309312897425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5517788711824279d + "'", double1 == 1.5517788711824279d);
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.7316602644632267d), 0.0027078409703792795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7316602644632266d) + "'", double2 == (-0.7316602644632266d));
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.989874861238103d, 1.2697583504133625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9898748612381031d + "'", double2 == 0.9898748612381031d);
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        double double2 = org.apache.commons.math.util.FastMath.pow(11.016627609179162d, 0.13660857585579214d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3878827715657591d + "'", double2 == 1.3878827715657591d);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        double double1 = org.apache.commons.math.util.FastMath.atan((-323.00518534745174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.567700411154953d) + "'", double1 == (-1.567700411154953d));
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.09216692107539105d), (-0.37562335430237803d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09216692107539107d) + "'", double2 == (-0.09216692107539107d));
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.647848572923603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6478485729236031d + "'", double1 == 0.6478485729236031d);
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.062883717585775d) + "'", double1 == (-1.062883717585775d));
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.3025850929940455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 90, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8775719214756793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.410422107258703d + "'", double1 == 1.410422107258703d);
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.57070552693625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624249526606607d + "'", double1 == 1.1624249526606607d);
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.07906310090586803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07906310090586803d + "'", double1 == 0.07906310090586803d);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.7951386301113977d), 1.5707963267948903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7951386301113976d) + "'", double2 == (-0.7951386301113976d));
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 17);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 17L + "'", long1 == 17L);
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.030429149482917455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0004630022932368d + "'", double1 == 1.0004630022932368d);
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.653470809708786d, 3.002737247938193d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 651.832966873273d + "'", double2 == 651.832966873273d);
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.002246839098482782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0022443168449018435d) + "'", double1 == (-0.0022443168449018435d));
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.19736244536848485d, (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0037954134170803035d + "'", double2 == 0.0037954134170803035d);
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.1864864243075482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18542208601251506d) + "'", double1 == (-0.18542208601251506d));
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.678421832629247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9707650795890375d + "'", double1 == 1.9707650795890375d);
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2897566425056355d, 1.2721838516383022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2897566425056353d + "'", double2 == 1.2897566425056353d);
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9984579799537394d + "'", double1 == 0.9984579799537394d);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.559554101740052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8414709825806045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5707963309172037d + "'", double1 == 0.5707963309172037d);
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5149035983190735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.665951357920044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6659513579200441d + "'", double1 == 0.6659513579200441d);
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6489866703054372d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        double double1 = org.apache.commons.math.util.FastMath.log(0.171295457330502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7643653927981933d) + "'", double1 == (-1.7643653927981933d));
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9836065573770493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771338887377972d + "'", double1 == 0.7771338887377972d);
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, (float) 90);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9489846193555862d + "'", double1 == 0.9489846193555862d);
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.7672004358010963E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7672004174045555E-4d) + "'", double1 == (-1.7672004174045555E-4d));
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7864052920748482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.6647371013175847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9727467861776913d + "'", double1 == 1.9727467861776913d);
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.26241737750193517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6402223978891265d) + "'", double1 == (-0.6402223978891265d));
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-33), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.8317095147254143d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6659513579200441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40653864726510774d) + "'", double1 == (-0.40653864726510774d));
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        double double1 = org.apache.commons.math.util.FastMath.abs(267143.4231367569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 267143.4231367569d + "'", double1 == 267143.4231367569d);
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        float float1 = org.apache.commons.math.util.FastMath.abs(29.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 29.0f + "'", float1 == 29.0f);
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.32821156205036844d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6632456843634443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7251472932252412d + "'", double1 == 0.7251472932252412d);
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        double double1 = org.apache.commons.math.util.FastMath.floor(802.1409131831525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 802.0d + "'", double1 == 802.0d);
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        double double2 = org.apache.commons.math.util.FastMath.min(2.446339936306401d, (-0.017201666660802303d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017201666660802303d) + "'", double2 == (-0.017201666660802303d));
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, 6013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6013L + "'", long2 == 6013L);
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        long long2 = org.apache.commons.math.util.FastMath.max(11014L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11014L + "'", long2 == 11014L);
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.4636005855219394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099613d + "'", double1 == 5.916079783099613d);
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8925588891839019d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4254875655208386d + "'", double1 == 1.4254875655208386d);
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5408008620104859d, (-0.6969795110075692d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6969795110075692d) + "'", double2 == (-0.6969795110075692d));
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.23005929548649254d), 0.9181093036277246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9181093036277246d + "'", double2 == 0.9181093036277246d);
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.06558580471017249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        double double2 = org.apache.commons.math.util.FastMath.min(0.004063517469127154d, 1.9727467861776913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004063517469127154d + "'", double2 == 0.004063517469127154d);
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2529698293414318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.49410356540874d + "'", double1 == 14.49410356540874d);
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8775719214756793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01531651945280374d + "'", double1 == 0.01531651945280374d);
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.5707963267948961d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.835879646400314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.258344333583363d + "'", double1 == 2.258344333583363d);
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6637128698018219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9419893188986549d + "'", double1 == 0.9419893188986549d);
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5604132228496979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.40509196569448d + "'", double1 == 89.40509196569448d);
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0670681823548809d, 0.4666679623365474d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0670681823548807d + "'", double2 == 1.0670681823548807d);
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6931471784987917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        double double1 = org.apache.commons.math.util.FastMath.signum(45.84432220279326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 7);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.15845888697098034d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8534580513152825d + "'", double1 == 0.8534580513152825d);
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6733112569964226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5925886082396253d + "'", double1 == 0.5925886082396253d);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.2225981852327883d, 0.022920741006617788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22259818523278826d + "'", double2 == 0.22259818523278826d);
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.105907167423105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.36381322661163d + "'", double1 == 63.36381322661163d);
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7165046169049563d, 9.079985986933499E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.079985986933499E-5d + "'", double2 == 9.079985986933499E-5d);
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8028961524453898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014013181411766374d) + "'", double1 == (-0.014013181411766374d));
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7456241416655579d), 1.7927826916006487E-8d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8826100432229077d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.005302282169720471d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005302331860359104d) + "'", double1 == (-0.005302331860359104d));
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2785049464395442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6564066410604092d + "'", double1 == 1.6564066410604092d);
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.02710278633615723d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.597902432336771d + "'", double1 == 1.597902432336771d);
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5805651145852763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44041795078162516d) + "'", double1 == (-0.44041795078162516d));
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-23.60718109841417d), 0.19315418360439146d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-23.607181098414166d) + "'", double2 == (-23.607181098414166d));
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2979L, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.8325451219316489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3537153031312192d + "'", double1 == 1.3537153031312192d);
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.38186809209174843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38186809209174843d + "'", double1 == 0.38186809209174843d);
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.7475755061678413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.770334657803741d + "'", double1 == 7.770334657803741d);
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4865138719659448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.105907167423105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04371867274808299d + "'", double1 == 0.04371867274808299d);
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.194012623990515E-40d, 0.9448615067357444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1712983501888013E-37d + "'", double2 == 1.1712983501888013E-37d);
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-5.220801521793462d), 1.6019895799783384d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.220801521793461d) + "'", double2 == (-5.220801521793461d));
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.060912694476906684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        long long1 = org.apache.commons.math.util.FastMath.round(0.32269275245300827d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.016996106527921995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.233403117511217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.743521917312986d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963118937354d) + "'", double1 == (-1.5707963118937354d));
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0378042825874918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3752021393940158d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5309649148733978d), (-2.189396403106622E14d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.189396403106622E14d) + "'", double2 == (-2.189396403106622E14d));
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9210231484373848d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5799604581126996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.854763840917356d + "'", double1 == 4.854763840917356d);
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-34), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.024740716872890877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0247457666838856d + "'", double1 == 0.0247457666838856d);
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5539604722352263d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1496153595671315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8176266148677768d + "'", double1 == 0.8176266148677768d);
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.6163607106837756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2057193346742117d + "'", double1 == 1.2057193346742117d);
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (-34.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.21427338765548834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21427338765548837d + "'", double1 == 0.21427338765548837d);
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.2490457723982544d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9699398265477828d, (-0.6483608274590855d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0199858747819772d + "'", double2 == 1.0199858747819772d);
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8359985288256988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.580846352739766d + "'", double1 == 0.580846352739766d);
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5645889449111796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6333607271364543d + "'", double1 == 0.6333607271364543d);
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7219067166708868d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        double double1 = org.apache.commons.math.util.FastMath.cosh(22025.465794806678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.009616414459745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.447927813732619d + "'", double1 == 1.447927813732619d);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7951386301113976d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2717104239752093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7214242713895027d + "'", double1 == 0.7214242713895027d);
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        double double1 = org.apache.commons.math.util.FastMath.log10((-34.657359027997266d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8848257745809853d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.004888098971863d) + "'", double1 == (-1.004888098971863d));
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8882856957001204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.942489095799055d + "'", double1 == 0.942489095799055d);
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 71L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 71.0f + "'", float1 == 71.0f);
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 7, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.95887644469623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01673555107976653d + "'", double1 == 0.01673555107976653d);
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9680095228539631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        double double1 = org.apache.commons.math.util.FastMath.tanh(36.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2319121888608562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09057975226646062d + "'", double1 == 0.09057975226646062d);
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.030289126640769458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7581626343846964d), 1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3634071724291435d) + "'", double2 == (-0.3634071724291435d));
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0014803119673161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.1972245773362196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4239994887637555d + "'", double1 == 1.4239994887637555d);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.017168240873498188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001473778672423d + "'", double1 == 1.0001473778672423d);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.2679097336560172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03958249199032516d + "'", double1 == 0.03958249199032516d);
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        double double2 = org.apache.commons.math.util.FastMath.pow(12.905667754637493d, 0.9216936941393117d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.563293926894685d + "'", double2 == 10.563293926894685d);
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.06669520249694419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1759054045248034d) + "'", double1 == (-1.1759054045248034d));
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        double double1 = org.apache.commons.math.util.FastMath.asin((-31.17011361997944d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.5596856728972892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.559685672897289d) + "'", double1 == (-1.559685672897289d));
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.05360906381648784d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.030694434124892367d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.758661529898663d) + "'", double1 == (-1.758661529898663d));
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.4958174067642112d), (-0.023008927771751345d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.49581740676421115d) + "'", double2 == (-0.49581740676421115d));
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        double double1 = org.apache.commons.math.util.FastMath.sinh(134.38863804832192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1566818986982416E58d + "'", double1 == 1.1566818986982416E58d);
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4390113332958665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1995879848080617d + "'", double1 == 1.1995879848080617d);
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.05934737555189802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05765303507148915d + "'", double1 == 0.05765303507148915d);
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        double double1 = org.apache.commons.math.util.FastMath.exp(172.4066401663162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.503302708588075E74d + "'", double1 == 7.503302708588075E74d);
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 71);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 71 + "'", int1 == 71);
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.0020940267144425725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.002094028244809242d) + "'", double1 == (-0.002094028244809242d));
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5520883433674829d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6079788782430797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6079788782430798d + "'", double1 == 0.6079788782430798d);
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.012209562553744127d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000074537634835d + "'", double1 == 1.000074537634835d);
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.064947548056719E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5821318123417665E-10d + "'", double1 == 1.5821318123417665E-10d);
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0053823416929744E-87d, (-0.21517385352860152d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5113565640720369d), 0.9562768485549252d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5113565640720369d) + "'", double2 == (-0.5113565640720369d));
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.385765023619431d, 0.656559119563622d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5009574461406576d + "'", double2 == 1.5009574461406576d);
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5664325882614676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.231057343412815d + "'", double1 == 1.231057343412815d);
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7976186295363398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6474596233595173d + "'", double1 == 0.6474596233595173d);
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.18542208601251506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18437568573942736d) + "'", double1 == (-0.18437568573942736d));
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3619730303123129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4361602086457457d + "'", double1 == 1.4361602086457457d);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        double double2 = org.apache.commons.math.util.FastMath.max((-6.0d), (-0.888945622903398d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.888945622903398d) + "'", double2 == (-0.888945622903398d));
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.305963675522467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.687276356591784d + "'", double1 == 3.687276356591784d);
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.1552397460307036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8833851034664961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8833851034664961d + "'", double1 == 0.8833851034664961d);
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-5.420324011058295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.002394787391724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0994102326899926d + "'", double1 == 1.0994102326899926d);
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000000485233538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000485233538d + "'", double1 == 1.0000000485233538d);
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4710002483851392d, (-295452.57150105695d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-295452.57150105695d) + "'", double2 == (-295452.57150105695d));
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.3477990933099977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6632456843634443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4106097927876521d) + "'", double1 == (-0.4106097927876521d));
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.5150224550074456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.37029424927264715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6085180763729596d + "'", double1 == 0.6085180763729596d);
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0199858747819772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019788778947328264d + "'", double1 == 0.019788778947328264d);
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9376558078861459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7350525871447157d + "'", double1 == 0.7350525871447157d);
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.419447390606458d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4080306616096118d) + "'", double1 == (-0.4080306616096118d));
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0012070607874443988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012070602012174342d + "'", double1 == 0.0012070602012174342d);
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3211090992020038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0912561694388279d + "'", double1 == 1.0912561694388279d);
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5507L, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5515659755035025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2456187119273308d + "'", double1 == 1.2456187119273308d);
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3080927484239062d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.07127715650414634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.083880243381031d) + "'", double1 == (-4.083880243381031d));
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1304898565991703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        long long2 = org.apache.commons.math.util.FastMath.min((-34L), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        double double1 = org.apache.commons.math.util.FastMath.expm1(56.080597841306755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2672227163137274E24d + "'", double1 == 2.2672227163137274E24d);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8001776796227965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.846803902957575d + "'", double1 == 45.846803902957575d);
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8100237733214719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9999273357849807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5429952438167436d + "'", double1 == 1.5429952438167436d);
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        double double1 = org.apache.commons.math.util.FastMath.ceil(157.88718339239696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 158.0d + "'", double1 == 158.0d);
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.16454021803458782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8890235927828648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2548842878774133d, (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06496600020677609d + "'", double2 == 0.06496600020677609d);
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5330785122775574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.4215467286739085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04226396340625749d + "'", double1 == 0.04226396340625749d);
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9092974268256817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.026582642806498483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026588906887994646d) + "'", double1 == (-0.026588906887994646d));
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8280552495725928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6916152449466102d) + "'", double1 == (-0.6916152449466102d));
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.02263623983076541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-37.109670996601714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2126.227527224318d) + "'", double1 == (-2126.227527224318d));
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.005846743218731832d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999829078455577d + "'", double1 == 0.9999829078455577d);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5847565194232731E-6d, 1.2499132869489418d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2499132869489418d + "'", double2 == 1.2499132869489418d);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.027958762301768844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027955121057188472d + "'", double1 == 0.027955121057188472d);
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.12519657666689096d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12552389208665898d) + "'", double1 == (-0.12552389208665898d));
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8456633445388351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3295225782386861d + "'", double1 == 1.3295225782386861d);
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        int int2 = org.apache.commons.math.util.FastMath.max((-34), 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7451749797335945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1068100517911474d + "'", double1 == 1.1068100517911474d);
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        double double2 = org.apache.commons.math.util.FastMath.max(1.161865024476282d, (-0.929562688685152d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.161865024476282d + "'", double2 == 1.161865024476282d);
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6099535495393804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8196746269186107d + "'", double1 == 0.8196746269186107d);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000235882221555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29713101865805d + "'", double1 == 57.29713101865805d);
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.1036763924831257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8613475249030852d + "'", double1 == 0.8613475249030852d);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 36, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0989696018380017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.00107213104154d + "'", double1 == 2.00107213104154d);
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-89.2328896037985d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.846254174356267d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        int int2 = org.apache.commons.math.util.FastMath.max(71, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.005703194797602166d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005703225715483292d) + "'", double1 == (-0.005703225715483292d));
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.011658811940024917d, 0.10642219731928483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6226573258169047d + "'", double2 == 0.6226573258169047d);
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.277993323981788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0388896294536023d + "'", double1 == 1.0388896294536023d);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        long long1 = org.apache.commons.math.util.FastMath.round(0.899352280489793d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3368167172784004d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4025621091978446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1564822793522844d + "'", double1 == 1.1564822793522844d);
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.05167897363437805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.019682439712373E-4d + "'", double1 == 9.019682439712373E-4d);
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1493173174225013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0035978893317443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.501923386946416d + "'", double1 == 57.501923386946416d);
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6371507370823788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8037940665831735d + "'", double1 == 0.8037940665831735d);
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        long long2 = org.apache.commons.math.util.FastMath.max(108L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0681780852520792E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267842149d + "'", double1 == 1.5707963267842149d);
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7620587253843047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9920529280129464d + "'", double1 == 0.9920529280129464d);
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.9615319455195346d, 51.68565583622363d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03793298160151566d + "'", double2 == 0.03793298160151566d);
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9262160379374064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39604951489229284d + "'", double1 == 0.39604951489229284d);
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9821938415578451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9910569315422021d + "'", double1 == 0.9910569315422021d);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3940358404305488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0310860881465d + "'", double1 == 3.0310860881465d);
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.864756827404103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5261303806882357d + "'", double1 == 0.5261303806882357d);
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4494947912038199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9006667358439738d + "'", double1 == 0.9006667358439738d);
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.0269835496406734d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        long long1 = org.apache.commons.math.util.FastMath.round(9.999999999999996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-34.27577589899106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9878500592531264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7564440907858547d + "'", double1 == 0.7564440907858547d);
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6264661237378711d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9823087547858228d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0247457666838856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4882636763637982d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9260406133217521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7287425554071109d + "'", double1 == 0.7287425554071109d);
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.05360906381648784d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05358338937456895d) + "'", double1 == (-0.05358338937456895d));
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5705448125620591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.508599748588585d + "'", double1 == 2.508599748588585d);
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.688117141816098E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.69314718055993d + "'", double1 == 100.69314718055993d);
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7893750108307106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10271662614180663d) + "'", double1 == (-0.10271662614180663d));
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 2.1972245773362196d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1972245773362196d + "'", double2 == 2.1972245773362196d);
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8456633445388351d, 9.079986011887159E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.845663344538835d + "'", double2 == 0.845663344538835d);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.202619401730384d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        double double1 = org.apache.commons.math.util.FastMath.acos((-89.2328896037985d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.100975548671853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6698223371050964d + "'", double1 == 1.6698223371050964d);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.460256182988026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.008491621662199392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.482067568390531E-4d) + "'", double1 == (-1.482067568390531E-4d));
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.999696121897531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024653336246160933d + "'", double1 == 0.024653336246160933d);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.12519657666689096d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9921731399155099d + "'", double1 == 0.9921731399155099d);
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.19374578338773524d), 1.0E-323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-323d + "'", double2 == 1.0E-323d);
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.382485449398286d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0039823074904044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7873853577122644d + "'", double1 == 0.7873853577122644d);
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7850009775214999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7073875782300506d + "'", double1 == 0.7073875782300506d);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-36), 29L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0438800790430118d, 2.0392740995950414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0915250460768902d + "'", double2 == 1.0915250460768902d);
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2319121888608562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.837025241619279d + "'", double1 == 2.837025241619279d);
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.180265029949425E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.153426409720026d + "'", double1 == 48.153426409720026d);
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        int int1 = org.apache.commons.math.util.FastMath.abs(6013);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6013 + "'", int1 == 6013);
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.4867844010000003E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9122047800512979d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.432748222320811d) + "'", double1 == (-2.432748222320811d));
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.08309759227292604d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        float float2 = org.apache.commons.math.util.FastMath.max(6013.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.685230123174956d), 0.0069604799381786375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0069604799381786375d + "'", double2 == 0.0069604799381786375d);
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.022634307143927467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022636240226945933d + "'", double1 == 0.022636240226945933d);
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.940894492205956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9596048732690908d + "'", double1 == 0.9596048732690908d);
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8495476049206573d, (-1.0432322944097694d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8495476049206572d + "'", double2 == 0.8495476049206572d);
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7771338887377972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0380929887365897d + "'", double1 == 1.0380929887365897d);
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4048061113733491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6362437515397296d + "'", double1 == 0.6362437515397296d);
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.032112426622988d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5981526294336509d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6814282087882807d) + "'", double1 == (-0.6814282087882807d));
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0011640508788560195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.30557148829374003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3103491412658586d + "'", double1 == 0.3103491412658586d);
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8414709848078982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.118939603184956d + "'", double1 == 1.118939603184956d);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5395564933646286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9969953215678267d + "'", double1 == 0.9969953215678267d);
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5841716915979767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1998022483852957d + "'", double1 == 0.1998022483852957d);
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8804592237999825d), 1.258095456729151d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        float float1 = org.apache.commons.math.util.FastMath.abs(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9792875536939664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        int int2 = org.apache.commons.math.util.FastMath.min(71, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5805122465509817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010131850050463726d + "'", double1 == 0.010131850050463726d);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        double double1 = org.apache.commons.math.util.FastMath.sin(944.8154734160571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7200784113756983d + "'", double1 == 0.7200784113756983d);
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        double double1 = org.apache.commons.math.util.FastMath.ulp(114.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3946872830200803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.04074367013117616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03993552504819818d + "'", double1 == 0.03993552504819818d);
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5847577751512122E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707947420371215d + "'", double1 == 1.5707947420371215d);
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        double double2 = org.apache.commons.math.util.FastMath.max(5557.6906127689845d, 1.3946872830200805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5557.6906127689845d + "'", double2 == 5557.6906127689845d);
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        double double1 = org.apache.commons.math.util.FastMath.cos((-6.755849220270756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8903586764423898d + "'", double1 == 0.8903586764423898d);
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.827444419368825E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.827444420534037E-10d + "'", double1 == 4.827444420534037E-10d);
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 36L, 2.147483648E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.0d + "'", double2 == 36.0d);
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 29);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7480575296890003d) + "'", double1 == (-0.7480575296890003d));
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.40308433762500984d), (-0.1283791160097205d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.05660497324994224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05657478853562705d + "'", double1 == 0.05657478853562705d);
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        double double1 = org.apache.commons.math.util.FastMath.log(104.03529443571144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644730211142693d + "'", double1 == 4.644730211142693d);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, 11014.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1525354798260945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1662106041552343d + "'", double1 == 2.1662106041552343d);
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 6, (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0150241067016164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8494932706978892d + "'", double1 == 0.8494932706978892d);
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7781512503836436d + "'", double1 == 0.7781512503836436d);
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        double double1 = org.apache.commons.math.util.FastMath.atan((-4.481404746557165d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3512488509041904d) + "'", double1 == (-1.3512488509041904d));
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.00833887421809711d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00833868093719903d) + "'", double1 == (-0.00833868093719903d));
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5054831794681595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5054831794681595d + "'", double1 == 0.5054831794681595d);
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.549535562644912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-4.041914822914973d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5929264332263298d) + "'", double1 == (-1.5929264332263298d));
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.25682580430988977d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25682580430988977d + "'", double1 == 0.25682580430988977d);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999492312032946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813376876034794d + "'", double1 == 0.8813376876034794d);
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8163415799735064d) + "'", double1 == (-0.8163415799735064d));
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        double double1 = org.apache.commons.math.util.FastMath.cosh(24.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3244561064921736E10d + "'", double1 == 1.3244561064921736E10d);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8211080655056973d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5341459860801647d + "'", double1 == 2.5341459860801647d);
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4338050377373402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.155506665128233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.20388401007638224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3654726893064435d + "'", double1 == 1.3654726893064435d);
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 6013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6013 + "'", int2 == 6013);
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8766799477951029d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7914324887867012d) + "'", double1 == (-0.7914324887867012d));
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        double double1 = org.apache.commons.math.util.FastMath.rint(11.016627609179162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.188918746291335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1889187462913355d + "'", double1 == 3.1889187462913355d);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.0812030006757882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791028787322563d + "'", double1 == 1.791028787322563d);
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5487703736876421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.15698841623704d + "'", double1 == 1.15698841623704d);
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.030289126640769458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.09247351917780995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        long long1 = org.apache.commons.math.util.FastMath.round(0.46557874873944705d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        double double1 = org.apache.commons.math.util.FastMath.log(0.41085053990380177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8895257804916458d) + "'", double1 == (-0.8895257804916458d));
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.289982084979077E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.289982084979077E-25d + "'", double1 == 4.289982084979077E-25d);
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.079986049317652E-5d, 1.5304588276885431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.932852210325525E-5d + "'", double2 == 5.932852210325525E-5d);
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.8962960182679E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.016713642648393184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01657550676741703d + "'", double1 == 0.01657550676741703d);
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        double double1 = org.apache.commons.math.util.FastMath.ulp(46.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6563678204210392d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.013658276325773256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013657427110447254d + "'", double1 == 0.013657427110447254d);
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7032375600859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.740476385691844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7404763856918442d + "'", double1 == 0.7404763856918442d);
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.113820254782413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.687137475366684d + "'", double1 == 1.687137475366684d);
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6033871039701522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.919567136057255d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.644730211142693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.730722403925016d + "'", double1 == 1.730722403925016d);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6176678238363069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        int int1 = org.apache.commons.math.util.FastMath.round(17.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5982251431131134d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.6339015320914385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.469482074719316d) + "'", double1 == (-0.469482074719316d));
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.872983346207419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2624.3863527812487d + "'", double1 == 2624.3863527812487d);
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8298698279324331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.062778942642255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        long long2 = org.apache.commons.math.util.FastMath.min(71L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 71, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 71L + "'", long2 == 71L);
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.09688642602692299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09673491867096075d + "'", double1 == 0.09673491867096075d);
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-32.999999999999886d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.207534329995823d) + "'", double1 == (-3.207534329995823d));
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-6.838249024841735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.838249024841734d) + "'", double1 == (-6.838249024841734d));
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.4636005855219394d, (-0.7070668111573262d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5286078857115426d + "'", double2 == 0.5286078857115426d);
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.1690152019850792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.017019484439497464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016876275623798696d + "'", double1 == 0.016876275623798696d);
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.15443469003188384E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.052495160685712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6035270795055018d), 5.298292365610484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.298292365610484d + "'", double2 == 5.298292365610484d);
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        double double1 = org.apache.commons.math.util.FastMath.log10(179.53879335695746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2541583020539764d + "'", double1 == 2.2541583020539764d);
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        double double2 = org.apache.commons.math.util.FastMath.min(6.585445079827193E-10d, 0.4961516657893783d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.585445079827193E-10d + "'", double2 == 6.585445079827193E-10d);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.12011467247130482d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2225981852327883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.03624593110524417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03624593110524418d + "'", double1 == 0.03624593110524418d);
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.4402149326390393E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4402148842036297E-4d) + "'", double1 == (-2.4402148842036297E-4d));
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7480575296890003d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7480575296890003d + "'", double1 == 0.7480575296890003d);
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 17, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.3025850929940455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1947055233182953d + "'", double1 == 1.1947055233182953d);
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 71.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.140817749422853d + "'", double1 == 4.140817749422853d);
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8069622770304092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3808196560341963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3808196560341965d + "'", double1 == 1.3808196560341965d);
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.846254174356267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42901895608316976d + "'", double1 == 0.42901895608316976d);
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        long long2 = org.apache.commons.math.util.FastMath.min(90L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.22456543400577147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22649705709056728d) + "'", double1 == (-0.22649705709056728d));
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.6128994572096305d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 33L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6006713379737495d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6006713379737494d) + "'", double1 == (-0.6006713379737494d));
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0732178989295803E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.07321789892959E14d) + "'", double1 == (-1.07321789892959E14d));
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        double double1 = org.apache.commons.math.util.FastMath.exp(40.07963789922157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.54897500189811968E17d + "'", double1 == 2.54897500189811968E17d);
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.015186210510312992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.555609532514182d + "'", double1 == 1.555609532514182d);
    }
}

