package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.001697419855619805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.551142526485201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.3755726371398d + "'", double1 == 47.3755726371398d);
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4991939135618992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3506939960346185d + "'", double1 == 2.3506939960346185d);
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        int int1 = org.apache.commons.math.util.FastMath.abs(37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3880462512735203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9464854722265248d + "'", double1 == 0.9464854722265248d);
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0000145960805296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000072980136343d + "'", double1 == 1.0000072980136343d);
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.250448095796382d, (-49.27834704137805d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1162228941264076d + "'", double2 == 3.1162228941264076d);
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8105257933460475d), (-89.3634064240365d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.132522905681207d) + "'", double2 == (-3.132522905681207d));
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.47859127706984d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.14055323381143783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0740973108363787d, (-33.71296437329639d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08983120649906655d + "'", double2 == 0.08983120649906655d);
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9787910788176273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3644746467658349d + "'", double1 == 1.3644746467658349d);
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-34L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 34.0f + "'", float1 == 34.0f);
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-30.24580420121606d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0000072980136343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.030429149482917455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03089684788654239d + "'", double1 == 0.03089684788654239d);
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3282586280971982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.095563752817182d + "'", double1 == 1.095563752817182d);
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 37L, 1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.0d + "'", double2 == 37.0d);
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948963d + "'", double1 == 1.5707963267948963d);
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9470049559056026d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8019245746239465d) + "'", double1 == (-1.8019245746239465d));
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5847565194232731E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847565194219465E-6d + "'", double1 == 1.5847565194219465E-6d);
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.1503666979359498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8877017014171673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4295394227312024d + "'", double1 == 1.4295394227312024d);
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4894820176053498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0259963653564615d + "'", double1 == 0.0259963653564615d);
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.07352194555034251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0734558692947592d + "'", double1 == 0.0734558692947592d);
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.690795798579539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.690795798579539d + "'", double1 == 0.690795798579539d);
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        double double2 = org.apache.commons.math.util.FastMath.max((-3.0457103449725933E-4d), 2.263196996773619d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.263196996773619d + "'", double2 == 2.263196996773619d);
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7098026097087103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7709242776556768d + "'", double1 == 0.7709242776556768d);
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-2.164135227174141d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.410959116828621d + "'", double1 == 4.410959116828621d);
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        double double1 = org.apache.commons.math.util.FastMath.expm1(21.864143275884796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1295131165012608E9d + "'", double1 == 3.1295131165012608E9d);
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-70.66879307167105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2334031175112168d) + "'", double1 == (-1.2334031175112168d));
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7853981633974484d, 1.0457528827495823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7767655229795318d + "'", double2 == 0.7767655229795318d);
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.5150224550074456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9310815951878996d) + "'", double1 == (-0.9310815951878996d));
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6035270795055018d), 0.23669574761529574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1970429949276125d) + "'", double2 == (-1.1970429949276125d));
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4859822068712754d, 0.7047567822517626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6036945662319714d + "'", double2 == 0.6036945662319714d);
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-33), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        double double2 = org.apache.commons.math.util.FastMath.max(2.1671517813002206d, (-0.7023967071298747d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1671517813002206d + "'", double2 == 2.1671517813002206d);
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6038473373858848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994538650672589d + "'", double1 == 0.9994538650672589d);
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.5647210386116825E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6574725658556667d) + "'", double1 == (-0.6574725658556667d));
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        double double2 = org.apache.commons.math.util.FastMath.max(0.027415567780803757d, 10.747031677944916d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.747031677944916d + "'", double2 == 10.747031677944916d);
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0681780852520792E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.4959438633913105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04356243836112593d + "'", double1 == 0.04356243836112593d);
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5454785027470476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.4835970359743094d, 1.385330775230143E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7927826916006487E-8d + "'", double2 == 1.7927826916006487E-8d);
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-90L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 37.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6727947914027863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5707962991356774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611986938291912d + "'", double1 == 0.19611986938291912d);
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1079395657990083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6791757154399003d + "'", double1 == 1.6791757154399003d);
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7997951320060821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6746160102305615d + "'", double1 == 0.6746160102305615d);
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.8833329068775875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27492709475956467d + "'", double1 == 0.27492709475956467d);
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        double double1 = org.apache.commons.math.util.FastMath.tan(216.1980975168285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6435047519165962d) + "'", double1 == (-0.6435047519165962d));
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.30642979586841934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7360701915340764d + "'", double1 == 0.7360701915340764d);
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8350746649902792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6711223318921905d + "'", double1 == 0.6711223318921905d);
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.535785414660496d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5129881229211121d) + "'", double1 == (-0.5129881229211121d));
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.010973228372790075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6287196733940792d + "'", double1 == 0.6287196733940792d);
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2717104239752095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022195534030300442d + "'", double1 == 0.022195534030300442d);
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        long long1 = org.apache.commons.math.util.FastMath.round(0.690795798579539d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5705448125620591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.809267629578519d + "'", double1 == 4.809267629578519d);
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5430805990186642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4463519275286347d + "'", double1 == 2.4463519275286347d);
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.5804973451249884d, 1.505149978319906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0427623987122836d + "'", double2 == 1.0427623987122836d);
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4063917980622467d, 1.7927826916006487E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4063917980622467d + "'", double2 == 1.4063917980622467d);
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        double double1 = org.apache.commons.math.util.FastMath.log(0.005402970483247057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.2208063871654735d) + "'", double1 == (-5.2208063871654735d));
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3265.8594322456925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6580161192200634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        double double1 = org.apache.commons.math.util.FastMath.log1p(944.8154734160571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.852047490211345d + "'", double1 == 6.852047490211345d);
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.49724292869339315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6441818891668628d + "'", double1 == 0.6441818891668628d);
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.011983210854855571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011983784473547667d + "'", double1 == 0.011983784473547667d);
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9092974268256817d + "'", double1 == 0.9092974268256817d);
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5515060405847224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4392260982823618d + "'", double1 == 0.4392260982823618d);
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        long long1 = org.apache.commons.math.util.FastMath.round(0.008983023749580713d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.3425054583783953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19956385736934293d) + "'", double1 == (-0.19956385736934293d));
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.522076013060139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.45442539368439d + "'", double1 == 12.45442539368439d);
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5071961149184759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0388680688646736d + "'", double1 == 1.0388680688646736d);
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309447d + "'", double1 == 5.267884728309447d);
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.4160533322721292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4160533322721292d + "'", double1 == 1.4160533322721292d);
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9821279356034003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5601978690956426d + "'", double1 == 3.5601978690956426d);
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.6991118430775187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.990991537910786d + "'", double1 == 0.990991537910786d);
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0022249495956594d, 56.7156517950413d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.7156517950413d + "'", double2 == 56.7156517950413d);
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        int int2 = org.apache.commons.math.util.FastMath.max(7, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.011881162631163577d), (-0.07145890874357941d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.011881162631163579d) + "'", double2 == (-0.011881162631163579d));
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2532779128893359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        int int1 = org.apache.commons.math.util.FastMath.round(34.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, 108.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.07351901771299219d, (-0.19991954732456702d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.789199398154453d + "'", double2 == 2.789199398154453d);
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9402423370939733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        double double1 = org.apache.commons.math.util.FastMath.exp((-32.57791748631743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357600985E-15d + "'", double1 == 7.105427357600985E-15d);
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8882856957001204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        int int2 = org.apache.commons.math.util.FastMath.max(5507, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.431145960437433d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6637263492000494d + "'", double1 == 1.6637263492000494d);
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8739137188214786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        long long1 = org.apache.commons.math.util.FastMath.round(3.450721885123068E-11d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        double double1 = org.apache.commons.math.util.FastMath.tanh(28.738038368372738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6508801680230075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9172275689967649d + "'", double1 == 0.9172275689967649d);
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7595880598482629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7081168061982549d + "'", double1 == 0.7081168061982549d);
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 34, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        double double1 = org.apache.commons.math.util.FastMath.expm1(684.1197129515765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2865192714065222E297d + "'", double1 == 1.2865192714065222E297d);
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9534903170187385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5788404741295278d + "'", double1 == 0.5788404741295278d);
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6416439271862104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2674359895586114d + "'", double1 == 2.2674359895586114d);
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.800134365783882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.1727924348551592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3971322791699246d + "'", double1 == 1.3971322791699246d);
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(76.73862422940539d, (-0.13222130708843693d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 76.73862422940537d + "'", double2 == 76.73862422940537d);
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.154092655271697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.154092655271697d + "'", double1 == 6.154092655271697d);
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.013276747223059479d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013276747223059477d) + "'", double1 == (-0.013276747223059477d));
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9913289158005998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.79896298465412d + "'", double1 == 56.79896298465412d);
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3027551975274565E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3027551975274565E-11d + "'", double1 == 1.3027551975274565E-11d);
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.20262627828929064d), 1.7182818284590453d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.07998602436399E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.07998602436399E-5d + "'", double1 == 9.07998602436399E-5d);
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        double double1 = org.apache.commons.math.util.FastMath.log(5.227971924677803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6540234255635091d + "'", double1 == 1.6540234255635091d);
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9833476282002843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1496669998762001d + "'", double1 == 1.1496669998762001d);
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        int int2 = org.apache.commons.math.util.FastMath.min(5507, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6088194853164d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.882786993956714d) + "'", double1 == (-34.882786993956714d));
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9305202046730568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.535827984130872d + "'", double1 == 1.535827984130872d);
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.900710131145049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.900710131145049d + "'", double1 == 0.900710131145049d);
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        int int1 = org.apache.commons.math.util.FastMath.abs(90);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(50.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8726646259971648d + "'", double1 == 0.8726646259971648d);
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.017454178629595106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5103225366272008d), 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5103225366272008d) + "'", double2 == (-1.5103225366272008d));
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.557407710533861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.30557148829374003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.025588702964313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.899352280489793d + "'", double1 == 0.899352280489793d);
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        double double1 = org.apache.commons.math.util.FastMath.tan((-3.137529136120666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004063539835111013d + "'", double1 == 0.004063539835111013d);
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0000145960805296d, (-1.7762080189137147E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5709739450023905d + "'", double2 == 1.5709739450023905d);
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9955742875642762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7831804032231446d) + "'", double1 == (-0.7831804032231446d));
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        int int2 = org.apache.commons.math.util.FastMath.max(34, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.99598501395558d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99598501395558d + "'", double1 == 0.99598501395558d);
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0000072050412114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430891022283284d + "'", double1 == 1.5430891022283284d);
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.8325451219316489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.560487413648653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.485943101132887d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8511351556504899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3423042232497897d + "'", double1 == 2.3423042232497897d);
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.015417978618561132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015419200424859681d + "'", double1 == 0.015419200424859681d);
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27941549819892586d) + "'", double1 == (-0.27941549819892586d));
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7130376554537363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6633147175924029d) + "'", double1 == (-0.6633147175924029d));
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7319013265055243d), 0.015840105828908848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015840105828908848d + "'", double2 == 0.015840105828908848d);
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        double double2 = org.apache.commons.math.util.FastMath.max(7.454624741523039d, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.97562998182887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5148963642116557d + "'", double1 == 1.5148963642116557d);
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6271680854142649d), (-0.09698324645938282d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.6038473373858848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20516302748541437d + "'", double1 == 0.20516302748541437d);
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5507, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5161207849481165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41615495749504494d + "'", double1 == 0.41615495749504494d);
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.10946554602560299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10946554602560299d + "'", double1 == 0.10946554602560299d);
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9999999999982955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348132406d + "'", double1 == 1.5430806348132406d);
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0681780852520792E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0681780852577842E-11d + "'", double1 == 1.0681780852577842E-11d);
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0424724406933767d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 6L, 1.3440585709080487E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.994294500487108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2091797289097923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2091797289097923d + "'", double1 == 0.2091797289097923d);
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8100237733214719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.41094351658203d + "'", double1 == 46.41094351658203d);
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.012208955900931634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012208652594871292d) + "'", double1 == (-0.012208652594871292d));
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9955742875642762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9955742875642762d + "'", double1 == 0.9955742875642762d);
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 90, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6947506487576589d), 0.03561460890735782d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03561460890735782d + "'", double2 == 0.03561460890735782d);
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4960691053839213d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.5532542667374942d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21155838496703902d + "'", double1 == 0.21155838496703902d);
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.116291929305059d) + "'", double1 == (-1.116291929305059d));
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.548781462475701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2445004871335732d + "'", double1 == 1.2445004871335732d);
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6941601037894628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6941601037894629d + "'", double1 == 0.6941601037894629d);
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, 90.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.103465364555802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6963299593906205d) + "'", double1 == (-1.6963299593906205d));
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.012208955882846451d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012209562535656249d) + "'", double1 == (-0.012209562535656249d));
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7103940453389738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7103940453389738d + "'", double1 == 0.7103940453389738d);
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 108, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0000145960805298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7854054613844521d + "'", double1 == 0.7854054613844521d);
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.15289141269055143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4173029002651345d + "'", double1 == 1.4173029002651345d);
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 33L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5185139398778875d + "'", double1 == 1.5185139398778875d);
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1425465430742778d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7950499969146666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7950499969146667d + "'", double1 == 0.7950499969146667d);
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.46145736838551815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6108652381980155d, 1.473182712567381d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.48379177581104366d + "'", double2 == 0.48379177581104366d);
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9756299818288702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37695480406821247d + "'", double1 == 0.37695480406821247d);
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.012283997231502098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012283379416347176d + "'", double1 == 0.012283379416347176d);
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.129071417624954d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.818989403547511E-12d + "'", double1 == 1.818989403547511E-12d);
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-6.838249024841735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 466.427685571658d + "'", double1 == 466.427685571658d);
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7558926889211433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8299602189512373d) + "'", double1 == (-0.8299602189512373d));
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1482743665672453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14773636332088674d + "'", double1 == 0.14773636332088674d);
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.4681959929691923E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.267365292027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03957298969131389d) + "'", double1 == (-0.03957298969131389d));
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.1690152019850792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5382334032499028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7726957173974609d) + "'", double1 == (-0.7726957173974609d));
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.01365785170622981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013565423875754837d + "'", double1 == 0.013565423875754837d);
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        double double1 = org.apache.commons.math.util.FastMath.acosh(47.3755726371398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.551142526485201d + "'", double1 == 4.551142526485201d);
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.5647210386116825E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7534784835329845d + "'", double1 == 0.7534784835329845d);
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.0100191552952706d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5405025668761214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9978031084482193d + "'", double1 == 0.9978031084482193d);
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 97);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        double double2 = org.apache.commons.math.util.FastMath.max(1.432886694068576d, 44.9999998819046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.9999998819046d + "'", double2 == 44.9999998819046d);
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2532779128893359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5018027695020755d + "'", double1 == 3.5018027695020755d);
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.9838546251729223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        double double2 = org.apache.commons.math.util.FastMath.max(5.227971924677803d, 0.5380434050958847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.227971924677803d + "'", double2 == 5.227971924677803d);
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.760032670961511d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2782957478539796d + "'", double1 == 2.2782957478539796d);
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        long long1 = org.apache.commons.math.util.FastMath.round(802.1409131831525d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 802L + "'", long1 == 802L);
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8495476049206573d, 0.060912694476906684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9901172643171289d + "'", double2 == 0.9901172643171289d);
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.8134592121885016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        double double1 = org.apache.commons.math.util.FastMath.tan((-135.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08871575677006045d + "'", double1 == 0.08871575677006045d);
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.116291929305059d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8402937512824985d) + "'", double1 == (-0.8402937512824985d));
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        double double2 = org.apache.commons.math.util.FastMath.min(0.69482111198402d, 1.0281149846033601d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.69482111198402d + "'", double2 == 0.69482111198402d);
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4334940234957783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0954391493904598d + "'", double1 == 1.0954391493904598d);
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9113950174654148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 802L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.380255399747059d + "'", double1 == 7.380255399747059d);
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7219067166708867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6608169530012122d + "'", double1 == 0.6608169530012122d);
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.23903957044228702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6215302002977275d) + "'", double1 == (-0.6215302002977275d));
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9380411276052492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0817889371810876d + "'", double1 == 1.0817889371810876d);
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.463960152516967d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9997560082775591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4402149326390393E-4d) + "'", double1 == (-2.4402149326390393E-4d));
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4345105648245638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4209664968123644d + "'", double1 == 0.4209664968123644d);
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.102016471589204E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7950499969146667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0850110459822049d + "'", double1 == 1.0850110459822049d);
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        double double1 = org.apache.commons.math.util.FastMath.abs(11.507222037885182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.507222037885182d + "'", double1 == 11.507222037885182d);
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-33L), (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5412093449191896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.04744297020583402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.048586398749557d + "'", double1 == 1.048586398749557d);
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.06773161457158877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06778350904650679d) + "'", double1 == (-0.06778350904650679d));
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        double double1 = org.apache.commons.math.util.FastMath.sin((-32.267649876135856d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7524166644748121d) + "'", double1 == (-0.7524166644748121d));
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        double double1 = org.apache.commons.math.util.FastMath.log(0.015840768307772042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.145168389493613d) + "'", double1 == (-4.145168389493613d));
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.0812030006757882d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2083.76558392283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.3685702791956d + "'", double1 == 36.3685702791956d);
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.113820254782413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        double double1 = org.apache.commons.math.util.FastMath.tanh(132058.36709719698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.5216140716751916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.90472564327378d + "'", double1 == 16.90472564327378d);
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.017852771405714795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017854668334596254d + "'", double1 == 0.017854668334596254d);
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        double double2 = org.apache.commons.math.util.FastMath.max(0.851794930779705d, 1.3960301412496883d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3960301412496883d + "'", double2 == 1.3960301412496883d);
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (-90L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.192987713658941d) + "'", double1 == (-5.192987713658941d));
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.002737247938193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7637144409979837d + "'", double1 == 1.7637144409979837d);
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8739456127896417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6435011087932844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.86989764584402d + "'", double1 == 36.86989764584402d);
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9969953215678263d + "'", double1 == 0.9969953215678263d);
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2239800905693157d + "'", double1 == 2.2239800905693157d);
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        double double1 = org.apache.commons.math.util.FastMath.log(2.0281127352162502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.707105673541031d + "'", double1 == 0.707105673541031d);
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9882684920925461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1938123060184203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.978407872665517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(49.59008907222208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.673936362332147d + "'", double1 == 3.673936362332147d);
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6502731920226421d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        double double1 = org.apache.commons.math.util.FastMath.sinh(8.194012623990515E-40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.194012623990515E-40d + "'", double1 == 8.194012623990515E-40d);
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) 37);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5988920145399181d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.212913171890624d + "'", double1 == 2.212913171890624d);
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9336979767153191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8966854678967096d, (-4.37072378740163d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8966854678967094d + "'", double2 == 0.8966854678967094d);
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.7659219106381584E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7659219106381588E-8d + "'", double1 == 2.7659219106381588E-8d);
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.019016309312897425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.05360906381648784d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05363477521367332d) + "'", double1 == (-0.05363477521367332d));
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9192986415975283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.453164869429617d + "'", double1 == 1.453164869429617d);
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.060912694476906684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2468049725530397d + "'", double1 == 0.2468049725530397d);
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5707962991356774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.162447344686678d + "'", double1 == 1.162447344686678d);
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 37);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 37L + "'", long1 == 37L);
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.005656701421335315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005656731588827726d + "'", double1 == 0.005656731588827726d);
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        double double2 = org.apache.commons.math.util.FastMath.min(1.6019895799783384d, 1.5847565194219465E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5847565194219465E-6d + "'", double2 == 1.5847565194219465E-6d);
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.008491621662199392d), (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008491621662199392d) + "'", double2 == (-0.008491621662199392d));
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2799416321930788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0857505427825869d + "'", double1 == 1.0857505427825869d);
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8337177321043896d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9149994934381422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03857914636751945d) + "'", double1 == (-0.03857914636751945d));
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000145960805298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29661580689411d + "'", double1 == 57.29661580689411d);
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(13.188688139030402d, 104.9439513269027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.188688139030404d + "'", double2 == 13.188688139030404d);
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9891860359276023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7799618405265213d + "'", double1 == 0.7799618405265213d);
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        double double1 = org.apache.commons.math.util.FastMath.abs(36.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.99999999999999d + "'", double1 == 36.99999999999999d);
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-33.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.658886145103398E-15d + "'", double1 == 4.658886145103398E-15d);
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5847565194232725E-6d, 1.0586370213946186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5847565194232727E-6d + "'", double2 == 1.5847565194232727E-6d);
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.466743204778643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 321.6932462224291d + "'", double1 == 321.6932462224291d);
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251568E-16d + "'", double1 == 1.1102230246251568E-16d);
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0586370213946186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9222344721288218d + "'", double1 == 0.9222344721288218d);
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0176064912058518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7941243666430793d + "'", double1 == 0.7941243666430793d);
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8450529998374032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2224828094267657d + "'", double1 == 1.2224828094267657d);
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9836065573770492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771338887377971d + "'", double1 == 0.7771338887377971d);
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.45231565944180985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.899437456983869d + "'", double1 == 0.899437456983869d);
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9105090496960474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.2503189451462755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.04318879777708654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04317538255671398d) + "'", double1 == (-0.04317538255671398d));
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.5435938534266416E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.22847976310912121d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003987724140430841d) + "'", double1 == (-0.003987724140430841d));
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8674595620891006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5191607731424398d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49828374042771184d) + "'", double1 == (-0.49828374042771184d));
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.6516488549852542E98d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 226.15511320840673d + "'", double1 == 226.15511320840673d);
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.0634370688955608d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9067898571222959d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.101088875655695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9700632468607546d + "'", double1 == 1.9700632468607546d);
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8548021080203528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.854802108020353d + "'", double1 == 0.854802108020353d);
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.08738234671223125d, 0.3870653233249402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08738234671223126d + "'", double2 == 0.08738234671223126d);
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.1587235990851068d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8587926892005782d) + "'", double1 == (-0.8587926892005782d));
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        double double1 = org.apache.commons.math.util.FastMath.atanh(92.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1782893802790361E11d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        float float2 = org.apache.commons.math.util.FastMath.min(7.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6268604078470186d) + "'", double1 == (-3.6268604078470186d));
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.017453292519943424d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6033871039701522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.57153447011112d + "'", double1 == 34.57153447011112d);
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2191734374167393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9388149908366094d + "'", double1 == 0.9388149908366094d);
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.765921910638158E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7659218723865387E-8d + "'", double1 == 2.7659218723865387E-8d);
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2037005703909553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.080398205182299E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.080810485818935E-5d + "'", double1 == 9.080810485818935E-5d);
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        double double1 = org.apache.commons.math.util.FastMath.log(0.01439333540156539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.2409899988698445d) + "'", double1 == (-4.2409899988698445d));
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1752012685192503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.238794745664782d + "'", double1 == 3.238794745664782d);
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.90913956779035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4022470863037217d + "'", double1 == 1.4022470863037217d);
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999999958773184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735841043668d + "'", double1 == 0.8813735841043668d);
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9173172747640832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9683274362856896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2523536496331222d + "'", double1 == 0.2523536496331222d);
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        double double1 = org.apache.commons.math.util.FastMath.atan(89.99998294450721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5596856707919322d + "'", double1 == 1.5596856707919322d);
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6435011087932844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9421475168289407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6794497296418427d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        double double1 = org.apache.commons.math.util.FastMath.ceil(17.98611111111111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.0d + "'", double1 == 18.0d);
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.7316602644632267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.835438933818835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.267884728309445d + "'", double1 == 6.267884728309445d);
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0665578081381937d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0010994967881021618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001099496788102162d + "'", double1 == 0.001099496788102162d);
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.658886145103398E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        double double1 = org.apache.commons.math.util.FastMath.log(0.04744297020583402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0482269165174563d) + "'", double1 == (-3.0482269165174563d));
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8112385339895775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1306410149075632d + "'", double1 == 1.1306410149075632d);
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7726957173974609d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2926117730048923d, 62.307354339300744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020742758124513632d + "'", double2 == 0.020742758124513632d);
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, 802L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 802L + "'", long2 == 802L);
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.927271896797736d, 4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19955016702389086d + "'", double2 == 0.19955016702389086d);
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2897566425056355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4640394399440586d + "'", double1 == 3.4640394399440586d);
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9173172747640832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.037480427855015416d) + "'", double1 == (-0.037480427855015416d));
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.997529084960586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.997529084960586d + "'", double1 == 0.997529084960586d);
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        double double2 = org.apache.commons.math.util.FastMath.min(1.835438933818835d, 0.8638723945101193d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8638723945101193d + "'", double2 == 0.8638723945101193d);
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8939966636005579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4646093726908928d + "'", double1 == 0.4646093726908928d);
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.608125177669901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.07695912379014387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.409432988200091d + "'", double1 == 4.409432988200091d);
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 90.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5596856728972892d + "'", double1 == 1.5596856728972892d);
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.18573988815053546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9827998817355765d + "'", double1 == 0.9827998817355765d);
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        double double2 = org.apache.commons.math.util.FastMath.max(0.01220895588284645d, 0.013657851706229811d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013657851706229811d + "'", double2 == 0.013657851706229811d);
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.0501628923259995E35d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5672637267613392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.134866080473415d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.0281127352162502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4241182307716767d + "'", double1 == 1.4241182307716767d);
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.512687362897283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2017803571211352d + "'", double1 == 1.2017803571211352d);
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.0355757685426394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.027958762301768844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5428339206859458d + "'", double1 == 1.5428339206859458d);
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8631635751882506d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.8962960182681E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.016668889589171274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016670433674032956d + "'", double1 == 0.016670433674032956d);
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        long long2 = org.apache.commons.math.util.FastMath.min(5507L, (long) 34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3345269173680483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32858228057636046d + "'", double1 == 0.32858228057636046d);
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8298698279324331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9630272572571656d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.85498679162073d) + "'", double1 == (-0.85498679162073d));
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999999686043177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999895347724d + "'", double1 == 0.9999999895347724d);
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) (-33L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.7783607304516975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4058194382235059d + "'", double1 == 1.4058194382235059d);
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        float float1 = org.apache.commons.math.util.FastMath.abs(108.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 108.0f + "'", float1 == 108.0f);
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.17129545733050197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17129545733050197d + "'", double1 == 0.17129545733050197d);
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.8867182812524047d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-50.8052151328571d) + "'", double1 == (-50.8052151328571d));
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5729347079345366d, 0.9210231484373848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5729347079345366d + "'", double2 == 0.5729347079345366d);
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5944359846634683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5330785122775574d) + "'", double1 == (-0.5330785122775574d));
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7673695592041386d, 0.016670433674032956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5490756164177393d + "'", double2 == 1.5490756164177393d);
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.01334339874628798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013343794706920285d + "'", double1 == 0.013343794706920285d);
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7081168061982549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.535391480731942d + "'", double1 == 0.535391480731942d);
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.5258607844979077E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7734137622334677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6555929984114899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7850452143345826d + "'", double1 == 0.7850452143345826d);
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7219067166708867d, 0.3632703054402189d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7219067166708866d + "'", double2 == 0.7219067166708866d);
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5175807674647721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5410013896544883d) + "'", double1 == (-0.5410013896544883d));
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 33, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.934714363860833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999998104982519d + "'", double1 == 0.999998104982519d);
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5144957554275267d, (-0.10238493598423042d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10238493598423042d) + "'", double2 == (-0.10238493598423042d));
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        double double1 = org.apache.commons.math.util.FastMath.asinh(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5296739074871453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7277869932110255d + "'", double1 == 0.7277869932110255d);
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-2), (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6709975465431064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1018538754645497d + "'", double1 == 1.1018538754645497d);
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2311438316434992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22715447923092077d + "'", double1 == 0.22715447923092077d);
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7126526144249964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6191672735562165d + "'", double1 == 0.6191672735562165d);
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5675499795375124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6035270795055018d) + "'", double1 == (-0.6035270795055018d));
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6339015320914385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2077341857639758d + "'", double1 == 1.2077341857639758d);
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.617715934751366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.617715934751366d + "'", double1 == 1.617715934751366d);
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9756299818288702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.514896364211656d + "'", double1 == 1.514896364211656d);
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9891860359423812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6877255278973402d + "'", double1 == 0.6877255278973402d);
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3946872830200805d, 0.0259963653564615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3946872830200803d + "'", double2 == 1.3946872830200803d);
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.49724292869339315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46143952039710356d + "'", double1 == 0.46143952039710356d);
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        double double1 = org.apache.commons.math.util.FastMath.rint((-4.187482763357499d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9607190280136697d, (-15.35252977886304d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-15.35252977886304d) + "'", double2 == (-15.35252977886304d));
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        long long1 = org.apache.commons.math.util.FastMath.abs((-36L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 0, (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.031814983519345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0157829411440935d + "'", double1 == 1.0157829411440935d);
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4444561992238574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.239546047417951d + "'", double1 == 4.239546047417951d);
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5596122796450436d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.5435938534266416E16d, (-0.04318879777708654d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1908037655575804d + "'", double2 == 0.1908037655575804d);
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-52.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.644483341943245d) + "'", double1 == (-4.644483341943245d));
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        double double1 = org.apache.commons.math.util.FastMath.sinh(8.510293288140764E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.1295131165012608E9d, 4.761141324937584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.619223800483001E45d + "'", double2 == 1.619223800483001E45d);
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7408664348929599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6296683555679016d) + "'", double1 == (-0.6296683555679016d));
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9171441568298646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.2308123878770227d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8925588891839019d) + "'", double1 == (-0.8925588891839019d));
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.289917197127757d + "'", double1 == 27.289917197127757d);
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6865874069985795d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.3025850929940455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1610795826858162d + "'", double1 == 1.1610795826858162d);
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8674595620891006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42001722271167297d + "'", double1 == 0.42001722271167297d);
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5805651145852763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8361528200478593d + "'", double1 == 0.8361528200478593d);
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.984871312738818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999686043177d + "'", double1 == 0.9999999686043177d);
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9738051722046778d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8558700593570223d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        float float2 = org.apache.commons.math.util.FastMath.max(7.0f, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7157658795650589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8460294791347751d + "'", double1 == 0.8460294791347751d);
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2316777559563157d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.6574544541530776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9773686924805424d + "'", double1 == 0.9773686924805424d);
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        double double2 = org.apache.commons.math.util.FastMath.max(5.249772867773091d, 1.2717104239752093d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.249772867773091d + "'", double2 == 5.249772867773091d);
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5659403777711782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6352559049474427d) + "'", double1 == (-0.6352559049474427d));
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.2674359895586114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3555350356334037d + "'", double1 == 0.3555350356334037d);
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.079985961979838E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985949503008E-5d + "'", double1 == 9.079985949503008E-5d);
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2273817004129048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021421851850931834d + "'", double1 == 0.021421851850931834d);
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4058194382235059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.580829006249046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7875196816685027d + "'", double1 == 0.7875196816685027d);
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.7456241416655578d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.43429448190325176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35227851485819933d) + "'", double1 == (-0.35227851485819933d));
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.4402149326390393E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.710505431213761E-20d + "'", double1 == 2.710505431213761E-20d);
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.4968229050023305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.013787719250806334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01378859300458183d + "'", double1 == 0.01378859300458183d);
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.012208349338536975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1307589219114205E-4d) + "'", double1 == (-2.1307589219114205E-4d));
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6672440571753369d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        double double2 = org.apache.commons.math.util.FastMath.max(35.00000000000001d, 1.3956124250860895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000000000001d + "'", double2 == 35.00000000000001d);
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.56340880499775d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 37L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        double double1 = org.apache.commons.math.util.FastMath.log(1.453164869429617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.373743846444029d + "'", double1 == 0.373743846444029d);
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6073784172994565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5751415331727446d + "'", double1 == 0.5751415331727446d);
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        double double1 = org.apache.commons.math.util.FastMath.exp(5507.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.987907961181548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.475367215443692d + "'", double1 == 0.475367215443692d);
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.9559709842120367d, 0.037010624154675d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9559709842120365d + "'", double2 == 1.9559709842120365d);
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.49602575992282094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7403906113732632d, (-0.4958174067642112d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4958174067642112d) + "'", double2 == (-0.4958174067642112d));
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.12585691605953506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12619156847664464d) + "'", double1 == (-0.12619156847664464d));
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        float float2 = org.apache.commons.math.util.FastMath.min(3.9481478E13f, (float) (-90L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5378946274303922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2199734862326173d + "'", double1 == 2.2199734862326173d);
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.69482111198402d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.0539731556403096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.781639158231253d + "'", double1 == 1.781639158231253d);
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.690023998518423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.227020537235472d + "'", double1 == 2.227020537235472d);
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4453238447142773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36833341044372625d + "'", double1 == 0.36833341044372625d);
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        double double1 = org.apache.commons.math.util.FastMath.acosh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999995877692d + "'", double1 == 9.999999995877692d);
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.013276747223059477d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013277137279665579d) + "'", double1 == (-0.013277137279665579d));
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4068245344922743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8739456127896417d + "'", double1 == 0.8739456127896417d);
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        double double1 = org.apache.commons.math.util.FastMath.signum((-2.356194490192344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.9864372157282446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.986437215728245d + "'", double1 == 3.986437215728245d);
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        long long1 = org.apache.commons.math.util.FastMath.round(11013.999999999996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11014L + "'", long1 == 11014L);
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2468049725530397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9696979373842117d + "'", double1 == 0.9696979373842117d);
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.551565975503502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.04417790591315649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.045183477299801184d) + "'", double1 == (-0.045183477299801184d));
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.1671517813002206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.423938653542384d + "'", double1 == 4.423938653542384d);
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8414398880534d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-34.882786993956714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1998.6364724075595d) + "'", double1 == (-1998.6364724075595d));
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6995216443485195d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8848257745809853d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7975453910589408d) + "'", double1 == (-0.7975453910589408d));
    }
}

