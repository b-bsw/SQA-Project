package org.apache.commons.lang3.builder;

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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectEndText("}");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<size=", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "1) test3001(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "1) test3001(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        boolean boolean13 = toStringStyle0.isUseClassName();
        toStringStyle0.setSizeEndText("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "2) test3002(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "2) test3002(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
// flaky "1) test3002(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = toStringStyle0.isUseClassName();
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray14 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "<null>", charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "3) test3003(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "3) test3003(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "2) test3003(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a' });
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "=", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "4) test3004(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "4) test3004(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "3) test3004(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, ">", doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "5) test3005(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer15 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap17 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "}", objMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "6) test3006(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "5) test3006(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
// flaky "4) test3006(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertNotNull(objMap17);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setUseClassName(true);
        java.lang.String str15 = toStringStyle0.getFieldSeparator();
        boolean boolean16 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "7) test3007(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
// flaky "6) test3007(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        short[] shortArray17 = new short[] { (short) 0, (byte) 100, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", shortArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "8) test3008(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 0, (short) 100, (short) -1, (short) 100 });
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeEndText("hi!");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("{");
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "ToStringStyle.NoFieldNameToStringStyle", doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "9) test3010(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str10 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray16 = new long[] { (-1L), 'a', 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "}", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
// flaky "10) test3011(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { (-1L), 97L, 10L });
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        java.lang.String str10 = toStringStyle0.getArrayStart();
        boolean boolean11 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean12 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "11) test3012(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "7) test3012(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
// flaky "12) test3013(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str10, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle8.setFieldSeparatorAtStart(true);
        boolean boolean11 = toStringStyle8.isUseFieldNames();
        toStringStyle8.setUseIdentityHashCode(false);
        toStringStyle8.setFieldNameValueSeparator("");
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) toStringStyle8);
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "}", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, "hi!");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "{", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart(">");
        java.lang.String str11 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str16 = toStringStyle0.getArrayStart();
        java.lang.String str17 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer18 = null;
        float[] floatArray22 = new float[] { 0.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer18, "ToStringStyle.MultiLineToStringStyle", floatArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "13) test3016(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "8) test3016(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "5) test3016(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 0.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendFieldStart(stringBuffer8, "");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, ">", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, ">");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) stringBuffer11);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        toStringStyle0.setUseClassName(false);
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<null>", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "14) test3020(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray10 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, ">", floatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "15) test3021(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "9) test3021(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray19 = new float[] { (-1L), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, ",", floatArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "16) test3022(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "10) test3022(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { (-1.0f), 32.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean5 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray14 = new float[] { (short) 1, (byte) 10, 0.0f, (short) 10, 1.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, ">", floatArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "17) test3023(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 10.0f, 0.0f, 10.0f, 1.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        toStringStyle0.setContentStart("}");
        boolean boolean13 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) "}");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
// flaky "18) test3024(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.Object obj10 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, obj10);
        boolean boolean12 = toStringStyle0.isUseClassName();
        boolean boolean13 = toStringStyle0.isUseClassName();
        toStringStyle0.setContentStart("<size=");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer16, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparator("<null>");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.DefaultToStringStyle", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "19) test3026(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) boolean7);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        java.lang.String str10 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "20) test3028(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "11) test3028(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
// flaky "6) test3028(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle8.setFieldSeparatorAtStart(true);
        boolean boolean11 = toStringStyle8.isUseFieldNames();
        toStringStyle8.setUseIdentityHashCode(false);
        toStringStyle8.setFieldNameValueSeparator("");
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) toStringStyle8);
        toStringStyle8.setFieldSeparator("\n  ");
        java.lang.StringBuffer stringBuffer19 = null;
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle8.append(stringBuffer19, "<size=", byteArray27, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, ",");
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldNameValueSeparator("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "21) test3030(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "12) test3030(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "7) test3030(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle6.setFieldSeparatorAtStart(true);
        java.lang.String str9 = toStringStyle6.getFieldSeparator();
        java.lang.String str10 = toStringStyle6.getFieldSeparator();
        toStringStyle6.setUseIdentityHashCode(false);
        java.lang.String str13 = toStringStyle6.getArrayEnd();
        java.lang.String str14 = toStringStyle6.getFieldSeparator();
        toStringStyle6.setArraySeparator(">");
        toStringStyle6.setUseClassName(false);
        java.lang.String str19 = toStringStyle6.getSizeStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer5, (java.lang.Object) toStringStyle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n  " + "'", str9, "\n  ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
// flaky "22) test3031(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n  " + "'", str13, "\n  ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n  " + "'", str14, "\n  ");
// flaky "13) test3031(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[" + "'", str19, "[");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getNullText();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str9 = toStringStyle8.getContentStart();
        boolean boolean10 = toStringStyle8.isUseFieldNames();
        java.lang.String str11 = toStringStyle8.getArrayStart();
        toStringStyle8.setFieldSeparator("");
        java.lang.String str14 = toStringStyle8.getSizeEndText();
        boolean boolean15 = toStringStyle8.isFieldSeparatorAtEnd();
        java.lang.String str16 = toStringStyle8.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle17.setFieldSeparatorAtStart(true);
        java.lang.String str20 = toStringStyle17.getFieldSeparator();
        java.lang.String str21 = toStringStyle17.getFieldSeparator();
        toStringStyle17.setArrayEnd("hi!");
        toStringStyle17.setFieldSeparatorAtStart(true);
        java.lang.String str26 = toStringStyle17.getArrayEnd();
        toStringStyle17.setArrayContentDetail(true);
        toStringStyle17.setFieldSeparatorAtEnd(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle31.setFieldSeparatorAtStart(true);
        java.lang.String str34 = toStringStyle31.getFieldSeparator();
        java.lang.String str35 = toStringStyle31.getFieldSeparator();
        boolean boolean36 = toStringStyle31.isUseIdentityHashCode();
        toStringStyle31.setFieldSeparatorAtStart(false);
        boolean boolean39 = toStringStyle31.isUseClassName();
        java.lang.String str40 = toStringStyle31.getSummaryObjectEndText();
        java.lang.Object[] objArray41 = new java.lang.Object[] { str16, false, toStringStyle31 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "<size=", objArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "23) test3032(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<size=" + "'", str9, "<size=");
// flaky "14) test3032(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "8) test3032(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "1) test3032(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[" + "'", str40, "[");
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeStartText("=");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle11.setFieldNameValueSeparator("\n  ");
        toStringStyle11.setFieldNameValueSeparator("{");
        boolean boolean16 = toStringStyle11.isUseClassName();
        java.lang.String str17 = toStringStyle11.getSizeEndText();
        java.lang.String str18 = toStringStyle11.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle11.appendSuper(stringBuffer19, "[");
        toStringStyle0.appendIdentityHashCode(stringBuffer10, (java.lang.Object) toStringStyle11);
        toStringStyle11.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer25 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle27.setFieldSeparatorAtStart(true);
        java.lang.String str30 = toStringStyle27.getFieldSeparator();
        java.lang.String str31 = toStringStyle27.getFieldSeparator();
        toStringStyle27.setSummaryObjectEndText("[");
        toStringStyle27.setContentEnd("<size=");
        boolean boolean36 = toStringStyle27.isDefaultFullDetail();
        toStringStyle27.setNullText("}");
        java.lang.String str39 = toStringStyle27.getNullText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle11.appendDetail(stringBuffer25, "}", (java.lang.Object) str39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "24) test3033(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "15) test3033(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "9) test3033(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str17, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{" + "'", str18, "{");
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "}" + "'", str39, "}");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.String str11 = toStringStyle0.getSizeStartText();
        boolean boolean12 = toStringStyle0.isArrayContentDetail();
        boolean boolean14 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "25) test3034(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray11 = new int[] { 10, 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, ",", intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "26) test3035(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 10, 0, 10 });
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendSuper(stringBuffer8, ">");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer13, "<null>", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "{");
        java.lang.StringBuffer stringBuffer11 = null;
        short[] shortArray14 = new short[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<null>", shortArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10 });
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str13 = toStringStyle12.getContentStart();
        boolean boolean14 = toStringStyle12.isUseFieldNames();
        boolean boolean15 = toStringStyle12.isUseShortClassName();
        toStringStyle12.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle12.appendSuper(stringBuffer18, "hi!");
        toStringStyle12.setArrayContentDetail(true);
        toStringStyle12.setArrayStart("");
        toStringStyle12.setDefaultFullDetail(false);
        boolean boolean27 = toStringStyle12.isUseFieldNames();
        java.lang.String str28 = toStringStyle12.getSizeStartText();
        java.lang.String str29 = toStringStyle12.getArrayEnd();
        java.lang.String str30 = toStringStyle12.getContentStart();
        java.lang.String str31 = toStringStyle12.getSizeEndText();
        boolean boolean32 = toStringStyle12.isFieldSeparatorAtEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) boolean32, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<size=" + "'", str13, "<size=");
// flaky "27) test3038(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "16) test3038(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "=" + "'", str28, "=");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n  " + "'", str29, "\n  ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<size=" + "'", str30, "<size=");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray13 = new long[] { 1L, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "}", longArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "28) test3040(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  " + "'", str3, "\n  ");
// flaky "17) test3040(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L, 1L });
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setContentStart("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean14 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str15 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
// flaky "29) test3041(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str8, "ToStringStyle.MultiLineToStringStyle");
// flaky "18) test3041(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "10) test3041(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str15, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setContentStart("<size=");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "}");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = toStringStyle13.getContentStart();
        boolean boolean15 = toStringStyle13.isUseFieldNames();
        boolean boolean16 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "hi!");
        toStringStyle13.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle13.appendToString(stringBuffer24, ">");
        toStringStyle13.setContentStart("<size=");
        boolean boolean29 = toStringStyle13.isFieldSeparatorAtStart();
        toStringStyle0.appendIdentityHashCode(stringBuffer12, (java.lang.Object) boolean29);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "30) test3042(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str4, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
