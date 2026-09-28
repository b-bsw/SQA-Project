package org.mockito;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.hamcrest.Matcher<java.lang.Byte> byteMatcher0 = null;
        byte byte1 = org.mockito.Matchers.byteThat(byteMatcher0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str1 = org.mockito.Matchers.matches("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = org.mockito.Matchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str1 = org.mockito.Matchers.startsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.hamcrest.Matcher<java.lang.Double> doubleMatcher0 = null;
        double double1 = org.mockito.Matchers.doubleThat(doubleMatcher0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        short short1 = org.mockito.Matchers.eq((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.hamcrest.Matcher<java.lang.Character> charMatcher0 = null;
        char char1 = org.mockito.Matchers.charThat(charMatcher0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        float float1 = org.mockito.Matchers.eq((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        float float1 = org.mockito.Matchers.eq(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        char char0 = org.mockito.Matchers.anyChar();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        char char1 = org.mockito.Matchers.eq('a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Set set0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(set0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.Object obj0 = org.mockito.Matchers.isNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str0 = org.mockito.Matchers.anyString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        short short0 = org.mockito.Matchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Collection collection0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(collection0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.hamcrest.Matcher<java.lang.Boolean> booleanMatcher0 = null;
        boolean boolean1 = org.mockito.Matchers.booleanThat(booleanMatcher0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.Object obj0 = org.mockito.Matchers.notNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.reflect.Type type0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        boolean boolean0 = org.mockito.Matchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.Iterable iterable0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(iterable0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        byte byte0 = org.mockito.Matchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        float float0 = org.mockito.Matchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.hamcrest.Matcher<java.lang.Float> floatMatcher0 = null;
        float float1 = org.mockito.Matchers.floatThat(floatMatcher0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        boolean boolean1 = org.mockito.Matchers.eq(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.Object obj0 = org.mockito.Matchers.isNotNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.hamcrest.Matcher<java.lang.Integer> intMatcher0 = null;
        int int1 = org.mockito.Matchers.intThat(intMatcher0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        long long1 = org.mockito.Matchers.eq((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int int1 = org.mockito.Matchers.eq(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str1 = org.mockito.Matchers.endsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Matchers.same((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str1 = org.mockito.Matchers.contains("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        long long1 = org.mockito.Matchers.eq((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Collection collection0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(collection0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        float float1 = org.mockito.Matchers.eq((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int int1 = org.mockito.Matchers.eq((int) '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        float float1 = org.mockito.Matchers.eq((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str1 = org.mockito.Matchers.matches("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        boolean boolean1 = org.mockito.Matchers.eq(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        byte byte1 = org.mockito.Matchers.eq((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        double double1 = org.mockito.Matchers.eq((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        char char1 = org.mockito.Matchers.eq('#');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str1 = org.mockito.Matchers.same("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        long long1 = org.mockito.Matchers.eq((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        long long0 = org.mockito.Matchers.anyLong();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int int1 = org.mockito.Matchers.eq(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        short short1 = org.mockito.Matchers.eq((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.List list0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(list0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        long long1 = org.mockito.Matchers.eq((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int1 = org.mockito.Matchers.eq((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        long long1 = org.mockito.Matchers.eq((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        double double0 = org.mockito.Matchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.hamcrest.Matcher<java.lang.Short> shortMatcher0 = null;
        short short1 = org.mockito.Matchers.shortThat(shortMatcher0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Set set0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(set0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int int1 = org.mockito.Matchers.eq((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int1 = org.mockito.Matchers.eq((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.Object obj0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        long long1 = org.mockito.Matchers.eq(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.hamcrest.Matcher<java.lang.Long> longMatcher0 = null;
        long long1 = org.mockito.Matchers.longThat(longMatcher0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String str1 = org.mockito.Matchers.startsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Set set0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(set0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str1 = org.mockito.Matchers.contains("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String[] strArray0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(strArray0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.Iterable iterable0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(iterable0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        float float1 = org.mockito.Matchers.eq((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        short short1 = org.mockito.Matchers.eq((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.reflect.Type type0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String[] strArray0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(strArray0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.Object obj1 = org.mockito.Matchers.eq((java.lang.Object) 'a');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        char char1 = org.mockito.Matchers.eq('4');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        char char1 = org.mockito.Matchers.eq('\000');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.CharSequence charSequence1 = org.mockito.Matchers.same((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        byte byte1 = org.mockito.Matchers.eq((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        byte byte1 = org.mockito.Matchers.eq((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.io.Serializable serializable1 = org.mockito.Matchers.eq((java.io.Serializable) (byte) 10);
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        float float1 = org.mockito.Matchers.eq((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.io.Serializable serializable1 = org.mockito.Matchers.same((java.io.Serializable) 1.0f);
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.io.Serializable serializable0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.CharSequence charSequence0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.mockito.Matchers matchers0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(matchers0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int int1 = org.mockito.Matchers.eq((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        long long1 = org.mockito.Matchers.eq((long) '\000');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.io.Serializable serializable0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.String str0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.Class<?> wildcardClass0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        float float1 = org.mockito.Matchers.eq((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        long long1 = org.mockito.Matchers.eq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        byte byte1 = org.mockito.Matchers.eq((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int int1 = org.mockito.Matchers.eq((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double double1 = org.mockito.Matchers.eq((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        long long1 = org.mockito.Matchers.eq((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        float float1 = org.mockito.Matchers.eq((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        double double1 = org.mockito.Matchers.eq((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double1 = org.mockito.Matchers.eq((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.Class<?> wildcardClass0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        float float1 = org.mockito.Matchers.eq(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        float float1 = org.mockito.Matchers.eq(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int int1 = org.mockito.Matchers.eq((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.String str0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        long long1 = org.mockito.Matchers.eq((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = iterable1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        double double1 = org.mockito.Matchers.eq((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double double1 = org.mockito.Matchers.eq((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.CharSequence charSequence0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String str1 = org.mockito.Matchers.endsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.List list0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(list0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        float float1 = org.mockito.Matchers.eq((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String str0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        double double1 = org.mockito.Matchers.eq((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        byte byte1 = org.mockito.Matchers.eq((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.CharSequence charSequence1 = org.mockito.Matchers.eq((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.io.Serializable serializable1 = org.mockito.Matchers.eq((java.io.Serializable) 100.0d);
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int int1 = org.mockito.Matchers.eq((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = org.mockito.Matchers.same(strArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.List list0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(list0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int1 = org.mockito.Matchers.eq(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        float float1 = org.mockito.Matchers.eq((float) '\000');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double double1 = org.mockito.Matchers.eq((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.reflect.Type type3 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass1);
        java.lang.Class<?> wildcardClass4 = org.mockito.Matchers.eq(wildcardClass1);
        java.lang.reflect.Type type5 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass4);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        long long1 = org.mockito.Matchers.eq((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        double double1 = org.mockito.Matchers.eq((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        long long1 = org.mockito.Matchers.eq((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        short short1 = org.mockito.Matchers.eq((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.Collection collection3 = org.mockito.Matchers.same((java.util.Collection) list2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(collection3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.Iterable iterable0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(iterable0);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        short short1 = org.mockito.Matchers.eq((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int int1 = org.mockito.Matchers.eq((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        float float1 = org.mockito.Matchers.eq((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        float float1 = org.mockito.Matchers.eq((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        float float1 = org.mockito.Matchers.eq((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        double double1 = org.mockito.Matchers.eq((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        short short1 = org.mockito.Matchers.eq((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Map map0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(map0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.util.Set set9 = org.mockito.Matchers.refEq(set1, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = set9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(set9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double double1 = org.mockito.Matchers.eq((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.eq(set0);
        java.util.Collection collection4 = org.mockito.Matchers.eq((java.util.Collection) set3);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNull(collection4);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        char char1 = org.mockito.Matchers.eq(' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String str1 = org.mockito.Matchers.eq("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        org.mockito.Matchers matchers8 = org.mockito.Matchers.refEq(matchers0, strArray5);
        org.mockito.Matchers matchers9 = org.mockito.Matchers.eq(matchers8);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(matchers8);
        org.junit.Assert.assertNull(matchers9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        float float1 = org.mockito.Matchers.eq((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        double double1 = org.mockito.Matchers.eq((double) '\000');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        long long1 = org.mockito.Matchers.eq((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        long long1 = org.mockito.Matchers.eq((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = set2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.eq(matchers0);
        org.mockito.Matchers matchers2 = org.mockito.Matchers.eq(matchers1);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNull(matchers2);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Map map4 = org.mockito.Matchers.refEq(map0, strArray3);
        java.util.Map map5 = org.mockito.Matchers.same(map4);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNull(map5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        float float1 = org.mockito.Matchers.eq((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String str9 = org.mockito.Matchers.refEq("hi!", strArray7);
        java.lang.String[] strArray10 = null;
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.CharSequence charSequence17 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray15);
        java.lang.String[] strArray18 = org.mockito.Matchers.refEq(strArray10, strArray15);
        java.lang.String[] strArray19 = org.mockito.Matchers.refEq(strArray7, strArray15);
        java.lang.Object obj20 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray7);
        java.io.Serializable serializable21 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = serializable21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(serializable21);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq(charSequence1, strArray6);
        java.util.Map map10 = org.mockito.Matchers.refEq(map0, strArray6);
        java.lang.Class<?> wildcardClass11 = map0.getClass();
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq(charSequence1, strArray6);
        java.util.Map map10 = org.mockito.Matchers.refEq(map0, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = map10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(map10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.lang.Class<?> wildcardClass1 = collection0.getClass();
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        double double1 = org.mockito.Matchers.eq((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Matchers.same((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        double double1 = org.mockito.Matchers.eq((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Set set1 = org.mockito.Matchers.anySet();
        java.util.Set set2 = org.mockito.Matchers.eq(set1);
        java.util.Set set3 = org.mockito.Matchers.same(set1);
        java.util.Set set4 = org.mockito.Matchers.eq(set1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable9 = org.mockito.Matchers.refEq((java.lang.Iterable) set1, strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.same(strArray8);
        java.lang.Comparable<java.lang.String> strComparable11 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "", strArray10);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNull(set4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double double1 = org.mockito.Matchers.eq((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Map map4 = org.mockito.Matchers.refEq(map0, strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = map4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map4);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        float float1 = org.mockito.Matchers.eq((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.mockito.Matchers matchers0 = null;
        org.mockito.Matchers matchers1 = org.mockito.Matchers.eq(matchers0);
        org.junit.Assert.assertNull(matchers1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.List list3 = org.mockito.Matchers.eq(list2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        float float1 = org.mockito.Matchers.eq(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        short short1 = org.mockito.Matchers.eq((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Map map0 = null;
        java.util.Map map1 = org.mockito.Matchers.same(map0);
        org.junit.Assert.assertNull(map1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int1 = org.mockito.Matchers.eq((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.util.Map map0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(map0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int int1 = org.mockito.Matchers.eq((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.String[] strArray8 = null;
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray13);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray8, strArray13);
        java.lang.String[] strArray17 = org.mockito.Matchers.refEq(strArray5, strArray13);
        java.lang.Object obj18 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = obj18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        double double1 = org.mockito.Matchers.eq(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Matchers.eq((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        double double1 = org.mockito.Matchers.eq((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        double double1 = org.mockito.Matchers.eq(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.lang.Iterable iterable1 = org.mockito.Matchers.same((java.lang.Iterable) collection0);
        java.util.Collection collection2 = org.mockito.Matchers.same(collection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = collection2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(collection2);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.Map map0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(map0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.CharSequence charSequence1 = org.mockito.Matchers.same((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.String str1 = org.mockito.Matchers.same("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Collection collection0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(collection0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Map map4 = org.mockito.Matchers.refEq(map0, strArray3);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map0, strArray11);
        java.util.Map map13 = org.mockito.Matchers.eq(map12);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(map13);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        long long1 = org.mockito.Matchers.eq((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        short short1 = org.mockito.Matchers.eq((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        long long1 = org.mockito.Matchers.eq((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        double double1 = org.mockito.Matchers.eq((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.Collection collection3 = org.mockito.Matchers.same((java.util.Collection) list2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(collection3);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        float float1 = org.mockito.Matchers.eq((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        long long1 = org.mockito.Matchers.eq(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        float float1 = org.mockito.Matchers.eq((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        float float1 = org.mockito.Matchers.eq((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        float float1 = org.mockito.Matchers.eq((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.Class<?> wildcardClass0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        double double1 = org.mockito.Matchers.eq((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int int1 = org.mockito.Matchers.eq(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        float float1 = org.mockito.Matchers.eq((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        short short1 = org.mockito.Matchers.eq((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        float float1 = org.mockito.Matchers.eq((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.lang.Iterable iterable1 = org.mockito.Matchers.same((java.lang.Iterable) collection0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = iterable1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNull(iterable1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        long long1 = org.mockito.Matchers.eq((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.String str1 = org.mockito.Matchers.eq("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        double double1 = org.mockito.Matchers.eq((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double double1 = org.mockito.Matchers.eq((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.Object obj0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.List list3 = org.mockito.Matchers.same(list2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = strArray16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int int1 = org.mockito.Matchers.eq((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Collection collection2 = org.mockito.Matchers.same((java.util.Collection) set0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = collection2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(collection2);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        double double1 = org.mockito.Matchers.eq((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.mockito.Matchers matchers0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(matchers0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.reflect.Type type0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = matchers1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(matchers1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.String[] strArray0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(strArray0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String[] strArray0 = null;
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.CharSequence charSequence7 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray5);
        java.lang.String[] strArray8 = org.mockito.Matchers.refEq(strArray0, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = strArray8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) '#');
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable4 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray3);
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.Type type7 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass6);
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.String str14 = org.mockito.Matchers.refEq("hi!", strArray12);
        java.lang.String[] strArray15 = null;
        java.util.Map map17 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Map map21 = org.mockito.Matchers.refEq(map17, strArray20);
        java.lang.CharSequence charSequence22 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray20);
        java.lang.String[] strArray23 = org.mockito.Matchers.refEq(strArray15, strArray20);
        java.lang.String[] strArray24 = org.mockito.Matchers.refEq(strArray12, strArray20);
        java.lang.reflect.Type type25 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass6, strArray20);
        java.lang.String[] strArray26 = org.mockito.Matchers.refEq(strArray3, strArray20);
        java.lang.String[] strArray27 = org.mockito.Matchers.eq(strArray26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(type25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(strArray27);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.util.List list2 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass3 = list2.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass3);
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Map map9 = org.mockito.Matchers.refEq(map5, strArray8);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map17 = org.mockito.Matchers.refEq(map5, strArray16);
        java.lang.reflect.AnnotatedElement annotatedElement18 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass3, strArray16);
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray16);
        java.util.Set set20 = org.mockito.Matchers.anySet();
        java.util.Set set21 = org.mockito.Matchers.eq(set20);
        java.util.Set set22 = org.mockito.Matchers.same(set20);
        java.util.Set set23 = org.mockito.Matchers.eq(set20);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable28 = org.mockito.Matchers.refEq((java.lang.Iterable) set20, strArray27);
        java.lang.String[] strArray29 = org.mockito.Matchers.same(strArray27);
        java.lang.reflect.AnnotatedElement annotatedElement30 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) genericDeclaration19, strArray29);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(genericDeclaration4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(annotatedElement18);
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(set21);
        org.junit.Assert.assertNull(set22);
        org.junit.Assert.assertNull(set23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNull(annotatedElement30);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int1 = org.mockito.Matchers.eq((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Collection collection4 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Collection collection5 = org.mockito.Matchers.eq(collection4);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(collection5);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        long long1 = org.mockito.Matchers.eq((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.eq(set0);
        java.util.Collection collection4 = org.mockito.Matchers.same((java.util.Collection) set3);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNull(collection4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.io.Serializable serializable1 = org.mockito.Matchers.same((java.io.Serializable) 1);
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.eq(set0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable8 = org.mockito.Matchers.refEq((java.lang.Iterable) set0, strArray7);
        java.lang.String[] strArray9 = org.mockito.Matchers.same(strArray7);
        java.lang.Object obj10 = org.mockito.Matchers.same((java.lang.Object) strArray9);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        float float1 = org.mockito.Matchers.eq((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Set set4 = org.mockito.Matchers.eq(set0);
        java.util.Set set5 = org.mockito.Matchers.eq(set4);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(set4);
        org.junit.Assert.assertNull(set5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map3, strArray14);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray14);
        java.io.Serializable serializable17 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass1);
        java.lang.reflect.Type type18 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement19 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement20 = org.mockito.Matchers.eq(annotatedElement19);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(annotatedElement16);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertNull(annotatedElement19);
        org.junit.Assert.assertNull(annotatedElement20);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.CharSequence charSequence6 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray4);
        java.util.Set set7 = org.mockito.Matchers.anySet();
        java.util.Set set8 = org.mockito.Matchers.eq(set7);
        java.lang.Iterable iterable9 = org.mockito.Matchers.same((java.lang.Iterable) set7);
        java.util.List list10 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass11 = list10.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass11);
        java.util.Map map13 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Map map17 = org.mockito.Matchers.refEq(map13, strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map25 = org.mockito.Matchers.refEq(map13, strArray24);
        java.lang.reflect.AnnotatedElement annotatedElement26 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass11, strArray24);
        java.util.Collection collection27 = org.mockito.Matchers.refEq((java.util.Collection) set7, strArray24);
        java.util.Set set28 = org.mockito.Matchers.anySet();
        java.util.Set set29 = org.mockito.Matchers.eq(set28);
        java.util.Set set30 = org.mockito.Matchers.same(set28);
        java.util.Set set31 = org.mockito.Matchers.eq(set28);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable36 = org.mockito.Matchers.refEq((java.lang.Iterable) set28, strArray35);
        java.lang.String[] strArray37 = org.mockito.Matchers.same(strArray35);
        java.lang.Object obj38 = org.mockito.Matchers.refEq((java.lang.Object) strArray24, strArray37);
        java.lang.String[] strArray39 = org.mockito.Matchers.refEq(strArray4, strArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass40 = strArray39.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(set8);
        org.junit.Assert.assertNull(iterable9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(genericDeclaration12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNull(annotatedElement26);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(set29);
        org.junit.Assert.assertNull(set30);
        org.junit.Assert.assertNull(set31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(strArray39);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable4 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray3);
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.Type type7 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass6);
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.String str14 = org.mockito.Matchers.refEq("hi!", strArray12);
        java.lang.String[] strArray15 = null;
        java.util.Map map17 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Map map21 = org.mockito.Matchers.refEq(map17, strArray20);
        java.lang.CharSequence charSequence22 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray20);
        java.lang.String[] strArray23 = org.mockito.Matchers.refEq(strArray15, strArray20);
        java.lang.String[] strArray24 = org.mockito.Matchers.refEq(strArray12, strArray20);
        java.lang.reflect.Type type25 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass6, strArray20);
        java.lang.String[] strArray26 = org.mockito.Matchers.refEq(strArray3, strArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = strArray26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(type25);
        org.junit.Assert.assertNull(strArray26);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        double double1 = org.mockito.Matchers.eq(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        long long1 = org.mockito.Matchers.eq((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int int1 = org.mockito.Matchers.eq((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.io.Serializable serializable0 = null;
        java.io.Serializable serializable1 = org.mockito.Matchers.same(serializable0);
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int1 = org.mockito.Matchers.eq((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        org.mockito.Matchers matchers8 = org.mockito.Matchers.refEq(matchers0, strArray5);
        java.lang.Class<?> wildcardClass9 = matchers0.getClass();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(matchers8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.CharSequence charSequence6 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray4);
        java.util.Set set7 = org.mockito.Matchers.anySet();
        java.util.Set set8 = org.mockito.Matchers.eq(set7);
        java.lang.Iterable iterable9 = org.mockito.Matchers.same((java.lang.Iterable) set7);
        java.util.List list10 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass11 = list10.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass11);
        java.util.Map map13 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Map map17 = org.mockito.Matchers.refEq(map13, strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map25 = org.mockito.Matchers.refEq(map13, strArray24);
        java.lang.reflect.AnnotatedElement annotatedElement26 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass11, strArray24);
        java.util.Collection collection27 = org.mockito.Matchers.refEq((java.util.Collection) set7, strArray24);
        java.util.Set set28 = org.mockito.Matchers.anySet();
        java.util.Set set29 = org.mockito.Matchers.eq(set28);
        java.util.Set set30 = org.mockito.Matchers.same(set28);
        java.util.Set set31 = org.mockito.Matchers.eq(set28);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable36 = org.mockito.Matchers.refEq((java.lang.Iterable) set28, strArray35);
        java.lang.String[] strArray37 = org.mockito.Matchers.same(strArray35);
        java.lang.Object obj38 = org.mockito.Matchers.refEq((java.lang.Object) strArray24, strArray37);
        java.lang.String[] strArray39 = org.mockito.Matchers.refEq(strArray4, strArray24);
        java.lang.Class<?> wildcardClass40 = strArray24.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(set8);
        org.junit.Assert.assertNull(iterable9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(genericDeclaration12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNull(annotatedElement26);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(set29);
        org.junit.Assert.assertNull(set30);
        org.junit.Assert.assertNull(set31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        double double1 = org.mockito.Matchers.eq((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map30 = org.mockito.Matchers.refEq(map18, strArray29);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass17, strArray29);
        java.lang.Object obj32 = org.mockito.Matchers.same((java.lang.Object) genericDeclaration31);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.mockito.Matchers matchers0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(matchers0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int int1 = org.mockito.Matchers.eq((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.Set set0 = null;
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        org.junit.Assert.assertNull(set1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map30 = org.mockito.Matchers.refEq(map18, strArray29);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass17, strArray29);
        java.util.Set set32 = org.mockito.Matchers.anySet();
        java.util.Set set33 = org.mockito.Matchers.eq(set32);
        java.lang.Iterable iterable34 = org.mockito.Matchers.same((java.lang.Iterable) set32);
        java.util.List list35 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass36 = list35.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration37 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass36);
        java.util.Map map38 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.Map map42 = org.mockito.Matchers.refEq(map38, strArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map50 = org.mockito.Matchers.refEq(map38, strArray49);
        java.lang.reflect.AnnotatedElement annotatedElement51 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass36, strArray49);
        java.util.Collection collection52 = org.mockito.Matchers.refEq((java.util.Collection) set32, strArray49);
        java.io.Serializable serializable53 = org.mockito.Matchers.same((java.io.Serializable) strArray49);
        java.lang.Class<?> wildcardClass54 = org.mockito.Matchers.refEq(wildcardClass17, strArray49);
        java.lang.Class<?> wildcardClass55 = strArray49.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(set33);
        org.junit.Assert.assertNull(iterable34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(genericDeclaration37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(annotatedElement51);
        org.junit.Assert.assertNull(collection52);
        org.junit.Assert.assertNull(serializable53);
        org.junit.Assert.assertNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        short short1 = org.mockito.Matchers.eq((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String str9 = org.mockito.Matchers.refEq("hi!", strArray7);
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray7);
        java.util.List list11 = org.mockito.Matchers.anyList();
        java.util.Collection collection12 = org.mockito.Matchers.eq((java.util.Collection) list11);
        java.lang.Class<?> wildcardClass13 = list11.getClass();
        java.lang.reflect.Type type14 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass13);
        org.mockito.Matchers matchers15 = new org.mockito.Matchers();
        org.mockito.Matchers matchers16 = org.mockito.Matchers.same(matchers15);
        java.util.Map map17 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Map map21 = org.mockito.Matchers.refEq(map17, strArray20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map29 = org.mockito.Matchers.refEq(map17, strArray28);
        org.mockito.Matchers matchers30 = org.mockito.Matchers.refEq(matchers15, strArray28);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass13, strArray28);
        java.io.Serializable serializable32 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray28);
        org.mockito.Matchers matchers33 = org.mockito.Matchers.refEq(matchers0, strArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass34 = matchers33.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(matchers16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNull(matchers30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNull(serializable32);
        org.junit.Assert.assertNull(matchers33);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq(charSequence1, strArray6);
        java.util.Map map10 = org.mockito.Matchers.refEq(map0, strArray6);
        java.util.Map map11 = org.mockito.Matchers.same(map10);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(map11);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray5);
        java.util.List list9 = org.mockito.Matchers.anyList();
        java.util.Collection collection10 = org.mockito.Matchers.eq((java.util.Collection) list9);
        java.lang.Class<?> wildcardClass11 = list9.getClass();
        java.lang.reflect.Type type12 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass11);
        org.mockito.Matchers matchers13 = new org.mockito.Matchers();
        org.mockito.Matchers matchers14 = org.mockito.Matchers.same(matchers13);
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map15, strArray26);
        org.mockito.Matchers matchers28 = org.mockito.Matchers.refEq(matchers13, strArray26);
        java.lang.reflect.GenericDeclaration genericDeclaration29 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass11, strArray26);
        java.io.Serializable serializable30 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = serializable30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(matchers14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(matchers28);
        org.junit.Assert.assertNull(genericDeclaration29);
        org.junit.Assert.assertNull(serializable30);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.io.Serializable serializable0 = org.mockito.Matchers.any();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map30 = org.mockito.Matchers.refEq(map18, strArray29);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass17, strArray29);
        java.util.Set set32 = org.mockito.Matchers.anySet();
        java.util.Set set33 = org.mockito.Matchers.eq(set32);
        java.lang.Iterable iterable34 = org.mockito.Matchers.same((java.lang.Iterable) set32);
        java.util.List list35 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass36 = list35.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration37 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass36);
        java.util.Map map38 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.Map map42 = org.mockito.Matchers.refEq(map38, strArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map50 = org.mockito.Matchers.refEq(map38, strArray49);
        java.lang.reflect.AnnotatedElement annotatedElement51 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass36, strArray49);
        java.util.Collection collection52 = org.mockito.Matchers.refEq((java.util.Collection) set32, strArray49);
        java.io.Serializable serializable53 = org.mockito.Matchers.same((java.io.Serializable) strArray49);
        java.lang.Class<?> wildcardClass54 = org.mockito.Matchers.refEq(wildcardClass17, strArray49);
        java.lang.reflect.GenericDeclaration genericDeclaration55 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass54);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(set33);
        org.junit.Assert.assertNull(iterable34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(genericDeclaration37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(annotatedElement51);
        org.junit.Assert.assertNull(collection52);
        org.junit.Assert.assertNull(serializable53);
        org.junit.Assert.assertNull(wildcardClass54);
        org.junit.Assert.assertNull(genericDeclaration55);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        long long1 = org.mockito.Matchers.eq((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        double double1 = org.mockito.Matchers.eq((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.eq(matchers0);
        java.lang.String[] strArray2 = null;
        org.mockito.Matchers matchers3 = org.mockito.Matchers.refEq(matchers1, strArray2);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNull(matchers3);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.io.Serializable serializable1 = org.mockito.Matchers.same((java.io.Serializable) "");
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        float float1 = org.mockito.Matchers.eq((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.same(set0);
        java.util.Set set2 = org.mockito.Matchers.eq(set1);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq(charSequence1, strArray6);
        java.util.Map map10 = org.mockito.Matchers.refEq(map0, strArray6);
        java.util.Map map11 = org.mockito.Matchers.eq(map10);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(map11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        double double1 = org.mockito.Matchers.eq((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        double double1 = org.mockito.Matchers.eq((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        float float1 = org.mockito.Matchers.eq((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.util.List list2 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass3 = list2.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass3);
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Map map9 = org.mockito.Matchers.refEq(map5, strArray8);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map17 = org.mockito.Matchers.refEq(map5, strArray16);
        java.lang.reflect.AnnotatedElement annotatedElement18 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass3, strArray16);
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = genericDeclaration19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(genericDeclaration4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(annotatedElement18);
        org.junit.Assert.assertNull(genericDeclaration19);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) 100);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map2, strArray13);
        org.mockito.Matchers matchers15 = org.mockito.Matchers.refEq(matchers0, strArray13);
        java.lang.String[] strArray16 = null;
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.CharSequence charSequence23 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray21);
        java.lang.String[] strArray24 = org.mockito.Matchers.refEq(strArray16, strArray21);
        org.mockito.Matchers matchers25 = org.mockito.Matchers.refEq(matchers15, strArray24);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(matchers25);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        double double1 = org.mockito.Matchers.eq((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.List list1 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray11 = org.mockito.Matchers.same(strArray10);
        java.io.Serializable serializable12 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass2, strArray10);
        java.lang.Object obj13 = org.mockito.Matchers.refEq((java.lang.Object) false, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        long long1 = org.mockito.Matchers.eq((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.mockito.Matchers.refEq("", strArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Map map4 = org.mockito.Matchers.refEq(map0, strArray3);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map0, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = map12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map12);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.Collection collection0 = null;
        java.util.Collection collection1 = org.mockito.Matchers.same(collection0);
        org.junit.Assert.assertNull(collection1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.CharSequence charSequence1 = org.mockito.Matchers.eq((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.eq(set0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable8 = org.mockito.Matchers.refEq((java.lang.Iterable) set0, strArray7);
        java.lang.Object obj9 = org.mockito.Matchers.same((java.lang.Object) iterable8);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.CharSequence charSequence7 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray5);
        java.io.Serializable serializable8 = org.mockito.Matchers.refEq((java.io.Serializable) 100.0f, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = serializable8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray10 = org.mockito.Matchers.same(strArray9);
        java.io.Serializable serializable11 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass1, strArray9);
        java.lang.reflect.Type type12 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.Type type13 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.Type type14 = org.mockito.Matchers.same(type13);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(type14);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map3, strArray14);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray14);
        java.io.Serializable serializable17 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass1);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable22 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray21);
        java.lang.reflect.GenericDeclaration genericDeclaration23 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = genericDeclaration23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(annotatedElement16);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable22);
        org.junit.Assert.assertNull(genericDeclaration23);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        org.mockito.Matchers matchers8 = org.mockito.Matchers.refEq(matchers0, strArray5);
        org.mockito.Matchers matchers9 = org.mockito.Matchers.eq(matchers0);
        org.mockito.Matchers matchers10 = org.mockito.Matchers.eq(matchers9);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(matchers8);
        org.junit.Assert.assertNull(matchers9);
        org.junit.Assert.assertNull(matchers10);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.lang.Iterable iterable1 = org.mockito.Matchers.same((java.lang.Iterable) collection0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.eq(iterable1);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(iterable2);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = null;
        java.lang.reflect.GenericDeclaration genericDeclaration1 = org.mockito.Matchers.same(genericDeclaration0);
        org.junit.Assert.assertNull(genericDeclaration1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.eq(set0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable8 = org.mockito.Matchers.refEq((java.lang.Iterable) set0, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = iterable8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Collection collection4 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.lang.Object obj5 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.util.Set set6 = org.mockito.Matchers.eq(set0);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.CharSequence charSequence13 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray11);
        java.util.Set set14 = org.mockito.Matchers.anySet();
        java.util.Set set15 = org.mockito.Matchers.eq(set14);
        java.lang.Iterable iterable16 = org.mockito.Matchers.same((java.lang.Iterable) set14);
        java.util.List list17 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass18 = list17.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass18);
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map32 = org.mockito.Matchers.refEq(map20, strArray31);
        java.lang.reflect.AnnotatedElement annotatedElement33 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass18, strArray31);
        java.util.Collection collection34 = org.mockito.Matchers.refEq((java.util.Collection) set14, strArray31);
        java.util.Set set35 = org.mockito.Matchers.anySet();
        java.util.Set set36 = org.mockito.Matchers.eq(set35);
        java.util.Set set37 = org.mockito.Matchers.same(set35);
        java.util.Set set38 = org.mockito.Matchers.eq(set35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable43 = org.mockito.Matchers.refEq((java.lang.Iterable) set35, strArray42);
        java.lang.String[] strArray44 = org.mockito.Matchers.same(strArray42);
        java.lang.Object obj45 = org.mockito.Matchers.refEq((java.lang.Object) strArray31, strArray44);
        java.lang.String[] strArray46 = org.mockito.Matchers.refEq(strArray11, strArray31);
        java.lang.Object obj47 = org.mockito.Matchers.refEq((java.lang.Object) set0, strArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass48 = obj47.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(set6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(set15);
        org.junit.Assert.assertNull(iterable16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(annotatedElement33);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(set36);
        org.junit.Assert.assertNull(set37);
        org.junit.Assert.assertNull(set38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        float float1 = org.mockito.Matchers.eq((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map30 = org.mockito.Matchers.refEq(map18, strArray29);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass17, strArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass32 = genericDeclaration31.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(genericDeclaration31);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.io.Serializable serializable1 = org.mockito.Matchers.eq((java.io.Serializable) 1.0d);
        org.junit.Assert.assertNull(serializable1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = org.mockito.Matchers.same(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass1);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String str9 = org.mockito.Matchers.refEq("hi!", strArray7);
        java.lang.String[] strArray10 = null;
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.CharSequence charSequence17 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray15);
        java.lang.String[] strArray18 = org.mockito.Matchers.refEq(strArray10, strArray15);
        java.lang.String[] strArray19 = org.mockito.Matchers.refEq(strArray7, strArray15);
        java.lang.reflect.Type type20 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray15);
        java.lang.Class<?> wildcardClass21 = org.mockito.Matchers.same(wildcardClass1);
        java.lang.reflect.Type type22 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass21);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(type20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(type22);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass1);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String str9 = org.mockito.Matchers.refEq("hi!", strArray7);
        java.lang.String[] strArray10 = null;
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.CharSequence charSequence17 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray15);
        java.lang.String[] strArray18 = org.mockito.Matchers.refEq(strArray10, strArray15);
        java.lang.String[] strArray19 = org.mockito.Matchers.refEq(strArray7, strArray15);
        java.lang.reflect.Type type20 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = type20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(type20);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.lang.Iterable iterable3 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = iterable3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(iterable3);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable4 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray3);
        java.lang.String[] strArray5 = org.mockito.Matchers.eq(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = strArray5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.util.Collection collection0 = null;
        java.util.Collection collection1 = org.mockito.Matchers.eq(collection0);
        org.junit.Assert.assertNull(collection1);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.mockito.Matchers.eq(wildcardClass1);
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(genericDeclaration3);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.eq(set0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable8 = org.mockito.Matchers.refEq((java.lang.Iterable) set0, strArray7);
        java.lang.String[] strArray9 = org.mockito.Matchers.same(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strArray9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        long long1 = org.mockito.Matchers.eq(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        double double1 = org.mockito.Matchers.eq((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = org.mockito.Matchers.same(type0);
        org.junit.Assert.assertNull(type1);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.same(set0);
        java.util.Collection collection2 = org.mockito.Matchers.eq((java.util.Collection) set1);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(collection2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map2, strArray13);
        org.mockito.Matchers matchers15 = org.mockito.Matchers.refEq(matchers0, strArray13);
        org.mockito.Matchers matchers16 = org.mockito.Matchers.eq(matchers0);
        org.mockito.Matchers matchers17 = org.mockito.Matchers.same(matchers16);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNull(matchers16);
        org.junit.Assert.assertNull(matchers17);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Set set4 = org.mockito.Matchers.eq(set0);
        java.util.Collection collection5 = org.mockito.Matchers.eq((java.util.Collection) set4);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(set4);
        org.junit.Assert.assertNull(collection5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = iterable2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(iterable2);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map2, strArray13);
        org.mockito.Matchers matchers15 = org.mockito.Matchers.refEq(matchers0, strArray13);
        java.lang.Class<?> wildcardClass16 = strArray13.getClass();
        java.io.Serializable serializable17 = org.mockito.Matchers.same((java.io.Serializable) strArray13);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(serializable17);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        double double1 = org.mockito.Matchers.eq((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.lang.Class<?> wildcardClass18 = org.mockito.Matchers.same(wildcardClass17);
        java.lang.Class<?> wildcardClass19 = org.mockito.Matchers.eq(wildcardClass17);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(wildcardClass19);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Collection collection2 = org.mockito.Matchers.eq((java.util.Collection) set1);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(collection2);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.Class<?> wildcardClass2 = org.mockito.Matchers.same(wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(annotatedElement3);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.util.List list2 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass3 = list2.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass3);
        java.lang.reflect.Type type5 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass3);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.util.Map map11 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map11, strArray14);
        java.lang.String str16 = org.mockito.Matchers.refEq("hi!", strArray14);
        java.lang.String[] strArray17 = null;
        java.util.Map map19 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Map map23 = org.mockito.Matchers.refEq(map19, strArray22);
        java.lang.CharSequence charSequence24 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray22);
        java.lang.String[] strArray25 = org.mockito.Matchers.refEq(strArray17, strArray22);
        java.lang.String[] strArray26 = org.mockito.Matchers.refEq(strArray14, strArray22);
        java.lang.Object obj27 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray14);
        java.io.Serializable serializable28 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass8, strArray14);
        java.lang.String str29 = org.mockito.Matchers.refEq("", strArray14);
        java.lang.Class<?> wildcardClass30 = org.mockito.Matchers.refEq(wildcardClass3, strArray14);
        java.lang.Iterable iterable31 = org.mockito.Matchers.refEq(iterable1, strArray14);
        java.lang.String[] strArray32 = org.mockito.Matchers.eq(strArray14);
        java.lang.Class<?> wildcardClass33 = strArray14.getClass();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(genericDeclaration4);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(serializable28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNull(iterable31);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        double double1 = org.mockito.Matchers.eq((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.reflect.Type type6 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass4);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.String str17 = org.mockito.Matchers.refEq("hi!", strArray15);
        java.lang.String[] strArray18 = null;
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.CharSequence charSequence25 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray23);
        java.lang.String[] strArray26 = org.mockito.Matchers.refEq(strArray18, strArray23);
        java.lang.String[] strArray27 = org.mockito.Matchers.refEq(strArray15, strArray23);
        java.lang.Object obj28 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray15);
        java.io.Serializable serializable29 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass9, strArray15);
        java.lang.String str30 = org.mockito.Matchers.refEq("", strArray15);
        java.lang.Class<?> wildcardClass31 = org.mockito.Matchers.refEq(wildcardClass4, strArray15);
        java.util.Set set32 = org.mockito.Matchers.refEq(set0, strArray15);
        java.util.List list34 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass35 = list34.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration36 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray44 = org.mockito.Matchers.same(strArray43);
        java.io.Serializable serializable45 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass35, strArray43);
        java.lang.Object obj46 = org.mockito.Matchers.refEq((java.lang.Object) false, strArray43);
        java.util.Set set47 = org.mockito.Matchers.refEq(set0, strArray43);
        java.util.Set set48 = org.mockito.Matchers.eq(set47);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNull(set32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(genericDeclaration36);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(serializable45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(set47);
        org.junit.Assert.assertNull(set48);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.lang.Iterable iterable3 = org.mockito.Matchers.eq((java.lang.Iterable) list2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(iterable3);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map1 = org.mockito.Matchers.eq(map0);
        org.mockito.Matchers matchers2 = new org.mockito.Matchers();
        org.mockito.Matchers matchers3 = org.mockito.Matchers.same(matchers2);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.CharSequence charSequence11 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.io.Serializable serializable12 = org.mockito.Matchers.refEq((java.io.Serializable) 100.0f, strArray9);
        org.mockito.Matchers matchers13 = org.mockito.Matchers.refEq(matchers3, strArray9);
        java.util.Map map14 = org.mockito.Matchers.refEq(map0, strArray9);
        java.util.List list15 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass16 = list15.getClass();
        java.lang.reflect.Type type17 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass16);
        java.util.Map map19 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Map map23 = org.mockito.Matchers.refEq(map19, strArray22);
        java.lang.String str24 = org.mockito.Matchers.refEq("hi!", strArray22);
        java.lang.String[] strArray25 = null;
        java.util.Map map27 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.Map map31 = org.mockito.Matchers.refEq(map27, strArray30);
        java.lang.CharSequence charSequence32 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray30);
        java.lang.String[] strArray33 = org.mockito.Matchers.refEq(strArray25, strArray30);
        java.lang.String[] strArray34 = org.mockito.Matchers.refEq(strArray22, strArray30);
        java.lang.reflect.Type type35 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass16, strArray30);
        java.io.Serializable serializable36 = org.mockito.Matchers.same((java.io.Serializable) strArray30);
        java.lang.String[] strArray37 = org.mockito.Matchers.refEq(strArray9, strArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass38 = strArray37.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(matchers3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNull(matchers13);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(type17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNull(charSequence32);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNull(type35);
        org.junit.Assert.assertNull(serializable36);
        org.junit.Assert.assertNull(strArray37);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray10 = org.mockito.Matchers.same(strArray9);
        java.io.Serializable serializable11 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass1, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = serializable11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(serializable11);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String str12 = org.mockito.Matchers.refEq("hi!", strArray10);
        java.lang.String[] strArray13 = null;
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.CharSequence charSequence20 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray18);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray13, strArray18);
        java.lang.String[] strArray22 = org.mockito.Matchers.refEq(strArray10, strArray18);
        java.lang.Object obj23 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray10);
        java.io.Serializable serializable24 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass4, strArray10);
        java.lang.String str25 = org.mockito.Matchers.refEq("", strArray10);
        java.util.Map map27 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.Map map31 = org.mockito.Matchers.refEq(map27, strArray30);
        java.lang.String str32 = org.mockito.Matchers.refEq("hi!", strArray30);
        java.lang.String[] strArray33 = org.mockito.Matchers.refEq(strArray10, strArray30);
        java.lang.Class<?> wildcardClass34 = org.mockito.Matchers.refEq(wildcardClass1, strArray33);
        java.util.List list35 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass36 = list35.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration37 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass36);
        java.util.Map map38 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.Map map42 = org.mockito.Matchers.refEq(map38, strArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map50 = org.mockito.Matchers.refEq(map38, strArray49);
        java.lang.reflect.AnnotatedElement annotatedElement51 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass36, strArray49);
        java.lang.reflect.AnnotatedElement annotatedElement52 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass53 = annotatedElement52.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(genericDeclaration37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(annotatedElement51);
        org.junit.Assert.assertNull(annotatedElement52);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.eq(list0);
        java.util.Collection collection2 = org.mockito.Matchers.eq((java.util.Collection) list1);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(collection2);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map30 = org.mockito.Matchers.refEq(map18, strArray29);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass17, strArray29);
        java.util.Set set32 = org.mockito.Matchers.anySet();
        java.util.Set set33 = org.mockito.Matchers.eq(set32);
        java.lang.Iterable iterable34 = org.mockito.Matchers.same((java.lang.Iterable) set32);
        java.util.List list35 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass36 = list35.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration37 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass36);
        java.util.Map map38 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.Map map42 = org.mockito.Matchers.refEq(map38, strArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map50 = org.mockito.Matchers.refEq(map38, strArray49);
        java.lang.reflect.AnnotatedElement annotatedElement51 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass36, strArray49);
        java.util.Collection collection52 = org.mockito.Matchers.refEq((java.util.Collection) set32, strArray49);
        java.io.Serializable serializable53 = org.mockito.Matchers.same((java.io.Serializable) strArray49);
        java.lang.Class<?> wildcardClass54 = org.mockito.Matchers.refEq(wildcardClass17, strArray49);
        java.lang.Object obj55 = org.mockito.Matchers.eq((java.lang.Object) wildcardClass54);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(set33);
        org.junit.Assert.assertNull(iterable34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(genericDeclaration37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(annotatedElement51);
        org.junit.Assert.assertNull(collection52);
        org.junit.Assert.assertNull(serializable53);
        org.junit.Assert.assertNull(wildcardClass54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass1);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String str9 = org.mockito.Matchers.refEq("hi!", strArray7);
        java.lang.String[] strArray10 = null;
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.CharSequence charSequence17 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray15);
        java.lang.String[] strArray18 = org.mockito.Matchers.refEq(strArray10, strArray15);
        java.lang.String[] strArray19 = org.mockito.Matchers.refEq(strArray7, strArray15);
        java.lang.reflect.Type type20 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement21 = org.mockito.Matchers.eq((java.lang.reflect.AnnotatedElement) wildcardClass1);
        java.lang.Class<?> wildcardClass22 = org.mockito.Matchers.eq(wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement23 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass22);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(type20);
        org.junit.Assert.assertNull(annotatedElement21);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNull(annotatedElement23);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        long long1 = org.mockito.Matchers.eq((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Map map4 = org.mockito.Matchers.refEq(map0, strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq(charSequence7, strArray12);
        java.util.Map map16 = org.mockito.Matchers.refEq(map6, strArray12);
        java.lang.Object obj17 = org.mockito.Matchers.eq((java.lang.Object) strArray12);
        java.lang.reflect.GenericDeclaration genericDeclaration18 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass5, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = genericDeclaration18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(genericDeclaration18);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Collection collection4 = org.mockito.Matchers.eq((java.util.Collection) set0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = collection4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(collection4);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double1 = org.mockito.Matchers.eq((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map2, strArray13);
        org.mockito.Matchers matchers15 = org.mockito.Matchers.refEq(matchers0, strArray13);
        org.mockito.Matchers matchers16 = new org.mockito.Matchers();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String str23 = org.mockito.Matchers.refEq("hi!", strArray21);
        org.mockito.Matchers matchers24 = org.mockito.Matchers.refEq(matchers16, strArray21);
        org.mockito.Matchers matchers25 = org.mockito.Matchers.refEq(matchers0, strArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = matchers25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(matchers24);
        org.junit.Assert.assertNull(matchers25);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map2, strArray13);
        org.mockito.Matchers matchers15 = org.mockito.Matchers.refEq(matchers0, strArray13);
        org.mockito.Matchers matchers16 = new org.mockito.Matchers();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String str23 = org.mockito.Matchers.refEq("hi!", strArray21);
        org.mockito.Matchers matchers24 = org.mockito.Matchers.refEq(matchers16, strArray21);
        org.mockito.Matchers matchers25 = org.mockito.Matchers.refEq(matchers0, strArray21);
        org.mockito.Matchers matchers26 = org.mockito.Matchers.eq(matchers25);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(matchers24);
        org.junit.Assert.assertNull(matchers25);
        org.junit.Assert.assertNull(matchers26);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray7 = org.mockito.Matchers.same(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = strArray7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = iterable2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map8, strArray19);
        java.lang.reflect.AnnotatedElement annotatedElement21 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray19);
        java.lang.reflect.GenericDeclaration genericDeclaration22 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray19);
        java.lang.String[] strArray23 = org.mockito.Matchers.eq(strArray19);
        java.util.List list24 = org.mockito.Matchers.refEq(list0, strArray23);
        java.util.List list25 = org.mockito.Matchers.same(list0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = list25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(annotatedElement21);
        org.junit.Assert.assertNull(genericDeclaration22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNull(list25);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        java.lang.Class<?> wildcardClass3 = set0.getClass();
        java.io.Serializable serializable4 = org.mockito.Matchers.same((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.mockito.Matchers.same(wildcardClass3);
        java.lang.reflect.Type type6 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass5);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = org.mockito.Matchers.eq(obj0);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = org.mockito.Matchers.eq(charSequence0);
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        float float1 = org.mockito.Matchers.eq((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map3, strArray14);
        java.util.List list16 = org.mockito.Matchers.refEq(list0, strArray14);
        java.util.List list17 = org.mockito.Matchers.same(list16);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(list17);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map1 = org.mockito.Matchers.eq(map0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = map1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNull(map1);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        long long1 = org.mockito.Matchers.eq(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        double double1 = org.mockito.Matchers.eq(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray7);
        java.io.Serializable serializable10 = org.mockito.Matchers.refEq((java.io.Serializable) 100.0f, strArray7);
        org.mockito.Matchers matchers11 = org.mockito.Matchers.refEq(matchers1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = matchers1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNull(matchers11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Map map0 = null;
        java.lang.String[] strArray1 = null;
        java.util.Map map2 = org.mockito.Matchers.refEq(map0, strArray1);
        org.junit.Assert.assertNull(map2);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) genericDeclaration2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNull(annotatedElement3);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map8, strArray19);
        java.lang.reflect.AnnotatedElement annotatedElement21 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray19);
        java.lang.reflect.GenericDeclaration genericDeclaration22 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray19);
        java.lang.String[] strArray23 = org.mockito.Matchers.eq(strArray19);
        java.util.List list24 = org.mockito.Matchers.refEq(list0, strArray23);
        java.util.List list25 = org.mockito.Matchers.eq(list0);
        java.lang.Iterable iterable26 = org.mockito.Matchers.eq((java.lang.Iterable) list25);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(annotatedElement21);
        org.junit.Assert.assertNull(genericDeclaration22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNull(list25);
        org.junit.Assert.assertNull(iterable26);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Map map4 = org.mockito.Matchers.refEq(map0, strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        java.util.Set set6 = org.mockito.Matchers.anySet();
        java.util.Set set7 = org.mockito.Matchers.eq(set6);
        java.util.Set set8 = org.mockito.Matchers.same(set6);
        java.util.Set set9 = org.mockito.Matchers.eq(set6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable14 = org.mockito.Matchers.refEq((java.lang.Iterable) set6, strArray13);
        java.lang.String[] strArray15 = org.mockito.Matchers.same(strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass5, strArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable22 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray21);
        java.lang.CharSequence charSequence23 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray21);
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass5, strArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = genericDeclaration24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(set7);
        org.junit.Assert.assertNull(set8);
        org.junit.Assert.assertNull(set9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(annotatedElement16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable22);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNull(genericDeclaration24);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map3, strArray14);
        java.util.List list16 = org.mockito.Matchers.refEq(list0, strArray14);
        java.lang.Iterable iterable17 = org.mockito.Matchers.eq((java.lang.Iterable) list16);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(iterable17);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map3, strArray14);
        java.util.List list16 = org.mockito.Matchers.refEq(list0, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = list16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(list16);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.CharSequence charSequence0 = org.mockito.Matchers.anyVararg();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.anySet();
        java.util.Set set3 = org.mockito.Matchers.eq(set2);
        java.lang.Iterable iterable4 = org.mockito.Matchers.same((java.lang.Iterable) set2);
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.lang.reflect.Type type8 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass6);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map14, strArray17);
        java.lang.String str19 = org.mockito.Matchers.refEq("hi!", strArray17);
        java.lang.String[] strArray20 = null;
        java.util.Map map22 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Map map26 = org.mockito.Matchers.refEq(map22, strArray25);
        java.lang.CharSequence charSequence27 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray25);
        java.lang.String[] strArray28 = org.mockito.Matchers.refEq(strArray20, strArray25);
        java.lang.String[] strArray29 = org.mockito.Matchers.refEq(strArray17, strArray25);
        java.lang.Object obj30 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray17);
        java.io.Serializable serializable31 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass11, strArray17);
        java.lang.String str32 = org.mockito.Matchers.refEq("", strArray17);
        java.lang.Class<?> wildcardClass33 = org.mockito.Matchers.refEq(wildcardClass6, strArray17);
        java.util.Set set34 = org.mockito.Matchers.refEq(set2, strArray17);
        java.util.List list36 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass37 = list36.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration38 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass37);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray46 = org.mockito.Matchers.same(strArray45);
        java.io.Serializable serializable47 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass37, strArray45);
        java.lang.Object obj48 = org.mockito.Matchers.refEq((java.lang.Object) false, strArray45);
        java.util.Set set49 = org.mockito.Matchers.refEq(set2, strArray45);
        java.util.Set set50 = org.mockito.Matchers.refEq(set0, strArray45);
        java.util.Set set51 = org.mockito.Matchers.eq(set50);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNull(iterable4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map26);
        org.junit.Assert.assertNull(charSequence27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(serializable31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertNull(set34);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(genericDeclaration38);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNull(serializable47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(set49);
        org.junit.Assert.assertNull(set50);
        org.junit.Assert.assertNull(set51);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Map map4 = org.mockito.Matchers.refEq(map0, strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        java.util.Set set6 = org.mockito.Matchers.anySet();
        java.util.Set set7 = org.mockito.Matchers.eq(set6);
        java.util.Set set8 = org.mockito.Matchers.same(set6);
        java.util.Set set9 = org.mockito.Matchers.eq(set6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable14 = org.mockito.Matchers.refEq((java.lang.Iterable) set6, strArray13);
        java.lang.String[] strArray15 = org.mockito.Matchers.same(strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass5, strArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable22 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray21);
        java.lang.CharSequence charSequence23 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray21);
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass5, strArray21);
        java.lang.Class<?> wildcardClass25 = org.mockito.Matchers.eq(wildcardClass5);
        java.lang.reflect.Type type26 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass25);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(set7);
        org.junit.Assert.assertNull(set8);
        org.junit.Assert.assertNull(set9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(annotatedElement16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable22);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNull(genericDeclaration24);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNull(type26);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        org.mockito.Matchers matchers3 = new org.mockito.Matchers();
        org.mockito.Matchers matchers4 = org.mockito.Matchers.eq(matchers3);
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass6);
        org.mockito.Matchers matchers8 = new org.mockito.Matchers();
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.String str15 = org.mockito.Matchers.refEq("hi!", strArray13);
        org.mockito.Matchers matchers16 = org.mockito.Matchers.refEq(matchers8, strArray13);
        java.lang.reflect.GenericDeclaration genericDeclaration17 = org.mockito.Matchers.refEq(genericDeclaration7, strArray13);
        java.lang.Object obj18 = org.mockito.Matchers.eq((java.lang.Object) strArray13);
        org.mockito.Matchers matchers19 = org.mockito.Matchers.refEq(matchers4, strArray13);
        java.util.Set set20 = org.mockito.Matchers.refEq(set0, strArray13);
        java.util.Set set21 = org.mockito.Matchers.same(set0);
        java.lang.Iterable iterable22 = org.mockito.Matchers.eq((java.lang.Iterable) set21);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(matchers4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(matchers16);
        org.junit.Assert.assertNull(genericDeclaration17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(matchers19);
        org.junit.Assert.assertNull(set20);
        org.junit.Assert.assertNull(set21);
        org.junit.Assert.assertNull(iterable22);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map1 = org.mockito.Matchers.eq(map0);
        org.mockito.Matchers matchers2 = new org.mockito.Matchers();
        org.mockito.Matchers matchers3 = org.mockito.Matchers.same(matchers2);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.CharSequence charSequence11 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.io.Serializable serializable12 = org.mockito.Matchers.refEq((java.io.Serializable) 100.0f, strArray9);
        org.mockito.Matchers matchers13 = org.mockito.Matchers.refEq(matchers3, strArray9);
        java.util.Map map14 = org.mockito.Matchers.refEq(map0, strArray9);
        java.util.Map map15 = org.mockito.Matchers.same(map14);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(matchers3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNull(matchers13);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(map15);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Map map9 = org.mockito.Matchers.refEq(map5, strArray8);
        java.lang.String str10 = org.mockito.Matchers.refEq("hi!", strArray8);
        java.lang.String[] strArray11 = null;
        java.util.Map map13 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Map map17 = org.mockito.Matchers.refEq(map13, strArray16);
        java.lang.CharSequence charSequence18 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray16);
        java.lang.String[] strArray19 = org.mockito.Matchers.refEq(strArray11, strArray16);
        java.lang.String[] strArray20 = org.mockito.Matchers.refEq(strArray8, strArray16);
        java.lang.Object obj21 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray8);
        java.io.Serializable serializable22 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass2, strArray8);
        java.lang.String str23 = org.mockito.Matchers.refEq("", strArray8);
        java.lang.Object obj24 = org.mockito.Matchers.same((java.lang.Object) strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = obj24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(serializable22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Collection collection4 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.lang.Object obj5 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.util.Set set6 = org.mockito.Matchers.eq(set0);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.CharSequence charSequence13 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray11);
        java.util.Set set14 = org.mockito.Matchers.anySet();
        java.util.Set set15 = org.mockito.Matchers.eq(set14);
        java.lang.Iterable iterable16 = org.mockito.Matchers.same((java.lang.Iterable) set14);
        java.util.List list17 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass18 = list17.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass18);
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map32 = org.mockito.Matchers.refEq(map20, strArray31);
        java.lang.reflect.AnnotatedElement annotatedElement33 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass18, strArray31);
        java.util.Collection collection34 = org.mockito.Matchers.refEq((java.util.Collection) set14, strArray31);
        java.util.Set set35 = org.mockito.Matchers.anySet();
        java.util.Set set36 = org.mockito.Matchers.eq(set35);
        java.util.Set set37 = org.mockito.Matchers.same(set35);
        java.util.Set set38 = org.mockito.Matchers.eq(set35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable43 = org.mockito.Matchers.refEq((java.lang.Iterable) set35, strArray42);
        java.lang.String[] strArray44 = org.mockito.Matchers.same(strArray42);
        java.lang.Object obj45 = org.mockito.Matchers.refEq((java.lang.Object) strArray31, strArray44);
        java.lang.String[] strArray46 = org.mockito.Matchers.refEq(strArray11, strArray31);
        java.lang.Object obj47 = org.mockito.Matchers.refEq((java.lang.Object) set0, strArray31);
        java.lang.String[] strArray48 = null;
        java.util.Collection collection49 = org.mockito.Matchers.refEq((java.util.Collection) set0, strArray48);
        java.util.Collection collection50 = org.mockito.Matchers.eq(collection49);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(set6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(set15);
        org.junit.Assert.assertNull(iterable16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(annotatedElement33);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(set36);
        org.junit.Assert.assertNull(set37);
        org.junit.Assert.assertNull(set38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(collection49);
        org.junit.Assert.assertNull(collection50);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        double double1 = org.mockito.Matchers.eq((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.eq(matchers0);
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass3 = map2.getClass();
        java.util.List list4 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass5 = list4.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map7, strArray18);
        java.lang.reflect.AnnotatedElement annotatedElement20 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass5, strArray18);
        java.lang.reflect.GenericDeclaration genericDeclaration21 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass3, strArray18);
        org.mockito.Matchers matchers22 = org.mockito.Matchers.refEq(matchers1, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = matchers1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(genericDeclaration6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(annotatedElement20);
        org.junit.Assert.assertNull(genericDeclaration21);
        org.junit.Assert.assertNull(matchers22);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Class<?> wildcardClass2 = list0.getClass();
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.Type type5 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass4);
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String str12 = org.mockito.Matchers.refEq("hi!", strArray10);
        java.lang.String[] strArray13 = null;
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.CharSequence charSequence20 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray18);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray13, strArray18);
        java.lang.String[] strArray22 = org.mockito.Matchers.refEq(strArray10, strArray18);
        java.lang.reflect.Type type23 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass4, strArray18);
        java.lang.reflect.Type type24 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass2, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = type24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(type23);
        org.junit.Assert.assertNull(type24);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map6, strArray17);
        java.lang.reflect.AnnotatedElement annotatedElement19 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray17);
        java.util.Collection collection20 = org.mockito.Matchers.refEq((java.util.Collection) set0, strArray17);
        java.util.Map map21 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        java.util.Map map25 = org.mockito.Matchers.refEq(map21, strArray24);
        java.lang.Iterable iterable26 = org.mockito.Matchers.refEq((java.lang.Iterable) set0, strArray24);
        java.io.Serializable serializable27 = org.mockito.Matchers.eq((java.io.Serializable) strArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = serializable27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(annotatedElement19);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNull(iterable26);
        org.junit.Assert.assertNull(serializable27);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Map map4 = org.mockito.Matchers.refEq(map0, strArray3);
        java.lang.Class<?> wildcardClass5 = map0.getClass();
        java.lang.reflect.Type type6 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass5);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(type6);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.String[] strArray8 = null;
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray13);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray8, strArray13);
        java.lang.String[] strArray17 = org.mockito.Matchers.refEq(strArray5, strArray13);
        java.util.Map map18 = org.mockito.Matchers.refEq(map0, strArray5);
        java.util.Set set19 = org.mockito.Matchers.anySet();
        java.util.Set set20 = org.mockito.Matchers.eq(set19);
        java.util.Set set21 = org.mockito.Matchers.same(set19);
        java.util.Set set22 = org.mockito.Matchers.eq(set19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable27 = org.mockito.Matchers.refEq((java.lang.Iterable) set19, strArray26);
        java.lang.String[] strArray28 = org.mockito.Matchers.same(strArray26);
        java.util.Set set29 = org.mockito.Matchers.anySet();
        java.util.Set set30 = org.mockito.Matchers.eq(set29);
        java.lang.Iterable iterable31 = org.mockito.Matchers.same((java.lang.Iterable) set29);
        java.util.List list32 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass33 = list32.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration34 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass33);
        java.lang.reflect.Type type35 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass33);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.util.Map map41 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Map map45 = org.mockito.Matchers.refEq(map41, strArray44);
        java.lang.String str46 = org.mockito.Matchers.refEq("hi!", strArray44);
        java.lang.String[] strArray47 = null;
        java.util.Map map49 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Map map53 = org.mockito.Matchers.refEq(map49, strArray52);
        java.lang.CharSequence charSequence54 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray52);
        java.lang.String[] strArray55 = org.mockito.Matchers.refEq(strArray47, strArray52);
        java.lang.String[] strArray56 = org.mockito.Matchers.refEq(strArray44, strArray52);
        java.lang.Object obj57 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray44);
        java.io.Serializable serializable58 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass38, strArray44);
        java.lang.String str59 = org.mockito.Matchers.refEq("", strArray44);
        java.lang.Class<?> wildcardClass60 = org.mockito.Matchers.refEq(wildcardClass33, strArray44);
        java.util.Set set61 = org.mockito.Matchers.refEq(set29, strArray44);
        java.util.List list63 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass64 = list63.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration65 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass64);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray73 = org.mockito.Matchers.same(strArray72);
        java.io.Serializable serializable74 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass64, strArray72);
        java.lang.Object obj75 = org.mockito.Matchers.refEq((java.lang.Object) false, strArray72);
        java.util.Set set76 = org.mockito.Matchers.refEq(set29, strArray72);
        java.lang.String[] strArray77 = org.mockito.Matchers.refEq(strArray28, strArray72);
        java.util.Map map78 = org.mockito.Matchers.refEq(map0, strArray72);
        java.util.Map map79 = org.mockito.Matchers.same(map78);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(set20);
        org.junit.Assert.assertNull(set21);
        org.junit.Assert.assertNull(set22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(set30);
        org.junit.Assert.assertNull(iterable31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(genericDeclaration34);
        org.junit.Assert.assertNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertNull(set61);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(genericDeclaration65);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray73);
        org.junit.Assert.assertNull(serializable74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(set76);
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertNull(map78);
        org.junit.Assert.assertNull(map79);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String str12 = org.mockito.Matchers.refEq("hi!", strArray10);
        java.lang.String[] strArray13 = null;
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.CharSequence charSequence20 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray18);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray13, strArray18);
        java.lang.String[] strArray22 = org.mockito.Matchers.refEq(strArray10, strArray18);
        java.lang.Object obj23 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray10);
        java.io.Serializable serializable24 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass4, strArray10);
        java.lang.String str25 = org.mockito.Matchers.refEq("", strArray10);
        java.util.Map map27 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.Map map31 = org.mockito.Matchers.refEq(map27, strArray30);
        java.lang.String str32 = org.mockito.Matchers.refEq("hi!", strArray30);
        java.lang.String[] strArray33 = org.mockito.Matchers.refEq(strArray10, strArray30);
        java.lang.Class<?> wildcardClass34 = org.mockito.Matchers.refEq(wildcardClass1, strArray33);
        java.util.List list35 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable36 = org.mockito.Matchers.eq((java.lang.Iterable) list35);
        java.util.List list37 = org.mockito.Matchers.eq(list35);
        java.util.List list38 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass39 = list38.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration40 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass39);
        java.util.Map map41 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Map map45 = org.mockito.Matchers.refEq(map41, strArray44);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map53 = org.mockito.Matchers.refEq(map41, strArray52);
        java.lang.reflect.AnnotatedElement annotatedElement54 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass39, strArray52);
        java.io.Serializable serializable55 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass39);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable60 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray59);
        java.lang.reflect.GenericDeclaration genericDeclaration61 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass39, strArray59);
        java.util.List list62 = org.mockito.Matchers.refEq(list35, strArray59);
        java.util.List list63 = org.mockito.Matchers.eq(list35);
        org.mockito.Matchers matchers64 = new org.mockito.Matchers();
        org.mockito.Matchers matchers65 = org.mockito.Matchers.same(matchers64);
        java.util.Map map66 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray69 = new java.lang.String[] { "", "" };
        java.util.Map map70 = org.mockito.Matchers.refEq(map66, strArray69);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map78 = org.mockito.Matchers.refEq(map66, strArray77);
        org.mockito.Matchers matchers79 = org.mockito.Matchers.refEq(matchers64, strArray77);
        org.mockito.Matchers matchers80 = new org.mockito.Matchers();
        java.util.Map map82 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray85 = new java.lang.String[] { "", "" };
        java.util.Map map86 = org.mockito.Matchers.refEq(map82, strArray85);
        java.lang.String str87 = org.mockito.Matchers.refEq("hi!", strArray85);
        org.mockito.Matchers matchers88 = org.mockito.Matchers.refEq(matchers80, strArray85);
        org.mockito.Matchers matchers89 = org.mockito.Matchers.refEq(matchers64, strArray85);
        java.lang.Iterable iterable90 = org.mockito.Matchers.refEq((java.lang.Iterable) list63, strArray85);
        java.lang.reflect.GenericDeclaration genericDeclaration91 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass92 = genericDeclaration91.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNull(iterable36);
        org.junit.Assert.assertNull(list37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(genericDeclaration40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(annotatedElement54);
        org.junit.Assert.assertNull(serializable55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable60);
        org.junit.Assert.assertNull(genericDeclaration61);
        org.junit.Assert.assertNull(list62);
        org.junit.Assert.assertNull(list63);
        org.junit.Assert.assertNull(matchers65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map70);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map78);
        org.junit.Assert.assertNull(matchers79);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNull(matchers88);
        org.junit.Assert.assertNull(matchers89);
        org.junit.Assert.assertNull(iterable90);
        org.junit.Assert.assertNull(genericDeclaration91);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.String[] strArray2 = null;
        java.util.Set set3 = org.mockito.Matchers.refEq(set1, strArray2);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set3);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.Set set1 = org.mockito.Matchers.anySet();
        java.util.Set set2 = org.mockito.Matchers.eq(set1);
        java.lang.Iterable iterable3 = org.mockito.Matchers.same((java.lang.Iterable) set1);
        java.util.List list4 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass5 = list4.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map7, strArray18);
        java.lang.reflect.AnnotatedElement annotatedElement20 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass5, strArray18);
        java.util.Collection collection21 = org.mockito.Matchers.refEq((java.util.Collection) set1, strArray18);
        java.lang.Comparable<java.lang.String> strComparable22 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "", strArray18);
        java.lang.Object obj23 = org.mockito.Matchers.same((java.lang.Object) strComparable22);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(iterable3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(genericDeclaration6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(annotatedElement20);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertNull(strComparable22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.lang.Class<?> wildcardClass3 = set0.getClass();
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        java.util.Set set10 = org.mockito.Matchers.anySet();
        java.util.Set set11 = org.mockito.Matchers.eq(set10);
        java.util.Set set12 = org.mockito.Matchers.same(set10);
        java.util.Set set13 = org.mockito.Matchers.eq(set10);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable18 = org.mockito.Matchers.refEq((java.lang.Iterable) set10, strArray17);
        java.lang.String[] strArray19 = org.mockito.Matchers.same(strArray17);
        java.lang.reflect.AnnotatedElement annotatedElement20 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass9, strArray17);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable26 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray25);
        java.lang.CharSequence charSequence27 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray25);
        java.lang.reflect.GenericDeclaration genericDeclaration28 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass9, strArray25);
        java.lang.reflect.Type type29 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass3, strArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = type29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(set11);
        org.junit.Assert.assertNull(set12);
        org.junit.Assert.assertNull(set13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(annotatedElement20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable26);
        org.junit.Assert.assertNull(charSequence27);
        org.junit.Assert.assertNull(genericDeclaration28);
        org.junit.Assert.assertNull(type29);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map30 = org.mockito.Matchers.refEq(map18, strArray29);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass17, strArray29);
        java.util.Set set32 = org.mockito.Matchers.anySet();
        java.util.Set set33 = org.mockito.Matchers.eq(set32);
        java.lang.Iterable iterable34 = org.mockito.Matchers.same((java.lang.Iterable) set32);
        java.util.List list35 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass36 = list35.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration37 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass36);
        java.util.Map map38 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.Map map42 = org.mockito.Matchers.refEq(map38, strArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map50 = org.mockito.Matchers.refEq(map38, strArray49);
        java.lang.reflect.AnnotatedElement annotatedElement51 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass36, strArray49);
        java.util.Collection collection52 = org.mockito.Matchers.refEq((java.util.Collection) set32, strArray49);
        java.io.Serializable serializable53 = org.mockito.Matchers.same((java.io.Serializable) strArray49);
        java.lang.Class<?> wildcardClass54 = org.mockito.Matchers.refEq(wildcardClass17, strArray49);
        java.lang.Class<?> wildcardClass55 = org.mockito.Matchers.same(wildcardClass54);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(set33);
        org.junit.Assert.assertNull(iterable34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(genericDeclaration37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(annotatedElement51);
        org.junit.Assert.assertNull(collection52);
        org.junit.Assert.assertNull(serializable53);
        org.junit.Assert.assertNull(wildcardClass54);
        org.junit.Assert.assertNull(wildcardClass55);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        org.mockito.Matchers matchers3 = new org.mockito.Matchers();
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Map map9 = org.mockito.Matchers.refEq(map5, strArray8);
        java.lang.String str10 = org.mockito.Matchers.refEq("hi!", strArray8);
        org.mockito.Matchers matchers11 = org.mockito.Matchers.refEq(matchers3, strArray8);
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.refEq(genericDeclaration2, strArray8);
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map14, strArray17);
        java.lang.CharSequence charSequence19 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray17);
        java.io.Serializable serializable20 = org.mockito.Matchers.refEq((java.io.Serializable) strArray8, strArray17);
        java.lang.Class<?> wildcardClass21 = strArray17.getClass();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(matchers11);
        org.junit.Assert.assertNull(genericDeclaration12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(serializable20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.eq(set0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable8 = org.mockito.Matchers.refEq((java.lang.Iterable) set0, strArray7);
        java.lang.Iterable iterable9 = org.mockito.Matchers.same(iterable8);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable8);
        org.junit.Assert.assertNull(iterable9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.String[] strArray9 = org.mockito.Matchers.refEq(strArray1, strArray6);
        java.util.List list10 = org.mockito.Matchers.refEq(list0, strArray6);
        java.lang.Iterable iterable11 = org.mockito.Matchers.eq((java.lang.Iterable) list10);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(iterable11);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement4 = org.mockito.Matchers.eq((java.lang.reflect.AnnotatedElement) genericDeclaration3);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNull(annotatedElement4);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String[] strArray1 = null;
        java.lang.CharSequence charSequence2 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray1);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.eq(set0);
        java.util.Set set4 = org.mockito.Matchers.eq(set3);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNull(set4);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.util.List list0 = null;
        java.util.List list1 = org.mockito.Matchers.same(list0);
        org.junit.Assert.assertNull(list1);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map2, strArray13);
        org.mockito.Matchers matchers15 = org.mockito.Matchers.refEq(matchers0, strArray13);
        org.mockito.Matchers matchers16 = org.mockito.Matchers.same(matchers0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = matchers16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNull(matchers16);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        org.mockito.Matchers matchers3 = new org.mockito.Matchers();
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Map map9 = org.mockito.Matchers.refEq(map5, strArray8);
        java.lang.String str10 = org.mockito.Matchers.refEq("hi!", strArray8);
        org.mockito.Matchers matchers11 = org.mockito.Matchers.refEq(matchers3, strArray8);
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.refEq(genericDeclaration2, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = genericDeclaration12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(matchers11);
        org.junit.Assert.assertNull(genericDeclaration12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.Collection collection0 = org.mockito.Matchers.anyCollection();
        java.lang.Iterable iterable1 = org.mockito.Matchers.same((java.lang.Iterable) collection0);
        java.util.Collection collection2 = org.mockito.Matchers.same(collection0);
        java.lang.Iterable iterable3 = org.mockito.Matchers.same((java.lang.Iterable) collection2);
        org.junit.Assert.assertNotNull(collection0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNull(iterable3);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String[] strArray0 = null;
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.CharSequence charSequence7 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray5);
        java.lang.String[] strArray8 = org.mockito.Matchers.refEq(strArray0, strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map3, strArray14);
        java.util.List list16 = org.mockito.Matchers.refEq(list0, strArray14);
        java.lang.Class<?> wildcardClass17 = list0.getClass();
        java.util.List list18 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass19 = list18.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration20 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass19);
        org.mockito.Matchers matchers21 = new org.mockito.Matchers();
        java.util.Map map23 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map23, strArray26);
        java.lang.String str28 = org.mockito.Matchers.refEq("hi!", strArray26);
        org.mockito.Matchers matchers29 = org.mockito.Matchers.refEq(matchers21, strArray26);
        java.lang.reflect.GenericDeclaration genericDeclaration30 = org.mockito.Matchers.refEq(genericDeclaration20, strArray26);
        java.util.Map map32 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.Map map36 = org.mockito.Matchers.refEq(map32, strArray35);
        java.lang.CharSequence charSequence37 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray35);
        java.io.Serializable serializable38 = org.mockito.Matchers.refEq((java.io.Serializable) strArray26, strArray35);
        java.lang.reflect.GenericDeclaration genericDeclaration39 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass17, strArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass40 = genericDeclaration39.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(genericDeclaration20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(matchers29);
        org.junit.Assert.assertNull(genericDeclaration30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map36);
        org.junit.Assert.assertNull(charSequence37);
        org.junit.Assert.assertNull(serializable38);
        org.junit.Assert.assertNull(genericDeclaration39);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.lang.Class<?> wildcardClass18 = org.mockito.Matchers.same(wildcardClass17);
        java.lang.reflect.Type type19 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass17);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(type19);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Matchers.eq(strComparable0);
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = list1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence2 = null;
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray7);
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq(charSequence2, strArray7);
        java.util.Map map11 = org.mockito.Matchers.refEq(map1, strArray7);
        java.util.List list12 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        java.lang.reflect.Type type14 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass13);
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map16, strArray19);
        java.lang.String str21 = org.mockito.Matchers.refEq("hi!", strArray19);
        java.lang.String[] strArray22 = null;
        java.util.Map map24 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Map map28 = org.mockito.Matchers.refEq(map24, strArray27);
        java.lang.CharSequence charSequence29 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray27);
        java.lang.String[] strArray30 = org.mockito.Matchers.refEq(strArray22, strArray27);
        java.lang.String[] strArray31 = org.mockito.Matchers.refEq(strArray19, strArray27);
        java.lang.reflect.Type type32 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass13, strArray27);
        java.io.Serializable serializable33 = org.mockito.Matchers.same((java.io.Serializable) strArray27);
        java.util.Map map34 = org.mockito.Matchers.refEq(map11, strArray27);
        org.mockito.Matchers matchers35 = org.mockito.Matchers.refEq(matchers0, strArray27);
        java.lang.Class<?> wildcardClass36 = matchers0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(charSequence29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNull(type32);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNull(matchers35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Collection collection4 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.lang.Object obj5 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.util.Set set6 = org.mockito.Matchers.eq(set0);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.CharSequence charSequence13 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray11);
        java.util.Set set14 = org.mockito.Matchers.anySet();
        java.util.Set set15 = org.mockito.Matchers.eq(set14);
        java.lang.Iterable iterable16 = org.mockito.Matchers.same((java.lang.Iterable) set14);
        java.util.List list17 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass18 = list17.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass18);
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map32 = org.mockito.Matchers.refEq(map20, strArray31);
        java.lang.reflect.AnnotatedElement annotatedElement33 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass18, strArray31);
        java.util.Collection collection34 = org.mockito.Matchers.refEq((java.util.Collection) set14, strArray31);
        java.util.Set set35 = org.mockito.Matchers.anySet();
        java.util.Set set36 = org.mockito.Matchers.eq(set35);
        java.util.Set set37 = org.mockito.Matchers.same(set35);
        java.util.Set set38 = org.mockito.Matchers.eq(set35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable43 = org.mockito.Matchers.refEq((java.lang.Iterable) set35, strArray42);
        java.lang.String[] strArray44 = org.mockito.Matchers.same(strArray42);
        java.lang.Object obj45 = org.mockito.Matchers.refEq((java.lang.Object) strArray31, strArray44);
        java.lang.String[] strArray46 = org.mockito.Matchers.refEq(strArray11, strArray31);
        java.lang.Object obj47 = org.mockito.Matchers.refEq((java.lang.Object) set0, strArray31);
        java.lang.String[] strArray48 = null;
        java.util.Collection collection49 = org.mockito.Matchers.refEq((java.util.Collection) set0, strArray48);
        java.lang.Iterable iterable50 = org.mockito.Matchers.eq((java.lang.Iterable) collection49);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(set6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(set15);
        org.junit.Assert.assertNull(iterable16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(annotatedElement33);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(set36);
        org.junit.Assert.assertNull(set37);
        org.junit.Assert.assertNull(set38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(collection49);
        org.junit.Assert.assertNull(iterable50);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.Object obj0 = org.mockito.Matchers.anyObject();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.reflect.Type type6 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass4);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.String str17 = org.mockito.Matchers.refEq("hi!", strArray15);
        java.lang.String[] strArray18 = null;
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.CharSequence charSequence25 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray23);
        java.lang.String[] strArray26 = org.mockito.Matchers.refEq(strArray18, strArray23);
        java.lang.String[] strArray27 = org.mockito.Matchers.refEq(strArray15, strArray23);
        java.lang.Object obj28 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray15);
        java.io.Serializable serializable29 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass9, strArray15);
        java.lang.String str30 = org.mockito.Matchers.refEq("", strArray15);
        java.lang.Class<?> wildcardClass31 = org.mockito.Matchers.refEq(wildcardClass4, strArray15);
        java.util.Set set32 = org.mockito.Matchers.refEq(set0, strArray15);
        java.lang.Class<?> wildcardClass33 = strArray15.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.util.Map map39 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.Map map43 = org.mockito.Matchers.refEq(map39, strArray42);
        java.lang.String str44 = org.mockito.Matchers.refEq("hi!", strArray42);
        java.lang.String[] strArray45 = null;
        java.util.Map map47 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.util.Map map51 = org.mockito.Matchers.refEq(map47, strArray50);
        java.lang.CharSequence charSequence52 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray50);
        java.lang.String[] strArray53 = org.mockito.Matchers.refEq(strArray45, strArray50);
        java.lang.String[] strArray54 = org.mockito.Matchers.refEq(strArray42, strArray50);
        java.lang.Object obj55 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray42);
        java.io.Serializable serializable56 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass36, strArray42);
        java.lang.String str57 = org.mockito.Matchers.refEq("", strArray42);
        java.util.Map map59 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "" };
        java.util.Map map63 = org.mockito.Matchers.refEq(map59, strArray62);
        java.lang.String str64 = org.mockito.Matchers.refEq("hi!", strArray62);
        java.lang.String[] strArray65 = org.mockito.Matchers.refEq(strArray42, strArray62);
        java.lang.String[] strArray66 = org.mockito.Matchers.eq(strArray62);
        java.lang.reflect.GenericDeclaration genericDeclaration67 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass33, strArray62);
        java.lang.reflect.AnnotatedElement annotatedElement68 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) genericDeclaration67);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNull(set32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map51);
        org.junit.Assert.assertNull(charSequence52);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNull(strArray54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(serializable56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(strArray65);
        org.junit.Assert.assertNull(strArray66);
        org.junit.Assert.assertNull(genericDeclaration67);
        org.junit.Assert.assertNull(annotatedElement68);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map8, strArray19);
        java.lang.reflect.AnnotatedElement annotatedElement21 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray19);
        java.lang.reflect.GenericDeclaration genericDeclaration22 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray19);
        java.lang.String[] strArray23 = org.mockito.Matchers.eq(strArray19);
        java.util.List list24 = org.mockito.Matchers.refEq(list0, strArray23);
        java.util.List list25 = org.mockito.Matchers.same(list0);
        java.lang.Iterable iterable26 = org.mockito.Matchers.eq((java.lang.Iterable) list25);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(annotatedElement21);
        org.junit.Assert.assertNull(genericDeclaration22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNull(list25);
        org.junit.Assert.assertNull(iterable26);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        org.mockito.Matchers matchers8 = org.mockito.Matchers.refEq(matchers0, strArray5);
        org.mockito.Matchers matchers9 = org.mockito.Matchers.eq(matchers0);
        java.lang.Class<?> wildcardClass10 = matchers0.getClass();
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(matchers8);
        org.junit.Assert.assertNull(matchers9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.String[] strArray8 = null;
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray13);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray8, strArray13);
        java.lang.String[] strArray17 = org.mockito.Matchers.refEq(strArray5, strArray13);
        java.util.Map map18 = org.mockito.Matchers.refEq(map0, strArray5);
        java.util.Set set19 = org.mockito.Matchers.anySet();
        java.util.Set set20 = org.mockito.Matchers.eq(set19);
        java.util.Set set21 = org.mockito.Matchers.same(set19);
        java.util.Set set22 = org.mockito.Matchers.eq(set19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable27 = org.mockito.Matchers.refEq((java.lang.Iterable) set19, strArray26);
        java.lang.String[] strArray28 = org.mockito.Matchers.same(strArray26);
        java.util.Set set29 = org.mockito.Matchers.anySet();
        java.util.Set set30 = org.mockito.Matchers.eq(set29);
        java.lang.Iterable iterable31 = org.mockito.Matchers.same((java.lang.Iterable) set29);
        java.util.List list32 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass33 = list32.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration34 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass33);
        java.lang.reflect.Type type35 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass33);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.util.Map map41 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Map map45 = org.mockito.Matchers.refEq(map41, strArray44);
        java.lang.String str46 = org.mockito.Matchers.refEq("hi!", strArray44);
        java.lang.String[] strArray47 = null;
        java.util.Map map49 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Map map53 = org.mockito.Matchers.refEq(map49, strArray52);
        java.lang.CharSequence charSequence54 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray52);
        java.lang.String[] strArray55 = org.mockito.Matchers.refEq(strArray47, strArray52);
        java.lang.String[] strArray56 = org.mockito.Matchers.refEq(strArray44, strArray52);
        java.lang.Object obj57 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray44);
        java.io.Serializable serializable58 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass38, strArray44);
        java.lang.String str59 = org.mockito.Matchers.refEq("", strArray44);
        java.lang.Class<?> wildcardClass60 = org.mockito.Matchers.refEq(wildcardClass33, strArray44);
        java.util.Set set61 = org.mockito.Matchers.refEq(set29, strArray44);
        java.util.List list63 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass64 = list63.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration65 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass64);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray73 = org.mockito.Matchers.same(strArray72);
        java.io.Serializable serializable74 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass64, strArray72);
        java.lang.Object obj75 = org.mockito.Matchers.refEq((java.lang.Object) false, strArray72);
        java.util.Set set76 = org.mockito.Matchers.refEq(set29, strArray72);
        java.lang.String[] strArray77 = org.mockito.Matchers.refEq(strArray28, strArray72);
        java.util.Map map78 = org.mockito.Matchers.refEq(map0, strArray72);
        java.lang.String[] strArray79 = org.mockito.Matchers.same(strArray72);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(set20);
        org.junit.Assert.assertNull(set21);
        org.junit.Assert.assertNull(set22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(set30);
        org.junit.Assert.assertNull(iterable31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(genericDeclaration34);
        org.junit.Assert.assertNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertNull(set61);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(genericDeclaration65);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray73);
        org.junit.Assert.assertNull(serializable74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(set76);
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertNull(map78);
        org.junit.Assert.assertNull(strArray79);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Matchers.eq((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map6, strArray17);
        java.lang.reflect.AnnotatedElement annotatedElement19 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray17);
        java.util.Collection collection20 = org.mockito.Matchers.refEq((java.util.Collection) set0, strArray17);
        java.util.Set set21 = org.mockito.Matchers.anySet();
        java.util.Set set22 = org.mockito.Matchers.eq(set21);
        java.util.Set set23 = org.mockito.Matchers.same(set21);
        java.util.Set set24 = org.mockito.Matchers.eq(set21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable29 = org.mockito.Matchers.refEq((java.lang.Iterable) set21, strArray28);
        java.lang.String[] strArray30 = org.mockito.Matchers.same(strArray28);
        java.lang.Object obj31 = org.mockito.Matchers.refEq((java.lang.Object) strArray17, strArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass32 = strArray30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(annotatedElement19);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(set22);
        org.junit.Assert.assertNull(set23);
        org.junit.Assert.assertNull(set24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.List list3 = org.mockito.Matchers.eq(list0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = list3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.String[] strArray9 = org.mockito.Matchers.refEq(strArray1, strArray6);
        java.util.List list10 = org.mockito.Matchers.refEq(list0, strArray6);
        java.lang.Object obj11 = org.mockito.Matchers.eq((java.lang.Object) list10);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable5 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray4);
        java.util.List list6 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass7 = list6.getClass();
        java.lang.reflect.Type type8 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass7);
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.String str15 = org.mockito.Matchers.refEq("hi!", strArray13);
        java.lang.String[] strArray16 = null;
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.CharSequence charSequence23 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray21);
        java.lang.String[] strArray24 = org.mockito.Matchers.refEq(strArray16, strArray21);
        java.lang.String[] strArray25 = org.mockito.Matchers.refEq(strArray13, strArray21);
        java.lang.reflect.Type type26 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass7, strArray21);
        java.lang.String[] strArray27 = org.mockito.Matchers.refEq(strArray4, strArray21);
        java.lang.String str28 = org.mockito.Matchers.refEq("", strArray27);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNull(type26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String str9 = org.mockito.Matchers.refEq("hi!", strArray7);
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray7);
        java.util.List list11 = org.mockito.Matchers.anyList();
        java.util.Collection collection12 = org.mockito.Matchers.eq((java.util.Collection) list11);
        java.lang.Class<?> wildcardClass13 = list11.getClass();
        java.lang.reflect.Type type14 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass13);
        org.mockito.Matchers matchers15 = new org.mockito.Matchers();
        org.mockito.Matchers matchers16 = org.mockito.Matchers.same(matchers15);
        java.util.Map map17 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Map map21 = org.mockito.Matchers.refEq(map17, strArray20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map29 = org.mockito.Matchers.refEq(map17, strArray28);
        org.mockito.Matchers matchers30 = org.mockito.Matchers.refEq(matchers15, strArray28);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass13, strArray28);
        java.io.Serializable serializable32 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray28);
        org.mockito.Matchers matchers33 = org.mockito.Matchers.refEq(matchers0, strArray28);
        java.util.List list34 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass35 = list34.getClass();
        java.lang.reflect.Type type36 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass35);
        java.util.Map map38 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.Map map42 = org.mockito.Matchers.refEq(map38, strArray41);
        java.lang.String str43 = org.mockito.Matchers.refEq("hi!", strArray41);
        java.lang.String[] strArray44 = null;
        java.util.Map map46 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        java.util.Map map50 = org.mockito.Matchers.refEq(map46, strArray49);
        java.lang.CharSequence charSequence51 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray49);
        java.lang.String[] strArray52 = org.mockito.Matchers.refEq(strArray44, strArray49);
        java.lang.String[] strArray53 = org.mockito.Matchers.refEq(strArray41, strArray49);
        java.lang.reflect.Type type54 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass35, strArray49);
        java.io.Serializable serializable55 = org.mockito.Matchers.same((java.io.Serializable) strArray49);
        java.io.Serializable serializable56 = org.mockito.Matchers.eq((java.io.Serializable) strArray49);
        org.mockito.Matchers matchers57 = org.mockito.Matchers.refEq(matchers0, strArray49);
        java.lang.Object obj58 = org.mockito.Matchers.same((java.lang.Object) matchers57);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(matchers16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNull(matchers30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNull(serializable32);
        org.junit.Assert.assertNull(matchers33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(type36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(charSequence51);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNull(type54);
        org.junit.Assert.assertNull(serializable55);
        org.junit.Assert.assertNull(serializable56);
        org.junit.Assert.assertNull(matchers57);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map6, strArray17);
        java.lang.reflect.AnnotatedElement annotatedElement19 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray17);
        java.io.Serializable serializable20 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass4);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable25 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray24);
        java.lang.reflect.GenericDeclaration genericDeclaration26 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray24);
        java.util.List list27 = org.mockito.Matchers.refEq(list0, strArray24);
        java.util.List list28 = org.mockito.Matchers.eq(list0);
        org.mockito.Matchers matchers29 = new org.mockito.Matchers();
        org.mockito.Matchers matchers30 = org.mockito.Matchers.same(matchers29);
        java.util.Map map31 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Map map35 = org.mockito.Matchers.refEq(map31, strArray34);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map43 = org.mockito.Matchers.refEq(map31, strArray42);
        org.mockito.Matchers matchers44 = org.mockito.Matchers.refEq(matchers29, strArray42);
        org.mockito.Matchers matchers45 = new org.mockito.Matchers();
        java.util.Map map47 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.util.Map map51 = org.mockito.Matchers.refEq(map47, strArray50);
        java.lang.String str52 = org.mockito.Matchers.refEq("hi!", strArray50);
        org.mockito.Matchers matchers53 = org.mockito.Matchers.refEq(matchers45, strArray50);
        org.mockito.Matchers matchers54 = org.mockito.Matchers.refEq(matchers29, strArray50);
        java.lang.Iterable iterable55 = org.mockito.Matchers.refEq((java.lang.Iterable) list28, strArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass56 = iterable55.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(annotatedElement19);
        org.junit.Assert.assertNull(serializable20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable25);
        org.junit.Assert.assertNull(genericDeclaration26);
        org.junit.Assert.assertNull(list27);
        org.junit.Assert.assertNull(list28);
        org.junit.Assert.assertNull(matchers30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map43);
        org.junit.Assert.assertNull(matchers44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(matchers53);
        org.junit.Assert.assertNull(matchers54);
        org.junit.Assert.assertNull(iterable55);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.CharSequence charSequence0 = null;
        java.util.List list1 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        java.lang.reflect.Type type3 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass2);
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Map map9 = org.mockito.Matchers.refEq(map5, strArray8);
        java.lang.String str10 = org.mockito.Matchers.refEq("hi!", strArray8);
        java.lang.String[] strArray11 = null;
        java.util.Map map13 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Map map17 = org.mockito.Matchers.refEq(map13, strArray16);
        java.lang.CharSequence charSequence18 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray16);
        java.lang.String[] strArray19 = org.mockito.Matchers.refEq(strArray11, strArray16);
        java.lang.String[] strArray20 = org.mockito.Matchers.refEq(strArray8, strArray16);
        java.lang.reflect.Type type21 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass2, strArray16);
        java.io.Serializable serializable22 = org.mockito.Matchers.same((java.io.Serializable) strArray16);
        java.lang.CharSequence charSequence23 = org.mockito.Matchers.refEq(charSequence0, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = charSequence23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(type21);
        org.junit.Assert.assertNull(serializable22);
        org.junit.Assert.assertNull(charSequence23);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        org.mockito.Matchers matchers2 = org.mockito.Matchers.same(matchers1);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNull(matchers2);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.util.List list2 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass3 = list2.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass3);
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Map map9 = org.mockito.Matchers.refEq(map5, strArray8);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map17 = org.mockito.Matchers.refEq(map5, strArray16);
        java.lang.reflect.AnnotatedElement annotatedElement18 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass3, strArray16);
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass1, strArray16);
        java.lang.reflect.GenericDeclaration genericDeclaration20 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.Object obj21 = org.mockito.Matchers.eq((java.lang.Object) genericDeclaration20);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(genericDeclaration4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(annotatedElement18);
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNull(genericDeclaration20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray5);
        java.util.List list9 = org.mockito.Matchers.anyList();
        java.util.Collection collection10 = org.mockito.Matchers.eq((java.util.Collection) list9);
        java.lang.Class<?> wildcardClass11 = list9.getClass();
        java.lang.reflect.Type type12 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass11);
        org.mockito.Matchers matchers13 = new org.mockito.Matchers();
        org.mockito.Matchers matchers14 = org.mockito.Matchers.same(matchers13);
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map15, strArray26);
        org.mockito.Matchers matchers28 = org.mockito.Matchers.refEq(matchers13, strArray26);
        java.lang.reflect.GenericDeclaration genericDeclaration29 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass11, strArray26);
        java.io.Serializable serializable30 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray26);
        java.util.Map map31 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass32 = map31.getClass();
        java.util.List list33 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass34 = list33.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration35 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass34);
        java.util.Map map36 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.Map map40 = org.mockito.Matchers.refEq(map36, strArray39);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map48 = org.mockito.Matchers.refEq(map36, strArray47);
        java.lang.reflect.AnnotatedElement annotatedElement49 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass34, strArray47);
        java.lang.reflect.GenericDeclaration genericDeclaration50 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass32, strArray47);
        java.lang.String[] strArray51 = org.mockito.Matchers.eq(strArray47);
        java.lang.String[] strArray52 = org.mockito.Matchers.refEq(strArray26, strArray51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass53 = strArray52.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(matchers14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(matchers28);
        org.junit.Assert.assertNull(genericDeclaration29);
        org.junit.Assert.assertNull(serializable30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(genericDeclaration35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map40);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map48);
        org.junit.Assert.assertNull(annotatedElement49);
        org.junit.Assert.assertNull(genericDeclaration50);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNull(strArray52);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.String[] strArray8 = null;
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray13);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray8, strArray13);
        java.lang.String[] strArray17 = org.mockito.Matchers.refEq(strArray5, strArray13);
        java.util.Map map18 = org.mockito.Matchers.refEq(map0, strArray5);
        java.util.Set set19 = org.mockito.Matchers.anySet();
        java.util.Set set20 = org.mockito.Matchers.eq(set19);
        java.util.Set set21 = org.mockito.Matchers.same(set19);
        java.util.Set set22 = org.mockito.Matchers.eq(set19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable27 = org.mockito.Matchers.refEq((java.lang.Iterable) set19, strArray26);
        java.lang.String[] strArray28 = org.mockito.Matchers.same(strArray26);
        java.util.Set set29 = org.mockito.Matchers.anySet();
        java.util.Set set30 = org.mockito.Matchers.eq(set29);
        java.lang.Iterable iterable31 = org.mockito.Matchers.same((java.lang.Iterable) set29);
        java.util.List list32 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass33 = list32.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration34 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass33);
        java.lang.reflect.Type type35 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass33);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.util.Map map41 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Map map45 = org.mockito.Matchers.refEq(map41, strArray44);
        java.lang.String str46 = org.mockito.Matchers.refEq("hi!", strArray44);
        java.lang.String[] strArray47 = null;
        java.util.Map map49 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Map map53 = org.mockito.Matchers.refEq(map49, strArray52);
        java.lang.CharSequence charSequence54 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray52);
        java.lang.String[] strArray55 = org.mockito.Matchers.refEq(strArray47, strArray52);
        java.lang.String[] strArray56 = org.mockito.Matchers.refEq(strArray44, strArray52);
        java.lang.Object obj57 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray44);
        java.io.Serializable serializable58 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass38, strArray44);
        java.lang.String str59 = org.mockito.Matchers.refEq("", strArray44);
        java.lang.Class<?> wildcardClass60 = org.mockito.Matchers.refEq(wildcardClass33, strArray44);
        java.util.Set set61 = org.mockito.Matchers.refEq(set29, strArray44);
        java.util.List list63 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass64 = list63.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration65 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass64);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray73 = org.mockito.Matchers.same(strArray72);
        java.io.Serializable serializable74 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass64, strArray72);
        java.lang.Object obj75 = org.mockito.Matchers.refEq((java.lang.Object) false, strArray72);
        java.util.Set set76 = org.mockito.Matchers.refEq(set29, strArray72);
        java.lang.String[] strArray77 = org.mockito.Matchers.refEq(strArray28, strArray72);
        java.util.Map map78 = org.mockito.Matchers.refEq(map0, strArray72);
        java.util.Map map79 = org.mockito.Matchers.same(map0);
        java.util.Map map80 = org.mockito.Matchers.eq(map79);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(set20);
        org.junit.Assert.assertNull(set21);
        org.junit.Assert.assertNull(set22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(set30);
        org.junit.Assert.assertNull(iterable31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(genericDeclaration34);
        org.junit.Assert.assertNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertNull(set61);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(genericDeclaration65);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray73);
        org.junit.Assert.assertNull(serializable74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(set76);
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertNull(map78);
        org.junit.Assert.assertNull(map79);
        org.junit.Assert.assertNull(map80);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.eq(list0);
        java.util.Collection collection2 = org.mockito.Matchers.same((java.util.Collection) list0);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.String str13 = org.mockito.Matchers.refEq("hi!", strArray11);
        java.lang.String[] strArray14 = null;
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map16, strArray19);
        java.lang.CharSequence charSequence21 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray19);
        java.lang.String[] strArray22 = org.mockito.Matchers.refEq(strArray14, strArray19);
        java.lang.String[] strArray23 = org.mockito.Matchers.refEq(strArray11, strArray19);
        java.lang.Object obj24 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray11);
        java.io.Serializable serializable25 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass5, strArray11);
        java.lang.String str26 = org.mockito.Matchers.refEq("", strArray11);
        java.util.Map map28 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Map map32 = org.mockito.Matchers.refEq(map28, strArray31);
        java.lang.String str33 = org.mockito.Matchers.refEq("hi!", strArray31);
        java.lang.String[] strArray34 = org.mockito.Matchers.refEq(strArray11, strArray31);
        java.lang.Iterable iterable35 = org.mockito.Matchers.refEq((java.lang.Iterable) collection2, strArray34);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(serializable25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNull(iterable35);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map8, strArray19);
        java.lang.reflect.AnnotatedElement annotatedElement21 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray19);
        java.lang.reflect.GenericDeclaration genericDeclaration22 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray19);
        java.lang.String[] strArray23 = org.mockito.Matchers.eq(strArray19);
        java.util.List list24 = org.mockito.Matchers.refEq(list0, strArray23);
        java.util.Collection collection25 = org.mockito.Matchers.same((java.util.Collection) list24);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(annotatedElement21);
        org.junit.Assert.assertNull(genericDeclaration22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNull(collection25);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq(charSequence1, strArray6);
        java.util.Map map10 = org.mockito.Matchers.refEq(map0, strArray6);
        java.lang.Object obj11 = org.mockito.Matchers.eq((java.lang.Object) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.String[] strArray2 = null;
        java.util.List list3 = org.mockito.Matchers.refEq(list0, strArray2);
        java.util.Collection collection4 = org.mockito.Matchers.same((java.util.Collection) list0);
        java.util.List list5 = org.mockito.Matchers.same(list0);
        java.lang.Iterable iterable6 = org.mockito.Matchers.same((java.lang.Iterable) list5);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNull(iterable6);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.io.Serializable serializable0 = null;
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.io.Serializable serializable8 = org.mockito.Matchers.refEq(serializable0, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = serializable8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.List list1 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map4, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement17 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray15);
        java.io.Serializable serializable18 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass2);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable23 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray22);
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray22);
        org.mockito.Matchers matchers25 = org.mockito.Matchers.refEq(matchers0, strArray22);
        org.mockito.Matchers matchers26 = org.mockito.Matchers.eq(matchers0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = matchers26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(annotatedElement17);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable23);
        org.junit.Assert.assertNull(genericDeclaration24);
        org.junit.Assert.assertNull(matchers25);
        org.junit.Assert.assertNull(matchers26);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.String[] strArray8 = null;
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray13);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray8, strArray13);
        java.lang.String[] strArray17 = org.mockito.Matchers.refEq(strArray5, strArray13);
        java.util.Map map18 = org.mockito.Matchers.refEq(map0, strArray5);
        java.lang.Class<?> wildcardClass19 = strArray5.getClass();
        java.lang.Class<?> wildcardClass20 = org.mockito.Matchers.eq(wildcardClass19);
        java.lang.reflect.AnnotatedElement annotatedElement21 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass20);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNull(annotatedElement21);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class<?> wildcardClass1 = org.mockito.Matchers.eq(wildcardClass0);
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.List list1 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map4, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement17 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray15);
        java.io.Serializable serializable18 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass2);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable23 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray22);
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray22);
        org.mockito.Matchers matchers25 = org.mockito.Matchers.refEq(matchers0, strArray22);
        org.mockito.Matchers matchers26 = org.mockito.Matchers.same(matchers0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = matchers26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(annotatedElement17);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable23);
        org.junit.Assert.assertNull(genericDeclaration24);
        org.junit.Assert.assertNull(matchers25);
        org.junit.Assert.assertNull(matchers26);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Map map4 = org.mockito.Matchers.refEq(map0, strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        java.util.Set set6 = org.mockito.Matchers.anySet();
        java.util.Set set7 = org.mockito.Matchers.eq(set6);
        java.util.Set set8 = org.mockito.Matchers.same(set6);
        java.util.Set set9 = org.mockito.Matchers.eq(set6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable14 = org.mockito.Matchers.refEq((java.lang.Iterable) set6, strArray13);
        java.lang.String[] strArray15 = org.mockito.Matchers.same(strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass5, strArray13);
        java.lang.reflect.AnnotatedElement annotatedElement17 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass5);
        java.lang.reflect.Type type18 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass5);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(set7);
        org.junit.Assert.assertNull(set8);
        org.junit.Assert.assertNull(set9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(annotatedElement16);
        org.junit.Assert.assertNull(annotatedElement17);
        org.junit.Assert.assertNull(type18);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.lang.Object obj2 = org.mockito.Matchers.eq((java.lang.Object) list1);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.List list1 = org.mockito.Matchers.anyList();
        java.util.List list2 = org.mockito.Matchers.same(list1);
        java.util.List list3 = org.mockito.Matchers.eq(list1);
        java.util.List list4 = org.mockito.Matchers.eq(list1);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String str11 = org.mockito.Matchers.refEq("hi!", strArray9);
        java.lang.String[] strArray12 = null;
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map14, strArray17);
        java.lang.CharSequence charSequence19 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray17);
        java.lang.String[] strArray20 = org.mockito.Matchers.refEq(strArray12, strArray17);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray9, strArray17);
        java.util.List list22 = org.mockito.Matchers.refEq(list4, strArray9);
        java.lang.String str23 = org.mockito.Matchers.refEq("hi!", strArray9);
        org.mockito.Matchers matchers24 = new org.mockito.Matchers();
        java.util.Map map25 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence26 = null;
        java.util.Map map28 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Map map32 = org.mockito.Matchers.refEq(map28, strArray31);
        java.lang.CharSequence charSequence33 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray31);
        java.lang.CharSequence charSequence34 = org.mockito.Matchers.refEq(charSequence26, strArray31);
        java.util.Map map35 = org.mockito.Matchers.refEq(map25, strArray31);
        java.util.List list36 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass37 = list36.getClass();
        java.lang.reflect.Type type38 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass37);
        java.util.Map map40 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.Map map44 = org.mockito.Matchers.refEq(map40, strArray43);
        java.lang.String str45 = org.mockito.Matchers.refEq("hi!", strArray43);
        java.lang.String[] strArray46 = null;
        java.util.Map map48 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.Map map52 = org.mockito.Matchers.refEq(map48, strArray51);
        java.lang.CharSequence charSequence53 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray51);
        java.lang.String[] strArray54 = org.mockito.Matchers.refEq(strArray46, strArray51);
        java.lang.String[] strArray55 = org.mockito.Matchers.refEq(strArray43, strArray51);
        java.lang.reflect.Type type56 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass37, strArray51);
        java.io.Serializable serializable57 = org.mockito.Matchers.same((java.io.Serializable) strArray51);
        java.util.Map map58 = org.mockito.Matchers.refEq(map35, strArray51);
        org.mockito.Matchers matchers59 = org.mockito.Matchers.refEq(matchers24, strArray51);
        java.util.Map map60 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence61 = null;
        java.util.Map map63 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray66 = new java.lang.String[] { "", "" };
        java.util.Map map67 = org.mockito.Matchers.refEq(map63, strArray66);
        java.lang.CharSequence charSequence68 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray66);
        java.lang.CharSequence charSequence69 = org.mockito.Matchers.refEq(charSequence61, strArray66);
        java.util.Map map70 = org.mockito.Matchers.refEq(map60, strArray66);
        java.lang.Object obj71 = org.mockito.Matchers.eq((java.lang.Object) strArray66);
        org.mockito.Matchers matchers72 = org.mockito.Matchers.refEq(matchers24, strArray66);
        java.lang.String[] strArray73 = org.mockito.Matchers.refEq(strArray9, strArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass74 = strArray73.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(list22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(charSequence33);
        org.junit.Assert.assertNull(charSequence34);
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(type38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map52);
        org.junit.Assert.assertNull(charSequence53);
        org.junit.Assert.assertNull(strArray54);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNull(type56);
        org.junit.Assert.assertNull(serializable57);
        org.junit.Assert.assertNull(map58);
        org.junit.Assert.assertNull(matchers59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map67);
        org.junit.Assert.assertNull(charSequence68);
        org.junit.Assert.assertNull(charSequence69);
        org.junit.Assert.assertNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(matchers72);
        org.junit.Assert.assertNull(strArray73);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Collection collection4 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.lang.Object obj5 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.util.Set set6 = org.mockito.Matchers.eq(set0);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.CharSequence charSequence13 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray11);
        java.util.Set set14 = org.mockito.Matchers.anySet();
        java.util.Set set15 = org.mockito.Matchers.eq(set14);
        java.lang.Iterable iterable16 = org.mockito.Matchers.same((java.lang.Iterable) set14);
        java.util.List list17 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass18 = list17.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass18);
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map32 = org.mockito.Matchers.refEq(map20, strArray31);
        java.lang.reflect.AnnotatedElement annotatedElement33 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass18, strArray31);
        java.util.Collection collection34 = org.mockito.Matchers.refEq((java.util.Collection) set14, strArray31);
        java.util.Set set35 = org.mockito.Matchers.anySet();
        java.util.Set set36 = org.mockito.Matchers.eq(set35);
        java.util.Set set37 = org.mockito.Matchers.same(set35);
        java.util.Set set38 = org.mockito.Matchers.eq(set35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable43 = org.mockito.Matchers.refEq((java.lang.Iterable) set35, strArray42);
        java.lang.String[] strArray44 = org.mockito.Matchers.same(strArray42);
        java.lang.Object obj45 = org.mockito.Matchers.refEq((java.lang.Object) strArray31, strArray44);
        java.lang.String[] strArray46 = org.mockito.Matchers.refEq(strArray11, strArray31);
        java.lang.Object obj47 = org.mockito.Matchers.refEq((java.lang.Object) set0, strArray31);
        java.util.Collection collection48 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Set set49 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable50 = org.mockito.Matchers.eq((java.lang.Iterable) set49);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(set6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(set15);
        org.junit.Assert.assertNull(iterable16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(annotatedElement33);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(set36);
        org.junit.Assert.assertNull(set37);
        org.junit.Assert.assertNull(set38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(collection48);
        org.junit.Assert.assertNull(set49);
        org.junit.Assert.assertNull(iterable50);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.List list3 = org.mockito.Matchers.same(list0);
        java.util.List list4 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass5 = list4.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass5);
        org.mockito.Matchers matchers7 = new org.mockito.Matchers();
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.String str14 = org.mockito.Matchers.refEq("hi!", strArray12);
        org.mockito.Matchers matchers15 = org.mockito.Matchers.refEq(matchers7, strArray12);
        java.lang.reflect.GenericDeclaration genericDeclaration16 = org.mockito.Matchers.refEq(genericDeclaration6, strArray12);
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.CharSequence charSequence23 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray21);
        java.io.Serializable serializable24 = org.mockito.Matchers.refEq((java.io.Serializable) strArray12, strArray21);
        java.util.List list25 = org.mockito.Matchers.refEq(list0, strArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = list25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(genericDeclaration6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNull(genericDeclaration16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNull(list25);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Collection collection2 = org.mockito.Matchers.same((java.util.Collection) set0);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String str12 = org.mockito.Matchers.refEq("hi!", strArray10);
        java.lang.String[] strArray13 = null;
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.CharSequence charSequence20 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray18);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray13, strArray18);
        java.lang.String[] strArray22 = org.mockito.Matchers.refEq(strArray10, strArray18);
        java.lang.Object obj23 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray10);
        java.io.Serializable serializable24 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass4, strArray10);
        java.util.List list25 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass26 = list25.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration27 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass26);
        java.lang.reflect.Type type28 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass26);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.util.Map map34 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.Map map38 = org.mockito.Matchers.refEq(map34, strArray37);
        java.lang.String str39 = org.mockito.Matchers.refEq("hi!", strArray37);
        java.lang.String[] strArray40 = null;
        java.util.Map map42 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.Map map46 = org.mockito.Matchers.refEq(map42, strArray45);
        java.lang.CharSequence charSequence47 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray45);
        java.lang.String[] strArray48 = org.mockito.Matchers.refEq(strArray40, strArray45);
        java.lang.String[] strArray49 = org.mockito.Matchers.refEq(strArray37, strArray45);
        java.lang.Object obj50 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray37);
        java.io.Serializable serializable51 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass31, strArray37);
        java.lang.String str52 = org.mockito.Matchers.refEq("", strArray37);
        java.lang.Class<?> wildcardClass53 = org.mockito.Matchers.refEq(wildcardClass26, strArray37);
        java.io.Serializable serializable54 = org.mockito.Matchers.refEq(serializable24, strArray37);
        java.util.Set set55 = org.mockito.Matchers.refEq(set0, strArray37);
        java.util.Set set56 = org.mockito.Matchers.eq(set55);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(genericDeclaration27);
        org.junit.Assert.assertNull(type28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNull(charSequence47);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(serializable51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(wildcardClass53);
        org.junit.Assert.assertNull(serializable54);
        org.junit.Assert.assertNull(set55);
        org.junit.Assert.assertNull(set56);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.mockito.Matchers.same(annotatedElement0);
        org.junit.Assert.assertNull(annotatedElement1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        java.lang.reflect.AnnotatedElement annotatedElement1 = org.mockito.Matchers.eq(annotatedElement0);
        org.junit.Assert.assertNull(annotatedElement1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map2, strArray13);
        org.mockito.Matchers matchers15 = org.mockito.Matchers.refEq(matchers0, strArray13);
        org.mockito.Matchers matchers16 = new org.mockito.Matchers();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String str23 = org.mockito.Matchers.refEq("hi!", strArray21);
        org.mockito.Matchers matchers24 = org.mockito.Matchers.refEq(matchers16, strArray21);
        org.mockito.Matchers matchers25 = org.mockito.Matchers.refEq(matchers0, strArray21);
        java.lang.Class<?> wildcardClass26 = matchers0.getClass();
        java.util.Map map27 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass28 = map27.getClass();
        java.util.List list29 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass30 = list29.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass30);
        java.util.Map map32 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.Map map36 = org.mockito.Matchers.refEq(map32, strArray35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map44 = org.mockito.Matchers.refEq(map32, strArray43);
        java.lang.reflect.AnnotatedElement annotatedElement45 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass30, strArray43);
        java.lang.reflect.GenericDeclaration genericDeclaration46 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass28, strArray43);
        java.lang.reflect.AnnotatedElement annotatedElement47 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass26, strArray43);
        java.lang.reflect.AnnotatedElement annotatedElement48 = org.mockito.Matchers.eq(annotatedElement47);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(matchers24);
        org.junit.Assert.assertNull(matchers25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map36);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNull(annotatedElement45);
        org.junit.Assert.assertNull(genericDeclaration46);
        org.junit.Assert.assertNull(annotatedElement47);
        org.junit.Assert.assertNull(annotatedElement48);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.io.Serializable serializable0 = null;
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.io.Serializable serializable8 = org.mockito.Matchers.refEq(serializable0, strArray5);
        java.lang.String[] strArray9 = org.mockito.Matchers.eq(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strArray9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray5);
        java.util.List list9 = org.mockito.Matchers.anyList();
        java.util.Collection collection10 = org.mockito.Matchers.eq((java.util.Collection) list9);
        java.lang.Class<?> wildcardClass11 = list9.getClass();
        java.lang.reflect.Type type12 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass11);
        org.mockito.Matchers matchers13 = new org.mockito.Matchers();
        org.mockito.Matchers matchers14 = org.mockito.Matchers.same(matchers13);
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map15, strArray26);
        org.mockito.Matchers matchers28 = org.mockito.Matchers.refEq(matchers13, strArray26);
        java.lang.reflect.GenericDeclaration genericDeclaration29 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass11, strArray26);
        java.io.Serializable serializable30 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray26);
        java.lang.Class<?> wildcardClass31 = strArray26.getClass();
        java.io.Serializable serializable32 = org.mockito.Matchers.eq((java.io.Serializable) strArray26);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(matchers14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(matchers28);
        org.junit.Assert.assertNull(genericDeclaration29);
        org.junit.Assert.assertNull(serializable30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(serializable32);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.CharSequence charSequence1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq(charSequence1, strArray6);
        java.lang.String[] strArray10 = org.mockito.Matchers.same(strArray6);
        java.lang.CharSequence charSequence11 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray10);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence2 = null;
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray7);
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq(charSequence2, strArray7);
        java.util.Map map11 = org.mockito.Matchers.refEq(map1, strArray7);
        java.util.List list12 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        java.lang.reflect.Type type14 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass13);
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map16, strArray19);
        java.lang.String str21 = org.mockito.Matchers.refEq("hi!", strArray19);
        java.lang.String[] strArray22 = null;
        java.util.Map map24 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Map map28 = org.mockito.Matchers.refEq(map24, strArray27);
        java.lang.CharSequence charSequence29 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray27);
        java.lang.String[] strArray30 = org.mockito.Matchers.refEq(strArray22, strArray27);
        java.lang.String[] strArray31 = org.mockito.Matchers.refEq(strArray19, strArray27);
        java.lang.reflect.Type type32 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass13, strArray27);
        java.io.Serializable serializable33 = org.mockito.Matchers.same((java.io.Serializable) strArray27);
        java.util.Map map34 = org.mockito.Matchers.refEq(map11, strArray27);
        org.mockito.Matchers matchers35 = org.mockito.Matchers.refEq(matchers0, strArray27);
        java.util.Map map36 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence37 = null;
        java.util.Map map39 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.Map map43 = org.mockito.Matchers.refEq(map39, strArray42);
        java.lang.CharSequence charSequence44 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray42);
        java.lang.CharSequence charSequence45 = org.mockito.Matchers.refEq(charSequence37, strArray42);
        java.util.Map map46 = org.mockito.Matchers.refEq(map36, strArray42);
        java.lang.Object obj47 = org.mockito.Matchers.eq((java.lang.Object) strArray42);
        org.mockito.Matchers matchers48 = org.mockito.Matchers.refEq(matchers0, strArray42);
        java.lang.Object obj49 = org.mockito.Matchers.same((java.lang.Object) matchers0);
        org.mockito.Matchers matchers50 = org.mockito.Matchers.eq(matchers0);
        org.mockito.Matchers matchers51 = org.mockito.Matchers.same(matchers50);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(charSequence29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNull(type32);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNull(matchers35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map43);
        org.junit.Assert.assertNull(charSequence44);
        org.junit.Assert.assertNull(charSequence45);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(matchers48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(matchers50);
        org.junit.Assert.assertNull(matchers51);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.eq(set0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable8 = org.mockito.Matchers.refEq((java.lang.Iterable) set0, strArray7);
        java.lang.String[] strArray9 = org.mockito.Matchers.same(strArray7);
        java.lang.String[] strArray10 = org.mockito.Matchers.same(strArray7);
        java.lang.String[] strArray11 = org.mockito.Matchers.eq(strArray10);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.lang.Class<?> wildcardClass18 = org.mockito.Matchers.same(wildcardClass17);
        java.lang.Object obj19 = org.mockito.Matchers.same((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Set set3 = org.mockito.Matchers.eq(set0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable8 = org.mockito.Matchers.refEq((java.lang.Iterable) set0, strArray7);
        java.util.Set set10 = org.mockito.Matchers.anySet();
        java.util.Set set11 = org.mockito.Matchers.eq(set10);
        java.util.Set set12 = org.mockito.Matchers.same(set10);
        java.util.Set set13 = org.mockito.Matchers.eq(set10);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable18 = org.mockito.Matchers.refEq((java.lang.Iterable) set10, strArray17);
        java.lang.String[] strArray19 = org.mockito.Matchers.same(strArray17);
        java.lang.CharSequence charSequence20 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray17);
        java.util.Collection collection21 = org.mockito.Matchers.refEq((java.util.Collection) set0, strArray17);
        java.util.Collection collection22 = org.mockito.Matchers.same(collection21);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(set11);
        org.junit.Assert.assertNull(set12);
        org.junit.Assert.assertNull(set13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertNull(collection22);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = org.mockito.Matchers.same(obj0);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.mockito.Matchers.eq(wildcardClass1);
        java.lang.reflect.Type type3 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.String[] strArray8 = null;
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray13);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray8, strArray13);
        java.lang.String[] strArray17 = org.mockito.Matchers.refEq(strArray5, strArray13);
        java.util.Map map18 = org.mockito.Matchers.refEq(map0, strArray5);
        java.util.Set set19 = org.mockito.Matchers.anySet();
        java.util.Set set20 = org.mockito.Matchers.eq(set19);
        java.util.Set set21 = org.mockito.Matchers.same(set19);
        java.util.Set set22 = org.mockito.Matchers.eq(set19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable27 = org.mockito.Matchers.refEq((java.lang.Iterable) set19, strArray26);
        java.lang.String[] strArray28 = org.mockito.Matchers.same(strArray26);
        java.util.Set set29 = org.mockito.Matchers.anySet();
        java.util.Set set30 = org.mockito.Matchers.eq(set29);
        java.lang.Iterable iterable31 = org.mockito.Matchers.same((java.lang.Iterable) set29);
        java.util.List list32 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass33 = list32.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration34 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass33);
        java.lang.reflect.Type type35 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass33);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.util.Map map41 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Map map45 = org.mockito.Matchers.refEq(map41, strArray44);
        java.lang.String str46 = org.mockito.Matchers.refEq("hi!", strArray44);
        java.lang.String[] strArray47 = null;
        java.util.Map map49 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Map map53 = org.mockito.Matchers.refEq(map49, strArray52);
        java.lang.CharSequence charSequence54 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray52);
        java.lang.String[] strArray55 = org.mockito.Matchers.refEq(strArray47, strArray52);
        java.lang.String[] strArray56 = org.mockito.Matchers.refEq(strArray44, strArray52);
        java.lang.Object obj57 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray44);
        java.io.Serializable serializable58 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass38, strArray44);
        java.lang.String str59 = org.mockito.Matchers.refEq("", strArray44);
        java.lang.Class<?> wildcardClass60 = org.mockito.Matchers.refEq(wildcardClass33, strArray44);
        java.util.Set set61 = org.mockito.Matchers.refEq(set29, strArray44);
        java.util.List list63 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass64 = list63.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration65 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass64);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray73 = org.mockito.Matchers.same(strArray72);
        java.io.Serializable serializable74 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass64, strArray72);
        java.lang.Object obj75 = org.mockito.Matchers.refEq((java.lang.Object) false, strArray72);
        java.util.Set set76 = org.mockito.Matchers.refEq(set29, strArray72);
        java.lang.String[] strArray77 = org.mockito.Matchers.refEq(strArray28, strArray72);
        java.util.Map map78 = org.mockito.Matchers.refEq(map0, strArray72);
        java.util.Map map79 = org.mockito.Matchers.same(map0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass80 = map79.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(set20);
        org.junit.Assert.assertNull(set21);
        org.junit.Assert.assertNull(set22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(set30);
        org.junit.Assert.assertNull(iterable31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(genericDeclaration34);
        org.junit.Assert.assertNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertNull(set61);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(genericDeclaration65);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray73);
        org.junit.Assert.assertNull(serializable74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(set76);
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertNull(map78);
        org.junit.Assert.assertNull(map79);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.util.List list2 = org.mockito.Matchers.same(list0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = list2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(list2);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Set set4 = org.mockito.Matchers.eq(set0);
        java.util.Collection collection5 = org.mockito.Matchers.same((java.util.Collection) set0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = collection5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(set4);
        org.junit.Assert.assertNull(collection5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass1);
        org.mockito.Matchers matchers4 = new org.mockito.Matchers();
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String str11 = org.mockito.Matchers.refEq("hi!", strArray9);
        org.mockito.Matchers matchers12 = org.mockito.Matchers.refEq(matchers4, strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.mockito.Matchers matchers14 = new org.mockito.Matchers();
        org.mockito.Matchers matchers15 = org.mockito.Matchers.same(matchers14);
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map16, strArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map28 = org.mockito.Matchers.refEq(map16, strArray27);
        org.mockito.Matchers matchers29 = org.mockito.Matchers.refEq(matchers14, strArray27);
        java.lang.reflect.AnnotatedElement annotatedElement30 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass13, strArray27);
        java.lang.Class<?> wildcardClass31 = org.mockito.Matchers.refEq(wildcardClass1, strArray27);
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.util.Map map37 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.Map map41 = org.mockito.Matchers.refEq(map37, strArray40);
        java.lang.String str42 = org.mockito.Matchers.refEq("hi!", strArray40);
        java.lang.String[] strArray43 = null;
        java.util.Map map45 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.Map map49 = org.mockito.Matchers.refEq(map45, strArray48);
        java.lang.CharSequence charSequence50 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray48);
        java.lang.String[] strArray51 = org.mockito.Matchers.refEq(strArray43, strArray48);
        java.lang.String[] strArray52 = org.mockito.Matchers.refEq(strArray40, strArray48);
        java.lang.Object obj53 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray40);
        java.io.Serializable serializable54 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass34, strArray40);
        java.lang.String str55 = org.mockito.Matchers.refEq("", strArray40);
        java.lang.Object obj56 = org.mockito.Matchers.same((java.lang.Object) strArray40);
        java.io.Serializable serializable57 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass1, strArray40);
        java.util.Set set58 = org.mockito.Matchers.anySet();
        java.util.Set set59 = org.mockito.Matchers.eq(set58);
        java.lang.Iterable iterable60 = org.mockito.Matchers.same((java.lang.Iterable) set58);
        java.util.List list61 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass62 = list61.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration63 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass62);
        java.lang.reflect.Type type64 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass62);
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        java.util.Map map70 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray73 = new java.lang.String[] { "", "" };
        java.util.Map map74 = org.mockito.Matchers.refEq(map70, strArray73);
        java.lang.String str75 = org.mockito.Matchers.refEq("hi!", strArray73);
        java.lang.String[] strArray76 = null;
        java.util.Map map78 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray81 = new java.lang.String[] { "", "" };
        java.util.Map map82 = org.mockito.Matchers.refEq(map78, strArray81);
        java.lang.CharSequence charSequence83 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray81);
        java.lang.String[] strArray84 = org.mockito.Matchers.refEq(strArray76, strArray81);
        java.lang.String[] strArray85 = org.mockito.Matchers.refEq(strArray73, strArray81);
        java.lang.Object obj86 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray73);
        java.io.Serializable serializable87 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass67, strArray73);
        java.lang.String str88 = org.mockito.Matchers.refEq("", strArray73);
        java.lang.Class<?> wildcardClass89 = org.mockito.Matchers.refEq(wildcardClass62, strArray73);
        java.util.Set set90 = org.mockito.Matchers.refEq(set58, strArray73);
        java.lang.reflect.Type type91 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass92 = type91.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(matchers12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(matchers29);
        org.junit.Assert.assertNull(annotatedElement30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNull(charSequence50);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(serializable54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(serializable57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(set59);
        org.junit.Assert.assertNull(iterable60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNull(genericDeclaration63);
        org.junit.Assert.assertNull(type64);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map82);
        org.junit.Assert.assertNull(charSequence83);
        org.junit.Assert.assertNull(strArray84);
        org.junit.Assert.assertNull(strArray85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(serializable87);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNull(wildcardClass89);
        org.junit.Assert.assertNull(set90);
        org.junit.Assert.assertNull(type91);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = org.mockito.Matchers.same(charSequence0);
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq(charSequence1, strArray6);
        java.util.Map map10 = org.mockito.Matchers.refEq(map0, strArray6);
        java.util.List list11 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass12 = list11.getClass();
        java.lang.reflect.Type type13 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass12);
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.String str20 = org.mockito.Matchers.refEq("hi!", strArray18);
        java.lang.String[] strArray21 = null;
        java.util.Map map23 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map23, strArray26);
        java.lang.CharSequence charSequence28 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray26);
        java.lang.String[] strArray29 = org.mockito.Matchers.refEq(strArray21, strArray26);
        java.lang.String[] strArray30 = org.mockito.Matchers.refEq(strArray18, strArray26);
        java.lang.reflect.Type type31 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass12, strArray26);
        java.io.Serializable serializable32 = org.mockito.Matchers.same((java.io.Serializable) strArray26);
        java.util.Map map33 = org.mockito.Matchers.refEq(map10, strArray26);
        java.lang.String[] strArray34 = org.mockito.Matchers.eq(strArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass35 = strArray34.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(charSequence28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(type31);
        org.junit.Assert.assertNull(serializable32);
        org.junit.Assert.assertNull(map33);
        org.junit.Assert.assertNull(strArray34);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.Set set1 = org.mockito.Matchers.anySet();
        java.util.Set set2 = org.mockito.Matchers.eq(set1);
        java.lang.Iterable iterable3 = org.mockito.Matchers.same((java.lang.Iterable) set1);
        java.util.List list4 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass5 = list4.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass5);
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map7, strArray18);
        java.lang.reflect.AnnotatedElement annotatedElement20 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass5, strArray18);
        java.util.Collection collection21 = org.mockito.Matchers.refEq((java.util.Collection) set1, strArray18);
        java.lang.Comparable<java.lang.String> strComparable22 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "", strArray18);
        java.lang.String[] strArray23 = org.mockito.Matchers.eq(strArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = strArray23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(iterable3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(genericDeclaration6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(annotatedElement20);
        org.junit.Assert.assertNull(collection21);
        org.junit.Assert.assertNull(strComparable22);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Set set4 = org.mockito.Matchers.eq(set0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = set4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(set4);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map30 = org.mockito.Matchers.refEq(map18, strArray29);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass17, strArray29);
        java.util.Set set32 = org.mockito.Matchers.anySet();
        java.util.Set set33 = org.mockito.Matchers.eq(set32);
        java.util.Set set34 = org.mockito.Matchers.same(set32);
        java.util.Set set35 = org.mockito.Matchers.eq(set32);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable40 = org.mockito.Matchers.refEq((java.lang.Iterable) set32, strArray39);
        java.lang.Class<?> wildcardClass41 = org.mockito.Matchers.refEq(wildcardClass17, strArray39);
        java.lang.reflect.GenericDeclaration genericDeclaration42 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass17);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(set33);
        org.junit.Assert.assertNull(set34);
        org.junit.Assert.assertNull(set35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable40);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertNull(genericDeclaration42);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass1);
        org.mockito.Matchers matchers4 = new org.mockito.Matchers();
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String str11 = org.mockito.Matchers.refEq("hi!", strArray9);
        org.mockito.Matchers matchers12 = org.mockito.Matchers.refEq(matchers4, strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.mockito.Matchers matchers14 = new org.mockito.Matchers();
        org.mockito.Matchers matchers15 = org.mockito.Matchers.same(matchers14);
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map16, strArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map28 = org.mockito.Matchers.refEq(map16, strArray27);
        org.mockito.Matchers matchers29 = org.mockito.Matchers.refEq(matchers14, strArray27);
        java.lang.reflect.AnnotatedElement annotatedElement30 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass13, strArray27);
        java.lang.Class<?> wildcardClass31 = org.mockito.Matchers.refEq(wildcardClass1, strArray27);
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.util.Map map37 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.Map map41 = org.mockito.Matchers.refEq(map37, strArray40);
        java.lang.String str42 = org.mockito.Matchers.refEq("hi!", strArray40);
        java.lang.String[] strArray43 = null;
        java.util.Map map45 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.Map map49 = org.mockito.Matchers.refEq(map45, strArray48);
        java.lang.CharSequence charSequence50 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray48);
        java.lang.String[] strArray51 = org.mockito.Matchers.refEq(strArray43, strArray48);
        java.lang.String[] strArray52 = org.mockito.Matchers.refEq(strArray40, strArray48);
        java.lang.Object obj53 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray40);
        java.io.Serializable serializable54 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass34, strArray40);
        java.lang.String str55 = org.mockito.Matchers.refEq("", strArray40);
        java.lang.Object obj56 = org.mockito.Matchers.same((java.lang.Object) strArray40);
        java.io.Serializable serializable57 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass1, strArray40);
        java.io.Serializable serializable58 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(matchers12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(matchers15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(matchers29);
        org.junit.Assert.assertNull(annotatedElement30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNull(charSequence50);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(serializable54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(serializable57);
        org.junit.Assert.assertNull(serializable58);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.String[] strArray9 = org.mockito.Matchers.refEq(strArray1, strArray6);
        java.util.List list10 = org.mockito.Matchers.refEq(list0, strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        java.util.Set set12 = org.mockito.Matchers.anySet();
        java.util.Set set13 = org.mockito.Matchers.eq(set12);
        java.util.Set set14 = org.mockito.Matchers.same(set12);
        java.util.Set set15 = org.mockito.Matchers.eq(set12);
        java.util.Set set16 = org.mockito.Matchers.same(set12);
        java.util.Set set17 = org.mockito.Matchers.anySet();
        java.util.Set set18 = org.mockito.Matchers.eq(set17);
        java.lang.Iterable iterable19 = org.mockito.Matchers.same((java.lang.Iterable) set17);
        java.util.List list20 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass21 = list20.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration22 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass21);
        java.util.Map map23 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map23, strArray26);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map35 = org.mockito.Matchers.refEq(map23, strArray34);
        java.lang.reflect.AnnotatedElement annotatedElement36 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass21, strArray34);
        java.util.Collection collection37 = org.mockito.Matchers.refEq((java.util.Collection) set17, strArray34);
        java.util.Map map38 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.Map map42 = org.mockito.Matchers.refEq(map38, strArray41);
        java.lang.Iterable iterable43 = org.mockito.Matchers.refEq((java.lang.Iterable) set17, strArray41);
        java.io.Serializable serializable44 = org.mockito.Matchers.eq((java.io.Serializable) strArray41);
        java.util.Set set45 = org.mockito.Matchers.refEq(set16, strArray41);
        java.lang.Class<?> wildcardClass46 = org.mockito.Matchers.refEq(wildcardClass11, strArray41);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(set13);
        org.junit.Assert.assertNull(set14);
        org.junit.Assert.assertNull(set15);
        org.junit.Assert.assertNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(set18);
        org.junit.Assert.assertNull(iterable19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(genericDeclaration22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNull(annotatedElement36);
        org.junit.Assert.assertNull(collection37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNull(iterable43);
        org.junit.Assert.assertNull(serializable44);
        org.junit.Assert.assertNull(set45);
        org.junit.Assert.assertNull(wildcardClass46);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map3, strArray14);
        java.lang.CharSequence charSequence16 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray14);
        java.util.Set set17 = org.mockito.Matchers.refEq(set0, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = set17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(set17);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Class<?> wildcardClass2 = list0.getClass();
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray13 = org.mockito.Matchers.same(strArray12);
        java.io.Serializable serializable14 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass4, strArray12);
        java.lang.Class<?> wildcardClass15 = org.mockito.Matchers.refEq(wildcardClass2, strArray12);
        java.lang.reflect.GenericDeclaration genericDeclaration16 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass15);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(genericDeclaration16);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map1 = org.mockito.Matchers.eq(map0);
        org.mockito.Matchers matchers2 = new org.mockito.Matchers();
        org.mockito.Matchers matchers3 = org.mockito.Matchers.same(matchers2);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.CharSequence charSequence11 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray9);
        java.io.Serializable serializable12 = org.mockito.Matchers.refEq((java.io.Serializable) 100.0f, strArray9);
        org.mockito.Matchers matchers13 = org.mockito.Matchers.refEq(matchers3, strArray9);
        java.util.Map map14 = org.mockito.Matchers.refEq(map0, strArray9);
        java.util.Map map15 = org.mockito.Matchers.eq(map14);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(matchers3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNull(matchers13);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(map15);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Class<?> wildcardClass2 = list0.getClass();
        java.lang.Class<?> wildcardClass3 = org.mockito.Matchers.eq(wildcardClass2);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String str11 = org.mockito.Matchers.refEq("hi!", strArray9);
        java.lang.String[] strArray12 = null;
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map14, strArray17);
        java.lang.CharSequence charSequence19 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray17);
        java.lang.String[] strArray20 = org.mockito.Matchers.refEq(strArray12, strArray17);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray9, strArray17);
        java.util.Map map22 = org.mockito.Matchers.refEq(map4, strArray9);
        java.lang.reflect.GenericDeclaration genericDeclaration23 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray9);
        java.lang.reflect.AnnotatedElement annotatedElement24 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass2);
        java.lang.reflect.Type type25 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(genericDeclaration23);
        org.junit.Assert.assertNull(annotatedElement24);
        org.junit.Assert.assertNull(type25);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map8, strArray19);
        java.lang.reflect.AnnotatedElement annotatedElement21 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray19);
        java.lang.reflect.GenericDeclaration genericDeclaration22 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray19);
        java.lang.String[] strArray23 = org.mockito.Matchers.eq(strArray19);
        java.util.List list24 = org.mockito.Matchers.refEq(list0, strArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = strArray23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(annotatedElement21);
        org.junit.Assert.assertNull(genericDeclaration22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(list24);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray5);
        java.util.List list9 = org.mockito.Matchers.anyList();
        java.util.Collection collection10 = org.mockito.Matchers.eq((java.util.Collection) list9);
        java.lang.Class<?> wildcardClass11 = list9.getClass();
        java.lang.reflect.Type type12 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass11);
        org.mockito.Matchers matchers13 = new org.mockito.Matchers();
        org.mockito.Matchers matchers14 = org.mockito.Matchers.same(matchers13);
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map15, strArray26);
        org.mockito.Matchers matchers28 = org.mockito.Matchers.refEq(matchers13, strArray26);
        java.lang.reflect.GenericDeclaration genericDeclaration29 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass11, strArray26);
        java.io.Serializable serializable30 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray26);
        java.lang.Class<?> wildcardClass31 = strArray26.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration32 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass31);
        java.lang.reflect.AnnotatedElement annotatedElement33 = org.mockito.Matchers.eq((java.lang.reflect.AnnotatedElement) genericDeclaration32);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(matchers14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(matchers28);
        org.junit.Assert.assertNull(genericDeclaration29);
        org.junit.Assert.assertNull(serializable30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(genericDeclaration32);
        org.junit.Assert.assertNull(annotatedElement33);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence2 = null;
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray7);
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq(charSequence2, strArray7);
        java.util.Map map11 = org.mockito.Matchers.refEq(map1, strArray7);
        java.util.List list12 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        java.lang.reflect.Type type14 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass13);
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map16, strArray19);
        java.lang.String str21 = org.mockito.Matchers.refEq("hi!", strArray19);
        java.lang.String[] strArray22 = null;
        java.util.Map map24 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Map map28 = org.mockito.Matchers.refEq(map24, strArray27);
        java.lang.CharSequence charSequence29 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray27);
        java.lang.String[] strArray30 = org.mockito.Matchers.refEq(strArray22, strArray27);
        java.lang.String[] strArray31 = org.mockito.Matchers.refEq(strArray19, strArray27);
        java.lang.reflect.Type type32 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass13, strArray27);
        java.io.Serializable serializable33 = org.mockito.Matchers.same((java.io.Serializable) strArray27);
        java.util.Map map34 = org.mockito.Matchers.refEq(map11, strArray27);
        org.mockito.Matchers matchers35 = org.mockito.Matchers.refEq(matchers0, strArray27);
        java.util.Map map36 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence37 = null;
        java.util.Map map39 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.Map map43 = org.mockito.Matchers.refEq(map39, strArray42);
        java.lang.CharSequence charSequence44 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray42);
        java.lang.CharSequence charSequence45 = org.mockito.Matchers.refEq(charSequence37, strArray42);
        java.util.Map map46 = org.mockito.Matchers.refEq(map36, strArray42);
        java.lang.Object obj47 = org.mockito.Matchers.eq((java.lang.Object) strArray42);
        org.mockito.Matchers matchers48 = org.mockito.Matchers.refEq(matchers0, strArray42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass49 = matchers48.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(charSequence29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNull(type32);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNull(matchers35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map43);
        org.junit.Assert.assertNull(charSequence44);
        org.junit.Assert.assertNull(charSequence45);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(matchers48);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.List list3 = org.mockito.Matchers.eq(list0);
        java.lang.Class<?> wildcardClass4 = list0.getClass();
        java.io.Serializable serializable5 = org.mockito.Matchers.same((java.io.Serializable) wildcardClass4);
        java.util.List list6 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass7 = list6.getClass();
        java.lang.reflect.Type type8 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass7);
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.String str15 = org.mockito.Matchers.refEq("hi!", strArray13);
        java.lang.String[] strArray16 = null;
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.CharSequence charSequence23 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray21);
        java.lang.String[] strArray24 = org.mockito.Matchers.refEq(strArray16, strArray21);
        java.lang.String[] strArray25 = org.mockito.Matchers.refEq(strArray13, strArray21);
        java.lang.reflect.Type type26 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass7, strArray21);
        java.lang.reflect.GenericDeclaration genericDeclaration27 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = genericDeclaration27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(serializable5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNull(type26);
        org.junit.Assert.assertNull(genericDeclaration27);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        org.mockito.Matchers matchers8 = org.mockito.Matchers.refEq(matchers0, strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        org.mockito.Matchers matchers10 = new org.mockito.Matchers();
        org.mockito.Matchers matchers11 = org.mockito.Matchers.same(matchers10);
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map12, strArray23);
        org.mockito.Matchers matchers25 = org.mockito.Matchers.refEq(matchers10, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement26 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass9, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.Matchers.same(annotatedElement26);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(matchers8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(matchers11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(matchers25);
        org.junit.Assert.assertNull(annotatedElement26);
        org.junit.Assert.assertNull(annotatedElement27);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.reflect.Type type6 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass4);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.String str17 = org.mockito.Matchers.refEq("hi!", strArray15);
        java.lang.String[] strArray18 = null;
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.CharSequence charSequence25 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray23);
        java.lang.String[] strArray26 = org.mockito.Matchers.refEq(strArray18, strArray23);
        java.lang.String[] strArray27 = org.mockito.Matchers.refEq(strArray15, strArray23);
        java.lang.Object obj28 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray15);
        java.io.Serializable serializable29 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass9, strArray15);
        java.lang.String str30 = org.mockito.Matchers.refEq("", strArray15);
        java.lang.Class<?> wildcardClass31 = org.mockito.Matchers.refEq(wildcardClass4, strArray15);
        java.util.Set set32 = org.mockito.Matchers.refEq(set0, strArray15);
        java.util.List list34 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass35 = list34.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration36 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray44 = org.mockito.Matchers.same(strArray43);
        java.io.Serializable serializable45 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass35, strArray43);
        java.lang.Object obj46 = org.mockito.Matchers.refEq((java.lang.Object) false, strArray43);
        java.util.Set set47 = org.mockito.Matchers.refEq(set0, strArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass48 = set47.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNull(set32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(genericDeclaration36);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(serializable45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(set47);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String str11 = org.mockito.Matchers.refEq("hi!", strArray9);
        java.lang.String[] strArray12 = null;
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map14, strArray17);
        java.lang.CharSequence charSequence19 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray17);
        java.lang.String[] strArray20 = org.mockito.Matchers.refEq(strArray12, strArray17);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray9, strArray17);
        java.lang.Object obj22 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray9);
        java.io.Serializable serializable23 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass3, strArray9);
        java.lang.String str24 = org.mockito.Matchers.refEq("", strArray9);
        java.util.Map map26 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.Map map30 = org.mockito.Matchers.refEq(map26, strArray29);
        java.lang.String str31 = org.mockito.Matchers.refEq("hi!", strArray29);
        java.lang.String[] strArray32 = org.mockito.Matchers.refEq(strArray9, strArray29);
        java.lang.Comparable<java.lang.String> strComparable33 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass34 = strComparable33.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(serializable23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNull(strComparable33);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = org.mockito.Matchers.same(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.Object obj1 = org.mockito.Matchers.same((java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Map map9 = org.mockito.Matchers.refEq(map5, strArray8);
        java.lang.String str10 = org.mockito.Matchers.refEq("hi!", strArray8);
        java.lang.String[] strArray11 = null;
        java.util.Map map13 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Map map17 = org.mockito.Matchers.refEq(map13, strArray16);
        java.lang.CharSequence charSequence18 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray16);
        java.lang.String[] strArray19 = org.mockito.Matchers.refEq(strArray11, strArray16);
        java.lang.String[] strArray20 = org.mockito.Matchers.refEq(strArray8, strArray16);
        java.lang.Object obj21 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray8);
        java.io.Serializable serializable22 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass2, strArray8);
        java.lang.String str23 = org.mockito.Matchers.refEq("", strArray8);
        java.lang.Object obj24 = org.mockito.Matchers.same((java.lang.Object) strArray8);
        java.lang.Class<?> wildcardClass25 = strArray8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(serializable22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String str9 = org.mockito.Matchers.refEq("hi!", strArray7);
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray7);
        java.util.List list11 = org.mockito.Matchers.anyList();
        java.util.Collection collection12 = org.mockito.Matchers.eq((java.util.Collection) list11);
        java.lang.Class<?> wildcardClass13 = list11.getClass();
        java.lang.reflect.Type type14 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass13);
        org.mockito.Matchers matchers15 = new org.mockito.Matchers();
        org.mockito.Matchers matchers16 = org.mockito.Matchers.same(matchers15);
        java.util.Map map17 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Map map21 = org.mockito.Matchers.refEq(map17, strArray20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map29 = org.mockito.Matchers.refEq(map17, strArray28);
        org.mockito.Matchers matchers30 = org.mockito.Matchers.refEq(matchers15, strArray28);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass13, strArray28);
        java.io.Serializable serializable32 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray28);
        org.mockito.Matchers matchers33 = org.mockito.Matchers.refEq(matchers0, strArray28);
        org.mockito.Matchers matchers34 = org.mockito.Matchers.same(matchers33);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(matchers16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNull(matchers30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNull(serializable32);
        org.junit.Assert.assertNull(matchers33);
        org.junit.Assert.assertNull(matchers34);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.reflect.Type type6 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass4);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.String str17 = org.mockito.Matchers.refEq("hi!", strArray15);
        java.lang.String[] strArray18 = null;
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.CharSequence charSequence25 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray23);
        java.lang.String[] strArray26 = org.mockito.Matchers.refEq(strArray18, strArray23);
        java.lang.String[] strArray27 = org.mockito.Matchers.refEq(strArray15, strArray23);
        java.lang.Object obj28 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray15);
        java.io.Serializable serializable29 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass9, strArray15);
        java.lang.String str30 = org.mockito.Matchers.refEq("", strArray15);
        java.lang.Class<?> wildcardClass31 = org.mockito.Matchers.refEq(wildcardClass4, strArray15);
        java.util.Set set32 = org.mockito.Matchers.refEq(set0, strArray15);
        java.lang.Iterable iterable33 = org.mockito.Matchers.same((java.lang.Iterable) set32);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNull(set32);
        org.junit.Assert.assertNull(iterable33);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.reflect.Type type3 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass1);
        java.lang.Class<?> wildcardClass4 = org.mockito.Matchers.eq(wildcardClass1);
        java.io.Serializable serializable5 = org.mockito.Matchers.same((java.io.Serializable) wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.mockito.Matchers.eq(annotatedElement6);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(serializable5);
        org.junit.Assert.assertNull(annotatedElement6);
        org.junit.Assert.assertNull(annotatedElement7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement3 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass1);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.reflect.Type type6 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass5);
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass5);
        org.mockito.Matchers matchers8 = new org.mockito.Matchers();
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.String str15 = org.mockito.Matchers.refEq("hi!", strArray13);
        org.mockito.Matchers matchers16 = org.mockito.Matchers.refEq(matchers8, strArray13);
        java.lang.Class<?> wildcardClass17 = strArray13.getClass();
        org.mockito.Matchers matchers18 = new org.mockito.Matchers();
        org.mockito.Matchers matchers19 = org.mockito.Matchers.same(matchers18);
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map32 = org.mockito.Matchers.refEq(map20, strArray31);
        org.mockito.Matchers matchers33 = org.mockito.Matchers.refEq(matchers18, strArray31);
        java.lang.reflect.AnnotatedElement annotatedElement34 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass17, strArray31);
        java.lang.Class<?> wildcardClass35 = org.mockito.Matchers.refEq(wildcardClass5, strArray31);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.util.Map map41 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Map map45 = org.mockito.Matchers.refEq(map41, strArray44);
        java.lang.String str46 = org.mockito.Matchers.refEq("hi!", strArray44);
        java.lang.String[] strArray47 = null;
        java.util.Map map49 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Map map53 = org.mockito.Matchers.refEq(map49, strArray52);
        java.lang.CharSequence charSequence54 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray52);
        java.lang.String[] strArray55 = org.mockito.Matchers.refEq(strArray47, strArray52);
        java.lang.String[] strArray56 = org.mockito.Matchers.refEq(strArray44, strArray52);
        java.lang.Object obj57 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray44);
        java.io.Serializable serializable58 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass38, strArray44);
        java.lang.String str59 = org.mockito.Matchers.refEq("", strArray44);
        java.lang.Object obj60 = org.mockito.Matchers.same((java.lang.Object) strArray44);
        java.io.Serializable serializable61 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass5, strArray44);
        java.lang.reflect.Type type62 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass1, strArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass63 = type62.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(annotatedElement3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(matchers16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(matchers19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(matchers33);
        org.junit.Assert.assertNull(annotatedElement34);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(serializable61);
        org.junit.Assert.assertNull(type62);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.String[] strArray1 = null;
        java.lang.Comparable<java.lang.String> strComparable2 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "", strArray1);
        org.junit.Assert.assertNull(strComparable2);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "" };
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.util.List list7 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable8 = org.mockito.Matchers.eq((java.lang.Iterable) list7);
        java.util.List list9 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration11 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass10);
        java.lang.reflect.Type type12 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass10);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String str23 = org.mockito.Matchers.refEq("hi!", strArray21);
        java.lang.String[] strArray24 = null;
        java.util.Map map26 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.Map map30 = org.mockito.Matchers.refEq(map26, strArray29);
        java.lang.CharSequence charSequence31 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray29);
        java.lang.String[] strArray32 = org.mockito.Matchers.refEq(strArray24, strArray29);
        java.lang.String[] strArray33 = org.mockito.Matchers.refEq(strArray21, strArray29);
        java.lang.Object obj34 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray21);
        java.io.Serializable serializable35 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass15, strArray21);
        java.lang.String str36 = org.mockito.Matchers.refEq("", strArray21);
        java.lang.Class<?> wildcardClass37 = org.mockito.Matchers.refEq(wildcardClass10, strArray21);
        java.lang.Iterable iterable38 = org.mockito.Matchers.refEq(iterable8, strArray21);
        java.lang.String[] strArray39 = org.mockito.Matchers.eq(strArray21);
        java.lang.String[] strArray40 = org.mockito.Matchers.refEq(strArray5, strArray21);
        java.lang.String str41 = org.mockito.Matchers.refEq("", strArray40);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(iterable8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(genericDeclaration11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(charSequence31);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(serializable35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNull(iterable38);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray10 = org.mockito.Matchers.same(strArray9);
        java.io.Serializable serializable11 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass1, strArray9);
        java.lang.reflect.Type type12 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        java.lang.Object obj13 = org.mockito.Matchers.same((java.lang.Object) type12);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Class<?> wildcardClass2 = list0.getClass();
        java.lang.Class<?> wildcardClass3 = org.mockito.Matchers.eq(wildcardClass2);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String str11 = org.mockito.Matchers.refEq("hi!", strArray9);
        java.lang.String[] strArray12 = null;
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map14, strArray17);
        java.lang.CharSequence charSequence19 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray17);
        java.lang.String[] strArray20 = org.mockito.Matchers.refEq(strArray12, strArray17);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray9, strArray17);
        java.util.Map map22 = org.mockito.Matchers.refEq(map4, strArray9);
        java.lang.reflect.GenericDeclaration genericDeclaration23 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray9);
        java.lang.reflect.AnnotatedElement annotatedElement24 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass2);
        java.lang.Object obj25 = org.mockito.Matchers.eq((java.lang.Object) annotatedElement24);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(genericDeclaration23);
        org.junit.Assert.assertNull(annotatedElement24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.List list3 = org.mockito.Matchers.eq(list0);
        java.util.List list4 = org.mockito.Matchers.same(list3);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertNull(list4);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray5);
        java.util.List list9 = org.mockito.Matchers.anyList();
        java.util.Collection collection10 = org.mockito.Matchers.eq((java.util.Collection) list9);
        java.lang.Class<?> wildcardClass11 = list9.getClass();
        java.lang.reflect.Type type12 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass11);
        org.mockito.Matchers matchers13 = new org.mockito.Matchers();
        org.mockito.Matchers matchers14 = org.mockito.Matchers.same(matchers13);
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map15, strArray26);
        org.mockito.Matchers matchers28 = org.mockito.Matchers.refEq(matchers13, strArray26);
        java.lang.reflect.GenericDeclaration genericDeclaration29 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass11, strArray26);
        java.io.Serializable serializable30 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray26);
        java.lang.Class<?> wildcardClass31 = strArray26.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration32 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = org.mockito.Matchers.same(wildcardClass31);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(matchers14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(matchers28);
        org.junit.Assert.assertNull(genericDeclaration29);
        org.junit.Assert.assertNull(serializable30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(genericDeclaration32);
        org.junit.Assert.assertNull(wildcardClass33);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map3, strArray14);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray14);
        java.io.Serializable serializable17 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass1);
        java.lang.reflect.Type type18 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.AnnotatedElement annotatedElement19 = org.mockito.Matchers.same((java.lang.reflect.AnnotatedElement) wildcardClass1);
        java.io.Serializable serializable20 = org.mockito.Matchers.same((java.io.Serializable) wildcardClass1);
        java.lang.String[] strArray21 = null;
        java.util.Map map23 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map23, strArray26);
        java.lang.CharSequence charSequence28 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray26);
        java.lang.String[] strArray29 = org.mockito.Matchers.refEq(strArray21, strArray26);
        java.lang.Object obj30 = org.mockito.Matchers.refEq((java.lang.Object) wildcardClass1, strArray29);
        java.lang.Class<?> wildcardClass31 = org.mockito.Matchers.same(wildcardClass1);
        java.lang.reflect.GenericDeclaration genericDeclaration32 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass31);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(annotatedElement16);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertNull(annotatedElement19);
        org.junit.Assert.assertNull(serializable20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(charSequence28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNull(genericDeclaration32);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String[] strArray1 = null;
        java.lang.CharSequence charSequence2 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray1);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.String str6 = org.mockito.Matchers.refEq("hi!", strArray4);
        java.lang.String[] strArray7 = null;
        java.util.Map map9 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Map map13 = org.mockito.Matchers.refEq(map9, strArray12);
        java.lang.CharSequence charSequence14 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray12);
        java.lang.String[] strArray15 = org.mockito.Matchers.refEq(strArray7, strArray12);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray4, strArray12);
        java.lang.Class<?> wildcardClass17 = strArray12.getClass();
        java.util.Map map18 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Map map22 = org.mockito.Matchers.refEq(map18, strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map30 = org.mockito.Matchers.refEq(map18, strArray29);
        java.lang.reflect.GenericDeclaration genericDeclaration31 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass17, strArray29);
        java.lang.Class<?> wildcardClass32 = strArray29.getClass();
        java.io.Serializable serializable33 = org.mockito.Matchers.same((java.io.Serializable) wildcardClass32);
        java.lang.String[] strArray34 = null;
        java.lang.reflect.AnnotatedElement annotatedElement35 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass32, strArray34);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(genericDeclaration31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNull(annotatedElement35);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.String[] strArray8 = null;
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray13);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray8, strArray13);
        java.lang.String[] strArray17 = org.mockito.Matchers.refEq(strArray5, strArray13);
        java.util.Map map18 = org.mockito.Matchers.refEq(map0, strArray5);
        java.util.Map map19 = org.mockito.Matchers.same(map18);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        org.mockito.Matchers matchers3 = new org.mockito.Matchers();
        org.mockito.Matchers matchers4 = org.mockito.Matchers.eq(matchers3);
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass6);
        org.mockito.Matchers matchers8 = new org.mockito.Matchers();
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.String str15 = org.mockito.Matchers.refEq("hi!", strArray13);
        org.mockito.Matchers matchers16 = org.mockito.Matchers.refEq(matchers8, strArray13);
        java.lang.reflect.GenericDeclaration genericDeclaration17 = org.mockito.Matchers.refEq(genericDeclaration7, strArray13);
        java.lang.Object obj18 = org.mockito.Matchers.eq((java.lang.Object) strArray13);
        org.mockito.Matchers matchers19 = org.mockito.Matchers.refEq(matchers4, strArray13);
        java.util.Set set20 = org.mockito.Matchers.refEq(set0, strArray13);
        java.util.Set set21 = org.mockito.Matchers.same(set0);
        java.util.Map map22 = org.mockito.Matchers.anyMap();
        java.util.Map map23 = org.mockito.Matchers.eq(map22);
        org.mockito.Matchers matchers24 = new org.mockito.Matchers();
        org.mockito.Matchers matchers25 = org.mockito.Matchers.same(matchers24);
        java.util.Map map28 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Map map32 = org.mockito.Matchers.refEq(map28, strArray31);
        java.lang.CharSequence charSequence33 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray31);
        java.io.Serializable serializable34 = org.mockito.Matchers.refEq((java.io.Serializable) 100.0f, strArray31);
        org.mockito.Matchers matchers35 = org.mockito.Matchers.refEq(matchers25, strArray31);
        java.util.Map map36 = org.mockito.Matchers.refEq(map22, strArray31);
        java.util.List list37 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass38 = list37.getClass();
        java.lang.reflect.Type type39 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass38);
        java.util.Map map41 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Map map45 = org.mockito.Matchers.refEq(map41, strArray44);
        java.lang.String str46 = org.mockito.Matchers.refEq("hi!", strArray44);
        java.lang.String[] strArray47 = null;
        java.util.Map map49 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Map map53 = org.mockito.Matchers.refEq(map49, strArray52);
        java.lang.CharSequence charSequence54 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray52);
        java.lang.String[] strArray55 = org.mockito.Matchers.refEq(strArray47, strArray52);
        java.lang.String[] strArray56 = org.mockito.Matchers.refEq(strArray44, strArray52);
        java.lang.reflect.Type type57 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass38, strArray52);
        java.io.Serializable serializable58 = org.mockito.Matchers.same((java.io.Serializable) strArray52);
        java.lang.String[] strArray59 = org.mockito.Matchers.refEq(strArray31, strArray52);
        java.util.Set set60 = org.mockito.Matchers.refEq(set21, strArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass61 = set21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(matchers4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(matchers16);
        org.junit.Assert.assertNull(genericDeclaration17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(matchers19);
        org.junit.Assert.assertNull(set20);
        org.junit.Assert.assertNull(set21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(matchers25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(charSequence33);
        org.junit.Assert.assertNull(serializable34);
        org.junit.Assert.assertNull(matchers35);
        org.junit.Assert.assertNull(map36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(type39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNull(type57);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertNull(strArray59);
        org.junit.Assert.assertNull(set60);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Collection collection4 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.lang.Object obj5 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.util.Set set6 = org.mockito.Matchers.eq(set0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = set6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(set6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Collection collection4 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.lang.Object obj5 = org.mockito.Matchers.same((java.lang.Object) set0);
        java.util.Set set6 = org.mockito.Matchers.eq(set0);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.CharSequence charSequence13 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray11);
        java.util.Set set14 = org.mockito.Matchers.anySet();
        java.util.Set set15 = org.mockito.Matchers.eq(set14);
        java.lang.Iterable iterable16 = org.mockito.Matchers.same((java.lang.Iterable) set14);
        java.util.List list17 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass18 = list17.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration19 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass18);
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map32 = org.mockito.Matchers.refEq(map20, strArray31);
        java.lang.reflect.AnnotatedElement annotatedElement33 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass18, strArray31);
        java.util.Collection collection34 = org.mockito.Matchers.refEq((java.util.Collection) set14, strArray31);
        java.util.Set set35 = org.mockito.Matchers.anySet();
        java.util.Set set36 = org.mockito.Matchers.eq(set35);
        java.util.Set set37 = org.mockito.Matchers.same(set35);
        java.util.Set set38 = org.mockito.Matchers.eq(set35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable43 = org.mockito.Matchers.refEq((java.lang.Iterable) set35, strArray42);
        java.lang.String[] strArray44 = org.mockito.Matchers.same(strArray42);
        java.lang.Object obj45 = org.mockito.Matchers.refEq((java.lang.Object) strArray31, strArray44);
        java.lang.String[] strArray46 = org.mockito.Matchers.refEq(strArray11, strArray31);
        java.lang.Object obj47 = org.mockito.Matchers.refEq((java.lang.Object) set0, strArray31);
        java.util.Collection collection48 = org.mockito.Matchers.eq((java.util.Collection) set0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass49 = collection48.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(collection4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(set6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(set15);
        org.junit.Assert.assertNull(iterable16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(genericDeclaration19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(annotatedElement33);
        org.junit.Assert.assertNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(set36);
        org.junit.Assert.assertNull(set37);
        org.junit.Assert.assertNull(set38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(collection48);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Map map5 = org.mockito.Matchers.refEq(map1, strArray4);
        java.lang.CharSequence charSequence6 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = charSequence6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.String[] strArray8 = null;
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray13);
        java.lang.String[] strArray16 = org.mockito.Matchers.refEq(strArray8, strArray13);
        java.lang.String[] strArray17 = org.mockito.Matchers.refEq(strArray5, strArray13);
        java.util.Map map18 = org.mockito.Matchers.refEq(map0, strArray5);
        java.util.Set set19 = org.mockito.Matchers.anySet();
        java.util.Set set20 = org.mockito.Matchers.eq(set19);
        java.util.Set set21 = org.mockito.Matchers.same(set19);
        java.util.Set set22 = org.mockito.Matchers.eq(set19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable27 = org.mockito.Matchers.refEq((java.lang.Iterable) set19, strArray26);
        java.lang.String[] strArray28 = org.mockito.Matchers.same(strArray26);
        java.util.Set set29 = org.mockito.Matchers.anySet();
        java.util.Set set30 = org.mockito.Matchers.eq(set29);
        java.lang.Iterable iterable31 = org.mockito.Matchers.same((java.lang.Iterable) set29);
        java.util.List list32 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass33 = list32.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration34 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass33);
        java.lang.reflect.Type type35 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass33);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.util.Map map41 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Map map45 = org.mockito.Matchers.refEq(map41, strArray44);
        java.lang.String str46 = org.mockito.Matchers.refEq("hi!", strArray44);
        java.lang.String[] strArray47 = null;
        java.util.Map map49 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Map map53 = org.mockito.Matchers.refEq(map49, strArray52);
        java.lang.CharSequence charSequence54 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray52);
        java.lang.String[] strArray55 = org.mockito.Matchers.refEq(strArray47, strArray52);
        java.lang.String[] strArray56 = org.mockito.Matchers.refEq(strArray44, strArray52);
        java.lang.Object obj57 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray44);
        java.io.Serializable serializable58 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass38, strArray44);
        java.lang.String str59 = org.mockito.Matchers.refEq("", strArray44);
        java.lang.Class<?> wildcardClass60 = org.mockito.Matchers.refEq(wildcardClass33, strArray44);
        java.util.Set set61 = org.mockito.Matchers.refEq(set29, strArray44);
        java.util.List list63 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass64 = list63.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration65 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass64);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray73 = org.mockito.Matchers.same(strArray72);
        java.io.Serializable serializable74 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass64, strArray72);
        java.lang.Object obj75 = org.mockito.Matchers.refEq((java.lang.Object) false, strArray72);
        java.util.Set set76 = org.mockito.Matchers.refEq(set29, strArray72);
        java.lang.String[] strArray77 = org.mockito.Matchers.refEq(strArray28, strArray72);
        java.util.Map map78 = org.mockito.Matchers.refEq(map0, strArray72);
        java.util.Map map79 = org.mockito.Matchers.same(map0);
        java.util.Map map80 = org.mockito.Matchers.same(map0);
        java.util.Map map81 = org.mockito.Matchers.same(map80);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(set20);
        org.junit.Assert.assertNull(set21);
        org.junit.Assert.assertNull(set22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(set30);
        org.junit.Assert.assertNull(iterable31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(genericDeclaration34);
        org.junit.Assert.assertNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(wildcardClass60);
        org.junit.Assert.assertNull(set61);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(genericDeclaration65);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray73);
        org.junit.Assert.assertNull(serializable74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(set76);
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertNull(map78);
        org.junit.Assert.assertNull(map79);
        org.junit.Assert.assertNull(map80);
        org.junit.Assert.assertNull(map81);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        org.mockito.Matchers matchers3 = new org.mockito.Matchers();
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Map map9 = org.mockito.Matchers.refEq(map5, strArray8);
        java.lang.String str10 = org.mockito.Matchers.refEq("hi!", strArray8);
        org.mockito.Matchers matchers11 = org.mockito.Matchers.refEq(matchers3, strArray8);
        java.lang.reflect.GenericDeclaration genericDeclaration12 = org.mockito.Matchers.refEq(genericDeclaration2, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = genericDeclaration2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(matchers11);
        org.junit.Assert.assertNull(genericDeclaration12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        org.mockito.Matchers matchers8 = org.mockito.Matchers.refEq(matchers0, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = matchers8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(matchers8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map3, strArray14);
        java.lang.reflect.AnnotatedElement annotatedElement16 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = annotatedElement16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(annotatedElement16);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Set set4 = org.mockito.Matchers.same(set0);
        java.lang.Class<?> wildcardClass5 = set0.getClass();
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(set4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence2 = null;
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray7);
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq(charSequence2, strArray7);
        java.util.Map map11 = org.mockito.Matchers.refEq(map1, strArray7);
        java.util.List list12 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        java.lang.reflect.Type type14 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass13);
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map16, strArray19);
        java.lang.String str21 = org.mockito.Matchers.refEq("hi!", strArray19);
        java.lang.String[] strArray22 = null;
        java.util.Map map24 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Map map28 = org.mockito.Matchers.refEq(map24, strArray27);
        java.lang.CharSequence charSequence29 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray27);
        java.lang.String[] strArray30 = org.mockito.Matchers.refEq(strArray22, strArray27);
        java.lang.String[] strArray31 = org.mockito.Matchers.refEq(strArray19, strArray27);
        java.lang.reflect.Type type32 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass13, strArray27);
        java.io.Serializable serializable33 = org.mockito.Matchers.same((java.io.Serializable) strArray27);
        java.util.Map map34 = org.mockito.Matchers.refEq(map11, strArray27);
        org.mockito.Matchers matchers35 = org.mockito.Matchers.refEq(matchers0, strArray27);
        java.util.Map map36 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence37 = null;
        java.util.Map map39 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.Map map43 = org.mockito.Matchers.refEq(map39, strArray42);
        java.lang.CharSequence charSequence44 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray42);
        java.lang.CharSequence charSequence45 = org.mockito.Matchers.refEq(charSequence37, strArray42);
        java.util.Map map46 = org.mockito.Matchers.refEq(map36, strArray42);
        java.lang.Object obj47 = org.mockito.Matchers.eq((java.lang.Object) strArray42);
        org.mockito.Matchers matchers48 = org.mockito.Matchers.refEq(matchers0, strArray42);
        java.lang.Object obj49 = org.mockito.Matchers.same((java.lang.Object) matchers0);
        java.util.Map map52 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray55 = new java.lang.String[] { "", "" };
        java.util.Map map56 = org.mockito.Matchers.refEq(map52, strArray55);
        java.lang.String str57 = org.mockito.Matchers.refEq("hi!", strArray55);
        java.lang.CharSequence charSequence58 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray55);
        java.util.List list59 = org.mockito.Matchers.anyList();
        java.util.Collection collection60 = org.mockito.Matchers.eq((java.util.Collection) list59);
        java.lang.Class<?> wildcardClass61 = list59.getClass();
        java.lang.reflect.Type type62 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass61);
        org.mockito.Matchers matchers63 = new org.mockito.Matchers();
        org.mockito.Matchers matchers64 = org.mockito.Matchers.same(matchers63);
        java.util.Map map65 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray68 = new java.lang.String[] { "", "" };
        java.util.Map map69 = org.mockito.Matchers.refEq(map65, strArray68);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map77 = org.mockito.Matchers.refEq(map65, strArray76);
        org.mockito.Matchers matchers78 = org.mockito.Matchers.refEq(matchers63, strArray76);
        java.lang.reflect.GenericDeclaration genericDeclaration79 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass61, strArray76);
        java.io.Serializable serializable80 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray76);
        org.mockito.Matchers matchers81 = org.mockito.Matchers.refEq(matchers0, strArray76);
        java.lang.Object obj82 = org.mockito.Matchers.eq((java.lang.Object) matchers81);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(charSequence29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNull(type32);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNull(matchers35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map43);
        org.junit.Assert.assertNull(charSequence44);
        org.junit.Assert.assertNull(charSequence45);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(matchers48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(charSequence58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNull(collection60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNull(type62);
        org.junit.Assert.assertNull(matchers64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map69);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map77);
        org.junit.Assert.assertNull(matchers78);
        org.junit.Assert.assertNull(genericDeclaration79);
        org.junit.Assert.assertNull(serializable80);
        org.junit.Assert.assertNull(matchers81);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        java.lang.Class<?> wildcardClass3 = set0.getClass();
        java.io.Serializable serializable4 = org.mockito.Matchers.same((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.mockito.Matchers.same(wildcardClass3);
        java.io.Serializable serializable6 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass5);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Map map4 = org.mockito.Matchers.refEq(map0, strArray3);
        java.util.Map map5 = org.mockito.Matchers.eq(map4);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNull(map5);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.same(matchers0);
        org.mockito.Matchers matchers2 = org.mockito.Matchers.eq(matchers1);
        org.junit.Assert.assertNull(matchers1);
        org.junit.Assert.assertNull(matchers2);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) list0);
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass4 = map3.getClass();
        java.util.List list5 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.util.Map map8 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.Map map12 = org.mockito.Matchers.refEq(map8, strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map8, strArray19);
        java.lang.reflect.AnnotatedElement annotatedElement21 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray19);
        java.lang.reflect.GenericDeclaration genericDeclaration22 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray19);
        java.lang.String[] strArray23 = org.mockito.Matchers.eq(strArray19);
        java.util.List list24 = org.mockito.Matchers.refEq(list0, strArray23);
        java.util.List list25 = org.mockito.Matchers.eq(list0);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.util.Map map31 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Map map35 = org.mockito.Matchers.refEq(map31, strArray34);
        java.lang.String str36 = org.mockito.Matchers.refEq("hi!", strArray34);
        java.lang.String[] strArray37 = null;
        java.util.Map map39 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.Map map43 = org.mockito.Matchers.refEq(map39, strArray42);
        java.lang.CharSequence charSequence44 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray42);
        java.lang.String[] strArray45 = org.mockito.Matchers.refEq(strArray37, strArray42);
        java.lang.String[] strArray46 = org.mockito.Matchers.refEq(strArray34, strArray42);
        java.lang.Object obj47 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray34);
        java.io.Serializable serializable48 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass28, strArray34);
        java.lang.String str49 = org.mockito.Matchers.refEq("", strArray34);
        java.util.Map map51 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray54 = new java.lang.String[] { "", "" };
        java.util.Map map55 = org.mockito.Matchers.refEq(map51, strArray54);
        java.lang.String str56 = org.mockito.Matchers.refEq("hi!", strArray54);
        java.lang.String[] strArray57 = org.mockito.Matchers.refEq(strArray34, strArray54);
        java.lang.String[] strArray58 = org.mockito.Matchers.eq(strArray54);
        java.util.List list59 = org.mockito.Matchers.refEq(list0, strArray58);
        java.util.List list60 = org.mockito.Matchers.same(list59);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(genericDeclaration7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(annotatedElement21);
        org.junit.Assert.assertNull(genericDeclaration22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNull(list25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map43);
        org.junit.Assert.assertNull(charSequence44);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(serializable48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(strArray57);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertNull(list59);
        org.junit.Assert.assertNull(list60);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence2 = null;
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray7);
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq(charSequence2, strArray7);
        java.util.Map map11 = org.mockito.Matchers.refEq(map1, strArray7);
        java.util.List list12 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        java.lang.reflect.Type type14 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass13);
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map16, strArray19);
        java.lang.String str21 = org.mockito.Matchers.refEq("hi!", strArray19);
        java.lang.String[] strArray22 = null;
        java.util.Map map24 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Map map28 = org.mockito.Matchers.refEq(map24, strArray27);
        java.lang.CharSequence charSequence29 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray27);
        java.lang.String[] strArray30 = org.mockito.Matchers.refEq(strArray22, strArray27);
        java.lang.String[] strArray31 = org.mockito.Matchers.refEq(strArray19, strArray27);
        java.lang.reflect.Type type32 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass13, strArray27);
        java.io.Serializable serializable33 = org.mockito.Matchers.same((java.io.Serializable) strArray27);
        java.util.Map map34 = org.mockito.Matchers.refEq(map11, strArray27);
        org.mockito.Matchers matchers35 = org.mockito.Matchers.refEq(matchers0, strArray27);
        org.mockito.Matchers matchers36 = org.mockito.Matchers.eq(matchers0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = matchers36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(charSequence29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNull(type32);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNull(matchers35);
        org.junit.Assert.assertNull(matchers36);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Class<?> wildcardClass2 = list0.getClass();
        java.lang.reflect.Type type3 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = org.mockito.Matchers.same(wildcardClass2);
        java.lang.Class<?> wildcardClass5 = org.mockito.Matchers.eq(wildcardClass2);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass5);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Class<?> wildcardClass2 = list0.getClass();
        java.lang.Class<?> wildcardClass3 = org.mockito.Matchers.eq(wildcardClass2);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String str11 = org.mockito.Matchers.refEq("hi!", strArray9);
        java.lang.String[] strArray12 = null;
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map14, strArray17);
        java.lang.CharSequence charSequence19 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray17);
        java.lang.String[] strArray20 = org.mockito.Matchers.refEq(strArray12, strArray17);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray9, strArray17);
        java.util.Map map22 = org.mockito.Matchers.refEq(map4, strArray9);
        java.lang.reflect.GenericDeclaration genericDeclaration23 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = genericDeclaration23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNull(genericDeclaration23);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.lang.Class<?> wildcardClass3 = set0.getClass();
        java.lang.Object obj4 = org.mockito.Matchers.same((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = org.mockito.Matchers.eq(wildcardClass3);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(wildcardClass5);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass1 = map0.getClass();
        java.lang.Class<?> wildcardClass2 = org.mockito.Matchers.same(wildcardClass1);
        java.lang.reflect.Type type3 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass2);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.List list2 = org.mockito.Matchers.anyList();
        java.util.List list3 = org.mockito.Matchers.same(list2);
        java.util.List list4 = org.mockito.Matchers.eq(list2);
        java.util.List list5 = org.mockito.Matchers.eq(list2);
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String str12 = org.mockito.Matchers.refEq("hi!", strArray10);
        java.lang.String[] strArray13 = null;
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.CharSequence charSequence20 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray18);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray13, strArray18);
        java.lang.String[] strArray22 = org.mockito.Matchers.refEq(strArray10, strArray18);
        java.util.List list23 = org.mockito.Matchers.refEq(list5, strArray10);
        java.lang.String str24 = org.mockito.Matchers.refEq("hi!", strArray10);
        org.mockito.Matchers matchers25 = new org.mockito.Matchers();
        java.util.Map map26 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence27 = null;
        java.util.Map map29 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        java.util.Map map33 = org.mockito.Matchers.refEq(map29, strArray32);
        java.lang.CharSequence charSequence34 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray32);
        java.lang.CharSequence charSequence35 = org.mockito.Matchers.refEq(charSequence27, strArray32);
        java.util.Map map36 = org.mockito.Matchers.refEq(map26, strArray32);
        java.util.List list37 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass38 = list37.getClass();
        java.lang.reflect.Type type39 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass38);
        java.util.Map map41 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Map map45 = org.mockito.Matchers.refEq(map41, strArray44);
        java.lang.String str46 = org.mockito.Matchers.refEq("hi!", strArray44);
        java.lang.String[] strArray47 = null;
        java.util.Map map49 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Map map53 = org.mockito.Matchers.refEq(map49, strArray52);
        java.lang.CharSequence charSequence54 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray52);
        java.lang.String[] strArray55 = org.mockito.Matchers.refEq(strArray47, strArray52);
        java.lang.String[] strArray56 = org.mockito.Matchers.refEq(strArray44, strArray52);
        java.lang.reflect.Type type57 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass38, strArray52);
        java.io.Serializable serializable58 = org.mockito.Matchers.same((java.io.Serializable) strArray52);
        java.util.Map map59 = org.mockito.Matchers.refEq(map36, strArray52);
        org.mockito.Matchers matchers60 = org.mockito.Matchers.refEq(matchers25, strArray52);
        java.util.Map map61 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence62 = null;
        java.util.Map map64 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        java.util.Map map68 = org.mockito.Matchers.refEq(map64, strArray67);
        java.lang.CharSequence charSequence69 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray67);
        java.lang.CharSequence charSequence70 = org.mockito.Matchers.refEq(charSequence62, strArray67);
        java.util.Map map71 = org.mockito.Matchers.refEq(map61, strArray67);
        java.lang.Object obj72 = org.mockito.Matchers.eq((java.lang.Object) strArray67);
        org.mockito.Matchers matchers73 = org.mockito.Matchers.refEq(matchers25, strArray67);
        java.lang.String[] strArray74 = org.mockito.Matchers.refEq(strArray10, strArray67);
        java.lang.Comparable<java.lang.String> strComparable75 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "", strArray74);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(list5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(list23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map33);
        org.junit.Assert.assertNull(charSequence34);
        org.junit.Assert.assertNull(charSequence35);
        org.junit.Assert.assertNull(map36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(type39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map53);
        org.junit.Assert.assertNull(charSequence54);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNull(type57);
        org.junit.Assert.assertNull(serializable58);
        org.junit.Assert.assertNull(map59);
        org.junit.Assert.assertNull(matchers60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map68);
        org.junit.Assert.assertNull(charSequence69);
        org.junit.Assert.assertNull(charSequence70);
        org.junit.Assert.assertNull(map71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(matchers73);
        org.junit.Assert.assertNull(strArray74);
        org.junit.Assert.assertNull(strComparable75);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Map map0 = org.mockito.Matchers.anyMap();
        java.util.Map map1 = org.mockito.Matchers.eq(map0);
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String str9 = org.mockito.Matchers.refEq("hi!", strArray7);
        java.lang.String[] strArray10 = null;
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.CharSequence charSequence17 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray15);
        java.lang.String[] strArray18 = org.mockito.Matchers.refEq(strArray10, strArray15);
        java.lang.String[] strArray19 = org.mockito.Matchers.refEq(strArray7, strArray15);
        java.util.Map map20 = org.mockito.Matchers.refEq(map2, strArray7);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.util.Map map25 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.util.Map map29 = org.mockito.Matchers.refEq(map25, strArray28);
        java.lang.String str30 = org.mockito.Matchers.refEq("hi!", strArray28);
        java.lang.String[] strArray31 = null;
        java.util.Map map33 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Map map37 = org.mockito.Matchers.refEq(map33, strArray36);
        java.lang.CharSequence charSequence38 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray36);
        java.lang.String[] strArray39 = org.mockito.Matchers.refEq(strArray31, strArray36);
        java.lang.String[] strArray40 = org.mockito.Matchers.refEq(strArray28, strArray36);
        java.lang.Object obj41 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray28);
        java.io.Serializable serializable42 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass22, strArray28);
        java.util.Map map43 = org.mockito.Matchers.refEq(map20, strArray28);
        java.util.Map map44 = org.mockito.Matchers.refEq(map0, strArray28);
        java.util.Map map45 = org.mockito.Matchers.eq(map44);
        org.junit.Assert.assertNotNull(map0);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map37);
        org.junit.Assert.assertNull(charSequence38);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(serializable42);
        org.junit.Assert.assertNull(map43);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNull(map45);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.util.Collection collection2 = org.mockito.Matchers.eq((java.util.Collection) list0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = collection2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(collection2);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.String str8 = org.mockito.Matchers.refEq("hi!", strArray6);
        java.lang.String[] strArray9 = null;
        java.util.Map map11 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Map map15 = org.mockito.Matchers.refEq(map11, strArray14);
        java.lang.CharSequence charSequence16 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray14);
        java.lang.String[] strArray17 = org.mockito.Matchers.refEq(strArray9, strArray14);
        java.lang.String[] strArray18 = org.mockito.Matchers.refEq(strArray6, strArray14);
        java.util.Map map19 = org.mockito.Matchers.refEq(map1, strArray6);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.util.Map map24 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Map map28 = org.mockito.Matchers.refEq(map24, strArray27);
        java.lang.String str29 = org.mockito.Matchers.refEq("hi!", strArray27);
        java.lang.String[] strArray30 = null;
        java.util.Map map32 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.Map map36 = org.mockito.Matchers.refEq(map32, strArray35);
        java.lang.CharSequence charSequence37 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray35);
        java.lang.String[] strArray38 = org.mockito.Matchers.refEq(strArray30, strArray35);
        java.lang.String[] strArray39 = org.mockito.Matchers.refEq(strArray27, strArray35);
        java.lang.Object obj40 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray27);
        java.io.Serializable serializable41 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass21, strArray27);
        java.util.Map map42 = org.mockito.Matchers.refEq(map19, strArray27);
        java.lang.reflect.AnnotatedElement annotatedElement43 = org.mockito.Matchers.refEq(annotatedElement0, strArray27);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map36);
        org.junit.Assert.assertNull(charSequence37);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(serializable41);
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNull(annotatedElement43);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.Class<?> wildcardClass2 = list0.getClass();
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray13 = org.mockito.Matchers.same(strArray12);
        java.io.Serializable serializable14 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass4, strArray12);
        java.lang.Class<?> wildcardClass15 = org.mockito.Matchers.refEq(wildcardClass2, strArray12);
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.util.Map map17 = org.mockito.Matchers.eq(map16);
        org.mockito.Matchers matchers18 = new org.mockito.Matchers();
        org.mockito.Matchers matchers19 = org.mockito.Matchers.same(matchers18);
        java.util.Map map22 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Map map26 = org.mockito.Matchers.refEq(map22, strArray25);
        java.lang.CharSequence charSequence27 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray25);
        java.io.Serializable serializable28 = org.mockito.Matchers.refEq((java.io.Serializable) 100.0f, strArray25);
        org.mockito.Matchers matchers29 = org.mockito.Matchers.refEq(matchers19, strArray25);
        java.util.Map map30 = org.mockito.Matchers.refEq(map16, strArray25);
        java.util.List list31 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass32 = list31.getClass();
        java.lang.reflect.Type type33 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass32);
        java.util.Map map35 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.util.Map map39 = org.mockito.Matchers.refEq(map35, strArray38);
        java.lang.String str40 = org.mockito.Matchers.refEq("hi!", strArray38);
        java.lang.String[] strArray41 = null;
        java.util.Map map43 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        java.util.Map map47 = org.mockito.Matchers.refEq(map43, strArray46);
        java.lang.CharSequence charSequence48 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray46);
        java.lang.String[] strArray49 = org.mockito.Matchers.refEq(strArray41, strArray46);
        java.lang.String[] strArray50 = org.mockito.Matchers.refEq(strArray38, strArray46);
        java.lang.reflect.Type type51 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass32, strArray46);
        java.io.Serializable serializable52 = org.mockito.Matchers.same((java.io.Serializable) strArray46);
        java.lang.String[] strArray53 = org.mockito.Matchers.refEq(strArray25, strArray46);
        java.lang.reflect.AnnotatedElement annotatedElement54 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass15, strArray53);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(matchers19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map26);
        org.junit.Assert.assertNull(charSequence27);
        org.junit.Assert.assertNull(serializable28);
        org.junit.Assert.assertNull(matchers29);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(type33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map47);
        org.junit.Assert.assertNull(charSequence48);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertNull(type51);
        org.junit.Assert.assertNull(serializable52);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNull(annotatedElement54);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.Iterable iterable1 = org.mockito.Matchers.eq((java.lang.Iterable) list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.util.Map map6 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Map map10 = org.mockito.Matchers.refEq(map6, strArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map6, strArray17);
        java.lang.reflect.AnnotatedElement annotatedElement19 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray17);
        java.io.Serializable serializable20 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass4);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable25 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray24);
        java.lang.reflect.GenericDeclaration genericDeclaration26 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass4, strArray24);
        java.util.List list27 = org.mockito.Matchers.refEq(list0, strArray24);
        java.util.List list28 = org.mockito.Matchers.eq(list0);
        java.util.Collection collection29 = org.mockito.Matchers.same((java.util.Collection) list28);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(iterable1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(annotatedElement19);
        org.junit.Assert.assertNull(serializable20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable25);
        org.junit.Assert.assertNull(genericDeclaration26);
        org.junit.Assert.assertNull(list27);
        org.junit.Assert.assertNull(list28);
        org.junit.Assert.assertNull(collection29);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.Set set1 = org.mockito.Matchers.anySet();
        java.util.Set set2 = org.mockito.Matchers.eq(set1);
        java.util.Set set3 = org.mockito.Matchers.same(set1);
        java.util.Set set4 = org.mockito.Matchers.eq(set1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "" };
        java.lang.Iterable iterable9 = org.mockito.Matchers.refEq((java.lang.Iterable) set1, strArray8);
        java.lang.String[] strArray10 = org.mockito.Matchers.same(strArray8);
        java.lang.CharSequence charSequence11 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray8);
        java.lang.Class<?> wildcardClass12 = strArray8.getClass();
        java.io.Serializable serializable13 = org.mockito.Matchers.eq((java.io.Serializable) strArray8);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(set3);
        org.junit.Assert.assertNull(set4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertNull(iterable9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(serializable13);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray5);
        java.util.List list9 = org.mockito.Matchers.anyList();
        java.util.Collection collection10 = org.mockito.Matchers.eq((java.util.Collection) list9);
        java.lang.Class<?> wildcardClass11 = list9.getClass();
        java.lang.reflect.Type type12 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass11);
        org.mockito.Matchers matchers13 = new org.mockito.Matchers();
        org.mockito.Matchers matchers14 = org.mockito.Matchers.same(matchers13);
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map15, strArray26);
        org.mockito.Matchers matchers28 = org.mockito.Matchers.refEq(matchers13, strArray26);
        java.lang.reflect.GenericDeclaration genericDeclaration29 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass11, strArray26);
        java.io.Serializable serializable30 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray26);
        java.util.Map map31 = org.mockito.Matchers.anyMap();
        java.lang.Class<?> wildcardClass32 = map31.getClass();
        java.util.List list33 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass34 = list33.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration35 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass34);
        java.util.Map map36 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.Map map40 = org.mockito.Matchers.refEq(map36, strArray39);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map48 = org.mockito.Matchers.refEq(map36, strArray47);
        java.lang.reflect.AnnotatedElement annotatedElement49 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass34, strArray47);
        java.lang.reflect.GenericDeclaration genericDeclaration50 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass32, strArray47);
        java.lang.String[] strArray51 = org.mockito.Matchers.eq(strArray47);
        java.lang.String[] strArray52 = org.mockito.Matchers.refEq(strArray26, strArray51);
        java.lang.String[] strArray53 = null;
        java.util.Map map55 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "" };
        java.util.Map map59 = org.mockito.Matchers.refEq(map55, strArray58);
        java.lang.CharSequence charSequence60 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray58);
        java.lang.String[] strArray61 = org.mockito.Matchers.refEq(strArray53, strArray58);
        java.io.Serializable serializable62 = org.mockito.Matchers.refEq((java.io.Serializable) strArray51, strArray53);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(matchers14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(matchers28);
        org.junit.Assert.assertNull(genericDeclaration29);
        org.junit.Assert.assertNull(serializable30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(genericDeclaration35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map40);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map48);
        org.junit.Assert.assertNull(annotatedElement49);
        org.junit.Assert.assertNull(genericDeclaration50);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map59);
        org.junit.Assert.assertNull(charSequence60);
        org.junit.Assert.assertNull(strArray61);
        org.junit.Assert.assertNull(serializable62);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.reflect.Type type2 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.util.Map map5 = org.mockito.Matchers.eq(map4);
        org.mockito.Matchers matchers6 = new org.mockito.Matchers();
        org.mockito.Matchers matchers7 = org.mockito.Matchers.same(matchers6);
        java.util.Map map10 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Map map14 = org.mockito.Matchers.refEq(map10, strArray13);
        java.lang.CharSequence charSequence15 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray13);
        java.io.Serializable serializable16 = org.mockito.Matchers.refEq((java.io.Serializable) 100.0f, strArray13);
        org.mockito.Matchers matchers17 = org.mockito.Matchers.refEq(matchers7, strArray13);
        java.util.Map map18 = org.mockito.Matchers.refEq(map4, strArray13);
        java.util.List list19 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass20 = list19.getClass();
        java.lang.reflect.Type type21 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass20);
        java.util.Map map23 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map23, strArray26);
        java.lang.String str28 = org.mockito.Matchers.refEq("hi!", strArray26);
        java.lang.String[] strArray29 = null;
        java.util.Map map31 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Map map35 = org.mockito.Matchers.refEq(map31, strArray34);
        java.lang.CharSequence charSequence36 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray34);
        java.lang.String[] strArray37 = org.mockito.Matchers.refEq(strArray29, strArray34);
        java.lang.String[] strArray38 = org.mockito.Matchers.refEq(strArray26, strArray34);
        java.lang.reflect.Type type39 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass20, strArray34);
        java.io.Serializable serializable40 = org.mockito.Matchers.same((java.io.Serializable) strArray34);
        java.lang.String[] strArray41 = org.mockito.Matchers.refEq(strArray13, strArray34);
        java.lang.reflect.AnnotatedElement annotatedElement42 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) genericDeclaration3, strArray41);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(matchers7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertNull(matchers17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(type21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNull(charSequence36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNull(type39);
        org.junit.Assert.assertNull(serializable40);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNull(annotatedElement42);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Set set2 = org.mockito.Matchers.same(set0);
        java.util.Collection collection3 = org.mockito.Matchers.eq((java.util.Collection) set0);
        java.util.Set set4 = org.mockito.Matchers.eq(set0);
        java.util.Collection collection5 = org.mockito.Matchers.same((java.util.Collection) set0);
        java.lang.String[] strArray6 = null;
        java.util.Set set7 = org.mockito.Matchers.refEq(set0, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = set7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(set2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(set4);
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertNull(set7);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.lang.Iterable iterable2 = org.mockito.Matchers.same((java.lang.Iterable) set0);
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.reflect.Type type6 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass4);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.String str17 = org.mockito.Matchers.refEq("hi!", strArray15);
        java.lang.String[] strArray18 = null;
        java.util.Map map20 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map20, strArray23);
        java.lang.CharSequence charSequence25 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray23);
        java.lang.String[] strArray26 = org.mockito.Matchers.refEq(strArray18, strArray23);
        java.lang.String[] strArray27 = org.mockito.Matchers.refEq(strArray15, strArray23);
        java.lang.Object obj28 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray15);
        java.io.Serializable serializable29 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass9, strArray15);
        java.lang.String str30 = org.mockito.Matchers.refEq("", strArray15);
        java.lang.Class<?> wildcardClass31 = org.mockito.Matchers.refEq(wildcardClass4, strArray15);
        java.util.Set set32 = org.mockito.Matchers.refEq(set0, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = set32.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(iterable2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(genericDeclaration5);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(serializable29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNull(set32);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.List list1 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map4, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement17 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray15);
        java.io.Serializable serializable18 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass2);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable23 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray22);
        java.lang.reflect.GenericDeclaration genericDeclaration24 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass2, strArray22);
        org.mockito.Matchers matchers25 = org.mockito.Matchers.refEq(matchers0, strArray22);
        org.mockito.Matchers matchers26 = org.mockito.Matchers.same(matchers0);
        java.util.Map map27 = org.mockito.Matchers.anyMap();
        java.util.Map map28 = org.mockito.Matchers.eq(map27);
        org.mockito.Matchers matchers29 = new org.mockito.Matchers();
        org.mockito.Matchers matchers30 = org.mockito.Matchers.same(matchers29);
        java.util.Map map33 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Map map37 = org.mockito.Matchers.refEq(map33, strArray36);
        java.lang.CharSequence charSequence38 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray36);
        java.io.Serializable serializable39 = org.mockito.Matchers.refEq((java.io.Serializable) 100.0f, strArray36);
        org.mockito.Matchers matchers40 = org.mockito.Matchers.refEq(matchers30, strArray36);
        java.util.Map map41 = org.mockito.Matchers.refEq(map27, strArray36);
        org.mockito.Matchers matchers42 = org.mockito.Matchers.refEq(matchers0, strArray36);
        org.mockito.Matchers matchers43 = org.mockito.Matchers.same(matchers42);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(annotatedElement17);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable23);
        org.junit.Assert.assertNull(genericDeclaration24);
        org.junit.Assert.assertNull(matchers25);
        org.junit.Assert.assertNull(matchers26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(matchers30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map37);
        org.junit.Assert.assertNull(charSequence38);
        org.junit.Assert.assertNull(serializable39);
        org.junit.Assert.assertNull(matchers40);
        org.junit.Assert.assertNull(map41);
        org.junit.Assert.assertNull(matchers42);
        org.junit.Assert.assertNull(matchers43);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.reflect.Type type3 = org.mockito.Matchers.eq((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.GenericDeclaration genericDeclaration4 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass2);
        org.mockito.Matchers matchers5 = new org.mockito.Matchers();
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String str12 = org.mockito.Matchers.refEq("hi!", strArray10);
        org.mockito.Matchers matchers13 = org.mockito.Matchers.refEq(matchers5, strArray10);
        java.lang.Class<?> wildcardClass14 = strArray10.getClass();
        org.mockito.Matchers matchers15 = new org.mockito.Matchers();
        org.mockito.Matchers matchers16 = org.mockito.Matchers.same(matchers15);
        java.util.Map map17 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Map map21 = org.mockito.Matchers.refEq(map17, strArray20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map29 = org.mockito.Matchers.refEq(map17, strArray28);
        org.mockito.Matchers matchers30 = org.mockito.Matchers.refEq(matchers15, strArray28);
        java.lang.reflect.AnnotatedElement annotatedElement31 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass14, strArray28);
        java.lang.Class<?> wildcardClass32 = org.mockito.Matchers.refEq(wildcardClass2, strArray28);
        java.util.List list34 = org.mockito.Matchers.anyList();
        java.util.List list35 = org.mockito.Matchers.same(list34);
        java.util.List list36 = org.mockito.Matchers.eq(list34);
        java.util.List list37 = org.mockito.Matchers.eq(list34);
        java.util.Map map39 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.Map map43 = org.mockito.Matchers.refEq(map39, strArray42);
        java.lang.String str44 = org.mockito.Matchers.refEq("hi!", strArray42);
        java.lang.String[] strArray45 = null;
        java.util.Map map47 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.util.Map map51 = org.mockito.Matchers.refEq(map47, strArray50);
        java.lang.CharSequence charSequence52 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray50);
        java.lang.String[] strArray53 = org.mockito.Matchers.refEq(strArray45, strArray50);
        java.lang.String[] strArray54 = org.mockito.Matchers.refEq(strArray42, strArray50);
        java.util.List list55 = org.mockito.Matchers.refEq(list37, strArray42);
        java.lang.String str56 = org.mockito.Matchers.refEq("hi!", strArray42);
        java.lang.String[] strArray57 = org.mockito.Matchers.refEq(strArray28, strArray42);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable62 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray61);
        java.util.List list63 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass64 = list63.getClass();
        java.lang.reflect.Type type65 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass64);
        java.util.Map map67 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray70 = new java.lang.String[] { "", "" };
        java.util.Map map71 = org.mockito.Matchers.refEq(map67, strArray70);
        java.lang.String str72 = org.mockito.Matchers.refEq("hi!", strArray70);
        java.lang.String[] strArray73 = null;
        java.util.Map map75 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray78 = new java.lang.String[] { "", "" };
        java.util.Map map79 = org.mockito.Matchers.refEq(map75, strArray78);
        java.lang.CharSequence charSequence80 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray78);
        java.lang.String[] strArray81 = org.mockito.Matchers.refEq(strArray73, strArray78);
        java.lang.String[] strArray82 = org.mockito.Matchers.refEq(strArray70, strArray78);
        java.lang.reflect.Type type83 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass64, strArray78);
        java.lang.String[] strArray84 = org.mockito.Matchers.refEq(strArray61, strArray78);
        java.lang.String[] strArray85 = org.mockito.Matchers.refEq(strArray57, strArray78);
        java.lang.String str86 = org.mockito.Matchers.refEq("hi!", strArray57);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertNull(genericDeclaration4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(matchers13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(matchers16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNull(matchers30);
        org.junit.Assert.assertNull(annotatedElement31);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNull(list35);
        org.junit.Assert.assertNull(list36);
        org.junit.Assert.assertNull(list37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map51);
        org.junit.Assert.assertNull(charSequence52);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNull(strArray54);
        org.junit.Assert.assertNull(list55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(strArray57);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(type65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map79);
        org.junit.Assert.assertNull(charSequence80);
        org.junit.Assert.assertNull(strArray81);
        org.junit.Assert.assertNull(strArray82);
        org.junit.Assert.assertNull(type83);
        org.junit.Assert.assertNull(strArray84);
        org.junit.Assert.assertNull(strArray85);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        java.util.Map map1 = org.mockito.Matchers.anyMap();
        java.lang.CharSequence charSequence2 = null;
        java.util.Map map4 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Map map8 = org.mockito.Matchers.refEq(map4, strArray7);
        java.lang.CharSequence charSequence9 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray7);
        java.lang.CharSequence charSequence10 = org.mockito.Matchers.refEq(charSequence2, strArray7);
        java.util.Map map11 = org.mockito.Matchers.refEq(map1, strArray7);
        java.util.List list12 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        java.lang.reflect.Type type14 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass13);
        java.util.Map map16 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Map map20 = org.mockito.Matchers.refEq(map16, strArray19);
        java.lang.String str21 = org.mockito.Matchers.refEq("hi!", strArray19);
        java.lang.String[] strArray22 = null;
        java.util.Map map24 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Map map28 = org.mockito.Matchers.refEq(map24, strArray27);
        java.lang.CharSequence charSequence29 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray27);
        java.lang.String[] strArray30 = org.mockito.Matchers.refEq(strArray22, strArray27);
        java.lang.String[] strArray31 = org.mockito.Matchers.refEq(strArray19, strArray27);
        java.lang.reflect.Type type32 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass13, strArray27);
        java.io.Serializable serializable33 = org.mockito.Matchers.same((java.io.Serializable) strArray27);
        java.util.Map map34 = org.mockito.Matchers.refEq(map11, strArray27);
        org.mockito.Matchers matchers35 = org.mockito.Matchers.refEq(matchers0, strArray27);
        org.mockito.Matchers matchers36 = org.mockito.Matchers.eq(matchers0);
        org.mockito.Matchers matchers37 = org.mockito.Matchers.same(matchers36);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(charSequence29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNull(type32);
        org.junit.Assert.assertNull(serializable33);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNull(matchers35);
        org.junit.Assert.assertNull(matchers36);
        org.junit.Assert.assertNull(matchers37);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.lang.Class<?> wildcardClass3 = list0.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        java.lang.Comparable<java.lang.String> strComparable8 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray7);
        java.util.List list9 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        java.lang.reflect.Type type11 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass10);
        java.util.Map map13 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Map map17 = org.mockito.Matchers.refEq(map13, strArray16);
        java.lang.String str18 = org.mockito.Matchers.refEq("hi!", strArray16);
        java.lang.String[] strArray19 = null;
        java.util.Map map21 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        java.util.Map map25 = org.mockito.Matchers.refEq(map21, strArray24);
        java.lang.CharSequence charSequence26 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray24);
        java.lang.String[] strArray27 = org.mockito.Matchers.refEq(strArray19, strArray24);
        java.lang.String[] strArray28 = org.mockito.Matchers.refEq(strArray16, strArray24);
        java.lang.reflect.Type type29 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass10, strArray24);
        java.lang.String[] strArray30 = org.mockito.Matchers.refEq(strArray7, strArray24);
        java.lang.reflect.Type type31 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass3, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass32 = type31.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNull(charSequence26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNull(type29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNull(type31);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.util.List list1 = org.mockito.Matchers.anyList();
        java.util.List list2 = org.mockito.Matchers.same(list1);
        java.util.List list3 = org.mockito.Matchers.eq(list1);
        java.util.List list4 = org.mockito.Matchers.eq(list1);
        java.lang.Class<?> wildcardClass5 = list1.getClass();
        java.util.Set set6 = org.mockito.Matchers.anySet();
        java.util.Set set7 = org.mockito.Matchers.eq(set6);
        java.lang.Iterable iterable8 = org.mockito.Matchers.same((java.lang.Iterable) set6);
        java.util.List list9 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration11 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass10);
        java.util.Map map12 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Map map16 = org.mockito.Matchers.refEq(map12, strArray15);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map24 = org.mockito.Matchers.refEq(map12, strArray23);
        java.lang.reflect.AnnotatedElement annotatedElement25 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass10, strArray23);
        java.util.Collection collection26 = org.mockito.Matchers.refEq((java.util.Collection) set6, strArray23);
        java.util.Map map27 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.Map map31 = org.mockito.Matchers.refEq(map27, strArray30);
        java.lang.Iterable iterable32 = org.mockito.Matchers.refEq((java.lang.Iterable) set6, strArray30);
        java.lang.reflect.Type type33 = org.mockito.Matchers.refEq((java.lang.reflect.Type) wildcardClass5, strArray30);
        java.lang.CharSequence charSequence34 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass35 = charSequence34.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(set7);
        org.junit.Assert.assertNull(iterable8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(genericDeclaration11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(annotatedElement25);
        org.junit.Assert.assertNull(collection26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNull(iterable32);
        org.junit.Assert.assertNull(type33);
        org.junit.Assert.assertNull(charSequence34);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "hi!", strArray5);
        java.util.List list9 = org.mockito.Matchers.anyList();
        java.util.Collection collection10 = org.mockito.Matchers.eq((java.util.Collection) list9);
        java.lang.Class<?> wildcardClass11 = list9.getClass();
        java.lang.reflect.Type type12 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass11);
        org.mockito.Matchers matchers13 = new org.mockito.Matchers();
        org.mockito.Matchers matchers14 = org.mockito.Matchers.same(matchers13);
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map15, strArray26);
        org.mockito.Matchers matchers28 = org.mockito.Matchers.refEq(matchers13, strArray26);
        java.lang.reflect.GenericDeclaration genericDeclaration29 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass11, strArray26);
        java.io.Serializable serializable30 = org.mockito.Matchers.refEq((java.io.Serializable) "hi!", strArray26);
        java.lang.Class<?> wildcardClass31 = strArray26.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration32 = org.mockito.Matchers.eq((java.lang.reflect.GenericDeclaration) wildcardClass31);
        java.io.Serializable serializable33 = org.mockito.Matchers.eq((java.io.Serializable) wildcardClass31);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(matchers14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(matchers28);
        org.junit.Assert.assertNull(genericDeclaration29);
        org.junit.Assert.assertNull(serializable30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(genericDeclaration32);
        org.junit.Assert.assertNull(serializable33);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.util.Map map2 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Map map6 = org.mockito.Matchers.refEq(map2, strArray5);
        java.lang.String str7 = org.mockito.Matchers.refEq("hi!", strArray5);
        java.lang.Comparable<java.lang.String> strComparable8 = org.mockito.Matchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray5);
        java.lang.Object obj9 = org.mockito.Matchers.same((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.Iterable iterable0 = null;
        java.util.List list1 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration3 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        java.lang.String[] strArray11 = org.mockito.Matchers.same(strArray10);
        java.io.Serializable serializable12 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass2, strArray10);
        java.util.Map map14 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Map map18 = org.mockito.Matchers.refEq(map14, strArray17);
        java.lang.String str19 = org.mockito.Matchers.refEq("hi!", strArray17);
        java.lang.String[] strArray20 = null;
        java.util.Map map22 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Map map26 = org.mockito.Matchers.refEq(map22, strArray25);
        java.lang.CharSequence charSequence27 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray25);
        java.lang.String[] strArray28 = org.mockito.Matchers.refEq(strArray20, strArray25);
        java.lang.String[] strArray29 = org.mockito.Matchers.refEq(strArray17, strArray25);
        java.lang.Class<?> wildcardClass30 = strArray25.getClass();
        java.util.Map map31 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Map map35 = org.mockito.Matchers.refEq(map31, strArray34);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map43 = org.mockito.Matchers.refEq(map31, strArray42);
        java.lang.reflect.GenericDeclaration genericDeclaration44 = org.mockito.Matchers.refEq((java.lang.reflect.GenericDeclaration) wildcardClass30, strArray42);
        java.util.Set set45 = org.mockito.Matchers.anySet();
        java.util.Set set46 = org.mockito.Matchers.eq(set45);
        java.lang.Iterable iterable47 = org.mockito.Matchers.same((java.lang.Iterable) set45);
        java.util.List list48 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass49 = list48.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration50 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass49);
        java.util.Map map51 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray54 = new java.lang.String[] { "", "" };
        java.util.Map map55 = org.mockito.Matchers.refEq(map51, strArray54);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Map map63 = org.mockito.Matchers.refEq(map51, strArray62);
        java.lang.reflect.AnnotatedElement annotatedElement64 = org.mockito.Matchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass49, strArray62);
        java.util.Collection collection65 = org.mockito.Matchers.refEq((java.util.Collection) set45, strArray62);
        java.io.Serializable serializable66 = org.mockito.Matchers.same((java.io.Serializable) strArray62);
        java.lang.Class<?> wildcardClass67 = org.mockito.Matchers.refEq(wildcardClass30, strArray62);
        java.lang.String[] strArray68 = org.mockito.Matchers.refEq(strArray10, strArray62);
        java.lang.Iterable iterable69 = org.mockito.Matchers.refEq(iterable0, strArray68);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(genericDeclaration3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "", "", "", "hi!" });
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map26);
        org.junit.Assert.assertNull(charSequence27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map43);
        org.junit.Assert.assertNull(genericDeclaration44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(set46);
        org.junit.Assert.assertNull(iterable47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNull(genericDeclaration50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
        org.junit.Assert.assertNull(map63);
        org.junit.Assert.assertNull(annotatedElement64);
        org.junit.Assert.assertNull(collection65);
        org.junit.Assert.assertNull(serializable66);
        org.junit.Assert.assertNull(wildcardClass67);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertNull(iterable69);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.List list1 = org.mockito.Matchers.same(list0);
        java.util.List list2 = org.mockito.Matchers.eq(list0);
        java.util.List list3 = org.mockito.Matchers.eq(list0);
        java.util.List list4 = org.mockito.Matchers.eq(list0);
        java.lang.Iterable iterable5 = org.mockito.Matchers.eq((java.lang.Iterable) list4);
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(list1);
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNull(iterable5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.lang.String[] strArray1 = null;
        java.util.Map map3 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.Map map7 = org.mockito.Matchers.refEq(map3, strArray6);
        java.lang.CharSequence charSequence8 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray6);
        java.lang.String[] strArray9 = org.mockito.Matchers.refEq(strArray1, strArray6);
        java.util.List list10 = org.mockito.Matchers.refEq(list0, strArray6);
        java.util.Set set11 = org.mockito.Matchers.anySet();
        java.util.Set set12 = org.mockito.Matchers.eq(set11);
        java.lang.Iterable iterable13 = org.mockito.Matchers.same((java.lang.Iterable) set11);
        java.util.List list14 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass15 = list14.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration16 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass15);
        java.lang.reflect.Type type17 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass15);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.util.Map map23 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Map map27 = org.mockito.Matchers.refEq(map23, strArray26);
        java.lang.String str28 = org.mockito.Matchers.refEq("hi!", strArray26);
        java.lang.String[] strArray29 = null;
        java.util.Map map31 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Map map35 = org.mockito.Matchers.refEq(map31, strArray34);
        java.lang.CharSequence charSequence36 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray34);
        java.lang.String[] strArray37 = org.mockito.Matchers.refEq(strArray29, strArray34);
        java.lang.String[] strArray38 = org.mockito.Matchers.refEq(strArray26, strArray34);
        java.lang.Object obj39 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray26);
        java.io.Serializable serializable40 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass20, strArray26);
        java.lang.String str41 = org.mockito.Matchers.refEq("", strArray26);
        java.lang.Class<?> wildcardClass42 = org.mockito.Matchers.refEq(wildcardClass15, strArray26);
        java.util.Set set43 = org.mockito.Matchers.refEq(set11, strArray26);
        java.util.Collection collection44 = org.mockito.Matchers.refEq((java.util.Collection) list0, strArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = collection44.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(set12);
        org.junit.Assert.assertNull(iterable13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(genericDeclaration16);
        org.junit.Assert.assertNull(type17);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNull(charSequence36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(serializable40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNull(set43);
        org.junit.Assert.assertNull(collection44);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        java.util.Set set1 = org.mockito.Matchers.eq(set0);
        java.util.Collection collection2 = org.mockito.Matchers.same((java.util.Collection) set0);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String str12 = org.mockito.Matchers.refEq("hi!", strArray10);
        java.lang.String[] strArray13 = null;
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.CharSequence charSequence20 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray18);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray13, strArray18);
        java.lang.String[] strArray22 = org.mockito.Matchers.refEq(strArray10, strArray18);
        java.lang.Object obj23 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray10);
        java.io.Serializable serializable24 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass4, strArray10);
        java.util.List list25 = org.mockito.Matchers.anyList();
        java.lang.Class<?> wildcardClass26 = list25.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration27 = org.mockito.Matchers.same((java.lang.reflect.GenericDeclaration) wildcardClass26);
        java.lang.reflect.Type type28 = org.mockito.Matchers.same((java.lang.reflect.Type) wildcardClass26);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.util.Map map34 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.Map map38 = org.mockito.Matchers.refEq(map34, strArray37);
        java.lang.String str39 = org.mockito.Matchers.refEq("hi!", strArray37);
        java.lang.String[] strArray40 = null;
        java.util.Map map42 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.Map map46 = org.mockito.Matchers.refEq(map42, strArray45);
        java.lang.CharSequence charSequence47 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray45);
        java.lang.String[] strArray48 = org.mockito.Matchers.refEq(strArray40, strArray45);
        java.lang.String[] strArray49 = org.mockito.Matchers.refEq(strArray37, strArray45);
        java.lang.Object obj50 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray37);
        java.io.Serializable serializable51 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass31, strArray37);
        java.lang.String str52 = org.mockito.Matchers.refEq("", strArray37);
        java.lang.Class<?> wildcardClass53 = org.mockito.Matchers.refEq(wildcardClass26, strArray37);
        java.io.Serializable serializable54 = org.mockito.Matchers.refEq(serializable24, strArray37);
        java.util.Set set55 = org.mockito.Matchers.refEq(set0, strArray37);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        java.util.Map map61 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray64 = new java.lang.String[] { "", "" };
        java.util.Map map65 = org.mockito.Matchers.refEq(map61, strArray64);
        java.lang.String str66 = org.mockito.Matchers.refEq("hi!", strArray64);
        java.lang.String[] strArray67 = null;
        java.util.Map map69 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray72 = new java.lang.String[] { "", "" };
        java.util.Map map73 = org.mockito.Matchers.refEq(map69, strArray72);
        java.lang.CharSequence charSequence74 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray72);
        java.lang.String[] strArray75 = org.mockito.Matchers.refEq(strArray67, strArray72);
        java.lang.String[] strArray76 = org.mockito.Matchers.refEq(strArray64, strArray72);
        java.lang.Object obj77 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray64);
        java.io.Serializable serializable78 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass58, strArray64);
        java.lang.String str79 = org.mockito.Matchers.refEq("", strArray64);
        java.lang.Object obj80 = org.mockito.Matchers.same((java.lang.Object) strArray64);
        java.util.Set set81 = org.mockito.Matchers.refEq(set0, strArray64);
        java.util.Set set82 = org.mockito.Matchers.same(set81);
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNull(set1);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(genericDeclaration27);
        org.junit.Assert.assertNull(type28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNull(charSequence47);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(serializable51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(wildcardClass53);
        org.junit.Assert.assertNull(serializable54);
        org.junit.Assert.assertNull(set55);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map73);
        org.junit.Assert.assertNull(charSequence74);
        org.junit.Assert.assertNull(strArray75);
        org.junit.Assert.assertNull(strArray76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(serializable78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(set81);
        org.junit.Assert.assertNull(set82);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Matchers.same(strComparable0);
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.List list0 = org.mockito.Matchers.anyList();
        java.util.Collection collection1 = org.mockito.Matchers.eq((java.util.Collection) list0);
        java.lang.String[] strArray2 = null;
        java.util.List list3 = org.mockito.Matchers.refEq(list0, strArray2);
        java.util.List list4 = org.mockito.Matchers.eq(list0);
        java.util.Map map5 = org.mockito.Matchers.anyMap();
        java.util.Map map7 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Map map11 = org.mockito.Matchers.refEq(map7, strArray10);
        java.lang.String str12 = org.mockito.Matchers.refEq("hi!", strArray10);
        java.lang.String[] strArray13 = null;
        java.util.Map map15 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Map map19 = org.mockito.Matchers.refEq(map15, strArray18);
        java.lang.CharSequence charSequence20 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray18);
        java.lang.String[] strArray21 = org.mockito.Matchers.refEq(strArray13, strArray18);
        java.lang.String[] strArray22 = org.mockito.Matchers.refEq(strArray10, strArray18);
        java.util.Map map23 = org.mockito.Matchers.refEq(map5, strArray10);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.util.Map map28 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Map map32 = org.mockito.Matchers.refEq(map28, strArray31);
        java.lang.String str33 = org.mockito.Matchers.refEq("hi!", strArray31);
        java.lang.String[] strArray34 = null;
        java.util.Map map36 = org.mockito.Matchers.anyMap();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.Map map40 = org.mockito.Matchers.refEq(map36, strArray39);
        java.lang.CharSequence charSequence41 = org.mockito.Matchers.refEq((java.lang.CharSequence) "", strArray39);
        java.lang.String[] strArray42 = org.mockito.Matchers.refEq(strArray34, strArray39);
        java.lang.String[] strArray43 = org.mockito.Matchers.refEq(strArray31, strArray39);
        java.lang.Object obj44 = org.mockito.Matchers.refEq((java.lang.Object) (short) 1, strArray31);
        java.io.Serializable serializable45 = org.mockito.Matchers.refEq((java.io.Serializable) wildcardClass25, strArray31);
        java.util.Map map46 = org.mockito.Matchers.refEq(map23, strArray31);
        java.util.List list47 = org.mockito.Matchers.refEq(list4, strArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass48 = list47.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNull(collection1);
        org.junit.Assert.assertNull(list3);
        org.junit.Assert.assertNull(list4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(map40);
        org.junit.Assert.assertNull(charSequence41);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(serializable45);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNull(list47);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.mockito.Matchers matchers0 = new org.mockito.Matchers();
        org.mockito.Matchers matchers1 = org.mockito.Matchers.eq(matchers0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = matchers1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(matchers1);
    }
}

