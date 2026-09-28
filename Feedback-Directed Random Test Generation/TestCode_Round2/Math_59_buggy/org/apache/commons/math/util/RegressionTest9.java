package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.3978118125063327d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3786185863965946d) + "'", double1 == (-0.3786185863965946d));
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9852288378766421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5079431519740254d + "'", double1 == 1.5079431519740254d);
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        double double1 = org.apache.commons.math.util.FastMath.log(53.72372042780569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9838546251729223d + "'", double1 == 3.9838546251729223d);
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.984871312897978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999686043177d + "'", double1 == 0.9999999686043177d);
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2360679774997894d + "'", double1 == 2.2360679774997894d);
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7651502649370375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8747286807559459d + "'", double1 == 0.8747286807559459d);
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.079985961979837E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.041914822914973d) + "'", double1 == (-4.041914822914973d));
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7456241416655578d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9067898571222959d) + "'", double1 == (-0.9067898571222959d));
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.010176922302104895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01012531265250826d) + "'", double1 == (-0.01012531265250826d));
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3953649341158527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8943523655438637d + "'", double1 == 1.8943523655438637d);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.079985961979837E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009528896033633612d + "'", double1 == 0.009528896033633612d);
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2860268482059916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9473741150701354d + "'", double1 == 1.9473741150701354d);
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8694416130821835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6432049175981438d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        double double1 = org.apache.commons.math.util.FastMath.ulp(37.21392919076789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8690586640680674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7637216000753616d + "'", double1 == 0.7637216000753616d);
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6098494453571884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6098494453571884d + "'", double1 == 0.6098494453571884d);
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5280998217363506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990886426902358d + "'", double1 == 0.9990886426902358d);
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707252015575928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707252015575928d + "'", double1 == 1.5707252015575928d);
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9431910296713536d) + "'", double1 == (-0.9431910296713536d));
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        double double1 = org.apache.commons.math.util.FastMath.asinh(630998.4197775755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.048205817766327d + "'", double1 == 14.048205817766327d);
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9185957173539763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0533450212094795d + "'", double1 == 1.0533450212094795d);
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-28.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.999999999999996d) + "'", double1 == (-27.999999999999996d));
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000403476291617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.298091261946645d + "'", double1 == 57.298091261946645d);
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.026789739363150215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.4084587136495436E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5258607844979077E-13d + "'", double1 == 2.5258607844979077E-13d);
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        long long1 = org.apache.commons.math.util.FastMath.abs(39481480091340L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091340L + "'", long1 == 39481480091340L);
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0087397904378297d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0087397904378297d + "'", double2 == 1.0087397904378297d);
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.01365870103245646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23903957044228702d + "'", double1 == 0.23903957044228702d);
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.041945072145264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0705452496936946d + "'", double1 == 0.0705452496936946d);
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        double double1 = org.apache.commons.math.util.FastMath.tanh(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6257710684000874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4859822068712754d + "'", double1 == 0.4859822068712754d);
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        double double2 = org.apache.commons.math.util.FastMath.atan2(153298.37563315977d, (-0.8998712981815272d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708021968590409d + "'", double2 == 1.5708021968590409d);
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.20388401007638224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9792875536939665d + "'", double1 == 0.9792875536939665d);
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.10955796484928033d), 0.6631489452679062d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16372976561258465d) + "'", double2 == (-0.16372976561258465d));
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5412093449191896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0229280659655783d, 0.022630443056965113d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9181093036277246d + "'", double2 == 0.9181093036277246d);
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        double double1 = org.apache.commons.math.util.FastMath.acos(104.94395132690269d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9366895107550345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7336975489865022d + "'", double1 == 0.7336975489865022d);
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9656414365486929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7573591247314425d) + "'", double1 == (-0.7573591247314425d));
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.2291346864364843d, (double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22913468643648427d + "'", double2 == 0.22913468643648427d);
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.480272527447467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9959055180610699d + "'", double1 == 0.9959055180610699d);
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.5435938534266416E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5435938534266416E16d + "'", double1 == 4.5435938534266416E16d);
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        double double2 = org.apache.commons.math.util.FastMath.min(2.1017337E7d, 0.8034325040154597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8034325040154597d + "'", double2 == 0.8034325040154597d);
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.47428373042402705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.4604631653887666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8958467800237574d + "'", double1 == 0.8958467800237574d);
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.06558572392439851d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.1894250945222025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.98484500494128d + "'", double1 == 65.98484500494128d);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.002962815258153d, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0029628152581531d + "'", double2 == 1.0029628152581531d);
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        double double1 = org.apache.commons.math.util.FastMath.tan(32.843508051844005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.934714363860833d + "'", double1 == 6.934714363860833d);
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 39481480091340L, 8.490762386278728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.490762386278728d + "'", double2 == 8.490762386278728d);
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.09728846154807012d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.14206815838939643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14254654307427778d) + "'", double1 == (-0.14254654307427778d));
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.772695717397461d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5382334032499028d) + "'", double1 == (-0.5382334032499028d));
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.615354633267934E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999755913632423d + "'", double1 == 0.9999755913632423d);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.0925604496286767d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4968229050023305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7920158446873097d + "'", double1 == 0.7920158446873097d);
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        double double1 = org.apache.commons.math.util.FastMath.log10(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914824263685d + "'", double1 == 4.041914824263685d);
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9880923460971159d, 2.46819606815034E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705465327319668d + "'", double2 == 1.5705465327319668d);
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0475388422900291d, 3.834046549311538E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.834046549311538E43d + "'", double2 == 3.834046549311538E43d);
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.3273845772164694d), 0.9110895402590333d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.718295053847029d, (-0.5759586531581288d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7795906493412312d + "'", double2 == 1.7795906493412312d);
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3960301412496883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.824209315301355d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9496482207527558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8132108304247175d + "'", double1 == 0.8132108304247175d);
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2407288686697966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21569900424612215d + "'", double1 == 0.21569900424612215d);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.557407710533861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02718189234476265d + "'", double1 == 0.02718189234476265d);
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.079986011887159E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291097914389d + "'", double1 == 4.248291097914389d);
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0874935930354446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09143527163345053d + "'", double1 == 0.09143527163345053d);
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-12.806875836617005d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.4376009710383337d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8932137554742252d) + "'", double1 == (-0.8932137554742252d));
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.6162298357006117d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6163607106837756d + "'", double1 == 2.6163607106837756d);
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.16902146990801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2944579595063852d + "'", double1 == 1.2944579595063852d);
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.9955924691418044E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.026480513893276d + "'", double1 == 34.026480513893276d);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9446922743316068E-62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9446922743316068E-62d + "'", double1 == 1.9446922743316068E-62d);
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9756299818288702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7511679260882128d) + "'", double1 == (-0.7511679260882128d));
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6719990366730106d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4968229050023305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5199340510531957d + "'", double1 == 0.5199340510531957d);
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0054029967707723775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.220801521793462d) + "'", double1 == (-5.220801521793462d));
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1353352832366127d + "'", double1 == 0.1353352832366127d);
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5430806348152435d, 1.638566441559658d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0355757685426394d + "'", double2 == 2.0355757685426394d);
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-5.4203240110583195d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.4802620430283604E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.0089148066056253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.846254174356267d) + "'", double1 == (-0.846254174356267d));
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        int int2 = org.apache.commons.math.util.FastMath.max((-90), 5507);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7131795469286212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49008347417426656d + "'", double1 == 0.49008347417426656d);
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5507, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.019016309312897425d, (-5.195945676325781d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.019016309312897422d + "'", double2 == 0.019016309312897422d);
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9990886426902358d, 2.1326010584537984d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9980574414724095d + "'", double2 == 0.9980574414724095d);
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1589375003169515d, (-0.04417790591315649d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6088971963351923d + "'", double2 == 1.6088971963351923d);
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        int int2 = org.apache.commons.math.util.FastMath.max(4, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8694416130821835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5167253890217791d + "'", double1 == 0.5167253890217791d);
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        double double1 = org.apache.commons.math.util.FastMath.atanh(630998.4197775756d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.800134365783882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.4177144927409673d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3421519023219912d) + "'", double1 == (-1.3421519023219912d));
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        double double1 = org.apache.commons.math.util.FastMath.abs(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.5287649310207496d), 11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.296114959999396E-4d) + "'", double2 == (-2.296114959999396E-4d));
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.815758426184901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.145735497073049d + "'", double1 == 6.145735497073049d);
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8282265872414869d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.009213529184899942d), (-2.267365292027d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.137529136120666d) + "'", double2 == (-3.137529136120666d));
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6156614753256584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.4051557739351637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.07998602436399E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8482836399575129d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.011669273072701132d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.3421519023219912d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1030636090239792d) + "'", double1 == (-1.1030636090239792d));
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        double double1 = org.apache.commons.math.util.FastMath.tanh(46.2263037084224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1474836470000002E9d + "'", double1 == 2.1474836470000002E9d);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4650188248182272d + "'", double1 == 1.4650188248182272d);
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.32821156205036844d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.013276747223059479d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01327713727966558d) + "'", double1 == (-0.01327713727966558d));
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.42041931513487113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483974977857881d + "'", double1 == 0.6483974977857881d);
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.691673596021348E41d, (-33.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021347E41d + "'", double2 == 6.691673596021347E41d);
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.159754170844509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1371714489930431d + "'", double1 == 1.1371714489930431d);
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7734137622334677d + "'", double1 == 0.7734137622334677d);
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5630629629813295d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9067898571222959d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5961815394648626d) + "'", double1 == (-0.5961815394648626d));
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5872139151569482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5309649148733978d) + "'", double1 == (-0.5309649148733978d));
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9974718549539727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0025313462011753852d) + "'", double1 == (-0.0025313462011753852d));
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        long long1 = org.apache.commons.math.util.FastMath.round(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2979L + "'", long1 == 2979L);
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 33L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7182818247238476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818247238476d + "'", double1 == 1.7182818247238476d);
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        double double1 = org.apache.commons.math.util.FastMath.log(2.4215467286739085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8844064800831345d + "'", double1 == 0.8844064800831345d);
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0952081954995738d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0952081954995736d + "'", double2 == 1.0952081954995736d);
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8082072382458939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.30686372341393d + "'", double1 == 46.30686372341393d);
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (-90L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5156.620156177409d) + "'", double1 == (-5156.620156177409d));
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.2490457723982544d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9067898571222959d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7064024144143413d + "'", double1 == 2.7064024144143413d);
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6563678204210392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.854802108020353d + "'", double1 == 0.854802108020353d);
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6483608274590842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9124034991009666d + "'", double1 == 1.9124034991009666d);
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        long long1 = org.apache.commons.math.util.FastMath.round(0.722077905488864d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5169281719127183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7645662682374061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7645662682374061d + "'", double1 == 1.7645662682374061d);
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.3512721633416307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3512721633416307d + "'", double2 == 1.3512721633416307d);
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.147277566020156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4160533322721292d) + "'", double1 == (-1.4160533322721292d));
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.690795798579539d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3960301412496883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0176055895227845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7688894800973336d + "'", double1 == 0.7688894800973336d);
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2493184782545368d + "'", double1 == 1.2493184782545368d);
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.7551415795108877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0633894957263825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7243500169114551d + "'", double1 == 0.7243500169114551d);
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        double double1 = org.apache.commons.math.util.FastMath.expm1(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8168003331226937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3525448752949314d + "'", double1 == 1.3525448752949314d);
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.934714363860833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5713088006770572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1951.3187837802793d) + "'", double1 == (-1951.3187837802793d));
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(37.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2119.943841984046d + "'", double1 == 2119.943841984046d);
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(50.710623985951266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.71062398595127d + "'", double1 == 50.71062398595127d);
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        double double1 = org.apache.commons.math.util.FastMath.rint(5507.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5507.0d + "'", double1 == 5507.0d);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7920158446873097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0133237292727024d + "'", double1 == 1.0133237292727024d);
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0003524996777038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5434949887343516d + "'", double1 == 1.5434949887343516d);
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.589691795662765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5296739074871453d + "'", double1 == 0.5296739074871453d);
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.360130725463979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3151956127860944d + "'", double1 == 2.3151956127860944d);
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        double double1 = org.apache.commons.math.util.FastMath.sin(11.940141468803507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5860936224215468d) + "'", double1 == (-0.5860936224215468d));
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9707650795890375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.810415804571918d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2479614275509088d, 1.480272527447467d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3880462512735203d + "'", double2 == 1.3880462512735203d);
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.10178798778736835d, (-0.5274728362673282d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.337437383428404d + "'", double2 == 3.337437383428404d);
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.3502411805356305E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3502411804946023E-5d) + "'", double1 == (-1.3502411804946023E-5d));
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.49724292869339315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008678526287959096d + "'", double1 == 0.008678526287959096d);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.656559119563622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0078886023836056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007857650033781347d + "'", double1 == 0.007857650033781347d);
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8857088863088404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7092677926697085d + "'", double1 == 0.7092677926697085d);
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.354638711533299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.319301422815503d + "'", double1 == 20.319301422815503d);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        float float2 = org.apache.commons.math.util.FastMath.min(33.0f, 5507.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7456241416655579d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7688894800973336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013419653011645882d + "'", double1 == 0.013419653011645882d);
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        double double2 = org.apache.commons.math.util.FastMath.pow((-56.72239180482502d), 0.5199340510531957d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        double double1 = org.apache.commons.math.util.FastMath.log(1.9473741150701356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6664818574284437d + "'", double1 == 0.6664818574284437d);
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.373400766945016d + "'", double1 == 1.373400766945016d);
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.008491621662199392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008491519610769877d) + "'", double1 == (-0.008491519610769877d));
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.11710370870180292d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.40946195169855704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3988061238431161d + "'", double1 == 0.3988061238431161d);
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09492270797282235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09463914472538534d + "'", double1 == 0.09463914472538534d);
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.915504000358289E22d + "'", double1 == 1.915504000358289E22d);
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9431910296713536d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3784483521091646d) + "'", double1 == (-1.3784483521091646d));
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        double double2 = org.apache.commons.math.util.FastMath.max(57.298091261946645d, (-15.35252977886304d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.298091261946645d + "'", double2 == 57.298091261946645d);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8482836399575129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6612716408007345d + "'", double1 == 0.6612716408007345d);
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 37L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(802.1409131831525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 802.1409131831526d + "'", double1 == 802.1409131831526d);
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 5507);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        double double1 = org.apache.commons.math.util.FastMath.floor(23.140692632779267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.0d + "'", double1 == 23.0d);
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.002094025184076574d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5248526696656155d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7243500169114551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6502731920226421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01134940823824843d + "'", double1 == 0.01134940823824843d);
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9999999999999998d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        double double2 = org.apache.commons.math.util.FastMath.atan2(63.11868704625112d, (-0.7551415795108877d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5827595913888164d + "'", double2 == 1.5827595913888164d);
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1542738581313687d, 0.3615615830612523d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1542738581313687d + "'", double2 == 1.1542738581313687d);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4682955026240894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4682955026240896d + "'", double1 == 1.4682955026240896d);
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7023967071298747d) + "'", double1 == (-0.7023967071298747d));
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3132617229916372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022920741006617788d + "'", double1 == 0.022920741006617788d);
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.46025618298802606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1674231661645518d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7319013265055243d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6682852486118039d) + "'", double1 == (-0.6682852486118039d));
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.720075976020837E-43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.480272527447467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4802725274474673d + "'", double1 == 1.4802725274474673d);
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 33, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-36.005914226169836d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.22649705709056728d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22456543400577147d) + "'", double1 == (-0.22456543400577147d));
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        double double1 = org.apache.commons.math.util.FastMath.log10(1312.6929859424645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1181631647017802d + "'", double1 == 3.1181631647017802d);
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        double double1 = org.apache.commons.math.util.FastMath.atan((-18506.833881249884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707422927010346d) + "'", double1 == (-1.5707422927010346d));
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        double double2 = org.apache.commons.math.util.FastMath.min(1.940894492205956d, 0.3683334104437261d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3683334104437261d + "'", double2 == 0.3683334104437261d);
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.15091034527843197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14055323381143783d + "'", double1 == 0.14055323381143783d);
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.196231140163579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.551142526485201d + "'", double1 == 4.551142526485201d);
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        double double1 = org.apache.commons.math.util.FastMath.log10((-33.96421184743732d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8690586640680674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-27.87634950490267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.390204694268467E11d + "'", double1 == 6.390204694268467E11d);
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8768177324556823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13145613893303287d) + "'", double1 == (-0.13145613893303287d));
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        double double1 = org.apache.commons.math.util.FastMath.log(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6390573296152584d + "'", double1 == 2.6390573296152584d);
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.1894250945222025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.98484500494128d + "'", double1 == 64.98484500494128d);
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9132181497465548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1496153595671315d, 0.8775719214756793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8775719214756793d + "'", double2 == 0.8775719214756793d);
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 108L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108 + "'", int1 == 108);
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.01195230772972848d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012024310870687083d) + "'", double1 == (-0.012024310870687083d));
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        double double1 = org.apache.commons.math.util.FastMath.rint(23.628351601695012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.0d + "'", double1 == 24.0d);
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.931763225510739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4664203335966488d + "'", double1 == 1.4664203335966488d);
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.568021819492507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2522067798460872d + "'", double1 == 1.2522067798460872d);
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0000145960805298d, 0.8720836498654725d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000145960805296d + "'", double2 == 1.0000145960805296d);
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5443731278415634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4197946160362327d) + "'", double1 == (-0.4197946160362327d));
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000145960805298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000145960805298d + "'", double1 == 1.0000145960805298d);
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.142599163434008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7620196544019282d + "'", double1 == 0.7620196544019282d);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.322723236313804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.01745417862959511d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017454178629595106d) + "'", double1 == (-0.017454178629595106d));
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.48505801955099925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.539788332061041E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.432766869820022E-15d + "'", double1 == 4.432766869820022E-15d);
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.20401567913623667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20262627828929064d) + "'", double1 == (-0.20262627828929064d));
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.8962960182681E13d + "'", double1 == 7.8962960182681E13d);
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        long long2 = org.apache.commons.math.util.FastMath.min(108L, (long) (-33));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.40834357456474796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3870653233249402d + "'", double1 == 0.3870653233249402d);
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8211080655056974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8211080655056974d + "'", double1 == 0.8211080655056974d);
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2958255551963092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.949555784862895d + "'", double1 == 16.949555784862895d);
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.002309551127695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416907d + "'", double1 == 0.5514266812416907d);
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        double double1 = org.apache.commons.math.util.FastMath.asin(35.44341522934085d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.06558572392439851d), 5.195945676325781d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.195945676325781d + "'", double2 == 5.195945676325781d);
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3331559825783589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3953649341158527d + "'", double1 == 1.3953649341158527d);
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4251878220010183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1938123060184203d + "'", double1 == 1.1938123060184203d);
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7893750108307105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.581866402923032d + "'", double1 == 0.581866402923032d);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6098494453571868d) + "'", double1 == (-0.6098494453571868d));
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.3295225782386857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.040657838989812276d + "'", double1 == 0.040657838989812276d);
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7330383821741316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.013658276325773256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013658700984922159d + "'", double1 == 0.013658700984922159d);
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(17.520046655456152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1003.824730229931d + "'", double1 == 1003.824730229931d);
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9155023779490905E22d, 2.539788332061041E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000013031d + "'", double2 == 1.000000000013031d);
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0653122583386827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.0432322944097694d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0142079431235729d) + "'", double1 == (-1.0142079431235729d));
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 108);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 108L + "'", long1 == 108L);
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-5156.620156177409d), 1.3022547416014814d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5156.620156177408d) + "'", double2 == (-5156.620156177408d));
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        double double1 = org.apache.commons.math.util.FastMath.log((-27.87634950490267d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.2980222566046529d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        double double2 = org.apache.commons.math.util.FastMath.pow(11.507222037885182d, 0.2958255551963092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.059976116562831d + "'", double2 == 2.059976116562831d);
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.44248081051227434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8947805892373116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5802053839637672d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7219067166708867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.806553782682839d) + "'", double1 == (-0.806553782682839d));
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6986765821769388d), (-0.9999103740052037d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.698676582176939d) + "'", double2 == (-0.698676582176939d));
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6013.0d + "'", double1 == 6013.0d);
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        long long2 = org.apache.commons.math.util.FastMath.min(37L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        double double1 = org.apache.commons.math.util.FastMath.abs((-56.72239180482502d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.72239180482502d + "'", double1 == 56.72239180482502d);
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        double double1 = org.apache.commons.math.util.FastMath.rint(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.21670660727375085d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.994185913465727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9188537484079635d + "'", double1 == 2.9188537484079635d);
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.551565975503502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027079934834453794d + "'", double1 == 0.027079934834453794d);
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        float float2 = org.apache.commons.math.util.FastMath.min(37.0f, 7.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-90.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5156.620156177409d) + "'", double1 == (-5156.620156177409d));
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0424724406933767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9496482207527558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3973434260602215d + "'", double1 == 1.3973434260602215d);
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.829869827932433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8298698279324331d + "'", double1 == 0.8298698279324331d);
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5278888682247538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1269092742903832d + "'", double1 == 2.1269092742903832d);
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.14055323381143783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.1472775660201557d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.9431910296713536d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 2.327581142581999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.20262627828929064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19991954732456702d) + "'", double1 == (-0.19991954732456702d));
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5707963267948966d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (-90.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.13936960904520276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13892232444557934d + "'", double1 == 0.13892232444557934d);
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707963267948966d, 0.3619730303123129d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 0, 0.38863652572621304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), 37.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5429710340288025d, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5429710340288028d + "'", double2 == 1.5429710340288028d);
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.25876123621075164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25320738314893254d + "'", double1 == 0.25320738314893254d);
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6774664656433237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6774664656433237d + "'", double1 == 0.6774664656433237d);
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6088496173769596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6088496173769596d + "'", double1 == 0.6088496173769596d);
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.3648280517791587E-23d, 9.98714636101983d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.364828051779159E-23d + "'", double2 == 3.364828051779159E-23d);
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        double double2 = org.apache.commons.math.util.FastMath.min((-6.755849220440437d), 50.71062398595127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.755849220440437d) + "'", double2 == (-6.755849220440437d));
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5799604581126996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0341909072993258d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.505149978319906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02626982285800363d + "'", double1 == 0.02626982285800363d);
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        long long1 = org.apache.commons.math.util.FastMath.round(2.2990612758127336d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3710356884721411d, 43.1284181946612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37103568847214113d + "'", double2 == 0.37103568847214113d);
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8947805892373116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1079395657990083d + "'", double1 == 1.1079395657990083d);
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.20091875991192137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.020252165622352d + "'", double1 == 1.020252165622352d);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.9180159690299023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.34693731331800054d, 0.011658811940024915d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.537204015658685d + "'", double2 == 1.537204015658685d);
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        double double2 = org.apache.commons.math.util.FastMath.atan2(53.0d, 1.570796029120392d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5411673391151195d + "'", double2 == 1.5411673391151195d);
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.7928643348714102d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3311317153490116d + "'", double1 == 1.3311317153490116d);
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0000145960805296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5402900236323281d + "'", double1 == 0.5402900236323281d);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.5557490923207962d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.14695139574279478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818247238476d + "'", double1 == 1.7182818247238476d);
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5760630454288633d, 0.7820802611773309d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7820802611773309d + "'", double2 == 0.7820802611773309d);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.32832234898519613d, (-4.187482763357499d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 106.04337560754361d + "'", double2 == 106.04337560754361d);
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6574544541530776d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.466743204778643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.3477990933099973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2091797289097923d + "'", double1 == 0.2091797289097923d);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-33.71296437329639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.189396403106622E14d) + "'", double1 == (-2.189396403106622E14d));
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.327581142581999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.366904830001973d + "'", double1 == 0.366904830001973d);
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.276225755267126d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1358834053983713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3512721633416307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9336979767153191d + "'", double1 == 0.9336979767153191d);
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        long long2 = org.apache.commons.math.util.FastMath.min(33L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.035592047388576235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03559956249561319d + "'", double1 == 0.03559956249561319d);
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (float) 5507);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        double double1 = org.apache.commons.math.util.FastMath.ceil(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7615941559557649d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.9538600730106995E19d, (-0.008491621659255943d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.953860073010699E19d + "'", double2 == 5.953860073010699E19d);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.445323844714277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9118234861458008d + "'", double1 == 0.9118234861458008d);
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-0.5921640937280627d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5921640937280627d) + "'", double2 == (-0.5921640937280627d));
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.772695717397461d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4814657071109039d) + "'", double1 == (-1.4814657071109039d));
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.11375468959206643d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        double double1 = org.apache.commons.math.util.FastMath.cos(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.602036160225165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2657156711620368d + "'", double1 == 1.2657156711620368d);
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6719990366730106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7369048799450005d + "'", double1 == 0.7369048799450005d);
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1022931929401623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6339015320914385d) + "'", double1 == (-0.6339015320914385d));
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 108L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 108.0f + "'", float1 == 108.0f);
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-33.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1898842314256335d) + "'", double1 == (-4.1898842314256335d));
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8034325040154596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8683173535625465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9816204068070169d + "'", double1 == 0.9816204068070169d);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 4.0f, 0.06516780684692637d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5545058162986882d + "'", double2 == 1.5545058162986882d);
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        double double2 = org.apache.commons.math.util.FastMath.atan2(23.628351601695016d, 1.1854652182422676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.520667055430436d + "'", double2 == 1.520667055430436d);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.433780830483027d), (double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.433780830483027d) + "'", double2 == (-1.433780830483027d));
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        double double2 = org.apache.commons.math.util.FastMath.max(0.830640877860784d, (-0.6896428168918044d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.830640877860784d + "'", double2 == 0.830640877860784d);
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.013658276325773256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3838189203193697E-4d + "'", double1 == 2.3838189203193697E-4d);
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5486620049392715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8186563384972326d + "'", double1 == 0.8186563384972326d);
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        double double1 = org.apache.commons.math.util.FastMath.exp((-9.306852812898857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079986011890955E-5d + "'", double1 == 9.079986011890955E-5d);
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.003535606004149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017515000485768976d + "'", double1 == 0.017515000485768976d);
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) (-90));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8064012322901598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21517385352860152d) + "'", double1 == (-0.21517385352860152d));
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 33, (float) 90L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5561319766247041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027159626587668524d + "'", double1 == 0.027159626587668524d);
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.01745240643728351d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        double double1 = org.apache.commons.math.util.FastMath.log(1.815758426184901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5965032461018823d + "'", double1 == 0.5965032461018823d);
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.364828051779159E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.364828051779159E-23d + "'", double1 == 3.364828051779159E-23d);
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.4636005855219394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8053457690335615d) + "'", double1 == (-0.8053457690335615d));
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.492757420590522E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.057764839327667E-23d + "'", double1 == 8.057764839327667E-23d);
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.16429734860675368d), 0.8958467800237574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16429734860675368d) + "'", double2 == (-0.16429734860675368d));
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5574077246549023d), 0.7047567822517626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7047567822517626d + "'", double2 == 0.7047567822517626d);
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2707236083120753E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5647210386116825E15d + "'", double1 == 3.5647210386116825E15d);
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        long long1 = org.apache.commons.math.util.FastMath.abs(33L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 33L + "'", long1 == 33L);
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.356194490192344d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(51.376292861194926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8966854678967096d + "'", double1 == 0.8966854678967096d);
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.07031263443540531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.997529084960586d + "'", double1 == 0.997529084960586d);
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.566370614359174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6483608274590855d) + "'", double1 == (-0.6483608274590855d));
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        double double2 = org.apache.commons.math.util.FastMath.pow((-32.99999999999999d), 3.970291913552122d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        double double1 = org.apache.commons.math.util.FastMath.log10((-33.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.20091875991192137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6969795110075692d) + "'", double1 == (-0.6969795110075692d));
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707448354574094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171441568298646d + "'", double1 == 0.9171441568298646d);
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.480272527447467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17034167909143405d + "'", double1 == 0.17034167909143405d);
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5009408451299502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.5405025668761212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030289126640769458d + "'", double1 == 0.030289126640769458d);
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5515659755035025d, (-88.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6301149667385314E-17d + "'", double2 == 1.6301149667385314E-17d);
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        double double2 = org.apache.commons.math.util.FastMath.max(0.00540307563595756d, 2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00540307563595756d + "'", double2 == 0.00540307563595756d);
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0341909072993256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6811676665524073d + "'", double1 == 1.6811676665524073d);
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3801753953415168E-182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1748086632901192E-91d + "'", double1 == 1.1748086632901192E-91d);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        double double1 = org.apache.commons.math.util.FastMath.log(0.4724053287214428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7499179146178867d) + "'", double1 == (-0.7499179146178867d));
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5671648645968973d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.551565975503502d, 0.9680095228539631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5515659755035018d + "'", double2 == 1.5515659755035018d);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5443731278415634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8165176173306078d) + "'", double1 == (-0.8165176173306078d));
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9917694073609294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6890233931048119d + "'", double1 == 0.6890233931048119d);
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.15912713462618d, (-0.009213529184899944d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9869537583815866d + "'", double2 == 0.9869537583815866d);
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.930067261567154E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999067329932104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.022630443056965113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.2003257647899614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.66840918807837d + "'", double1 == 90.66840918807837d);
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, (long) (-90));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5830846312335454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8347682213968615d + "'", double1 == 0.8347682213968615d);
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1589375003169515d, 0.8611875304425891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8611875304425891d + "'", double2 == 0.8611875304425891d);
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7126526144249964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5380434050958847d + "'", double1 == 0.5380434050958847d);
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5713088006770572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0040325852407168d + "'", double1 == 1.0040325852407168d);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7336975489865022d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        int int2 = org.apache.commons.math.util.FastMath.min(108, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9608236039126866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03996444158152412d) + "'", double1 == (-0.03996444158152412d));
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.7620587253843047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7403906113732632d + "'", double1 == 1.7403906113732632d);
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.01745240643728351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745152048957156d + "'", double1 == 0.01745152048957156d);
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.45054953406980763d), 36.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.012176412619923603d) + "'", double2 == (-0.012176412619923603d));
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.48674355529070396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7866231740623315d) + "'", double1 == (-0.7866231740623315d));
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9075712110370514d + "'", double1 == 0.9075712110370514d);
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9821279356034003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034594658672037475d + "'", double1 == 0.034594658672037475d);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.354638711533299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.076738876852442d, (-0.12585691605953508d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0767388768524415d + "'", double2 == 2.0767388768524415d);
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        double double1 = org.apache.commons.math.util.FastMath.log1p(6.054601895401186E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.054601895401186E-39d + "'", double1 == 6.054601895401186E-39d);
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.47506901453650896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.608125177669901d + "'", double1 == 0.608125177669901d);
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        double double2 = org.apache.commons.math.util.FastMath.min(47.204120223528484d, 1.0000000485233538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000485233538d + "'", double2 == 1.0000000485233538d);
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.3877864478353665d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 1.3279443230305752d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        double double1 = org.apache.commons.math.util.FastMath.cos(50.237955471941575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996211564575976d + "'", double1 == 0.9996211564575976d);
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.999942448217206d), 2.0488587876978275d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999424482172059d) + "'", double2 == (-0.9999424482172059d));
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1877181244729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1877181244729045d + "'", double1 == 1.1877181244729045d);
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-323.00518534745174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.861248751607551d) + "'", double1 == (-6.861248751607551d));
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6220107246567897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8127085104657242d + "'", double1 == 0.8127085104657242d);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6020599913279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8241707059519972d + "'", double1 == 0.8241707059519972d);
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.298342365610588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09247351917780994d + "'", double1 == 0.09247351917780994d);
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5278888682247538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4857089771942523d) + "'", double1 == (-0.4857089771942523d));
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9869537583815866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1617078113618549d + "'", double1 == 0.1617078113618549d);
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2343900235798524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0378042825874916d + "'", double1 == 1.0378042825874916d);
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.515582944293113d, (double) 7.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07352194555034251d + "'", double2 == 0.07352194555034251d);
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.1034653645558015d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.514508134546872d + "'", double1 == 7.514508134546872d);
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.174802103936399d + "'", double1 == 3.174802103936399d);
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.1093389265928446d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7820802611773309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7893750108307106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2020197576001874d + "'", double1 == 2.2020197576001874d);
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1653657392500323E-156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1653657392500323E-156d + "'", double1 == 1.1653657392500323E-156d);
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        double double2 = org.apache.commons.math.util.FastMath.min(48981.0d, 1.3080187522246026E-11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3080187522246026E-11d + "'", double2 == 1.3080187522246026E-11d);
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0424724406933767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.892256650791169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9627124715094363d + "'", double1 == 0.9627124715094363d);
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2860268482059916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2860268482059916d + "'", double1 == 1.2860268482059916d);
    }
}