// flaky "19) test3042(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.MultiLineToStringStyle");
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseIdentityHashCode(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setContentStart(",");
        java.lang.String str14 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle17.setFieldSeparatorAtStart(true);
        java.lang.String str20 = toStringStyle17.getFieldSeparator();
        java.lang.String str21 = toStringStyle17.getFieldSeparator();
        toStringStyle17.setUseClassName(true);
        boolean boolean25 = toStringStyle17.isFullDetail((java.lang.Boolean) false);
        boolean boolean26 = toStringStyle17.isArrayContentDetail();
        boolean boolean27 = toStringStyle17.isFieldSeparatorAtStart();
        toStringStyle17.setUseFieldNames(true);
        toStringStyle17.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer32 = null;
        toStringStyle17.appendToString(stringBuffer32, "ToStringStyle.DefaultToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) stringBuffer32, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "31) test3044(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "20) test3044(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "11) test3044(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray15 = new float[] { 10.0f, 10.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "hi!", floatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 10.0f, 10.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayEnd("[");
        java.lang.String str13 = toStringStyle0.getNullText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "32) test3046(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "21) test3046(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer17 = null;
        boolean[] booleanArray23 = new boolean[] { true, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "ToStringStyle.SimpleToStringStyle", booleanArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(booleanArray23);
        assertBooleanArrayEquals(booleanArray23, new boolean[] { true, true, true, true });
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, ",");
        java.lang.String str10 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayStart("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendSuper(stringBuffer15, "\n  ");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "ToStringStyle.NoFieldNameToStringStyle", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "33) test3048(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "22) test3048(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle6.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle6.isUseFieldNames();
        toStringStyle6.setUseIdentityHashCode(false);
        java.lang.String str12 = toStringStyle6.getSummaryObjectEndText();
        boolean boolean14 = toStringStyle6.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle6);
        java.lang.String str16 = toStringStyle6.getSizeStartText();
        toStringStyle0.appendIdentityHashCode(stringBuffer5, (java.lang.Object) toStringStyle6);
        java.lang.String str18 = toStringStyle0.getArrayEnd();
        boolean boolean19 = toStringStyle0.isUseClassName();
        toStringStyle0.setContentEnd("<size=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "34) test3049(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[" + "'", str18, "[");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparator("<null>");
        toStringStyle0.setUseClassName(true);
        java.lang.String str20 = toStringStyle0.getNullText();
        toStringStyle0.setArrayEnd("<size=");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "35) test3050(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "," + "'", str20, ",");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparator("\n  ");
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "hi!", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "36) test3052(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.String str10 = toStringStyle0.getArrayStart();
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArraySeparator("<size=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "37) test3053(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        java.lang.String str14 = toStringStyle0.getNullText();
        toStringStyle0.setSummaryObjectStartText(">");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "38) test3054(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "39) test3055(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart(">");
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer14 = null;
        int[] intArray22 = new int[] { 0, (-1), (byte) -1, (short) 100, '#', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, ",", intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, (-1), (-1), 100, 35, 10 });
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str15 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "{", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray18 = new float[] { 10L, (byte) 1, (byte) -1, (byte) 100, (short) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.SimpleToStringStyle", floatArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "40) test3058(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "23) test3058(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 10.0f, 1.0f, (-1.0f), 100.0f, (-1.0f), 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setSizeEndText("");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle17.setNullText(">");
        toStringStyle17.setSummaryObjectStartText("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer16, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle17);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str13 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, ">", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "41) test3060(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setContentEnd("{");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendFieldStart(stringBuffer11, "");
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray22 = new char[] { ' ', 'a', '#', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, ",", charArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "42) test3061(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', 'a', '#', '#', ' ', ' ' });
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeEndText("");
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean15 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "43) test3063(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "24) test3063(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendFieldStart(stringBuffer5, "{");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("\n  ");
        toStringStyle10.setFieldNameValueSeparator("{");
        toStringStyle10.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle10.appendIdentityHashCode(stringBuffer17, (java.lang.Object) 1.0f);
        toStringStyle10.setNullText("");
        toStringStyle10.setArrayContentDetail(false);
        java.lang.String str24 = toStringStyle10.getArrayStart();
        toStringStyle10.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer8, "=", (java.lang.Object) "ToStringStyle.DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "44) test3064(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "25) test3064(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayContentDetail(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "45) test3065(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean10 = toStringStyle0.isArrayContentDetail();
        java.lang.String str11 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "hi!", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "46) test3066(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "26) test3066(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = toStringStyle14.getContentStart();
        boolean boolean16 = toStringStyle14.isUseFieldNames();
        java.lang.String str17 = toStringStyle14.getArrayStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer12, "<size=", (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "47) test3067(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "27) test3067(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ">" + "'", str17, ">");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getContentStart();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean14 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean15 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer16, "{");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "48) test3068(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str1, "ToStringStyle.SimpleToStringStyle");
// flaky "28) test3068(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "12) test3068(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean7 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("hi!");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ",", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "49) test3069(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "29) test3069(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setNullText("}");
        java.lang.String str12 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.MultiLineToStringStyle", byteArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 100 });
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("=");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "=");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.DefaultToStringStyle");
        java.lang.String str14 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer17 = null;
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "[", byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setNullText("}");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = toStringStyle13.getContentStart();
        boolean boolean15 = toStringStyle13.isUseFieldNames();
        boolean boolean16 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "hi!");
        toStringStyle13.setArrayContentDetail(true);
        toStringStyle13.setArrayStart("");
        toStringStyle13.setDefaultFullDetail(false);
        boolean boolean28 = toStringStyle13.isUseFieldNames();
        java.lang.String str29 = toStringStyle13.getSizeStartText();
        java.lang.String str30 = toStringStyle13.getArrayEnd();
        toStringStyle0.appendIdentityHashCode(stringBuffer12, (java.lang.Object) str30);
        toStringStyle0.setContentStart("<null>");
        java.lang.String str34 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "50) test3074(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "30) test3074(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "," + "'", str29, ",");
// flaky "13) test3074(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n  " + "'", str30, "\n  ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str34, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setContentEnd("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "[", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "51) test3075(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setNullText("}");
        java.lang.String str12 = toStringStyle0.getFieldSeparator();
        java.lang.String str13 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<null>" + "'", str13, "<null>");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayContentDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.SimpleToStringStyle", objMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(objMap11);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart(">");
        toStringStyle0.setContentEnd("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str15 = toStringStyle0.getArrayEnd();
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "52) test3079(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n  " + "'", str15, "\n  ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray17 = new int[] { (short) -1, ' ', '4', 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "\n  ", intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "53) test3080(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "31) test3080(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 32, 52, 1, 100 });
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "{");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        toStringStyle0.setSummaryObjectEndText(",");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer18 = null;
        boolean[] booleanArray25 = new boolean[] { true, false, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "=", booleanArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
// flaky "54) test3082(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(booleanArray25);
        assertBooleanArrayEquals(booleanArray25, new boolean[] { true, false, false, true, false });
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
// flaky "55) test3083(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
// flaky "32) test3083(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle2.setFieldNameValueSeparator("\n  ");
        toStringStyle2.setFieldNameValueSeparator("{");
        boolean boolean7 = toStringStyle2.isUseIdentityHashCode();
        java.lang.String str8 = toStringStyle2.getFieldNameValueSeparator();
        toStringStyle2.setFieldNameValueSeparator("{");
        toStringStyle2.setContentEnd(">");
        java.lang.String str13 = toStringStyle2.getFieldSeparator();
        java.lang.String str14 = toStringStyle2.getSummaryObjectEndText();
        toStringStyle0.appendIdentityHashCode(stringBuffer1, (java.lang.Object) toStringStyle2);
        boolean boolean16 = toStringStyle2.isUseClassName();
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle18.setFieldSeparatorAtStart(true);
        boolean boolean21 = toStringStyle18.isUseFieldNames();
        java.lang.String str22 = toStringStyle18.getArrayStart();
        java.lang.String str23 = toStringStyle18.getNullText();
        toStringStyle18.setArrayStart("{");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle2.appendEnd(stringBuffer17, (java.lang.Object) "{");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str14, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "56) test3084(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseShortClassName(false);
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str10 = toStringStyle9.getContentStart();
        boolean boolean11 = toStringStyle9.isUseFieldNames();
        boolean boolean12 = toStringStyle9.isFieldSeparatorAtEnd();
        toStringStyle9.setFieldSeparator("");
        boolean boolean15 = toStringStyle9.isDefaultFullDetail();
        boolean boolean16 = toStringStyle9.isFieldSeparatorAtStart();
        toStringStyle9.setArrayContentDetail(false);
        toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = toStringStyle3.getContentStart();
        toStringStyle3.setArrayEnd("\n  ");
        boolean boolean7 = toStringStyle3.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) boolean9);
        boolean boolean11 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer16 = null;
        short[] shortArray22 = new short[] { (byte) 0, (byte) 10, (short) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "}", shortArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 0, (short) 10, (short) 100, (short) -1 });
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "<size=");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean13 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "[");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        java.lang.String str16 = toStringStyle0.getSizeStartText();
        java.lang.String str17 = toStringStyle0.getArrayEnd();
        java.lang.String str18 = toStringStyle0.getContentStart();
        java.lang.String str19 = toStringStyle0.getSizeEndText();
        boolean boolean20 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer23, "<null>", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "57) test3090(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<null>" + "'", str18, "<null>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<size=" + "'", str19, "<size=");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setContentEnd("{");
        java.lang.String str16 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle19.setFieldSeparatorAtStart(true);
        boolean boolean22 = toStringStyle19.isUseFieldNames();
        java.lang.String str23 = toStringStyle19.getArraySeparator();
        toStringStyle19.setContentEnd("[");
        toStringStyle19.setNullText(">");
        boolean boolean28 = toStringStyle19.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer29 = null;
        toStringStyle19.appendSuper(stringBuffer29, ",");
        boolean boolean32 = toStringStyle19.isDefaultFullDetail();
        java.lang.String str33 = toStringStyle19.getFieldSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "\n  ", (java.lang.Object) str33, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "58) test3091(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str16, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str23, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.SimpleToStringStyle");
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        boolean boolean9 = toStringStyle0.isUseClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "59) test3092(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart(">");
        java.lang.String str11 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray17 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, ",", booleanArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "60) test3094(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { true });
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentStart("<null>");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle6.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle6.isUseFieldNames();
        toStringStyle6.setUseIdentityHashCode(false);
        java.lang.String str12 = toStringStyle6.getSummaryObjectEndText();
        boolean boolean14 = toStringStyle6.isFullDetail((java.lang.Boolean) false);
        toStringStyle6.setUseFieldNames(false);
        toStringStyle6.setDefaultFullDetail(false);
        toStringStyle6.setSummaryObjectStartText("<size=");
        java.lang.String str21 = toStringStyle6.getFieldNameValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer5, (java.lang.Object) toStringStyle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "61) test3095(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n  " + "'", str12, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[" + "'", str21, "[");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setArraySeparator("}");
        boolean boolean21 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) "}");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str14, "ToStringStyle.DefaultToStringStyle");
// flaky "62) test3096(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) str6);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str11 = toStringStyle0.getNullText();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectEndText("{");
        boolean boolean16 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean17 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "ToStringStyle.SimpleToStringStyle", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        toStringStyle0.setSummaryObjectEndText(",");
        boolean boolean10 = toStringStyle0.isUseClassName();
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray21 = new float[] { (short) 0, (short) 10, 100, (short) -1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "ToStringStyle.MultiLineToStringStyle", floatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "63) test3099(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
// flaky "33) test3099(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "14) test3099(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str11, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 0.0f, 10.0f, 100.0f, (-1.0f), 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("[");
        boolean boolean13 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer14 = null;
        long[] longArray19 = new long[] { '#', (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "{", longArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 35L, (-1L), 100L });
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayEnd(",");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.SimpleToStringStyle", byteArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        java.lang.String str16 = toStringStyle0.getSizeStartText();
        java.lang.String str17 = toStringStyle0.getArrayEnd();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str20 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer23 = null;
        long[] longArray30 = new long[] { (short) 100, (short) 1, 100L, (-1L), 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer23, "\n  ", longArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "64) test3102(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{" + "'", str20, "{");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 100L, 1L, 100L, (-1L), 1L });
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, ",");
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer17 = null;
        long[] longArray19 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "ToStringStyle.DefaultToStringStyle", longArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "65) test3103(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] {});
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSummaryObjectEndText("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str11 = toStringStyle10.getSizeStartText();
        toStringStyle10.setContentStart("[");
        boolean boolean14 = toStringStyle10.isUseShortClassName();
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle10.appendSuper(stringBuffer15, "");
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle19.setFieldSeparatorAtStart(true);
        java.lang.String str22 = toStringStyle19.getFieldSeparator();
        java.lang.String str23 = toStringStyle19.getFieldSeparator();
        toStringStyle19.setUseClassName(true);
        boolean boolean27 = toStringStyle19.isFullDetail((java.lang.Boolean) false);
        boolean boolean28 = toStringStyle19.isArrayContentDetail();
        boolean boolean29 = toStringStyle19.isFieldSeparatorAtStart();
        toStringStyle19.setSizeEndText("");
        java.lang.String str32 = toStringStyle19.getFieldSeparator();
        java.lang.String str33 = toStringStyle19.getFieldSeparator();
// flaky "66) test3104(org.apache.commons.lang3.builder.RegressionTest6)":         toStringStyle10.appendIdentityHashCode(stringBuffer18, (java.lang.Object) str33);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer8, ">", (java.lang.Object) stringBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "34) test3104(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
// flaky "15) test3104(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<null>", byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) -1 });
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer7, "=", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("=");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "=");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.DefaultToStringStyle");
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean16 = toStringStyle0.isUseClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, ",", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str11 = toStringStyle0.getNullText();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectEndText("{");
        boolean boolean16 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean17 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSizeStartText("=");
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str12 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "67) test3110(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setSizeStartText(",");
        java.lang.String str13 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        boolean boolean16 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "<size=", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setSizeStartText("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        boolean[] booleanArray8 = new boolean[] { false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "ToStringStyle.SimpleToStringStyle", booleanArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray8);
        assertBooleanArrayEquals(booleanArray8, new boolean[] { false, false, true });
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeEndText("<size=");
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendFieldStart(stringBuffer8, "<null>");
        toStringStyle0.setFieldSeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "}", doubleArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer3 = null;
        long[] longArray6 = new long[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer3, ",", longArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { (-1L) });
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendSuper(stringBuffer14, "hi!");
        toStringStyle0.setArrayStart("");
        java.lang.String str19 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "68) test3116(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectEndText("hi!");
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray17 = new char[] { '4', 'a', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, ">", charArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', 'a', '4', ' ' });
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayEnd("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "69) test3118(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        toStringStyle0.setSummaryObjectEndText(",");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str12 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean10 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle9.setFieldSeparatorAtStart(true);
        java.lang.String str12 = toStringStyle9.getFieldSeparator();
        java.lang.String str13 = toStringStyle9.getFieldSeparator();
        java.lang.String str14 = toStringStyle9.getSizeStartText();
        toStringStyle9.setArrayEnd("=");
        toStringStyle9.setContentEnd("ToStringStyle.NoFieldNameToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) "ToStringStyle.NoFieldNameToStringStyle", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{" + "'", str12, "{");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.StringBuffer stringBuffer12 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap14 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.DefaultToStringStyle", objMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
// flaky "70) test3123(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertNotNull(objMap14);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.String str12 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "[", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "71) test3124(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
// flaky "35) test3124(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str12, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setContentEnd(",");
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer17 = null;
        char[] charArray23 = new char[] { ' ', 'a', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "ToStringStyle.MultiLineToStringStyle", charArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "72) test3125(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "36) test3125(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { ' ', 'a', '#', 'a' });
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setSummaryObjectStartText("[");
        boolean boolean12 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "73) test3126(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSummaryObjectEndText("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray13 = new short[] { (short) 100, (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "}", shortArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 100, (short) 10, (short) 10 });
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean14 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer15, ">");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 5, end 0, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        boolean boolean8 = toStringStyle0.isUseClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setArrayEnd("=");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle14.setFieldSeparatorAtStart(true);
        boolean boolean17 = toStringStyle14.isUseFieldNames();
        toStringStyle14.setUseIdentityHashCode(false);
        java.lang.String str20 = toStringStyle14.getSummaryObjectEndText();
        boolean boolean22 = toStringStyle14.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle14);
        java.lang.String str24 = toStringStyle14.getSizeStartText();
        java.lang.String str25 = toStringStyle14.getArrayStart();
// flaky "74) test3130(org.apache.commons.lang3.builder.RegressionTest6)":         toStringStyle0.appendIdentityHashCode(stringBuffer13, (java.lang.Object) str25);
        java.lang.StringBuffer stringBuffer27 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle28.setFieldSeparatorAtStart(true);
        boolean boolean31 = toStringStyle28.isUseFieldNames();
        java.lang.String str32 = toStringStyle28.getArraySeparator();
        toStringStyle28.setContentEnd("[");
        toStringStyle28.setNullText(">");
        boolean boolean37 = toStringStyle28.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer38 = null;
        toStringStyle28.appendSuper(stringBuffer38, ",");
        toStringStyle28.setSizeEndText("");
        toStringStyle28.setUseClassName(false);
        java.lang.String str45 = toStringStyle28.getArrayEnd();
// flaky "37) test3130(org.apache.commons.lang3.builder.RegressionTest6)":         toStringStyle0.appendIdentityHashCode(stringBuffer27, (java.lang.Object) str45);
        java.lang.StringBuffer stringBuffer47 = null;
        byte[] byteArray55 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer47, "ToStringStyle.DefaultToStringStyle", byteArray55, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "16) test3130(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
// flaky "2) test3130(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "1) test3130(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str24, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky "1) test3130(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky "1) test3130(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("[");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        boolean boolean14 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray21 = new float[] { 1, (-1.0f), 100.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", floatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "75) test3131(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 1.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str11 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectStartText("{");
        boolean boolean14 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) "{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
