package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

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
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.0100191552952706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.322723236313804d + "'", double1 == 1.322723236313804d);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9402423370939733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8077010042069216d + "'", double1 == 0.8077010042069216d);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.17280275811959592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15939640388656712d + "'", double1 == 0.15939640388656712d);
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.37029424927264715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006462853851008311d + "'", double1 == 0.006462853851008311d);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        double double1 = org.apache.commons.math.util.FastMath.log(0.25220217941752987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3775242138648267d) + "'", double1 == (-1.3775242138648267d));
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.037480427855015416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03748042785501541d) + "'", double1 == (-0.03748042785501541d));
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.42901895608316976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41597886664488126d + "'", double1 == 0.41597886664488126d);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.4615926968669573E-293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4615926968669573E-293d + "'", double1 == 2.4615926968669573E-293d);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        double double1 = org.apache.commons.math.util.FastMath.tanh(66029.68355238467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-34), (long) (-33));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0000705818430178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7184736965714626d + "'", double1 == 2.7184736965714626d);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0388896294536023d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0341909072993256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8128294748966436d + "'", double1 == 1.8128294748966436d);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5394005199551674d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4925340484482445d) + "'", double1 == (-0.4925340484482445d));
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8186563384972326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7611857431657096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        double double2 = org.apache.commons.math.util.FastMath.max(6.934714363860833d, 1.0530637390494224d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.934714363860833d + "'", double2 == 6.934714363860833d);
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6104048481741295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.49591180291773657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        double double1 = org.apache.commons.math.util.FastMath.log(0.020742758124513632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.87555809926975d) + "'", double1 == (-3.87555809926975d));
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0994172039830736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3346752909289326d + "'", double1 == 1.3346752909289326d);
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.012031030300912635d), 1.1564822793522844d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.012031030300912635d) + "'", double2 == (-0.012031030300912635d));
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.060912694476906684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8708690291361337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9549580234781563d + "'", double1 == 0.9549580234781563d);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        float float2 = org.apache.commons.math.util.FastMath.max((-90.0f), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        double double1 = org.apache.commons.math.util.FastMath.log1p(134.38863804832192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.908149442986166d + "'", double1 == 4.908149442986166d);
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.04566767881511902d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04565182008910089d) + "'", double1 == (-0.04565182008910089d));
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9222344721288218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 34);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 34.0f + "'", float1 == 34.0f);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8414709825806045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.610564699287985d + "'", double1 == 0.610564699287985d);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9595080520584216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9253980793387521d + "'", double1 == 0.9253980793387521d);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2015795859741962E8d + "'", double1 == 1.2015795859741962E8d);
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5411673391151195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995610936547574d + "'", double1 == 0.9995610936547574d);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.1748021039363996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8723206001833959d + "'", double1 == 1.8723206001833959d);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3956124250860895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8625222728658756d + "'", double1 == 0.8625222728658756d);
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        long long1 = org.apache.commons.math.util.FastMath.round(0.23669574761529572d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        int int2 = org.apache.commons.math.util.FastMath.min(33, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5169281719127183d, 0.9864221511889272d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5169281719127181d + "'", double2 == 1.5169281719127181d);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6711223318921905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39880384582236217d) + "'", double1 == (-0.39880384582236217d));
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.0269835496406734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2172719045432345d) + "'", double1 == (-1.2172719045432345d));
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4682955026240896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9335094488791899d + "'", double1 == 0.9335094488791899d);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-44.48488313582535d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.488422915776307d) + "'", double1 == (-4.488422915776307d));
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.05535410922055579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.055410715024554476d + "'", double1 == 0.055410715024554476d);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0d, (-5.220801521793461d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026815267922151716d + "'", double2 == 0.026815267922151716d);
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        double double2 = org.apache.commons.math.util.FastMath.min(0.08964012059520682d, 5.227971924677803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08964012059520682d + "'", double2 == 0.08964012059520682d);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        double double1 = org.apache.commons.math.util.FastMath.tan(114.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2670771121538542d + "'", double1 == 1.2670771121538542d);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.438670546795531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.332095741344152d + "'", double1 == 2.332095741344152d);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1016289084929767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383671073348347d + "'", double1 == 1.3383671073348347d);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5262856567377758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1918568476239906d + "'", double1 == 2.1918568476239906d);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.013659550437909718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.013753268325561d + "'", double1 == 1.013753268325561d);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5799604581126996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009164003049060376d) + "'", double1 == (-0.009164003049060376d));
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.147355184182097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.274426534781263d + "'", double1 == 22.274426534781263d);
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-48.21095429942027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.5688409855135115d) + "'", double1 == (-4.5688409855135115d));
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.5669483416477585d, 0.9185957173539762d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.566948341647758d + "'", double2 == 2.566948341647758d);
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.21517385352860152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.211942326299679d) + "'", double1 == (-0.211942326299679d));
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7316602644632266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3915506903563917d + "'", double1 == 2.3915506903563917d);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.913891279076611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        int int2 = org.apache.commons.math.util.FastMath.max((-33), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6865874069985796d), 1.814615669229906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3617177069840666d) + "'", double2 == (-0.3617177069840666d));
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5403023058681776d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3132565042068824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7966660362236415d + "'", double1 == 3.7966660362236415d);
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.8402937512824985d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.364828051779159E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8774717541114375E-39d + "'", double1 == 5.8774717541114375E-39d);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5759176398083917d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.1083832032431884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 178.09723865519027d + "'", double1 == 178.09723865519027d);
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.87520816275122d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        long long2 = org.apache.commons.math.util.FastMath.min(17L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1294589369076663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13018952509948228d + "'", double1 == 0.13018952509948228d);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        double double1 = org.apache.commons.math.util.FastMath.ceil(26.28604042479942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.0d + "'", double1 == 27.0d);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1970429949276125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02089234154942062d + "'", double1 == 0.02089234154942062d);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3279443230305752d, 40.07963789922157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03312052667429505d + "'", double2 == 0.03312052667429505d);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-3981.0d), 1.3120268186024098d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3980.9999999999995d) + "'", double2 == (-3980.9999999999995d));
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.08309759227292604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0014503265856423578d + "'", double1 == 0.0014503265856423578d);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.5377459288874316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.6516488549852542E98d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.651648854985254E98d + "'", double2 == 1.651648854985254E98d);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.10642219731928483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0056681886892573d + "'", double1 == 1.0056681886892573d);
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5507, (long) 90);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-57.28996163075955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.799130475617059E24d) + "'", double1 == (-3.799130475617059E24d));
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6415129230457017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011196512701240505d + "'", double1 == 0.011196512701240505d);
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.18341664066254693d), 0.171295457330502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.171295457330502d + "'", double2 == 0.171295457330502d);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-87.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-87.99999999999997d) + "'", double1 == (-87.99999999999997d));
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 63.979448672399826d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 63.979448672399826d + "'", double2 == 63.979448672399826d);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.514508134546872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3329906850709383d + "'", double1 == 0.3329906850709383d);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        long long1 = org.apache.commons.math.util.FastMath.round(0.580846352739766d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9951899344229606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7052381103261496d + "'", double1 == 1.7052381103261496d);
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-43.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7219067166708868d), 0.9421475168289407d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9421475168289407d + "'", double2 == 0.9421475168289407d);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.011405944106938912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011405449524645117d + "'", double1 == 0.011405449524645117d);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.163944626011821d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6269114619385456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7243949122886101d + "'", double1 == 0.7243949122886101d);
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, 11014.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11014.0f + "'", float2 == 11014.0f);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0012070607874443988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-2.7919355759617512d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.186932956778016d + "'", double1 == 8.186932956778016d);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        long long2 = org.apache.commons.math.util.FastMath.max(34L, 108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        long long2 = org.apache.commons.math.util.FastMath.min((-34L), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.005302282169720471d), 0.737447891018455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.737447891018455d + "'", double2 == 0.737447891018455d);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3.0321124266229886d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.763714440997984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9814489430038136d + "'", double1 == 0.9814489430038136d);
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 7);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.008983023749580713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008983144563826076d + "'", double1 == 0.008983144563826076d);
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.38186809209174843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        double double1 = org.apache.commons.math.util.FastMath.acos(120.01818825115909d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.788010753606722d, 0.647848572923603d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7880107536067219d + "'", double2 == 0.7880107536067219d);
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.007092776508144172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0070928359782441545d + "'", double1 == 0.0070928359782441545d);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        long long2 = org.apache.commons.math.util.FastMath.min(6013L, 802L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 802L + "'", long2 == 802L);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-36.00591422616983d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.610267336878759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3768003955505836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9622038393439216d + "'", double1 == 2.9622038393439216d);
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8640730666191481d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-5.227971924677802d), 0.9982900983985066d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.227971924677801d) + "'", double2 == (-5.227971924677801d));
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9595080520584216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.7578112213568773d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6517148788876671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.612661579623673d + "'", double1 == 0.612661579623673d);
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.189884231425633d), 1.0038848218538854d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.189884231425632d) + "'", double2 == (-4.189884231425632d));
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.2003257647899614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7160305500615832d + "'", double1 == 0.7160305500615832d);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        int int1 = org.apache.commons.math.util.FastMath.round(6.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-36.00591422616983d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.168402346850077E15d + "'", double1 == 2.168402346850077E15d);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0969832464593828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09728846154807012d + "'", double1 == 0.09728846154807012d);
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        float float2 = org.apache.commons.math.util.FastMath.max(6013.0f, (float) 11014L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11014.0f + "'", float2 == 11014.0f);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, (float) 108L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(68.78828177486824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.78828177486825d + "'", double1 == 68.78828177486825d);
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3632703054402189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.438024512560203d + "'", double1 == 1.438024512560203d);
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.009213529184899942d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8588839872951164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.777991668407376d + "'", double1 == 0.777991668407376d);
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7567144400243719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        long long1 = org.apache.commons.math.util.FastMath.round(0.17366404762497195d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(91.78724175669423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5259.021565805535d + "'", double1 == 5259.021565805535d);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5545058162986882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.0666225024537d + "'", double1 == 89.0666225024537d);
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.4084587136495436E-15d, (-0.013277527411913046d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5509877790657458d + "'", double2 == 1.5509877790657458d);
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        double double1 = org.apache.commons.math.util.FastMath.floor((-27.876349504902738d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-28.0d) + "'", double1 == (-28.0d));
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.11083319553050024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10511036034904613d + "'", double1 == 0.10511036034904613d);
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999755913632423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0600665629065072E-5d) + "'", double1 == (-1.0600665629065072E-5d));
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7735460199712506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 3.9481478E13f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.948147847987199E13d + "'", double2 == 3.948147847987199E13d);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.1036763924831257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.159127134626181d + "'", double1 == 4.159127134626181d);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.56340880499775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9159709810535507d + "'", double1 == 0.9159709810535507d);
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 90L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        double double1 = org.apache.commons.math.util.FastMath.exp(8.881784197001248E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000009d + "'", double1 == 1.0000000000000009d);
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        long long2 = org.apache.commons.math.util.FastMath.max(9L, (long) 9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.3153820931708018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.728901349234421d) + "'", double1 == (-1.728901349234421d));
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.267373051563951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.270665795204788d) + "'", double1 == (-0.270665795204788d));
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3973434260602215d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.079985961979837E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        double double1 = org.apache.commons.math.util.FastMath.tan((-89.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6858253705060158d) + "'", double1 == (-1.6858253705060158d));
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        double double1 = org.apache.commons.math.util.FastMath.acos((-32.57791748631743d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.2205020972807485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.06765229399451d + "'", double1 == 68.06765229399451d);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.455197646070681E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 17L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 17.0f + "'", float1 == 17.0f);
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.202456058843363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 183.4872162478239d + "'", double1 == 183.4872162478239d);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        double double1 = org.apache.commons.math.util.FastMath.exp((-11.57304203147357d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.416547617835799E-6d + "'", double1 == 9.416547617835799E-6d);
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7277869932110255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8150895179424266d + "'", double1 == 0.8150895179424266d);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.006432304228643252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006432259873866778d + "'", double1 == 0.006432259873866778d);
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0113263887595518d, 0.617667823836307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0069808766511805d + "'", double2 == 1.0069808766511805d);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 6013);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.394826258513964d + "'", double1 == 9.394826258513964d);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4251878220010183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14509452200947284d + "'", double1 == 0.14509452200947284d);
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.001697419855619805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016974214858430446d + "'", double1 == 0.0016974214858430446d);
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.1286157825604264d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1286157825604264d + "'", double1 == 1.1286157825604264d);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.003782225820577472d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000071526246055d + "'", double1 == 1.0000071526246055d);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.9155023779490905E22d, 1.5844798497868198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.91550237794909E22d + "'", double2 == 1.91550237794909E22d);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4770977984143493d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.10933892659284458d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10890630988450155d) + "'", double1 == (-0.10890630988450155d));
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.015175783657808091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.34001264921737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3400126492173703d + "'", double1 == 1.3400126492173703d);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6706596876784242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5854136570121198d + "'", double1 == 0.5854136570121198d);
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7470124028605071d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.374414814620351d) + "'", double1 == (-1.374414814620351d));
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        double double1 = org.apache.commons.math.util.FastMath.ulp(27.63631172366781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.315356337104293E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.7007210565838747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-4.730328580304744E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.67205714044531d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.812139786972189d) + "'", double1 == (-0.812139786972189d));
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9262844623833826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.07219032311228d + "'", double1 == 53.07219032311228d);
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.11083319553050024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11106024738537068d + "'", double1 == 0.11106024738537068d);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268E13d + "'", double1 == 7.896296018268E13d);
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (-34L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1411200080598672d + "'", double1 == 0.1411200080598672d);
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-34));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34) + "'", int1 == (-34));
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7976186295363398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3353238271999663d + "'", double1 == 1.3353238271999663d);
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8739456127896417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3963472835230404d + "'", double1 == 1.3963472835230404d);
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.009213398835148425d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009213398835148424d) + "'", double1 == (-0.009213398835148424d));
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        float float2 = org.apache.commons.math.util.FastMath.max(37.0f, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        double double1 = org.apache.commons.math.util.FastMath.acosh(37.574240039999225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.319288767835345d + "'", double1 == 4.319288767835345d);
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5440211108893694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26438424705757585d) + "'", double1 == (-0.26438424705757585d));
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0003524996777038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5400056540554331d + "'", double1 == 0.5400056540554331d);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5382334032499028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5151448119299741d) + "'", double1 == (-0.5151448119299741d));
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2286577832986674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8078463628702286d + "'", double1 == 2.8078463628702286d);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.005215981409945167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        double double1 = org.apache.commons.math.util.FastMath.exp(651.832966873273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2230962529739251E283d + "'", double1 == 1.2230962529739251E283d);
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.07008782270102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8192426501901323d + "'", double1 == 0.8192426501901323d);
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-5.227971924677802d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.995426424076346d) + "'", double1 == (-31.995426424076346d));
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.344058570908068E43d, (-88.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709080678E43d + "'", double2 == 1.3440585709080678E43d);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2717104239752093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5669483416477576d + "'", double1 == 2.5669483416477576d);
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.949874371066198d + "'", double1 == 9.949874371066198d);
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        double double1 = org.apache.commons.math.util.FastMath.log((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.624376645697622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8547036332233621d + "'", double1 == 0.8547036332233621d);
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.08738234671223125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08760577896190805d + "'", double1 == 0.08760577896190805d);
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.005656852264782563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0056728824661278d + "'", double1 == 1.0056728824661278d);
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9995120760870788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.716955837270592d + "'", double1 == 1.716955837270592d);
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-57.28996163075955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8550159309967826d) + "'", double1 == (-3.8550159309967826d));
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 17L, 11014.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17.0f + "'", float2 == 17.0f);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 71L, (float) 34L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        double double1 = org.apache.commons.math.util.FastMath.acos((-4.37072378740163d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        double double1 = org.apache.commons.math.util.FastMath.rint((-46.772927173523236d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-47.0d) + "'", double1 == (-47.0d));
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        double double2 = org.apache.commons.math.util.FastMath.max(0.009446037147747973d, 1.3537153031312192d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3537153031312192d + "'", double2 == 1.3537153031312192d);
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.5258607844979077E-13d, 3.097174594785819d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.617506090304174E-40d + "'", double2 == 9.617506090304174E-40d);
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1129870129429051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0434356123678956d + "'", double1 == 3.0434356123678956d);
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.571865319731872d, 5.249772867773091d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.571865319731871d + "'", double2 == 7.571865319731871d);
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8272753678010331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014438678988775109d + "'", double1 == 0.014438678988775109d);
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.48469430157573956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1197820100926987d + "'", double1 == 1.1197820100926987d);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7160305500615832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5054831794681595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.644730211142693d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7637216000753616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.146248855718132d + "'", double1 == 1.146248855718132d);
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36L), 90.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6580161192200634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.930957742021381d + "'", double1 == 1.930957742021381d);
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4162279412718506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7427127147632668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5554429306716537d + "'", double1 == 0.5554429306716537d);
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        long long2 = org.apache.commons.math.util.FastMath.min((-34L), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        double double2 = org.apache.commons.math.util.FastMath.min(0.39542905600596706d, 0.5913365965931429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39542905600596706d + "'", double2 == 0.39542905600596706d);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8958467800237574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9640019498676998d + "'", double1 == 0.9640019498676998d);
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8402937512824985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5684162734665585d) + "'", double1 == (-0.5684162734665585d));
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        double double1 = org.apache.commons.math.util.FastMath.log((-323.00518534745174d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) 6013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.83569384937053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.901535397444189d + "'", double1 == 0.901535397444189d);
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.8663182439645776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.01022852700990079d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5860514283028828d) + "'", double1 == (-0.5860514283028828d));
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6013, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6013L + "'", long2 == 6013L);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        double double1 = org.apache.commons.math.util.FastMath.acos(88.40572816078691d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7025722210756764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2164006950377038d + "'", double1 == 1.2164006950377038d);
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        int int1 = org.apache.commons.math.util.FastMath.abs((-34));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 9);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-90L), (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5812207450977618d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(44.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5568933044900626d + "'", double1 == 3.5568933044900626d);
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        int int2 = org.apache.commons.math.util.FastMath.min(90, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-27.999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.23128532145735E11d) + "'", double1 == (-7.23128532145735E11d));
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.7195940277157655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.670861345830204d + "'", double1 == 6.670861345830204d);
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 17L, 33.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17.0f + "'", float2 == 17.0f);
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.1067486750760071d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10634503779918675d) + "'", double1 == (-0.10634503779918675d));
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.009446037147747973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009401702312512087d + "'", double1 == 0.009401702312512087d);
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0475227542270302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8661879595026601d + "'", double1 == 0.8661879595026601d);
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.008491519610769877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999639472639853d + "'", double1 == 0.9999639472639853d);
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        float float2 = org.apache.commons.math.util.FastMath.max(11014.0f, (float) 5507);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.21020213304517052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2071857818314006d + "'", double1 == 0.2071857818314006d);
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.080810485818935E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3512721633416307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        double double1 = org.apache.commons.math.util.FastMath.floor((-23.607181098414166d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-24.0d) + "'", double1 == (-24.0d));
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        double double1 = org.apache.commons.math.util.FastMath.atan(108.29903111138354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5615628962569676d + "'", double1 == 1.5615628962569676d);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.02263623983076541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022638173012735963d + "'", double1 == 0.022638173012735963d);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.431145960437433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.461303446511725d) + "'", double1 == (-0.461303446511725d));
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-31.191623125197538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7592186044415977E13d + "'", double1 == 1.7592186044415977E13d);
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6058868587310341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        float float2 = org.apache.commons.math.util.FastMath.min(802.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0172993018445189d, (-1.67205714044531d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0172993018445189d + "'", double2 == 1.0172993018445189d);
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9115149784120505d, 1.5821318123417665E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5821318123417665E-10d + "'", double2 == 1.5821318123417665E-10d);
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        double double1 = org.apache.commons.math.util.FastMath.asinh(49.81533496265541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.601570775718839d + "'", double1 == 4.601570775718839d);
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5746813724695927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1830110809448033d + "'", double1 == 2.1830110809448033d);
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.038858140883553674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33870947017391045d + "'", double1 == 0.33870947017391045d);
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5079431519740254d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5659403777711782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9377720080115177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6615388636231894d + "'", double1 == 0.6615388636231894d);
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.03957298969131389d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7051527115392973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34934088751440634d) + "'", double1 == (-0.34934088751440634d));
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.2674359895586114d, 2.1034653645558015d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.595715597462504d + "'", double2 == 5.595715597462504d);
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-5.124738597288386E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08002467258422295d) + "'", double1 == (-0.08002467258422295d));
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.2199734862326173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.19511139207273d + "'", double1 == 127.19511139207273d);
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        double double1 = org.apache.commons.math.util.FastMath.log(0.39604951489229284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9262160379374064d) + "'", double1 == (-0.9262160379374064d));
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1559734442091005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8197233074908405d + "'", double1 == 0.8197233074908405d);
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 71, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 71.0f + "'", float2 == 71.0f);
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.41597886664488126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38092873267289645d) + "'", double1 == (-0.38092873267289645d));
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.23641824551800447d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.12585691605953508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6969878952715414d + "'", double1 == 1.6969878952715414d);
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5802053839637672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4710002483851392d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        long long2 = org.apache.commons.math.util.FastMath.max(2979L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2979L + "'", long2 == 2979L);
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.042994173860011545d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04298092930306831d) + "'", double1 == (-0.04298092930306831d));
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.025888510549649656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2115357465331211d, 1.1129870129429051d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.211535746533121d + "'", double2 == 1.211535746533121d);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.82989504995974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3880462512735203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1310143745245964d + "'", double1 == 1.1310143745245964d);
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.665951357920044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6245498461540362d + "'", double1 == 0.6245498461540362d);
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        double double2 = org.apache.commons.math.util.FastMath.min(1.076864027916964d, 0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9389941379013969d + "'", double2 == 0.9389941379013969d);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        long long1 = org.apache.commons.math.util.FastMath.round(0.06267212238698011d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.154092655271697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 470.63961629465757d + "'", double1 == 470.63961629465757d);
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.02710278633615723d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02709946932405838d) + "'", double1 == (-0.02709946932405838d));
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.085665678873483E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0012070604943308525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.569589266007452d + "'", double1 == 1.569589266007452d);
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        double double2 = org.apache.commons.math.util.FastMath.pow((-34.65735902799726d), 0.9864221511889272d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (-90L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.99999999999999d) + "'", double1 == (-89.99999999999999d));
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.042994183650930454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7431447610156813d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.687137475366684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7945189815304485d + "'", double1 == 2.7945189815304485d);
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        double double1 = org.apache.commons.math.util.FastMath.signum((-3.045864920222764E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.27292969817782287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27643703851906587d + "'", double1 == 0.27643703851906587d);
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.026815267922151716d, 0.05657478853562705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02681526792215172d + "'", double2 == 0.02681526792215172d);
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7820830806840948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.050712171503077d + "'", double1 == 1.050712171503077d);
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4112593504149052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.563425064065868d + "'", double1 == 23.563425064065868d);
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.003782225820577472d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0457528827495823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7801496774608879d + "'", double1 == 0.7801496774608879d);
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9179848280242625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9179848280242626d + "'", double1 == 0.9179848280242626d);
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        double double2 = org.apache.commons.math.util.FastMath.min(1.025588702964313d, 1.039232404982515d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.025588702964313d + "'", double2 == 1.025588702964313d);
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        long long1 = org.apache.commons.math.util.FastMath.abs(9L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1016289084929767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09678991036556055d + "'", double1 == 0.09678991036556055d);
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6659513579200441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5103963463916682d + "'", double1 == 0.5103963463916682d);
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5705654518541774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999999686043177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023322866951d + "'", double1 == 0.5403023322866951d);
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        double double2 = org.apache.commons.math.util.FastMath.max(0.830640877860784d, 1.5860134523134295E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5860134523134295E15d + "'", double2 == 1.5860134523134295E15d);
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.267884728309447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309448d + "'", double1 == 5.267884728309448d);
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8911152217347937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5574077246549018d), 33.763355288875786d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.763355288875786d + "'", double2 == 33.763355288875786d);
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.761141324937585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 116.87924700245763d + "'", double1 == 116.87924700245763d);
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6624791557154159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8813736213307353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7071067983421432d + "'", double1 == 0.7071067983421432d);
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        double double1 = org.apache.commons.math.util.FastMath.atanh(56.79896298465412d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.208394781784533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.940141468803507d + "'", double1 == 11.940141468803507d);
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9906804649613175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00936323361755153d) + "'", double1 == (-0.00936323361755153d));
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.6791757154399003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.20968155556679d + "'", double1 == 96.20968155556679d);
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.6372894457236022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6212147412252023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4831757085170098d + "'", double1 == 0.4831757085170098d);
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0915250460768902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0915250460768904d + "'", double1 == 1.0915250460768904d);
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4882129761941369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6294018368232195d + "'", double1 == 1.6294018368232195d);
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.0487097934144756E-29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.811660887276533E-31d + "'", double1 == 8.811660887276533E-31d);
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.011983210854855573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011983784473547669d + "'", double1 == 0.011983784473547669d);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.085665678873264E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.085665678873044E-7d + "'", double1 == 5.085665678873044E-7d);
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.644706895122267E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.56166260838806d + "'", double1 == 39.56166260838806d);
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.5981526294336509d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        double double1 = org.apache.commons.math.util.FastMath.asin(36.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999998d + "'", double1 == 0.9999999999999998d);
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.827444420534037E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9310815951878996d), 1.003535606004149d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.747964316271328d) + "'", double2 == (-0.747964316271328d));
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.085665678873702E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707958182283288d + "'", double1 == 1.5707958182283288d);
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8064012322901599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014074356595602903d + "'", double1 == 0.014074356595602903d);
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.025293885879535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4390109352611684d) + "'", double1 == (-0.4390109352611684d));
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        double double1 = org.apache.commons.math.util.FastMath.atanh(802.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9044387629088754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9044387629088754d + "'", double1 == 0.9044387629088754d);
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.418520666024257d + "'", double1 == 9.418520666024257d);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.13145613893303287d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13145613893303285d) + "'", double1 == (-0.13145613893303285d));
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        long long1 = org.apache.commons.math.util.FastMath.round(1.597902432336771d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        long long1 = org.apache.commons.math.util.FastMath.round(0.017453273490633612d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9990282485857992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.722238707046217E-4d) + "'", double1 == (-9.722238707046217E-4d));
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8947805892373116d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.427548195562127E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.887344092558564d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4202093096492123d + "'", double1 == 1.4202093096492123d);
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0673671241532148d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        double double2 = org.apache.commons.math.util.FastMath.min(0.024653336246160933d, 1.0912561694388279d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.024653336246160933d + "'", double2 == 0.024653336246160933d);
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9L, (float) 17);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0986966500665631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9494699173294713d + "'", double1 == 0.9494699173294713d);
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.747964316271328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8196828682633746d) + "'", double1 == (-0.8196828682633746d));
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.932852210325525E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0625345798933474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018544726835433654d + "'", double1 == 0.018544726835433654d);
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, 37.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.1694228248157563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.053554942223732d) + "'", double1 == (-1.053554942223732d));
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5988920145399181d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.598892014539918d) + "'", double2 == (-0.598892014539918d));
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        double double2 = org.apache.commons.math.util.FastMath.max(0.463380064402346d, 0.029949908321658926d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.463380064402346d + "'", double2 == 0.463380064402346d);
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        double double2 = org.apache.commons.math.util.FastMath.max(7.930067261567154E14d, 1.5445234815150057d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.930067261567154E14d + "'", double2 == 7.930067261567154E14d);
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.698647747478174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.463460310735931d + "'", double1 == 7.463460310735931d);
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.212913171890624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03862262091024262d + "'", double1 == 0.03862262091024262d);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9186715248441591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8226811007326992d + "'", double1 == 0.8226811007326992d);
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5844798497868198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.876754074008976d + "'", double1 == 4.876754074008976d);
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9921731399155099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9960788823760445d + "'", double1 == 0.9960788823760445d);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.0432322944097696d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.015106579549212285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015105430502911008d + "'", double1 == 0.015105430502911008d);
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(72.52016602115306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.170162032344489d + "'", double1 == 4.170162032344489d);
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.8585575386941564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.414477459402565d + "'", double1 == 5.414477459402565d);
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5878687580950963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8321245309834454d + "'", double1 == 0.8321245309834454d);
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 108, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.0487097934144756E-29d, 1.1343999713834352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.944904187008216E-33d + "'", double2 == 7.944904187008216E-33d);
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        double double2 = org.apache.commons.math.util.FastMath.min(1063.0d, 0.9050824179664846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9050824179664846d + "'", double2 == 0.9050824179664846d);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1664162281198318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15393599517258413d + "'", double1 == 0.15393599517258413d);
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8857088863088404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5961815394648626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5961815394648625d) + "'", double1 == (-0.5961815394648625d));
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2979.3805346802806d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6415129230457017d, 0.0709446474695995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6415129230457017d + "'", double2 == 0.6415129230457017d);
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.919734331907825d, 0.9113950174654148d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9265782268450597d + "'", double2 == 0.9265782268450597d);
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0037954134170803035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.567000904265499d + "'", double1 == 1.567000904265499d);
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.1748021039363996d, 0.6615388636231894d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3653641816424398d + "'", double2 == 1.3653641816424398d);
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.085665678873702E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000005085666972d + "'", double1 == 1.0000005085666972d);
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        double double2 = org.apache.commons.math.util.FastMath.atan2(62.30735433930074d, 0.2529602258630766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5667364716021246d + "'", double2 == 1.5667364716021246d);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.48379177581104366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5254398822837768d + "'", double1 == 0.5254398822837768d);
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(34.026480513893276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.833222138226288d + "'", double1 == 5.833222138226288d);
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        int int2 = org.apache.commons.math.util.FastMath.min(6, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0272356433040997d + "'", double1 == 0.0272356433040997d);
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7749339485040656d, 1.0119420950219882d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7749339485040656d + "'", double2 == 0.7749339485040656d);
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4658506161222316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4658506161222318d + "'", double1 == 1.4658506161222318d);
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.30557148829374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9536751827800823d + "'", double1 == 0.9536751827800823d);
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7573591247314425d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7266528366502882d + "'", double1 == 0.7266528366502882d);
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        double double1 = org.apache.commons.math.util.FastMath.cos(73.68391074271467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14302445468641484d) + "'", double1 == (-0.14302445468641484d));
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.482067568390531E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        long long1 = org.apache.commons.math.util.FastMath.round(4.658886145103398E-15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 6013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.549535562644912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.157178926294705d + "'", double1 == 1.157178926294705d);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7616002858669332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000145960805298d + "'", double1 == 1.0000145960805298d);
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.341405852131295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        double double2 = org.apache.commons.math.util.FastMath.max(1.155506665128233d, 2.951187273260123d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.951187273260123d + "'", double2 == 2.951187273260123d);
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.06356883351481228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        double double2 = org.apache.commons.math.util.FastMath.pow((-34.882786993956714d), 0.69482111198402d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6720656417424269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9582782469362314d + "'", double1 == 1.9582782469362314d);
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2.926772007304508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7950318064728787d) + "'", double1 == (-1.7950318064728787d));
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.2020197576001874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5304959589171132d + "'", double1 == 1.5304959589171132d);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 29, (long) (-33));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5802053839637672d, 0.9260406133217521d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5802053839637673d + "'", double2 == 0.5802053839637673d);
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.017268598258962157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9894177983454929d + "'", double1 == 0.9894177983454929d);
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6555929984114899d, 0.013344586776258159d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013344586776258159d + "'", double2 == 0.013344586776258159d);
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5472097319134629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9917694073609294d + "'", double1 == 0.9917694073609294d);
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9945570439269725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4664133695575747d + "'", double1 == 1.4664133695575747d);
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 34, (float) 33L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-4.189884231425632d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2990612758127336d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.09673491867096075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.0996823760496963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4580499354808867d + "'", double1 == 1.4580499354808867d);
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5055823053323238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9185211647413277d + "'", double1 == 0.9185211647413277d);
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.789199398154453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7891993981544534d + "'", double1 == 2.7891993981544534d);
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2230962529739251E283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8245714037420401d + "'", double1 == 0.8245714037420401d);
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        double double1 = org.apache.commons.math.util.FastMath.log1p(257.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.552959584921617d + "'", double1 == 5.552959584921617d);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.540345878732046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43200698778675256d + "'", double1 == 0.43200698778675256d);
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8799022061561323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.025172003637337723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996832018446994d + "'", double1 == 0.9996832018446994d);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9955742875642762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1683834495058822d) + "'", double1 == (-1.1683834495058822d));
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.079985949503008E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985924549346E-5d + "'", double1 == 9.079985924549346E-5d);
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, 5507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        double double1 = org.apache.commons.math.util.FastMath.cosh(174.89508969139933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.517959872387207E75d + "'", double1 == 4.517959872387207E75d);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        int int2 = org.apache.commons.math.util.FastMath.max(7, 5507);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) (-90));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        double double1 = org.apache.commons.math.util.FastMath.expm1(6.145735497073049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 465.7227961062573d + "'", double1 == 465.7227961062573d);
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-34), (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.04566767881511902d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        double double1 = org.apache.commons.math.util.FastMath.log(0.19573166520889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6310106128204023d) + "'", double1 == (-1.6310106128204023d));
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.228462604887648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8543580441498164d + "'", double1 == 1.8543580441498164d);
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2), (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4925340484482445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.433803554543751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        double double1 = org.apache.commons.math.util.FastMath.log10((-5.420324011058295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.025888510549649656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025891403233415416d + "'", double1 == 0.025891403233415416d);
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5516730959931526d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.4414869715493879d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2317761278577954d + "'", double1 == 2.2317761278577954d);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7007210565838747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8882087680867928d) + "'", double1 == (-0.8882087680867928d));
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9683274362856896d, 0.38863652572621304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9683274362856896d + "'", double2 == 0.9683274362856896d);
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4254875655208386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9597471685039307d + "'", double1 == 1.9597471685039307d);
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.0924287889629486d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08828586723825156d) + "'", double1 == (-0.08828586723825156d));
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3768003955505836d, 1.367918055200995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7886343092906454d + "'", double2 == 0.7886343092906454d);
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.12873439758804212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5304129973211018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4255376318686255d + "'", double1 == 0.4255376318686255d);
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.4505495340698077d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4853895633718563d) + "'", double1 == (-0.4853895633718563d));
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        long long1 = org.apache.commons.math.util.FastMath.round(0.006432304228643252d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.0341909072993258d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.219703667149318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5454332405223798d + "'", double1 == 1.5454332405223798d);
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.6991118430775187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6991118430775187d + "'", double1 == 2.6991118430775187d);
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 33L, (float) 37);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.3151956127860944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1985166302788286d + "'", double1 == 1.1985166302788286d);
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9265782268450597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6557454899410052d + "'", double1 == 0.6557454899410052d);
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        int int2 = org.apache.commons.math.util.FastMath.min(17, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }
}

