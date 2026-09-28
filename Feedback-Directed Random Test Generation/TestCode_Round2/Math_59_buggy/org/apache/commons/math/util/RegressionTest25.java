package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

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
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12501");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3754263855773785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3754263855773785d + "'", double1 == 1.3754263855773785d);
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12502");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8325008986719311d, 0.10385869980070621d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9811406276316423d + "'", double2 == 0.9811406276316423d);
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12503");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.0656328345305126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12504");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.19337893245079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9986593903070539d) + "'", double1 == (-0.9986593903070539d));
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12505");
        double double1 = org.apache.commons.math.util.FastMath.tanh(36.86989764584402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12506");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8450980400142568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12507");
        double double1 = org.apache.commons.math.util.FastMath.atanh(24.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12508");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.978407872665517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2917.2826791571506d + "'", double1 == 2917.2826791571506d);
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12509");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6483608274590842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12510");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2574329785816039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.086038958780957d + "'", double1 == 3.086038958780957d);
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12511");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3383347192042695E42d, 0.656559119563622d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12512");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.03567261035491365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03566504506131165d + "'", double1 == 0.03566504506131165d);
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12513");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.005202401830372638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000135325229238d + "'", double1 == 1.0000135325229238d);
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12514");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.208592005262939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35433639326871347d + "'", double1 == 0.35433639326871347d);
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12515");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.42901895608316976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12516");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.556893301378561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.054125203562066d + "'", double1 == 35.054125203562066d);
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12517");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8014654691351221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6956546983898864d + "'", double1 == 0.6956546983898864d);
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12518");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.605518178838189d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12519");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.14055323381143783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8521591578096069d) + "'", double1 == (-0.8521591578096069d));
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12520");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-5.123425674293008E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12521");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.027079934834453794d, 0.9957926485451821d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02718765029560583d + "'", double2 == 0.02718765029560583d);
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12522");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12523");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9496482207527558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5848002202885665d + "'", double1 == 2.5848002202885665d);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12524");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.3477990933099977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9788146805616652d) + "'", double1 == (-0.9788146805616652d));
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12525");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5022376695662525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008765700961474427d + "'", double1 == 0.008765700961474427d);
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12526");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6632349739413137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7985671646591178d + "'", double1 == 0.7985671646591178d);
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12527");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.017455065036229588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455065036229588d + "'", double1 == 0.017455065036229588d);
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12528");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.934714363860833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8410285774851783d + "'", double1 == 0.8410285774851783d);
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12529");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3537153031312192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2153800758611637d + "'", double1 == 0.2153800758611637d);
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12530");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9446922743316068E-62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9446922743316068E-62d + "'", double1 == 1.9446922743316068E-62d);
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12531");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(23.000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.79583152331272d + "'", double1 == 4.79583152331272d);
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12532");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12533");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.0106994690564552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3889656572932758d + "'", double1 == 1.3889656572932758d);
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12534");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.25320738314893254d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12535");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9092974268256817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12536");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5640109638251691d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12537");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5847565194252626E-6d, 35.44341522934085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5847565194252628E-6d + "'", double2 == 1.5847565194252628E-6d);
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12538");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6098494453571868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010643880762944155d) + "'", double1 == (-0.010643880762944155d));
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12539");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.013249519647527564d, 0.009529184477772738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9472938799988098d + "'", double2 == 0.9472938799988098d);
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12540");
        double double2 = org.apache.commons.math.util.FastMath.min(45.39364429304659d, 0.010973228372790073d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010973228372790073d + "'", double2 == 0.010973228372790073d);
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12541");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-2.0247503508374223d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8531233052037708d + "'", double1 == 3.8531233052037708d);
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12542");
        double double1 = org.apache.commons.math.util.FastMath.rint(49.81533496265541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.0d + "'", double1 == 50.0d);
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12543");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9091395677903495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9091395677903495d + "'", double1 == 1.9091395677903495d);
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12544");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.2558486026857986d, 0.7073875782300506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2558486026857987d + "'", double2 == 0.2558486026857987d);
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12545");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.013658700984922159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013659125683682674d + "'", double1 == 0.013659125683682674d);
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12546");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.45142257353539367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48648550476788915d + "'", double1 == 0.48648550476788915d);
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12547");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2670771121538542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12548");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3329722006465774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1005430378372274d + "'", double1 == 1.1005430378372274d);
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12549");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2785049464395442d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12550");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8658666377179234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5239162204662042d + "'", double1 == 0.5239162204662042d);
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12551");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12552");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.515845598485778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2572800648899063d + "'", double1 == 1.2572800648899063d);
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12553");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.8506266357067718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12554");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9994876574325707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8810112597088795d + "'", double1 == 0.8810112597088795d);
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12555");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.009206137707697834d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12556");
        int int2 = org.apache.commons.math.util.FastMath.min(7, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12557");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12558");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12559");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5710374582913385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.518851225438127d + "'", double1 == 0.518851225438127d);
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12560");
        double double2 = org.apache.commons.math.util.FastMath.min(0.01439333540156539d, (-4.37072378740163d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.37072378740163d) + "'", double2 == (-4.37072378740163d));
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12561");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1143659906583754d + "'", double1 == 1.1143659906583754d);
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12562");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9542174043274347d, 27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.722193449945337E7d + "'", double2 == 8.722193449945337E7d);
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12563");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6555929984114899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.703575168401104d + "'", double1 == 0.703575168401104d);
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12564");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.555361191653509d, (-5156.620156177409d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5553611916535088d + "'", double2 == 0.5553611916535088d);
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12565");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.720075976020836E-43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.965459555662261E-59d + "'", double1 == 7.965459555662261E-59d);
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12566");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8962302130072298d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12567");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.056103318098615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.018361883638737d + "'", double1 == 1.018361883638737d);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12568");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.379423030041176d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12569");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5126873628972832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12570");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6791757154399003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9941327005861891d + "'", double1 == 0.9941327005861891d);
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12571");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1312996469029764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1312996469029764d + "'", double1 == 1.1312996469029764d);
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12572");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12573");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.700942273550203E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.083537025078588E9d + "'", double1 == 6.083537025078588E9d);
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12574");
        double double1 = org.apache.commons.math.util.FastMath.tan((-92.538534636487d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.17668621580222d) + "'", double1 == (-7.17668621580222d));
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12575");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8867254579876315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05221082271284837d) + "'", double1 == (-0.05221082271284837d));
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12576");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9762775423515465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017039257527312873d + "'", double1 == 0.017039257527312873d);
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12577");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12578");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.421010862427522E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2037062152420224E-35d + "'", double1 == 1.2037062152420224E-35d);
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12579");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.743521917312986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17490331957134167d + "'", double1 == 0.17490331957134167d);
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12580");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8347789329832497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07842851960247783d) + "'", double1 == (-0.07842851960247783d));
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12581");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6559764355896974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5805651145852763d) + "'", double1 == (-0.5805651145852763d));
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12582");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3279443230305752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023177000720050703d + "'", double1 == 0.023177000720050703d);
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12583");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.12552491762180948d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1251975942169221d) + "'", double1 == (-0.1251975942169221d));
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12584");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-4.3342541642902094E-203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12585");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5953181448879166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12586");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.49484536082474d + "'", double1 == 48.49484536082474d);
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12587");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2897566425056355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9607675963132435d + "'", double1 == 0.9607675963132435d);
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12588");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.919734331907825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5086238400901237d + "'", double1 == 1.5086238400901237d);
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12589");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.528463678408588E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12590");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7080583105044882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.195365996214617d + "'", double1 == 1.195365996214617d);
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12591");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.015175783657808091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.555619960568395d + "'", double1 == 1.555619960568395d);
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12592");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5873521856970938d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5557969853359923d + "'", double1 == 0.5557969853359923d);
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12593");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3923239496630908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9841160343880434d + "'", double1 == 0.9841160343880434d);
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12594");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3621252723796606d, (double) 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3621252723796606d + "'", double2 == 1.3621252723796606d);
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12595");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.07969186436297289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07952380211219327d) + "'", double1 == (-0.07952380211219327d));
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12596");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-70.66879307167105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4549173661969045E30d + "'", double1 == 2.4549173661969045E30d);
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12597");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12598");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2958255551963092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12599");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.989925281440789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9899252814407891d + "'", double1 == 0.9899252814407891d);
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12600");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.34001264921737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023387632747214924d + "'", double1 == 0.023387632747214924d);
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12601");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.71483210598528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12602");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.203380153948951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07997500864015898d) + "'", double1 == (-0.07997500864015898d));
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12603");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 2.0096164144597455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12604");
        long long2 = org.apache.commons.math.util.FastMath.min(9L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12605");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.000000000000001d, 802.1409131831525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0062332380286697d + "'", double2 == 0.0062332380286697d);
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12606");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1610795826858162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0775340285512176d + "'", double1 == 1.0775340285512176d);
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12607");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.064947548056719E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12608");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.603281472741806d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5673477448074168d) + "'", double1 == (-0.5673477448074168d));
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12609");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-9.551474405271228E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09848198767158038d) + "'", double1 == (-0.09848198767158038d));
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12610");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.31868510059102656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3186851005910266d + "'", double1 == 0.3186851005910266d);
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12611");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.651648854985254E98d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.28516491353649E49d + "'", double1 == 1.28516491353649E49d);
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12612");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12613");
        double double2 = org.apache.commons.math.util.FastMath.max(98.21791772061627d, 3.13800468479027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 98.21791772061627d + "'", double2 == 98.21791772061627d);
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12614");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6631489452679062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6156014503745203d + "'", double1 == 0.6156014503745203d);
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12615");
        double double2 = org.apache.commons.math.util.FastMath.max(2.2782957478539796d, 0.44495067262734006d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2782957478539796d + "'", double2 == 2.2782957478539796d);
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12616");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.10238493598423042d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12617");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.015106579549212285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12618");
        long long2 = org.apache.commons.math.util.FastMath.max(9L, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12619");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9807747056866981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3175082442518185d + "'", double1 == 2.3175082442518185d);
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12620");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0027078409703792795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12621");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.395766663829712d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3957666638297117d) + "'", double1 == (-1.3957666638297117d));
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12622");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.549535562644912d, (-0.9479239466377265d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6602423805581273d + "'", double2 == 0.6602423805581273d);
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12623");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.35675804856959714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.597292263945882d + "'", double1 == 0.597292263945882d);
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12624");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.45231565944180985d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12625");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.0100191552952706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4481072200166452d + "'", double1 == 1.4481072200166452d);
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12626");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6645679736399707d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.787183297493432d + "'", double1 == 0.787183297493432d);
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12627");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9067110301197866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09793147927807441d) + "'", double1 == (-0.09793147927807441d));
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12628");
        int int2 = org.apache.commons.math.util.FastMath.max(34, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12629");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9700632468607546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12630");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.106283780211016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12631");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.04074367013117616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12632");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.806553782682839d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9382991345132176d) + "'", double1 == (-0.9382991345132176d));
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12633");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1752012685192503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67.33407276457362d + "'", double1 == 67.33407276457362d);
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12634");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6441609899881241d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.644160989988124d) + "'", double1 == (-0.644160989988124d));
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12635");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.07695912379014389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07414144368439184d + "'", double1 == 0.07414144368439184d);
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12636");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.000090803981927d, 0.8810112597088795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000799988983362d + "'", double2 == 1.0000799988983362d);
    }

    @Test
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12637");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.10247724045135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.671832396766527d + "'", double1 == 1.671832396766527d);
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12638");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6220107246567897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5876070829796919d + "'", double1 == 0.5876070829796919d);
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12639");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0258703634187639d, 0.5319282579302229d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0258703634187639d + "'", double2 == 0.0258703634187639d);
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12640");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.516710186322011d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21943259315399993d + "'", double1 == 0.21943259315399993d);
    }

    @Test
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12641");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8548021080203528d, 2.4835970359743094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.33147974968006416d + "'", double2 == 0.33147974968006416d);
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12642");
        long long1 = org.apache.commons.math.util.FastMath.round(26.149520456364744d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 26L + "'", long1 == 26L);
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12643");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 7, (long) (-90));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12644");
        double double1 = org.apache.commons.math.util.FastMath.cos(4051.542025492594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44242300083703084d + "'", double1 == 0.44242300083703084d);
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12645");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.517101195721465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05366933278685188d + "'", double1 == 0.05366933278685188d);
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12646");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.10679629920856396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1072041800688528d + "'", double1 == 0.1072041800688528d);
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12647");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0378042825874918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.711872896129837d + "'", double1 == 0.711872896129837d);
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12648");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8661879595026601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.647735507852476d + "'", double1 == 0.647735507852476d);
    }

    @Test
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12649");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12650");
        double double1 = org.apache.commons.math.util.FastMath.rint((-2.323611047439933E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12651");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0794415416798357d + "'", double1 == 2.0794415416798357d);
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12652");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6125374595843227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5795459078882854d + "'", double1 == 0.5795459078882854d);
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12653");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8321245309834454d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12654");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.566249314920251d, (-2.8317095147254143d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6363641961556987d + "'", double2 == 2.6363641961556987d);
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12655");
        double double2 = org.apache.commons.math.util.FastMath.min(34.57153447011112d, 0.011669273072701132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011669273072701132d + "'", double2 == 0.011669273072701132d);
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12656");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12657");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.8427842873511956E202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12658");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12659");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0171573625269879d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12660");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 802.0f, 1.134890207766664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 801.9999999999999d + "'", double2 == 801.9999999999999d);
    }

    @Test
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12661");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12662");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.916079783099613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7720340221751376d + "'", double1 == 0.7720340221751376d);
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12663");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.935051887835441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9350518878354411d + "'", double1 == 0.9350518878354411d);
    }

    @Test
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12664");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test12665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12665");
        int int2 = org.apache.commons.math.util.FastMath.min(36, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test12666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12666");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9955742875642781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09411674433760467d + "'", double1 == 0.09411674433760467d);
    }

    @Test
    public void test12667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12667");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12668");
        double double2 = org.apache.commons.math.util.FastMath.max(0.690795798579539d, (-0.7499179146178867d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.690795798579539d + "'", double2 == 0.690795798579539d);
    }

    @Test
    public void test12669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12669");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.103676392483125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6955119839475474d) + "'", double1 == (-1.6955119839475474d));
    }

    @Test
    public void test12670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12670");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.01220895588284645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12671");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4355889145431134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6599916018731703d + "'", double1 == 0.6599916018731703d);
    }

    @Test
    public void test12672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12672");
        long long1 = org.apache.commons.math.util.FastMath.round(9.081222803894845E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12673");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.718305156620878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1977516132203287d + "'", double1 == 1.1977516132203287d);
    }

    @Test
    public void test12674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12674");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12675");
        double double1 = org.apache.commons.math.util.FastMath.log1p(684.1197129515763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.529593586425833d + "'", double1 == 6.529593586425833d);
    }

    @Test
    public void test12676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12676");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707055269352768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055269352768d + "'", double1 == 1.5707055269352768d);
    }

    @Test
    public void test12677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12677");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.22456543400577147d), (-0.8196828682633746d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.22456543400577147d) + "'", double2 == (-0.22456543400577147d));
    }

    @Test
    public void test12678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12678");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3786118881275891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9291786198177681d + "'", double1 == 0.9291786198177681d);
    }

    @Test
    public void test12679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12679");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.012942573366925888d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test12680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12680");
        long long2 = org.apache.commons.math.util.FastMath.min(29L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test12681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12681");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test12682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12682");
        double double1 = org.apache.commons.math.util.FastMath.sin((-4.083880243381031d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8089051792915106d + "'", double1 == 0.8089051792915106d);
    }

    @Test
    public void test12683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12683");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1566818986982416E58d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9782688803097539d) + "'", double1 == (-0.9782688803097539d));
    }

    @Test
    public void test12684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12684");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8143989712440974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9024405638290521d + "'", double1 == 0.9024405638290521d);
    }

    @Test
    public void test12685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12685");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5571007519706128d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9149495139374373d) + "'", double1 == (-0.9149495139374373d));
    }

    @Test
    public void test12686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12686");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.6865874069985795d), 0.012822538313959962d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6865874069985795d) + "'", double2 == (-0.6865874069985795d));
    }

    @Test
    public void test12687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12687");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7820830806840948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12688");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.25856054082117574d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2585605408211757d + "'", double2 == 0.2585605408211757d);
    }

    @Test
    public void test12689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12689");
        double double1 = org.apache.commons.math.util.FastMath.abs(37.87285640966904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.87285640966904d + "'", double1 == 37.87285640966904d);
    }

    @Test
    public void test12690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12690");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6801783019998603d, 0.6270520618142631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.826016115849642d + "'", double2 == 0.826016115849642d);
    }

    @Test
    public void test12691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12691");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.951187273260123d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12692");
        double double2 = org.apache.commons.math.util.FastMath.max(132058.36709719698d, (double) 33L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 132058.36709719698d + "'", double2 == 132058.36709719698d);
    }

    @Test
    public void test12693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12693");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.517101195721465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1490480327790025d + "'", double1 == 1.1490480327790025d);
    }

    @Test
    public void test12694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12694");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6352559049474427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6883398284907394d) + "'", double1 == (-0.6883398284907394d));
    }

    @Test
    public void test12695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12695");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.42235061818001024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7502817419590815d) + "'", double1 == (-0.7502817419590815d));
    }

    @Test
    public void test12696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12696");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.999696121897531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998986970372332d + "'", double1 == 0.9998986970372332d);
    }

    @Test
    public void test12697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12697");
        double double1 = org.apache.commons.math.util.FastMath.expm1(96.11528190732773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.5250544058712794E41d + "'", double1 == 5.5250544058712794E41d);
    }

    @Test
    public void test12698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12698");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9707650795890375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7490403024490305d + "'", double1 == 0.7490403024490305d);
    }

    @Test
    public void test12699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12699");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.924127750058071d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7012825097242763d + "'", double1 == 1.7012825097242763d);
    }

    @Test
    public void test12700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12700");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(229.1831180523293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13131.225400046975d + "'", double1 == 13131.225400046975d);
    }

    @Test
    public void test12701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12701");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6809246903215531d, 53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2273524260041406E12d + "'", double2 == 1.2273524260041406E12d);
    }

    @Test
    public void test12702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12702");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.05358338937456895d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12703");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.14695139574279478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.419694769618873d) + "'", double1 == (-8.419694769618873d));
    }

    @Test
    public void test12704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12704");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.231057343412815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4248488639025094d + "'", double1 == 2.4248488639025094d);
    }

    @Test
    public void test12705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12705");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.515582944293113d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12706");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9986593903070539d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test12707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12707");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6185257010730183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0456460398252d + "'", double1 == 4.0456460398252d);
    }

    @Test
    public void test12708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12708");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.433780830483027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9906280524811681d) + "'", double1 == (-0.9906280524811681d));
    }

    @Test
    public void test12709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12709");
        double double2 = org.apache.commons.math.util.FastMath.max(1.535827984130872d, (-1.6963299593906205d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.535827984130872d + "'", double2 == 1.535827984130872d);
    }

    @Test
    public void test12710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12710");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.781639158231253d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12711");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0435414563457697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12712");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.382485449398286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.382485449398286d + "'", double1 == 2.382485449398286d);
    }

    @Test
    public void test12713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12713");
        double double2 = org.apache.commons.math.util.FastMath.max(0.020162834169477797d, (-1.1071487177940904d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020162834169477797d + "'", double2 == 0.020162834169477797d);
    }

    @Test
    public void test12714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12714");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 26L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 26.0f + "'", float1 == 26.0f);
    }

    @Test
    public void test12715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12715");
        double double1 = org.apache.commons.math.util.FastMath.sin(8.701845363548474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6615865768094854d + "'", double1 == 0.6615865768094854d);
    }

    @Test
    public void test12716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12716");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.379423030041176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test12717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12717");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test12718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12718");
        double double2 = org.apache.commons.math.util.FastMath.max(5507.000045396766d, (-1.2490457723982544d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5507.000045396766d + "'", double2 == 5507.000045396766d);
    }

    @Test
    public void test12719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12719");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5490756164177393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12720");
        int int1 = org.apache.commons.math.util.FastMath.abs(29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test12721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12721");
        int int1 = org.apache.commons.math.util.FastMath.abs(802);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 802 + "'", int1 == 802);
    }

    @Test
    public void test12722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12722");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (-36));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1556157735575975E15d + "'", double1 == 2.1556157735575975E15d);
    }

    @Test
    public void test12723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12723");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8028961524453899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9294366466914821d) + "'", double1 == (-0.9294366466914821d));
    }

    @Test
    public void test12724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12724");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1005430378372274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.0564712405796d + "'", double1 == 63.0564712405796d);
    }

    @Test
    public void test12725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12725");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test12726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12726");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1977516132203287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7874348437815644d + "'", double1 == 0.7874348437815644d);
    }

    @Test
    public void test12727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12727");
        double double1 = org.apache.commons.math.util.FastMath.log(2.9188537484079635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0711909872964367d + "'", double1 == 1.0711909872964367d);
    }

    @Test
    public void test12728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12728");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2572800648899063d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12729");
        double double1 = org.apache.commons.math.util.FastMath.atanh(72.52016602115306d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12730");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8211080655056974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9165365984015511d + "'", double1 == 0.9165365984015511d);
    }

    @Test
    public void test12731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12731");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.5435938534266416E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test12732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12732");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4025621091978446d, (-7.661153040102054d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1065.2110639410575d + "'", double2 == 1065.2110639410575d);
    }

    @Test
    public void test12733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12733");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test12734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12734");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4726612473342131E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4726612473342131E-15d + "'", double1 == 1.4726612473342131E-15d);
    }

    @Test
    public void test12735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12735");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2906564430950338E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.290656443095034E20d + "'", double1 == 1.290656443095034E20d);
    }

    @Test
    public void test12736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12736");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999999958776927d, 0.005202425297685839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999958776926d + "'", double2 == 0.9999999958776926d);
    }

    @Test
    public void test12737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12737");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.23587057680833456d, 0.6478485729236031d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39227225908142443d + "'", double2 == 0.39227225908142443d);
    }

    @Test
    public void test12738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12738");
        int int1 = org.apache.commons.math.util.FastMath.abs(26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test12739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12739");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999818319398772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999818319398773d + "'", double1 == 0.9999818319398773d);
    }

    @Test
    public void test12740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12740");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0001522971108041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.61367587412205E-5d + "'", double1 == 6.61367587412205E-5d);
    }

    @Test
    public void test12741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12741");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(6.466743204778643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 370.5170928287205d + "'", double1 == 370.5170928287205d);
    }

    @Test
    public void test12742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12742");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test12743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12743");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.374414814620351d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12744");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6085180763729596d, 1.1071487177940904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6085180763729596d + "'", double2 == 0.6085180763729596d);
    }

    @Test
    public void test12745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12745");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.054839968556690856d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12746");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0001225115021897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.00012251150219d + "'", double1 == 1.00012251150219d);
    }

    @Test
    public void test12747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12747");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-11.444076826648015d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12748");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.008388815144683304d, (-0.49581740676421115d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1246751054916166d + "'", double2 == 3.1246751054916166d);
    }

    @Test
    public void test12749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12749");
        int int2 = org.apache.commons.math.util.FastMath.min(36, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12750");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3076068662567917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12751");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.33711799610094684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3435398744126476d + "'", double1 == 0.3435398744126476d);
    }

    @Test
    public void test12752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12752");
        int int2 = org.apache.commons.math.util.FastMath.max((-33), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test12753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12753");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.014014098772510296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test12754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12754");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0865078793721343d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12755");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3329722006465776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12756");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.926772007304508d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12757");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9502336547086546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3990733753919096d + "'", double1 == 1.3990733753919096d);
    }

    @Test
    public void test12758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12758");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.3805150062465965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9323667197459284d) + "'", double1 == (-1.9323667197459284d));
    }

    @Test
    public void test12759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12759");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6157320800633225d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6553829721622355d) + "'", double1 == (-0.6553829721622355d));
    }

    @Test
    public void test12760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12760");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-5L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test12761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12761");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-33), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test12762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12762");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8832248240979842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8832248240979843d + "'", double1 == 0.8832248240979843d);
    }

    @Test
    public void test12763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12763");
        double double2 = org.apache.commons.math.util.FastMath.min(0.1870763470697897d, 9.383464577367716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1870763470697897d + "'", double2 == 0.1870763470697897d);
    }

    @Test
    public void test12764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12764");
        double double1 = org.apache.commons.math.util.FastMath.abs((-5.124738597288386E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.124738597288386E-4d + "'", double1 == 5.124738597288386E-4d);
    }

    @Test
    public void test12765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12765");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 7, (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test12766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12766");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.2003257647899614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.66289442046738d + "'", double1 == 90.66289442046738d);
    }

    @Test
    public void test12767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12767");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.003953119392307968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003953119392307967d) + "'", double1 == (-0.003953119392307967d));
    }

    @Test
    public void test12768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12768");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.6642279537135205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7065548033143576d + "'", double1 == 1.7065548033143576d);
    }

    @Test
    public void test12769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12769");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 90, (float) 2979L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2979.0f + "'", float2 == 2979.0f);
    }

    @Test
    public void test12770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12770");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.040657838989812276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04068025709401259d + "'", double1 == 0.04068025709401259d);
    }

    @Test
    public void test12771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12771");
        long long2 = org.apache.commons.math.util.FastMath.min(26L, (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test12772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12772");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 71L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 71L + "'", long2 == 71L);
    }

    @Test
    public void test12773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12773");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5408008620104859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.571388921250347d + "'", double1 == 0.571388921250347d);
    }

    @Test
    public void test12774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12774");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.08876808407117655d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12775");
        double double1 = org.apache.commons.math.util.FastMath.log((-3.045864920222764E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12776");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.398750140267755E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12777");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.21178170748056988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19209176208602402d + "'", double1 == 0.19209176208602402d);
    }

    @Test
    public void test12778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12778");
        double double1 = org.apache.commons.math.util.FastMath.cos((-9.551474405271228E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999995438467181d + "'", double1 == 0.9999995438467181d);
    }

    @Test
    public void test12779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12779");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test12780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12780");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.618381578861124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 207.31799313662566d + "'", double1 == 207.31799313662566d);
    }

    @Test
    public void test12781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12781");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.021055362526791663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021056918300925234d + "'", double1 == 0.021056918300925234d);
    }

    @Test
    public void test12782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12782");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7924685551644433d, 3.162447330056086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7924685551644435d + "'", double2 == 1.7924685551644435d);
    }

    @Test
    public void test12783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12783");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 26);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.414973347970818d + "'", double1 == 1.414973347970818d);
    }

    @Test
    public void test12784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12784");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test12785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12785");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.934717325643677d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9777476127030067d) + "'", double1 == (-0.9777476127030067d));
    }

    @Test
    public void test12786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12786");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.43450228702824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 229.17875464612467d + "'", double1 == 229.17875464612467d);
    }

    @Test
    public void test12787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12787");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0748524634035861d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12788");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9578816255865316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12789");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.4855215610041086d), 1.7074275585391845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7160109772248122d) + "'", double2 == (-0.7160109772248122d));
    }

    @Test
    public void test12790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12790");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.0565321053670247d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12791");
        int int2 = org.apache.commons.math.util.FastMath.min(37, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test12792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12792");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.832346142004121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9406642890077357d + "'", double1 == 0.9406642890077357d);
    }

    @Test
    public void test12793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12793");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.3945753355078114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.041793223791659194d) + "'", double1 == (-0.041793223791659194d));
    }

    @Test
    public void test12794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12794");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0000908081057318d, (-0.017451520489571555d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.588244491842346d + "'", double2 == 1.588244491842346d);
    }

    @Test
    public void test12795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12795");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.0281127352162502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12796");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.11657277845242872d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12797");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6377640601517165d, 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7438092248697559d + "'", double2 == 0.7438092248697559d);
    }

    @Test
    public void test12798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12798");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5520883433674829d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42425380171429383d) + "'", double1 == (-0.42425380171429383d));
    }

    @Test
    public void test12799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12799");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12800");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.1864864243075482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18435425535518035d) + "'", double1 == (-0.18435425535518035d));
    }

    @Test
    public void test12801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12801");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000705818430178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29982355479749d + "'", double1 == 57.29982355479749d);
    }

    @Test
    public void test12802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12802");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.22820026671210777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test12803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12803");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.371194766956427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test12804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12804");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9707617589677336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4615875286636182d + "'", double1 == 1.4615875286636182d);
    }

    @Test
    public void test12805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12805");
        double double2 = org.apache.commons.math.util.FastMath.max(513.663371073101d, 37.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 513.663371073101d + "'", double2 == 513.663371073101d);
    }

    @Test
    public void test12806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12806");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.7204111979381276d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12807");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0773900674657881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9370041565901503d + "'", double1 == 1.9370041565901503d);
    }

    @Test
    public void test12808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12808");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.3671733557939904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12809");
        long long1 = org.apache.commons.math.util.FastMath.round(2.3175082442518185d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test12810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12810");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12811");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9630272572571653d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12812");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.305963675522467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0820819434029756d + "'", double1 == 1.0820819434029756d);
    }

    @Test
    public void test12813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12813");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5401776706283436E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.74137414560076d + "'", double1 == 104.74137414560076d);
    }

    @Test
    public void test12814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12814");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8638723945101193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1706940827777688d + "'", double1 == 1.1706940827777688d);
    }

    @Test
    public void test12815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12815");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4081432892132331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4195695273027208d + "'", double1 == 0.4195695273027208d);
    }

    @Test
    public void test12816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12816");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.4922458983356286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.492245898335629d + "'", double1 == 2.492245898335629d);
    }

    @Test
    public void test12817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12817");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.01334339874628798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013255159673999492d + "'", double1 == 0.013255159673999492d);
    }

    @Test
    public void test12818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12818");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.8543580441498164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3617481573880745d + "'", double1 == 1.3617481573880745d);
    }

    @Test
    public void test12819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12819");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6719055141892424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12820");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7974901103222789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12821");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.159754170844509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.669006302001243d + "'", double1 == 7.669006302001243d);
    }

    @Test
    public void test12822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12822");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1995879848080617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020936760002264396d + "'", double1 == 0.020936760002264396d);
    }

    @Test
    public void test12823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12823");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8498295893693415d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1379415601434437d) + "'", double1 == (-1.1379415601434437d));
    }

    @Test
    public void test12824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12824");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.872928489116717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.393911141111503d + "'", double1 == 1.393911141111503d);
    }

    @Test
    public void test12825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12825");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707962991356774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7659219198509427E-8d + "'", double1 == 2.7659219198509427E-8d);
    }

    @Test
    public void test12826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12826");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.001099496788102162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03315866083095278d + "'", double1 == 0.03315866083095278d);
    }

    @Test
    public void test12827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12827");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5427042853305813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009471976643701408d + "'", double1 == 0.009471976643701408d);
    }

    @Test
    public void test12828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12828");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.308232836016487d + "'", double1 == 27.308232836016487d);
    }

    @Test
    public void test12829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12829");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.211020790109826E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12830");
        int int1 = org.apache.commons.math.util.FastMath.round(9.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test12831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12831");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test12832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12832");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.015411341807902585d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12833");
        double double1 = org.apache.commons.math.util.FastMath.sinh(40.878884477011276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.83428787614120032E17d + "'", double1 == 2.83428787614120032E17d);
    }

    @Test
    public void test12834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12834");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2724666125241785d) + "'", double1 == (-0.2724666125241785d));
    }

    @Test
    public void test12835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12835");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9999999695400409d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0459959574456004E-8d) + "'", double1 == (-3.0459959574456004E-8d));
    }
}