// flaky "76) test3132(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.Class<?> wildcardClass9 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle2.setFieldNameValueSeparator("\n  ");
        toStringStyle2.setFieldNameValueSeparator("{");
        boolean boolean7 = toStringStyle2.isUseIdentityHashCode();
        java.lang.String str8 = toStringStyle2.getFieldNameValueSeparator();
        toStringStyle2.setFieldNameValueSeparator("{");
        toStringStyle2.setContentEnd(">");
        java.lang.String str13 = toStringStyle2.getFieldSeparator();
        java.lang.String str14 = toStringStyle2.getSummaryObjectEndText();
        toStringStyle0.appendIdentityHashCode(stringBuffer1, (java.lang.Object) toStringStyle2);
        java.lang.String str16 = toStringStyle2.getArraySeparator();
        java.lang.StringBuffer stringBuffer17 = null;
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle2.append(stringBuffer17, "}", doubleArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle11.setFieldSeparatorAtStart(true);
        java.lang.String str14 = toStringStyle11.getFieldSeparator();
        java.lang.String str15 = toStringStyle11.getFieldSeparator();
        boolean boolean16 = toStringStyle11.isUseIdentityHashCode();
        java.lang.String str17 = toStringStyle11.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle11.appendSuper(stringBuffer18, "=");
        toStringStyle11.setNullText("ToStringStyle.DefaultToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer10, (java.lang.Object) toStringStyle11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ">" + "'", str17, ">");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) 1.0f);
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean15 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle18.setFieldNameValueSeparator("\n  ");
        toStringStyle18.setFieldNameValueSeparator("{");
        java.lang.String str23 = toStringStyle18.getArrayEnd();
        java.lang.Class<?> wildcardClass24 = toStringStyle18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer16, "[", (java.lang.Object) toStringStyle18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str12, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "=" + "'", str23, "=");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str12 = toStringStyle11.getSizeStartText();
        toStringStyle11.setContentStart("[");
        boolean boolean15 = toStringStyle11.isUseShortClassName();
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle11.appendSuper(stringBuffer16, "");
        toStringStyle11.setSummaryObjectEndText(",");
        toStringStyle11.setFieldSeparatorAtEnd(false);
        toStringStyle11.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        boolean boolean25 = toStringStyle11.isUseClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer10, (java.lang.Object) toStringStyle11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "77) test3137(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "38) test3137(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "=" + "'", str12, "=");
// flaky "17) test3137(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeEndText("");
        java.lang.String str13 = toStringStyle0.getFieldSeparator();
        java.lang.String str14 = toStringStyle0.getFieldSeparator();
        java.lang.String str15 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "78) test3138(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "39) test3138(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "18) test3138(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
// flaky "3) test3138(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
// flaky "2) test3138(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentEnd("<size=");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray18 = new boolean[] { false, false, false, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", booleanArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "79) test3139(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "40) test3139(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
// flaky "19) test3139(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray18);
        assertBooleanArrayEquals(booleanArray18, new boolean[] { false, false, false, true, true, false });
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        java.lang.String str5 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart("{");
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "80) test3140(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str5, "ToStringStyle.DefaultToStringStyle");
// flaky "41) test3140(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setSummaryObjectStartText("\n  ");
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str17 = toStringStyle16.getContentStart();
        boolean boolean18 = toStringStyle16.isUseFieldNames();
        java.lang.String str19 = toStringStyle16.getArrayStart();
        java.lang.String str20 = toStringStyle16.getFieldNameValueSeparator();
        java.lang.String str21 = toStringStyle16.getFieldSeparator();
        toStringStyle16.setSummaryObjectStartText(">");
        java.lang.String str24 = toStringStyle16.getSummaryObjectStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "ToStringStyle.NoFieldNameToStringStyle", (java.lang.Object) str24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<null>" + "'", str17, "<null>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky "81) test3142(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "," + "'", str21, ",");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ">" + "'", str24, ">");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "{", byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "82) test3143(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "42) test3143(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setNullText("\n  ");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean14 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setContentEnd("{");
        java.lang.String str16 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str17 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "83) test3145(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "43) test3145(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ">" + "'", str17, ">");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "}", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "84) test3146(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseShortClassName(true);
        java.lang.Class<?> wildcardClass14 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray18 = new long[] { 1L, (short) 100, 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "\n  ", longArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 1L, 100L, 97L, 1L });
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setContentStart("{");
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray9 = new float[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "\n  ", floatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "85) test3149(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
// flaky "44) test3149(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setSizeStartText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setContentStart("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.MultiLineToStringStyle", objMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("=");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "=");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, ">");
        toStringStyle0.setNullText(">");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("=");
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray15 = new short[] { (byte) -1, (short) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "[", shortArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) -1, (short) 0, (short) 1, (short) 1 });
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setContentStart("=");
        toStringStyle0.setSummaryObjectStartText("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "86) test3153(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, "{");
        java.lang.StringBuffer stringBuffer14 = null;
        short[] shortArray19 = new short[] { (byte) 10, (byte) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.DefaultToStringStyle", shortArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 10, (short) 100, (short) 100 });
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer7, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean12 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendFieldStart(stringBuffer13, "=");
        boolean boolean16 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("}");
        toStringStyle0.setArrayEnd("=");
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer23, "ToStringStyle.DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "87) test3156(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "45) test3156(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        toStringStyle0.setUseClassName(false);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "88) test3157(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer2 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer2, (java.lang.Object) (byte) 100);
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray12 = new float[] { 10L, 100.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "", floatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "89) test3159(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 10.0f, 100.0f, 35.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("\n  ");
        boolean boolean13 = toStringStyle10.isArrayContentDetail();
        java.lang.String str14 = toStringStyle10.getFieldSeparator();
        boolean boolean15 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle10);
        java.lang.String str16 = toStringStyle10.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer17 = null;
// flaky "90) test3160(org.apache.commons.lang3.builder.RegressionTest6)":         toStringStyle10.appendFieldStart(stringBuffer17, "");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer9, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n  " + "'", str16, "\n  ");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeEndText("<size=");
        java.lang.String str7 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayStart(">");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("\n  ");
        boolean boolean17 = toStringStyle14.isArrayContentDetail();
        toStringStyle14.setContentEnd(",");
        boolean boolean20 = toStringStyle14.isUseIdentityHashCode();
        java.lang.String str21 = toStringStyle14.getFieldNameValueSeparator();
        boolean boolean22 = toStringStyle14.isFieldSeparatorAtEnd();
        toStringStyle14.setFieldNameValueSeparator(",");
        toStringStyle14.setArrayContentDetail(true);
        toStringStyle14.setContentStart("ToStringStyle.SimpleToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer13, (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n  " + "'", str21, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setFieldNameValueSeparator("<null>");
        toStringStyle0.setSizeStartText("\n  ");
        toStringStyle0.setSizeEndText("{");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer22 = null;
        int[] intArray29 = new int[] { 1, (byte) 0, 10, 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "hi!", intArray29, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 1, 0, 10, 0, 100 });
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str14 = toStringStyle0.getArrayStart();
        java.lang.String str15 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "[", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "91) test3163(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "=" + "'", str15, "=");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentEnd("");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer11 = null;
        short[] shortArray14 = new short[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.SimpleToStringStyle", shortArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        boolean boolean8 = toStringStyle0.isUseClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.DefaultToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "92) test3166(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
// flaky "46) test3166(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray16 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "", booleanArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray11 = new float[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<null>", floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "93) test3168(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 100.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle12.setFieldSeparatorAtStart(true);
        java.lang.String str15 = toStringStyle12.getFieldSeparator();
        java.lang.String str16 = toStringStyle12.getFieldSeparator();
        toStringStyle12.setUseIdentityHashCode(false);
        toStringStyle12.setArrayContentDetail(false);
        java.lang.Class<?> wildcardClass21 = toStringStyle12.getClass();
        java.lang.Object[] objArray22 = new java.lang.Object[] { toStringStyle12 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "ToStringStyle.DefaultToStringStyle", objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "94) test3169(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<size=" + "'", str9, "<size=");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray17 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "{", booleanArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { false });
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setSizeStartText("\n  ");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setFieldSeparator("}");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSizeStartText("<null>");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer15, "ToStringStyle.SimpleToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "95) test3172(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendSuper(stringBuffer8, "[");
        java.lang.StringBuffer stringBuffer11 = null;
        short[] shortArray13 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<size=", shortArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "96) test3173(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] {});
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean14 = toStringStyle0.isDefaultFullDetail();
        boolean boolean16 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("[");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer16 = null;
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "ToStringStyle.NoFieldNameToStringStyle", byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "97) test3175(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle13.setNullText(">");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle13.appendSuper(stringBuffer16, "=");
        toStringStyle13.setArrayContentDetail(true);
        toStringStyle13.setUseShortClassName(true);
        toStringStyle13.setArrayEnd("}");
        boolean boolean25 = toStringStyle13.isUseFieldNames();
        boolean boolean26 = toStringStyle13.isDefaultFullDetail();
        toStringStyle13.setArraySeparator("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer11, "hi!", (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "98) test3176(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "47) test3176(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean16 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "99) test3177(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "48) test3177(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, ",");
        boolean boolean13 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "100) test3178(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "49) test3178(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, ",");
        java.lang.String str10 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayStart("ToStringStyle.MultiLineToStringStyle");
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean14 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "101) test3179(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle17.setFieldNameValueSeparator("\n  ");
        toStringStyle17.setFieldNameValueSeparator("{");
        boolean boolean22 = toStringStyle17.isUseIdentityHashCode();
        java.lang.String str23 = toStringStyle17.getSummaryObjectEndText();
        java.lang.String str24 = toStringStyle17.getSummaryObjectStartText();
        toStringStyle17.setFieldSeparatorAtStart(false);
        toStringStyle17.setUseFieldNames(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str23, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ">" + "'", str24, ">");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer13 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ",", objMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "102) test3181(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objMap15);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setDefaultFullDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "103) test3182(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray18 = new boolean[] { false, false, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.DefaultToStringStyle", booleanArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "104) test3183(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray18);
        assertBooleanArrayEquals(booleanArray18, new boolean[] { false, false, true, true, false });
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ">", byteArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str18 = toStringStyle0.getContentEnd();
        boolean boolean19 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer20 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap22 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, "<null>", objMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ">" + "'", str18, ">");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objMap22);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setFieldNameValueSeparator("");
        boolean boolean16 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectEndText("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setSummaryObjectEndText("=");
        java.lang.String str16 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer17 = null;
        long[] longArray25 = new long[] { (-1), 'a', (byte) 0, (short) -1, 10, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "ToStringStyle.NoFieldNameToStringStyle", longArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { (-1L), 97L, 0L, (-1L), 10L, (-1L) });
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setUseIdentityHashCode(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object obj11 = null;
        toStringStyle0.appendStart(stringBuffer10, obj11);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "105) test3189(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray14 = new int[] { 1, (byte) 10, (byte) 1, (byte) 10, (short) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "", intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "106) test3190(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "50) test3190(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 10, 1, 10, 1, 1 });
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "hi!");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle12.setFieldSeparatorAtStart(true);
        java.lang.String str15 = toStringStyle12.getFieldSeparator();
        java.lang.String str16 = toStringStyle12.getFieldSeparator();
        toStringStyle12.setUseClassName(true);
        boolean boolean20 = toStringStyle12.isFullDetail((java.lang.Boolean) false);
        java.lang.String str21 = toStringStyle12.getSummaryObjectEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer10, "\n  ", (java.lang.Object) str21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "107) test3191(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "}" + "'", str21, "}");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray14 = new long[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "ToStringStyle.DefaultToStringStyle", longArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "108) test3192(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
