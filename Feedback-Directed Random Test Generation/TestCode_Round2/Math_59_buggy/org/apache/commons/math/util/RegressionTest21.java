package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

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
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        double double1 = org.apache.commons.math.util.FastMath.acos(226.84826038896668d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.1918568476239906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2989847789037956d + "'", double1 == 1.2989847789037956d);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        double double2 = org.apache.commons.math.util.FastMath.max(0.005202425297685838d, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9067898571222958d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5961815394648626d) + "'", double1 == (-0.5961815394648626d));
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.751100853508406E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.751100853508407E12d + "'", double1 == 6.751100853508407E12d);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.625375731261228d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.202004199788799d + "'", double1 == 1.202004199788799d);
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8948825727293745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.085205980987292d + "'", double1 == 1.085205980987292d);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5936569354152138d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.35049754306911085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.93920199015647d + "'", double1 == 0.93920199015647d);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7963459334455114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5857545646094631d + "'", double1 == 0.5857545646094631d);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 7, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.385765023619431d, 1.0157829411440935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.38576502361943d + "'", double2 == 9.38576502361943d);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8222374069787943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.47100149383084566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43900814795073295d + "'", double1 == 0.43900814795073295d);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.575013288525111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.520609603318919d + "'", double1 == 1.520609603318919d);
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        double double2 = org.apache.commons.math.util.FastMath.min(0.007826939472082893d, 0.7591415563789916d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007826939472082893d + "'", double2 == 0.007826939472082893d);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9685252333342943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6340569740709547d + "'", double1 == 1.6340569740709547d);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        double double1 = org.apache.commons.math.util.FastMath.abs(97.00000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000007d + "'", double1 == 97.00000000000007d);
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.681774213978926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.681774213978926d + "'", double1 == 0.681774213978926d);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.1193499605547798d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.838249024841735d) + "'", double1 == (-6.838249024841735d));
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7456241416655577d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        double double2 = org.apache.commons.math.util.FastMath.max(5.872732826701256E-25d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.872732826701256E-25d + "'", double2 == 5.872732826701256E-25d);
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.034009715875359614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03402283451301357d + "'", double1 == 0.03402283451301357d);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.56340880499775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8599805959475393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.273258610939344d + "'", double1 == 49.273258610939344d);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.202019757600187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2020197576001874d + "'", double1 == 2.2020197576001874d);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.12819302534937357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12784448771872076d + "'", double1 == 0.12784448771872076d);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.004063517469127154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004055283679910201d + "'", double1 == 0.004055283679910201d);
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        int int1 = org.apache.commons.math.util.FastMath.round(29.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        double double1 = org.apache.commons.math.util.FastMath.asin(45.846803902957575d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.86264467253485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9519423501176574d + "'", double1 == 0.9519423501176574d);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8764738819028888d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(171.14961820688242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9871243512413317d + "'", double1 == 2.9871243512413317d);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        float float2 = org.apache.commons.math.util.FastMath.max(33.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.830640877860784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.830640877860784d + "'", double1 == 1.830640877860784d);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.5681661967396565d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) 108);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, (float) 6013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6013.0f + "'", float2 == 6013.0f);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        double double1 = org.apache.commons.math.util.FastMath.cos(267143.4231367569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33100170739733353d + "'", double1 == 0.33100170739733353d);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1546709519529945d, (-0.01195230772972848d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5811472244644025d + "'", double2 == 1.5811472244644025d);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7330383821741316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9016588263401231d) + "'", double1 == (-0.9016588263401231d));
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.580829006249046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6637128698018219d + "'", double1 == 0.6637128698018219d);
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9957273701577616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.18573988815053546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18792118711386155d + "'", double1 == 0.18792118711386155d);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1023185539947518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.951905658491268d + "'", double1 == 0.951905658491268d);
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.010625904569068452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010682762630607235d) + "'", double1 == (-0.010682762630607235d));
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5078344024735725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.22820026671210777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23022877357776206d + "'", double1 == 0.23022877357776206d);
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) ' ', (-0.5151448119299741d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.00833887421809711d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4777822985874187d) + "'", double1 == (-0.4777822985874187d));
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5382334032499028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9135245975035817d), 1.2966288756752378d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6137652589938143d) + "'", double2 == (-0.6137652589938143d));
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.12873439758804212d), (-0.7587969864330162d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12873439758804214d) + "'", double2 == (-0.12873439758804214d));
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.017854668334596254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.04494641518824685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.044931295619175186d + "'", double1 == 0.044931295619175186d);
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        float float2 = org.apache.commons.math.util.FastMath.min(108.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2897566425056355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.015106004980173343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015104856117392158d + "'", double1 == 0.015104856117392158d);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7587814125971685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7587814125971685d + "'", double1 == 0.7587814125971685d);
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9330817719775168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5953607374196107d + "'", double1 == 0.5953607374196107d);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.009616414459745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6808231837525209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, 108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8462950832072025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9549580234781563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04608789394056775d) + "'", double1 == (-0.04608789394056775d));
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9997560082775591d, 0.012822889714884954d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9997560082775591d + "'", double2 == 0.9997560082775591d);
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.22259818523278826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2189930457362161d + "'", double1 == 0.2189930457362161d);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5907801071923648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3519046403604085d + "'", double1 == 2.3519046403604085d);
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        double double1 = org.apache.commons.math.util.FastMath.log(1.552892793040788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4401195096142341d + "'", double1 == 0.4401195096142341d);
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7734137622334677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.16715178130022d + "'", double1 == 2.16715178130022d);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-4.0052823489951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 34, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5430891022283284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        double double1 = org.apache.commons.math.util.FastMath.log1p(465.7227961062573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.145735497073049d + "'", double1 == 6.145735497073049d);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.9914834027794717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1054395775850399d + "'", double1 == 1.1054395775850399d);
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.2458627722545559d), (-0.34934088751440634d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2458627722545559d) + "'", double2 == (-0.2458627722545559d));
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.7007210565838747d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7007210565838746d) + "'", double2 == (-0.7007210565838746d));
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6036945662319714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6989400694439308d + "'", double1 == 0.6989400694439308d);
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9526653195309732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9022330041131084d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6198592477446704d + "'", double1 == 0.6198592477446704d);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        double double1 = org.apache.commons.math.util.FastMath.acos(11.016627609179162d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(66029.68355238467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.41845780119938d + "'", double1 == 40.41845780119938d);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.02627284444545242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026266801062226192d + "'", double1 == 0.026266801062226192d);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2397288196990742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23523959206956738d + "'", double1 == 0.23523959206956738d);
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(57.501923386946416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3294.6175239566337d + "'", double1 == 3294.6175239566337d);
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        long long1 = org.apache.commons.math.util.FastMath.round(0.813497102495516d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0511733744167922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9170997185621591d + "'", double1 == 0.9170997185621591d);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.064947506970082E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.064947506970082E-9d + "'", double1 == 9.064947506970082E-9d);
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.030694434124892367d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6014955827491153d + "'", double1 == 1.6014955827491153d);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        int int1 = org.apache.commons.math.util.FastMath.round((-36.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36) + "'", int1 == (-36));
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5847565194232731E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847565194239366E-6d + "'", double1 == 1.5847565194239366E-6d);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.814506754801041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.1544346900318834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        long long2 = org.apache.commons.math.util.FastMath.min(2979L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2511260027859388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2854720471862875d + "'", double1 == 1.2854720471862875d);
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.1556157735575975E15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.76225926565046E13d) + "'", double1 == (-3.76225926565046E13d));
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7098026097087103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.66869382368069d + "'", double1 == 40.66869382368069d);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.457061651952349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45706165195234905d + "'", double1 == 0.45706165195234905d);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-27.87634950490267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.0d) + "'", double1 == (-27.0d));
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0106994690564552d + "'", double1 == 3.0106994690564552d);
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        double double1 = org.apache.commons.math.util.FastMath.log(0.015229269668383628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.184536066712487d) + "'", double1 == (-4.184536066712487d));
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 17L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.0d + "'", double1 == 17.0d);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 71);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 71L + "'", long1 == 71L);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11.016627609179162d, (-0.7415548299632772d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.638007265453231d + "'", double2 == 1.638007265453231d);
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 17);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 17.0f + "'", float1 == 17.0f);
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-15.898288562430334d), 0.610267336878759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5324294382103896d) + "'", double2 == (-1.5324294382103896d));
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.3519046403604085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3714197089836745d + "'", double1 == 0.3714197089836745d);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.935051887835441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0773900674657881d + "'", double1 == 1.0773900674657881d);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7927826916006487E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (-36L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12796368962740468d) + "'", double1 == (-0.12796368962740468d));
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        long long1 = org.apache.commons.math.util.FastMath.abs(71L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 71L + "'", long1 == 71L);
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.461303446511725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008051263992427152d) + "'", double1 == (-0.008051263992427152d));
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.08517145339109096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2918414867545239d + "'", double1 == 0.2918414867545239d);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9792875536939665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.662558635973709d + "'", double1 == 2.662558635973709d);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5951428498639341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5951428498639341d + "'", double1 == 0.5951428498639341d);
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        double double2 = org.apache.commons.math.util.FastMath.max(0.027955121057188472d, (-0.6995216443485194d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027955121057188472d + "'", double2 == 0.027955121057188472d);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.04602563205824346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046041883579973825d + "'", double1 == 0.046041883579973825d);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9593355397176575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.743980336957493d + "'", double1 == 0.743980336957493d);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6156614753256583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6632251157578453d + "'", double1 == 0.6632251157578453d);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7812347470298677d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7179479035023005d) + "'", double1 == (-0.7179479035023005d));
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.384185791015625E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9999575569411912d, 0.7219067166708867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9454985249331563d + "'", double2 == 0.9454985249331563d);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        int int2 = org.apache.commons.math.util.FastMath.min(9, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        float float2 = org.apache.commons.math.util.FastMath.max(71.0f, (float) 802L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 802.0f + "'", float2 == 802.0f);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4901161193847656E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999999d + "'", double1 == 0.9999999999999999d);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999303766734422d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.737447891018455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2844631979315773d + "'", double1 == 1.2844631979315773d);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9050824179664846d, 6.845782423829181d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5052383995933684d + "'", double2 == 0.5052383995933684d);
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7735460199712506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7154376517332249d + "'", double1 == 0.7154376517332249d);
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        long long1 = org.apache.commons.math.util.FastMath.round(0.23018603204480417d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5707963309172037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45158270791379707d + "'", double1 == 0.45158270791379707d);
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0665578081381937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8121891220401187d + "'", double1 == 1.8121891220401187d);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.005202401830372638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5655939014970837d + "'", double1 == 1.5655939014970837d);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        double double1 = org.apache.commons.math.util.FastMath.signum(71.61475609949856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.475367215443692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        double double2 = org.apache.commons.math.util.FastMath.max((-5.124738597288386E-4d), 0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3010299956639812d + "'", double2 == 0.3010299956639812d);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        long long2 = org.apache.commons.math.util.FastMath.max(108L, (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.9733523361592433d, 285.24676385439324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.08383542933477E170d + "'", double2 == 8.08383542933477E170d);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.0106994690564552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.17542625528474d + "'", double1 == 10.17542625528474d);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.2233720368547748E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.284602905907602E20d + "'", double1 == 5.284602905907602E20d);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 33, (long) 34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4330001021490115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8891251057861819d + "'", double1 == 0.8891251057861819d);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9914834027794717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9128085623970987d + "'", double1 == 0.9128085623970987d);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7193708484374041d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8960198100114791d) + "'", double1 == (-0.8960198100114791d));
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3621252723796604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8595617529393405d + "'", double1 == 0.8595617529393405d);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8245714037420401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6775503294993944d + "'", double1 == 0.6775503294993944d);
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        double double1 = org.apache.commons.math.util.FastMath.floor(51.68565583622363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.0d + "'", double1 == 51.0d);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7873853577122644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8713049340358208d + "'", double1 == 0.8713049340358208d);
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9959055180610699d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        long long1 = org.apache.commons.math.util.FastMath.round(0.30784005477304416d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7179479035023005d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4160533322721292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8821353544448752d + "'", double1 == 0.8821353544448752d);
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 34, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, (float) (-90));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        long long2 = org.apache.commons.math.util.FastMath.max(108L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5113565640720369d), 1.818989403547511E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5113565640720369d) + "'", double2 == (-0.5113565640720369d));
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.14447684095481458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4258120808572918d + "'", double1 == 1.4258120808572918d);
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.04007967425933629d), 4.584967478670571d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.13381059201667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.164304146402896d) + "'", double1 == (-4.164304146402896d));
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        double double1 = org.apache.commons.math.util.FastMath.exp(63.11868704625112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.582839913974215E27d + "'", double1 == 2.582839913974215E27d);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.04074367013117616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.040721147096048974d + "'", double1 == 0.040721147096048974d);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.33870947017391045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33870947017391045d + "'", double1 == 0.33870947017391045d);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5377459288874316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.6014946556761336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030693507488720375d) + "'", double1 == (-0.030693507488720375d));
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5129881229211121d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.538662239231858d) + "'", double1 == (-0.538662239231858d));
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4333079051049607d) + "'", double1 == (-0.4333079051049607d));
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.687276356591784d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        long long1 = org.apache.commons.math.util.FastMath.round(0.002774496623513146d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.0019853938729656843d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.001983424282237031d) + "'", double1 == (-0.001983424282237031d));
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.11400146268484936d), 11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11400146268484936d) + "'", double2 == (-0.11400146268484936d));
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        long long1 = org.apache.commons.math.util.FastMath.round((-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5874010519681996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.9513806724049d + "'", double1 == 90.9513806724049d);
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        double double2 = org.apache.commons.math.util.FastMath.atan2(19099.184266826574d, 0.019788778947328264d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570795290688921d + "'", double2 == 1.570795290688921d);
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-6.755849220440437d), 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8515714604696099d) + "'", double2 == (-0.8515714604696099d));
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3664606138485781d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, 802L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 802L + "'", long2 == 802L);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.999999983592552d, 0.4081432892132331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.183289638778097d + "'", double2 == 1.183289638778097d);
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.262122178163566E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5d + "'", double1 == 0.5d);
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 7, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.32719023706934d, (-0.5746813724695927d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.624020913412851d + "'", double2 == 2.624020913412851d);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.140817749422853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.41914479428133d + "'", double1 == 31.41914479428133d);
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.48674355529070396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4529863227403715d) + "'", double1 == (-0.4529863227403715d));
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5953181448879166d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5071961149184759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7974901103222789d + "'", double1 == 0.7974901103222789d);
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        int int1 = org.apache.commons.math.util.FastMath.round(36.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(32.826740701209424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.20191099075938d + "'", double1 == 3.20191099075938d);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.238794745664782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.73187726534497d + "'", double1 == 12.73187726534497d);
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        int int2 = org.apache.commons.math.util.FastMath.min(9, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6176678238363069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8545977456466398d + "'", double1 == 1.8545977456466398d);
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.011658811940024915d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        double double1 = org.apache.commons.math.util.FastMath.exp((-36.005914226169836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.305845133982261E-16d + "'", double1 == 2.305845133982261E-16d);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.026582642806498483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026579512204399015d) + "'", double1 == (-0.026579512204399015d));
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        double double1 = org.apache.commons.math.util.FastMath.sin(50.0151182431195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24775683461348721d) + "'", double1 == (-0.24775683461348721d));
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        double double1 = org.apache.commons.math.util.FastMath.asin((-56.72239180482502d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1669696685421218d, 2.2870787948203515d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.166969668542122d + "'", double2 == 1.166969668542122d);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0054176192810886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8878506096345549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.812139786972189d), 2.147483648E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8121397869721889d) + "'", double2 == (-0.8121397869721889d));
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        int int2 = org.apache.commons.math.util.FastMath.min(7, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8878506096345549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7346646087760579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.742055620721742d + "'", double1 == 0.742055620721742d);
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.35227851485819933d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006148419968311344d) + "'", double1 == (-0.006148419968311344d));
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9118234861458008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.488856793930381d + "'", double1 == 2.488856793930381d);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2018125075709377E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2018125075709377E20d + "'", double1 == 1.2018125075709377E20d);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.15845888697098034d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15912284981466723d) + "'", double1 == (-0.15912284981466723d));
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        double double1 = org.apache.commons.math.util.FastMath.atanh(97.00000000000007d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.023008927771751345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2844234894502472d) + "'", double1 == (-0.2844234894502472d));
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 33.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        double double1 = org.apache.commons.math.util.FastMath.sin(63.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16735570030280691d + "'", double1 == 0.16735570030280691d);
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6229473377768496d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5382334032499028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5126199647981559d) + "'", double1 == (-0.5126199647981559d));
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        float float1 = org.apache.commons.math.util.FastMath.abs(802.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 802.0f + "'", float1 == 802.0f);
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0761361354023782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07337697362731237d + "'", double1 == 0.07337697362731237d);
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7720875399559285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7720875399559286d + "'", double1 == 0.7720875399559286d);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.04065783898981228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.096131571179496E-4d + "'", double1 == 7.096131571179496E-4d);
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        double double2 = org.apache.commons.math.util.FastMath.min(0.08738234671223125d, 1.5647522726684346d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08738234671223125d + "'", double2 == 0.08738234671223125d);
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0038848218538854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1812046700803274d + "'", double1 == 1.1812046700803274d);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999303766734422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.014613329118427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.215136700282915d + "'", double1 == 10.215136700282915d);
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.025881092186968428d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.952027174244469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9997607774060867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.693027562108987d + "'", double1 == 0.693027562108987d);
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36L), (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        double double1 = org.apache.commons.math.util.FastMath.log1p(127.19511139207273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.853553411092362d + "'", double1 == 4.853553411092362d);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        long long2 = org.apache.commons.math.util.FastMath.min(34L, (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        long long2 = org.apache.commons.math.util.FastMath.min(9L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473515096263d + "'", double1 == 1.1624473515096263d);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.00107213104154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3175766709741277d + "'", double1 == 1.3175766709741277d);
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.791028787322563d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.4529863227403715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.603281472741806d) + "'", double1 == (-0.603281472741806d));
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8844064800831344d, 0.01134916460125532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9986068569369045d + "'", double2 == 0.9986068569369045d);
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9386870615337011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9791298195138217d + "'", double1 == 0.9791298195138217d);
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6372778494888827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6005265266769105d + "'", double1 == 0.6005265266769105d);
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(36.3685702791956d, (-1.728901349234421d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.368570279195595d + "'", double2 == 36.368570279195595d);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3275811425819994d, 0.5015733900925633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.327581142581999d + "'", double2 == 2.327581142581999d);
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8813735841043668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7949577665769069d + "'", double1 == 0.7949577665769069d);
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        double double1 = org.apache.commons.math.util.FastMath.cos(57.29661580689411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7330860214110332d + "'", double1 == 0.7330860214110332d);
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5520883433674829d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5020837452016297d) + "'", double1 == (-0.5020837452016297d));
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.01565305086940654d, 1.0905417743683503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014352477285206713d + "'", double2 == 0.014352477285206713d);
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.020162834169477797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02016420058550522d + "'", double1 == 0.02016420058550522d);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3604756670132249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.202018531799359d + "'", double1 == 1.202018531799359d);
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1305148602552713d, (-0.009213268486503402d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.130514860255271d + "'", double2 == 1.130514860255271d);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8482836399575128d, 0.040657838989812276d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.993332477535909d + "'", double2 == 0.993332477535909d);
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (-36L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.2808376786846926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2771606071652981d + "'", double1 == 0.2771606071652981d);
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6179330631483282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7107932154652992d + "'", double1 == 0.7107932154652992d);
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.227971924677803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3818004626805416d + "'", double1 == 1.3818004626805416d);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2511260027859388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3896127456026699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4113433940043483d + "'", double1 == 0.4113433940043483d);
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2966743308943072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1102230246251568E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251568E-16d + "'", double1 == 1.1102230246251568E-16d);
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.009490791763571364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009490506817542547d + "'", double1 == 0.009490506817542547d);
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.005302331860359104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00530235670627217d) + "'", double1 == (-0.00530235670627217d));
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6649659815242346d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        double double1 = org.apache.commons.math.util.FastMath.tan(16.675653009906092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4519959879128448d + "'", double1 == 1.4519959879128448d);
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.016996106527921995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01699610652792199d) + "'", double1 == (-0.01699610652792199d));
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8163415799735064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.921844042868401d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5961815394648626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.15868603494876d) + "'", double1 == (-34.15868603494876d));
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, 11014L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.84242254198678E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.842422545771788E-5d + "'", double1 == 4.842422545771788E-5d);
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        float float1 = org.apache.commons.math.util.FastMath.abs(9.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0f + "'", float1 == 9.0f);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        double double1 = org.apache.commons.math.util.FastMath.cos(51.267151353526884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5388972264548336d + "'", double1 == 0.5388972264548336d);
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.0398853009457363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-59.58103892188216d) + "'", double1 == (-59.58103892188216d));
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5496267729847464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7976786466071603d) + "'", double1 == (-0.7976786466071603d));
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.080810485818935E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.081222803894845E-5d + "'", double1 == 9.081222803894845E-5d);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.30685281944008d + "'", double1 == 31.30685281944008d);
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2039980656902276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3334175389445417d + "'", double1 == 3.3334175389445417d);
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9092974268256817d), (-0.3786185863965946d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9092974268256816d) + "'", double2 == (-0.9092974268256816d));
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.6355590717614192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6173982341988522d + "'", double1 == 1.6173982341988522d);
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        double double1 = org.apache.commons.math.util.FastMath.cos(5507.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9776285026563134d) + "'", double1 == (-0.9776285026563134d));
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        double double2 = org.apache.commons.math.util.FastMath.min(4.518030890222253E39d, 1.5707963267842149d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267842149d + "'", double2 == 1.5707963267842149d);
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4991939135618992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1990207225524583d, (-0.10634503779918675d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9808829211175417d + "'", double2 == 0.9808829211175417d);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.02089234154942062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0087397904378297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7421431616314642d + "'", double1 == 1.7421431616314642d);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1371104755700765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01984632175761638d + "'", double1 == 0.01984632175761638d);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 33, 5507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9006667358439738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9006667358439739d + "'", double1 == 0.9006667358439739d);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        double double1 = org.apache.commons.math.util.FastMath.floor(2979.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.0d + "'", double1 == 2979.0d);
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.1071487177940904d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8362045005428747d) + "'", double1 == (-0.8362045005428747d));
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.407075111026485d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24485842048911236d + "'", double1 == 0.24485842048911236d);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8628069656298388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1681716026827291d) + "'", double1 == (-1.1681716026827291d));
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 97L, 0.011871350870521892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011871350870521892d + "'", double2 == 0.011871350870521892d);
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2230962529739251E283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6361861755880897d + "'", double1 == 0.6361861755880897d);
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.356194490192344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04112335167120564d) + "'", double1 == (-0.04112335167120564d));
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8471430772574462d, (-0.1283791160097205d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8471430772574462d + "'", double2 == 0.8471430772574462d);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-5L), (float) 34);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.48505801955099925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6156614753256583d + "'", double1 == 0.6156614753256583d);
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.13258856747480902d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13337102710078513d) + "'", double1 == (-0.13337102710078513d));
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.045864920222764E-4d), 1.310832494432086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.323611047439933E-4d) + "'", double2 == (-2.323611047439933E-4d));
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999067329932104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        double double1 = org.apache.commons.math.util.FastMath.ceil(33.76335528887579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.0d + "'", double1 == 34.0d);
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        float float2 = org.apache.commons.math.util.FastMath.min(71.0f, (float) 90L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 71.0f + "'", float2 == 71.0f);
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.322723236313804d, 5.520482796722225d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23516939684050342d + "'", double2 == 0.23516939684050342d);
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, 6013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6013L + "'", long2 == 6013L);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8510875494985548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8510875494985548d + "'", double1 == 0.8510875494985548d);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 71L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 71.0f + "'", float2 == 71.0f);
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        double double1 = org.apache.commons.math.util.FastMath.asinh(51.99999915301149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483325658015d + "'", double1 == 4.644483325658015d);
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1559734442091005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020175542667067784d + "'", double1 == 0.020175542667067784d);
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2273817004129048d, 72.13036685698037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.227381700412905d + "'", double2 == 1.227381700412905d);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.999297690985627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996487838164098d + "'", double1 == 0.9996487838164098d);
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0915250460768902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4611326826857243d + "'", double1 == 0.4611326826857243d);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6632349739413137d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.6163607106837756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.616360710683776d + "'", double1 == 2.616360710683776d);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42901.697232671475d + "'", double1 == 42901.697232671475d);
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.12619156847664464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5015837362314782d) + "'", double1 == (-0.5015837362314782d));
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.34001264921737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.10247724045135d + "'", double1 == 1.10247724045135d);
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.085205980987292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6489408307901663d + "'", double1 == 1.6489408307901663d);
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2085905988795835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9351175265194532d + "'", double1 == 0.9351175265194532d);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9735760889955918d, 3.1748021039363996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9184948618572503d + "'", double2 == 0.9184948618572503d);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.195945676325781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8299602189512373d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9397646230306858d) + "'", double1 == (-0.9397646230306858d));
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.229873870025155d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7076705531385649d) + "'", double1 == (-0.7076705531385649d));
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) (-33));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7746387500310367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5735968811048726d + "'", double1 == 0.5735968811048726d);
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7976786466071603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4942325408259016d + "'", double1 == 2.4942325408259016d);
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        double double1 = org.apache.commons.math.util.FastMath.log((-57.29577951308232d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9494699173294713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5843393826464682d + "'", double1 == 1.5843393826464682d);
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.111175469398392d, (-0.6367696710046598d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1111754693983915d + "'", double2 == 3.1111754693983915d);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2280208110551356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8011136627104332d + "'", double1 == 0.8011136627104332d);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6046661120266558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5728219362656274d + "'", double1 == 0.5728219362656274d);
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.8450529998374032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8450529998374032d + "'", double1 == 1.8450529998374032d);
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0037960591563502375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.5737918144912255d) + "'", double1 == (-5.5737918144912255d));
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.0019853938729656843d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.202774714925223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.593435709906836d + "'", double1 == 2.593435709906836d);
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.542076640466978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5185262773967965d + "'", double1 == 0.5185262773967965d);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 7, (-34L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0424724406933767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5040864688475301d + "'", double1 == 0.5040864688475301d);
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7866231740623315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4917890846793802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4917890846793804d + "'", double1 == 1.4917890846793804d);
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        double double1 = org.apache.commons.math.util.FastMath.acos(31.41914479428133d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5034300733007516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        long long2 = org.apache.commons.math.util.FastMath.min(6013L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8683173535625465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7851311873666217d + "'", double1 == 0.7851311873666217d);
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        double double2 = org.apache.commons.math.util.FastMath.atan2(35.0d, (-3.0482269165174563d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.657669321563539d + "'", double2 == 1.657669321563539d);
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.3151956127860944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9924642824645422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9924642824645423d + "'", double1 == 0.9924642824645423d);
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2548842878774133d, 1.149548905166106d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20776018333060398d + "'", double2 == 0.20776018333060398d);
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.23018603204480417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.188688139030402d + "'", double1 == 13.188688139030402d);
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 9, 0.1727924348551592d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1727924348551592d + "'", double2 == 0.1727924348551592d);
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8959387361703598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7143146117892941d + "'", double1 == 0.7143146117892941d);
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7134711286662471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.878884477011276d + "'", double1 == 40.878884477011276d);
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1917602223703327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1596819083340262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1596819083340264d + "'", double1 == 1.1596819083340264d);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.00833887421809711d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3621252723796604d, 466.427685571658d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3621252723796606d + "'", double2 == 1.3621252723796606d);
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9150577654397632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08876808407117655d) + "'", double1 == (-0.08876808407117655d));
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0948410127421968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5304129973211018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.74923067215376d + "'", double1 == 24.74923067215376d);
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.970460404611724E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.184431436059754E-6d + "'", double1 == 5.184431436059754E-6d);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8001343657838819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7327731746566131d + "'", double1 == 0.7327731746566131d);
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        long long2 = org.apache.commons.math.util.FastMath.min(90L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        long long2 = org.apache.commons.math.util.FastMath.max(37L, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.1371883631628275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.09057975226646062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09480881764456321d + "'", double1 == 0.09480881764456321d);
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.999297690985627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992976909856272d + "'", double1 == 0.9992976909856272d);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        double double1 = org.apache.commons.math.util.FastMath.asinh(14.048205817766327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3369062395763587d + "'", double1 == 3.3369062395763587d);
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7456241416655577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9630272572571653d) + "'", double1 == (-0.9630272572571653d));
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.10955796484928033d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.014013181411766374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014014098772510296d) + "'", double1 == (-0.014014098772510296d));
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.39604951489229284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0794581324702177d + "'", double1 == 1.0794581324702177d);
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1482743665672453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1493706264193658d + "'", double1 == 0.1493706264193658d);
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-90), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7637144409979837d, 3.720075976020837E-43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7637144409979837d + "'", double2 == 1.7637144409979837d);
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9029439985409666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9502336547086546d + "'", double1 == 0.9502336547086546d);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        int int2 = org.apache.commons.math.util.FastMath.max(29, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        double double2 = org.apache.commons.math.util.FastMath.min(2.2239800905693157d, 5.227971924677803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2239800905693157d + "'", double2 == 2.2239800905693157d);
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.015419200424859681d, 0.5408008620104859d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02850406746971129d + "'", double2 == 0.02850406746971129d);
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.30642979586841934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2973452010635529d) + "'", double1 == (-0.2973452010635529d));
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        double double2 = org.apache.commons.math.util.FastMath.max(0.617667823836307d, 1.1956282198912025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1956282198912025d + "'", double2 == 1.1956282198912025d);
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.1301077462402083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.138951094411878d + "'", double1 == 1.138951094411878d);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.14629076512480024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0025532555166894576d + "'", double1 == 0.0025532555166894576d);
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5103963463916682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6659513579200442d + "'", double1 == 1.6659513579200442d);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.020731076784300594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020734047212043572d + "'", double1 == 0.020734047212043572d);
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.356194490192345d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.527472836267328d), 0.7799146823298116d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5274728362673279d) + "'", double2 == (-0.5274728362673279d));
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 29);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 29L + "'", long1 == 29L);
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29100619138474915d) + "'", double1 == (-0.29100619138474915d));
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5153571826562113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.758661529898663d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030694434124892367d) + "'", double1 == (-0.030694434124892367d));
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857801796104d + "'", double1 == 9.848857801796104d);
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4033482475752073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.157286606807751d + "'", double1 == 2.157286606807751d);
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.1093389265928446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0019083242696415236d) + "'", double1 == (-0.0019083242696415236d));
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9651363175498938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015411341807902585d) + "'", double1 == (-0.015411341807902585d));
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        double double1 = org.apache.commons.math.util.FastMath.ceil(50.0151182431195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.0d + "'", double1 == 51.0d);
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.2223846932466054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22616347944228102d) + "'", double1 == (-0.22616347944228102d));
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3329906850709383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3271250688501994d + "'", double1 == 0.3271250688501994d);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.913891279076611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3591162572543806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1826254444110533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4454760174920582d + "'", double1 == 2.4454760174920582d);
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        long long2 = org.apache.commons.math.util.FastMath.min(9L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999999958776928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3604756670132249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        long long1 = org.apache.commons.math.util.FastMath.round(0.038858140883553674d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4931559611188556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.903903800587639d + "'", double1 == 0.903903800587639d);
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9998476951563913d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1977461928657023d + "'", double1 == 1.1977461928657023d);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.37960773902752176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3989579541099296d + "'", double1 == 0.3989579541099296d);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2286577832986674d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.017452975427475453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04494641520883384d + "'", double1 == 0.04494641520883384d);
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7099759466766968d + "'", double1 == 1.7099759466766968d);
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0190724274822965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.328766559139265E-4d + "'", double1 == 3.328766559139265E-4d);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.14353826050381374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.71483210598528d + "'", double1 == 1.71483210598528d);
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.50871659209645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9067110301197866d + "'", double1 == 0.9067110301197866d);
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.01565305086940654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001225115021897d + "'", double1 == 1.0001225115021897d);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        double double2 = org.apache.commons.math.util.FastMath.max(3.4657359027997265d, 0.0061837645452961654d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4657359027997265d + "'", double2 == 3.4657359027997265d);
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7451749797335945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.004625338125320674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0046253381253206745d + "'", double1 == 0.0046253381253206745d);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.23903957044228702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6206164268482706d + "'", double1 == 0.6206164268482706d);
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2586856194944183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2300680173628076d + "'", double1 == 0.2300680173628076d);
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7415933335367688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.09927770074216d + "'", double1 == 1.09927770074216d);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.989874861238103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6880717529591838d + "'", double1 == 0.6880717529591838d);
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.8246075608242496d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.6154095886644868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        int int2 = org.apache.commons.math.util.FastMath.max(90, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.437600971038334d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.9188537484079635d, 0.8922451992629652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.600659367886785d + "'", double2 == 2.600659367886785d);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        double double1 = org.apache.commons.math.util.FastMath.expm1(39.56166260838806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.51848940392213184E17d + "'", double1 == 1.51848940392213184E17d);
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        double double2 = org.apache.commons.math.util.FastMath.min(57.0d, 0.6251969292911949d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6251969292911949d + "'", double2 == 0.6251969292911949d);
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6038473373858848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.032112426622988d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4602561829880261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44538448762692606d + "'", double1 == 0.44538448762692606d);
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999818319398772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5573454913839022d + "'", double1 == 1.5573454913839022d);
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.04306315631998894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3505112428534634d + "'", double1 == 0.3505112428534634d);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.105427357600985E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3981.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.004888098971863d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017538605941165655d) + "'", double1 == (-0.017538605941165655d));
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        long long1 = org.apache.commons.math.util.FastMath.round(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.12487180307829396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.695994948662414d + "'", double1 == 1.695994948662414d);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-33), (float) 37L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04494641518824685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.044976718547599465d + "'", double1 == 0.044976718547599465d);
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.598892014539918d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8857088863088404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0880187727330415d + "'", double1 == 1.0880187727330415d);
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4343845205023977d, 0.665951357920044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2715447885686146d + "'", double2 == 1.2715447885686146d);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        double double1 = org.apache.commons.math.util.FastMath.rint(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3818004626805416d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9930827464263656d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.533964719567681d) + "'", double1 == (-1.533964719567681d));
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(120.42757201625034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1018576418661548d + "'", double1 == 2.1018576418661548d);
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        int int2 = org.apache.commons.math.util.FastMath.min(6013, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.039275474812808193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0400569536853328d + "'", double1 == 1.0400569536853328d);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7976186295363398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9233367034353793d + "'", double1 == 0.9233367034353793d);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7771338887377972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771338887377972d + "'", double1 == 0.7771338887377972d);
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8001776796227965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8001776796227966d + "'", double1 == 0.8001776796227966d);
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1312996469029764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.81869513218082d + "'", double1 == 64.81869513218082d);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        int int2 = org.apache.commons.math.util.FastMath.max(33, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.2324530857994436d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.841927185055936d) + "'", double1 == (-2.841927185055936d));
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        int int2 = org.apache.commons.math.util.FastMath.min(17, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2316777559563157d, 0.9891860359276023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8941553469910031d + "'", double2 == 0.8941553469910031d);
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        long long1 = org.apache.commons.math.util.FastMath.round(0.354638711533299d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        int int2 = org.apache.commons.math.util.FastMath.max(71, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(40.66869382368069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.6686938236807d + "'", double1 == 40.6686938236807d);
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-4.1223072818099046E-9d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.15393599517258413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.011871560217519d + "'", double1 == 1.011871560217519d);
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.013657851706229811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013751546232231121d + "'", double1 == 0.013751546232231121d);
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.21930323887902778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21754960276251115d) + "'", double1 == (-0.21754960276251115d));
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6969795110075692d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.062883717585775d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.1415888340962679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2334031175112166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.670596104879989d + "'", double1 == 0.670596104879989d);
    }
}

