package org.apache.commons.math3.util;

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
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.466528223471357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.466528223471357d + "'", double1 == 4.466528223471357d);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.3486868894677745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0535809243217493d) + "'", double1 == (-1.0535809243217493d));
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.9843788128357573d, 1.2304176427147723E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2304176427147723E11d + "'", double2 == 1.2304176427147723E11d);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.5492763255146005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 146.06277426460522d + "'", double1 == 146.06277426460522d);
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.19902326E12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.19902352E12f + "'", float1 == 2.19902352E12f);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 8.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3025849976266093d + "'", double1 == 2.3025849976266093d);
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.35119970579998244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0623071060261624d + "'", double1 == 1.0623071060261624d);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        int int2 = org.apache.commons.math3.util.FastMath.min(2016, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 258048);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4503.787228186327d + "'", double1 == 4503.787228186327d);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.2207032644558525E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9999694838187878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430447728811394d + "'", double1 == 1.5430447728811394d);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.7105054E-20f, 85);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1048576.0f + "'", float2 == 1048576.0f);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.663561548316891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.663561548316891d + "'", double1 == 3.663561548316891d);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0000036905863599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.810432931264618d, (-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.27941549819892586d) + "'", double2 == (-0.27941549819892586d));
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.5370264E31f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-1023L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-49.17253568793199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-49.0d) + "'", double1 == (-49.0d));
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9179032580179187d, (double) (-148.99998f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9179032580179187d + "'", double2 == 0.9179032580179187d);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 0.9865166189553409d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.03937253280921479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03939289680557203d + "'", double1 == 0.03939289680557203d);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 20, (long) 230);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 230L + "'", long2 == 230L);
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5707131510417711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.233358448855494d + "'", double1 == 1.233358448855494d);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(9.085602964160698d, (double) 230);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.085602964160698d + "'", double2 == 9.085602964160698d);
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 258048, (double) (-5));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 258047.98f + "'", float2 == 258047.98f);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 121, 0.5554451480746508d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 120.99999f + "'", float2 == 120.99999f);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-44), (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44L) + "'", long2 == (-44L));
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 661.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1712579131538248E287d + "'", double1 == 1.1712579131538248E287d);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.04744140788892015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8575532752700432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8575532752700432d + "'", double1 == 0.8575532752700432d);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.01728018604825701d, (double) (-5L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01728018604825701d) + "'", double2 == (-0.01728018604825701d));
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 128L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9438542029972974E55d + "'", double1 == 1.9438542029972974E55d);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        double double2 = org.apache.commons.math3.util.FastMath.max(74.20321057778875d, 2.1306478036226246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.20321057778875d + "'", double2 == 74.20321057778875d);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 6.1035153E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707352916422468d + "'", double1 == 1.5707352916422468d);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.8218109075452849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8218109075452849d + "'", double1 == 1.8218109075452849d);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0409981776839905E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9905152468032868d) + "'", double1 == (-0.9905152468032868d));
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6864385237797251d + "'", double1 == 0.6864385237797251d);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 127.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 128.0d + "'", double1 == 128.0d);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-149L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.8046132754103141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8046132754103144d + "'", double1 == 1.8046132754103144d);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2048.0d, 14.536964742657117d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7120287146535471d) + "'", double2 == (-1.7120287146535471d));
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 56L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-63));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.9790572078963917d) + "'", double1 == (-3.9790572078963917d));
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.18952113006314425d, 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.049363429786769E-23d + "'", double2 == 4.049363429786769E-23d);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(185371.20226542125d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 46342.80056635531d + "'", double2 == 46342.80056635531d);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.1977594109665195d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.45633496304053967d, 14.424551185103434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.401957758408494d) + "'", double2 == (-3.401957758408494d));
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.6641687893997885d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.1017419656965828d, 1.604509091765879E28d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.604509091765879E28d + "'", double2 == 1.604509091765879E28d);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(127.0f, 0.002100511640988539d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.99999f + "'", float2 == 126.99999f);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        double double2 = org.apache.commons.math3.util.FastMath.min(155.15984723271046d, 0.3490082705673706d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3490082705673706d + "'", double2 == 0.3490082705673706d);
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.6261826799366557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2752186792611908d + "'", double1 == 1.2752186792611908d);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.6164048260636456d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2349651161946853d + "'", double1 == 2.2349651161946853d);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9443505256250473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 34);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 34.000004f + "'", float1 == 34.000004f);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7612713058621914d + "'", double1 == 2.7612713058621914d);
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.9092974268256814d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.30087022627717525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3008702262771753d + "'", double1 == 0.3008702262771753d);
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.8163011535675582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2037317718863663d + "'", double1 == 1.2037317718863663d);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1500.0001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0001f + "'", float1 == 1500.0001f);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 1.3750698780782564E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 120.99999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1196.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1196.0d + "'", double1 == 1196.0d);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3072.0005f, 6.584892295492983E-103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.5628219188284785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6308876311715932d + "'", double1 == 0.6308876311715932d);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 48000);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.00390625f + "'", float1 == 0.00390625f);
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-10), (long) 192);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (double) 26);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.7772088E-35f, 3.1664968E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7772088E-35f + "'", float2 == 4.7772088E-35f);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.6711062449719222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011713013605455682d + "'", double1 == 0.011713013605455682d);
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.768371582029804E-7d, (double) 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1789143880198685E-8d + "'", double2 == 3.1789143880198685E-8d);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-77));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9995201585807313d) + "'", double1 == (-0.9995201585807313d));
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.7730812391918281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11177486587614986d) + "'", double1 == (-0.11177486587614986d));
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.2269808089751189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8417013480423108d + "'", double1 == 0.8417013480423108d);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-121L), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.733041938654942E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.733041938654942E-10d + "'", double1 == 2.733041938654942E-10d);
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        long long2 = org.apache.commons.math3.util.FastMath.min(6000L, (long) 109);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 109L + "'", long2 == 109L);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.5772793400051265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-6.39599474488673E7d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-19.999998f), 3.3236692321000443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-19.999998092651367d) + "'", double2 == (-19.999998092651367d));
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 44, 5.8274116E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9134895772587739d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        int int2 = org.apache.commons.math3.util.FastMath.max((-121), (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.8889466E22f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8889466E22f + "'", float2 == 1.8889466E22f);
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        double double1 = org.apache.commons.math3.util.FastMath.asin(6.00031438115249d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(6.139932559690632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999907113987643d + "'", double1 == 0.9999907113987643d);
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        double double1 = org.apache.commons.math3.util.FastMath.floor(58.89668242649342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.0d + "'", double1 == 58.0d);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.7976556325708719d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6627240984495378d) + "'", double1 == (-0.6627240984495378d));
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        double double2 = org.apache.commons.math3.util.FastMath.pow(85.0511287798066d, 1024);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1712579131538248E287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.656473403698357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6065306597126334d + "'", double1 == 0.6065306597126334d);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999999935301913d, (-26));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000001682150395d + "'", double2 == 1.0000001682150395d);
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0021077632011064d, 1.5442925813011463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0021077632011066d + "'", double2 == 1.0021077632011066d);
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.29807406E33f, (double) (-7.4505815E-9f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.94875668844129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4350.668043506033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42393142244212184d + "'", double1 == 0.42393142244212184d);
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7301521188343126d, 0.602681965908778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12747015292553465d + "'", double2 == 0.12747015292553465d);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-8.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.4361214946296837E-5d, (-1.4013650846586732d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141582405571555d + "'", double2 == 3.141582405571555d);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(11.065819144637265d, 1.4863445844633245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6614070533939935d + "'", double2 == 0.6614070533939935d);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.2609551558045143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25808066217407677d) + "'", double1 == (-0.25808066217407677d));
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.0839442125513057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9395033482133572d + "'", double1 == 0.9395033482133572d);
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.5558720618048116d), (double) 1.5845631E30f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845630991695593E30d + "'", double2 == 1.5845630991695593E30d);
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.7500000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7500000000000003d + "'", double1 == 0.7500000000000003d);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.743331614527441d + "'", double1 == 1.743331614527441d);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.882813082076609E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0842021724855044E-19d + "'", double1 == 1.0842021724855044E-19d);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.1977594109665195d, 6.118326675304813E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.030524612749573E-12d) + "'", double2 == (-3.030524612749573E-12d));
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.037494614331192756d, 0.03271943440277325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0414879470054792d + "'", double2 == 1.0414879470054792d);
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.0d, 46);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5184372088832E14d + "'", double2 == 3.5184372088832E14d);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.8140012656304243d), 0.015341507605323268d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8140012656304243d) + "'", double2 == (-0.8140012656304243d));
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7123610724880716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7568207368318041d + "'", double1 == 0.7568207368318041d);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.17887017243876716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        int int1 = org.apache.commons.math3.util.FastMath.round((-0.9999999f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 48000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48000 + "'", int1 == 48000);
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        float float2 = org.apache.commons.math3.util.FastMath.min(127.99999f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 18, (-34L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.06778294805138535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06778294805138536d + "'", double1 == 0.06778294805138536d);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.2775537824944787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8231019645798401d + "'", double1 == 0.8231019645798401d);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.3440688253002957E43d, 4.0601456127484035d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440688253002954E43d + "'", double2 == 1.3440688253002954E43d);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0003695791652218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8416706118107826d + "'", double1 == 0.8416706118107826d);
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.3814241049095075d, (double) 112L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3814241049095075d + "'", double2 == 1.3814241049095075d);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9092973276085183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09508314520925888d) + "'", double1 == (-0.09508314520925888d));
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        long long2 = org.apache.commons.math3.util.FastMath.max(7L, (long) 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 87L + "'", long2 == 87L);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        int int1 = org.apache.commons.math3.util.FastMath.abs(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 10, (long) 15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0000123108260284d, 1.4143575485932556d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28160.379478753133d + "'", double2 == 28160.379478753133d);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.9999995f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 3.8566692171513597E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (double) 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-46.44086109751633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8136829673825111d + "'", double1 == 0.8136829673825111d);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(7.7371252E25f, (-24));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.611686E18f + "'", float2 == 4.611686E18f);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 100L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        long long1 = org.apache.commons.math3.util.FastMath.abs(48000L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 48000L + "'", long1 == 48000L);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 46);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.0d + "'", double1 == 46.0d);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.748066029033894E7d, (double) 512.4999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.748066029033894E7d + "'", double2 == 3.748066029033894E7d);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.010518784647500399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0105743015487578d + "'", double1 == 1.0105743015487578d);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(72.84222839974734d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.3225436741518254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1920928955078157E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.19209289550781E-7d + "'", double1 == 1.19209289550781E-7d);
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.460916398062524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.002741601523296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4426887780552664d + "'", double1 == 1.4426887780552664d);
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        double double2 = org.apache.commons.math3.util.FastMath.max(22025.465794806678d, 3282.6426454739853d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.465794806678d + "'", double2 == 22025.465794806678d);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.20036664302268956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2030917727799142d + "'", double1 == 0.2030917727799142d);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(6000.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6000.0005f + "'", float1 == 6000.0005f);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1L), 123904.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 123904.0f + "'", float2 == 123904.0f);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1024.0496050813779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.873037312417697d + "'", double1 == 17.873037312417697d);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        int int2 = org.apache.commons.math3.util.FastMath.min((-49), (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 3890776.558273805d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.103515625E-5d, 3072);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 9.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978950994030255d + "'", double1 == 2.3978950994030255d);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.41014226417523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8796857765384196d + "'", double1 == 0.8796857765384196d);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.562684647563167E-309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.562684647563167E-309d + "'", double1 == 5.562684647563167E-309d);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(40.0f, 0.6134715957522356d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.999996f + "'", float2 == 39.999996f);
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.3486991523486093E-6d, 3.0517578129736954E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3486991523486095E-6d + "'", double2 == 1.3486991523486095E-6d);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.2887572196644652d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.13512126156864773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9908850032870615d + "'", double1 == 0.9908850032870615d);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-8));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1024, (float) (-42));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-42.0f) + "'", float2 == (-42.0f));
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 128L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 128.0f + "'", float1 == 128.0f);
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        long long2 = org.apache.commons.math3.util.FastMath.max((-5L), (long) 48000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48000L + "'", long2 == 48000L);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.2779131873068914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5271747218018817d + "'", double1 == 0.5271747218018817d);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6931471789453949d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.05680446438604993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        float float2 = org.apache.commons.math3.util.FastMath.min(512.0f, (float) (-44));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-44.0f) + "'", float2 == (-44.0f));
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 67);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3838.8172273765153d + "'", double1 == 3838.8172273765153d);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 0.023437498f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023433208017845056d + "'", double1 == 0.023433208017845056d);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.9999999f, 1024.0001220703125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9999998807907107d + "'", double2 == 1.9999998807907107d);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        double double1 = org.apache.commons.math3.util.FastMath.rint(8.359154094323616E102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.359154094323616E102d + "'", double1 == 8.359154094323616E102d);
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.27941549819892586d), 201.77658293369473d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 201.7767763976291d + "'", double2 == 201.7767763976291d);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(86.74231627807738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5139390198587235d + "'", double1 == 1.5139390198587235d);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 724L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        int int2 = org.apache.commons.math3.util.FastMath.min(1025, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        double double2 = org.apache.commons.math3.util.FastMath.min(149.10293727139822d, 1.3234889800848443E-23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3234889800848443E-23d + "'", double2 == 1.3234889800848443E-23d);
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.19902352E12f, (float) 95);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 95.0f + "'", float2 == 95.0f);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        long long2 = org.apache.commons.math3.util.FastMath.min(2016L, 63959947L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2016L + "'", long2 == 2016L);
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        int int2 = org.apache.commons.math3.util.FastMath.min(1024, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-20));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 19.000002f, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4579380359232397E-4d + "'", double2 == 1.4579380359232397E-4d);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        float float2 = org.apache.commons.math3.util.FastMath.max((-4.12316828E11f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-3), (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.810477380685345d, (-77));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9614907400687907E-53d + "'", double2 == 2.9614907400687907E-53d);
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-34.999996f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9466715061814477d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9466715061814477d + "'", double2 == 0.9466715061814477d);
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(50.793076005481666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.0d + "'", double1 == 51.0d);
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(35.000004f, (float) (-28));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.000004f) + "'", float2 == (-35.000004f));
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-2016L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2015.9999f) + "'", float1 == (-2015.9999f));
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) -1, 43);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.796093E12f) + "'", float2 == (-8.796093E12f));
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 20, 3406.67702003341d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8892415974417167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 87, (long) 22);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 87L + "'", long2 == 87L);
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(58.450108003093554d, 0.10118316786443415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.4501955822798d + "'", double2 == 58.4501955822798d);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15707963267948966d + "'", double1 == 0.15707963267948966d);
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3666.9298888372687d, 26);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.697510572463047E92d + "'", double2 == 4.697510572463047E92d);
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.8774718E-37f, (-10.999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.999999f) + "'", float2 == (-10.999999f));
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-724.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1136117014086105E-8d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-27) + "'", int1 == (-27));
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-3.814697265625E-6d), (-121));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4349296274686127E-42d) + "'", double2 == (-1.4349296274686127E-42d));
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        int int2 = org.apache.commons.math3.util.FastMath.max((-10), 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.05751362495359344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.855733403533735d) + "'", double1 == (-2.855733403533735d));
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.9127058362020531d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        double double1 = org.apache.commons.math3.util.FastMath.asin(6.118326675323529E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.118326675323529E-12d + "'", double1 == 6.118326675323529E-12d);
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 31L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 31.000002f + "'", float1 == 31.000002f);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9999999f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.20745350934872828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.45282434280595096d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4386238852913852d) + "'", double1 == (-0.4386238852913852d));
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9942138060909441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 12, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.11114736252488898d), 3.9823973283939967E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2.9103834E-11f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.910383E-11f) + "'", float1 == (-2.910383E-11f));
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1023, 4.5035996E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5035996E15f + "'", float2 == 4.5035996E15f);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.1133744357369846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4932313550530223d + "'", double1 == 0.4932313550530223d);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.19920008462778144d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-63959947L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.3959948E7f + "'", float1 == 6.3959948E7f);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 18L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.783412408121364d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.135272762622845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12687294155275594d + "'", double1 == 0.12687294155275594d);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        double double2 = org.apache.commons.math3.util.FastMath.pow(229.3648145037862d, 42971.83113775489d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.671406E24f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 82 + "'", int1 == 82);
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.87E-42f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.87E-42f + "'", float2 == 2.87E-42f);
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(47.000004f, (-1.317781526637439d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47.0f + "'", float2 == 47.0f);
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(97.000015f, 3.137816820747311E9d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.00002f + "'", float2 == 97.00002f);
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 6.0559039E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.05590388736E11d + "'", double1 == 6.05590388736E11d);
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.6065306597126334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.541680331965196d + "'", double1 == 0.541680331965196d);
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.375992974827435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04146890041499349d + "'", double1 == 0.04146890041499349d);
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 2.534652329259588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.534652329259588d + "'", double2 == 2.534652329259588d);
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.45582719860614E12d, (double) 205);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.45582719860614E12d + "'", double2 == 1.45582719860614E12d);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 7L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.02909330424175981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.43597357E12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (-0.06243896f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.213373949227512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8376887111873257d + "'", double1 == 0.8376887111873257d);
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.013553240791789689d, 10.66808436663482d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013553240791789689d + "'", double2 == 0.013553240791789689d);
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-4L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(201.71573230680755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0090903064446856E87d + "'", double1 == 2.0090903064446856E87d);
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7677.584358657442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.62182581216533d + "'", double1 == 87.62182581216533d);
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.0142084520165588E37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1023, (long) 16);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023L + "'", long2 == 1023L);
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 46, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46L + "'", long2 == 46L);
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        float float2 = org.apache.commons.math3.util.FastMath.max(38.000004f, (float) 258048);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 258048.0f + "'", float2 == 258048.0f);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.9999999403953552d), (-0.9074833044665938d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        int int2 = org.apache.commons.math3.util.FastMath.max((-67), (-121));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-67) + "'", int2 == (-67));
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.30063120215704364d), 5.470926004896228d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.479179726086761d + "'", double2 == 5.479179726086761d);
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-3.4667109783961534d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.000012009687694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6269055909038697d + "'", double1 == 3.6269055909038697d);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(192.0f, 0.8133637952951194d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 191.99998f + "'", float2 == 191.99998f);
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.8014400656965636E16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 18014400656965636L + "'", long1 == 18014400656965636L);
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.4414062E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12) + "'", int1 == (-12));
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(47.000003814697266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.543408017589537d + "'", double1 == 4.543408017589537d);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        int int2 = org.apache.commons.math3.util.FastMath.min(34, 137);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.4738100493246071d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.877472E-37f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9947105519848425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-28L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.025670415869822d) + "'", double1 == (-4.025670415869822d));
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.4485460293245229d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4812630795650272d) + "'", double1 == (-0.4812630795650272d));
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 99327.99f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 99328L + "'", long1 == 99328L);
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.012638627557620415d, 0.4337733935187889d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.012638627557620415d + "'", double2 == 0.012638627557620415d);
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        double double1 = org.apache.commons.math3.util.FastMath.tan(9.536732862475499E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6928604176721676d + "'", double1 == 1.6928604176721676d);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 661L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 661 + "'", int1 == 661);
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9950371911495349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7048249349574651d + "'", double1 == 1.7048249349574651d);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1229558.1758154717d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        double double1 = org.apache.commons.math3.util.FastMath.abs(201.7158284912051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.7158284912051d + "'", double1 == 201.7158284912051d);
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-3.626861304824472d), (double) (-5.6294995E14f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.0024879065139820676d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13550168185495337d) + "'", double1 == (-0.13550168185495337d));
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.6986437208666088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9352393070532758d + "'", double1 == 0.9352393070532758d);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5701296602269954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2996266281783897d + "'", double1 == 2.2996266281783897d);
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8898341707432424d + "'", double1 == 0.8898341707432424d);
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.0f, 6143999.5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.7042995643269254d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 48000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-27), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.2264012739454784d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.07954809138671995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07954809138671996d + "'", double1 == 0.07954809138671996d);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.0051598093962670006d), (-6.57117967769818E-20d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.57117967769818E-20d) + "'", double2 == (-6.57117967769818E-20d));
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        double double1 = org.apache.commons.math3.util.FastMath.cos(16.911534525287767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35902689939516524d) + "'", double1 == (-0.35902689939516524d));
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0499999832316724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(6.027800920562903d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.3421772E8f, 35.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3421772E8f + "'", float2 == 1.3421772E8f);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9432571842576234d, 84010.50108557596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9432571842576234d + "'", double2 == 0.9432571842576234d);
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.7079938E27f, (-15.749999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-15.749999f) + "'", float2 == (-15.749999f));
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.14351994778492885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9412812444891026d) + "'", double1 == (-1.9412812444891026d));
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.852046083290303d, (double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2494151603783576d + "'", double2 == 2.2494151603783576d);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 38L, (double) (-11.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.999996f + "'", float2 == 37.999996f);
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        long long1 = org.apache.commons.math3.util.FastMath.abs(49L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 49L + "'", long1 == 49L);
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0000000002328306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.295779526422535d + "'", double1 == 57.295779526422535d);
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        double double1 = org.apache.commons.math3.util.FastMath.log(7396.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.908694592507015d + "'", double1 == 8.908694592507015d);
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1.0141204E32f, 0.15707963267948966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15707963267948966d + "'", double2 == 0.15707963267948966d);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.768371013597152E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7320753423163528E-5d + "'", double1 == 2.7320753423163528E-5d);
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9030861493754441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.467205538842019d + "'", double1 == 1.467205538842019d);
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        double double2 = org.apache.commons.math3.util.FastMath.min(750.0003050086722d, (double) 0.0061035156f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006103515625d + "'", double2 == 0.006103515625d);
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(6.308907490697951E48d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.511753867459539E24d + "'", double1 == 2.511753867459539E24d);
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5122768330946906d, (double) 127.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.00000762939453d + "'", double2 == 127.00000762939453d);
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        long long1 = org.apache.commons.math3.util.FastMath.round(7.444680502256067E34d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(9.98714636101983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21744.157347130327d + "'", double1 == 21744.157347130327d);
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.034537054884188d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.011713013605455682d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 8, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        int int1 = org.apache.commons.math3.util.FastMath.round(4.7683733E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        double double1 = org.apache.commons.math3.util.FastMath.floor(11014.000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.0d + "'", double1 == 11014.0d);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        float float2 = org.apache.commons.math3.util.FastMath.min(5999.9995f, (float) 121L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 121.0f + "'", float2 == 121.0f);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1023), 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.030930445539300806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03092058567107131d + "'", double1 == 0.03092058567107131d);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.4012984643248174E-45d), 0.019250629751176255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4012984643248174E-45d) + "'", double2 == (-1.4012984643248174E-45d));
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.6193685383271323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5853621754017098d + "'", double1 == 0.5853621754017098d);
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.8582226493088282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-12.999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 221206.69600559003d + "'", double1 == 221206.69600559003d);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(19.000002f, (double) (-63L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.0f + "'", float2 == 19.0f);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 0.0053710938f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005371093750000001d + "'", double1 == 0.005371093750000001d);
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 109L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 109.00001f + "'", float1 == 109.00001f);
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 109.0f, 26.00961538461539d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 109.0d + "'", double2 == 109.0d);
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.4419647480158577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1589546432340845d + "'", double1 == 0.1589546432340845d);
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.5184552170599437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3605403016588478d + "'", double1 == 1.3605403016588478d);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        double double1 = org.apache.commons.math3.util.FastMath.log((-224.08464360781855d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.6641687893997885d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 2147483647, (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.3554432E7f + "'", float2 == 3.3554432E7f);
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        int int1 = org.apache.commons.math3.util.FastMath.round(14.999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.1182202459195336d, 112);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0998428328572864E34d + "'", double2 == 1.0998428328572864E34d);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 6.776264E-21f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        int int2 = org.apache.commons.math3.util.FastMath.max(32, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 258048.0f, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5282599971085104E231d + "'", double2 == 1.5282599971085104E231d);
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.17512404686688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8657370823391239d + "'", double1 == 0.8657370823391239d);
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.006931009667375755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        float float1 = org.apache.commons.math3.util.FastMath.signum(30.999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 2, (-44L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44L) + "'", long2 == (-44L));
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.01745329251994099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998476951563913d + "'", double1 == 0.9998476951563913d);
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        double double1 = org.apache.commons.math3.util.FastMath.exp(6.646755658135536E-297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(8.382711887306458d, 0.6625659571216382d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.408855584033152d + "'", double2 == 8.408855584033152d);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 0.22104612061990989d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22104612061990989d + "'", double2 == 0.22104612061990989d);
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.072316825685847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-224.08464360781855d), (-1.8870997475188376d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 224.09258944976324d + "'", double2 == 224.09258944976324d);
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.768372150465078E-7d, 4.98216091375236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11032245892599075d) + "'", double2 == (-0.11032245892599075d));
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.7615941545479653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.528732941264681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9499111091905081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016579076456645737d + "'", double1 == 0.016579076456645737d);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.015836877905996926d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.451467802694853E-58d + "'", double2 == 2.451467802694853E-58d);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.273737E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.1102230246251565E-16d, 0.6313673203263278d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6313673203263278d + "'", double2 == 0.6313673203263278d);
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 9.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.000000476837272d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        float float2 = org.apache.commons.math3.util.FastMath.max((-5.44935555E17f), 8.0779357E-28f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0779357E-28f + "'", float2 == 8.0779357E-28f);
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1.1529215E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.15292150460684698E18d + "'", double1 == 1.15292150460684698E18d);
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(112.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-2016.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 100, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 18);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        double double1 = org.apache.commons.math3.util.FastMath.log(2046.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.6236419465115715d + "'", double1 == 7.6236419465115715d);
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9403184054350179d, 0.4464931094577818d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9728982976544945d + "'", double2 == 0.9728982976544945d);
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        long long2 = org.apache.commons.math3.util.FastMath.max(2147483647L, (long) (-24));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.5687609160957652d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(89.93708824838384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        int int2 = org.apache.commons.math3.util.FastMath.min((-86), 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-86) + "'", int2 == (-86));
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.7500000000000001d, 237.68018390304016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 237.68018390304016d + "'", double2 == 237.68018390304016d);
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-14));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24434609527920614d) + "'", double1 == (-0.24434609527920614d));
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 11, 2.38418579101558E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0761170560490427E-13d + "'", double2 == 2.0761170560490427E-13d);
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.3395313360487884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02337923224768997d + "'", double1 == 0.02337923224768997d);
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 11014L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.24923197281617d + "'", double1 == 22.24923197281617d);
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        double double1 = org.apache.commons.math3.util.FastMath.log10(57.29577914238959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.75812262959937d + "'", double1 == 1.75812262959937d);
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0691650524286674E-14d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9176338407880035d, 1484736.8269696264d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.180447767708391E-7d + "'", double2 == 6.180447767708391E-7d);
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(749.9999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-63.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0000038147045416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146972656157483E-6d + "'", double1 == 3.8146972656157483E-6d);
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        double double1 = org.apache.commons.math3.util.FastMath.exp(90.6372488768187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3081128672025563E39d + "'", double1 == 2.3081128672025563E39d);
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.998223045192107d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.359039207590521E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5d + "'", double1 == 0.5d);
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.04353867753168046d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.882812014936196E-4d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.3841857910156025E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-4.821637045374455E-17d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        float float1 = org.apache.commons.math3.util.FastMath.abs(44.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 44.0f + "'", float1 == 44.0f);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        int int2 = org.apache.commons.math3.util.FastMath.min(112, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        float float2 = org.apache.commons.math3.util.FastMath.max(84.99999f, (float) (-77L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 84.99999f + "'", float2 == 84.99999f);
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        long long1 = org.apache.commons.math3.util.FastMath.round(32.01562118716424d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.2304173493603813E11d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-6));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.072316825685847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.772777819263096d + "'", double1 == 10.772777819263096d);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(19.0f, 1.2304176427147723E11d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.000002f + "'", float2 == 19.000002f);
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.185039863261519d + "'", double1 == 2.185039863261519d);
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        long long1 = org.apache.commons.math3.util.FastMath.round(74.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 74L + "'", long1 == 74L);
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.316957896924817d + "'", double1 == 1.316957896924817d);
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 1024);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0f + "'", float1 == 1024.0f);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-34.999992f), 29.517646691625867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.482345678979602d) + "'", double2 == (-5.482345678979602d));
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 141.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-3.9999999999999787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5874010519681967d) + "'", double1 == (-1.5874010519681967d));
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(5729.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.34644344735155d + "'", double1 == 9.34644344735155d);
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 97.000015f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-48.999996f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.050322743661769115d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.749444424663085d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9716863956705664d) + "'", double1 == (-0.9716863956705664d));
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 3072.0005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3072.00048828125d + "'", double1 == 3072.00048828125d);
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.15707963267948966d, 0.9714208072666499d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15707963267948966d + "'", double2 == 0.15707963267948966d);
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        int int2 = org.apache.commons.math3.util.FastMath.min(15, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-7.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-548.3161232732465d) + "'", double1 == (-548.3161232732465d));
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.17512404686688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38542861386634425d + "'", double1 == 0.38542861386634425d);
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(7.283535870312749E-158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.283535870312749E-158d + "'", double1 == 7.283535870312749E-158d);
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.5067879719422177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5314547471274425d) + "'", double1 == (-0.5314547471274425d));
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.7580103071638075d, 0.9938148781603499d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0223935866360639d + "'", double2 == 0.0223935866360639d);
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.090214155633555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32019078460158107d + "'", double1 == 0.32019078460158107d);
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.710505431213761E-20d, 0.6018582986008164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011269295934754417d + "'", double2 == 0.011269295934754417d);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 82);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 82 + "'", int1 == 82);
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.1921433311464832d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        double double2 = org.apache.commons.math3.util.FastMath.min((-2.077727086967487d), 1024.0004882811143d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.077727086967487d) + "'", double2 == (-2.077727086967487d));
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 18014400656965636L, 6.594078672416073E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8014400656965636E16d + "'", double2 == 1.8014400656965636E16d);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5490899152547166E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.703671943063474E-7d + "'", double1 == 2.703671943063474E-7d);
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.5607966601082315d, 0.16352220997244465d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1662143955783597d + "'", double2 == 1.1662143955783597d);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.341378834035669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0408647696904283d + "'", double1 == 0.0408647696904283d);
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-2016L), 137);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.512367368768573E44d) + "'", double2 == (-3.512367368768573E44d));
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        int int2 = org.apache.commons.math3.util.FastMath.max(57, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-2L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.8189894E-12f + "'", float1 == 1.8189894E-12f);
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        float float1 = org.apache.commons.math3.util.FastMath.abs(5.9999995f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.9999995f + "'", float1 == 5.9999995f);
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 149, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0033808812856155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7274875696121619d + "'", double1 == 1.7274875696121619d);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-14.5560905533403d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893698d) + "'", double1 == (-0.5440211108893698d));
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        double double1 = org.apache.commons.math3.util.FastMath.rint(48000.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48000.0d + "'", double1 == 48000.0d);
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.5749804E-19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.5749804E-19f + "'", float1 == 2.5749804E-19f);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(10.000000953674316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        int int2 = org.apache.commons.math3.util.FastMath.min(8, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(10.66808436663482d, 13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 87392.94713147245d + "'", double2 == 87392.94713147245d);
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.9999999999244973d, 1.3120498879326579d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6496893368974337d + "'", double2 == 1.6496893368974337d);
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.8828122E-4f, 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0078124995f + "'", float2 == 0.0078124995f);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.754140548665503d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        double double2 = org.apache.commons.math3.util.FastMath.pow(99.99999237060547d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.099511758848E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.099511758848E12d + "'", double1 == 1.099511758848E12d);
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-2.842859999667946E24d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9716102063416081d + "'", double1 == 0.9716102063416081d);
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-26L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.04009065368992251d, (-0.11177486587614986d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04009065368992251d + "'", double2 == 0.04009065368992251d);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.005159740711202605d), 230);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.902805400982281E66d) + "'", double2 == (-8.902805400982281E66d));
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 7.629395E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999708962d + "'", double1 == 0.9999999999708962d);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.0d), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1024.0d) + "'", double2 == (-1024.0d));
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 131072.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 131072.0d + "'", double1 == 131072.0d);
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.036635383480205265d), 0.7853983422113506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04661182175703781d) + "'", double2 == (-0.04661182175703781d));
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-2016), 661.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2016.0f + "'", float2 == 2016.0f);
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.6011880928080983E28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.285258920311645E26d + "'", double1 == 6.285258920311645E26d);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.3552527156068805E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3552527156068805E-20d + "'", double1 == 1.3552527156068805E-20d);
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-24), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24L) + "'", long2 == (-24L));
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-3.6268613048244727d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 2.9999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.8873248788686d + "'", double1 == 171.8873248788686d);
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        long long1 = org.apache.commons.math3.util.FastMath.abs(44L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 44L + "'", long1 == 44L);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.3120498879326579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-46));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.557321860113169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251446403922804d) + "'", double1 == (-0.9251446403922804d));
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        long long2 = org.apache.commons.math3.util.FastMath.min(77L, 127L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 77L + "'", long2 == 77L);
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.3440585709080487E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080487E43d + "'", double1 == 1.3440585709080487E43d);
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.7559662776027263d), 9.693523592216698E-24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.693523592216698E-24d + "'", double2 == 9.693523592216698E-24d);
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.12120703299629262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.6931474189785528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8325547543426515d + "'", double1 == 0.8325547543426515d);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5707131510417711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.050338712741454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1023), 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.1306478036226246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.420319758673276d + "'", double1 == 7.420319758673276d);
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 4.2949673E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1625.4986772154364d + "'", double1 == 1625.4986772154364d);
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8640954259078426d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.373271248389448d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        double double1 = org.apache.commons.math3.util.FastMath.acos(8.781516350303278d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.24304604515482672d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.814697265625E-6d, 1.2207031280316523E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2207031280316523E-4d + "'", double2 == 1.2207031280316523E-4d);
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.7513003742396658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0120736632737113d + "'", double1 == 1.0120736632737113d);
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        int int2 = org.apache.commons.math3.util.FastMath.max(121, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 121 + "'", int2 == 121);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.4414062E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.910383E-11f + "'", float1 == 2.910383E-11f);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.1202597334155252E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.4489023749402996d, 160.80803418105256d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4489023749402996d + "'", double2 == 1.4489023749402996d);
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.14436025976083594d), 1500);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.36787944117144233d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 'a', (long) 85);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 85L + "'", long2 == 85L);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.011081208247316237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011081208247316239d + "'", double1 == 0.011081208247316239d);
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 8.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.9579870417283d + "'", double1 == 2979.9579870417283d);
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.49290533695396277d), 127.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.571215757858572E-40d) + "'", double2 == (-9.571215757858572E-40d));
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-10L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 'a', 9.573628439715033E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999999999999d + "'", double2 == 96.99999999999999d);
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1025.0001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.13512126156864773d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(34.581559855949905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.58155985594991d + "'", double1 == 34.58155985594991d);
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 512);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-1.5258789E-5f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(25.0936250232611d, 20.57108454052487d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.44779708980961d + "'", double2 == 32.44779708980961d);
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 0.06243896f, 0.3762399214389404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16445633319114894d + "'", double2 == 0.16445633319114894d);
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5.298292365610485d, (-3.4667109783961534d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.298292365610484d + "'", double2 == 5.298292365610484d);
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (float) 67);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1.110223E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.062778942642255d, 0.2142316598443891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0841560242896184d + "'", double2 == 1.0841560242896184d);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (byte) 100, 512.5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.5f + "'", float2 == 512.5f);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.66320749752745d, (double) 13.000001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.506262027869681d + "'", double2 == 13.506262027869681d);
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9998428711716857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.6928604176721676d, 416);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8648332375832054E125d + "'", double2 == 2.8648332375832054E125d);
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.7249453328133406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.6018582986008164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.507733245764594d) + "'", double1 == (-0.507733245764594d));
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        double double1 = org.apache.commons.math3.util.FastMath.signum(100.00000762939453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(48000.0f, 1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47999.996f + "'", float2 == 47999.996f);
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 6000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 109.0f, (-77));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.213014941462401E-22d + "'", double2 == 7.213014941462401E-22d);
    }
}