// flaky "51) test3192(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 97L });
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setUseClassName(false);
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = toStringStyle13.getContentStart();
        boolean boolean15 = toStringStyle13.isUseFieldNames();
        boolean boolean16 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setFieldSeparator("hi!");
        java.lang.String str19 = toStringStyle13.getContentStart();
        boolean boolean20 = toStringStyle13.isArrayContentDetail();
        toStringStyle13.setSummaryObjectEndText("[");
        java.lang.String str23 = toStringStyle13.getFieldSeparator();
        boolean boolean24 = toStringStyle13.isDefaultFullDetail();
        toStringStyle13.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        toStringStyle13.setSizeStartText(",");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer12, (java.lang.Object) ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{" + "'", str14, "{");
// flaky "109) test3194(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
// flaky "52) test3194(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayContentDetail(true);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "110) test3195(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
// flaky "53) test3195(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "20) test3195(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str5 = toStringStyle0.getNullText();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer7, ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "111) test3196(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setArrayContentDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "112) test3197(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayEnd("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle12.setFieldNameValueSeparator("\n  ");
        boolean boolean15 = toStringStyle12.isArrayContentDetail();
        boolean boolean17 = toStringStyle12.isFullDetail((java.lang.Boolean) false);
        boolean boolean18 = toStringStyle12.isDefaultFullDetail();
        java.lang.String str19 = toStringStyle12.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer10, "}", (java.lang.Object) str19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<size=" + "'", str5, "<size=");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setNullText("\n  ");
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, ">", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSizeEndText(">");
        java.lang.StringBuffer stringBuffer14 = null;
        long[] longArray16 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "=", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] {});
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setNullText("\n  ");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer11, ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "113) test3201(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "54) test3201(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "[", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "<size=");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "<null>");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "114) test3203(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "55) test3203(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer15, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray17 = new char[] { 'a', 'a', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<null>", charArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "115) test3205(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
// flaky "56) test3205(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'a', 'a', 'a', 'a' });
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSizeEndText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray14 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "hi!", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setArrayContentDetail(false);
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "}", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        toStringStyle0.setNullText(">");
        boolean boolean12 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle18.setFieldSeparatorAtStart(true);
        boolean boolean21 = toStringStyle18.isUseFieldNames();
        toStringStyle18.setUseIdentityHashCode(false);
        toStringStyle18.setUseFieldNames(false);
        java.lang.String str26 = toStringStyle18.getNullText();
        java.lang.String str27 = toStringStyle18.getSummaryObjectEndText();
        toStringStyle18.setArraySeparator("{");
        java.lang.String str30 = toStringStyle18.getNullText();
        toStringStyle0.appendClassName(stringBuffer17, (java.lang.Object) toStringStyle18);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "116) test3208(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ">" + "'", str26, ">");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str27, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ">" + "'", str30, ">");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendFieldStart(stringBuffer11, "");
        java.lang.StringBuffer stringBuffer14 = null;
        double[] doubleArray22 = new double[] { 100.0d, 1L, (-1.0f), (byte) 1, (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.NoFieldNameToStringStyle", doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "117) test3209(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 1.0d, (-1.0d), 1.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.DefaultToStringStyle", (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle13.setUseFieldNames(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer11, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "118) test3211(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
        org.junit.Assert.assertNotNull(toStringStyle13);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        boolean boolean14 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "119) test3212(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "ToStringStyle.NoFieldNameToStringStyle", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "120) test3213(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "57) test3213(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setContentStart("{");
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray10 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "{", intArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] {});
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "{", objMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "121) test3215(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objMap12);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "=", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setContentStart(",");
        java.lang.String str14 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator("}");
        java.lang.String str17 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer18 = null;
        char[] charArray23 = new char[] { ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "}", charArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
// flaky "122) test3217(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "58) test3217(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{" + "'", str17, "{");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { ' ', '#', 'a' });
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("}");
        java.lang.String str14 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer15 = null;
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "<size=", byteArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{" + "'", str14, "{");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "123) test3219(org.apache.commons.lang3.builder.RegressionTest6)":         toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer11 = null;
// flaky "59) test3219(org.apache.commons.lang3.builder.RegressionTest6)":         toStringStyle0.appendToString(stringBuffer11, ">");
        toStringStyle0.setContentStart("<size=");
        boolean boolean16 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer17 = null;
        float[] floatArray20 = new float[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "ToStringStyle.NoFieldNameToStringStyle", floatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "21) test3219(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 52.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeEndText("");
        java.lang.String str13 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ">", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "124) test3220(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "60) test3220(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        boolean boolean4 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, ">", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setContentEnd("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray16 = new long[] { (short) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "}", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "125) test3222(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L, 32L });
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("}");
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSizeStartText("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str12 = toStringStyle11.getContentStart();
        toStringStyle11.setArrayEnd("\n  ");
        java.lang.String str15 = toStringStyle11.getSummaryObjectStartText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle11);
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean19 = toStringStyle18.isUseShortClassName();
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str22 = toStringStyle21.getContentStart();
        toStringStyle21.setArrayEnd("\n  ");
        boolean boolean25 = toStringStyle21.isUseIdentityHashCode();
        boolean boolean27 = toStringStyle21.isFullDetail((java.lang.Boolean) true);
        toStringStyle18.appendClassName(stringBuffer20, (java.lang.Object) boolean27);
        boolean boolean29 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle18);
        toStringStyle11.appendIdentityHashCode(stringBuffer17, (java.lang.Object) boolean29);
        boolean boolean31 = toStringStyle11.isUseShortClassName();
        boolean boolean32 = toStringStyle11.isArrayContentDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer9, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) toStringStyle11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "126) test3224(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "61) test3224(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<size=" + "'", str12, "<size=");
// flaky "22) test3224(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<size=" + "'", str22, "<size=");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        toStringStyle0.setContentStart("}");
        boolean boolean14 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean15 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "127) test3225(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean10 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setContentStart("{");
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray17 = new int[] { ' ', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "\n  ", intArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 32, 0 });
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean13 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str14 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "\n  ", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "128) test3227(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "}" + "'", str14, "}");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str12 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n  " + "'", str12, "\n  ");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        int[] intArray11 = new int[] { (byte) 0, ' ', (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, ",", intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 32, 1, 35 });
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str14 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseClassName(true);
        boolean boolean17 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayContentDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "129) test3230(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "62) test3230(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle6.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle6.isUseFieldNames();
        toStringStyle6.setUseIdentityHashCode(false);
        java.lang.String str12 = toStringStyle6.getSummaryObjectEndText();
        boolean boolean14 = toStringStyle6.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle6);
        java.lang.String str16 = toStringStyle6.getSizeStartText();
        toStringStyle0.appendIdentityHashCode(stringBuffer5, (java.lang.Object) toStringStyle6);
        toStringStyle6.setArrayStart("=");
        java.lang.StringBuffer stringBuffer20 = null;
        short[] shortArray25 = new short[] { (byte) 1, (short) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle6.appendDetail(stringBuffer20, "ToStringStyle.NoFieldNameToStringStyle", shortArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "130) test3231(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 1, (short) 0, (short) -1 });
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, ",", doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "131) test3232(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "132) test3233(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str4, "ToStringStyle.NoFieldNameToStringStyle");
// flaky "63) test3233(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparator("\n  ");
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer17 = null;
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "{", byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        boolean boolean13 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
// flaky "133) test3235(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setContentEnd("{");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str11 = toStringStyle10.getContentStart();
        boolean boolean12 = toStringStyle10.isUseFieldNames();
        boolean boolean13 = toStringStyle10.isUseShortClassName();
        toStringStyle10.setDefaultFullDetail(true);
        boolean boolean16 = toStringStyle10.isFieldSeparatorAtEnd();
        toStringStyle10.setSummaryObjectStartText("=");
        java.lang.String str19 = toStringStyle10.getFieldNameValueSeparator();
        java.lang.String str20 = toStringStyle10.getSizeStartText();
        java.lang.String str21 = toStringStyle10.getSizeStartText();
        toStringStyle10.setUseFieldNames(false);
        boolean boolean24 = toStringStyle10.isArrayContentDetail();
        toStringStyle10.setFieldSeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.Object[] objArray27 = new java.lang.Object[] { "ToStringStyle.MultiLineToStringStyle" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.NoFieldNameToStringStyle", objArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "134) test3236(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "," + "'", str20, ",");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "," + "'", str21, ",");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[ToStringStyle.MultiLineToStringStyle]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[ToStringStyle.MultiLineToStringStyle]");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        java.lang.String str16 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
