package org.apache.commons.math.util;

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
        long long1 = org.apache.commons.math.util.FastMath.round(0.013659550437909718d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5064292449940325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8744821014221125d + "'", double1 == 0.8744821014221125d);
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.0767388768524415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3504975430691109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35771810361923345d + "'", double1 == 0.35771810361923345d);
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2944579595063852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.16697783683229d + "'", double1 == 74.16697783683229d);
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.04646023281402976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046476963551473224d + "'", double1 == 0.046476963551473224d);
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8186563384972326d, 9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999818319398772d + "'", double2 == 0.9999818319398772d);
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7511679260882128d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8498295893693415d) + "'", double1 == (-0.8498295893693415d));
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        double double1 = org.apache.commons.math.util.FastMath.log((-15.898288562430334d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.009213398835148425d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009256104707412106d) + "'", double1 == (-0.009256104707412106d));
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        long long2 = org.apache.commons.math.util.FastMath.min((-90L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.07365190683305112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5402900236323281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.267373051563951d) + "'", double1 == (-0.267373051563951d));
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5402900236323281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7165046169049563d + "'", double1 == 0.7165046169049563d);
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5369939140971179d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3956124250860895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.142563876395169d + "'", double1 == 2.142563876395169d);
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4682955026240896d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(120.42757201625032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 120.42757201625034d + "'", double1 == 120.42757201625034d);
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        long long2 = org.apache.commons.math.util.FastMath.min(29L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.49203441069488424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707055269358083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810040610126678d + "'", double1 == 4.810040610126678d);
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5675499795375124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.174802103936399d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.397984377405469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7355666122507827d + "'", double1 == 0.7355666122507827d);
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        int int2 = org.apache.commons.math.util.FastMath.max(90, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3971322791699246d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        long long2 = org.apache.commons.math.util.FastMath.min(34L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7131795469286212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7131795469286211d) + "'", double1 == (-0.7131795469286211d));
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6632349739413136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.6485250056879788d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-151.74930476078353d) + "'", double1 == (-151.74930476078353d));
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9446922743316068E-62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9446922743316068E-62d + "'", double1 == 1.9446922743316068E-62d);
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.44248081051227434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4753113860041604d + "'", double1 == 0.4753113860041604d);
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.48557554205341846d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 5507L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.65922711956644d + "'", double1 == 17.65922711956644d);
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9866275920404864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5275028665387291d + "'", double1 == 1.5275028665387291d);
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        double double2 = org.apache.commons.math.util.FastMath.min(0.017453273490633612d, 9.385765023619431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017453273490633612d + "'", double2 == 0.017453273490633612d);
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4060921415682228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9186715248441591d + "'", double1 == 0.9186715248441591d);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5378946274303922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3279443230305752d, 3.0812030006757882d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3279443230305754d + "'", double2 == 1.3279443230305754d);
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.32047738164862055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3321790415848608d + "'", double1 == 0.3321790415848608d);
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        double double2 = org.apache.commons.math.util.FastMath.pow((-63.81719973521831d), (-1.8019245746239465d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.991328918078117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4390113332958665d + "'", double1 == 1.4390113332958665d);
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.4922458983356286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6046662390891797d + "'", double1 == 0.6046662390891797d);
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 39481480091340L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        long long1 = org.apache.commons.math.util.FastMath.round((-2.1307589219114205E-4d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 5507);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.04599315997198159d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.47100149383084566d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.5258607844979077E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5258607844979077E-13d + "'", double1 == 2.5258607844979077E-13d);
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        double double1 = org.apache.commons.math.util.FastMath.sin(630998.4197775755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1103012106843946d) + "'", double1 == (-0.1103012106843946d));
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.01334339874628798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01334260688846816d + "'", double1 == 0.01334260688846816d);
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.054601895401186E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3050608935997049E-54d + "'", double1 == 1.3050608935997049E-54d);
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7651502649370375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6441005621312442d + "'", double1 == 0.6441005621312442d);
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.97562998182887d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        double double1 = org.apache.commons.math.util.FastMath.cosh(37.574240039999225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0405312203410338E16d + "'", double1 == 1.0405312203410338E16d);
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.6725047799604035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4160533322721292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15412616982041802d + "'", double1 == 0.15412616982041802d);
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        float float1 = org.apache.commons.math.util.FastMath.abs(34.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 34.0f + "'", float1 == 34.0f);
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-40.854048291402435d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9132181497465548d), 1.161510274442745d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 90);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8744821014221125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.19616193913956d + "'", double1 == 1.19616193913956d);
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.009528896033633612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009529184451583001d + "'", double1 == 0.009529184451583001d);
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.964343233227284d, 1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.161803603705748d + "'", double2 == 1.161803603705748d);
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 33, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0860389587809567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2574329785816039d + "'", double1 == 1.2574329785816039d);
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.015185626807227555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015186210510312992d + "'", double1 == 0.015186210510312992d);
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3359940102659614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33599401026596143d + "'", double1 == 0.33599401026596143d);
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.7524166644748121d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2966743308943072d + "'", double1 == 1.2966743308943072d);
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.01745152048957156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0173009914890253d + "'", double1 == 0.0173009914890253d);
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7330383821741316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        double double2 = org.apache.commons.math.util.FastMath.pow((-6.861248751607551d), 2.993222846126381d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.4993327597777462d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.453164869429617d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6583966420468889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8521097797239504d + "'", double1 == 0.8521097797239504d);
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        float float2 = org.apache.commons.math.util.FastMath.min(2.0f, (float) (-90));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        long long1 = org.apache.commons.math.util.FastMath.round(0.892256650791169d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4352296559186861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.200609592877556d + "'", double1 == 4.200609592877556d);
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0000932815071508d, (-1.1650012094878277d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000932815071508d + "'", double2 == 1.0000932815071508d);
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.999999969540041d, 0.7764153489348606d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999695400409d + "'", double2 == 0.9999999695400409d);
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        double double1 = org.apache.commons.math.util.FastMath.floor((-4.838791173074587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5874010519681996d + "'", double1 == 1.5874010519681996d);
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.010625904569068452d), 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01062590456906845d) + "'", double2 == (-0.01062590456906845d));
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (-90));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.991318745538845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.991318745538845d + "'", double1 == 1.991318745538845d);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 37.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.03746288709529651d), (-0.7791612621104443d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7791612621104443d) + "'", double2 == (-0.7791612621104443d));
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        long long1 = org.apache.commons.math.util.FastMath.round(2.1474836470000002E9d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.012176412619923603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23005929548649254d) + "'", double1 == (-0.23005929548649254d));
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0173009914890253d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5816724044616679d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5015733900925633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.876827152556707d + "'", double1 == 0.876827152556707d);
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5245506190419055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5681661967396565d), (-0.535785414660496d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.535785414660496d) + "'", double2 == (-0.535785414660496d));
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.015840105828908848d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        int int2 = org.apache.commons.math.util.FastMath.max((-33), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5430891022283284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8744821014221125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9351374772845501d + "'", double1 == 0.9351374772845501d);
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2326303196791324d + "'", double1 == 2.2326303196791324d);
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0986966500665631d, 0.8726646259971648d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0856069384097307d + "'", double2 == 1.0856069384097307d);
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5258806213658973d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        double double1 = org.apache.commons.math.util.FastMath.tan(17.65922711956644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5002817064634435d) + "'", double1 == (-2.5002817064634435d));
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 29L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7200786095266942d + "'", double1 == 1.7200786095266942d);
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1812861553062852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7799146823298116d + "'", double1 == 0.7799146823298116d);
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3035285795044003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7606667817497151d + "'", double1 == 0.7606667817497151d);
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.07998601188716E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00952889605982097d + "'", double1 == 0.00952889605982097d);
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9210231484373848d, 1.5847565194219465E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9210231484373848d + "'", double2 == 0.9210231484373848d);
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.1286157825604266d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1286157825604264d) + "'", double2 == (-1.1286157825604264d));
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        double double1 = org.apache.commons.math.util.FastMath.exp((-4.1223072818099046E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5847565194252626E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.765921910641631E-8d + "'", double1 == 2.765921910641631E-8d);
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5405025668761214d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9122047800512979d) + "'", double1 == (-0.9122047800512979d));
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.06695333002016242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0022422116185679d + "'", double1 == 1.0022422116185679d);
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.0950379321938843d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8889456229033981d) + "'", double1 == (-0.8889456229033981d));
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.4636005855219394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1852055673132202d + "'", double1 == 1.1852055673132202d);
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.7364352239483065d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3619730303123129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34730114401171874d + "'", double1 == 0.34730114401171874d);
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999492312032946d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(20.319301422815503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.728786708005704d + "'", double1 == 2.728786708005704d);
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2616419081022748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.3295225782386857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 133.4718120135108d + "'", double1 == 133.4718120135108d);
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.012208955882846451d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9878652710342222d + "'", double1 == 0.9878652710342222d);
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        double double1 = org.apache.commons.math.util.FastMath.acos(103.70899308565303d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.25488428787741324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25220217941752987d + "'", double1 == 0.25220217941752987d);
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.6485250056879788d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.41551468337368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29253266978629083d) + "'", double1 == (-0.29253266978629083d));
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5144957554275267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6645679736399707d) + "'", double1 == (-0.6645679736399707d));
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-90L), (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.161510274442745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.194754590654806d + "'", double1 == 2.194754590654806d);
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5408008620104859d, (-0.13145613893303287d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0841612380005317d + "'", double2 == 1.0841612380005317d);
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.1482743665672453d, (-0.14695139574279478d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14827436656724527d + "'", double2 == 0.14827436656724527d);
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.040657838989812276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3295225782386857d + "'", double1 == 2.3295225782386857d);
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8813736213307353d, 1.202774714925223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.202774714925223d + "'", double2 == 1.202774714925223d);
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.358221623915482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0857505427825869d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8723033256749283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3924150230910621d + "'", double1 == 1.3924150230910621d);
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.549535562644912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0010578718449796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.03799291018846901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.34693731331800054d, 41.356159248556786d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008388815144683304d + "'", double2 == 0.008388815144683304d);
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7764153489348606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2530676585178546d) + "'", double1 == (-0.2530676585178546d));
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9999818319398772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017452975427475453d + "'", double1 == 0.017452975427475453d);
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5309649148733978d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.491754101407853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        int int2 = org.apache.commons.math.util.FastMath.min(108, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8143989712440974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.8325451219316489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0448835264883827d + "'", double1 == 3.0448835264883827d);
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8337177321043896d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.017455065036229588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455951415885344d + "'", double1 == 0.017455951415885344d);
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.07998602436399E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3552527156068805E-20d + "'", double1 == 1.3552527156068805E-20d);
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.602036160225165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995120760870788d + "'", double1 == 0.9995120760870788d);
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4991939135618992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6849166814234299d, 5.016660462605011E67d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.68491668142343d + "'", double2 == 0.68491668142343d);
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02556940209677608d + "'", double1 == 0.02556940209677608d);
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8054616704388724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.12585691605953508d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        double double1 = org.apache.commons.math.util.FastMath.log(0.03561460890735782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.334999362733612d) + "'", double1 == (-3.334999362733612d));
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8250752499738025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.678501689001337d + "'", double1 == 0.678501689001337d);
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.0898120925088963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2785049464395442d + "'", double1 == 1.2785049464395442d);
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        int int2 = org.apache.commons.math.util.FastMath.min(90, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.14447684095481458d, 1.0120948455406893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1444768409548146d + "'", double2 == 0.1444768409548146d);
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5401776706283436E45d + "'", double1 == 1.5401776706283436E45d);
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8674595620891006d), (-2.4626264090759076d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.2205020972807485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.04117178010122d + "'", double1 == 34.04117178010122d);
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.04494641518824685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04494641518824685d + "'", double1 == 0.04494641518824685d);
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        double double1 = org.apache.commons.math.util.FastMath.exp(31.98437118343895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.773845626111856E13d + "'", double1 == 7.773845626111856E13d);
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.887344092558564d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015487076013268255d) + "'", double1 == (-0.015487076013268255d));
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 108L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.68213122712422d + "'", double1 == 4.68213122712422d);
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.3888768966542657d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 2.142563876395169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6035270795055017d), 1.5262856567377758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6035270795055016d) + "'", double2 == (-0.6035270795055016d));
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.22913468643648427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22524639448688796d + "'", double1 == 0.22524639448688796d);
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5518737433602259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2581602679840703d) + "'", double1 == (-0.2581602679840703d));
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3495439910201015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.813497102495516d + "'", double1 == 0.813497102495516d);
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.012283070548383727d, (-0.6900053411253284d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.012283070548383726d + "'", double2 == 0.012283070548383726d);
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.0448835264883827d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9855829002548678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017201666660802303d) + "'", double1 == (-0.017201666660802303d));
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        long long1 = org.apache.commons.math.util.FastMath.round(1.203568507135691d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 33);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.017270314988225264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017268598258962157d + "'", double1 == 0.017268598258962157d);
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        double double2 = org.apache.commons.math.util.FastMath.max(756.1702669404289d, (-0.7788906677207307d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 756.1702669404289d + "'", double2 == 756.1702669404289d);
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5707972395684235d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8272753678010331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2870787948203515d + "'", double1 == 2.2870787948203515d);
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        double double2 = org.apache.commons.math.util.FastMath.max(2.327581142581999d, 0.10425570595294073d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.327581142581999d + "'", double2 == 2.327581142581999d);
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7591415563789915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8341866769635806d + "'", double1 == 0.8341866769635806d);
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7415548299632772d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        double double1 = org.apache.commons.math.util.FastMath.floor((-3980.715929598703d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3981.0d) + "'", double1 == (-3981.0d));
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.5647210386116825E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999986258976d + "'", double1 == 0.9999999986258976d);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0812030006757882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.256972793019976d + "'", double1 == 1.256972793019976d);
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6931471784987917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.71440790938188d + "'", double1 == 39.71440790938188d);
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1653657392500323E-156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8867254579876315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.04323229440977d), 0.9913289158005998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9913289158005998d + "'", double2 == 0.9913289158005998d);
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0087397904378297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1887324502422139d + "'", double1 == 1.1887324502422139d);
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6632349739413136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.178332580483657d) + "'", double1 == (-0.178332580483657d));
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015626271752052213d + "'", double1 == 0.015626271752052213d);
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.931763225510739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030694434124892367d) + "'", double1 == (-0.030694434124892367d));
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        float float2 = org.apache.commons.math.util.FastMath.min(108.0f, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        long long1 = org.apache.commons.math.util.FastMath.round(6012.84549645786d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6013L + "'", long1 == 6013L);
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.534938999763997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.876349504902738d) + "'", double1 == (-27.876349504902738d));
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8510875494985548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9576211840427852d + "'", double1 == 0.9576211840427852d);
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.1286157825604266d), 1.5561319766247041d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1286157825604264d) + "'", double2 == (-1.1286157825604264d));
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        double double1 = org.apache.commons.math.util.FastMath.sinh(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8860312344816034E45d + "'", double1 == 1.8860312344816034E45d);
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8832248240979842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4160672238202208d + "'", double1 == 1.4160672238202208d);
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.22524639448688796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.905667754637493d + "'", double1 == 12.905667754637493d);
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1591352365493741d) + "'", double1 == (-1.1591352365493741d));
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        double double1 = org.apache.commons.math.util.FastMath.cos(14.048205817766327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08884382888152068d + "'", double1 == 0.08884382888152068d);
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.019234627307895876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7159162242099002d) + "'", double1 == (-1.7159162242099002d));
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2523536496331222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9891437136247581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5304129973211018d + "'", double1 == 1.5304129973211018d);
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.061208797058628805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06316218558456732d) + "'", double1 == (-0.06316218558456732d));
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6794497296418427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3080187522246026E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.883386029766116d) + "'", double1 == (-10.883386029766116d));
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.007857650033781347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007826939472082893d + "'", double1 == 0.007826939472082893d);
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1812861553062852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(10.244215505684302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.244215505684304d + "'", double1 == 10.244215505684304d);
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7764076780850522d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.0100191552952706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.46346031073593d + "'", double1 == 6.46346031073593d);
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.6485250056879788d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3835707091143927d) + "'", double1 == (-1.3835707091143927d));
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6056015466954472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.005402970483400532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.005417592851302d + "'", double1 == 1.005417592851302d);
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.21178170748056988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4601974657476613d + "'", double1 == 0.4601974657476613d);
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        double double2 = org.apache.commons.math.util.FastMath.min(0.777872804388193d, 0.6692896481323396d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6692896481323396d + "'", double2 == 0.6692896481323396d);
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        int int1 = org.apache.commons.math.util.FastMath.round(35.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.203568507135691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9333262250554716d + "'", double1 == 0.9333262250554716d);
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.788010753606722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7880107536067221d + "'", double1 == 0.7880107536067221d);
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7688894800973336d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7688894800973336d + "'", double2 == 0.7688894800973336d);
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1312996469029764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019744903665106207d + "'", double1 == 0.019744903665106207d);
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        int int1 = org.apache.commons.math.util.FastMath.round(97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8238673184078138d, 0.3504975430691108d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9343469704278008d + "'", double2 == 0.9343469704278008d);
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(46.41094351658203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8100237733214719d + "'", double1 == 0.8100237733214719d);
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        double double2 = org.apache.commons.math.util.FastMath.pow(Double.NEGATIVE_INFINITY, 0.022764409478678704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.1898842314256335d), (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.189884231425633d) + "'", double2 == (-4.189884231425633d));
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        long long2 = org.apache.commons.math.util.FastMath.max(802L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 802L + "'", long2 == 802L);
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.27632259394013d + "'", double1 == 2.27632259394013d);
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        double double1 = org.apache.commons.math.util.FastMath.log(0.015772404403454655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1494934227010845d) + "'", double1 == (-4.1494934227010845d));
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0000145960805296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000145960805298d + "'", double1 == 1.0000145960805298d);
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.012209562553744127d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01220925920246869d) + "'", double1 == (-0.01220925920246869d));
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        double double2 = org.apache.commons.math.util.FastMath.pow(22025.46579480672d, 0.22913468643648427d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.888143977395053d + "'", double2 == 9.888143977395053d);
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.026582642806498483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.486784401E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9977803024935082E21d + "'", double1 == 1.9977803024935082E21d);
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.5150224550074456d, 0.6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4017298724149831d + "'", double2 == 1.4017298724149831d);
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.03510313708234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10689388179055553d) + "'", double1 == (-0.10689388179055553d));
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.0924287889629486d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4616178806179598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16483384729345077d + "'", double1 == 0.16483384729345077d);
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1016289084929765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1016289084929767d + "'", double1 == 1.1016289084929767d);
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        int int2 = org.apache.commons.math.util.FastMath.min(37, 5507);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.000115286123023d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.132601058453798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5014110987836071d + "'", double1 == 1.5014110987836071d);
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7673695592041386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9645775706969033d + "'", double1 == 0.9645775706969033d);
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        double double1 = org.apache.commons.math.util.FastMath.asin(31.98437118343892d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5661709721771937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.78827859540215d + "'", double1 == 3.78827859540215d);
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.991328918078117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9913289180781171d + "'", double1 == 0.9913289180781171d);
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.01288734008259007d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.2806068627910445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2806068627910445d + "'", double1 == 4.2806068627910445d);
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.444667861009766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.719982772427445d + "'", double1 == 5.719982772427445d);
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8561916828402603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9253062643472486d + "'", double1 == 0.9253062643472486d);
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1416876847493498d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9164145587216197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1092317842737094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019359746803347688d + "'", double1 == 0.019359746803347688d);
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8100237733214719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6808231837525209d + "'", double1 == 0.6808231837525209d);
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.015106579549212285d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.505149978319906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9978460521589513d + "'", double1 == 0.9978460521589513d);
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9687363354669343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9894682501194513d + "'", double1 == 0.9894682501194513d);
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        long long1 = org.apache.commons.math.util.FastMath.abs(5L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9999424482172059d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017452288051843148d) + "'", double1 == (-0.017452288051843148d));
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        double double1 = org.apache.commons.math.util.FastMath.asin(89.40934278535333d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.005656852264782563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.873069731935379E-5d + "'", double1 == 9.873069731935379E-5d);
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.49304209749558525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4566275681581605d + "'", double1 == 0.4566275681581605d);
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 33, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.2581602679840703d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25530221925334323d) + "'", double1 == (-0.25530221925334323d));
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3321790415848608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6925600075443105d + "'", double1 == 0.6925600075443105d);
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), 37.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 11014L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11014.0f + "'", float2 == 11014.0f);
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-43.19155203462029d), (-0.9479239466377265d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-43.19155203462028d) + "'", double2 == (-43.19155203462028d));
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        double double1 = org.apache.commons.math.util.FastMath.cos((-31.17011361997944d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9699398265477828d + "'", double1 == 0.9699398265477828d);
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0530637390494226d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9179704868072519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5759718841737027d) + "'", double1 == (-1.5759718841737027d));
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6535124586897125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6535124586897125d + "'", double1 == 0.6535124586897125d);
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2966288756752378d, 9.080398292528045E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000235882221555d + "'", double2 == 1.0000235882221555d);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.013659550437909718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8645635938864005d) + "'", double1 == (-1.8645635938864005d));
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.2990612758127336d, (-2.4626264090759076d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12871704946880697d + "'", double2 == 0.12871704946880697d);
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 34, (float) (-90));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        double double1 = org.apache.commons.math.util.FastMath.asinh(49.59008907222208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.597039821763426d + "'", double1 == 4.597039821763426d);
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3012989023072947d, (-2.620982778800085d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3012989023072943d + "'", double2 == 2.3012989023072943d);
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        float float2 = org.apache.commons.math.util.FastMath.min(36.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6711223318921905d, (-0.4865282353496856d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4865282353496856d) + "'", double2 == (-0.4865282353496856d));
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.4160533322721292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8887726987165272d) + "'", double1 == (-0.8887726987165272d));
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8402937512824985d), 3.0539731556403096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2685035399991868d) + "'", double2 == (-0.2685035399991868d));
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0038848218538872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017521095452147056d + "'", double1 == 0.017521095452147056d);
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.009213529184899944d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009213268488716318d) + "'", double1 == (-0.009213268488716318d));
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        double double1 = org.apache.commons.math.util.FastMath.sinh(89.99998294450721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.101912399578768E38d + "'", double1 == 6.101912399578768E38d);
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1752012685192503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9576211840427852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016713642648393184d + "'", double1 == 0.016713642648393184d);
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.23018603204480417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22620487274210174d + "'", double1 == 0.22620487274210174d);
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.22456543400577147d), (-0.4588214153419555d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0341909072993256d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.16372976561258465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5248526696656155d, 0.5667290388147143d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5248526696656153d + "'", double2 == 1.5248526696656153d);
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8571332032039712d, 0.23018603204480417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9651363175498938d + "'", double2 == 0.9651363175498938d);
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.309027772999469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7025722210756764d + "'", double1 == 2.7025722210756764d);
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7950499969146667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.333055186303952d + "'", double1 == 1.333055186303952d);
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 7.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6339157938496336d + "'", double1 == 2.6339157938496336d);
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        long long2 = org.apache.commons.math.util.FastMath.min(37L, (long) 108);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.810040610126678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9978031084482193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6920481310503407d + "'", double1 == 0.6920481310503407d);
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.017019484439497464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.970460404611724E-4d + "'", double1 == 2.970460404611724E-4d);
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) 34L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 90, (float) 37);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.5669483416477585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.026012785332021d + "'", double1 == 13.026012785332021d);
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7621213855082706d, 0.7709242776556768d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8110535914763489d + "'", double2 == 0.8110535914763489d);
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        double double1 = org.apache.commons.math.util.FastMath.cosh(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9945570439269725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7035265325145357d + "'", double1 == 1.7035265325145357d);
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(50.237955471941575d, 0.6441005621312442d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.23795547194157d + "'", double2 == 50.23795547194157d);
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0691594887363018d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        double double1 = org.apache.commons.math.util.FastMath.floor(11.940141468803501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.000000000000254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        int int2 = org.apache.commons.math.util.FastMath.max(5507, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6167155214568573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.335196539687686d + "'", double1 == 35.335196539687686d);
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 2.14748365E9f, 0.29167236570643446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483648E9d + "'", double2 == 2.147483648E9d);
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 36L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.07365190683305112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4970776681567306d + "'", double1 == 1.4970776681567306d);
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        long long2 = org.apache.commons.math.util.FastMath.max(108L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1589375003169515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8588839872951164d + "'", double1 == 0.8588839872951164d);
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 39481480091340L, 0.3868973415880647d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948868d + "'", double2 == 1.5707963267948868d);
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.04323229440977d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7330383821741316d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (-34L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.78827859540215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9463500701061331d + "'", double1 == 1.9463500701061331d);
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5261303806882357d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.864756827404103d + "'", double1 == 0.864756827404103d);
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9027759974305378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2589123923257013d + "'", double1 == 1.2589123923257013d);
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.040657838989812276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04065783898981228d + "'", double1 == 0.04065783898981228d);
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-34.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999983d) + "'", double1 == (-0.9999999999999983d));
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.010176922302104895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010177097973226868d) + "'", double1 == (-0.010177097973226868d));
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2763452613426045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.5574077246490634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-74.6859333661903d) + "'", double1 == (-74.6859333661903d));
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6631489452679061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        double double2 = org.apache.commons.math.util.FastMath.pow((-8.729869874255455d), 7.8962960182681E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3242386343317494d, 0.8250752499738025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3242386343317492d + "'", double2 == 1.3242386343317492d);
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9647007265430613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9821917972285562d + "'", double1 == 0.9821917972285562d);
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.002774496623513146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0027783491013417426d + "'", double1 == 0.0027783491013417426d);
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9111302618846769d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09247351917780995d + "'", double1 == 0.09247351917780995d);
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.015840768307772042d, (-3.596644259751356d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1371883631628275d + "'", double2 == 3.1371883631628275d);
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4185258506619445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1016359.4424036132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.823310651799671E7d + "'", double1 == 5.823310651799671E7d);
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.6485250056879788d), (-33.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-33.0d) + "'", double2 == (-33.0d));
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.49591180291773657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9343469704278008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3643741626151842d + "'", double1 == 0.3643741626151842d);
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        long long1 = org.apache.commons.math.util.FastMath.abs(36L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.001697419855619805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016974198556198052d + "'", double1 == 0.0016974198556198052d);
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 7L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.8882849769695147d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1854652182422676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1854652182422678d + "'", double1 == 1.1854652182422678d);
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.930941044890651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1474836470000002E9d + "'", double1 == 2.1474836470000002E9d);
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.011881162631163577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000705818430178d + "'", double1 == 1.0000705818430178d);
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0593061654437441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9226938882251315d + "'", double1 == 0.9226938882251315d);
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        int int2 = org.apache.commons.math.util.FastMath.min((-33), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.003987724140430841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003987724140430841d + "'", double1 == 0.003987724140430841d);
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        long long1 = org.apache.commons.math.util.FastMath.round((-2.4917798526449118d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.6355590717614192d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5936569354152138d), 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5936569354152137d) + "'", double2 == (-0.5936569354152137d));
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6555929984114899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9262844623833826d + "'", double1 == 0.9262844623833826d);
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        double double2 = org.apache.commons.math.util.FastMath.max(7.930067261567155E14d, 0.022764409478678704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.930067261567155E14d + "'", double2 == 7.930067261567155E14d);
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4022470863037217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3380760115319606d + "'", double1 == 0.3380760115319606d);
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7645662682374061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7645662682374064d + "'", double1 == 1.7645662682374064d);
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 11014L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11014.0f + "'", float1 == 11014.0f);
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        double double2 = org.apache.commons.math.util.FastMath.min(0.04747861379422898d, 66029.68355238467d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04747861379422898d + "'", double2 == 0.04747861379422898d);
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.002774503742748542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.896296018267967E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 37, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7373226231318831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.908191901770421d + "'", double1 == 0.908191901770421d);
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 5507.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.11528190732773d + "'", double1 == 96.11528190732773d);
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.005202425297685838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005202448765189583d + "'", double1 == 0.005202448765189583d);
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        double double2 = org.apache.commons.math.util.FastMath.max(6.145735497073049d, 65.86430060990239d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 65.86430060990239d + "'", double2 == 65.86430060990239d);
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.3502411805356305E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.861454711325157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7587908688670184d + "'", double1 == 0.7587908688670184d);
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        double double2 = org.apache.commons.math.util.FastMath.max(0.013658700984922159d, (double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483648E9d + "'", double2 == 2.147483648E9d);
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.2806068627910445d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1998.6364724075593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2814145124371763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0670681823548809d + "'", double1 == 1.0670681823548809d);
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6632349739413137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011575634009654718d + "'", double1 == 0.011575634009654718d);
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.5103225366272008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.851794930779705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0392324049825148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.039232404982515d + "'", double1 == 1.039232404982515d);
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.018050036426560695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.743521917312986d) + "'", double1 == (-1.743521917312986d));
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.9155023779490905E22d, 0.37242622246109275d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.91550237794909E22d + "'", double2 == 1.91550237794909E22d);
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.344058570908068E43d + "'", double1 == 1.344058570908068E43d);
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1610795826858162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8213913986126079d + "'", double1 == 0.8213913986126079d);
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7850009775214999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9224795186524118d) + "'", double1 == (-0.9224795186524118d));
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7811629682982569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7100951657737545d + "'", double1 == 0.7100951657737545d);
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3796077390275217d, 0.988092346097116d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.988092346097116d + "'", double2 == 0.988092346097116d);
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.584967478670571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5440211108893694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.590466459908002E-72d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7499179146178867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-42.96713148885693d) + "'", double1 == (-42.96713148885693d));
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8744821014221125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9687363354669343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8590931640045188d + "'", double1 == 0.8590931640045188d);
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9185957173539763d, 0.011983210854855571d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9185957173539762d + "'", double2 == 0.9185957173539762d);
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.4615926968669573E-293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4615926968669573E-293d + "'", double1 == 2.4615926968669573E-293d);
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0281149846033601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.01062590456906845d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.09728846154807012d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9072942488780497d + "'", double1 == 0.9072942488780497d);
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-4.145168389493613d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.145168389493612d) + "'", double1 == (-4.145168389493612d));
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        double double1 = org.apache.commons.math.util.FastMath.atan(6.102016471588857E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        double double1 = org.apache.commons.math.util.FastMath.cos(2979.3805346802797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.407849248701269d + "'", double1 == 0.407849248701269d);
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5705451157070798d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.9856066649012d) + "'", double1 == (-89.9856066649012d));
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.3756233543023781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39434669070330697d) + "'", double1 == (-0.39434669070330697d));
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5807306907661335d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5486349859745466d) + "'", double1 == (-0.5486349859745466d));
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2352049125074824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.77202832050486d + "'", double1 == 70.77202832050486d);
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5884022289215687d), (-0.1503666979359498d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1503666979359498d) + "'", double2 == (-0.1503666979359498d));
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.1556157735575975E15d), 3.4900403122965926d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.1556157735575972E15d) + "'", double2 == (-2.1556157735575972E15d));
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.145735497073049d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.05363477521367332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05512671172433356d) + "'", double1 == (-0.05512671172433356d));
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.00952889605982097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009529184483010844d + "'", double1 == 0.009529184483010844d);
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        double double2 = org.apache.commons.math.util.FastMath.min((-4.644483341943245d), 0.9917694073609294d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.644483341943245d) + "'", double2 == (-4.644483341943245d));
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        double double1 = org.apache.commons.math.util.FastMath.tanh(15.712381921440457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999549d + "'", double1 == 0.9999999999999549d);
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.03089684788654239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030891934230224072d + "'", double1 == 0.030891934230224072d);
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        int int2 = org.apache.commons.math.util.FastMath.min(37, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8340177271426653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6719055141892424d + "'", double1 == 0.6719055141892424d);
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8282265872414869d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        float float2 = org.apache.commons.math.util.FastMath.min(3.9481478E13f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.14353826050381374d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        int int1 = org.apache.commons.math.util.FastMath.abs(36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1305148602552713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1225815373309356d + "'", double1 == 2.1225815373309356d);
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.1326010584537984d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.021278590635779134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.67205714044531d) + "'", double1 == (-1.67205714044531d));
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.2089948465116955d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.4799059562027663d, (-55.79430724113828d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.097174594785819d + "'", double2 == 3.097174594785819d);
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8477647080717694d), (-0.9855829002548678d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        double double1 = org.apache.commons.math.util.FastMath.abs(216.1980975168285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 216.1980975168285d + "'", double1 == 216.1980975168285d);
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        long long1 = org.apache.commons.math.util.FastMath.round(0.011982924064042687d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6157320800633225d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1956282198912025d + "'", double1 == 1.1956282198912025d);
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.44248081051227434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42918313798454755d + "'", double1 == 0.42918313798454755d);
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.13381059201667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        int int2 = org.apache.commons.math.util.FastMath.max(37, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 5507.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9776285026563134d) + "'", double1 == (-0.9776285026563134d));
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6532070891002518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42586106506619514d) + "'", double1 == (-0.42586106506619514d));
    }
}

