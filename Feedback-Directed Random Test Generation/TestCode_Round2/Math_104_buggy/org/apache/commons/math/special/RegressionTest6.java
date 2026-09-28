package org.apache.commons.math.special;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.0d, 1189.2887798079032d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.6321224372192542d, 0.8919849515926038d, 0.9999999999999861d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(2.886826907789816E-79d, (-7.549516567451064E-15d), 3.031729989331211E-4d, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.9999997869230527d, 0.09678543937527384d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9077506981181042d + "'", double2 == 0.9077506981181042d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(6.843150912806986E-7d, 0.63212059787799d, 4.672942255368184E-8d, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaP(178.439748388501d, 0.6321205587646581d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(3.4912819852531665d, 0.5150598435363913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9942242187460648d + "'", double2 == 0.9942242187460648d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.9999999999103745d, 0.0d, 0.9252175695351202d, (int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(26.587046013834495d, 0.5818001962529245d, 0.999999278706431d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaP(6.40182605369688E-4d, 0.72222454561348d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9997704318764905d + "'", double2 == 0.9997704318764905d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.3682382522330221d, 2.7889444409519647E-175d, 0.005763894069787501d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(7.738782381938591E-5d, 0.6922006008001025d, 0.306407209979461d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double double1 = org.apache.commons.math.special.Gamma.logGamma(0.9999998885745279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.431653831739936E-8d + "'", double1 == 6.431653831739936E-8d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        double double1 = org.apache.commons.math.special.Gamma.logGamma(0.3868676069494239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8309547491879257d + "'", double1 == 0.8309547491879257d);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.7895413151199938d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaP(1.4971170349087348E-4d, (-2.2870594307278225E-14d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP((-1.1102230246251565E-14d), 0.16479379607039543d, 0.4059184804159021d, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.9995774414391755d, 0.47182232941978514d, 2.1735670539712015d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        double double1 = org.apache.commons.math.special.Gamma.logGamma(0.9993732739168786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.620792646517046E-4d + "'", double1 == 3.620792646517046E-4d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.1672415896998537d, 0.04269603780259634d, 1.1277103496650385E-31d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6323762698832446d + "'", double4 == 0.6323762698832446d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.9697741201266252d, 0.8480685611407257d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41423669355960413d + "'", double2 == 0.41423669355960413d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(6.889502589156446E-179d, 0.46981683083046627d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.238654120556021E-14d) + "'", double2 == (-7.238654120556021E-14d));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.9999999999999811d, 0.4106234749514033d, 0.999999998566641d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3282552270659082d + "'", double4 == 0.3282552270659082d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        double double1 = org.apache.commons.math.special.Gamma.logGamma(34.657359027997266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.36924483571593d + "'", double1 == 87.36924483571593d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.00584324660521951d, 0.969989847119468d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9986437190657315d + "'", double2 == 0.9986437190657315d);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.04269603780259634d, 0.12197283992509504d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9309872038037501d + "'", double2 == 0.9309872038037501d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(17.284437627986d, 0.9625059182091302d, 0.005763894069787501d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(16.009909761429743d, 8.737528277869E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double double1 = org.apache.commons.math.special.Gamma.logGamma(4.222541920573253E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.072463795709014d + "'", double1 == 10.072463795709014d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.9999983173716832d, (double) 100.0f, 17.28443761241068d, 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.720049796443678E-42d + "'", double4 == 3.720049796443678E-42d);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        double double1 = org.apache.commons.math.special.Gamma.logGamma(0.7406445969025819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2135515848753271d + "'", double1 == 0.2135515848753271d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.9999867412475681d, 6.929511565590445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9990215555678864d + "'", double2 == 0.9990215555678864d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.0044142014586011635d, 0.9046170095940621d, 4.8455711422869836E-5d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.3678795245744494d, 1.000000000000019d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8921334223255432d + "'", double2 == 0.8921334223255432d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.1139520298462634d, 8.659739592076221E-15d, 0.8507789131669222d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.02640686764095485d + "'", double4 == 0.02640686764095485d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(1.5777582019151555d, 22.390578822804663d, 9.262152956230942E-11d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Continued fraction convergents failed to converge for value 22.391");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(1.8873791418627522E-14d, 2.885643367307445E-16d, 0.999984360354954d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.9999983173583612d, 1.509903313490213E-14d, 14.116807284537838d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        double double1 = org.apache.commons.math.special.Gamma.logGamma(3.6914688406053386E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.812070999248766d + "'", double1 == 14.812070999248766d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        double double2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.10642073468955271d, 4.369740797972719E-99d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.591974097261752E-11d + "'", double2 == 3.591974097261752E-11d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(7.864138196723477d, 0.24251720040350022d, 0.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.0d, 0.540029687525494d, (-2.2870594307278225E-14d), (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.0d, 6.843150912806986E-7d, 0.0d, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        double double1 = org.apache.commons.math.special.Gamma.logGamma(0.9999972629475621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5798757040386135E-6d + "'", double1 == 1.5798757040386135E-6d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(11575.551595763516d, 7.105427357601002E-15d, 93.40406992176605d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(4.884981308350689E-15d, 1189.2887798079032d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (2,147,483,647) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }
}