// flaky "135) test3238(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle17.setFieldNameValueSeparator("\n  ");
        toStringStyle17.setFieldNameValueSeparator("{");
        boolean boolean22 = toStringStyle17.isUseIdentityHashCode();
        toStringStyle17.setSummaryObjectStartText(">");
        toStringStyle17.setSizeEndText("=");
        toStringStyle17.setFieldSeparator("[");
        toStringStyle17.setDefaultFullDetail(false);
        java.lang.String str31 = toStringStyle17.getSummaryObjectEndText();
        toStringStyle17.setUseIdentityHashCode(true);
        toStringStyle17.setContentEnd("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer15, "\n  ", (java.lang.Object) toStringStyle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str31, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setFieldNameValueSeparator("}");
        toStringStyle0.setContentStart("=");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle16.setFieldNameValueSeparator("\n  ");
        toStringStyle16.setFieldNameValueSeparator("{");
        boolean boolean21 = toStringStyle16.isUseClassName();
        java.lang.String str22 = toStringStyle16.getSizeEndText();
        java.lang.String str23 = toStringStyle16.getFieldNameValueSeparator();
        toStringStyle16.setArraySeparator(">");
        toStringStyle16.setArraySeparator("{");
        java.lang.String str28 = toStringStyle16.getContentEnd();
        java.lang.String str29 = toStringStyle16.getSizeEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer14, "ToStringStyle.NoFieldNameToStringStyle", (java.lang.Object) toStringStyle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "136) test3240(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "=" + "'", str22, "=");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{" + "'", str23, "{");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "=" + "'", str29, "=");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeEndText("");
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str15 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.NoFieldNameToStringStyle");
        boolean boolean18 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "137) test3242(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, ",");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.SimpleToStringStyle", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArraySeparator("{");
        java.lang.String str12 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray17 = new long[] { (byte) 0, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "\n  ", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "138) test3244(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n  " + "'", str8, "\n  ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
// flaky "64) test3244(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n  " + "'", str12, "\n  ");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L, 1L });
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        toStringStyle0.setSummaryObjectEndText(",");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = toStringStyle14.getContentStart();
        boolean boolean16 = toStringStyle14.isUseFieldNames();
        boolean boolean17 = toStringStyle14.isUseShortClassName();
        toStringStyle14.setFieldSeparator("hi!");
        java.lang.String str20 = toStringStyle14.getContentStart();
        toStringStyle14.setArrayContentDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "=" + "'", str15, "=");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "=" + "'", str20, "=");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray14 = new long[] { (byte) 100, (byte) 10, (-1), 0, 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.DefaultToStringStyle", longArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 100L, 10L, (-1L), 0L, 10L, 0L });
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "139) test3247(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
// flaky "65) test3247(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle6.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle6.isUseFieldNames();
        toStringStyle6.setUseIdentityHashCode(false);
        java.lang.String str12 = toStringStyle6.getSummaryObjectEndText();
        boolean boolean14 = toStringStyle6.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle6);
        java.lang.String str16 = toStringStyle6.getSizeStartText();
        toStringStyle0.appendIdentityHashCode(stringBuffer5, (java.lang.Object) toStringStyle6);
        java.lang.String str18 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer19 = null;
        char[] charArray25 = new char[] { '#', '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer19, "=", charArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "140) test3248(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "66) test3248(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[" + "'", str18, "[");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '#', '4', 'a', '#' });
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setSizeEndText("");
        java.lang.String str14 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{" + "'", str14, "{");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseShortClassName(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "141) test3250(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str14 = toStringStyle0.getContentEnd();
        toStringStyle0.setArraySeparator("hi!");
        java.lang.StringBuffer stringBuffer17 = null;
        double[] doubleArray20 = new double[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "ToStringStyle.SimpleToStringStyle", doubleArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
// flaky "142) test3251(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "}", (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeEndText("");
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str15 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.NoFieldNameToStringStyle");
        toStringStyle0.setContentStart("\n  ");
        java.lang.String str20 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str15, "ToStringStyle.NoFieldNameToStringStyle");
// flaky "143) test3254(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n  " + "'", str20, "\n  ");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArraySeparator("{");
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.DefaultToStringStyle", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseIdentityHashCode(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        java.lang.String str16 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n  " + "'", str16, "\n  ");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "144) test3258(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer13, "{", obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer15 = null;
        long[] longArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "hi!", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer15 = null;
        char[] charArray17 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, ",", charArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str15 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str16 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendFieldStart(stringBuffer17, "=");
        java.lang.StringBuffer stringBuffer20 = null;
        boolean[] booleanArray27 = new boolean[] { true, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer20, "ToStringStyle.NoFieldNameToStringStyle", booleanArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "145) test3262(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertNotNull(booleanArray27);
        assertBooleanArrayEquals(booleanArray27, new boolean[] { true, true, false, false, true });
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str15 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setArrayEnd("");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "[", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "146) test3263(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) 1.0f);
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer15 = null;
        long[] longArray22 = new long[] { (byte) 100, 100L, (byte) 10, (short) -1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "[", longArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "147) test3264(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 100L, 100L, 10L, (-1L), (-1L) });
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArrayStart("hi!");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer14, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "148) test3265(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectStartText("=");
        boolean boolean14 = toStringStyle0.isUseClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  " + "'", str3, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeStartText("=");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle11.setFieldNameValueSeparator("\n  ");
        toStringStyle11.setFieldNameValueSeparator("{");
        boolean boolean16 = toStringStyle11.isUseClassName();
        java.lang.String str17 = toStringStyle11.getSizeEndText();
        java.lang.String str18 = toStringStyle11.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle11.appendSuper(stringBuffer19, "[");
        toStringStyle0.appendIdentityHashCode(stringBuffer10, (java.lang.Object) toStringStyle11);
        java.lang.StringBuffer stringBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer23, "\n  ", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "149) test3267(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "67) test3267(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "=" + "'", str17, "=");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{" + "'", str18, "{");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSummaryObjectEndText("\n  ");
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseFieldNames(true);
        java.lang.Class<?> wildcardClass13 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle9.setFieldSeparatorAtStart(true);
        java.lang.String str12 = toStringStyle9.getFieldSeparator();
        java.lang.String str13 = toStringStyle9.getFieldSeparator();
        toStringStyle9.setUseClassName(true);
        boolean boolean17 = toStringStyle9.isFullDetail((java.lang.Boolean) false);
        boolean boolean18 = toStringStyle9.isArrayContentDetail();
        boolean boolean19 = toStringStyle9.isFieldSeparatorAtStart();
        toStringStyle9.setSizeEndText("");
        java.lang.String str22 = toStringStyle9.getFieldSeparator();
        java.lang.String str23 = toStringStyle9.getFieldSeparator();
// flaky "150) test3269(org.apache.commons.lang3.builder.RegressionTest6)":         toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) str23);
        java.lang.StringBuffer stringBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        boolean boolean12 = toStringStyle0.isUseClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle17.setFieldSeparatorAtStart(true);
        java.lang.String str20 = toStringStyle17.getFieldSeparator();
        java.lang.String str21 = toStringStyle17.getFieldSeparator();
        toStringStyle17.setUseClassName(true);
        boolean boolean25 = toStringStyle17.isFullDetail((java.lang.Boolean) false);
        boolean boolean26 = toStringStyle17.isArrayContentDetail();
        boolean boolean27 = toStringStyle17.isFieldSeparatorAtStart();
        java.lang.String str28 = toStringStyle17.getNullText();
        boolean boolean29 = toStringStyle17.isFieldSeparatorAtEnd();
        toStringStyle17.setSummaryObjectEndText("{");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, ",", (java.lang.Object) toStringStyle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky "151) test3270(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + ">" + "'", str28, ">");
// flaky "68) test3270(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        java.lang.String str11 = toStringStyle0.getArrayStart();
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setSizeStartText("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "152) test3271(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str1, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "69) test3271(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str6, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        boolean boolean8 = toStringStyle0.isUseClassName();
        toStringStyle0.setFieldSeparator("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "153) test3273(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str1, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "70) test3273(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "23) test3273(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "4) test3273(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, ",");
        toStringStyle0.setSizeEndText("");
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "", floatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "154) test3274(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray18 = new char[] { '4', '4', 'a', ' ', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ",", charArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', '4', 'a', ' ', '4', ' ' });
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        boolean boolean14 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer17 = null;
        float[] floatArray22 = new float[] { 10L, (short) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, ",", floatArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "155) test3277(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "71) test3277(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 10.0f, (-1.0f), 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "hi!");
        java.lang.StringBuffer stringBuffer15 = null;
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "=", byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setDefaultFullDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArraySeparator(">");
        toStringStyle0.setArrayStart(">");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "156) test3280(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray17 = new int[] { 1, 10, (byte) -1, (byte) -1, (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<size=", intArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 10, (-1), (-1), 100, 10 });
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setContentEnd("<size=");
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray24 = new char[] { '4', 'a', '#', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "ToStringStyle.SimpleToStringStyle", charArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', 'a', '#', '#', '#', ' ' });
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.SimpleToStringStyle", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "157) test3283(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str9 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str12 = toStringStyle11.getContentStart();
        boolean boolean13 = toStringStyle11.isUseFieldNames();
        boolean boolean14 = toStringStyle11.isUseShortClassName();
        toStringStyle11.setDefaultFullDetail(true);
        boolean boolean17 = toStringStyle11.isFieldSeparatorAtEnd();
        toStringStyle11.setSummaryObjectStartText("=");
        java.lang.String str20 = toStringStyle11.getFieldNameValueSeparator();
        java.lang.String str21 = toStringStyle11.getArraySeparator();
        boolean boolean22 = toStringStyle11.isArrayContentDetail();
        toStringStyle0.appendIdentityHashCode(stringBuffer10, (java.lang.Object) toStringStyle11);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "158) test3284(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "72) test3284(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str12, "ToStringStyle.NoFieldNameToStringStyle");
// flaky "24) test3284(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "5) test3284(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "3) test3284(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "2) test3284(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str20, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ">" + "'", str21, ">");
// flaky "2) test3284(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setFieldNameValueSeparator("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeEndText("<size=");
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
// flaky "159) test3286(org.apache.commons.lang3.builder.RegressionTest6)":         toStringStyle0.appendFieldStart(stringBuffer8, "<null>");
        toStringStyle0.setFieldSeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = toStringStyle14.getContentStart();
        boolean boolean16 = toStringStyle14.isUseFieldNames();
        boolean boolean17 = toStringStyle14.isUseShortClassName();
        java.lang.String str18 = toStringStyle14.getArrayStart();
        boolean boolean19 = toStringStyle14.isUseFieldNames();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer13, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "73) test3286(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str7, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "25) test3286(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str15, "ToStringStyle.NoFieldNameToStringStyle");
// flaky "6) test3286(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "4) test3286(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ">" + "'", str18, ">");
// flaky "3) test3286(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray15 = new long[] { (short) 1, 0, '4', 1L, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "", longArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "160) test3287(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str3, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 1L, 0L, 52L, 1L, 0L });
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        boolean boolean4 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer5 = null;
        double[] doubleArray8 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "\n  ", doubleArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 35.0d }, 1.0E-15);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeStartText("[");
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) str10);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
// flaky "161) test3289(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str10, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "162) test3290(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str1, "ToStringStyle.NoFieldNameToStringStyle");
// flaky "74) test3290(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle18.setFieldSeparatorAtStart(true);
        java.lang.String str21 = toStringStyle18.getFieldSeparator();
        java.lang.String str22 = toStringStyle18.getFieldSeparator();
        toStringStyle18.setSummaryObjectEndText("[");
        toStringStyle18.setDefaultFullDetail(false);
        boolean boolean27 = toStringStyle18.isFieldSeparatorAtEnd();
        java.lang.Object[] objArray29 = new java.lang.Object[] { toStringStyle18, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "\n  ", objArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
// flaky "163) test3291(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
// flaky "75) test3291(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str21, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str22, "ToStringStyle.MultiLineToStringStyle");
// flaky "26) test3291(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSizeStartText("=");
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray17 = new double[] { 1.0d, ' ', 0.0f, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.NoFieldNameToStringStyle", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 32.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray10 = new short[] { (short) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.NoFieldNameToStringStyle", shortArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 1, (short) 100 });
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle2.setFieldNameValueSeparator("\n  ");
        toStringStyle2.setFieldNameValueSeparator("{");
        boolean boolean7 = toStringStyle2.isUseIdentityHashCode();
        java.lang.String str8 = toStringStyle2.getFieldNameValueSeparator();
        toStringStyle2.setFieldNameValueSeparator("{");
        toStringStyle2.setContentEnd(">");
        java.lang.String str13 = toStringStyle2.getFieldSeparator();
        java.lang.String str14 = toStringStyle2.getSummaryObjectEndText();
        toStringStyle0.appendIdentityHashCode(stringBuffer1, (java.lang.Object) toStringStyle2);
        java.lang.String str16 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer17 = null;
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, ">", doubleArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
// flaky "164) test3294(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str16, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean15 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle21.setFieldSeparatorAtStart(true);
        java.lang.String str24 = toStringStyle21.getContentStart();
        toStringStyle21.setUseClassName(false);
        toStringStyle21.setUseFieldNames(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer19, "\n  ", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(toStringStyle21);
// flaky "165) test3295(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str24, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, ",");
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str14 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle17.setFieldSeparatorAtStart(true);
        java.lang.String str20 = toStringStyle17.getContentStart();
        toStringStyle17.setNullText(",");
        toStringStyle17.setFieldSeparatorAtStart(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "}", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "166) test3296(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str14, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle17);
// flaky "76) test3296(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str20, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeEndText("hi!");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str15 = toStringStyle0.getArraySeparator();
        boolean boolean16 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "167) test3297(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<null>" + "'", str15, "<null>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setContentEnd("");
        toStringStyle0.setUseClassName(false);
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle8.setFieldNameValueSeparator("\n  ");
        toStringStyle8.setFieldNameValueSeparator("{");
        toStringStyle8.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle8.appendIdentityHashCode(stringBuffer15, (java.lang.Object) 1.0f);
        boolean boolean18 = toStringStyle8.isUseIdentityHashCode();
        toStringStyle8.setSizeEndText("hi!");
        toStringStyle8.setDefaultFullDetail(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer6, "ToStringStyle.NoFieldNameToStringStyle", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        boolean boolean12 = toStringStyle0.isUseClassName();
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setContentEnd("ToStringStyle.DefaultToStringStyle");
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
// flaky "168) test3301(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "77) test3301(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str11, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeEndText("}");
        toStringStyle0.setUseFieldNames(true);
        boolean boolean13 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "169) test3302(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str1, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "78) test3302(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "27) test3302(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str6, "ToStringStyle.NoFieldNameToStringStyle");
// flaky "7) test3302(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str7, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        boolean boolean4 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArraySeparator("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeEndText("");
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str15 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray21 = new boolean[] { false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.SimpleToStringStyle", booleanArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { false, false, false });
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "ToStringStyle.NoFieldNameToStringStyle", byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "170) test3305(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, "hi!");
        toStringStyle0.setUseFieldNames(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "171) test3306(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str3, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle6.setFieldSeparatorAtStart(true);
        boolean boolean9 = toStringStyle6.isUseFieldNames();
        toStringStyle6.setUseIdentityHashCode(false);
        java.lang.String str12 = toStringStyle6.getSummaryObjectEndText();
        boolean boolean14 = toStringStyle6.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle6);
        java.lang.String str16 = toStringStyle6.getSizeStartText();
        toStringStyle0.appendIdentityHashCode(stringBuffer5, (java.lang.Object) toStringStyle6);
        java.lang.String str18 = toStringStyle0.getArrayEnd();
        boolean boolean19 = toStringStyle0.isUseClassName();
        java.lang.String str20 = toStringStyle0.getContentStart();
        boolean boolean22 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n  " + "'", str18, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "172) test3307(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str20, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle9.setFieldSeparatorAtStart(true);
        boolean boolean12 = toStringStyle9.isUseFieldNames();
        toStringStyle9.setUseIdentityHashCode(false);
        java.lang.String str15 = toStringStyle9.getSummaryObjectEndText();
        boolean boolean17 = toStringStyle9.isFullDetail((java.lang.Boolean) false);
        toStringStyle9.setUseFieldNames(false);
        toStringStyle9.setDefaultFullDetail(false);
        boolean boolean22 = toStringStyle9.isUseIdentityHashCode();
        toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) boolean22);
        java.lang.String str24 = toStringStyle0.getContentStart();
        java.lang.String str25 = toStringStyle0.getNullText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "173) test3308(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str6, "ToStringStyle.NoFieldNameToStringStyle");
// flaky "79) test3308(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str7, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "28) test3308(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str24, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "," + "'", str25, ",");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str7 = toStringStyle6.getContentStart();
        boolean boolean8 = toStringStyle6.isUseFieldNames();
        boolean boolean9 = toStringStyle6.isUseShortClassName();
        toStringStyle6.setFieldSeparator("hi!");
        toStringStyle6.setNullText("");
        toStringStyle6.setContentEnd("");
        java.lang.String str16 = toStringStyle6.getArrayEnd();
        toStringStyle6.setDefaultFullDetail(true);
        toStringStyle6.setArrayStart("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "", (java.lang.Object) toStringStyle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "174) test3309(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str1, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle6);
// flaky "80) test3309(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str7, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "29) test3309(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray19 = new boolean[] { true, true, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "=", booleanArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "175) test3310(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str1, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "81) test3310(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, true, false, false, true });
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.MultiLineToStringStyle", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer17 = null;
        float[] floatArray19 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "ToStringStyle.NoFieldNameToStringStyle", floatArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "176) test3312(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "82) test3312(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "30) test3312(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str9, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "{");
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray18 = new boolean[] { true, false, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", booleanArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "177) test3313(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray18);
        assertBooleanArrayEquals(booleanArray18, new boolean[] { true, false, false, true, false });
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str10 = toStringStyle9.getContentStart();
        boolean boolean11 = toStringStyle9.isUseFieldNames();
        boolean boolean12 = toStringStyle9.isFieldSeparatorAtEnd();
        boolean boolean13 = toStringStyle9.isUseIdentityHashCode();
        toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) boolean13);
        toStringStyle0.setFieldNameValueSeparator("=");
        java.lang.StringBuffer stringBuffer17 = null;
        boolean[] booleanArray22 = new boolean[] { false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "", booleanArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle9);
// flaky "178) test3314(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "83) test3314(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray22);
        assertBooleanArrayEquals(booleanArray22, new boolean[] { false, false, false });
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getContentEnd();
        java.lang.String str10 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "179) test3315(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) str9);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str14 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n  " + "'", str14, "\n  ");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle10.setFieldSeparatorAtStart(true);
        java.lang.String str13 = toStringStyle10.getFieldSeparator();
        java.lang.String str14 = toStringStyle10.getFieldSeparator();
        toStringStyle10.setSummaryObjectEndText("[");
        java.lang.String str17 = toStringStyle10.getSizeEndText();
        toStringStyle10.setUseShortClassName(false);
        toStringStyle10.setSizeStartText("\n  ");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle10);
        toStringStyle10.setArrayContentDetail(false);
        toStringStyle10.setFieldSeparator("}");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle27.setFieldSeparatorAtStart(true);
        boolean boolean30 = toStringStyle27.isUseFieldNames();
        toStringStyle27.setUseIdentityHashCode(false);
        java.lang.String str33 = toStringStyle27.getSizeStartText();
        boolean boolean35 = toStringStyle27.isFullDetail((java.lang.Boolean) true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle36 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str37 = toStringStyle36.getContentStart();
        boolean boolean38 = toStringStyle36.isUseFieldNames();
        boolean boolean39 = toStringStyle36.isUseShortClassName();
        toStringStyle36.setFieldSeparator("hi!");
        java.lang.String str42 = toStringStyle36.getContentStart();
        boolean boolean43 = toStringStyle36.isArrayContentDetail();
        toStringStyle36.setSummaryObjectEndText("[");
        java.lang.String str46 = toStringStyle36.getFieldSeparator();
        java.lang.String str47 = toStringStyle36.getArrayStart();
        toStringStyle36.setUseFieldNames(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle50 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle50.setFieldSeparatorAtStart(true);
        boolean boolean53 = toStringStyle50.isUseFieldNames();
        java.lang.String str54 = toStringStyle50.getArrayStart();
        boolean boolean55 = toStringStyle50.isFieldSeparatorAtEnd();
        boolean boolean56 = toStringStyle50.isFieldSeparatorAtStart();
        toStringStyle50.setFieldSeparator("");
        java.lang.Object[] objArray59 = new java.lang.Object[] { toStringStyle10, true, false, "" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "{", objArray59, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle27);
// flaky "180) test3318(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n  " + "'", str33, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(toStringStyle36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\n  " + "'", str37, "\n  ");
// flaky "84) test3318(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n  " + "'", str42, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(toStringStyle50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
// flaky "31) test3318(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.Object obj10 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, obj10);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle13.setFieldNameValueSeparator("\n  ");
        toStringStyle13.setFieldNameValueSeparator("{");
        boolean boolean18 = toStringStyle13.isUseIdentityHashCode();
        java.lang.String str19 = toStringStyle13.getSummaryObjectEndText();
        java.lang.String str20 = toStringStyle13.getSummaryObjectStartText();
        toStringStyle13.setSizeEndText("hi!");
        toStringStyle13.setUseIdentityHashCode(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer12, (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "181) test3319(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + ">" + "'", str19, ">");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str20, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setContentStart("");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean[] booleanArray8 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "=", booleanArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        assertBooleanArrayEquals(booleanArray8, new boolean[] { true });
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setArrayEnd("<size=");
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer17 = null;
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, ",", byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "182) test3321(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "183) test3322(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean16 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "184) test3323(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, "{");
        java.lang.String str14 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean15 = toStringStyle0.isDefaultFullDetail();
        boolean boolean16 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "185) test3324(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{" + "'", str14, "{");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendFieldStart(stringBuffer12, ">");
        toStringStyle0.setArrayStart("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setArraySeparator("");
        java.lang.String str19 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str19, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArrayContentDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "186) test3326(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setFieldNameValueSeparator("<null>");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "}");
        toStringStyle0.setContentEnd("<size=");
        java.lang.StringBuffer stringBuffer21 = null;
        char[] charArray25 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer21, "<size=", charArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "187) test3327(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a', ' ' });
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setFieldSeparator("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparator("\n  ");
        toStringStyle0.setFieldSeparator("<null>");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "\n  ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.MultiLineToStringStyle", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "188) test3330(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "189) test3331(org.apache.commons.lang3.builder.RegressionTest6)":         toStringStyle0.appendSuper(stringBuffer6, "hi!");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean10 = toStringStyle0.isArrayContentDetail();
        java.lang.String str11 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray15 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "{", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "85) test3331(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n  " + "'", str11, "\n  ");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.SimpleToStringStyle", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "190) test3332(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<null>" + "'", str11, "<null>");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray15 = new short[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, ",", shortArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 0 });
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentStart("<null>");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "<null>", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setSummaryObjectStartText("\n  ");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle11.setFieldSeparatorAtStart(true);
        java.lang.String str14 = toStringStyle11.getFieldSeparator();
        java.lang.String str15 = toStringStyle11.getFieldSeparator();
        toStringStyle11.setSummaryObjectEndText("[");
        java.lang.String str18 = toStringStyle11.getSizeEndText();
        toStringStyle11.setUseShortClassName(false);
        toStringStyle0.appendClassName(stringBuffer10, (java.lang.Object) toStringStyle11);
        java.lang.String str22 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "191) test3335(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
// flaky "86) test3335(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
// flaky "32) test3335(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "<null>");
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
// flaky "192) test3337(org.apache.commons.lang3.builder.RegressionTest6)":         toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer8, "ToStringStyle.SimpleToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "87) test3337(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "33) test3337(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str13 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        boolean boolean16 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean17 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "193) test3338(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
// flaky "88) test3338(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str14, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setNullText("}");
        java.lang.String str12 = toStringStyle0.getNullText();
        boolean boolean13 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer14 = null;
        int[] intArray20 = new int[] { (byte) 100, (byte) 100, (short) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "<size=", intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 100, 100, 10, (-1) });
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "\n  ", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str10 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = toStringStyle13.getContentStart();
        boolean boolean15 = toStringStyle13.isUseFieldNames();
        boolean boolean16 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setDefaultFullDetail(true);
        boolean boolean19 = toStringStyle13.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer20 = null;
        toStringStyle13.appendSuper(stringBuffer20, ",");
        toStringStyle13.setArraySeparator("\n  ");
        toStringStyle13.setUseClassName(true);
        boolean boolean27 = toStringStyle13.isDefaultFullDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer11, "", (java.lang.Object) boolean27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n  " + "'", str14, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "194) test3341(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean8 = toStringStyle0.isUseClassName();
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setSummaryObjectEndText("{");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray13 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, ",", doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, ",");
        toStringStyle0.setSizeEndText("");
        toStringStyle0.setUseClassName(false);
        java.lang.String str17 = toStringStyle0.getArrayEnd();
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer20 = null;
        double[] doubleArray23 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, "hi!", doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "195) test3344(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 97.0d }, 1.0E-15);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "hi!");
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setArrayStart("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "196) test3345(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "197) test3346(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setContentEnd("\n  ");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "}", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "198) test3347(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendFieldStart(stringBuffer8, "[");
        java.lang.String str11 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "199) test3348(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "89) test3348(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<size=" + "'", str11, "<size=");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray16 = new double[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ">", doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "200) test3349(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean12 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendFieldStart(stringBuffer13, "=");
        boolean boolean16 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("}");
        boolean boolean19 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "201) test3350(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "90) test3350(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle13.setFieldSeparatorAtStart(true);
        java.lang.String str16 = toStringStyle13.getFieldSeparator();
        toStringStyle13.setFieldNameValueSeparator(",");
        toStringStyle0.appendIdentityHashCode(stringBuffer12, (java.lang.Object) toStringStyle13);
        java.lang.String str20 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n  " + "'", str20, "\n  ");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        toStringStyle0.setNullText("");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "202) test3352(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "91) test3352(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ">", byteArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray20 = new long[] { 1L, 1, (short) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "ToStringStyle.DefaultToStringStyle", longArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "203) test3354(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L, 1L, (-1L), 100L, (-1L) });
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle17.setFieldSeparatorAtStart(true);
        boolean boolean20 = toStringStyle17.isUseFieldNames();
        toStringStyle17.setUseIdentityHashCode(false);
        java.lang.String str23 = toStringStyle17.getSummaryObjectEndText();
        boolean boolean25 = toStringStyle17.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle17);
        toStringStyle17.setSizeStartText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer16, (java.lang.Object) toStringStyle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "204) test3355(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{" + "'", str23, "{");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str11 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectStartText("{");
        toStringStyle0.setUseClassName(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "205) test3356(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "92) test3356(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        toStringStyle0.setSummaryObjectEndText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "206) test3358(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparator("\n  ");
        toStringStyle0.setFieldSeparator("<null>");
        java.lang.StringBuffer stringBuffer15 = null;
        char[] charArray18 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.MultiLineToStringStyle", charArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#' });
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.Object obj10 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, obj10);
        boolean boolean12 = toStringStyle0.isUseClassName();
        boolean boolean13 = toStringStyle0.isUseClassName();
        toStringStyle0.setContentStart("<size=");
        java.lang.String str16 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendToString(stringBuffer17, "<size=");
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "\n  ", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "207) test3360(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<size=" + "'", str16, "<size=");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeStartText("<size=");
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray17 = new boolean[] { false, false, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<size=", booleanArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "208) test3361(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { false, false, true, false, false, true });
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer12, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "209) test3362(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = toStringStyle0.isUseClassName();
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "\n  ", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("}");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "<null>", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean7 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "210) test3365(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setArraySeparator("");
        boolean boolean13 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
