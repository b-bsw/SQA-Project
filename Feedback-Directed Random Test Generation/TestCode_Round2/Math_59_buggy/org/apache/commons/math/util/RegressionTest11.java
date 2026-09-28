package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0926371180390901d, 2.44278822716643d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0926371180390901d + "'", double2 == 1.0926371180390901d);
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.46285676099588835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4477456903937542d + "'", double1 == 0.4477456903937542d);
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9036922050915067d), 2.4636005855219394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9036922050915067d) + "'", double2 == (-0.9036922050915067d));
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.455197646070681E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000014552d + "'", double1 == 1.000000000014552d);
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9933731825245955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8766799477951029d) + "'", double1 == (-0.8766799477951029d));
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.005402996770772377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0054176192810886d + "'", double1 == 1.0054176192810886d);
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.3786185863965946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9590996386404558d + "'", double1 == 1.9590996386404558d);
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 52.0f, (-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6709975465431064d + "'", double2 == 1.6709975465431064d);
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.6516488549852542E98d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6516488549852542E98d + "'", double1 == 1.6516488549852542E98d);
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.04726063612294401d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.047260636122944004d) + "'", double1 == (-0.047260636122944004d));
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6743332553663808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8186478528670488d + "'", double1 == 0.8186478528670488d);
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5847565194252626E-6d, (-1.995200412208242d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.995200412208242d) + "'", double2 == (-1.995200412208242d));
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.17129545733050197d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8064012322901598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1166520329440919d + "'", double1 == 1.1166520329440919d);
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.017168240873498188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13102763400709863d + "'", double1 == 0.13102763400709863d);
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9869537583815866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005703194797602166d) + "'", double1 == (-0.005703194797602166d));
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.004375718651318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.228462604887648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8875615125666743d + "'", double1 == 0.8875615125666743d);
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7453292519943298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3211090992020038d + "'", double1 == 1.3211090992020038d);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0653122583386827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0653122583386827d + "'", double1 == 1.0653122583386827d);
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        double double1 = org.apache.commons.math.util.FastMath.signum(65.86430060990239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.01565305086940654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.20401567913623667d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015840105828908848d + "'", double1 == 0.015840105828908848d);
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9110895402590333d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.1556157735575975E15d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 108);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6046661120266558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.830640877860784d + "'", double1 == 1.830640877860784d);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7074275585391845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9906804649613175d + "'", double1 == 0.9906804649613175d);
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.42041931513487113d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        long long1 = org.apache.commons.math.util.FastMath.round(31.984371183438945d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.08738234671223125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0876054358307137d + "'", double1 == 0.0876054358307137d);
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.227971924677802d) + "'", double1 == (-5.227971924677802d));
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-5.124738597288386E-4d), 1.4219732045494788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.124738597288385E-4d) + "'", double2 == (-5.124738597288385E-4d));
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        double double1 = org.apache.commons.math.util.FastMath.rint(104.94284158531252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.0d + "'", double1 == 105.0d);
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9707650795890375d, 1.000115286123023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9707617589677336d + "'", double2 == 0.9707617589677336d);
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(62.307354339300744d, 2.319927110848207d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 62.30735433930074d + "'", double2 == 62.30735433930074d);
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-4.025490037428053d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
        double double1 = org.apache.commons.math.util.FastMath.expm1(6.492757420590522E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.492757420590522E-45d + "'", double1 == 6.492757420590522E-45d);
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(16.86085826032837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.860858260328374d + "'", double1 == 16.860858260328374d);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        long long1 = org.apache.commons.math.util.FastMath.round(0.021278590635779134d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-18506.833881249884d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9994780690209127d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8968903759882284d), (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3368167172784004d + "'", double2 == 0.3368167172784004d);
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3495439910201015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21945160292010324d + "'", double1 == 0.21945160292010324d);
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0092021272751517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5539604722352263d + "'", double1 == 1.5539604722352263d);
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9933731825245955d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        double double1 = org.apache.commons.math.util.FastMath.rint(47.204120223528484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.0d + "'", double1 == 47.0d);
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-87.94552649650909d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.732511156817248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.309027772999469d + "'", double1 == 1.309027772999469d);
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.04323229440977d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6304888220754902d), 3.097167320859874E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.097167320859874E-15d + "'", double2 == 3.097167320859874E-15d);
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9979202349577406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5104205015863672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8725391511850262d + "'", double1 == 0.8725391511850262d);
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.7659219106381574E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.656559119563622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6167155214568573d + "'", double1 == 0.6167155214568573d);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.4223506181800103d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42235061818001024d) + "'", double1 == (-0.42235061818001024d));
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-90), 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        double double1 = org.apache.commons.math.util.FastMath.log(0.007916618090901184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.838791173074587d) + "'", double1 == (-4.838791173074587d));
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5507, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.3784483521091646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.20715996628268618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3621252723796604d + "'", double1 == 1.3621252723796604d);
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        long long1 = org.apache.commons.math.util.FastMath.round((-33.96421184743732d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-34L) + "'", long1 == (-34L));
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.722077905488864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7220779054888641d + "'", double1 == 0.7220779054888641d);
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 108L, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0876054358307137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09155734763161848d + "'", double1 == 0.09155734763161848d);
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.010451398135176d + "'", double1 == 2.010451398135176d);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.230201256551786d + "'", double1 == 4.230201256551786d);
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        int int2 = org.apache.commons.math.util.FastMath.max((-90), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.4221817809573358E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.422181780720488E-5d + "'", double1 == 2.422181780720488E-5d);
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7092677926697085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.6380510645342d + "'", double1 == 40.6380510645342d);
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4894820176053498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8747286807559459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7673695592041386d + "'", double1 == 0.7673695592041386d);
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-2L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7615649143945545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8373449589690629d + "'", double1 == 0.8373449589690629d);
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.002962815258153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07695912379014387d + "'", double1 == 0.07695912379014387d);
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.722077905488864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6706596876784242d + "'", double1 == 0.6706596876784242d);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9651860437766335d, 0.8813736213307353d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8813736213307353d + "'", double2 == 0.8813736213307353d);
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, 7.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.4439747880964912d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-25.437881568144007d) + "'", double1 == (-25.437881568144007d));
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4109688618214138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.203380153948951d + "'", double1 == 6.203380153948951d);
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3368167172784004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3504975430691108d + "'", double1 == 0.3504975430691108d);
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.223372036854776E18d, 1.5624644491486637d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.2233720368547748E18d + "'", double2 == 9.2233720368547748E18d);
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.20401567913623667d), 0.991328918078117d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.18818323215214394d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1892958870132881d) + "'", double1 == (-0.1892958870132881d));
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.169015201985079d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', 37.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.12774173556062693d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6377640601517165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8034290448474706d + "'", double1 == 0.8034290448474706d);
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.01745240643728351d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999492312032946d) + "'", double1 == (-0.9999492312032946d));
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9159682453057105d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 108.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108.0d + "'", double1 == 108.0d);
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.2328896037985d) + "'", double1 == (-89.2328896037985d));
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5805651145852763d), 48980.58846231743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5805651145852762d) + "'", double2 == (-0.5805651145852762d));
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8998712981815272d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7734137622334678d, 7.872983056043322d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7734137622334678d + "'", double2 == 0.7734137622334678d);
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(46.23553270010918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8069622770304092d + "'", double1 == 0.8069622770304092d);
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.01195230772972848d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011881162631163577d) + "'", double1 == (-0.011881162631163577d));
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.07352194555034251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07365470632758757d + "'", double1 == 0.07365470632758757d);
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5394005199551674d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8140238328071662d) + "'", double1 == (-0.8140238328071662d));
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (-90.0f), 1.3132565042068824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3132565042068824d + "'", double2 == 1.3132565042068824d);
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.298342365610588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610588d + "'", double1 == 5.298342365610588d);
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9421475168289407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9421475168289407d + "'", double1 == 0.9421475168289407d);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9891860359276023d, 0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9891860359423812d + "'", double2 == 0.9891860359423812d);
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5144957554275267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8705409696704832d + "'", double1 == 0.8705409696704832d);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        double double2 = org.apache.commons.math.util.FastMath.max(32.826740701209424d, 2.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.826740701209424d + "'", double2 == 32.826740701209424d);
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.7182819603591994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04744297020583402d + "'", double1 == 0.04744297020583402d);
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
        double double2 = org.apache.commons.math.util.FastMath.pow(64.98484500494128d, 1.0176055895227847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 69.94033576878978d + "'", double2 == 69.94033576878978d);
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.21633966230316995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8054616704388724d + "'", double1 == 0.8054616704388724d);
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2697583504133625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9036922050915067d + "'", double1 == 0.9036922050915067d);
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0011640508788560195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0011640511417403306d + "'", double1 == 0.0011640511417403306d);
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1664162281198318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1589375003169518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
        double double1 = org.apache.commons.math.util.FastMath.cos(96.30685281944007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4691048292234631d) + "'", double1 == (-0.4691048292234631d));
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9448615067357443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9448615067357444d + "'", double1 == 0.9448615067357444d);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9694911126077237d + "'", double1 == 0.9694911126077237d);
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 14.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.35430360994810484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0061837645452961654d + "'", double1 == 0.0061837645452961654d);
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8848257745809853d), 3.948148009134034E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3504975430691108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35049754306911085d + "'", double1 == 0.35049754306911085d);
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (-90.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.0950379321938841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9470049559056026d) + "'", double1 == (-0.9470049559056026d));
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2969610063487869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0905417743683503d + "'", double1 == 1.0905417743683503d);
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
        double double1 = org.apache.commons.math.util.FastMath.acos(16.860858260328374d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3940358404305488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.2432260666726136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8450529998374032d + "'", double1 == 1.8450529998374032d);
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3505896985737582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1166520329440919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.979448672399826d + "'", double1 == 63.979448672399826d);
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.1892958870132881d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771211630872612d + "'", double1 == 0.7771211630872612d);
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-4.025490037428053d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1008763214519655d) + "'", double1 == (-2.1008763214519655d));
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5708004490110032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.14206815838939643d), 0.015840105828908848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1420681583893964d) + "'", double2 == (-0.1420681583893964d));
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2944579595063852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9615319455195346d + "'", double1 == 1.9615319455195346d);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.189396403106622E14d), 0.7047567822517627d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.1893964031066216E14d) + "'", double2 == (-2.1893964031066216E14d));
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.465735902799727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9948986146171869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.759443367433797d + "'", double1 == 0.759443367433797d);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5167253890217791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6765286719118557d + "'", double1 == 1.6765286719118557d);
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8028961524453898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.502934118112607d + "'", double1 == 2.502934118112607d);
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6432049175981438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8001776796227965d + "'", double1 == 0.8001776796227965d);
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6983819079412873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.01433581332975d + "'", double1 == 40.01433581332975d);
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5921640937280627d), 0.5975571443282363d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5975571443282363d + "'", double2 == 0.5975571443282363d);
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8966854678967096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4514641735199887d + "'", double1 == 2.4514641735199887d);
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.274526125422991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9282846855324671d + "'", double1 == 1.9282846855324671d);
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 5507L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9873579129275408d), 1.6117713285146709d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5496267729847464d) + "'", double2 == (-0.5496267729847464d));
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        double double1 = org.apache.commons.math.util.FastMath.abs((-6.838249024841735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.838249024841735d + "'", double1 == 6.838249024841735d);
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1653657392500323E-156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1653657392500323E-156d + "'", double1 == 1.1653657392500323E-156d);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732511156817248d + "'", double1 == 3.732511156817248d);
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9406268191575922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5892817163115238d + "'", double1 == 0.5892817163115238d);
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999999999987442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828455632d + "'", double1 == 2.718281828455632d);
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.838315415809956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.838315415809956d + "'", double1 == 0.838315415809956d);
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8132108304247175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0141932065037886d + "'", double1 == 0.0141932065037886d);
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-90.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.800134365783882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.84432220279326d + "'", double1 == 45.84432220279326d);
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.8600694058124533d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-49.27834704137805d) + "'", double1 == (-49.27834704137805d));
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6416439271862105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2130137128033769d + "'", double1 == 1.2130137128033769d);
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        int int2 = org.apache.commons.math.util.FastMath.min((-33), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.765921910638158E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000276592196d + "'", double1 == 1.0000000276592196d);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.010176922302104895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7762080189137147E-4d) + "'", double1 == (-1.7762080189137147E-4d));
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6137261894007203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5467447399008167d + "'", double1 == 0.5467447399008167d);
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        double double1 = org.apache.commons.math.util.FastMath.abs(104.03529443571144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.03529443571144d + "'", double1 == 104.03529443571144d);
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.477888730288475d + "'", double1 == 2.477888730288475d);
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999999686043177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.984871312738818d + "'", double1 == 8.984871312738818d);
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        double double1 = org.apache.commons.math.util.FastMath.sinh(50.71062398595127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.276114056013825E21d + "'", double1 == 5.276114056013825E21d);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8325008986719311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.009213529184899942d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009213398835148425d) + "'", double1 == (-0.009213398835148425d));
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.8943523655438637d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9999989097008681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453273490633612d + "'", double1 == 0.017453273490633612d);
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.698647747478174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.518030890222253E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.30889488193547d + "'", double1 == 91.30889488193547d);
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36L), 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.262122178163566E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948961d + "'", double1 == 1.5707963267948961d);
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8334737036630135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.75452555502814d + "'", double1 == 47.75452555502814d);
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        long long2 = org.apache.commons.math.util.FastMath.max((-34L), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.10475317834218718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5982251431131134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8263364740145374d + "'", double1 == 0.8263364740145374d);
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.147784570106809d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.147784570106809d + "'", double2 == 4.147784570106809d);
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        long long1 = org.apache.commons.math.util.FastMath.round(0.011669273072701132d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        double double2 = org.apache.commons.math.util.FastMath.min((-12.806875836617005d), 0.9607190280136697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-12.806875836617005d) + "'", double2 == (-12.806875836617005d));
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.327581142581999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4882636763637982d + "'", double1 == 1.4882636763637982d);
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8867182812524047d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0901975935206452d) + "'", double1 == (-1.0901975935206452d));
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8816146848906149d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.13381059201667d) + "'", double1 == (-2.13381059201667d));
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        double double2 = org.apache.commons.math.util.FastMath.max(1.568021819492507d, 0.10903143175231947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.568021819492507d + "'", double2 == 1.568021819492507d);
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.647394871191808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7006231354388308d + "'", double1 == 1.7006231354388308d);
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9607190280136697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8127085104657242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8962302130072298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.250448095796382d + "'", double1 == 1.250448095796382d);
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.6991118430775187d, 1.0113012745810993E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015626271689943825d + "'", double1 == 0.015626271689943825d);
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-33), (float) (-34L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.0f) + "'", float2 == (-34.0f));
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        long long2 = org.apache.commons.math.util.FastMath.max(33L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6035270795055018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8285569054478337d + "'", double1 == 1.8285569054478337d);
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.47100149383084566d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1129870129429051d + "'", double1 == 1.1129870129429051d);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9995120760870788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997560082775591d + "'", double1 == 0.9997560082775591d);
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.145735497073049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        double double1 = org.apache.commons.math.util.FastMath.acos(37.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5705465327319668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027411208051953715d + "'", double1 == 0.027411208051953715d);
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9171441568298646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.085665678873264E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.085665678873483E-7d + "'", double1 == 5.085665678873483E-7d);
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9254945977133745E-28d, 0.002895402870311586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8312900536850981d + "'", double2 == 0.8312900536850981d);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04339396978120386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.043421238074122556d + "'", double1 == 0.043421238074122556d);
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.0029628152581527d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5378068149834339d + "'", double1 == 0.5378068149834339d);
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.857180126010562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.203901115297726d + "'", double1 == 2.203901115297726d);
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3169578969248166d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6176678238363069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.617667823836307d + "'", double1 == 0.617667823836307d);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.10990588764248074d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2532779128893359d, 8.510293288140764E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4726612473342131E-15d + "'", double2 == 1.4726612473342131E-15d);
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.05660497324994224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05654463277833749d + "'", double1 == 0.05654463277833749d);
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4938217385693559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.30642979586841934d) + "'", double1 == (-0.30642979586841934d));
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.2264970570905673d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4430227241169226d, 7.8962960182681E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.610513120227363E-15d + "'", double2 == 5.610513120227363E-15d);
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.1326494772257005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49591180291773657d + "'", double1 == 0.49591180291773657d);
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7071067826440032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7071067826440032d + "'", double1 == 0.7071067826440032d);
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.04744297020583402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988747933673575d + "'", double1 == 0.9988747933673575d);
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.686371961004665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8048.369284881994d + "'", double1 == 8048.369284881994d);
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6657737487535582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7285303219791522d + "'", double1 == 0.7285303219791522d);
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.3012989023072947d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3494089883469367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        double double1 = org.apache.commons.math.util.FastMath.log(0.01134916460125532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.478611141177217d) + "'", double1 == (-4.478611141177217d));
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.872983056043322d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5802053839637673d, 11.016627609179162d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5802053839637674d + "'", double2 == 0.5802053839637674d);
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        double double1 = org.apache.commons.math.util.FastMath.atan(56.21601340753473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.553009677009596d + "'", double1 == 1.553009677009596d);
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3132565042068824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0865078793721343d + "'", double1 == 1.0865078793721343d);
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6301149667385314E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        double double1 = org.apache.commons.math.util.FastMath.floor((-32.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.0d) + "'", double1 == (-33.0d));
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6435011087932844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5717930045758977d + "'", double1 == 0.5717930045758977d);
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.18930738450574d + "'", double1 == 104.18930738450574d);
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.013276747223059479d), 104.18930738450574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.18930738450574d + "'", double2 == 104.18930738450574d);
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0000000485233538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752012685192503d + "'", double1 == 1.1752012685192503d);
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999282021879747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.467337109647484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04306315631998894d + "'", double1 == 0.04306315631998894d);
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
        int int1 = org.apache.commons.math.util.FastMath.round(108.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108 + "'", int1 == 108);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
        double double1 = org.apache.commons.math.util.FastMath.sin(34.026480513893276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5064292449940325d + "'", double1 == 0.5064292449940325d);
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) (-90));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9972986940697113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.14100608410312d + "'", double1 == 57.14100608410312d);
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.6765286719118557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.16429734860675368d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.1694228248157563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        double double1 = org.apache.commons.math.util.FastMath.log(5.610513120227363E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.8141342142776d) + "'", double1 == (-32.8141342142776d));
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.13145613893303287d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13222130708843693d) + "'", double1 == (-0.13222130708843693d));
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.25876123621075164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2646955500554791d + "'", double1 == 0.2646955500554791d);
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0341909072993258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018050036426560695d + "'", double1 == 0.018050036426560695d);
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5661709721771937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 216.1980975168285d + "'", double1 == 216.1980975168285d);
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0087463981833455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0087463981833455d + "'", double1 == 1.0087463981833455d);
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-90.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.102016471589204E38d + "'", double1 == 6.102016471589204E38d);
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.0724781822753713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0012649829165658245d) + "'", double1 == (-0.0012649829165658245d));
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.192465179596234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0604297473079762d + "'", double1 == 1.0604297473079762d);
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6849166814234299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16436225624312906d) + "'", double1 == (-0.16436225624312906d));
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5802053839637672d, 0.4345105648245638d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4345105648245638d + "'", double2 == 0.4345105648245638d);
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.29807701278948945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005202425297685838d + "'", double1 == 0.005202425297685838d);
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (short) 100, (-2.356194490192345d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        long long1 = org.apache.commons.math.util.FastMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.0011640511417403306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001164050878855877d + "'", double1 == 0.001164050878855877d);
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 5507L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5507.0d + "'", double1 == 5507.0d);
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.161510274442745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.1694228248157563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3561944901923444d) + "'", double1 == (-2.3561944901923444d));
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7734137622334678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.711773033643908d + "'", double1 == 0.711773033643908d);
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5884022289215687d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6229473377768496d) + "'", double1 == (-0.6229473377768496d));
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.4177144927409673d), 56.72239180482502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4177144927409673d) + "'", double2 == (-2.4177144927409673d));
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9416868226777982d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9416868226777981d) + "'", double1 == (-0.9416868226777981d));
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9135245975035817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5484210751030427d) + "'", double1 == (-1.5484210751030427d));
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.044149187845410116d), (double) 5507L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.016921707729123E-6d) + "'", double2 == (-8.016921707729123E-6d));
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7734137622334678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1671517813002206d + "'", double1 == 2.1671517813002206d);
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8968903759882284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4299012280529384d + "'", double1 == 1.4299012280529384d);
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.07145890874357941d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3828979036148312d, 1.1098842226362917d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3828979036148312d + "'", double2 == 1.3828979036148312d);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0986122886681098d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9952546615340857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8780141421690639d + "'", double1 == 0.8780141421690639d);
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        double double1 = org.apache.commons.math.util.FastMath.sinh(19.088431721273945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.749235676232833E7d + "'", double1 == 9.749235676232833E7d);
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5975571443282361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5667290388147143d + "'", double1 == 0.5667290388147143d);
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3870653233249402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32719023706934d + "'", double1 == 0.32719023706934d);
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3868973415880647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3691602028316557d + "'", double1 == 0.3691602028316557d);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.085665678873483E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007982077418699631d + "'", double1 == 0.007982077418699631d);
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5847565194245992E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707947420383772d + "'", double1 == 1.5707947420383772d);
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.9091395677903498d, 2.674083105727976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.90913956779035d + "'", double2 == 1.90913956779035d);
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3752021393940158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3664606138485781d + "'", double1 == 0.3664606138485781d);
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.192987713658941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.00555538409839d + "'", double1 == 90.00555538409839d);
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.5884022289215687d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.085665678873483E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.913871794139852E-5d + "'", double1 == 2.913871794139852E-5d);
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.13381059201667d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.3169964300810872d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.022985923941926265d) + "'", double1 == (-0.022985923941926265d));
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.449394909181667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5975571443282363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5667290388147144d + "'", double1 == 0.5667290388147144d);
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        double double2 = org.apache.commons.math.util.FastMath.max(96.99999999999999d, 47.75452555502814d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999999999999d + "'", double2 == 96.99999999999999d);
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5882496193148399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.0d + "'", double1 == 91.0d);
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        int int2 = org.apache.commons.math.util.FastMath.max(4, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        double double2 = org.apache.commons.math.util.FastMath.min(7.896296018267969E13d, 5729.577951308233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5729.577951308233d + "'", double2 == 5729.577951308233d);
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.105427357600977E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357600977E-15d + "'", double1 == 7.105427357600977E-15d);
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5675627542389041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.378414230005442d + "'", double1 == 2.378414230005442d);
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8895257804916458d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6297804583695628d + "'", double1 == 0.6297804583695628d);
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6487212707001282d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6156614753256583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.850880506507373d + "'", double1 == 1.850880506507373d);
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.2589123923257013d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9027759974305378d + "'", double1 == 1.9027759974305378d);
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.052614928267624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.18303733970675E-4d + "'", double1 == 9.18303733970675E-4d);
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.977294885095501d) + "'", double1 == (-7.977294885095501d));
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.5012142829615005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.651112110129269d + "'", double1 == 1.651112110129269d);
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5144957554275266d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9974718549539727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.548781462475701d + "'", double1 == 1.548781462475701d);
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        long long1 = org.apache.commons.math.util.FastMath.round(1.9615319455195346d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 2979L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2979L + "'", long2 == 2979L);
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9380411276052492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6616777349179331d + "'", double1 == 0.6616777349179331d);
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9821938415578451d, 2.0355757685426394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9821938415578452d + "'", double2 == 0.9821938415578452d);
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2311475199693016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8585575386941564d + "'", double1 == 1.8585575386941564d);
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 108, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        double double1 = org.apache.commons.math.util.FastMath.atan(16.86085826032837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5115567593090742d + "'", double1 == 1.5115567593090742d);
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5009408451299502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4060921415682228d + "'", double1 == 0.4060921415682228d);
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0604297473079762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1304751349378549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1301077462402083d + "'", double1 == 0.1301077462402083d);
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-2.189396403106622E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6720656417424269d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.672065641742427d + "'", double2 == 0.672065641742427d);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        double double1 = org.apache.commons.math.util.FastMath.signum(89.99998294450721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9974718549539727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7841324916485369d + "'", double1 == 0.7841324916485369d);
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
        double double2 = org.apache.commons.math.util.FastMath.max(0.49591180291773657d, (-0.047260636122944004d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49591180291773657d + "'", double2 == 0.49591180291773657d);
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6229473377768496d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5834314081191652d) + "'", double1 == (-0.5834314081191652d));
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.027411208051953715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02741120805195372d + "'", double1 == 0.02741120805195372d);
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5596122796450436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4835970359743094d + "'", double1 == 2.4835970359743094d);
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6137261894007203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5759176398083917d + "'", double1 == 0.5759176398083917d);
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        double double1 = org.apache.commons.math.util.FastMath.atanh(120.01818825115909d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.7887367149835787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.260465219302375d + "'", double1 == 15.260465219302375d);
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6088194853164d), 1.1371714489930431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.49154983150043374d) + "'", double2 == (-0.49154983150043374d));
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.0432322944097698d), (-3.137529136120666d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5104205015863672d, (-0.009213398835148427d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5888449716910757d + "'", double2 == 1.5888449716910757d);
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
        double double1 = org.apache.commons.math.util.FastMath.log(0.003796077390327768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.573787011106193d) + "'", double1 == (-5.573787011106193d));
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (-36L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2407288686697961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1138800961817192d + "'", double1 == 1.1138800961817192d);
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.999696121897531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7174559276279813d + "'", double1 == 1.7174559276279813d);
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 37L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        int int2 = org.apache.commons.math.util.FastMath.max(108, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7587969864330162d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7256642678796853d + "'", double1 == 0.7256642678796853d);
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.05660497324994224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5892817163115238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.76335528887579d + "'", double1 == 33.76335528887579d);
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        int int2 = org.apache.commons.math.util.FastMath.min(108, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5710374582913385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5161207849481165d + "'", double1 == 0.5161207849481165d);
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-0.6157320800633225d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9707617589677336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01288734008259007d) + "'", double1 == (-0.01288734008259007d));
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8683173535625465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1812861553062852d + "'", double1 == 1.1812861553062852d);
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.694813279936381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4320632796393198d + "'", double1 == 0.4320632796393198d);
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.433759246577862d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1482743665672453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14773165439180685d + "'", double1 == 0.14773165439180685d);
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.10475317834218718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4658506161222316d + "'", double1 == 1.4658506161222316d);
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-7.977294885095501d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9872136726111863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8723033256749283d + "'", double1 == 0.8723033256749283d);
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        double double1 = org.apache.commons.math.util.FastMath.tan((-27.876349504902667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4204193151348753d + "'", double1 == 0.4204193151348753d);
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.34693731331800054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4147280379840659d + "'", double1 == 1.4147280379840659d);
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.40838771824645015d), (-0.06773161457158877d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7351515234962698d) + "'", double2 == (-1.7351515234962698d));
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        double double2 = org.apache.commons.math.util.FastMath.max((double) '4', 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.3693300629462564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3693300629462564d + "'", double1 == 2.3693300629462564d);
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.806553782682839d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4109688618214138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8298698279324331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2930202336512058d + "'", double1 == 1.2930202336512058d);
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8100237733214718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8100237733214719d + "'", double1 == 0.8100237733214719d);
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0633894957263825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9995120760870788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8412072582387279d + "'", double1 == 0.8412072582387279d);
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        long long2 = org.apache.commons.math.util.FastMath.max((-90L), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0000145960805298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0054029704834161855d + "'", double1 == 0.0054029704834161855d);
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36221568869946325d + "'", double1 == 0.36221568869946325d);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
        long long1 = org.apache.commons.math.util.FastMath.abs(2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.25856054082117574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29506455175102797d + "'", double1 == 0.29506455175102797d);
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9852288378766421d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.01365870103245646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000932815071508d + "'", double1 == 1.0000932815071508d);
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
        double double2 = org.apache.commons.math.util.FastMath.atan2(96.99999999999997d, 1.0905417743683503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.559554101740052d + "'", double2 == 1.559554101740052d);
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        int int1 = org.apache.commons.math.util.FastMath.round(37.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.7591770905221553d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9823087547858228d) + "'", double1 == (-0.9823087547858228d));
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.079986011890955E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009528896059822961d + "'", double1 == 0.009528896059822961d);
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 108);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 108.0f + "'", float1 == 108.0f);
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5671648645968973d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6433332706527614d) + "'", double1 == (-0.6433332706527614d));
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.1748021039363996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03322166427695591d + "'", double1 == 0.03322166427695591d);
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2273817004129048d, (-0.7791612621104443d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7791612621104443d) + "'", double2 == (-0.7791612621104443d));
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.319130550186172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.63631172366781d + "'", double1 == 27.63631172366781d);
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6108652381980155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.343154841667963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5873510240640394d + "'", double1 == 1.5873510240640394d);
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.03510313708234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4478530473346836d + "'", double1 == 1.4478530473346836d);
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8932137554742252d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5429710340288025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.40572816078691d + "'", double1 == 88.40572816078691d);
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.42041931513487113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7491363778558697d + "'", double1 == 0.7491363778558697d);
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.6177159347513663d, 0.005656731589213857d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.617715934751366d + "'", double2 == 1.617715934751366d);
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        double double1 = org.apache.commons.math.util.FastMath.acosh(12.633288649374089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2279123574152373d + "'", double1 == 3.2279123574152373d);
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
        double double2 = org.apache.commons.math.util.FastMath.max(11013.232920103323d, 1.1098842226362917d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232920103323d + "'", double2 == 11013.232920103323d);
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9873579129275408d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.37072378740163d) + "'", double1 == (-4.37072378740163d));
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5705448125620591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1623853049211124d + "'", double1 == 1.1623853049211124d);
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32179921168174863d + "'", double1 == 0.32179921168174863d);
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707963267948903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038848218538854d + "'", double1 == 1.0038848218538854d);
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, 90.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        double double1 = org.apache.commons.math.util.FastMath.expm1(29.540726696924008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.751100853507406E12d + "'", double1 == 6.751100853507406E12d);
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.2589123923257013d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.163944626011821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4710352225598886d + "'", double1 == 1.4710352225598886d);
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(21.864143275884796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7962596006497393d + "'", double1 == 2.7962596006497393d);
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2360679774997894d, 1.5378946274303926d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9683274362856896d + "'", double2 == 0.9683274362856896d);
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1951.3187837802793d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.000115286123023d, 1.991318745538845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4654361418867731d + "'", double2 == 0.4654361418867731d);
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.6483608274590867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4770977984143493d) + "'", double1 == (-0.4770977984143493d));
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.814615669229906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.987907961181548d + "'", double1 == 2.987907961181548d);
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.48243212226262994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0673671241532148d + "'", double1 == 1.0673671241532148d);
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        double double2 = org.apache.commons.math.util.FastMath.max(0.01745417862959511d, 1.9559709842120367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9559709842120367d + "'", double2 == 1.9559709842120367d);
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.3477990933099977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6681413889823316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        double double1 = org.apache.commons.math.util.FastMath.log(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1447298858494002d + "'", double1 == 1.1447298858494002d);
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9930827464263656d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8764738819028888d) + "'", double1 == (-0.8764738819028888d));
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        double double1 = org.apache.commons.math.util.FastMath.log(106.04337560754361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.663848214255758d + "'", double1 == 4.663848214255758d);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 90);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-89.3634064240365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.228526075467908E38d + "'", double1 == 3.228526075467908E38d);
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9789051801137091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8663783583972496d + "'", double1 == 0.8663783583972496d);
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8700054540617281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9546422658233932d + "'", double1 == 0.9546422658233932d);
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
        double double1 = org.apache.commons.math.util.FastMath.asin(37.87285640966904d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.35430360994810484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        double double1 = org.apache.commons.math.util.FastMath.acosh(6.054601895401186E-39d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
        int int2 = org.apache.commons.math.util.FastMath.min(37, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.011983210854855571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6865874069985796d + "'", double1 == 0.6865874069985796d);
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.16429734860675368d), 0.8947805892373116d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16429734860675368d) + "'", double2 == (-0.16429734860675368d));
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
        double double2 = org.apache.commons.math.util.FastMath.min(3.3582216239154814d, (-0.045699465809971355d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.045699465809971355d) + "'", double2 == (-0.045699465809971355d));
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9020848703947254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7173115145567502d + "'", double1 == 0.7173115145567502d);
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9149994934381422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.155506665128233d + "'", double1 == 1.155506665128233d);
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0027745037427485417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.568021819492507d + "'", double1 == 1.568021819492507d);
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        double double2 = org.apache.commons.math.util.FastMath.max(0.03927547481280819d, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.6991118430775187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.699111843077519d + "'", double1 == 2.699111843077519d);
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.023782649535268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.454221088609291d + "'", double1 == 1.454221088609291d);
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9473741150701354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9473741150701354d + "'", double1 == 1.9473741150701354d);
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9470049559056026d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.17034167909143405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1857099144018891d + "'", double1 == 0.1857099144018891d);
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.13660857585579214d, 5.520482796722225d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.024740716872890877d + "'", double2 == 0.024740716872890877d);
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.013659550437909718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7185746547661834d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

