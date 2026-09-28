package org.apache.commons.lang3.builder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        java.lang.String str16 = toStringStyle0.getNullText();
        boolean boolean18 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer20 = null;
        double[] doubleArray24 = new double[] { (short) 0, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "}", doubleArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "1) test3501(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "1) test3501(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "1) test3501(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "1) test3501(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeEndText(">");
        toStringStyle0.setArrayStart("");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "2) test3502(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "2) test3502(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "2) test3502(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "2) test3502(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str5, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "hi!", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "3) test3503(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        toStringStyle0.setNullText("\n  ");
        toStringStyle0.setNullText("");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "4) test3504(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "3) test3504(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str13 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseClassName(true);
        java.lang.String str16 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSummaryObjectStartText("hi!");
        java.lang.String str19 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "5) test3505(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
// flaky "4) test3505(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
// flaky "3) test3505(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str19, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setArraySeparator(">");
        toStringStyle0.setArraySeparator("{");
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.String str13 = toStringStyle0.getSizeEndText();
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=" + "'", str13, "=");
// flaky "6) test3506(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.Class<?> wildcardClass8 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer12 = null;
// flaky "7) test3508(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendFieldStart(stringBuffer12, ">");
        toStringStyle0.setArrayStart("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str22 = toStringStyle21.getContentStart();
        boolean boolean23 = toStringStyle21.isUseFieldNames();
        boolean boolean24 = toStringStyle21.isUseShortClassName();
        toStringStyle21.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle21.appendSuper(stringBuffer27, "hi!");
        toStringStyle21.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer32 = null;
        toStringStyle21.appendToString(stringBuffer32, ">");
        toStringStyle21.setContentStart("<size=");
        boolean boolean37 = toStringStyle21.isFieldSeparatorAtStart();
        java.lang.String str38 = toStringStyle21.getNullText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer19, "=", (java.lang.Object) toStringStyle21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle21);
// flaky "5) test3508(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str22, "ToStringStyle.MultiLineToStringStyle");
// flaky "4) test3508(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.String str11 = toStringStyle0.getArrayStart();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.Class<?> wildcardClass13 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "8) test3509(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test3509(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "5) test3509(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str10, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseFieldNames(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "9) test3511(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str12 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparator("{");
        java.lang.StringBuffer stringBuffer15 = null;
        char[] charArray21 = new char[] { 'a', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "=", charArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "7) test3511(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test3511(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str11, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a', '#', ' ', ' ' });
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray10 = new long[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "{", longArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "10) test3512(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 10L });
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<size=", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "11) test3513(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "8) test3513(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "=" + "'", str8, "=");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "12) test3514(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "{", (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "13) test3515(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "14) test3516(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "9) test3516(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        toStringStyle0.setFieldSeparatorAtEnd(true);
        boolean boolean19 = toStringStyle0.isArrayContentDetail();
        boolean boolean20 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "15) test3517(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "10) test3517(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str16, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeEndText("}");
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "16) test3518(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSizeStartText("<null>");
        boolean boolean13 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "17) test3519(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean16 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle0.appendToString(stringBuffer21, "\n  ");
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer26, "<size=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "18) test3520(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        java.lang.String str34 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "19) test3521(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<size=" + "'", str14, "<size=");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "11) test3521(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str29, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n  " + "'", str30, "\n  ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray11 = new float[] { 1.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "=", floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 1.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setArraySeparator("");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
            toStringStyle0.appendDetail(stringBuffer15, "<null>", (int) '#');
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
// flaky "20) test3524(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str14, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        boolean boolean14 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "hi!", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray14 = new boolean[] { false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "=", booleanArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "21) test3526(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
// flaky "12) test3526(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { false, false, false });
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle10.setFieldSeparatorAtStart(true);
        boolean boolean13 = toStringStyle10.isUseFieldNames();
        java.lang.String str14 = toStringStyle10.getArraySeparator();
        toStringStyle10.setContentEnd("[");
        toStringStyle10.setNullText(">");
        toStringStyle10.setSummaryObjectStartText("[");
        toStringStyle10.setContentEnd("[");
        boolean boolean23 = toStringStyle10.isArrayContentDetail();
        boolean boolean24 = toStringStyle10.isFieldSeparatorAtEnd();
        boolean boolean25 = toStringStyle10.isDefaultFullDetail();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle26 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle26.setFieldSeparatorAtStart(true);
        java.lang.String str29 = toStringStyle26.getFieldSeparator();
        java.lang.String str30 = toStringStyle26.getFieldSeparator();
        toStringStyle26.setUseClassName(true);
        boolean boolean34 = toStringStyle26.isFullDetail((java.lang.Boolean) false);
        boolean boolean35 = toStringStyle26.isArrayContentDetail();
        boolean boolean36 = toStringStyle26.isFieldSeparatorAtStart();
        toStringStyle26.setSizeEndText("");
        java.lang.String str39 = toStringStyle26.getSummaryObjectEndText();
        java.lang.String str40 = toStringStyle26.getSummaryObjectEndText();
        java.lang.String str41 = toStringStyle26.getFieldNameValueSeparator();
        toStringStyle26.setFieldNameValueSeparator("ToStringStyle.NoFieldNameToStringStyle");
        toStringStyle26.setContentStart("\n  ");
        java.lang.String str46 = toStringStyle26.getArrayEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str48 = toStringStyle47.getSizeStartText();
        toStringStyle47.setSizeEndText("<size=");
        toStringStyle47.setArrayContentDetail(false);
        toStringStyle47.setSizeStartText("=");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle55 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle55.setFieldNameValueSeparator("\n  ");
        boolean boolean58 = toStringStyle55.isArrayContentDetail();
        java.lang.String str59 = toStringStyle55.getFieldSeparator();
        boolean boolean60 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle55);
        java.lang.String str61 = toStringStyle55.getSummaryObjectStartText();
        toStringStyle55.setArrayEnd("hi!");
        boolean boolean64 = toStringStyle55.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer65 = null;
        toStringStyle55.appendSuper(stringBuffer65, "=");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle68 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle68.setFieldSeparatorAtStart(true);
        java.lang.String str71 = toStringStyle68.getFieldSeparator();
        java.lang.String str72 = toStringStyle68.getSizeStartText();
        java.lang.String str73 = toStringStyle68.getFieldNameValueSeparator();
        boolean boolean74 = toStringStyle68.isArrayContentDetail();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle75 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle75.setFieldSeparatorAtStart(true);
        java.lang.String str78 = toStringStyle75.getFieldSeparator();
        java.lang.String str79 = toStringStyle75.getFieldSeparator();
        toStringStyle75.setUseClassName(true);
        boolean boolean83 = toStringStyle75.isFullDetail((java.lang.Boolean) false);
        boolean boolean84 = toStringStyle75.isArrayContentDetail();
        boolean boolean85 = toStringStyle75.isFieldSeparatorAtStart();
        toStringStyle75.setSizeEndText("");
        java.lang.String str88 = toStringStyle75.getSummaryObjectEndText();
        java.lang.Object[] objArray89 = new java.lang.Object[] { toStringStyle10, str46, "=", stringBuffer65, toStringStyle68, str88 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ">", objArray89, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "22) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
// flaky "13) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "7) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "}" + "'", str14, "}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(toStringStyle26);
// flaky "3) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str29, "ToStringStyle.MultiLineToStringStyle");
// flaky "1) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str30, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[" + "'", str39, "[");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[" + "'", str40, "[");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\n  " + "'", str46, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle47);
// flaky "1) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "=" + "'", str48, "=");
        org.junit.Assert.assertNotNull(toStringStyle55);
// flaky "1) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
// flaky "1) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[" + "'", str59, "[");
// flaky "1) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + ">" + "'", str61, ">");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(toStringStyle68);
// flaky "1) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str71, "ToStringStyle.MultiLineToStringStyle");
// flaky "1) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str72, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str73, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(toStringStyle75);
// flaky "1) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str78, "ToStringStyle.MultiLineToStringStyle");
// flaky "1) test3527(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str79, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "[" + "'", str88, "[");
        org.junit.Assert.assertNotNull(objArray89);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean12 = toStringStyle0.isUseShortClassName();
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean14 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) boolean13);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str11, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "23) test3528(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setArrayStart("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<null>", doubleArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "24) test3529(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str4, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "14) test3529(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getNullText();
        boolean boolean3 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "25) test3530(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, "hi!");
        java.lang.String str14 = toStringStyle0.getFieldSeparator();
        boolean boolean15 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  " + "'", str3, "\n  ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean12 = toStringStyle0.isUseShortClassName();
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer18 = null;
        float[] floatArray23 = new float[] { '#', (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "<size=", floatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str11, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 35.0f, 1.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        java.lang.StringBuffer stringBuffer20 = null;
        short[] shortArray26 = new short[] { (short) 1, (byte) 10, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer20, "ToStringStyle.DefaultToStringStyle", shortArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 1, (short) 10, (short) 1, (short) -1 });
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.String str12 = toStringStyle0.getSizeStartText();
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setArrayEnd("<null>");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean18 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "26) test3534(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n  " + "'", str12, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "15) test3534(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setFieldNameValueSeparator("<null>");
        toStringStyle0.setSummaryObjectStartText("{");
        java.lang.StringBuffer stringBuffer18 = null;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "{", byteArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1 });
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ">" + "'", str18, ">");
// flaky "27) test3536(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldNameValueSeparator("");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSizeStartText("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "28) test3537(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray6 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "=", doubleArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "}", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  " + "'", str3, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.DefaultToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        toStringStyle0.setUseFieldNames(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "29) test3541(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldSeparator(",");
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.NoFieldNameToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer12, "\n  ", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "30) test3543(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "16) test3543(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean7 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
// flaky "31) test3544(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
// flaky "17) test3544(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        boolean boolean20 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayStart("[");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str16, "ToStringStyle.SimpleToStringStyle");
// flaky "32) test3545(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n  " + "'", str18, "\n  ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.String str13 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.String str16 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
// flaky "33) test3546(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
// flaky "18) test3546(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle14.setContentStart("<null>");
        toStringStyle14.setSummaryObjectStartText("");
        toStringStyle14.setSizeStartText("{");
        boolean boolean21 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle14);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer13, (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "34) test3547(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        java.lang.String str3 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer4, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  " + "'", str3, "\n  ");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getArraySeparator();
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray14 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, ",", booleanArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "35) test3549(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] {});
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayEnd("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "36) test3550(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "ToStringStyle.MultiLineToStringStyle", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "37) test3551(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "hi!");
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str13 = toStringStyle12.getSizeStartText();
        toStringStyle12.setSizeEndText("<size=");
        toStringStyle12.setArrayContentDetail(false);
        toStringStyle12.setSizeStartText("=");
        java.lang.String str20 = toStringStyle12.getFieldSeparator();
        boolean boolean21 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle12);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer11, (java.lang.Object) toStringStyle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=" + "'", str13, "=");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "," + "'", str20, ",");
