package org.apache.commons.math.util;

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
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03001");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6104048481741295d) + "'", double1 == (-0.6104048481741295d));
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.999999969540041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430805990186642d + "'", double1 == 1.5430805990186642d);
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4330001021490115d + "'", double1 == 1.4330001021490115d);
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7642469915557848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7642469915557848d + "'", double1 == 0.7642469915557848d);
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (-33));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.0d) + "'", double1 == (-33.0d));
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(108.29903111138356d, 2.674083105727976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 108.29903111138354d + "'", double2 == 108.29903111138354d);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4364668701002334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-90), (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        double double1 = org.apache.commons.math.util.FastMath.ulp(8.590466459908002E-72d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0053823416929744E-87d + "'", double1 == 1.0053823416929744E-87d);
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6986765821769388d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.491754101407853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.517101195721465d + "'", double1 == 1.517101195721465d);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.9188537484079586d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9772537590358271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.005403023058834883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 5507);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0668535532697389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06695333002016242d + "'", double1 == 0.06695333002016242d);
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5507, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5882496193148399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.28996163075955d) + "'", double1 == (-57.28996163075955d));
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.011871350870521892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0119420950219882d + "'", double1 == 1.0119420950219882d);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4221817809573358E-5d + "'", double1 == 2.4221817809573358E-5d);
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2018553154285492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707963267803446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.455197646070681E-11d + "'", double1 == 1.455197646070681E-11d);
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.892256650791169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9872136726111863d, 11013.999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9872136726111863d + "'", double2 == 0.9872136726111863d);
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2602577590774198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30557148829374d + "'", double1 == 0.30557148829374d);
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8325008986719311d, 0.7893750108307105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.832500898671931d + "'", double2 == 0.832500898671931d);
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        double double2 = org.apache.commons.math.util.FastMath.max((-466.4266135928925d), (-1.3273845772164694d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3273845772164694d) + "'", double2 == (-1.3273845772164694d));
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0438800790430118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018219144375279214d + "'", double1 == 0.018219144375279214d);
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.000897785780501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.720723359053762d + "'", double1 == 2.720723359053762d);
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.085665678873264E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.085665678873702E-7d + "'", double1 == 5.085665678873702E-7d);
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.38863652572621304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47496834084305245d + "'", double1 == 0.47496834084305245d);
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.00565679192583975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005656852264782563d + "'", double1 == 0.005656852264782563d);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8720836498654725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0594418557410383d) + "'", double1 == (-0.0594418557410383d));
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45158270528945427d + "'", double1 == 0.45158270528945427d);
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9853647714477322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8211080655056973d), 1.0530637390494224d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8211080655056973d) + "'", double2 == (-0.8211080655056973d));
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-36.00591422616983d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.277023171696393d) + "'", double1 == (-4.277023171696393d));
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8867254579876315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9607190280136697d + "'", double1 == 0.9607190280136697d);
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.601988246761649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6130679609866563d + "'", double1 == 1.6130679609866563d);
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.834046549311538E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.191967820742884E21d + "'", double1 == 6.191967820742884E21d);
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.356194490192345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.022630443056965113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022634307143927467d + "'", double1 == 0.022634307143927467d);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        long long2 = org.apache.commons.math.util.FastMath.max(37L, (long) 5507);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        double double2 = org.apache.commons.math.util.FastMath.min(630998.4197775756d, 0.9913289180781171d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9913289180781171d + "'", double2 == 0.9913289180781171d);
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.05660497324994224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05663520630914342d + "'", double1 == 0.05663520630914342d);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
        int int2 = org.apache.commons.math.util.FastMath.min((-90), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.441486971549388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8939966636005579d) + "'", double1 == (-0.8939966636005579d));
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.48674355529070396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7084653196386397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.520482796722225d + "'", double1 == 5.520482796722225d);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5958.7609015404305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.385765023619431d + "'", double1 == 9.385765023619431d);
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        double double1 = org.apache.commons.math.util.FastMath.log(2.46819606815034E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.306852824943366d) + "'", double1 == (-8.306852824943366d));
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5847577751518754E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847577751512122E-6d + "'", double1 == 1.5847577751512122E-6d);
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5596122796450436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1596819083340262d + "'", double1 == 1.1596819083340262d);
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8034325040154596d, 8.510293288140764E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8034325040154597d + "'", double2 == 0.8034325040154597d);
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.3978118125063327d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32821156205036844d) + "'", double1 == (-0.32821156205036844d));
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 33L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4352296559186861d, (-0.07898096151940606d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6257710684000874d + "'", double2 == 1.6257710684000874d);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7182818247238476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14695139574279478d) + "'", double1 == (-0.14695139574279478d));
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.9439511105971d + "'", double1 == 104.9439511105971d);
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.298342365610589d, 0.020162834169477797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0341909072993258d + "'", double2 == 1.0341909072993258d);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        double double2 = org.apache.commons.math.util.FastMath.pow((-6.0d), (-2.2308123878770227d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.03449930605017342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5362901735522732d + "'", double1 == 1.5362901735522732d);
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7945982305639963d + "'", double1 == 0.7945982305639963d);
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.8427842873511956E202d, (-0.32821156205036844d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8427842873511954E202d + "'", double2 == 1.8427842873511954E202d);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4444561992238574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1635528496768865d + "'", double1 == 1.1635528496768865d);
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9020848703947254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.810415804571918d + "'", double1 == 0.810415804571918d);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.322723236313804d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        double double2 = org.apache.commons.math.util.FastMath.max(0.013657851706229811d, (-0.5830846312335454d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013657851706229811d + "'", double2 == 0.013657851706229811d);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.61377529750595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.638566441559658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.147784570106809d + "'", double1 == 4.147784570106809d);
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0896856194228446d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9811545263067579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.21601340753473d + "'", double1 == 56.21601340753473d);
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.013657851706229811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013658276325773256d + "'", double1 == 0.013658276325773256d);
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8306408778607839d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7130376554537363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.008491519610769877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008491621662199392d) + "'", double1 == (-0.008491621662199392d));
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-33L), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.7591770905221553d), 0.32410684590028493d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3886016769558134d) + "'", double2 == (-1.3886016769558134d));
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6853169696133172d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764523d) + "'", double1 == (-0.8390715290764523d));
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        long long2 = org.apache.commons.math.util.FastMath.max(90L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.13211426394445566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0087397904378297d + "'", double1 == 1.0087397904378297d);
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.38863652572621304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40946195169855704d + "'", double1 == 0.40946195169855704d);
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0874684814275741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.307354339300744d + "'", double1 == 62.307354339300744d);
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7642469915557848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5677239656717767d + "'", double1 == 0.5677239656717767d);
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (-90.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-90L) + "'", long1 == (-90L));
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.06695333002016242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8361432345018613d + "'", double1 == 3.8361432345018613d);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.23012809149401298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25876123621075164d + "'", double1 == 0.25876123621075164d);
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3393416562538205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.450721885123068E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 802.1409131831525d + "'", double1 == 802.1409131831525d);
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8334224771468441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.092783262284966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7385162236782312d) + "'", double1 == (-1.7385162236782312d));
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-6.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4917798526449118d) + "'", double1 == (-2.4917798526449118d));
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 5507);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.601988246761649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04541326200418545d + "'", double1 == 0.04541326200418545d);
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2799416321930788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8564693635507433d + "'", double1 == 0.8564693635507433d);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6108652381980155d, 0.42041931513487113d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9680095228539631d + "'", double2 == 0.9680095228539631d);
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.46579480672d + "'", double1 == 22025.46579480672d);
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-90L), (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.539788332061041E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000254d + "'", double1 == 1.000000000000254d);
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.557407710533861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9149994934381422d + "'", double1 == 0.9149994934381422d);
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        double double1 = org.apache.commons.math.util.FastMath.ceil(44.99809670330265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.0d + "'", double1 == 45.0d);
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1877181244729043d, 2.2679097336560172d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.48243212226262994d + "'", double2 == 0.48243212226262994d);
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6563678204210394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8548021080203528d + "'", double1 == 0.8548021080203528d);
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        int int1 = org.apache.commons.math.util.FastMath.round(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        double double1 = org.apache.commons.math.util.FastMath.abs(71.6197243913529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.6197243913529d + "'", double1 == 71.6197243913529d);
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 10.0f, 2.7182819603591994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 522.7354584310932d + "'", double2 == 522.7354584310932d);
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.079985986933499E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3552527156068805E-20d + "'", double1 == 1.3552527156068805E-20d);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9999067329932104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999067329932104d + "'", double1 == 0.9999067329932104d);
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-51.777749330614135d) + "'", double1 == (-51.777749330614135d));
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.079985961979837E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985986933498E-5d + "'", double1 == 9.079985986933498E-5d);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6019895799783384d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2958255551963092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29167236570643446d + "'", double1 == 0.29167236570643446d);
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7167268785408383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.07139823206237136d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.090817361869514d) + "'", double1 == (-4.090817361869514d));
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2479614275509088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8100237733214718d + "'", double1 == 0.8100237733214718d);
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        double double2 = org.apache.commons.math.util.FastMath.min(3.9733523361592433d, 8.180265029949425E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9733523361592433d + "'", double2 == 3.9733523361592433d);
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.005202448765189584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000135327670998d + "'", double1 == 1.0000135327670998d);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.356194490192345d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.3561944901923444d) + "'", double2 == (-2.3561944901923444d));
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.0947125472611012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        double double1 = org.apache.commons.math.util.FastMath.sin(23.628351601695012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9977958852759198d) + "'", double1 == (-0.9977958852759198d));
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        double double2 = org.apache.commons.math.util.FastMath.max(1.814615669229906d, (-0.8373983731296124d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.814615669229906d + "'", double2 == 1.814615669229906d);
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
        double double2 = org.apache.commons.math.util.FastMath.min(2.5050276162256437E-186d, 0.055410749812933396d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5050276162256437E-186d + "'", double2 == 2.5050276162256437E-186d);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.158783182388476d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.06549192716803806d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40308433762500984d) + "'", double1 == (-0.40308433762500984d));
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8922451992629653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1022931929401623d + "'", double1 == 1.1022931929401623d);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        double double2 = org.apache.commons.math.util.FastMath.pow(10.244215505684302d, (-0.8166592361428845d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14954890303695034d + "'", double2 == 0.14954890303695034d);
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9866275920404864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005846743218731832d) + "'", double1 == (-0.005846743218731832d));
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.553234855038964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.010973228372790073d, 15.675653009906092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010973228372790075d + "'", double2 == 0.010973228372790075d);
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1596819083340262d, 2.5050276162256437E-186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1596819083340262d + "'", double2 == 1.1596819083340262d);
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-33));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 33L + "'", long1 == 33L);
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.544137102816975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.544137102816975d + "'", double1 == 7.544137102816975d);
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0053823416929744E-87d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0053823416929744E-87d + "'", double1 == 1.0053823416929744E-87d);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.732511156817248d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.467337109647484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3512721633416307d + "'", double1 == 1.3512721633416307d);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.772695717397461d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3136814122251812d + "'", double1 == 1.3136814122251812d);
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1525354798260945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9852288378766421d + "'", double1 == 0.9852288378766421d);
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.25876123621075164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25313651049314223d + "'", double1 == 0.25313651049314223d);
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5847577751518754E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        int int2 = org.apache.commons.math.util.FastMath.max(5507, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 37L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.267909733656017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5059580783195847d + "'", double1 == 1.5059580783195847d);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6686000970514328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8082072382458939d + "'", double1 == 0.8082072382458939d);
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.3978118125063327d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39781181250633263d) + "'", double1 == (-0.39781181250633263d));
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.3945753355078114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9834982458959824d) + "'", double1 == (-0.9834982458959824d));
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.549516130084085d, 0.011983210854855571d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5630629629813295d + "'", double2 == 1.5630629629813295d);
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3505896985737582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8003067438809977d + "'", double1 == 1.8003067438809977d);
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-89.3634064240365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.14977507862289408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15091034527843197d + "'", double1 == 0.15091034527843197d);
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.32832234898519613d, 0.48243212226262994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5975571443282363d + "'", double2 == 0.5975571443282363d);
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5278888682247538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-30.24580420121606d) + "'", double1 == (-30.24580420121606d));
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.15151031285994174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.147277566020156d), 1.5248526696656155d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1472775660201557d) + "'", double2 == (-1.1472775660201557d));
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.559685672897289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.273561760331577d) + "'", double1 == (-2.273561760331577d));
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.492757420590522E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.865562166738968E-15d + "'", double1 == 1.865562166738968E-15d);
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6637128698018219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.228462604887648d + "'", double1 == 1.228462604887648d);
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4610626787992866d, (-1.0269835496406734d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6774664656433237d + "'", double2 == 0.6774664656433237d);
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        int int2 = org.apache.commons.math.util.FastMath.min(5507, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.959249046208901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 226.84826038896668d + "'", double1 == 226.84826038896668d);
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, 7.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.3818004626805416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3818004626805414d) + "'", double1 == (-1.3818004626805414d));
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3805346802806d + "'", double1 == 2979.3805346802806d);
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        double double1 = org.apache.commons.math.util.FastMath.asin((-5.195945676325781d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1312.6929859424645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-13.89543714211785d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999982955d) + "'", double1 == (-0.9999999999982955d));
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1635528496768865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7568305870163554d + "'", double1 == 1.7568305870163554d);
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(36.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.0d + "'", double1 == 37.0d);
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.21020213304517052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19078739776044754d + "'", double1 == 0.19078739776044754d);
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4617111047443176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.134890207766664d + "'", double1 == 1.134890207766664d);
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6583966420468889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4179477298040799d) + "'", double1 == (-0.4179477298040799d));
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3408013099384417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.06783547514661402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06773161457158877d) + "'", double1 == (-0.06773161457158877d));
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2979.3805346802806d, 3.0374464491245434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2979.38053468028d + "'", double2 == 2979.38053468028d);
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4364668701002334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 82.30348906711043d + "'", double1 == 82.30348906711043d);
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 2.3025850929940455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        double double1 = org.apache.commons.math.util.FastMath.asin((-4.122307281809905E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.122307281809905E-9d) + "'", double1 == (-4.122307281809905E-9d));
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9913289180781171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5280998217363506d + "'", double1 == 1.5280998217363506d);
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.765921910638158E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7659219106381584E-8d + "'", double1 == 2.7659219106381584E-8d);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.149548905166106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.86430060990239d + "'", double1 == 65.86430060990239d);
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
        float float1 = org.apache.commons.math.util.FastMath.abs(9.223372E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7720875399559285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9737269126464657d + "'", double1 == 0.9737269126464657d);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        long long1 = org.apache.commons.math.util.FastMath.round(4.942359898401499d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        long long1 = org.apache.commons.math.util.FastMath.round(2.276225755267126d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8089563172728977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        float float2 = org.apache.commons.math.util.FastMath.min(7.0f, (float) 90L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9873579129275408d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.834573375909858d) + "'", double1 == (-0.834573375909858d));
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567780803757d + "'", double1 == 0.027415567780803757d);
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.601988246761649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5988920145399181d) + "'", double1 == (-0.5988920145399181d));
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.999948217360899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.248949670772078E-5d) + "'", double1 == (-2.248949670772078E-5d));
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 5507);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.510293288140764E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25488428787741324d + "'", double1 == 0.25488428787741324d);
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8640359722236104d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.4414869715493879d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        double double2 = org.apache.commons.math.util.FastMath.min(0.47496834084305245d, 2.765921910638158E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.765921910638158E-8d + "'", double2 == 2.765921910638158E-8d);
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8064012322901598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5913365965931429d + "'", double1 == 0.5913365965931429d);
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 32L, 2.4215467286739085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4215467286739085d + "'", double2 == 2.4215467286739085d);
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(11.940141468803505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 684.1197129515765d + "'", double1 == 684.1197129515765d);
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2018553154285492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8134592121885016d + "'", double1 == 1.8134592121885016d);
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 33, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.613775297505947d, 0.030429149482917455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5672637267613392d + "'", double2 == 1.5672637267613392d);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.47100149383084566d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3756233543023781d) + "'", double1 == (-0.3756233543023781d));
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.9439513269027d + "'", double1 == 104.9439513269027d);
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.227971924677803d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.1286157825604266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7074275585391845d + "'", double1 == 1.7074275585391845d);
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        double double1 = org.apache.commons.math.util.FastMath.log(0.005656701421335315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.1749143444037795d) + "'", double1 == (-5.1749143444037795d));
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7577337065923179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5330785122775574d), (-1.5912749463979503d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5330785122775574d) + "'", double2 == (-0.5330785122775574d));
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7853981633974483d, 0.9751446278717821d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.534938999763997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026789739363150215d) + "'", double1 == (-0.026789739363150215d));
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.113820254782413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-63.81719973521831d) + "'", double1 == (-63.81719973521831d));
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.61391130652238d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4063917980622467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0812030006757882d + "'", double1 == 3.0812030006757882d);
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
        double double1 = org.apache.commons.math.util.FastMath.asin(52.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6088194853164001d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010625904569068452d) + "'", double1 == (-0.010625904569068452d));
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.017453292447995462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5729347079345366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5175112807146286d + "'", double1 == 0.5175112807146286d);
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4724053287214428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3868973415880647d + "'", double1 == 0.3868973415880647d);
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599210498948732d + "'", double1 == 1.2599210498948732d);
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        int int2 = org.apache.commons.math.util.FastMath.min(90, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.0724781822753713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-6.838249024841735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1193499605547798d) + "'", double1 == (-0.1193499605547798d));
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.995200412208242d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2589123923257013d) + "'", double1 == (-1.2589123923257013d));
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.1193499605547798d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11906841651727786d) + "'", double1 == (-0.11906841651727786d));
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.0432322944097698d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.913891279076611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4644733436666601d + "'", double1 == 0.4644733436666601d);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6441609899881241d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7182818247238476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891437141736505d + "'", double1 == 0.9891437141736505d);
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        double double1 = org.apache.commons.math.util.FastMath.sin((-38.131948329087294d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.419447390606458d) + "'", double1 == (-0.419447390606458d));
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0000000000000002d, 0.25488428787741324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3212259960962827d + "'", double2 == 1.3212259960962827d);
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8373983731296124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1098095317841823d) + "'", double1 == (-1.1098095317841823d));
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3022547416014814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0798250505610605d + "'", double1 == 1.0798250505610605d);
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.262122178163566E15d + "'", double1 == 2.262122178163566E15d);
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        double double1 = org.apache.commons.math.util.FastMath.sinh(46.2263037084224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.9538600730106995E19d + "'", double1 == 5.9538600730106995E19d);
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.3756233543023781d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.3010710787424613d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.43349402349577826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4334940234957783d + "'", double1 == 0.4334940234957783d);
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.8361432345018613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 32L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.3012989023072947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8998712981815272d) + "'", double1 == (-0.8998712981815272d));
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.896296018267969E13d, 6.78302841225571E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.896296018267967E13d + "'", double2 == 7.896296018267967E13d);
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.03927547481280818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2503189451462755d + "'", double1 == 2.2503189451462755d);
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        double double2 = org.apache.commons.math.util.FastMath.min(0.005656731589213857d, 0.32269275245300827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005656731589213857d + "'", double2 == 0.005656731589213857d);
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        double double2 = org.apache.commons.math.util.FastMath.min(1.448895063159511d, (-1.6162298357006117d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6162298357006117d) + "'", double2 == (-1.6162298357006117d));
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.3582216239154814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.358221623915482d + "'", double1 == 3.358221623915482d);
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5729347079345366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.379830211523892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3896127456026699d + "'", double1 == 0.3896127456026699d);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        double double1 = org.apache.commons.math.util.FastMath.atanh(36.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7316602644632267d), (-0.8414709848078964d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.425885360508611d) + "'", double2 == (-2.425885360508611d));
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-323.00518534745174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-18506.833881249884d) + "'", double1 == (-18506.833881249884d));
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9751446278717821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017019484439497464d + "'", double1 == 0.017019484439497464d);
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8294016629382825d), 9.079986011887159E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        double double1 = org.apache.commons.math.util.FastMath.acosh(31.984371183438945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158150094628595d + "'", double1 == 4.158150094628595d);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1195215262618592d + "'", double1 == 1.1195215262618592d);
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        double double2 = org.apache.commons.math.util.FastMath.max(0.930941044890651d, 0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.930941044890651d + "'", double2 == 0.930941044890651d);
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.06820006471439112d, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06820006471439113d + "'", double2 == 0.06820006471439113d);
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) '4', 2.262122178163566E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.00000000000001d + "'", double2 == 52.00000000000001d);
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5274728362673282d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9891437141736505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14748549792895108d + "'", double1 == 0.14748549792895108d);
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6137261894007203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5805593171817987d + "'", double1 == 0.5805593171817987d);
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.134890207766664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0653122583386827d + "'", double1 == 1.0653122583386827d);
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6865874069985795d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7734137622334678d + "'", double1 == 0.7734137622334678d);
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        float float2 = org.apache.commons.math.util.FastMath.min((-90.0f), (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.15151031285994174d), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1503666979359498d) + "'", double2 == (-0.1503666979359498d));
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.4862913247812135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8064012322901598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8966854678967096d + "'", double1 == 0.8966854678967096d);
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.018219144375279214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13497831075872602d + "'", double1 == 0.13497831075872602d);
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8166592361428845d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6848167883550325d) + "'", double1 == (-0.6848167883550325d));
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7791612621104443d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5412093449191896d) + "'", double1 == (-0.5412093449191896d));
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7577337065923179d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1877181244729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1877181244729043d + "'", double1 == 1.1877181244729043d);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.991318745538845d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 90L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 90.0f + "'", float1 == 90.0f);
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2130532941206642d, 0.7720875399559285d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0039823074904044d + "'", double2 == 1.0039823074904044d);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.7182819603591994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132617229916372d + "'", double1 == 1.3132617229916372d);
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.076738876852442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.978407872665517d + "'", double1 == 7.978407872665517d);
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.3978118125063327d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-90));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 90.0f + "'", float1 == 90.0f);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9033391074366519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.044149187845410116d) + "'", double1 == (-0.044149187845410116d));
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.931763225510739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5878687580950964d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.834573375909858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.759438473838613d) + "'", double1 == (-0.759438473838613d));
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.7219067166708868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6088496173769596d, 91.78724175669423d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.78724175669423d + "'", double2 == 91.78724175669423d);
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.834573375909858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5659403777711782d) + "'", double1 == (-0.5659403777711782d));
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0176055895227847d, (-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0176055895227845d + "'", double2 == 1.0176055895227845d);
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 90);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 90L + "'", long1 == 90L);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1552453009332422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5502488119936328d + "'", double1 == 0.5502488119936328d);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        int int1 = org.apache.commons.math.util.FastMath.round((-2.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9110895402590333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8170870323423696d + "'", double1 == 0.8170870323423696d);
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.0374464491245434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.053013441390233715d + "'", double1 == 0.053013441390233715d);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.012209562553744127d), (-0.6284217534373299d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6284217534373299d) + "'", double2 == (-0.6284217534373299d));
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        int int1 = org.apache.commons.math.util.FastMath.round(5507.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5507 + "'", int1 == 5507);
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0530637390494226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (short) 1, (-0.48674355529070396d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.023782649535268d + "'", double2 == 2.023782649535268d);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.0392740995950414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5988920145399181d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9135245975035817d) + "'", double1 == (-0.9135245975035817d));
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.851898262478877d, 0.18573988815053546d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8518982624788767d + "'", double2 == 3.8518982624788767d);
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        double double1 = org.apache.commons.math.util.FastMath.log(0.018219144375279214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0052823489951d) + "'", double1 == (-4.0052823489951d));
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        double double2 = org.apache.commons.math.util.FastMath.max(0.36787944117144233d, 2.132601058453798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.132601058453798d + "'", double2 == 2.132601058453798d);
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.053013441390233715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05165599792339188d + "'", double1 == 0.05165599792339188d);
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.004625338125320674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5661709721771937d + "'", double1 == 1.5661709721771937d);
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8631635751882506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7812347470298677d) + "'", double1 == (-0.7812347470298677d));
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.3561944901923444d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1694228248157563d) + "'", double1 == (-1.1694228248157563d));
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0d, (-2.267365292027d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2077088666181332d + "'", double2 == 0.2077088666181332d);
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.10955796484928035d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4312712619442752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.539213023249337d + "'", double1 == 1.539213023249337d);
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.267365292027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.5557490923207962d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1587235990851068d) + "'", double1 == (-1.1587235990851068d));
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2479614275509088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2479614275509088d + "'", double1 == 1.2479614275509088d);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.4802620430283604E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4802620430283604E-16d + "'", double1 == 2.4802620430283604E-16d);
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-27.876349504902667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.876349504902663d) + "'", double1 == (-27.876349504902663d));
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6019895799783384d, (-1.7385162236782312d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.397041808397797d + "'", double2 == 2.397041808397797d);
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.4802620430283604E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8166592361428845d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.044149187845410116d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04318879777708654d) + "'", double1 == (-0.04318879777708654d));
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7538347920505799d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-43.19155203462029d) + "'", double1 == (-43.19155203462029d));
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        double double2 = org.apache.commons.math.util.FastMath.atan2(16.86085826032837d, (-0.9821933800072388d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6289834386711253d + "'", double2 == 1.6289834386711253d);
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.496025759922821d), 0.8334224771468441d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.49602575992282094d) + "'", double2 == (-0.49602575992282094d));
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.830640877860784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6046661120266558d + "'", double1 == 0.6046661120266558d);
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4330001021490115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.359770220129362d + "'", double1 == 0.359770220129362d);
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7038211969154579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6471355894507849d + "'", double1 == 0.6471355894507849d);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        long long2 = org.apache.commons.math.util.FastMath.min((-33L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.4636005855219394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4636005855219394d + "'", double1 == 2.4636005855219394d);
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        double double2 = org.apache.commons.math.util.FastMath.min(0.25313651049314223d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25313651049314223d + "'", double2 == 0.25313651049314223d);
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.42581659714188025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9107017292651758d + "'", double1 == 0.9107017292651758d);
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9634526785268085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.674614424237458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7620587253843047d + "'", double1 == 2.7620587253843047d);
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.12048339341382165d), 1.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12048339341382164d) + "'", double2 == (-0.12048339341382164d));
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6154095886644868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5516730959931526d) + "'", double1 == (-0.5516730959931526d));
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745417862959511d) + "'", double1 == (-0.01745417862959511d));
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5812207450977618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        double double1 = org.apache.commons.math.util.FastMath.log10(89.99479755129386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9542174043274347d + "'", double1 == 1.9542174043274347d);
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.99999999999994d + "'", double1 == 89.99999999999994d);
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7899781221824803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10238493598423042d) + "'", double1 == (-0.10238493598423042d));
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.06549192716803806d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8867254579876315d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995120760870788d + "'", double1 == 0.9995120760870788d);
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6035270795055018d), 0.7734137622334678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7734137622334678d + "'", double2 == 0.7734137622334678d);
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7645662682374061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2280208110551356d + "'", double1 == 1.2280208110551356d);
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.35430360994810484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3469373133180005d + "'", double1 == 0.3469373133180005d);
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0926371180390901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9821279356034003d + "'", double1 == 1.9821279356034003d);
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        double double1 = org.apache.commons.math.util.FastMath.atan(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8466727901645837d), (-0.431145960437433d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.041795741632459d) + "'", double2 == (-2.041795741632459d));
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.437600971038334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-82.36846826440542d) + "'", double1 == (-82.36846826440542d));
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6212147412252023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7881717713958057d + "'", double1 == 0.7881717713958057d);
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1635528496768865d, 4.5012142829615005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2529602258630766d + "'", double2 == 0.2529602258630766d);
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.142599163434008d, 0.7820802611773309d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1098842226362917d + "'", double2 == 1.1098842226362917d);
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1877181244729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.829869827932433d + "'", double1 == 0.829869827932433d);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.9188537484079586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.918853748407959d + "'", double1 == 2.918853748407959d);
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 37L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 33, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5330785122775574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5330785122775574d + "'", double1 == 0.5330785122775574d);
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, 37.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.83569384937053d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8456633445388351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6632349739413136d + "'", double1 == 0.6632349739413136d);
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5440211108893698d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        double double2 = org.apache.commons.math.util.FastMath.min(9.079985961979837E-5d, 0.005403023058834883d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.079985961979837E-5d + "'", double2 == 9.079985961979837E-5d);
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.46749874460386d), 0.9735760889955918d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, 5507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.2227587494850775E-162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2227587494850775E-162d + "'", double1 == 2.2227587494850775E-162d);
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7577337065923179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8323541239940268d + "'", double1 == 0.8323541239940268d);
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7130376554537363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5098469822250609d) + "'", double1 == (-0.5098469822250609d));
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.46346031073593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 871.5850575920532d + "'", double1 == 871.5850575920532d);
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.228462604887648d, 0.017454178629595234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0035978893317443d + "'", double2 == 1.0035978893317443d);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.092783262284966d, (-1.995200412208242d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2291346864364843d + "'", double2 == 0.2291346864364843d);
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.017019484439497464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6633147175924029d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6157320800633225d) + "'", double1 == (-0.6157320800633225d));
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        long long2 = org.apache.commons.math.util.FastMath.max((-90L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5677239656717767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2458627722545559d) + "'", double1 == (-0.2458627722545559d));
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.560487413648653d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.0898120925088963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8683078057307718d + "'", double1 == 0.8683078057307718d);
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        double double1 = org.apache.commons.math.util.FastMath.atan(8.590466459908002E-72d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.590466459908002E-72d + "'", double1 == 8.590466459908002E-72d);
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7850009775214999d), 0.5246280046224637d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5246280046224637d + "'", double2 == 0.5246280046224637d);
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        double double2 = org.apache.commons.math.util.FastMath.pow((-33.0d), 0.6557942026326724d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0089148066056253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(45.0d, (-1.374102388374377E-9d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.99999999999999d + "'", double2 == 44.99999999999999d);
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0341909072993258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2286577832986674d + "'", double1 == 1.2286577832986674d);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6257710684000874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.44278822716643d + "'", double1 == 2.44278822716643d);
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9173172747640832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7423006914399841d + "'", double1 == 0.7423006914399841d);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.06549192716803806d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06558572392439851d) + "'", double1 == (-0.06558572392439851d));
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.17129545733050197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.171295457330502d + "'", double1 == 0.171295457330502d);
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.06558572392439851d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0656328345305126d) + "'", double1 == (-0.0656328345305126d));
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2022162221140908d, 0.10903143175231947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0202829181297208d + "'", double2 == 1.0202829181297208d);
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.359770220129362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4439747880964912d) + "'", double1 == (-0.4439747880964912d));
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.1034653645558015d, 11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.103465364555802d + "'", double2 == 2.103465364555802d);
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.3978118125063327d), 0.5330785122775574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3978118125063327d) + "'", double2 == (-0.3978118125063327d));
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.06669520249694419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0022249495956594d + "'", double1 == 1.0022249495956594d);
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.233403117511217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-70.66879307167105d) + "'", double1 == (-70.66879307167105d));
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4682955026240894d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3705561619927477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3152166151204571d + "'", double1 == 0.3152166151204571d);
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.6162298357006117d), 1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7470124028605071d) + "'", double2 == (-0.7470124028605071d));
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.010625904569068452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6088194853164001d) + "'", double1 == (-0.6088194853164001d));
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.743980336957493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.128438542496736d) + "'", double1 == (-0.128438542496736d));
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.49602575992282094d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 7.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8450980400142568d + "'", double1 == 0.8450980400142568d);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.3806633393658063d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.45739982021475745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47506901453650896d + "'", double1 == 0.47506901453650896d);
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7735460199712506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9179704868072519d) + "'", double1 == (-0.9179704868072519d));
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.465735902799727d + "'", double1 == 3.465735902799727d);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 33L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013276747223059479d) + "'", double1 == (-0.013276747223059479d));
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.900735886184545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7750770696059308d + "'", double1 == 1.7750770696059308d);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6637128698018219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.580829006249046d + "'", double1 == 0.580829006249046d);
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.11375468959206643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11400146268484936d) + "'", double1 == (-0.11400146268484936d));
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6631489452679061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6631489452679062d + "'", double1 == 0.6631489452679062d);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.492757420590521E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.492757420590521E-45d + "'", double1 == 6.492757420590521E-45d);
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        double double1 = org.apache.commons.math.util.FastMath.signum(37.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.17129545733050197d, (-0.1193499605547798d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2343900235798524d + "'", double2 == 1.2343900235798524d);
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        double double2 = org.apache.commons.math.util.FastMath.max(5507.000045396766d, (-0.11375468959206643d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5507.000045396766d + "'", double2 == 5507.000045396766d);
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.615354633267934E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.002774503742748542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0027745073023895317d + "'", double1 == 0.0027745073023895317d);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.855146420814098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8551464208140986d + "'", double1 == 2.8551464208140986d);
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0826779851380144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0268328847498687d + "'", double1 == 1.0268328847498687d);
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        float float2 = org.apache.commons.math.util.FastMath.max(33.0f, (float) 90);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4312712619442752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46145736838551815d + "'", double1 == 0.46145736838551815d);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7219067166708868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6705208933150383d) + "'", double1 == (-0.6705208933150383d));
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5404195002705842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1496153595671315d + "'", double1 == 1.1496153595671315d);
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        double double1 = org.apache.commons.math.util.FastMath.atan(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.7659219106381584E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847565194232731E-6d + "'", double1 == 1.5847565194232731E-6d);
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.35252977886304d) + "'", double1 == (-15.35252977886304d));
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        double double1 = org.apache.commons.math.util.FastMath.abs(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.9188537484079586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.994185913465727d + "'", double1 == 0.994185913465727d);
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4251878220010183d, 2.4221817809573358E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000085819143139d + "'", double2 == 1.0000085819143139d);
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6416439271862105d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.5802053839637672d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        double double1 = org.apache.commons.math.util.FastMath.asin(34.37746770784939d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.83569384937053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }
}