// flaky "211) test3368(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle10.setFieldSeparatorAtStart(true);
        java.lang.String str13 = toStringStyle10.getFieldSeparator();
        java.lang.String str14 = toStringStyle10.getFieldSeparator();
        toStringStyle10.setUseClassName(true);
        boolean boolean18 = toStringStyle10.isFullDetail((java.lang.Boolean) false);
        boolean boolean19 = toStringStyle10.isArrayContentDetail();
        boolean boolean20 = toStringStyle10.isFieldSeparatorAtStart();
        toStringStyle10.setSizeEndText("");
        java.lang.Class<?> wildcardClass23 = toStringStyle10.getClass();
        toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) wildcardClass23);
        java.lang.StringBuffer stringBuffer25 = null;
        short[] shortArray31 = new short[] { (short) -1, (short) 1, (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "<size=", shortArray31, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] { (short) -1, (short) 1, (short) -1, (short) 10 });
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray19 = new double[] { (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "ToStringStyle.SimpleToStringStyle", doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.Object obj10 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, obj10);
        boolean boolean12 = toStringStyle0.isUseClassName();
        boolean boolean13 = toStringStyle0.isUseClassName();
        toStringStyle0.setContentStart("<size=");
        java.lang.String str16 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle19.setFieldNameValueSeparator("\n  ");
        toStringStyle19.setFieldNameValueSeparator("{");
        boolean boolean24 = toStringStyle19.isUseIdentityHashCode();
        java.lang.String str25 = toStringStyle19.getSummaryObjectEndText();
        java.lang.String str26 = toStringStyle19.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle19.appendToString(stringBuffer27, "{");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle30 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle30.setFieldNameValueSeparator("\n  ");
        toStringStyle30.setFieldNameValueSeparator("{");
        boolean boolean35 = toStringStyle30.isUseIdentityHashCode();
        java.lang.String str36 = toStringStyle30.getFieldNameValueSeparator();
        toStringStyle30.setFieldNameValueSeparator("{");
        toStringStyle30.setContentEnd(">");
        java.lang.String str41 = toStringStyle30.getArrayStart();
        java.lang.String str42 = toStringStyle30.getSizeStartText();
        boolean boolean43 = toStringStyle30.isFieldSeparatorAtStart();
        toStringStyle30.setArrayContentDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle46 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle46.setFieldNameValueSeparator("\n  ");
        toStringStyle46.setFieldNameValueSeparator("{");
        boolean boolean51 = toStringStyle46.isUseIdentityHashCode();
        java.lang.String str52 = toStringStyle46.getSummaryObjectEndText();
        java.lang.String str53 = toStringStyle46.getSummaryObjectStartText();
        toStringStyle46.setFieldSeparatorAtStart(false);
        toStringStyle46.setUseFieldNames(false);
        boolean boolean58 = toStringStyle46.isFieldSeparatorAtStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle59 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str60 = toStringStyle59.getContentStart();
        boolean boolean61 = toStringStyle59.isUseFieldNames();
        java.lang.String str62 = toStringStyle59.getArrayStart();
        java.lang.String str63 = toStringStyle59.getFieldNameValueSeparator();
        java.lang.String str64 = toStringStyle59.getFieldSeparator();
        toStringStyle59.setSummaryObjectStartText(">");
        java.lang.String str67 = toStringStyle59.getArrayStart();
        toStringStyle59.setArrayStart("ToStringStyle.DefaultToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle70 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle70.setFieldNameValueSeparator("\n  ");
        toStringStyle70.setFieldNameValueSeparator("{");
        boolean boolean75 = toStringStyle70.isUseIdentityHashCode();
        toStringStyle70.setSummaryObjectStartText(">");
        toStringStyle70.setSizeEndText("=");
        toStringStyle70.setFieldSeparator("[");
        toStringStyle70.setSummaryObjectStartText(",");
        java.lang.String str84 = toStringStyle70.getSummaryObjectStartText();
        toStringStyle70.setFieldSeparatorAtStart(true);
        java.lang.String str87 = toStringStyle70.getContentEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle88 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str89 = toStringStyle88.getContentStart();
        boolean boolean90 = toStringStyle88.isUseFieldNames();
        boolean boolean91 = toStringStyle88.isUseShortClassName();
        toStringStyle88.setSizeStartText("");
        java.lang.Object[] objArray94 = new java.lang.Object[] { "{", false, toStringStyle46, toStringStyle59, str87, toStringStyle88 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "", objArray94, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "212) test3371(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + ">" + "'", str25, ">");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "," + "'", str26, ",");
        org.junit.Assert.assertNotNull(toStringStyle30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{" + "'", str36, "{");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str41, "ToStringStyle.MultiLineToStringStyle");
// flaky "93) test3371(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(toStringStyle46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky "34) test3371(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str52 + "' != '" + ">" + "'", str52, ">");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "," + "'", str53, ",");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(toStringStyle59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<size=" + "'", str60, "<size=");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "[" + "'", str63, "[");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(toStringStyle70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "," + "'", str84, ",");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + ">" + "'", str87, ">");
        org.junit.Assert.assertNotNull(toStringStyle88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "<size=" + "'", str89, "<size=");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(objArray94);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer2 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer2, (java.lang.Object) (byte) 100);
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, "{");
        java.lang.String str14 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ToStringStyle.SimpleToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "213) test3375(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<null>", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "214) test3376(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSizeEndText("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str3 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray12 = new char[] { '#', ' ', ' ', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "ToStringStyle.NoFieldNameToStringStyle", charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "215) test3378(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', ' ', '#', '#', ' ' });
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str13 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str14 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray20 = new boolean[] { true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.DefaultToStringStyle", booleanArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<size=" + "'", str14, "<size=");
        org.junit.Assert.assertNotNull(booleanArray20);
        assertBooleanArrayEquals(booleanArray20, new boolean[] { true, true, false });
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        boolean boolean8 = toStringStyle0.isUseClassName();
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean10 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setContentEnd("{");
        java.lang.String str11 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseIdentityHashCode(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray21 = new float[] { (short) -1, 10, 'a', (-1L), 0.0f, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "hi!", floatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { (-1.0f), 10.0f, 97.0f, (-1.0f), 0.0f, 97.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setDefaultFullDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "216) test3383(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        toStringStyle0.setNullText(">");
        java.lang.String str12 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "217) test3384(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str12, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray14 = new short[] { (byte) 100, (short) 100, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ",", shortArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100, (short) 100, (short) 1, (short) -1 });
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparator("ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle9.setFieldSeparatorAtStart(true);
        boolean boolean12 = toStringStyle9.isUseFieldNames();
        toStringStyle9.setUseIdentityHashCode(false);
        java.lang.String str15 = toStringStyle9.getSummaryObjectEndText();
        boolean boolean17 = toStringStyle9.isFullDetail((java.lang.Boolean) false);
        toStringStyle9.setUseFieldNames(false);
        toStringStyle9.setDefaultFullDetail(false);
        boolean boolean22 = toStringStyle9.isUseIdentityHashCode();
        toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) boolean22);
        java.lang.String str24 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer25 = null;
        long[] longArray32 = new long[] { 100L, (short) 1, (byte) 10, 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, ">", longArray32, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str15, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[" + "'", str24, "[");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 100L, 1L, 10L, 10L, 52L });
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.SimpleToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd("=");
        java.lang.String str9 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "218) test3389(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentStart("<null>");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer3, "=");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 5, end 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "hi!", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "219) test3391(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setArraySeparator("\n  ");
        toStringStyle0.setContentEnd("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSummaryObjectEndText(">");
        toStringStyle0.setFieldSeparator("{");
        java.lang.Class<?> wildcardClass10 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, ",");
        toStringStyle0.setSizeEndText("");
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray20 = new boolean[] { true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, ",", booleanArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        assertBooleanArrayEquals(booleanArray20, new boolean[] { true, true, false });
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getContentStart();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str13 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ">", objArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<size=" + "'", str13, "<size=");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray13 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<size=", booleanArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] {});
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean5 = toStringStyle0.isUseShortClassName();
        java.lang.String str6 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "220) test3397(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setNullText("}");
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray17 = new double[] { 10, (byte) -1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "}", doubleArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setContentEnd("}");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, ">", (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        boolean boolean15 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "221) test3400(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer5 = null;
        short[] shortArray10 = new short[] { (byte) 100, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "[", shortArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100, (short) 10, (short) 1 });
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.SimpleToStringStyle");
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
// flaky "222) test3402(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "223) test3403(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str5, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setContentEnd("{");
        toStringStyle0.setDefaultFullDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayContentDetail(true);
        boolean boolean17 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "224) test3405(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("{");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = toStringStyle13.getContentStart();
        boolean boolean15 = toStringStyle13.isUseFieldNames();
        boolean boolean16 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setDefaultFullDetail(true);
        boolean boolean19 = toStringStyle13.isFieldSeparatorAtEnd();
        java.lang.String str20 = toStringStyle13.getArraySeparator();
        toStringStyle13.setUseFieldNames(false);
        java.lang.String str23 = toStringStyle13.getFieldSeparator();
        boolean boolean24 = toStringStyle13.isFieldSeparatorAtStart();
        boolean boolean25 = toStringStyle13.isDefaultFullDetail();
        boolean boolean26 = toStringStyle13.isFieldSeparatorAtStart();
        toStringStyle13.setSizeEndText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "hi!", (java.lang.Object) "hi!", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str20, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setContentEnd("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray16 = new float[] { 0L, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "hi!", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "225) test3407(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 0.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str14 = toStringStyle0.getContentEnd();
        toStringStyle0.setArraySeparator("hi!");
        boolean boolean18 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer19 = null;
        boolean[] booleanArray23 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ToStringStyle.MultiLineToStringStyle", booleanArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
// flaky "226) test3408(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(booleanArray23);
        assertBooleanArrayEquals(booleanArray23, new boolean[] { true, true });
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "hi!", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setFieldNameValueSeparator("<null>");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "}");
        toStringStyle0.setContentEnd("<size=");
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer21, "ToStringStyle.DefaultToStringStyle", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        java.lang.String str14 = toStringStyle0.getContentStart();
        boolean boolean15 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArraySeparator("}");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentEnd("{");
        java.lang.StringBuffer stringBuffer14 = null;
        short[] shortArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.MultiLineToStringStyle", shortArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentEnd("{");
        toStringStyle0.setUseShortClassName(false);
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer17 = null;
        short[] shortArray23 = new short[] { (byte) 1, (short) -1, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "[", shortArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 1, (short) -1, (short) 10, (short) 1 });
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "[", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "hi!", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer15, ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle10.setFieldSeparatorAtStart(true);
        java.lang.String str13 = toStringStyle10.getFieldSeparator();
        java.lang.String str14 = toStringStyle10.getFieldSeparator();
        toStringStyle10.setUseClassName(true);
        boolean boolean18 = toStringStyle10.isFullDetail((java.lang.Boolean) false);
        boolean boolean19 = toStringStyle10.isArrayContentDetail();
        boolean boolean20 = toStringStyle10.isFieldSeparatorAtStart();
        toStringStyle10.setSizeEndText("");
        java.lang.Class<?> wildcardClass23 = toStringStyle10.getClass();
        toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) wildcardClass23);
        java.lang.StringBuffer stringBuffer25 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle27.setFieldSeparatorAtStart(true);
        boolean boolean30 = toStringStyle27.isUseFieldNames();
        toStringStyle27.setUseIdentityHashCode(false);
        java.lang.String str33 = toStringStyle27.getSummaryObjectEndText();
        boolean boolean35 = toStringStyle27.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle27);
        java.lang.String str37 = toStringStyle27.getSizeStartText();
        java.lang.String str38 = toStringStyle27.getArrayStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "=", (java.lang.Object) str38, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[" + "'", str33, "[");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "=" + "'", str37, "=");
// flaky "227) test3417(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str14 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseClassName(true);
        boolean boolean17 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "=", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setContentStart(">");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray12 = new boolean[] { true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, ">", booleanArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] { true, true, false });
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray17 = new long[] { (short) 0, (byte) 1, 10L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L, 1L, 10L, 1L });
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str13 = toStringStyle12.getContentStart();
        toStringStyle12.setArrayEnd("\n  ");
        boolean boolean16 = toStringStyle12.isUseShortClassName();
        java.lang.String str17 = toStringStyle12.getSummaryObjectStartText();
        toStringStyle12.setArraySeparator("\n  ");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer11, (java.lang.Object) "\n  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[" + "'", str17, "[");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayEnd("=");
        toStringStyle0.setUseClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle13.setFieldNameValueSeparator("\n  ");
        toStringStyle13.setFieldNameValueSeparator("{");
        boolean boolean18 = toStringStyle13.isUseIdentityHashCode();
        java.lang.String str19 = toStringStyle13.getFieldNameValueSeparator();
        toStringStyle13.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle13.appendIdentityHashCode(stringBuffer22, (java.lang.Object) 1.0f);
        toStringStyle0.appendIdentityHashCode(stringBuffer12, (java.lang.Object) 1.0f);
        toStringStyle0.setSummaryObjectStartText("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        java.lang.String str16 = toStringStyle0.getContentEnd();
        java.lang.String str17 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer20 = null;
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "ToStringStyle.SimpleToStringStyle", byteArray26, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "228) test3425(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.String str9 = toStringStyle0.getNullText();
        toStringStyle0.setUseFieldNames(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "229) test3426(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd("=");
        toStringStyle0.setSizeEndText("");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "[", (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArraySeparator(">");
        toStringStyle0.setUseClassName(false);
        java.lang.String str13 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray16 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "", floatArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "230) test3428(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=" + "'", str13, "=");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "=");
        java.lang.String str10 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
// flaky "231) test3429(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.Object obj10 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, obj10);
        boolean boolean12 = toStringStyle0.isUseClassName();
        boolean boolean13 = toStringStyle0.isUseClassName();
        boolean boolean14 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "232) test3430(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "94) test3430(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "35) test3430(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean2 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer5, "{");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 5, end 1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setSummaryObjectEndText("<null>");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "\n  ", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str12 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "233) test3434(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "95) test3434(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "36) test3434(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str9, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        boolean boolean16 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str17 = toStringStyle0.getArrayEnd();
        java.lang.String str18 = toStringStyle0.getSizeStartText();
        boolean boolean20 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        toStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.String str15 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd(">");
        java.lang.StringBuffer stringBuffer18 = null;
        float[] floatArray22 = new float[] { 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "", floatArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "234) test3436(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 100.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getArrayStart();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "<size=", byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "235) test3437(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str9, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setArraySeparator("");
        java.lang.String str15 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparator("}");
        java.lang.StringBuffer stringBuffer18 = null;
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "[", objArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{" + "'", str15, "{");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setArraySeparator("");
        java.lang.String str15 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSummaryObjectStartText("\n  ");
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle19.setFieldNameValueSeparator("\n  ");
        boolean boolean22 = toStringStyle19.isArrayContentDetail();
        java.lang.String str23 = toStringStyle19.getFieldSeparator();
        boolean boolean24 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle19);
        java.lang.StringBuffer stringBuffer25 = null;
        toStringStyle19.appendSuper(stringBuffer25, "ToStringStyle.NoFieldNameToStringStyle");
        toStringStyle0.appendStart(stringBuffer18, (java.lang.Object) stringBuffer25);
        java.lang.StringBuffer stringBuffer29 = null;
        float[] floatArray37 = new float[] { 100L, ' ', 10, ' ', (byte) 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer29, "{", floatArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{" + "'", str15, "{");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[" + "'", str23, "[");
// flaky "236) test3439(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 100.0f, 32.0f, 10.0f, 32.0f, 10.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendSuper(stringBuffer8, ">");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        java.lang.String str13 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray19 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, ">", booleanArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { false });
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isUseClassName();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray15 = new double[] { 10.0d, 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "\n  ", doubleArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "237) test3441(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.String str12 = toStringStyle0.getSizeEndText();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
// flaky "238) test3442(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArraySeparator("{");
        java.lang.String str12 = toStringStyle0.getNullText();
        java.lang.String str13 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "}", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str9, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str13, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str15 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str16 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle19.setFieldNameValueSeparator("\n  ");
        boolean boolean22 = toStringStyle19.isArrayContentDetail();
        java.lang.String str23 = toStringStyle19.getFieldSeparator();
        boolean boolean24 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle19);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle25.setFieldNameValueSeparator("\n  ");
        toStringStyle25.setFieldNameValueSeparator("{");
        boolean boolean30 = toStringStyle25.isUseIdentityHashCode();
        toStringStyle25.setSummaryObjectStartText(">");
        toStringStyle25.setSizeEndText("=");
        toStringStyle25.setFieldSeparator("[");
        toStringStyle25.setFieldSeparator(">");
        toStringStyle25.setContentEnd("<size=");
        boolean boolean41 = toStringStyle25.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle42 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle42.setFieldNameValueSeparator("\n  ");
        boolean boolean45 = toStringStyle42.isArrayContentDetail();
        java.lang.String str46 = toStringStyle42.getFieldSeparator();
        boolean boolean47 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle42);
        java.lang.String str48 = toStringStyle42.getSummaryObjectStartText();
        toStringStyle42.setArrayEnd("=");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle51.setFieldSeparatorAtStart(true);
        boolean boolean54 = toStringStyle51.isUseFieldNames();
        java.lang.String str55 = toStringStyle51.getArraySeparator();
        toStringStyle51.setContentEnd("[");
        toStringStyle51.setNullText(">");
        toStringStyle51.setSummaryObjectStartText("[");
        java.lang.String str62 = toStringStyle51.getFieldSeparator();
        toStringStyle51.setDefaultFullDetail(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle65 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle65.setFieldNameValueSeparator("\n  ");
        toStringStyle65.setFieldNameValueSeparator("{");
        boolean boolean70 = toStringStyle65.isUseClassName();
        java.lang.String str71 = toStringStyle65.getSizeEndText();
        java.lang.String str72 = toStringStyle65.getFieldNameValueSeparator();
        java.lang.Object[] objArray73 = new java.lang.Object[] { toStringStyle19, toStringStyle25, toStringStyle42, true, str72 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "ToStringStyle.SimpleToStringStyle", objArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
// flaky "239) test3444(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str15, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str16, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[" + "'", str23, "[");
// flaky "96) test3444(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(toStringStyle42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ">" + "'", str46, ">");
// flaky "37) test3444(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ">" + "'", str48, ">");
        org.junit.Assert.assertNotNull(toStringStyle51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "{" + "'", str55, "{");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "=" + "'", str71, "=");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "{" + "'", str72, "{");
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseClassName(false);
        java.lang.String str9 = toStringStyle0.getArrayStart();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray19 = new float[] { 1L, 10, 100L, 0L, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<size=", floatArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
// flaky "240) test3445(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str9, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 10.0f, 100.0f, 0.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.String str9 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("\n  ");
        toStringStyle10.setFieldNameValueSeparator("{");
        boolean boolean15 = toStringStyle10.isUseIdentityHashCode();
        java.lang.String str16 = toStringStyle10.getFieldNameValueSeparator();
        toStringStyle10.setFieldNameValueSeparator("{");
        toStringStyle10.setContentEnd(">");
        toStringStyle10.setFieldSeparator("[");
        toStringStyle10.setUseClassName(true);
        java.lang.String str25 = toStringStyle10.getSummaryObjectStartText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle26 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle26.setFieldSeparatorAtStart(true);
        boolean boolean29 = toStringStyle26.isUseFieldNames();
        boolean boolean30 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle26);
        java.lang.String str31 = toStringStyle26.getSummaryObjectStartText();
        toStringStyle26.setArraySeparator("<null>");
        java.lang.Object[] objArray34 = new java.lang.Object[] { toStringStyle10, toStringStyle26 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "[", objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "241) test3447(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str7, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ">" + "'", str25, ">");
        org.junit.Assert.assertNotNull(toStringStyle26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[" + "'", str31, "[");
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str13 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str17 = toStringStyle16.getContentStart();
        boolean boolean18 = toStringStyle16.isUseFieldNames();
        java.lang.String str19 = toStringStyle16.getArrayStart();
        toStringStyle16.setUseFieldNames(false);
        toStringStyle16.setArraySeparator("hi!");
        boolean boolean24 = toStringStyle16.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle25.setFieldSeparatorAtStart(true);
        boolean boolean28 = toStringStyle25.isUseFieldNames();
        java.lang.String str29 = toStringStyle25.getArrayStart();
        boolean boolean30 = toStringStyle25.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer31 = null;
        toStringStyle25.appendFieldStart(stringBuffer31, "{");
        java.lang.Object[] objArray34 = new java.lang.Object[] { toStringStyle16, toStringStyle25 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "", objArray34, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "242) test3448(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str13, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[" + "'", str17, "[");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setFieldNameValueSeparator("<null>");
        toStringStyle0.setSizeStartText("\n  ");
        boolean boolean18 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        toStringStyle0.setContentEnd("hi!");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "=", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "243) test3450(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n  " + "'", str8, "\n  ");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.String str12 = toStringStyle0.getSizeEndText();
        java.lang.String str13 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.Object obj15 = null;
        toStringStyle0.appendStart(stringBuffer14, obj15);
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "<size=", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "244) test3452(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        java.lang.String str10 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray14 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "hi!", charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str10, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4' });
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setFieldNameValueSeparator("<null>");
        toStringStyle0.setSizeStartText("\n  ");
        toStringStyle0.setFieldSeparator("ToStringStyle.DefaultToStringStyle");
        toStringStyle0.setFieldNameValueSeparator("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparator("\n  ");
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, ",", objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10]");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.String str4 = toStringStyle0.getSummaryObjectStartText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean8 = toStringStyle7.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str11 = toStringStyle10.getContentStart();
        toStringStyle10.setArrayEnd("\n  ");
        boolean boolean14 = toStringStyle10.isUseIdentityHashCode();
        boolean boolean16 = toStringStyle10.isFullDetail((java.lang.Boolean) true);
        toStringStyle7.appendClassName(stringBuffer9, (java.lang.Object) boolean16);
        boolean boolean18 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle7);
        toStringStyle0.appendIdentityHashCode(stringBuffer6, (java.lang.Object) boolean18);
        boolean boolean20 = toStringStyle0.isUseShortClassName();
        boolean boolean21 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "[", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSizeStartText("ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray16 = new long[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "hi!", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 100L });
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setContentStart("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean14 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean16 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer17 = null;
        char[] charArray21 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "[", charArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '#' });
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getContentEnd();
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray13 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "ToStringStyle.MultiLineToStringStyle", byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "245) test3460(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
// flaky "97) test3460(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, ",", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "246) test3461(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getContentStart();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean14 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean15 = toStringStyle0.isUseShortClassName();
        boolean boolean16 = toStringStyle0.isUseFieldNames();
        boolean boolean17 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendFieldStart(stringBuffer11, "ToStringStyle.DefaultToStringStyle");
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "247) test3463(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n  " + "'", str14, "\n  ");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        boolean boolean9 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "248) test3464(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "98) test3464(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str4, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky "38) test3464(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setNullText("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean15 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "ToStringStyle.NoFieldNameToStringStyle");
        toStringStyle0.setDefaultFullDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "<size=");
        toStringStyle0.setSummaryObjectStartText("=");
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendClassName(stringBuffer13, obj14);
        java.lang.String str16 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str16, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "{", byteArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 0, (byte) 1 });
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getContentStart();
        java.lang.String str10 = toStringStyle0.getNullText();
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSummaryObjectEndText(">");
        toStringStyle0.setFieldSeparator("{");
        toStringStyle0.setArrayContentDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean12 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendFieldStart(stringBuffer13, "=");
        boolean boolean16 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setContentEnd("}");
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle21.setFieldSeparatorAtStart(true);
        boolean boolean24 = toStringStyle21.isUseFieldNames();
        toStringStyle21.setUseIdentityHashCode(false);
        java.lang.String str27 = toStringStyle21.getSummaryObjectEndText();
        java.lang.String str28 = toStringStyle21.getArraySeparator();
        toStringStyle21.setArrayStart("hi!");
        java.lang.String str31 = toStringStyle21.getArrayEnd();
        java.lang.String str32 = toStringStyle21.getSummaryObjectEndText();
        boolean boolean33 = toStringStyle21.isArrayContentDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer19, "}", (java.lang.Object) toStringStyle21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "249) test3472(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n  " + "'", str27, "\n  ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n  " + "'", str31, "\n  ");
// flaky "99) test3472(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n  " + "'", str32, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("\n  ");
        toStringStyle14.setFieldNameValueSeparator("{");
        boolean boolean19 = toStringStyle14.isUseIdentityHashCode();
        toStringStyle14.setSummaryObjectStartText(">");
        toStringStyle14.setSizeEndText("=");
        toStringStyle14.setFieldSeparator("[");
        toStringStyle14.setFieldSeparator(">");
        toStringStyle14.setContentEnd("<size=");
        boolean boolean30 = toStringStyle14.isUseFieldNames();
        toStringStyle14.setUseIdentityHashCode(false);
        toStringStyle14.setUseFieldNames(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle35 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle35.setFieldNameValueSeparator("\n  ");
        toStringStyle35.setFieldNameValueSeparator("{");
        boolean boolean40 = toStringStyle35.isUseClassName();
        java.lang.String str41 = toStringStyle35.getSizeEndText();
        java.lang.String str42 = toStringStyle35.getArraySeparator();
        java.lang.Object[] objArray43 = new java.lang.Object[] { toStringStyle14, toStringStyle35 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "{", objArray43, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "250) test3473(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(toStringStyle35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "=" + "'", str41, "=");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        toStringStyle0.setSummaryObjectEndText(",");
        boolean boolean10 = toStringStyle0.isUseClassName();
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        java.lang.String str12 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.DefaultToStringStyle", byteArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "251) test3474(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str12, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setFieldNameValueSeparator("<null>");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "}");
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean21 = toStringStyle20.isFieldSeparatorAtEnd();
        toStringStyle20.setSizeStartText("[");
        java.lang.String str24 = toStringStyle20.getArrayStart();
        toStringStyle0.appendIdentityHashCode(stringBuffer19, (java.lang.Object) toStringStyle20);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "252) test3475(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + ">" + "'", str24, ">");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, "hi!");
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str14, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSizeStartText("[");
        java.lang.String str4 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArrayStart("<size=");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str15 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, ">", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<size=" + "'", str13, "<size=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str15, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean12 = toStringStyle0.isDefaultFullDetail();
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeEndText("hi!");
        toStringStyle0.setContentEnd("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray18 = new int[] { (short) 100, '#', '#', 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.MultiLineToStringStyle", intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 100, 35, 35, 0, (-1) });
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str10, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "ToStringStyle.NoFieldNameToStringStyle", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "", floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<size=" + "'", str8, "<size=");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setArraySeparator("");
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendFieldStart(stringBuffer14, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "ToStringStyle.NoFieldNameToStringStyle", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 100 });
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.Class<?> wildcardClass10 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean7 = toStringStyle0.isUseClassName();
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray13 = new float[] { 'a', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "", floatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "253) test3489(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "100) test3489(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 97.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        boolean boolean4 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray7 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, ",", floatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.SimpleToStringStyle", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean14 = toStringStyle0.isDefaultFullDetail();
        boolean boolean16 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.String str4 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object obj6 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer5, obj6);
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "}", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "254) test3494(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.String str11 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer14, "ToStringStyle.DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "255) test3495(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str9, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str10, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str11, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.String str9 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "256) test3496(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str4, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str9, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setArrayEnd("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "257) test3497(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("=");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "=");
        java.lang.String str12 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray16 = new short[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "}", shortArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "258) test3498(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "101) test3498(org.apache.commons.lang3.builder.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 10 });
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "hi!");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle17.setFieldNameValueSeparator("\n  ");
        toStringStyle17.setFieldNameValueSeparator("{");
        boolean boolean22 = toStringStyle17.isUseIdentityHashCode();
        toStringStyle17.setSummaryObjectStartText(">");
        toStringStyle17.setSizeEndText("=");
        toStringStyle17.setFieldSeparator("[");
        toStringStyle17.setDefaultFullDetail(false);
        boolean boolean31 = toStringStyle17.isDefaultFullDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "<size=", (java.lang.Object) toStringStyle17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.String str13 = toStringStyle0.getContentStart();
        boolean boolean14 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}