// flaky "38) test3552(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str9, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        boolean boolean18 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) stringBuffer5);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str16, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer2 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer2, (java.lang.Object) (byte) 100);
        java.lang.String str5 = toStringStyle0.getContentEnd();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray11 = new short[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "{", shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
// flaky "39) test3555(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 1 });
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setNullText("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray15 = new int[] { (byte) 1, 10, (short) -1, (-1), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, ",", intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "40) test3557(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 10, (-1), (-1), (-1) });
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.String str12 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparator("\n  ");
        java.lang.StringBuffer stringBuffer15 = null;
        char[] charArray20 = new char[] { 'a', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "\n  ", charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "41) test3558(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', 'a', '4' });
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = toStringStyle3.getContentStart();
        toStringStyle3.setArrayEnd("\n  ");
        boolean boolean7 = toStringStyle3.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) boolean9);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSizeEndText("ToStringStyle.MultiLineToStringStyle");
        boolean boolean14 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer15 = null;
        byte[] byteArray18 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "ToStringStyle.SimpleToStringStyle", byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
// flaky "42) test3559(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1 });
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle17.setFieldSeparatorAtStart(true);
        java.lang.String str20 = toStringStyle17.getContentStart();
        toStringStyle17.setNullText(",");
        toStringStyle17.setFieldSeparatorAtStart(true);
        java.lang.String str25 = toStringStyle17.getArraySeparator();
        boolean boolean26 = toStringStyle17.isDefaultFullDetail();
        toStringStyle17.setContentStart("ToStringStyle.MultiLineToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer15, "<null>", (java.lang.Object) toStringStyle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "43) test3560(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "19) test3560(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "8) test3560(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "4) test3560(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle17);
// flaky "2) test3560(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{" + "'", str20, "{");
// flaky "2) test3560(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<size=" + "'", str25, "<size=");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldSeparator(",");
        java.lang.String str11 = toStringStyle0.getContentEnd();
        boolean boolean12 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "44) test3561(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle21.setFieldSeparatorAtStart(true);
        toStringStyle21.setUseIdentityHashCode(true);
        toStringStyle21.setSizeEndText("<size=");
        java.lang.String str28 = toStringStyle21.getContentStart();
        toStringStyle21.setUseShortClassName(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer19, ">", (java.lang.Object) false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "45) test3562(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str28, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str10 = toStringStyle0.getContentStart();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer13, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "46) test3563(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str10, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("{");
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "47) test3564(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<size=" + "'", str11, "<size=");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap9 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.DefaultToStringStyle", objMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "48) test3565(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str3, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertNotNull(objMap9);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.String str13 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "ToStringStyle.SimpleToStringStyle", (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
// flaky "49) test3566(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<null>", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
// flaky "50) test3567(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<size=" + "'", str11, "<size=");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle9.setFieldNameValueSeparator("\n  ");
        toStringStyle9.setFieldNameValueSeparator("{");
        boolean boolean14 = toStringStyle9.isUseIdentityHashCode();
        toStringStyle9.setSummaryObjectStartText(">");
        toStringStyle9.setSizeEndText("=");
        toStringStyle9.setFieldSeparator("[");
        toStringStyle9.setSummaryObjectStartText(",");
        java.lang.String str23 = toStringStyle9.getSummaryObjectStartText();
        boolean boolean24 = toStringStyle9.isUseFieldNames();
        java.lang.Object[] objArray25 = new java.lang.Object[] { toStringStyle9 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, ">", objArray25, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "51) test3568(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "," + "'", str23, ",");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str7 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "52) test3569(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        java.lang.String str5 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray9 = new short[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "<size=", shortArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "53) test3571(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str4, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 0 });
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "hi!", (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setSummaryObjectEndText("{");
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, ">", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        boolean boolean12 = toStringStyle0.isUseClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "54) test3574(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str13 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "", byteArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "55) test3575(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
// flaky "20) test3575(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "9) test3575(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str10, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.String str19 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "56) test3576(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str16, "ToStringStyle.DefaultToStringStyle");
// flaky "21) test3576(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<size=" + "'", str19, "<size=");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray15 = new char[] { '#', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '#', '#' });
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "\n  ", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "57) test3578(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSummaryObjectEndText("\n  ");
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.SimpleToStringStyle");
        boolean boolean14 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "58) test3579(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        boolean boolean14 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray18 = new double[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "ToStringStyle.DefaultToStringStyle", doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "59) test3580(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "22) test3580(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
            toStringStyle0.appendContentEnd(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray15 = new double[] { 1L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<size=", doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        java.lang.String str16 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "60) test3583(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "23) test3583(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "{", byteArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 100 });
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean10 = toStringStyle9.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str12 = toStringStyle11.getContentStart();
        boolean boolean13 = toStringStyle11.isUseFieldNames();
        boolean boolean14 = toStringStyle11.isFieldSeparatorAtEnd();
        toStringStyle11.setFieldSeparator("");
        boolean boolean17 = toStringStyle11.isDefaultFullDetail();
        java.lang.Object[] objArray18 = new java.lang.Object[] { boolean10, toStringStyle11 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ">", objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        java.lang.String str2 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean3 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str9 = toStringStyle8.getContentStart();
        boolean boolean10 = toStringStyle8.isUseFieldNames();
        boolean boolean11 = toStringStyle8.isUseShortClassName();
        toStringStyle8.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer14 = null;
// flaky "61) test3586(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle8.appendFieldStart(stringBuffer14, ">");
        java.lang.Class<?> wildcardClass17 = toStringStyle8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "<null>", (java.lang.Object) wildcardClass17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "24) test3586(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str9, "ToStringStyle.MultiLineToStringStyle");
// flaky "10) test3586(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle15.setFieldSeparatorAtStart(true);
        java.lang.String str18 = toStringStyle15.getFieldSeparator();
        java.lang.String str19 = toStringStyle15.getFieldSeparator();
        toStringStyle15.setSummaryObjectEndText("[");
        java.lang.String str22 = toStringStyle15.getSizeEndText();
        toStringStyle15.setArrayContentDetail(false);
        toStringStyle0.appendIdentityHashCode(stringBuffer14, (java.lang.Object) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "62) test3587(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
// flaky "25) test3587(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "," + "'", str19, ",");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n  " + "'", str22, "\n  ");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        java.lang.String str13 = toStringStyle0.getSizeStartText();
        boolean boolean14 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
// flaky "63) test3588(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
// flaky "26) test3588(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle13.appendToString(stringBuffer14, "[");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle13.appendToString(stringBuffer17, "");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer11, "<size=", (java.lang.Object) stringBuffer17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "64) test3589(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle13);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getArraySeparator();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "65) test3590(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "27) test3590(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
// flaky "11) test3590(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.DefaultToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<size=", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldSeparator(",");
        java.lang.String str11 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray16 = new short[] { (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "", shortArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "66) test3593(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 10, (short) 100 });
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        toStringStyle0.setNullText("\n  ");
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray12 = new char[] { 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "{", charArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', 'a' });
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayStart("ToStringStyle.DefaultToStringStyle");
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "67) test3595(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<null>", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
// flaky "68) test3596(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeEndText(">");
        toStringStyle0.setSizeEndText("hi!");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "=", (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "69) test3597(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "28) test3597(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str5, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "=", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.SimpleToStringStyle");
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        toStringStyle0.setFieldSeparator("ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str21 = toStringStyle20.getContentStart();
        boolean boolean22 = toStringStyle20.isUseFieldNames();
        boolean boolean23 = toStringStyle20.isUseShortClassName();
        toStringStyle20.setFieldSeparator("hi!");
        java.lang.String str26 = toStringStyle20.getContentStart();
        toStringStyle20.setArrayContentDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer19, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "70) test3600(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
// flaky "29) test3600(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str21, "ToStringStyle.MultiLineToStringStyle");
// flaky "12) test3600(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str26, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getNullText();
        boolean boolean15 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("}");
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle16.setFieldSeparatorAtStart(true);
        java.lang.String str19 = toStringStyle16.getContentStart();
        toStringStyle16.setNullText(",");
        toStringStyle16.setFieldSeparatorAtStart(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle16);
        toStringStyle16.setFieldSeparatorAtStart(true);
        boolean boolean27 = toStringStyle16.isDefaultFullDetail();
        toStringStyle16.setSummaryObjectStartText("=");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer15, (java.lang.Object) toStringStyle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str14, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str19, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        java.lang.StringBuffer stringBuffer15 = null;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ToStringStyle.MultiLineToStringStyle", byteArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<size=" + "'", str13, "<size=");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray15 = new boolean[] { true, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "=", booleanArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "71) test3604(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "30) test3604(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true, true, true, false });
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayContentDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "[", (int) '#');
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
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        toStringStyle0.setArrayEnd("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = toStringStyle3.getContentStart();
        toStringStyle3.setArrayEnd("\n  ");
        boolean boolean7 = toStringStyle3.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) boolean9);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray21 = new short[] { (short) -1, (short) 1, (byte) 1, (short) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "hi!", shortArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
// flaky "72) test3608(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) -1, (short) 1, (short) 1, (short) 10, (short) 1, (short) 0 });
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("ToStringStyle.MultiLineToStringStyle");
        java.lang.String str13 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "73) test3609(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "31) test3609(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n  " + "'", str13, "\n  ");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, ">");
        java.lang.StringBuffer stringBuffer18 = null;
        float[] floatArray21 = new float[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer18, "ToStringStyle.DefaultToStringStyle", floatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "74) test3610(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
// flaky "32) test3610(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        int[] intArray20 = new int[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "ToStringStyle.MultiLineToStringStyle", intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0 });
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer7, "<size=", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "75) test3612(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer15, "ToStringStyle.SimpleToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "76) test3613(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "33) test3613(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "13) test3613(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer8 = null;
        boolean[] booleanArray16 = new boolean[] { true, true, false, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.MultiLineToStringStyle", booleanArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "77) test3614(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "34) test3614(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "14) test3614(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { true, true, false, true, false, true });
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.DefaultToStringStyle", objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getNullText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "78) test3616(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "35) test3616(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "15) test3616(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "79) test3617(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "36) test3617(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<size=", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "80) test3618(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        java.lang.StringBuffer stringBuffer16 = null;
        short[] shortArray23 = new short[] { (short) 1, (short) -1, (short) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "<size=", shortArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<size=" + "'", str13, "<size=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 1, (short) -1, (short) 100, (short) -1, (short) 0 });
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("hi!");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseIdentityHashCode(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "81) test3620(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "37) test3620(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean12 = toStringStyle0.isUseShortClassName();
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, "\n  ");
        java.lang.String str17 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "82) test3621(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "38) test3621(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str11, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<size=" + "'", str17, "<size=");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer19 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap21 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer19, ">", objMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "83) test3622(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "39) test3622(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objMap21);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("=");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "=");
        toStringStyle0.setUseClassName(true);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "84) test3623(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "40) test3623(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("[");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectStartText("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "85) test3624(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "41) test3624(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSizeEndText(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "86) test3625(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparator("{");
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setUseShortClassName(true);
        boolean boolean15 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "87) test3626(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "42) test3626(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{" + "'", str9, "{");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = toStringStyle3.getContentStart();
        toStringStyle3.setArrayEnd("\n  ");
        boolean boolean7 = toStringStyle3.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) boolean9);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray19 = new float[] { 10, 10L, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "<null>", floatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
// flaky "88) test3627(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 10.0f, 10.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setContentEnd("<null>");
        toStringStyle0.setArraySeparator(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "89) test3628(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str15 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, ">", (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "90) test3629(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
// flaky "43) test3629(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        boolean boolean14 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setArraySeparator("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "91) test3630(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "44) test3630(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str11, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.String str7 = toStringStyle0.getContentStart();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "92) test3631(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "45) test3631(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.String str10 = toStringStyle0.getNullText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "93) test3633(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{" + "'", str9, "{");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setArrayContentDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "94) test3634(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer2 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer2, (java.lang.Object) (byte) 100);
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer7, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "95) test3635(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setUseClassName(false);
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "=", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "96) test3636(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        java.lang.Class<?> wildcardClass18 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "97) test3637(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        java.lang.String str16 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "98) test3638(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
// flaky "46) test3638(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, ",");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray16 = new boolean[] { false, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "[", booleanArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "99) test3639(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { false, false, false, false });
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayStart("<null>");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "=", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "100) test3640(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "47) test3640(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "16) test3640(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
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
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray19 = new boolean[] { false, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "<null>", booleanArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "101) test3641(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { false, false, false, true });
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray17 = new short[] { (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "{", shortArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
// flaky "102) test3642(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{" + "'", str9, "{");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 10, (short) 10 });
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer5, "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "103) test3643(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendFieldStart(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendFieldStart(stringBuffer10, "[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "104) test3644(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "105) test3645(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "48) test3645(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky "17) test3645(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparator("{");
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray16 = new float[] { (byte) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "[", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "106) test3646(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { (-1.0f), 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setContentStart("[");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArrayEnd("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer23 = null;
        toStringStyle0.appendFieldStart(stringBuffer23, "=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "107) test3647(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
// flaky "108) test3648(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendToString(stringBuffer12, "<null>");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str16 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "49) test3648(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "18) test3648(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "5) test3648(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "\n  ", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "109) test3649(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        java.lang.String str18 = toStringStyle0.getArrayEnd();
        java.lang.String str19 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "110) test3651(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "50) test3651(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[" + "'", str18, "[");
// flaky "19) test3651(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[" + "'", str19, "[");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        java.lang.String str16 = toStringStyle0.getNullText();
        toStringStyle0.setContentEnd("<size=");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "111) test3652(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setContentEnd("ToStringStyle.DefaultToStringStyle");
        java.lang.String str12 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "<size=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
// flaky "112) test3653(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str12, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setNullText("\n  ");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle13.setFieldNameValueSeparator("\n  ");
        toStringStyle13.setFieldNameValueSeparator("{");
        boolean boolean18 = toStringStyle13.isUseIdentityHashCode();
        toStringStyle13.setSummaryObjectStartText(">");
        toStringStyle13.setSizeEndText("=");
        toStringStyle13.setFieldSeparator("[");
        toStringStyle13.setDefaultFullDetail(false);
        java.lang.String str27 = toStringStyle13.getSummaryObjectEndText();
        toStringStyle13.setSummaryObjectEndText("ToStringStyle.MultiLineToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer11, ">", (java.lang.Object) "ToStringStyle.MultiLineToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "113) test3654(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "," + "'", str27, ",");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        toStringStyle0.setNullText("\n  ");
        toStringStyle0.setNullText("");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray17 = new float[] { (short) 10, (byte) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, ",", floatArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "114) test3655(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 10.0f, 100.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArraySeparator("hi!");
        toStringStyle0.setFieldNameValueSeparator("=");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray13 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ",", charArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "115) test3656(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#' });
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray13 = new long[] { 10L, 1L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "", longArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "116) test3657(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "51) test3657(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 10L, 1L, 1L });
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        double[] doubleArray21 = new double[] { 10L, 10.0f, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "[", doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        java.lang.String str17 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeEndText("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "117) test3659(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str16, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "{", booleanArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap13 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "hi!", objMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(objMap13);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        boolean boolean20 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer21 = null;
        short[] shortArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer21, "", shortArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "ToStringStyle.NoFieldNameToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str22 = toStringStyle0.getSummaryObjectStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "," + "'", str22, ",");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str17 = toStringStyle16.getContentStart();
        boolean boolean18 = toStringStyle16.isUseFieldNames();
        java.lang.String str19 = toStringStyle16.getFieldSeparator();
        java.lang.String str20 = toStringStyle16.getContentEnd();
        boolean boolean21 = toStringStyle16.isFieldSeparatorAtEnd();
        boolean boolean22 = toStringStyle16.isFieldSeparatorAtStart();
        java.lang.String str23 = toStringStyle16.getSummaryObjectEndText();
        toStringStyle16.setSizeStartText("{");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object) toStringStyle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(toStringStyle16);
// flaky "118) test3665(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
// flaky "52) test3665(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[" + "'", str20, "[");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[" + "'", str23, "[");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("[");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str16 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<null>" + "'", str16, "<null>");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap10 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<null>", objMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "119) test3667(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(objMap10);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setFieldNameValueSeparator("}");
        java.lang.String str12 = toStringStyle0.getArrayEnd();
        java.lang.String str13 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "120) test3668(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n  " + "'", str12, "\n  ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        toStringStyle0.setSummaryObjectEndText(",");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray14 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray16 = new long[] { 1, (short) 100, (byte) 0, (short) -1, (byte) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "{", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 1L, 100L, 0L, (-1L), 1L, 32L });
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "ToStringStyle.NoFieldNameToStringStyle", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "121) test3671(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseFieldNames(true);
        boolean boolean13 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "<null>");
        java.lang.String str19 = toStringStyle0.getSizeEndText();
        toStringStyle0.setDefaultFullDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<null>" + "'", str19, "<null>");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer7 = null;
// flaky "122) test3673(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendFieldStart(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ">", 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
// flaky "53) test3673(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.String str17 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ">" + "'", str17, ">");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        toStringStyle0.setNullText("\n  ");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "=", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "123) test3675(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setArraySeparator("}");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "124) test3676(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        boolean[] booleanArray18 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "\n  ", booleanArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray18);
        assertBooleanArrayEquals(booleanArray18, new boolean[] { false });
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray13 = new double[] { 0.0d, 10, '4', 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "", doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "125) test3678(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 10.0d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "126) test3679(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.NoFieldNameToStringStyle");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer18, "{");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "127) test3680(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle10.appendToString(stringBuffer11, "[");
        toStringStyle10.setSizeEndText(">");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer8, "=", (java.lang.Object) ">", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "128) test3681(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str4, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle10);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray17 = new long[] { '#', (-1L), (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "129) test3682(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 35L, (-1L), 100L, 0L });
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
// flaky "130) test3683(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str12 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "}", shortArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "=" + "'", str12, "=");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = toStringStyle3.getContentStart();
        toStringStyle3.setArrayEnd("\n  ");
        boolean boolean7 = toStringStyle3.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) boolean9);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer14 = null;
        short[] shortArray16 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.MultiLineToStringStyle", shortArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
// flaky "131) test3685(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldNameValueSeparator("[");
        boolean boolean6 = toStringStyle0.isArrayContentDetail();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseIdentityHashCode(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setArraySeparator(",");
        java.lang.String str15 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "132) test3687(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendToString(stringBuffer11, "hi!");
        java.lang.String str14 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "133) test3690(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "54) test3690(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setSummaryObjectEndText("{");
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSizeStartText("}");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer15, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "134) test3691(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
// flaky "55) test3691(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
// flaky "20) test3691(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "6) test3691(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray16 = new boolean[] { true, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", booleanArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { true, true, true, false });
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray16 = new long[] { 0L, 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", longArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L, 1L, 1L });
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectEndText("hi!");
        java.lang.String str9 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer15, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "135) test3694(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "56) test3694(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("<size=");
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray16 = new double[] { 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, ",", doubleArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "136) test3695(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 97.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        toStringStyle0.setUseClassName(true);
        java.lang.String str19 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle21.setFieldNameValueSeparator("\n  ");
        toStringStyle21.setFieldNameValueSeparator("{");
        boolean boolean26 = toStringStyle21.isUseIdentityHashCode();
        toStringStyle21.setSummaryObjectStartText(">");
        toStringStyle21.setSizeEndText("=");
        toStringStyle21.setFieldSeparator("[");
        toStringStyle21.setDefaultFullDetail(false);
        java.lang.String str35 = toStringStyle21.getSummaryObjectEndText();
        toStringStyle21.setSummaryObjectEndText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle21.setFieldSeparatorAtEnd(false);
        toStringStyle21.setArraySeparator("}");
        toStringStyle21.setContentStart("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer20, (java.lang.Object) toStringStyle21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=" + "'", str13, "=");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
// flaky "137) test3696(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
// flaky "57) test3696(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str35, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer14, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
// flaky "138) test3698(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendSuper(stringBuffer7, ",");
        toStringStyle0.setArraySeparator("\n  ");
        toStringStyle0.setUseClassName(true);
        java.lang.String str14 = toStringStyle0.getContentEnd();
        java.lang.String str15 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "58) test3698(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "21) test3698(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
// flaky "7) test3698(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setUseFieldNames(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "139) test3699(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "140) test3700(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArraySeparator(">");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("}");
        boolean boolean14 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        toStringStyle0.appendIdentityHashCode(stringBuffer8, (java.lang.Object) str23);
        boolean boolean25 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toStringStyle9);
// flaky "141) test3703(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
// flaky "59) test3703(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "22) test3703(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
// flaky "8) test3703(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "}" + "'", str23, "}");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart(">");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "142) test3704(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
// flaky "60) test3704(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
// flaky "143) test3705(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendToString(stringBuffer7, "<size=");
        toStringStyle0.setSummaryObjectStartText("=");
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendClassName(stringBuffer13, obj14);
        toStringStyle0.setNullText("\n  ");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "61) test3705(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "23) test3705(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "9) test3705(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "3) test3705(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = toStringStyle9.getContentStart();
        boolean boolean11 = toStringStyle9.isUseFieldNames();
        boolean boolean12 = toStringStyle9.isUseShortClassName();
        toStringStyle9.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle9.isFieldSeparatorAtEnd();
        java.lang.String str16 = toStringStyle9.getArraySeparator();
        toStringStyle9.setSizeStartText("=");
        boolean boolean19 = toStringStyle9.isUseFieldNames();
        toStringStyle9.setUseShortClassName(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "<null>", (java.lang.Object) toStringStyle9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "144) test3706(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "62) test3706(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(toStringStyle9);
// flaky "24) test3706(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "10) test3706(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "4) test3706(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n  " + "'", str16, "\n  ");
// flaky "3) test3706(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldNameValueSeparator("}");
        toStringStyle0.setFieldSeparator("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        boolean boolean12 = toStringStyle0.isUseFieldNames();
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray20 = new boolean[] { true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "}", booleanArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
// flaky "145) test3708(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        assertBooleanArrayEquals(booleanArray20, new boolean[] { true, true, false, false });
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle13.setFieldNameValueSeparator("\n  ");
        toStringStyle13.setFieldNameValueSeparator("{");
        boolean boolean18 = toStringStyle13.isUseClassName();
        java.lang.String str19 = toStringStyle13.getSizeEndText();
        toStringStyle13.setUseFieldNames(false);
        toStringStyle13.setSummaryObjectEndText(",");
        boolean boolean24 = toStringStyle13.isFieldSeparatorAtStart();
        java.lang.String str25 = toStringStyle13.getSizeStartText();
        boolean boolean26 = toStringStyle13.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "ToStringStyle.NoFieldNameToStringStyle", (java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "146) test3709(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "63) test3709(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str19, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "," + "'", str25, ",");
// flaky "25) test3709(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ">", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "\n  ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer5, "ToStringStyle.DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "147) test3712(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "64) test3712(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "26) test3712(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "11) test3712(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        toStringStyle0.setSummaryObjectEndText(">");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "148) test3713(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "65) test3713(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "27) test3713(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("[");
        java.lang.String str12 = toStringStyle0.getFieldNameValueSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{" + "'", str12, "{");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
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
        toStringStyle0.setContentStart("");
        java.lang.StringBuffer stringBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        boolean boolean18 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer19 = null;
        float[] floatArray25 = new float[] { 100, ' ', 1, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer19, "", floatArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "149) test3716(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "66) test3716(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "28) test3716(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 100.0f, 32.0f, 1.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "=", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectEndText("hi!");
        java.lang.String str9 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("\n  ");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "150) test3718(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "67) test3718(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "29) test3718(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer17 = null;
        char[] charArray20 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "[", charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a' });
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
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
        toStringStyle0.setArrayEnd("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, ">", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  " + "'", str3, "\n  ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray17 = new double[] { 10, 0L, 10, (-1), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "151) test3722(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "68) test3722(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<size=" + "'", str8, "<size=");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 10.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, ",", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "152) test3723(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        int[] intArray19 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "<size=", intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  " + "'", str3, "\n  ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] {});
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        toStringStyle0.setSizeEndText("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "153) test3725(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str16, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        boolean boolean13 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "154) test3726(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "69) test3726(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
// flaky "30) test3726(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "[", byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "155) test3727(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "70) test3727(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  " + "'", str3, "\n  ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n  " + "'", str5, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        toStringStyle10.setContentEnd("<size=");
        boolean boolean19 = toStringStyle10.isDefaultFullDetail();
        toStringStyle10.setNullText("}");
        java.lang.String str22 = toStringStyle10.getNullText();
        boolean boolean23 = toStringStyle10.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle24.setFieldNameValueSeparator("\n  ");
        boolean boolean27 = toStringStyle24.isArrayContentDetail();
        boolean boolean29 = toStringStyle24.isFullDetail((java.lang.Boolean) false);
        toStringStyle24.setUseClassName(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle32 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle32.setFieldSeparatorAtStart(true);
        java.lang.String str35 = toStringStyle32.getFieldSeparator();
        java.lang.String str36 = toStringStyle32.getFieldSeparator();
        toStringStyle32.setArrayEnd("hi!");
        toStringStyle32.setFieldSeparatorAtStart(true);
        java.lang.String str41 = toStringStyle32.getArrayEnd();
        toStringStyle32.setArrayContentDetail(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle44 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle44.setFieldNameValueSeparator("\n  ");
        toStringStyle44.setFieldNameValueSeparator("{");
        boolean boolean49 = toStringStyle44.isUseIdentityHashCode();
        java.lang.String str50 = toStringStyle44.getFieldNameValueSeparator();
        toStringStyle44.setUseFieldNames(true);
        java.lang.String str53 = toStringStyle44.getFieldSeparator();
        java.lang.Object[] objArray54 = new java.lang.Object[] { boolean23, true, toStringStyle32, str53 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "<size=", objArray54, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n  " + "'", str13, "\n  ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n  " + "'", str14, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
// flaky "156) test3728(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(toStringStyle32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\n  " + "'", str35, "\n  ");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\n  " + "'", str36, "\n  ");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle44);
// flaky "71) test3728(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "{" + "'", str50, "{");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[" + "'", str53, "[");
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "157) test3729(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "72) test3729(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
// flaky "31) test3729(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setSizeStartText("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "158) test3730(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
// flaky "73) test3730(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText("<null>");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.NoFieldNameToStringStyle");
        java.lang.String str8 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "159) test3731(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSummaryObjectEndText("\n  ");
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseFieldNames(true);
        java.lang.String str13 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str10, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayStart("<null>");
        java.lang.String str19 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, "[", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "160) test3733(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "74) test3733(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n  " + "'", str16, "\n  ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n  " + "'", str19, "\n  ");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray14 = new char[] { '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "{", charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', '#' });
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str10 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap13 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.MultiLineToStringStyle", objMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str10, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(objMap13);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "<size=", doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
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
        boolean boolean21 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str22 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "161) test3737(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<size=" + "'", str22, "<size=");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "<size=", byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
// flaky "162) test3738(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 1 });
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getNullText();
        toStringStyle0.setDefaultFullDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str16 = toStringStyle15.getSizeStartText();
        toStringStyle15.setUseShortClassName(true);
        toStringStyle15.setFieldNameValueSeparator("ToStringStyle.MultiLineToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer14, (java.lang.Object) toStringStyle15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "163) test3740(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "75) test3740(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "32) test3740(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ">", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "164) test3741(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "76) test3741(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        java.lang.String str7 = toStringStyle0.getContentStart();
        toStringStyle0.setDefaultFullDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "165) test3742(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray10 = new short[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "\n  ", shortArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        boolean boolean15 = toStringStyle0.isUseShortClassName();
        java.lang.String str16 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectEndText("}");
        java.lang.StringBuffer stringBuffer19 = null;
        float[] floatArray22 = new float[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ToStringStyle.DefaultToStringStyle", floatArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "166) test3744(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "77) test3744(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "33) test3744(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "12) test3744(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str16, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSizeEndText(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
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
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "=");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle17.setFieldNameValueSeparator("\n  ");
        toStringStyle17.setFieldNameValueSeparator("{");
        boolean boolean22 = toStringStyle17.isUseClassName();
        toStringStyle17.setArrayEnd("");
        toStringStyle17.setSizeStartText(",");
        boolean boolean27 = toStringStyle17.isUseFieldNames();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer16, (java.lang.Object) toStringStyle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "167) test3746(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "78) test3746(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str7 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "168) test3747(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "79) test3747(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean16 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle0.appendToString(stringBuffer21, "\n  ");
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer26 = null;
        char[] charArray33 = new char[] { ' ', ' ', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer26, "<null>", charArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "169) test3748(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "80) test3748(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { ' ', ' ', '4', ' ', '4' });
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setUseShortClassName(true);
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray15 = new char[] { ' ', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "<size=", charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "170) test3749(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', ' ', 'a' });
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setNullText("=");
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray18 = new long[] { (-1L), (short) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<null>", longArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { (-1L), 1L, (-1L) });
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isUseClassName();
        toStringStyle0.setUseShortClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("\n  ");
        toStringStyle14.setFieldNameValueSeparator("{");
        toStringStyle14.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle14.appendIdentityHashCode(stringBuffer21, (java.lang.Object) 1.0f);
        toStringStyle14.setFieldNameValueSeparator(">");
        java.lang.String str26 = toStringStyle14.getNullText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer13, (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "171) test3752(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "}" + "'", str12, "}");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "=" + "'", str26, "=");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        java.lang.StringBuffer stringBuffer19 = null;
        short[] shortArray24 = new short[] { (byte) -1, (short) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, ",", shortArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<size=" + "'", str18, "<size=");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) -1, (short) 0, (short) -1 });
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
// flaky "172) test3754(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendToString(stringBuffer7, "<size=");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setFieldNameValueSeparator("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "81) test3754(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "34) test3754(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldNameValueSeparator(",");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "}");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle18.setFieldSeparatorAtStart(true);
        java.lang.String str21 = toStringStyle18.getFieldSeparator();
        java.lang.String str22 = toStringStyle18.getFieldSeparator();
        toStringStyle18.setUseClassName(true);
        boolean boolean26 = toStringStyle18.isFullDetail((java.lang.Boolean) false);
        boolean boolean27 = toStringStyle18.isArrayContentDetail();
        boolean boolean28 = toStringStyle18.isFieldSeparatorAtStart();
        toStringStyle18.setSizeEndText("");
        java.lang.String str31 = toStringStyle18.getSummaryObjectEndText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle32 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle32.setFieldSeparatorAtStart(true);
        boolean boolean35 = toStringStyle32.isUseFieldNames();
        toStringStyle32.setUseIdentityHashCode(false);
        java.lang.String str38 = toStringStyle32.getSummaryObjectEndText();
        java.lang.String str39 = toStringStyle32.getArraySeparator();
        toStringStyle32.setArrayStart("hi!");
        toStringStyle32.setFieldSeparatorAtStart(false);
        toStringStyle32.setArrayStart("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle46 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle46.setFieldSeparatorAtStart(true);
        boolean boolean49 = toStringStyle46.isUseFieldNames();
        java.lang.String str50 = toStringStyle46.getArraySeparator();
        java.lang.String str51 = toStringStyle46.getFieldSeparator();
        java.lang.String str52 = toStringStyle46.getContentEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle53 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle53.setFieldSeparatorAtStart(true);
        java.lang.String str56 = toStringStyle53.getContentStart();
        toStringStyle53.setNullText(",");
        toStringStyle53.setFieldSeparatorAtStart(true);
        java.lang.String str61 = toStringStyle53.getArraySeparator();
        boolean boolean62 = toStringStyle53.isDefaultFullDetail();
        java.lang.String str63 = toStringStyle53.getArrayStart();
        toStringStyle53.setUseShortClassName(false);
        java.lang.Object[] objArray66 = new java.lang.Object[] { toStringStyle18, "hi!", str52, toStringStyle53 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "\n  ", objArray66, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "173) test3755(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "}" + "'", str31, "}");
        org.junit.Assert.assertNotNull(toStringStyle32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "}" + "'", str38, "}");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str39, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str50, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
// flaky "82) test3755(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str52, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle53);
// flaky "35) test3755(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str61, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectEndText("}");
        toStringStyle0.setSizeEndText("ToStringStyle.SimpleToStringStyle");
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentStart("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        toStringStyle0.setNullText("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle13.setFieldSeparatorAtStart(true);
        java.lang.String str16 = toStringStyle13.getFieldSeparator();
        java.lang.String str17 = toStringStyle13.getFieldSeparator();
        toStringStyle13.setUseClassName(true);
        boolean boolean21 = toStringStyle13.isFullDetail((java.lang.Boolean) false);
        boolean boolean22 = toStringStyle13.isArrayContentDetail();
        boolean boolean23 = toStringStyle13.isFieldSeparatorAtStart();
        boolean boolean24 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setUseShortClassName(false);
        toStringStyle0.appendIdentityHashCode(stringBuffer12, (java.lang.Object) false);
        java.lang.StringBuffer stringBuffer28 = null;
        double[] doubleArray31 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer28, "<null>", doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        toStringStyle0.setContentStart("<null>");
        java.lang.StringBuffer stringBuffer14 = null;
        short[] shortArray20 = new short[] { (short) -1, (short) 10, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.SimpleToStringStyle", shortArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) -1, (short) 10, (short) -1, (short) 100 });
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "{");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle16.setFieldSeparatorAtStart(true);
        boolean boolean19 = toStringStyle16.isUseFieldNames();
        java.lang.String str20 = toStringStyle16.getArraySeparator();
        toStringStyle16.setContentEnd("[");
        toStringStyle16.setNullText(">");
        toStringStyle16.setSummaryObjectStartText("[");
        java.lang.String str27 = toStringStyle16.getFieldSeparator();
        boolean boolean28 = toStringStyle16.isUseIdentityHashCode();
        toStringStyle0.appendIdentityHashCode(stringBuffer15, (java.lang.Object) toStringStyle16);
        java.lang.StringBuffer stringBuffer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle16.appendDetail(stringBuffer30, "ToStringStyle.NoFieldNameToStringStyle", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str20, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray11 = new float[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.DefaultToStringStyle", floatArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        boolean boolean13 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseShortClassName(false);
        boolean boolean18 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
        java.lang.String str14 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "}" + "'", str14, "}");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseShortClassName(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        double[] doubleArray13 = new double[] { 'a', 1.0d, (byte) 1, 100.0d, 1.0d, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<null>", doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 97.0d, 1.0d, 1.0d, 100.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str12 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentStart("<null>");
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setArrayEnd("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparator("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseShortClassName(true);
        java.lang.String str11 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray15 = new long[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "<null>", longArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "174) test3771(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<size=" + "'", str11, "<size=");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 100L });
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "[", (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray18 = new char[] { '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "ToStringStyle.MultiLineToStringStyle", charArray18, (java.lang.Boolean) true);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ' });
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray14 = new int[] { '4', (byte) 100, '#', (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<size=", intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 52, 100, 35, 100, 0 });
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
// flaky "175) test3775(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str10, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        boolean boolean11 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        java.lang.String str6 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "[", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "}", (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "176) test3779(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
// flaky "83) test3779(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectEndText("}");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray11 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.DefaultToStringStyle", charArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setFieldNameValueSeparator("<null>");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "\n  ", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "{");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) "{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseShortClassName(true);
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setArrayContentDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "ToStringStyle.SimpleToStringStyle", (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "177) test3784(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.DefaultToStringStyle", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "[", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
// flaky "178) test3786(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "84) test3786(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray18 = new long[] { (byte) 1, (short) 100, 0L, (short) 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<size=", longArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 1L, 100L, 0L, 10L, 100L });
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayEnd("hi!");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "}", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "179) test3789(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
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
            toStringStyle0.append(stringBuffer10, "[", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectEndText("}");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray10 = new double[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "[", doubleArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        boolean boolean15 = toStringStyle0.isUseShortClassName();
        java.lang.String str16 = toStringStyle0.getContentEnd();
        toStringStyle0.setSummaryObjectEndText("}");
        java.lang.String str19 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[" + "'", str19, "[");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
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
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setFieldNameValueSeparator("[");
        boolean boolean20 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.DefaultToStringStyle", (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str8 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray16 = new float[] { 100, (-1.0f), 0, (short) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "\n  ", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "180) test3795(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<size=" + "'", str8, "<size=");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 100.0f, (-1.0f), 0.0f, 100.0f, 97.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "<size=");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray21 = new double[] { (-1.0d), 10.0d, 0.0f, (-1.0d), (short) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "<size=", doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), 10.0d, 0.0d, (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendFieldStart(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparator("{");
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeStartText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "=", (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str9, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setSummaryObjectEndText(",");
        toStringStyle0.setFieldSeparator("}");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "hi!", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setArrayStart("");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle18.setFieldNameValueSeparator("\n  ");
        boolean boolean21 = toStringStyle18.isArrayContentDetail();
        boolean boolean23 = toStringStyle18.isFullDetail((java.lang.Boolean) false);
        java.lang.String str24 = toStringStyle18.getFieldSeparator();
        toStringStyle18.setDefaultFullDetail(true);
        toStringStyle18.setUseClassName(true);
        toStringStyle18.setUseIdentityHashCode(false);
        java.lang.String str31 = toStringStyle18.getSizeStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer17, (java.lang.Object) str31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "181) test3800(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "}" + "'", str24, "}");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "," + "'", str31, ",");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = toStringStyle3.getContentStart();
        toStringStyle3.setArrayEnd("\n  ");
        boolean boolean7 = toStringStyle3.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) boolean9);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle16.setFieldSeparatorAtStart(true);
        java.lang.String str19 = toStringStyle16.getContentStart();
        toStringStyle16.setNullText(",");
        toStringStyle16.setFieldSeparatorAtStart(true);
        java.lang.String str24 = toStringStyle16.getArraySeparator();
        boolean boolean25 = toStringStyle16.isDefaultFullDetail();
        toStringStyle16.setContentStart("ToStringStyle.MultiLineToStringStyle");
        toStringStyle16.setFieldSeparatorAtEnd(false);
        boolean boolean30 = toStringStyle16.isFieldSeparatorAtStart();
        java.lang.String str31 = toStringStyle16.getArraySeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle32 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle32.setFieldNameValueSeparator("\n  ");
        toStringStyle32.setFieldNameValueSeparator("{");
        java.lang.String str37 = toStringStyle32.getFieldNameValueSeparator();
        boolean boolean38 = toStringStyle32.isUseIdentityHashCode();
        java.lang.String str39 = toStringStyle32.getSizeStartText();
        boolean boolean41 = toStringStyle32.isFullDetail((java.lang.Boolean) false);
        boolean boolean42 = toStringStyle32.isUseShortClassName();
        java.lang.Object[] objArray43 = new java.lang.Object[] { str31, toStringStyle32 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "[", objArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "182) test3801(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[" + "'", str19, "[");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str24, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str31, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{" + "'", str37, "{");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "," + "'", str39, ",");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArraySeparator("hi!");
        toStringStyle0.setFieldNameValueSeparator("=");
        toStringStyle0.setFieldNameValueSeparator("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str12 = toStringStyle0.getArrayEnd();
        toStringStyle0.setContentEnd("");
        java.lang.String str15 = toStringStyle0.getSizeEndText();
        boolean boolean16 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "ToStringStyle.DefaultToStringStyle", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<size=" + "'", str15, "<size=");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArraySeparator("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray15 = new double[] { (-1), 10L, 1.0d, 100.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "[", doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSummaryObjectStartText("}");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray16 = new float[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setArraySeparator("\n  ");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendFieldStart(stringBuffer7, "");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.MultiLineToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
// flaky "183) test3808(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldNameValueSeparator("hi!");
        java.lang.StringBuffer stringBuffer17 = null;
        int[] intArray19 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "", intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] {});
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        toStringStyle0.setContentStart("ToStringStyle.NoFieldNameToStringStyle");
        boolean boolean12 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setNullText("ToStringStyle.DefaultToStringStyle");
        boolean boolean18 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setArrayEnd("ToStringStyle.MultiLineToStringStyle");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseClassName(true);
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "hi!", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        toStringStyle0.setContentStart("ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSizeStartText("");
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray10 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.DefaultToStringStyle", longArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str1, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSummaryObjectEndText("}");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
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
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str14 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle16.setFieldSeparatorAtStart(true);
        java.lang.String str19 = toStringStyle16.getFieldSeparator();
        java.lang.String str20 = toStringStyle16.getFieldSeparator();
        toStringStyle16.setUseClassName(true);
        boolean boolean24 = toStringStyle16.isFullDetail((java.lang.Boolean) false);
        boolean boolean25 = toStringStyle16.isArrayContentDetail();
        boolean boolean26 = toStringStyle16.isFieldSeparatorAtStart();
        toStringStyle16.setSizeEndText("");
        java.lang.String str29 = toStringStyle16.getSummaryObjectEndText();
        java.lang.String str30 = toStringStyle16.getSummaryObjectEndText();
        toStringStyle16.setArrayEnd("ToStringStyle.SimpleToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer15, (java.lang.Object) "ToStringStyle.SimpleToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str1, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
// flaky "184) test3817(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "85) test3817(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[" + "'", str29, "[");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[" + "'", str30, "[");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = toStringStyle3.getContentStart();
        toStringStyle3.setArrayEnd("\n  ");
        boolean boolean7 = toStringStyle3.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) boolean9);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray16 = new boolean[] { false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "hi!", booleanArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str4, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { false, true });
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) 'a');
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeEndText("hi!");
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean15 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayContentDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str1, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.String str10 = toStringStyle0.getArraySeparator();
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<size=", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str10, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
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
        java.lang.String str15 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArraySeparator("ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str1, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "185) test3823(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "86) test3823(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str15, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        toStringStyle0.setUseShortClassName(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.Class<?> wildcardClass9 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str1, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str10 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        boolean boolean14 = toStringStyle0.isDefaultFullDetail();
        boolean boolean15 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str1, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str13 = toStringStyle12.getContentStart();
        boolean boolean14 = toStringStyle12.isUseFieldNames();
        boolean boolean15 = toStringStyle12.isUseShortClassName();
        toStringStyle12.setFieldSeparator("hi!");
        java.lang.String str18 = toStringStyle12.getContentStart();
        boolean boolean19 = toStringStyle12.isArrayContentDetail();
        boolean boolean20 = toStringStyle12.isFieldSeparatorAtEnd();
        java.lang.String str21 = toStringStyle12.getContentEnd();
        java.lang.String str22 = toStringStyle12.getSummaryObjectStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer11, (java.lang.Object) toStringStyle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str13, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str18, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<size=" + "'", str21, "<size=");
// flaky "186) test3828(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str22, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str1, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean15 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str16 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        boolean boolean14 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldSeparator("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "187) test3831(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
// flaky "87) test3831(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "188) test3832(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
// flaky "88) test3832(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray21 = new char[] { ' ', 'a', '4', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "ToStringStyle.SimpleToStringStyle", charArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "189) test3834(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ', 'a', '4', '4', ' ' });
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparator("<null>");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "190) test3835(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle12.setFieldSeparatorAtStart(true);
        java.lang.String str15 = toStringStyle12.getContentStart();
        toStringStyle12.setUseClassName(false);
        java.lang.String str18 = toStringStyle12.getSizeEndText();
        toStringStyle12.setUseFieldNames(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle12);
// flaky "191) test3836(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<size=" + "'", str18, "<size=");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
// flaky "192) test3838(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendToString(stringBuffer7, "<size=");
        toStringStyle0.setSummaryObjectStartText("=");
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendClassName(stringBuffer13, obj14);
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayStart("<null>");
        java.lang.String str19 = toStringStyle0.getContentEnd();
        toStringStyle0.setContentStart("ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "89) test3838(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "36) test3838(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<size=" + "'", str19, "<size=");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
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
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray20 = new int[] { 1, (byte) 100, (byte) -1, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "<size=", intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "193) test3839(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str1, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 100, (-1), 1, 10 });
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean12 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray21 = new char[] { '#', '4', 'a', '#', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "[", charArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "194) test3840(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
// flaky "90) test3840(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '#', '4', 'a', '#', '4', ' ' });
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray16 = new boolean[] { false, false, false, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.SimpleToStringStyle", booleanArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { false, false, false, true, true });
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
        boolean boolean13 = toStringStyle0.isUseFieldNames();
        boolean boolean14 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray23 = new boolean[] { true, true, false, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "", booleanArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "195) test3842(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str1, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(booleanArray23);
        assertBooleanArrayEquals(booleanArray23, new boolean[] { true, true, false, false, false, false });
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        toStringStyle0.setNullText("\n  ");
        toStringStyle0.setNullText("");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "196) test3843(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str1, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle9.setFieldNameValueSeparator("\n  ");
        toStringStyle9.setFieldNameValueSeparator("{");
        boolean boolean14 = toStringStyle9.isUseClassName();
        java.lang.String str15 = toStringStyle9.getSizeEndText();
        java.lang.String str16 = toStringStyle9.getFieldNameValueSeparator();
        toStringStyle9.setArraySeparator(">");
        toStringStyle9.setArraySeparator("{");
        java.lang.String str21 = toStringStyle9.getContentEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle22.setFieldNameValueSeparator("\n  ");
        toStringStyle22.setFieldNameValueSeparator("{");
        boolean boolean27 = toStringStyle22.isUseIdentityHashCode();
        toStringStyle22.setSummaryObjectStartText(">");
        toStringStyle22.setSizeEndText("=");
        toStringStyle22.setFieldSeparator("[");
        toStringStyle22.setFieldSeparator(">");
        toStringStyle22.setFieldNameValueSeparator("");
        toStringStyle22.setArrayContentDetail(true);
        java.lang.String str40 = toStringStyle22.getArraySeparator();
        toStringStyle22.setUseFieldNames(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str44 = toStringStyle43.getContentStart();
        boolean boolean45 = toStringStyle43.isUseFieldNames();
        java.lang.String str46 = toStringStyle43.getArrayStart();
        toStringStyle43.setFieldSeparator("");
        java.lang.String str49 = toStringStyle43.getSummaryObjectStartText();
        boolean boolean50 = toStringStyle43.isUseClassName();
        java.lang.String str51 = toStringStyle43.getNullText();
        java.lang.Object[] objArray52 = new java.lang.Object[] { toStringStyle9, toStringStyle22, str51 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<size=", objArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "=" + "'", str15, "=");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
// flaky "197) test3844(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<null>" + "'", str21, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{" + "'", str40, "{");
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str44, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "=" + "'", str49, "=");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "", byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "198) test3845(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str1, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle12.setArrayEnd("hi!");
        toStringStyle12.setFieldNameValueSeparator("[");
        java.lang.String str17 = toStringStyle12.getSizeStartText();
        toStringStyle12.setArrayEnd("ToStringStyle.MultiLineToStringStyle");
        toStringStyle12.setUseShortClassName(true);
        toStringStyle12.setDefaultFullDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str25 = toStringStyle24.getContentStart();
        boolean boolean26 = toStringStyle24.isUseFieldNames();
        boolean boolean27 = toStringStyle24.isUseShortClassName();
        toStringStyle24.setFieldSeparator("hi!");
        java.lang.String str30 = toStringStyle24.getContentStart();
        boolean boolean31 = toStringStyle24.isArrayContentDetail();
        toStringStyle24.setSummaryObjectEndText("[");
        java.lang.String str34 = toStringStyle24.getFieldSeparator();
        java.lang.String str35 = toStringStyle24.getArrayStart();
        toStringStyle24.setSizeEndText("");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle38 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle38.setFieldSeparatorAtStart(true);
        boolean boolean41 = toStringStyle38.isUseFieldNames();
        toStringStyle38.setUseIdentityHashCode(false);
        java.lang.String str44 = toStringStyle38.getSummaryObjectEndText();
        boolean boolean46 = toStringStyle38.isFullDetail((java.lang.Boolean) true);
        toStringStyle38.setSizeStartText("=");
        toStringStyle38.setUseFieldNames(false);
        java.lang.Object[] objArray51 = new java.lang.Object[] { toStringStyle12, "", false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "[", objArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "199) test3846(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str1, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "91) test3846(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<size=" + "'", str17, "<size=");
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str25, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str30, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[" + "'", str44, "[");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray15 = new float[] { (-1), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "hi!", floatArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { (-1.0f), 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "{", objArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "200) test3849(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str3, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSizeStartText("=");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "201) test3850(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str3, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "=");
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "\n  ", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.NoFieldNameToStringStyle", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
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
        short[] shortArray22 = new short[] { (byte) -1, (byte) 100, (short) 0, (byte) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "{", shortArray22);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) -1, (short) 100, (short) 0, (short) -1, (short) 1 });
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean16 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
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
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray21 = new char[] { ' ', 'a', ' ', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ",", charArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ', 'a', ' ', '4', '#' });
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
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
        boolean boolean19 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        toStringStyle0.setContentEnd("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray20 = new double[] { (short) 1, (short) -1, 10, (short) 0, 10L, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "", doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 10.0d, 0.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setSizeStartText("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray17 = new int[] { (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "\n  ", intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 0 });
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
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
        java.lang.String str12 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray20 = new double[] { (byte) -1, (byte) -1, (byte) 100, 100.0d, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.SimpleToStringStyle", doubleArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "202) test3861(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "92) test3861(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), (-1.0d), 100.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        toStringStyle8.setFieldSeparator("<size=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayEnd("}");
        boolean boolean12 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray16 = new long[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", longArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { (-1L) });
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str13 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=" + "'", str13, "=");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setArraySeparator(">");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
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
        toStringStyle0.setFieldSeparator("}");
        boolean boolean15 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.SimpleToStringStyle");
        java.lang.StringBuffer stringBuffer20 = null;
        short[] shortArray22 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, ">", shortArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "203) test3866(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] {});
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("<size=");
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "204) test3867(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseClassName(false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray15 = new boolean[] { false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ",", booleanArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { false, true, false });
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
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
        toStringStyle0.setArrayStart(",");
        java.lang.String str15 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray18 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, ">", floatArray18, (java.lang.Boolean) true);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<size=" + "'", str15, "<size=");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str7 = toStringStyle0.getContentEnd();
        toStringStyle0.setDefaultFullDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setArraySeparator(">");
        toStringStyle0.setArraySeparator("{");
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str11 = toStringStyle0.getArrayStart();
        boolean boolean12 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str11, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray18 = new float[] { (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "hi!", floatArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 10.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setFieldNameValueSeparator("");
        boolean boolean16 = toStringStyle0.isFieldSeparatorAtStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
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
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle22.setNullText(">");
        toStringStyle22.setSummaryObjectStartText("");
        java.lang.String str27 = toStringStyle22.getArrayEnd();
        toStringStyle22.setFieldSeparatorAtEnd(true);
        toStringStyle22.setUseIdentityHashCode(false);
        toStringStyle22.setContentEnd("ToStringStyle.DefaultToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) toStringStyle22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{" + "'", str17, "{");
        org.junit.Assert.assertNotNull(toStringStyle22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "}" + "'", str27, "}");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("[");
        boolean boolean13 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArraySeparator("{");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, ">", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer19, "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[" + "'", str18, "[");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
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
        boolean[] booleanArray22 = new boolean[] { false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "ToStringStyle.NoFieldNameToStringStyle", booleanArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertNotNull(booleanArray22);
        assertBooleanArrayEquals(booleanArray22, new boolean[] { false, true, false });
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        toStringStyle0.setSizeEndText(">");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray17 = new double[] { 100L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        java.lang.String str15 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ToStringStyle.MultiLineToStringStyle");
        java.lang.String str19 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer20 = null;
        float[] floatArray28 = new float[] { 10.0f, (byte) 0, 0L, (byte) -1, (-1), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, "=", floatArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 10.0f, 0.0f, 0.0f, (-1.0f), (-1.0f), 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        java.lang.String str18 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparator(",");
        toStringStyle0.setDefaultFullDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "205) test3883(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
// flaky "93) test3883(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n  " + "'", str18, "\n  ");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
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
        java.lang.String str15 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray21 = new float[] { 100, (short) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "[", floatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<size=" + "'", str15, "<size=");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 100.0f, 0.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.String str12 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "206) test3885(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setSizeEndText("\n  ");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "207) test3886(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSizeEndText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle13.setFieldSeparatorAtStart(true);
        java.lang.String str16 = toStringStyle13.getContentStart();
        toStringStyle13.setUseClassName(false);
        java.lang.String str19 = toStringStyle13.getSizeEndText();
        boolean boolean20 = toStringStyle13.isUseShortClassName();
        java.lang.String str21 = toStringStyle13.getArrayEnd();
        toStringStyle0.appendIdentityHashCode(stringBuffer12, (java.lang.Object) toStringStyle13);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str19, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        boolean boolean7 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setNullText("");
        toStringStyle0.setSizeStartText("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        boolean boolean12 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray17 = new long[] { (short) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "hi!", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 100L, 10L });
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setArrayStart("<size=");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseShortClassName(true);
        boolean boolean16 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<size=" + "'", str13, "<size=");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "}");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.SimpleToStringStyle");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.SimpleToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "208) test3893(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "[", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        toStringStyle0.setSummaryObjectStartText("\n  ");
        boolean boolean21 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayEnd("}");
        boolean boolean12 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "<null>", byteArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) -1 });
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setArrayEnd(",");
        boolean boolean7 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.Object[] objArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", objArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray11 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "ToStringStyle.DefaultToStringStyle", booleanArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { true, true });
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray12 = new short[] { (byte) -1, (short) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle", shortArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) -1, (short) 10, (short) 0 });
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
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
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer20, "[");
// flaky "209) test3900(org.apache.commons.lang3.builder.RegressionTest7)":             org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
// flaky "94) test3900(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<size=" + "'", str17, "<size=");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[" + "'", str18, "[");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str19, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setNullText("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
// flaky "210) test3902(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("hi!");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "=");
        toStringStyle0.setContentStart("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "211) test3903(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str6 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "ToStringStyle.SimpleToStringStyle", byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 100, (byte) 1 });
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparator("{");
        toStringStyle0.setContentStart("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparator("\n  ");
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setDefaultFullDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setContentEnd("{");
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray15 = new int[] { 0, 10, ' ', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "ToStringStyle.DefaultToStringStyle", intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 10, 32, 100 });
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
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
        java.lang.String str17 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str20 = toStringStyle19.getContentStart();
        boolean boolean21 = toStringStyle19.isUseFieldNames();
        java.lang.String str22 = toStringStyle19.getFieldSeparator();
        java.lang.String str23 = toStringStyle19.getContentEnd();
        boolean boolean24 = toStringStyle19.isArrayContentDetail();
        toStringStyle19.setNullText("[");
        toStringStyle19.setUseClassName(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer18, (java.lang.Object) toStringStyle19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "212) test3908(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str16, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[" + "'", str17, "[");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<null>" + "'", str20, "<null>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{" + "'", str23, "{");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray20 = new double[] { (byte) -1, '#', 10L, (short) 0, 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "=", doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 35.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setArraySeparator("<size=");
        toStringStyle0.setDefaultFullDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        boolean boolean16 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "213) test3911(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
// flaky "95) test3911(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray9 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, ">", charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeEndText("hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str15 = toStringStyle14.getSizeStartText();
        toStringStyle14.setContentStart("[");
        boolean boolean18 = toStringStyle14.isUseShortClassName();
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle14.appendSuper(stringBuffer19, "");
        boolean boolean22 = toStringStyle14.isUseClassName();
        boolean boolean23 = toStringStyle14.isFieldSeparatorAtEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer13, (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "=" + "'", str15, "=");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "214) test3913(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
        toStringStyle0.setSizeStartText("ToStringStyle.DefaultToStringStyle");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer22, "{", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "215) test3914(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
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
        java.lang.String str17 = toStringStyle0.getSizeStartText();
        java.lang.String str18 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "216) test3916(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setFieldSeparator("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "217) test3918(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str16, "ToStringStyle.DefaultToStringStyle");
// flaky "96) test3918(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<size=" + "'", str18, "<size=");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        toStringStyle0.setNullText(">");
        java.lang.String str12 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "218) test3919(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "=" + "'", str12, "=");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle19.setFieldSeparatorAtStart(true);
        java.lang.String str22 = toStringStyle19.getFieldSeparator();
        java.lang.String str23 = toStringStyle19.getFieldSeparator();
        boolean boolean24 = toStringStyle19.isUseIdentityHashCode();
        toStringStyle19.setSummaryObjectStartText("[");
        boolean boolean27 = toStringStyle19.isArrayContentDetail();
        toStringStyle19.setContentStart(">");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "", (java.lang.Object) toStringStyle19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "ToStringStyle.NoFieldNameToStringStyle", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "219) test3921(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        java.lang.String str11 = toStringStyle0.getSizeEndText();
        boolean boolean12 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setArrayStart("[");
        toStringStyle0.setFieldSeparator("}");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.String str14 = toStringStyle0.getNullText();
        java.lang.String str15 = toStringStyle0.getContentStart();
        java.lang.String str16 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str15, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.String str10 = toStringStyle0.getArraySeparator();
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSizeEndText(",");
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "}", byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.String str7 = toStringStyle0.getContentEnd();
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray11 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, ">", longArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "220) test3925(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
// flaky "97) test3925(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] {});
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str3 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle5.setFieldSeparatorAtStart(true);
        boolean boolean8 = toStringStyle5.isUseFieldNames();
        toStringStyle5.setUseIdentityHashCode(false);
        java.lang.String str11 = toStringStyle5.getSummaryObjectEndText();
        java.lang.String str12 = toStringStyle5.getArraySeparator();
        toStringStyle5.setArrayStart("hi!");
        java.lang.String str15 = toStringStyle5.getArrayEnd();
        toStringStyle5.setArrayContentDetail(true);
        toStringStyle0.appendClassName(stringBuffer4, (java.lang.Object) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "221) test3926(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "98) test3926(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<size=" + "'", str12, "<size=");
// flaky "37) test3926(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n  " + "'", str15, "\n  ");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseShortClassName(true);
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray19 = new double[] { 1.0f, 100.0f, 100L, (short) 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.DefaultToStringStyle", doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 100.0d, 100.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseShortClassName(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "222) test3928(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean15 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "\n  ");
        java.lang.String str19 = toStringStyle0.getFieldNameValueSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldNameValueSeparator("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str14 = toStringStyle0.getArrayStart();
        java.lang.String str15 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str15, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        boolean boolean12 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str13 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str14 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<size=" + "'", str14, "<size=");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setContentStart(",");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) 1.0f);
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str17 = toStringStyle16.getContentStart();
        boolean boolean18 = toStringStyle16.isUseFieldNames();
        java.lang.String str19 = toStringStyle16.getArrayStart();
        toStringStyle16.setFieldSeparator("");
        toStringStyle16.setContentStart("{");
        toStringStyle16.setUseFieldNames(false);
        toStringStyle16.setArrayContentDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer15, (java.lang.Object) toStringStyle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str12, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "<size=", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean12 = toStringStyle0.isArrayContentDetail();
        boolean boolean13 = toStringStyle0.isUseFieldNames();
        java.lang.String str14 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "223) test3937(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
// flaky "99) test3937(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
// flaky "38) test3937(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "13) test3937(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n  " + "'", str14, "\n  ");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
// flaky "224) test3938(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendToString(stringBuffer7, "<size=");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer12 = null;
// flaky "100) test3938(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendToString(stringBuffer12, "<null>");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer15, "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str15 = toStringStyle0.getContentStart();
        java.lang.Class<?> wildcardClass16 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "225) test3939(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
// flaky "101) test3939(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{" + "'", str15, "{");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "226) test3940(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str6, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer9 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "}", objMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objMap11);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        toStringStyle0.setContentEnd("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[" + "'", str17, "[");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
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
        java.lang.String str17 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "}", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{" + "'", str17, "{");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str11 = toStringStyle0.getContentEnd();
        java.lang.String str12 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str13 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "227) test3944(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "102) test3944(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str12 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray18 = new long[] { (byte) 10, 1L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "}", longArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 10L, 1L, 10L });
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
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
        java.lang.String str20 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer21, "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "228) test3946(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ">" + "'", str20, ">");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        java.lang.String str17 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer18, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ">" + "'", str17, ">");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        java.lang.String str8 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseFieldNames(true);
        toStringStyle0.setUseClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getArraySeparator();
        boolean boolean11 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer2 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer2, (java.lang.Object) (byte) 100);
        java.lang.String str5 = toStringStyle0.getContentEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str12 = toStringStyle0.getArrayEnd();
        java.lang.String str13 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.String str8 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray13 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "<size=", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { true });
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "", (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
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
        toStringStyle0.setSizeEndText("ToStringStyle.DefaultToStringStyle");
        java.lang.Class<?> wildcardClass20 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setNullText("[");
        boolean boolean13 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean14 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
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
        java.lang.String str15 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        boolean boolean8 = toStringStyle0.isUseClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setFieldSeparator("<null>");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "229) test3958(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer4 = null;
// flaky "230) test3959(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendToString(stringBuffer4, "=");
        java.lang.String str7 = toStringStyle0.getFieldSeparator();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle11.setFieldSeparatorAtStart(true);
        java.lang.String str14 = toStringStyle11.getFieldSeparator();
        java.lang.String str15 = toStringStyle11.getFieldSeparator();
        toStringStyle11.setSummaryObjectEndText("[");
        toStringStyle11.setContentEnd("<size=");
        boolean boolean20 = toStringStyle11.isDefaultFullDetail();
        boolean boolean21 = toStringStyle11.isFieldSeparatorAtStart();
        toStringStyle11.setContentEnd(",");
        toStringStyle11.setFieldSeparator("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", (java.lang.Object) toStringStyle11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "=" + "'", str8, "=");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.String str4 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean5 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer8 = null;
// flaky "231) test3960(org.apache.commons.lang3.builder.RegressionTest7)":         toStringStyle0.appendSuper(stringBuffer8, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "<size=", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setContentStart("");
        java.lang.StringBuffer stringBuffer5 = null;
        long[] longArray9 = new long[] { 1L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "{", longArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 1L, 100L });
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        char[] charArray14 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "{", charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "232) test3963(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str5 = toStringStyle0.getContentStart();
        java.lang.String str6 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray17 = new float[] { (-1), 10L, 10.0f, (byte) 10, (-1.0f), 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", floatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[" + "'", str2, "[");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { (-1.0f), 10.0f, 10.0f, 10.0f, (-1.0f), 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeStartText("=");
        boolean boolean10 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd("=");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str8 = toStringStyle7.getContentStart();
        boolean boolean9 = toStringStyle7.isUseFieldNames();
        boolean boolean10 = toStringStyle7.isUseShortClassName();
        toStringStyle7.setDefaultFullDetail(true);
        boolean boolean13 = toStringStyle7.isFieldSeparatorAtEnd();
        java.lang.String str14 = toStringStyle7.getArraySeparator();
        toStringStyle7.setSizeStartText("=");
        boolean boolean17 = toStringStyle7.isUseFieldNames();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer6, (java.lang.Object) toStringStyle7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<size=" + "'", str14, "<size=");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("hi!");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle13.setFieldNameValueSeparator("\n  ");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer12, (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "=", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectEndText("hi!");
        toStringStyle0.setArrayStart("");
        toStringStyle0.setUseIdentityHashCode(true);
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setContentEnd("ToStringStyle.DefaultToStringStyle");
        java.lang.String str12 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
// flaky "233) test3971(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str12, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setSummaryObjectStartText("\n  ");
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle15.setNullText(">");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle15.appendSuper(stringBuffer18, "=");
        toStringStyle15.setArrayContentDetail(true);
        toStringStyle15.setUseShortClassName(true);
        toStringStyle15.setArrayEnd("}");
        boolean boolean27 = toStringStyle15.isUseFieldNames();
        boolean boolean28 = toStringStyle15.isDefaultFullDetail();
        toStringStyle15.setArraySeparator("");
        boolean boolean31 = toStringStyle15.isUseFieldNames();
        toStringStyle0.appendIdentityHashCode(stringBuffer14, (java.lang.Object) boolean31);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setSummaryObjectStartText("\n  ");
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.NoFieldNameToStringStyle");
        boolean boolean14 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray19 = new float[] { (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "<null>", floatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, ",");
        toStringStyle0.setArraySeparator("\n  ");
        toStringStyle0.setContentEnd("[");
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray22 = new float[] { 100.0f, 1.0f, (short) 10, (short) 100, 100L, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "", floatArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 100.0f, 1.0f, 10.0f, 100.0f, 100.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str14 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer15 = null;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "}", byteArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer17 = null;
        float[] floatArray24 = new float[] { (short) 1, 10, 10L, (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "hi!", floatArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setContentStart(",");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "", (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean15 = toStringStyle14.isUseShortClassName();
        boolean boolean16 = toStringStyle14.isUseFieldNames();
        toStringStyle14.setFieldSeparatorAtEnd(false);
        boolean boolean19 = toStringStyle14.isUseClassName();
        toStringStyle14.setContentStart(",");
        toStringStyle0.appendClassName(stringBuffer13, (java.lang.Object) ",");
        java.lang.StringBuffer stringBuffer23 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str26 = toStringStyle25.getContentStart();
        boolean boolean27 = toStringStyle25.isUseFieldNames();
        boolean boolean28 = toStringStyle25.isUseShortClassName();
        toStringStyle25.setFieldSeparator("hi!");
        toStringStyle25.setNullText("");
        boolean boolean33 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle25);
        toStringStyle25.setUseShortClassName(true);
        java.lang.String str36 = toStringStyle25.getArrayStart();
        java.lang.String str37 = toStringStyle25.getSizeEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer23, "[", (java.lang.Object) str37, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "," + "'", str26, ",");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str37, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setUseClassName(false);
        toStringStyle0.setUseShortClassName(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str7, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle12.setFieldNameValueSeparator("\n  ");
        toStringStyle12.setFieldNameValueSeparator("{");
        boolean boolean17 = toStringStyle12.isUseIdentityHashCode();
        java.lang.String str18 = toStringStyle12.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle20.setFieldSeparatorAtStart(true);
        boolean boolean23 = toStringStyle20.isUseFieldNames();
        toStringStyle20.setUseIdentityHashCode(false);
        toStringStyle20.setFieldNameValueSeparator("");
        toStringStyle12.appendIdentityHashCode(stringBuffer19, (java.lang.Object) toStringStyle20);
        toStringStyle12.setArrayContentDetail(true);
        java.lang.String str31 = toStringStyle12.getArrayEnd();
        toStringStyle0.appendClassName(stringBuffer11, (java.lang.Object) toStringStyle12);
        java.lang.StringBuffer stringBuffer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle12.append(stringBuffer33, "<null>", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str18, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        java.lang.String str3 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "ToStringStyle.NoFieldNameToStringStyle", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray10 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "\n  ", intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] {});
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        java.lang.String str16 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayStart("<null>");
        java.lang.String str19 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle22.setFieldNameValueSeparator("\n  ");
        toStringStyle22.setFieldNameValueSeparator("{");
        toStringStyle22.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer29 = null;
        toStringStyle22.appendIdentityHashCode(stringBuffer29, (java.lang.Object) 1.0f);
        toStringStyle22.setFieldNameValueSeparator(">");
        java.lang.String str34 = toStringStyle22.getContentEnd();
        java.lang.String str35 = toStringStyle22.getContentEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer20, "}", (java.lang.Object) toStringStyle22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle22);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayEnd("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer10, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
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
        toStringStyle0.setArrayEnd("<size=");
        toStringStyle0.setFieldNameValueSeparator("=");
        java.lang.StringBuffer stringBuffer21 = null;
        char[] charArray26 = new char[] { '4', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer21, "<null>", charArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
// flaky "234) test3988(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str14, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', 'a', '4' });
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray18 = new long[] { 1, 100L, (short) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "[", longArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 1L, 100L, 0L, 10L });
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
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
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle22.setFieldSeparatorAtStart(true);
        boolean boolean25 = toStringStyle22.isUseFieldNames();
        toStringStyle22.setUseIdentityHashCode(false);
        java.lang.String str28 = toStringStyle22.getSummaryObjectEndText();
        boolean boolean30 = toStringStyle22.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle22);
        java.lang.String str32 = toStringStyle22.getSizeStartText();
        java.lang.String str33 = toStringStyle22.getArrayStart();
        boolean boolean34 = toStringStyle22.isFieldSeparatorAtEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle13.reflectionAppendArrayDetail(stringBuffer20, "<size=", (java.lang.Object) toStringStyle22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "," + "'", str33, ",");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        boolean boolean14 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setFieldSeparator("ToStringStyle.MultiLineToStringStyle");
        boolean boolean18 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "235) test3991(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getNullText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) str1);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
        java.lang.String str16 = toStringStyle2.getFieldNameValueSeparator();
        toStringStyle2.setArrayContentDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
// flaky "236) test3993(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str14, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
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
        java.lang.String str17 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str20 = toStringStyle19.getContentStart();
        boolean boolean21 = toStringStyle19.isUseFieldNames();
        java.lang.String str22 = toStringStyle19.getFieldSeparator();
        java.lang.String str23 = toStringStyle19.getContentEnd();
        boolean boolean24 = toStringStyle19.isFieldSeparatorAtEnd();
        toStringStyle19.setArrayEnd("[");
        toStringStyle0.appendIdentityHashCode(stringBuffer18, (java.lang.Object) "[");
        java.lang.StringBuffer stringBuffer28 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle29 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle29.setFieldSeparatorAtStart(true);
        boolean boolean32 = toStringStyle29.isUseFieldNames();
        toStringStyle29.setUseIdentityHashCode(false);
        java.lang.String str35 = toStringStyle29.getSummaryObjectEndText();
        boolean boolean37 = toStringStyle29.isFullDetail((java.lang.Boolean) false);
        toStringStyle29.setUseFieldNames(false);
        toStringStyle29.setSummaryObjectStartText("");
        java.lang.String str42 = toStringStyle29.getFieldNameValueSeparator();
        java.lang.String str43 = toStringStyle29.getSizeStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer28, (java.lang.Object) str43);
// flaky "237) test3994(org.apache.commons.lang3.builder.RegressionTest7)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "103) test3994(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "," + "'", str20, ",");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
// flaky "39) test3994(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "," + "'", str23, ",");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(toStringStyle29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "," + "'", str42, ",");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setNullText("=");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.DefaultToStringStyle", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setSizeEndText("=");
        java.lang.String str12 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "238) test3996(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("=");
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) "=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "239) test3997(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
// flaky "104) test3997(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.String str8 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, ",", (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray17 = new long[] { (short) -1, 0, 100L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "{", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
// flaky "240) test4000(org.apache.commons.lang3.builder.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { (-1L), 0L, 100L, 100L });
    }
}
