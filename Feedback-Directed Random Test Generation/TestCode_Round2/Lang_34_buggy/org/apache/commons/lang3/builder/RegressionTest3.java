package org.apache.commons.lang3.builder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "1) test1501(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "1) test1501(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "1) test1501(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "1) test1501(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "{", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray18 = new char[] { '#', 'a', '4', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "<null>", charArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "2) test1503(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "2) test1503(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', 'a', '4', 'a', '4' });
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "<null>", objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "3) test1504(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "3) test1504(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "2) test1504(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
// flaky "2) test1504(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "1) test1504(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "4) test1505(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "4) test1505(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str8, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray15 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "=", longArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "5) test1506(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "5) test1506(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "3) test1506(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
// flaky "3) test1506(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] {});
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "6) test1507(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "6) test1507(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer4, "hi!", (java.lang.Object) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "7) test1508(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectEndText(",");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = toStringStyle13.getContentStart();
        boolean boolean15 = toStringStyle13.isUseFieldNames();
        boolean boolean16 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setFieldSeparator("hi!");
        toStringStyle13.setNullText("");
        boolean boolean21 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle13);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", (java.lang.Object) toStringStyle13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "8) test1509(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "7) test1509(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "4) test1509(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<null>" + "'", str14, "<null>");
// flaky "4) test1509(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
            toStringStyle0.removeLastFieldSeparator(stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "9) test1510(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd("=");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, ">", (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "10) test1511(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ">", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "11) test1512(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
// flaky "8) test1512(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "5) test1512(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("[");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        boolean boolean14 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer17 = null;
        boolean[] booleanArray21 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "", booleanArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "12) test1513(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "9) test1513(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
// flaky "6) test1513(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "5) test1513(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { false, false });
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray14 = new char[] { '#', ' ', ' ', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, ">", charArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "13) test1514(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "10) test1514(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "7) test1514(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "6) test1514(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', ' ', '#', ' ' });
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray14 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, ">", shortArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "14) test1515(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "11) test1515(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] {});
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray15 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.DefaultToStringStyle", floatArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "15) test1516(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
// flaky "12) test1516(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
// flaky "8) test1516(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.DefaultToStringStyle", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle9.setFieldNameValueSeparator("\n  ");
        toStringStyle9.setFieldNameValueSeparator("{");
        boolean boolean14 = toStringStyle9.isUseIdentityHashCode();
        toStringStyle9.setArraySeparator("[");
        toStringStyle9.setSummaryObjectStartText("\n  ");
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle20.setFieldSeparatorAtStart(true);
        java.lang.String str23 = toStringStyle20.getFieldSeparator();
        java.lang.String str24 = toStringStyle20.getFieldSeparator();
        toStringStyle20.setSummaryObjectEndText("[");
        java.lang.String str27 = toStringStyle20.getSizeEndText();
        toStringStyle20.setUseShortClassName(false);
// flaky "16) test1518(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle9.appendClassName(stringBuffer19, (java.lang.Object) toStringStyle20);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object) toStringStyle20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "13) test1518(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "9) test1518(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
// flaky "7) test1518(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n  " + "'", str27, "\n  ");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setContentStart("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray16 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.MultiLineToStringStyle", booleanArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "17) test1519(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky "14) test1519(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str8, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setFieldSeparator("}");
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "18) test1520(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "19) test1521(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
// flaky "15) test1521(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "10) test1521(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{" + "'", str9, "{");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
// flaky "20) test1522(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendFieldStart(stringBuffer17, "=");
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer20, "\n  ", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "16) test1522(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
// flaky "11) test1522(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle7.setFieldNameValueSeparator("\n  ");
        toStringStyle7.setFieldNameValueSeparator("{");
        boolean boolean12 = toStringStyle7.isUseIdentityHashCode();
        java.lang.String str13 = toStringStyle7.getFieldNameValueSeparator();
        toStringStyle7.setFieldNameValueSeparator("{");
        toStringStyle7.setContentEnd(">");
        java.lang.String str18 = toStringStyle7.getFieldSeparator();
        java.lang.String str19 = toStringStyle7.getSummaryObjectEndText();
        java.lang.String str20 = toStringStyle7.getArraySeparator();
        java.lang.String str21 = toStringStyle7.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer5, "\n  ", (java.lang.Object) str21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "21) test1523(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "17) test1523(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "}" + "'", str18, "}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "," + "'", str19, ",");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[" + "'", str20, "[");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str5 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "22) test1524(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendSuper(stringBuffer6, "[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray15 = new int[] { 100, (short) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "", intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "23) test1525(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "18) test1525(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "12) test1525(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{" + "'", str9, "{");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 100, 10, 0 });
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray17 = new boolean[] { true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "{", booleanArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "24) test1526(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "19) test1526(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
// flaky "13) test1526(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { true, false, false });
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "}", byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "25) test1527(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str9 = toStringStyle8.getContentStart();
        boolean boolean10 = toStringStyle8.isUseFieldNames();
        boolean boolean11 = toStringStyle8.isUseShortClassName();
        toStringStyle8.setFieldSeparator("hi!");
        java.lang.String str14 = toStringStyle8.getContentStart();
        boolean boolean15 = toStringStyle8.isArrayContentDetail();
        boolean boolean16 = toStringStyle8.isFieldSeparatorAtEnd();
        toStringStyle8.setSizeStartText("=");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer6, "hi!", (java.lang.Object) "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "26) test1528(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "20) test1528(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str9, "ToStringStyle.MultiLineToStringStyle");
// flaky "14) test1528(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
// flaky "8) test1528(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
            toStringStyle0.append(stringBuffer14, "\n  ", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "27) test1529(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("[");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ">", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer14 = null;
        int[] intArray21 = new int[] { 1, (byte) 1, (byte) 100, 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ",", intArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 1, 1, 100, 10, 97 });
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str14 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle17.setFieldSeparatorAtStart(true);
        boolean boolean20 = toStringStyle17.isUseFieldNames();
        toStringStyle17.setUseIdentityHashCode(false);
        java.lang.String str23 = toStringStyle17.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle17);
        toStringStyle17.setSizeEndText("\n  ");
        boolean boolean27 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle17);
        boolean boolean28 = toStringStyle17.isUseClassName();
        java.lang.String str29 = toStringStyle17.getArrayStart();
        java.lang.StringBuffer stringBuffer30 = null;
        toStringStyle17.appendToString(stringBuffer30, "=");
        toStringStyle17.setContentEnd("}");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, ">", (java.lang.Object) "}", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "28) test1532(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "=" + "'", str23, "=");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = toStringStyle9.getContentStart();
        boolean boolean11 = toStringStyle9.isUseFieldNames();
        boolean boolean12 = toStringStyle9.isUseShortClassName();
        toStringStyle9.setFieldSeparator("hi!");
        toStringStyle9.setNullText("");
        toStringStyle9.setContentEnd("");
        java.lang.String str19 = toStringStyle9.getSummaryObjectStartText();
// flaky "29) test1533(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendClassName(stringBuffer8, (java.lang.Object) str19);
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer21, "hi!", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str10, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "=" + "'", str19, "=");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeEndText("");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "=", (double) (short) -1);
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
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str10 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray18 = new double[] { (-1.0d), 100L, (byte) 10, (-1L), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.DefaultToStringStyle", doubleArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "30) test1535(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str10, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 100.0d, 10.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.String str12 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "31) test1536(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("\n  ");
        toStringStyle10.setFieldNameValueSeparator("{");
        boolean boolean15 = toStringStyle10.isUseIdentityHashCode();
        java.lang.String str16 = toStringStyle10.getSummaryObjectEndText();
        java.lang.String str17 = toStringStyle10.getSummaryObjectStartText();
        boolean boolean19 = toStringStyle10.isFullDetail((java.lang.Boolean) false);
        java.lang.String str20 = toStringStyle10.getSummaryObjectEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer9, (java.lang.Object) str20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "32) test1538(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "21) test1538(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
// flaky "15) test1538(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + ">" + "'", str17, ">");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "," + "'", str20, ",");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "33) test1539(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "22) test1539(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        java.lang.StringBuffer stringBuffer14 = null;
        int[] intArray18 = new int[] { 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "{", intArray18);
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, 100 });
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray20 = new char[] { '#', '4', 'a', '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle", charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '4', 'a', '4', '#', '#' });
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "34) test1543(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
// flaky "23) test1543(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, ">", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "35) test1544(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        toStringStyle0.setArraySeparator("<size=");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle18.setFieldSeparatorAtStart(true);
        java.lang.String str21 = toStringStyle18.getFieldSeparator();
        java.lang.String str22 = toStringStyle18.getFieldSeparator();
        toStringStyle18.setUseClassName(true);
        boolean boolean26 = toStringStyle18.isFullDetail((java.lang.Boolean) false);
        boolean boolean27 = toStringStyle18.isArrayContentDetail();
        boolean boolean28 = toStringStyle18.isFieldSeparatorAtStart();
        toStringStyle18.setUseFieldNames(true);
        toStringStyle18.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer33 = null;
        toStringStyle18.appendToString(stringBuffer33, "ToStringStyle.DefaultToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer16, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) toStringStyle18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "36) test1545(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "24) test1545(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
// flaky "16) test1545(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setUseClassName(true);
        java.lang.String str15 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "37) test1546(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "25) test1546(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        char[] charArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.NoFieldNameToStringStyle", charArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "38) test1547(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer14, ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "39) test1548(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        toStringStyle0.setSummaryObjectStartText("}");
        boolean boolean19 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer20 = null;
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "", byteArray27, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean10 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        long[] longArray20 = new long[] { 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "", longArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "40) test1551(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
// flaky "26) test1551(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
// flaky "17) test1551(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "9) test1551(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 10L, 97L });
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "<size=", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "41) test1552(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer18 = null;
        char[] charArray20 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "}", charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "42) test1553(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str26 = toStringStyle25.getContentStart();
        toStringStyle25.setArrayEnd("\n  ");
        boolean boolean29 = toStringStyle25.isUseShortClassName();
        java.lang.String str30 = toStringStyle25.getSizeEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle11.appendCyclicObject(stringBuffer23, ">", (java.lang.Object) str30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "43) test1555(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
// flaky "27) test1555(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "18) test1555(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "10) test1555(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "=" + "'", str17, "=");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{" + "'", str18, "{");
        org.junit.Assert.assertNotNull(toStringStyle25);
// flaky "2) test1555(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "}" + "'", str26, "}");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "44) test1556(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendFieldStart(stringBuffer6, ">");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray20 = new float[] { 1L, '#', (byte) 10, '4', 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "", floatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "28) test1556(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
// flaky "19) test1556(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, 35.0f, 10.0f, 52.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.String str8 = toStringStyle0.getContentStart();
        toStringStyle0.setSizeStartText("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "45) test1557(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "ToStringStyle.DefaultToStringStyle", (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "46) test1558(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        toStringStyle0.setContentStart("}");
        toStringStyle0.setNullText(",");
        java.lang.String str15 = toStringStyle0.getContentStart();
        boolean boolean16 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "47) test1559(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "29) test1559(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "=", (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
            toStringStyle0.append(stringBuffer14, "", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        long[] longArray19 = new long[] { 10L, (-1), 100, 1L, (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, ",", longArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 10L, (-1L), 100L, 1L, (-1L), 10L });
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeEndText("hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, ">");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) 1.0f);
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer13, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        java.lang.String str13 = toStringStyle0.getSummaryObjectStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        boolean boolean12 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("");
        java.lang.StringBuffer stringBuffer15 = null;
        char[] charArray22 = new char[] { 'a', ' ', '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "", charArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "48) test1566(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a', ' ', '4', '#', '#' });
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayStart();
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<null>", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "49) test1567(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer10 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "<size=", objMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "50) test1568(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objMap12);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray21 = new double[] { 10L, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, ">", doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "51) test1569(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.String str12 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "52) test1570(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "30) test1570(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str13 = toStringStyle12.getContentStart();
        boolean boolean14 = toStringStyle12.isUseFieldNames();
        java.lang.String str15 = toStringStyle12.getFieldSeparator();
        java.lang.String str16 = toStringStyle12.getContentEnd();
        boolean boolean17 = toStringStyle12.isFieldSeparatorAtEnd();
        toStringStyle12.setArrayEnd("[");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "=", (java.lang.Object) toStringStyle12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "53) test1571(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        toStringStyle0.setContentStart("<size=");
        java.lang.String str16 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer17 = null;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "}", byteArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "54) test1572(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        java.lang.String str10 = toStringStyle0.getArrayStart();
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "55) test1573(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "31) test1573(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "20) test1573(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str10, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        boolean boolean14 = toStringStyle0.isUseClassName();
        java.lang.String str15 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "56) test1574(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "32) test1574(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str15, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray14 = new float[] { 10.0f, (byte) 10, (byte) -1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "\n  ", floatArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 10.0f, 10.0f, (-1.0f), (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setNullText("\n  ");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle11.setFieldSeparatorAtStart(true);
        java.lang.String str14 = toStringStyle11.getFieldSeparator();
        java.lang.String str15 = toStringStyle11.getFieldSeparator();
        toStringStyle11.setUseClassName(true);
        boolean boolean19 = toStringStyle11.isFullDetail((java.lang.Boolean) false);
        boolean boolean20 = toStringStyle11.isArrayContentDetail();
        boolean boolean21 = toStringStyle11.isFieldSeparatorAtStart();
        toStringStyle11.setSizeEndText("");
        java.lang.String str24 = toStringStyle11.getSummaryObjectEndText();
        java.lang.String str25 = toStringStyle11.getSummaryObjectEndText();
        java.lang.String str26 = toStringStyle11.getFieldNameValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer10, (java.lang.Object) str26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "57) test1576(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[" + "'", str24, "[");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[" + "'", str25, "[");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "," + "'", str26, ",");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "58) test1577(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
// flaky "33) test1577(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "21) test1577(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "11) test1577(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "[", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "59) test1578(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
// flaky "34) test1578(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "22) test1578(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "12) test1578(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<size=" + "'", str5, "<size=");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "60) test1579(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "35) test1579(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseClassName();
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
// flaky "61) test1580(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setNullText("<size=");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "ToStringStyle.DefaultToStringStyle", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle10.setFieldSeparatorAtStart(true);
        java.lang.String str13 = toStringStyle10.getFieldSeparator();
        java.lang.String str14 = toStringStyle10.getFieldSeparator();
        toStringStyle10.setUseClassName(true);
        boolean boolean18 = toStringStyle10.isFullDetail((java.lang.Boolean) false);
        boolean boolean19 = toStringStyle10.isArrayContentDetail();
        boolean boolean20 = toStringStyle10.isFieldSeparatorAtStart();
        toStringStyle10.setUseIdentityHashCode(false);
        java.lang.String str23 = toStringStyle10.getFieldNameValueSeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle24.setFieldSeparatorAtStart(true);
        java.lang.String str27 = toStringStyle24.getFieldSeparator();
        java.lang.String str28 = toStringStyle24.getFieldSeparator();
        toStringStyle24.setUseClassName(true);
        boolean boolean32 = toStringStyle24.isFullDetail((java.lang.Boolean) false);
        boolean boolean33 = toStringStyle24.isArrayContentDetail();
        boolean boolean34 = toStringStyle24.isFieldSeparatorAtStart();
        java.lang.String str35 = toStringStyle24.getNullText();
        boolean boolean36 = toStringStyle24.isFieldSeparatorAtEnd();
        java.lang.Object[] objArray37 = new java.lang.Object[] { toStringStyle10, toStringStyle24 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.NoFieldNameToStringStyle", objArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "62) test1583(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "36) test1583(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "," + "'", str23, ",");
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<size=" + "'", str35, "<size=");
// flaky "23) test1583(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ">", (double) 10.0f);
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
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray11 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "{", shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.Object obj0 = null;
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered(obj0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "}", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "63) test1587(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        boolean boolean18 = toStringStyle0.isUseClassName();
        boolean boolean19 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "64) test1588(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ">" + "'", str17, ">");
// flaky "37) test1588(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "24) test1588(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "{", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "65) test1589(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str10 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray14 = new long[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, ",", longArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "66) test1590(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 0L });
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
            toStringStyle0.appendDetail(stringBuffer15, ",", (byte) 100);
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
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray13 = new float[] { (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "{", floatArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 1.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle9.setFieldNameValueSeparator("\n  ");
        toStringStyle9.setFieldNameValueSeparator("{");
        boolean boolean14 = toStringStyle9.isUseIdentityHashCode();
        toStringStyle9.setSummaryObjectStartText(">");
        toStringStyle9.setSizeEndText("=");
        toStringStyle9.setFieldSeparator("[");
        toStringStyle9.setDefaultFullDetail(false);
        boolean boolean23 = toStringStyle9.isDefaultFullDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer8, (java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "67) test1594(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
// flaky "38) test1594(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "25) test1594(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle12.setFieldSeparatorAtStart(true);
        java.lang.String str15 = toStringStyle12.getFieldSeparator();
        java.lang.String str16 = toStringStyle12.getFieldSeparator();
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle18.setFieldSeparatorAtStart(true);
        boolean boolean21 = toStringStyle18.isUseFieldNames();
        toStringStyle18.setUseIdentityHashCode(false);
        java.lang.String str24 = toStringStyle18.getSummaryObjectEndText();
        boolean boolean26 = toStringStyle18.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle18);
        java.lang.String str28 = toStringStyle18.getSizeStartText();
        toStringStyle12.appendIdentityHashCode(stringBuffer17, (java.lang.Object) toStringStyle18);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer10, "hi!", (java.lang.Object) toStringStyle18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle18);
// flaky "68) test1595(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[" + "'", str24, "[");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "=" + "'", str28, "=");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle11.setFieldSeparatorAtStart(true);
        boolean boolean14 = toStringStyle11.isUseFieldNames();
        toStringStyle11.setUseIdentityHashCode(false);
        toStringStyle11.setFieldNameValueSeparator("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "\n  ", (java.lang.Object) toStringStyle11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "69) test1596(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setNullText("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str11 = toStringStyle10.getContentStart();
        boolean boolean12 = toStringStyle10.isUseFieldNames();
        boolean boolean13 = toStringStyle10.isFieldSeparatorAtEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "}", (java.lang.Object) boolean13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "70) test1598(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "39) test1598(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "26) test1598(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldSeparator("");
        boolean boolean15 = toStringStyle0.isUseClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setContentEnd(",");
        java.lang.StringBuffer stringBuffer8 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "{", objMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "71) test1600(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "40) test1600(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "27) test1600(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
            toStringStyle0.appendContentEnd(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        java.lang.String str10 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer11, "\n  ", obj13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "<size=", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "72) test1604(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "41) test1604(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "28) test1604(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle2.setFieldNameValueSeparator("\n  ");
        toStringStyle2.setFieldNameValueSeparator("{");
        boolean boolean7 = toStringStyle2.isUseIdentityHashCode();
        java.lang.String str8 = toStringStyle2.getFieldNameValueSeparator();
        java.lang.String str9 = toStringStyle2.getFieldSeparator();
        toStringStyle0.appendIdentityHashCode(stringBuffer1, (java.lang.Object) str9);
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray15 = new int[] { (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "=", intArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1), 1 });
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart(">");
        toStringStyle0.setContentEnd("{");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "73) test1606(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "42) test1606(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        boolean boolean7 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle12.setFieldSeparatorAtStart(true);
        boolean boolean15 = toStringStyle12.isUseFieldNames();
        java.lang.String str16 = toStringStyle12.getArrayStart();
        boolean boolean17 = toStringStyle12.isFieldSeparatorAtStart();
        boolean boolean18 = toStringStyle12.isUseIdentityHashCode();
        boolean boolean19 = toStringStyle12.isUseIdentityHashCode();
        toStringStyle12.setContentEnd("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, ">", (java.lang.Object) toStringStyle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "74) test1607(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "43) test1607(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle12);
// flaky "29) test1607(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.MultiLineToStringStyle", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "75) test1608(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "44) test1608(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "30) test1608(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        boolean boolean20 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "76) test1609(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = toStringStyle3.getContentStart();
        toStringStyle3.setArrayEnd("\n  ");
        boolean boolean7 = toStringStyle3.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) boolean9);
        toStringStyle0.setNullText("[");
        java.lang.Class<?> wildcardClass13 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
// flaky "77) test1610(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        boolean boolean4 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "78) test1611(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray19 = new char[] { 'a', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "79) test1612(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "45) test1612(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
// flaky "31) test1612(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', ' ', 'a' });
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray15 = new double[] { (-1), 1L, 10, 0L, 0L, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", doubleArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 10.0d, 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSizeEndText("hi!");
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str12 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.DefaultToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "80) test1614(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str7, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        float[] floatArray17 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "{", floatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "81) test1615(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "46) test1615(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
// flaky "32) test1615(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
// flaky "13) test1615(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n  " + "'", str14, "\n  ");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        long[] longArray20 = new long[] { (short) 0, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "hi!", longArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "82) test1616(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "47) test1616(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 0L, (-1L) });
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray14 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "hi!", longArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "83) test1617(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
// flaky "48) test1617(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        toStringStyle0.setNullText("\n  ");
        toStringStyle0.setNullText("");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "\n  ", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray19 = new char[] { 'a', '4', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "", charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a', '4', '4', ' ' });
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "84) test1620(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        toStringStyle0.setContentStart(">");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) ">");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "\n  ", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        toStringStyle17.setFieldSeparator(">");
        toStringStyle17.setFieldNameValueSeparator("");
        boolean boolean33 = toStringStyle17.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle34 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle34.setFieldSeparatorAtStart(true);
        toStringStyle34.setUseIdentityHashCode(true);
        toStringStyle34.setNullText("[");
        toStringStyle34.setSizeEndText("=");
        java.lang.Object[] objArray43 = new java.lang.Object[] { toStringStyle17, "=" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "\n  ", objArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "85) test1623(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(toStringStyle34);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray11 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "", byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer4, "=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, ">", byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "86) test1626(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "49) test1626(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        boolean boolean8 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray15 = new boolean[] { true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.NoFieldNameToStringStyle", booleanArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "87) test1627(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true, false, false, true });
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setNullText("\n  ");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str6 = toStringStyle0.getContentStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "88) test1629(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "50) test1629(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "89) test1630(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "51) test1630(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getNullText();
        java.lang.String str5 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle7.setFieldSeparatorAtStart(true);
        boolean boolean10 = toStringStyle7.isUseFieldNames();
        java.lang.String str11 = toStringStyle7.getArrayStart();
        boolean boolean12 = toStringStyle7.isFieldSeparatorAtStart();
        boolean boolean13 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle7);
        toStringStyle7.setContentStart("{");
// flaky "90) test1631(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendIdentityHashCode(stringBuffer6, (java.lang.Object) "{");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "ToStringStyle.MultiLineToStringStyle", (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "52) test1631(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str5, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "33) test1631(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "}", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "91) test1632(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
// flaky "53) test1632(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "<null>", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "[", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str13 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "92) test1635(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "54) test1635(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<size=", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle15.setFieldSeparatorAtStart(true);
        java.lang.String str18 = toStringStyle15.getFieldSeparator();
        java.lang.String str19 = toStringStyle15.getFieldSeparator();
        toStringStyle15.setUseIdentityHashCode(false);
        java.lang.String str22 = toStringStyle15.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "", (java.lang.Object) toStringStyle15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "93) test1637(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer15 = null;
        int[] intArray20 = new int[] { (byte) 1, 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "", intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "94) test1638(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 100, 1 });
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean6 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setContentStart("ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "95) test1640(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray11 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ",", charArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str1, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "96) test1641(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#' });
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendSuper(stringBuffer8, ">");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str1, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer1, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendSuper(stringBuffer11, "=");
        toStringStyle0.setContentEnd("\n  ");
        java.lang.String str16 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str1, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "97) test1644(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n  " + "'", str16, "\n  ");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle0.appendSuper(stringBuffer11, "=");
        toStringStyle0.setContentEnd("\n  ");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer16, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "98) test1645(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "55) test1645(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        java.lang.String str2 = toStringStyle0.getSummaryObjectStartText();
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "99) test1646(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
// flaky "56) test1646(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean10 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer11, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "100) test1647(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str11 = toStringStyle0.getContentStart();
        java.lang.String str12 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str16 = toStringStyle15.getContentStart();
        boolean boolean17 = toStringStyle15.isUseFieldNames();
        boolean boolean18 = toStringStyle15.isUseShortClassName();
        toStringStyle15.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle15.appendFieldStart(stringBuffer21, ">");
        java.lang.Class<?> wildcardClass24 = toStringStyle15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "[", (java.lang.Object) toStringStyle15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "101) test1648(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n  " + "'", str12, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "57) test1648(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray15 = new short[] { (byte) 1, (short) 0, (short) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.NoFieldNameToStringStyle", shortArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "102) test1649(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 1, (short) 0, (short) 100, (short) -1 });
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        java.lang.String str14 = toStringStyle0.getArrayStart();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer2 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, ">", byteArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setContentEnd("\n  ");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
            toStringStyle0.appendDetail(stringBuffer15, "{", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "103) test1653(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "{", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "104) test1654(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        toStringStyle0.setContentEnd("hi!");
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle20.setFieldNameValueSeparator("\n  ");
        toStringStyle20.setFieldNameValueSeparator("{");
        boolean boolean25 = toStringStyle20.isUseIdentityHashCode();
        java.lang.String str26 = toStringStyle20.getFieldNameValueSeparator();
        toStringStyle20.setSizeStartText("<size=");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer19, (java.lang.Object) toStringStyle20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "105) test1655(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "58) test1655(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{" + "'", str26, "{");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setSummaryObjectEndText(">");
        toStringStyle0.setFieldSeparator("<size=");
        java.lang.Class<?> wildcardClass11 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "106) test1656(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "59) test1656(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        java.lang.String str17 = toStringStyle0.getContentEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray13 = new double[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "ToStringStyle.SimpleToStringStyle", doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "107) test1658(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
// flaky "60) test1658(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<size=", byteArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "108) test1659(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "61) test1659(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "34) test1659(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) "{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "hi!", byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "109) test1661(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "62) test1661(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray21 = new char[] { '4', '4', ' ', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "}", charArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "110) test1662(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', '4', ' ', '4', ' ', '4' });
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        java.lang.String str14 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle17.setFieldNameValueSeparator("\n  ");
        toStringStyle17.setFieldNameValueSeparator("{");
        boolean boolean22 = toStringStyle17.isUseClassName();
        java.lang.String str23 = toStringStyle17.getSizeEndText();
        java.lang.String str24 = toStringStyle17.getFieldNameValueSeparator();
        toStringStyle17.setArraySeparator(">");
        toStringStyle17.setArraySeparator("{");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "[", (java.lang.Object) "{");
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
// flaky "111) test1663(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "=" + "'", str23, "=");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{" + "'", str24, "{");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray19 = new float[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, ",", floatArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "112) test1664(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "63) test1664(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle10.setFieldSeparatorAtStart(true);
        boolean boolean13 = toStringStyle10.isUseFieldNames();
        boolean boolean14 = toStringStyle10.isUseShortClassName();
        java.lang.String str15 = toStringStyle10.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) toStringStyle10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "113) test1665(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n  " + "'", str15, "\n  ");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray19 = new double[] { 10.0d, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "hi!", doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "114) test1666(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "64) test1666(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "[", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "115) test1667(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("[");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray21 = new boolean[] { true, true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "=", booleanArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "116) test1668(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, true, true, false, false });
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "117) test1669(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "65) test1669(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray8 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "hi!", shortArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] {});
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str9 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparator("<null>");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str14 = toStringStyle13.getSizeStartText();
        toStringStyle13.setContentStart("[");
        boolean boolean17 = toStringStyle13.isUseShortClassName();
        toStringStyle13.setContentStart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer12, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "118) test1671(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
// flaky "66) test1671(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentEnd("=");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer3, "<null>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.Class<?> wildcardClass2 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "119) test1674(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle18.setFieldSeparatorAtStart(true);
        java.lang.String str21 = toStringStyle18.getContentStart();
        toStringStyle18.setUseClassName(false);
        java.lang.String str24 = toStringStyle18.getSizeEndText();
        java.lang.String str25 = toStringStyle18.getArraySeparator();
        toStringStyle18.setDefaultFullDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer16, "", (java.lang.Object) toStringStyle18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{" + "'", str15, "{");
        org.junit.Assert.assertNotNull(toStringStyle18);
// flaky "120) test1675(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[" + "'", str21, "[");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
// flaky "67) test1675(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n  " + "'", str25, "\n  ");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        toStringStyle0.setUseShortClassName(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "121) test1676(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "68) test1676(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "<size=");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray14 = new char[] { '4', ' ', ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", charArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', ' ', ' ', '#', '#' });
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        java.lang.StringBuffer stringBuffer16 = null;
        int[] intArray21 = new int[] { (byte) 10, (byte) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "{", intArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "122) test1678(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "69) test1678(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "35) test1678(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 10, 1, 1 });
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "{", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.lang.String str14 = toStringStyle0.getSizeEndText();
        java.lang.String str15 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.StringBuffer stringBuffer18 = null;
        short[] shortArray22 = new short[] { (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "\n  ", shortArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "123) test1680(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
// flaky "70) test1680(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n  " + "'", str15, "\n  ");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 0, (short) 1 });
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setContentStart("");
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray17 = new double[] { (-1), (short) 100, (byte) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.NoFieldNameToStringStyle", doubleArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 100.0d, 1.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) 1.0f);
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.DefaultToStringStyle", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "124) test1682(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray11 = new char[] { '4', ' ', 'a', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "ToStringStyle.NoFieldNameToStringStyle", charArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', 'a', '#', ' ' });
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("{");
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSizeStartText(">");
        java.lang.String str15 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer16, "=", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "125) test1684(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "71) test1684(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "36) test1684(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ">" + "'", str15, ">");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle2.append(stringBuffer17, "", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
// flaky "126) test1685(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
// flaky "72) test1685(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str11 = toStringStyle10.getContentStart();
        boolean boolean12 = toStringStyle10.isUseFieldNames();
        boolean boolean13 = toStringStyle10.isUseShortClassName();
        toStringStyle10.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle10.appendSuper(stringBuffer16, "hi!");
        toStringStyle10.setArrayContentDetail(true);
        toStringStyle10.setArrayStart("");
        toStringStyle10.setDefaultFullDetail(false);
        boolean boolean25 = toStringStyle10.isUseFieldNames();
        java.lang.String str26 = toStringStyle10.getSizeStartText();
        java.lang.String str27 = toStringStyle10.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer9, (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "127) test1686(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "73) test1686(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ">" + "'", str26, ">");
// flaky "37) test1686(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle12.setFieldSeparatorAtStart(true);
        boolean boolean15 = toStringStyle12.isUseFieldNames();
        toStringStyle12.setUseIdentityHashCode(false);
        java.lang.String str18 = toStringStyle12.getSummaryObjectEndText();
        toStringStyle12.setArrayContentDetail(true);
        toStringStyle0.appendClassName(stringBuffer11, (java.lang.Object) toStringStyle12);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "128) test1687(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertNotNull(toStringStyle12);
// flaky "74) test1687(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "38) test1687(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldNameValueSeparator("<null>");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("\n  ");
        toStringStyle14.setFieldNameValueSeparator("{");
        boolean boolean19 = toStringStyle14.isUseIdentityHashCode();
        java.lang.String str20 = toStringStyle14.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle14.appendSuper(stringBuffer21, "hi!");
        java.lang.String str24 = toStringStyle14.getArrayStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "129) test1688(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "75) test1688(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "39) test1688(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{" + "'", str20, "{");
// flaky "14) test1688(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str24, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        boolean boolean6 = toStringStyle0.isUseFieldNames();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "130) test1689(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "76) test1689(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str7, "ToStringStyle.SimpleToStringStyle");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "=", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "131) test1690(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldNameValueSeparator("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray16 = new long[] { (byte) 10, 10, (short) 10, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "=", longArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "132) test1691(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 10L, 10L, 10L, 1L });
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str17 = toStringStyle16.getContentStart();
        toStringStyle16.setArrayEnd("\n  ");
        boolean boolean20 = toStringStyle16.isUseIdentityHashCode();
        java.lang.Class<?> wildcardClass21 = toStringStyle16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer14, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) toStringStyle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "133) test1692(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "77) test1692(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArraySeparator(">");
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray19 = new char[] { '#', '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "=", charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#', ' ' });
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "{", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "134) test1694(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setSizeEndText("hi!");
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "135) test1695(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str12 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "136) test1696(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str11 = toStringStyle0.getContentStart();
        java.lang.String str12 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<null>", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "137) test1697(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n  " + "'", str12, "\n  ");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
            toStringStyle0.appendContentEnd(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "138) test1698(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "}", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle13.setFieldSeparatorAtStart(true);
        java.lang.String str16 = toStringStyle13.getContentStart();
        toStringStyle13.setUseClassName(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "}", (java.lang.Object) false, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("[");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray19 = new short[] { (short) 0, (short) -1, (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "=", shortArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 0, (short) -1, (short) 10, (short) 10 });
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.NoFieldNameToStringStyle", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "139) test1702(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer2 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer2, (java.lang.Object) (byte) 100);
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setArrayContentDetail(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "=", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ToStringStyle.SimpleToStringStyle", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str9 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray12 = new float[] { '4', (byte) 10, (byte) 10, 1.0f, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "{", floatArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 52.0f, 10.0f, 10.0f, 1.0f, 97.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer19 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap21 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer19, "ToStringStyle.MultiLineToStringStyle", objMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "140) test1708(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objMap21);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentStart("<null>");
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "{", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle9.setFieldSeparatorAtStart(true);
        java.lang.String str12 = toStringStyle9.getFieldSeparator();
        java.lang.String str13 = toStringStyle9.getFieldSeparator();
        java.lang.String str14 = toStringStyle9.getSizeStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer8, (java.lang.Object) str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "141) test1710(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "[", byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setSizeEndText("=");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "142) test1713(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "78) test1713(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        long[] longArray18 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, ",", longArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "143) test1714(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "79) test1714(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] {});
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer9, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        java.lang.String str3 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray7 = new float[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "\n  ", floatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "144) test1717(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeEndText("}");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setArrayStart("[");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "145) test1719(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "[", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("\n  ");
        toStringStyle10.setFieldNameValueSeparator("{");
        boolean boolean15 = toStringStyle10.isUseClassName();
        boolean boolean16 = toStringStyle10.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer8, "ToStringStyle.NoFieldNameToStringStyle", (java.lang.Object) toStringStyle10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "146) test1723(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "80) test1723(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
// flaky "147) test1724(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendFieldStart(stringBuffer7, "");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle13.setFieldSeparatorAtStart(true);
        boolean boolean16 = toStringStyle13.isUseFieldNames();
        toStringStyle13.setUseIdentityHashCode(false);
        java.lang.String str19 = toStringStyle13.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle13);
        toStringStyle13.setSizeEndText("\n  ");
        boolean boolean23 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle13);
        boolean boolean24 = toStringStyle13.isUseClassName();
        java.lang.String str25 = toStringStyle13.getArrayStart();
        java.lang.StringBuffer stringBuffer26 = null;
        toStringStyle13.appendToString(stringBuffer26, "=");
        toStringStyle13.setUseShortClassName(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer12, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "81) test1724(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ">" + "'", str19, ">");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "40) test1724(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[" + "'", str25, "[");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray21 = new float[] { 10.0f, ' ', 0L, (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "=", floatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "148) test1725(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 10.0f, 32.0f, 0.0f, (-1.0f), 32.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.Class<?> wildcardClass5 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle8.setFieldSeparatorAtStart(true);
        boolean boolean11 = toStringStyle8.isUseFieldNames();
        toStringStyle8.setFieldNameValueSeparator("[");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart(">");
        toStringStyle0.setContentEnd("{");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "<size=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        boolean boolean18 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ToStringStyle.SimpleToStringStyle", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "149) test1729(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ">" + "'", str17, ">");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.Object[] objArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "", objArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "150) test1730(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "82) test1730(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer8, "ToStringStyle.SimpleToStringStyle", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "<null>", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "151) test1732(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        boolean[] booleanArray10 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, ">", booleanArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertNotNull(booleanArray10);
        assertBooleanArrayEquals(booleanArray10, new boolean[] {});
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str13 = toStringStyle12.getContentStart();
        toStringStyle12.setArrayEnd("\n  ");
        boolean boolean16 = toStringStyle12.isUseIdentityHashCode();
        java.lang.String str17 = toStringStyle12.getSummaryObjectEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer11, (java.lang.Object) str17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "152) test1734(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[" + "'", str17, "[");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setArrayStart("<size=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
            toStringStyle0.append(stringBuffer9, "ToStringStyle.MultiLineToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "153) test1736(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<size=" + "'", str8, "<size=");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        boolean boolean10 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray19 = new float[] { (short) -1, 0.0f, (byte) -1, (-1), 0.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "", floatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { (-1.0f), 0.0f, (-1.0f), (-1.0f), 0.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "}", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "154) test1738(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray22 = new char[] { '4', 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "", charArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "155) test1739(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "83) test1739(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n  " + "'", str15, "\n  ");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', 'a', '#', '#' });
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setNullText("\n  ");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean13 = toStringStyle11.isFullDetail((java.lang.Boolean) false);
        toStringStyle11.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle11.setArrayStart("}");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer10, (java.lang.Object) toStringStyle11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "156) test1740(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "", byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "157) test1741(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str11 = toStringStyle10.getContentStart();
        boolean boolean12 = toStringStyle10.isUseFieldNames();
        java.lang.String str13 = toStringStyle10.getArrayStart();
        boolean boolean14 = toStringStyle10.isArrayContentDetail();
        java.lang.String str15 = toStringStyle10.getFieldSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "{", (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "158) test1742(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "84) test1742(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "41) test1742(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        float[] floatArray24 = new float[] { (short) 1, (short) 1, 10.0f, (byte) 10, 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "ToStringStyle.NoFieldNameToStringStyle", floatArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "159) test1743(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, 1.0f, 10.0f, 10.0f, 0.0f, 52.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "160) test1744(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.String str15 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray20 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "=", booleanArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "161) test1745(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertNotNull(booleanArray20);
        assertBooleanArrayEquals(booleanArray20, new boolean[] { true, true });
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
// flaky "162) test1746(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendClassName(stringBuffer10, (java.lang.Object) toStringStyle11);
        java.lang.StringBuffer stringBuffer22 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle24.setFieldSeparatorAtStart(true);
        java.lang.String str27 = toStringStyle24.getFieldSeparator();
        java.lang.String str28 = toStringStyle24.getFieldSeparator();
        toStringStyle24.setUseClassName(true);
        boolean boolean32 = toStringStyle24.isFullDetail((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "{", (java.lang.Object) boolean32, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "85) test1746(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "42) test1746(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "15) test1746(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<size=" + "'", str18, "<size=");
        org.junit.Assert.assertNotNull(toStringStyle24);
// flaky "3) test1746(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
// flaky "1) test1746(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        char[] charArray22 = new char[] { '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, ">", charArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<size=" + "'", str14, "<size=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', 'a', '#' });
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ",", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ">" + "'", str10, ">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str11 = toStringStyle10.getContentStart();
        toStringStyle10.setArrayEnd("\n  ");
        boolean boolean14 = toStringStyle10.isUseIdentityHashCode();
        toStringStyle10.setArrayStart("[");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ",", (java.lang.Object) "[", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setContentStart("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "=", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
            toStringStyle0.removeLastFieldSeparator(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "163) test1751(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        long[] longArray21 = new long[] { (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "=", longArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "164) test1752(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
// flaky "86) test1752(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { (-1L), 10L });
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer5 = null;
        short[] shortArray13 = new short[] { (short) 1, (byte) 1, (short) -1, (short) 10, (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "[", shortArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 1, (short) 1, (short) -1, (short) 10, (short) 10, (short) -1 });
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = toStringStyle14.getContentStart();
        boolean boolean16 = toStringStyle14.isUseFieldNames();
        boolean boolean17 = toStringStyle14.isUseShortClassName();
        toStringStyle14.setFieldSeparator("hi!");
        java.lang.String str20 = toStringStyle14.getContentStart();
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle14.appendToString(stringBuffer21, ">");
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle14.appendFieldStart(stringBuffer24, "");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = toStringStyle28.getContentStart();
        boolean boolean30 = toStringStyle28.isUseFieldNames();
        boolean boolean31 = toStringStyle28.isUseShortClassName();
        toStringStyle28.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer34 = null;
        toStringStyle28.appendSuper(stringBuffer34, "hi!");
        toStringStyle28.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer39 = null;
        toStringStyle28.appendToString(stringBuffer39, ">");
        toStringStyle28.setContentStart("<size=");
        java.lang.String str44 = toStringStyle28.getSummaryObjectStartText();
        java.lang.Object[] objArray45 = new java.lang.Object[] { toStringStyle14, ' ', str44 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<null>", objArray45, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "165) test1754(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str15, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str20, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str29, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "=" + "'", str44, "=");
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArraySeparator("hi!");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray17 = new char[] { '4', '#', '4', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", charArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', '#', '4', ' ', '#' });
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        toStringStyle0.setSummaryObjectStartText("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "87) test1756(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "166) test1756(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        java.lang.StringBuffer stringBuffer3 = null;
        float[] floatArray9 = new float[] { (byte) 100, (-1.0f), 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "ToStringStyle.DefaultToStringStyle", floatArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 100.0f, (-1.0f), 1.0f, 97.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setSizeEndText("=");
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray14 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, ">", byteArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "167) test1758(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        double[] doubleArray19 = new double[] { 10.0d, (byte) 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "<null>", doubleArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "168) test1759(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
            toStringStyle0.append(stringBuffer11, ">", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str9 = toStringStyle8.getContentStart();
        toStringStyle8.setArrayEnd("\n  ");
        boolean boolean12 = toStringStyle8.isUseShortClassName();
        toStringStyle8.setNullText(",");
        java.lang.Object[] objArray15 = new java.lang.Object[] { "," };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "=", objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "169) test1762(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str5, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[,]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[,]");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "<size=", byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setContentEnd("{");
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray12 = new long[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "", longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L });
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        java.lang.StringBuffer stringBuffer14 = null;
        short[] shortArray16 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "[", shortArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "170) test1765(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "88) test1765(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ">", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) 1.0f);
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray19 = new double[] { 0, 'a', (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "171) test1768(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 97.0d, 10.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray10 = new double[] { 100L, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "ToStringStyle.MultiLineToStringStyle", doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<size=" + "'", str5, "<size=");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str20 = toStringStyle19.getContentStart();
        boolean boolean21 = toStringStyle19.isUseFieldNames();
        boolean boolean22 = toStringStyle19.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle23 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str24 = toStringStyle23.getContentStart();
        boolean boolean25 = toStringStyle23.isUseFieldNames();
        boolean boolean26 = toStringStyle23.isUseShortClassName();
        toStringStyle23.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer29 = null;
        toStringStyle23.appendFieldStart(stringBuffer29, ">");
        toStringStyle23.setNullText(",");
        java.lang.Object[] objArray34 = new java.lang.Object[] { toStringStyle19, "," };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "ToStringStyle.SimpleToStringStyle", objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "172) test1770(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
// flaky "89) test1770(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[" + "'", str20, "[");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(toStringStyle23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<null>" + "'", str24, "<null>");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        java.lang.String str16 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer17, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[" + "'", str16, "[");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setContentEnd("[");
        boolean boolean13 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer14 = null;
        char[] charArray16 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ",", charArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ">", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
// flaky "173) test1774(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        java.lang.String str3 = toStringStyle0.getNullText();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str9 = toStringStyle8.getContentStart();
        boolean boolean10 = toStringStyle8.isUseFieldNames();
        java.lang.String str11 = toStringStyle8.getArrayStart();
        boolean boolean12 = toStringStyle8.isArrayContentDetail();
        java.lang.String str13 = toStringStyle8.getFieldSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object) str13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setArraySeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "174) test1777(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "=");
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "", byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setSummaryObjectEndText("<null>");
        toStringStyle0.setArrayStart("{");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.String str11 = toStringStyle0.getArrayStart();
        toStringStyle0.setSummaryObjectEndText("=");
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "<null>", byteArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "175) test1780(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "90) test1780(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str18 = toStringStyle17.getContentStart();
        boolean boolean19 = toStringStyle17.isUseFieldNames();
        boolean boolean20 = toStringStyle17.isUseShortClassName();
        toStringStyle17.setFieldSeparator("hi!");
        toStringStyle17.setNullText("");
        boolean boolean25 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle17);
        toStringStyle17.setFieldSeparatorAtEnd(false);
        java.lang.String str28 = toStringStyle17.getFieldNameValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer16, (java.lang.Object) toStringStyle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<null>" + "'", str18, "<null>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "176) test1781(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "," + "'", str28, ",");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setSummaryObjectEndText(">");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str13 = toStringStyle12.getContentStart();
        boolean boolean14 = toStringStyle12.isUseFieldNames();
        boolean boolean15 = toStringStyle12.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle12);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer11, (java.lang.Object) toStringStyle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<null>" + "'", str1, "<null>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<null>" + "'", str13, "<null>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray10 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "[", doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle6.setFieldNameValueSeparator("\n  ");
        toStringStyle6.setFieldNameValueSeparator("{");
        boolean boolean11 = toStringStyle6.isUseIdentityHashCode();
        java.lang.String str12 = toStringStyle6.getFieldNameValueSeparator();
        toStringStyle6.setFieldNameValueSeparator("{");
        toStringStyle6.setContentEnd(">");
        toStringStyle6.setFieldSeparator("[");
        toStringStyle6.setArraySeparator("");
        java.lang.String str21 = toStringStyle6.getFieldNameValueSeparator();
        toStringStyle6.setFieldSeparator("}");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer5, (java.lang.Object) "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{" + "'", str12, "{");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "{" + "'", str21, "{");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str10 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray16 = new char[] { 'a', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "ToStringStyle.SimpleToStringStyle", charArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "177) test1786(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { 'a', '#', ' ' });
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray17 = new int[] { 100, (short) 0, (byte) 100, (byte) 10, (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "ToStringStyle.SimpleToStringStyle", intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 100, 0, 100, 10, 10, 0 });
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle17.setFieldSeparatorAtStart(true);
        java.lang.String str20 = toStringStyle17.getFieldSeparator();
        java.lang.String str21 = toStringStyle17.getFieldSeparator();
        toStringStyle17.setArrayEnd("hi!");
        toStringStyle17.setFieldSeparatorAtStart(true);
        toStringStyle17.setFieldSeparator(",");
        java.lang.String str28 = toStringStyle17.getContentEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "\n  ", (java.lang.Object) str28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "178) test1788(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
// flaky "91) test1788(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "," + "'", str28, ",");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        toStringStyle12.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle12.appendFieldStart(stringBuffer18, ">");
        java.lang.String str21 = toStringStyle12.getFieldSeparator();
        boolean boolean22 = toStringStyle12.isFieldSeparatorAtEnd();
        java.lang.String str23 = toStringStyle12.getSizeStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer10, "ToStringStyle.SimpleToStringStyle", (java.lang.Object) toStringStyle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<null>" + "'", str13, "<null>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "179) test1789(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "92) test1789(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<null>" + "'", str23, "<null>");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.String str12 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray16 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
// flaky "180) test1790(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray11 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray19 = new float[] { (byte) 0, 1.0f, 1, (short) 0, 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, ",", floatArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "181) test1792(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 0.0f, 1.0f, 1.0f, 0.0f, 100.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer21, "}", (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd("=");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "[", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "182) test1795(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "93) test1795(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
// flaky "43) test1795(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart(">");
        java.lang.String str11 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray15 = new long[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", longArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "183) test1796(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "94) test1796(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "44) test1796(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<null>" + "'", str11, "<null>");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 10L });
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.MultiLineToStringStyle", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "184) test1797(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean21 = toStringStyle20.isUseShortClassName();
        java.lang.StringBuffer stringBuffer22 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle23 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str24 = toStringStyle23.getContentStart();
        toStringStyle23.setArrayEnd("\n  ");
        boolean boolean27 = toStringStyle23.isUseIdentityHashCode();
        boolean boolean29 = toStringStyle23.isFullDetail((java.lang.Boolean) true);
        toStringStyle20.appendClassName(stringBuffer22, (java.lang.Object) boolean29);
        java.lang.String str31 = toStringStyle20.getFieldSeparator();
        boolean boolean32 = toStringStyle20.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str34 = toStringStyle33.getContentStart();
        toStringStyle33.setArrayEnd("\n  ");
        boolean boolean37 = toStringStyle33.isUseIdentityHashCode();
        toStringStyle33.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle33);
        java.lang.String str41 = toStringStyle33.getFieldNameValueSeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle42 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle42.setFieldSeparatorAtStart(true);
        java.lang.String str45 = toStringStyle42.getFieldSeparator();
        java.lang.String str46 = toStringStyle42.getFieldSeparator();
        boolean boolean47 = toStringStyle42.isUseIdentityHashCode();
        toStringStyle42.setFieldSeparatorAtStart(false);
        toStringStyle42.setFieldSeparatorAtStart(false);
        java.lang.Object[] objArray52 = new java.lang.Object[] { 1.0f, toStringStyle20, str41, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "\n  ", objArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(toStringStyle23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<null>" + "'", str24, "<null>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "," + "'", str31, ",");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(toStringStyle33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<null>" + "'", str34, "<null>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky "185) test1798(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "," + "'", str41, ",");
        org.junit.Assert.assertNotNull(toStringStyle42);
// flaky "95) test1798(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
// flaky "45) test1798(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setSummaryObjectStartText("\n  ");
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean13 = toStringStyle0.isDefaultFullDetail();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSummaryObjectEndText("\n  ");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "<size=", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "186) test1800(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
// flaky "96) test1800(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "\n  ", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "187) test1801(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        boolean[] booleanArray16 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "=", booleanArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "188) test1802(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
// flaky "97) test1802(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] {});
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayStart(",");
        java.lang.StringBuffer stringBuffer14 = null;
        short[] shortArray22 = new short[] { (short) 100, (byte) 10, (short) -1, (short) 1, (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, ",", shortArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 100, (short) 10, (short) -1, (short) 1, (short) -1, (short) 0 });
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        java.lang.String str15 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "189) test1804(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "98) test1804(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
// flaky "46) test1804(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
// flaky "16) test1804(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<null>" + "'", str11, "<null>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "4) test1804(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer5 = null;
        long[] longArray11 = new long[] { (short) 100, (short) -1, (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "[", longArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "190) test1805(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 100L, (-1L), 0L, 10L });
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray17 = new double[] { (-1), 100.0f, 100.0f, 10.0d, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "}", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "191) test1806(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "99) test1806(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 100.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart(">");
        toStringStyle0.setContentEnd("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str15 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "192) test1807(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "100) test1807(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer9 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.MultiLineToStringStyle", objMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "193) test1808(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "101) test1808(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
// flaky "47) test1808(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
// flaky "17) test1808(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertNotNull(objMap11);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        toStringStyle0.setNullText("<null>");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "\n  ", (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, ">", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "194) test1810(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "102) test1810(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<null>" + "'", str16, "<null>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str9 = toStringStyle0.getNullText();
        toStringStyle0.setFieldSeparator("<null>");
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray19 = new int[] { '#', (-1), (-1), (-1), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "}", intArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "195) test1811(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "103) test1811(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 35, (-1), (-1), (-1), 100 });
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "196) test1812(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str12 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray17 = new double[] { (byte) 100, 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "{", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "197) test1813(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray17 = new double[] { (-1.0f), 'a', ' ', 10.0d, 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 97.0d, 32.0d, 10.0d, 97.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setNullText("\n  ");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setSizeStartText("<null>");
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "{", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "198) test1816(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.String str8 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray11 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", booleanArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
// flaky "199) test1817(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer2, "ToStringStyle.DefaultToStringStyle", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "}", byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator(">");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "200) test1820(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray9 = new char[] { '#', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "=", charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "201) test1821(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', '4' });
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray13 = new double[] { '4', 10.0d, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<size=", doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "202) test1822(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 52.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setSizeStartText("{");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "[", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "203) test1823(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10 });
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray12 = new long[] { '4', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "", longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "204) test1824(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
// flaky "104) test1824(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 52L, (-1L) });
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeEndText(">");
        toStringStyle0.setSizeEndText("hi!");
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray14 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "hi!", charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "205) test1825(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendFieldStart(stringBuffer8, "[");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "206) test1826(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
// flaky "105) test1826(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setFieldNameValueSeparator("}");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "207) test1827(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray13 = new short[] { (byte) 0, (short) 10, (byte) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "<null>", shortArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 0, (short) 10, (short) 10, (short) -1 });
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayEnd("}");
        boolean boolean12 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "", byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "208) test1830(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "106) test1830(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 10 });
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray14 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<size=", charArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "209) test1831(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray17 = new char[] { '4', 'a', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "ToStringStyle.NoFieldNameToStringStyle", charArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', 'a', ' ', '4' });
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle9.setFieldSeparatorAtStart(true);
        java.lang.String str12 = toStringStyle9.getFieldSeparator();
        java.lang.String str13 = toStringStyle9.getFieldSeparator();
        toStringStyle9.setUseIdentityHashCode(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str17 = toStringStyle16.getContentStart();
        toStringStyle16.setArrayEnd("\n  ");
        java.lang.String str20 = toStringStyle16.getSummaryObjectStartText();
        java.lang.Object[] objArray21 = new java.lang.Object[] { false, str20 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.DefaultToStringStyle", objArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[" + "'", str17, "[");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "=" + "'", str20, "=");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[false, =]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[false, =]");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer14 = null;
        long[] longArray18 = new long[] { 'a', 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "<null>", longArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "210) test1834(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 97L, 100L });
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray18 = new float[] { (byte) 0, 0L, 10L, '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<size=", floatArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "211) test1835(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 0.0f, 0.0f, 10.0f, 35.0f, 52.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setContentStart("{");
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentEnd("=");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer5 = null;
        double[] doubleArray11 = new double[] { (short) 1, (short) 1, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "\n  ", doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str12 = toStringStyle11.getContentStart();
        toStringStyle11.setArrayEnd("\n  ");
        boolean boolean15 = toStringStyle11.isUseShortClassName();
        java.lang.String str16 = toStringStyle11.getSummaryObjectStartText();
        boolean boolean17 = toStringStyle11.isUseFieldNames();
        java.lang.Object[] objArray18 = new java.lang.Object[] { boolean17 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "212) test1839(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
// flaky "107) test1839(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{" + "'", str12, "{");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ">" + "'", str16, ">");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[false]");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayStart(",");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str7 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer10, obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "213) test1841(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "214) test1842(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectEndText("}");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.SimpleToStringStyle", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray14 = new int[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "hi!", intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getNullText();
        java.lang.String str5 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, ">");
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "215) test1845(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "108) test1845(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "ToStringStyle.DefaultToStringStyle", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "216) test1846(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "109) test1846(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "48) test1846(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=" + "'", str13, "=");
// flaky "18) test1846(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<size=" + "'", str15, "<size=");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        java.lang.String str11 = toStringStyle0.getArrayStart();
        toStringStyle0.setSummaryObjectEndText("=");
        java.lang.StringBuffer stringBuffer14 = null;
        double[] doubleArray20 = new double[] { 10.0d, 1.0d, (-1L), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "", doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "217) test1847(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
// flaky "110) test1847(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 1.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray13 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "[", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] {});
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray13 = new long[] { (short) 0, 10L, (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "=", longArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 0L, 10L, (-1L), 35L });
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        float[] floatArray18 = new float[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "{", floatArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "218) test1850(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "111) test1850(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "49) test1850(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
// flaky "19) test1850(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        toStringStyle0.setUseClassName(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "219) test1851(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str18 = toStringStyle17.getContentStart();
        boolean boolean19 = toStringStyle17.isUseFieldNames();
        boolean boolean20 = toStringStyle17.isUseShortClassName();
        toStringStyle17.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer23 = null;
        toStringStyle17.appendSuper(stringBuffer23, "hi!");
        toStringStyle17.setArrayContentDetail(true);
        toStringStyle17.setArrayStart("");
        toStringStyle17.setDefaultFullDetail(false);
        boolean boolean32 = toStringStyle17.isUseFieldNames();
        java.lang.String str33 = toStringStyle17.getSizeStartText();
        java.lang.String str34 = toStringStyle17.getArrayEnd();
        toStringStyle17.setFieldNameValueSeparator("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer15, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object) toStringStyle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "220) test1852(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
// flaky "112) test1852(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle17);
// flaky "50) test1852(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{" + "'", str33, "{");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\n  " + "'", str34, "\n  ");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        toStringStyle0.setArrayStart("hi!");
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray19 = new long[] { 0L, (short) 1, (-1L), 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, ">", longArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "221) test1853(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "113) test1853(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 0L, 1L, (-1L), 10L, 0L, 100L });
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        java.lang.StringBuffer stringBuffer6 = null;
        char[] charArray9 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.NoFieldNameToStringStyle", charArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "222) test1854(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a' });
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setSizeEndText("=");
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "ToStringStyle.DefaultToStringStyle", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "223) test1855(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) -1 });
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray10 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "=", booleanArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "224) test1856(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "114) test1856(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "51) test1856(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "20) test1856(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertNotNull(booleanArray10);
        assertBooleanArrayEquals(booleanArray10, new boolean[] { false });
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setUseClassName(false);
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "225) test1857(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setContentEnd("");
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray11 = new float[] { (-1), ' ', 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, ",", floatArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { (-1.0f), 32.0f, 0.0f, 35.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
            toStringStyle0.removeLastFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "226) test1859(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "115) test1859(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        toStringStyle0.setArrayEnd("ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "227) test1861(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "116) test1861(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "=" + "'", str14, "=");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, ">", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "228) test1862(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "117) test1862(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "52) test1862(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "21) test1862(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str7, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "229) test1863(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "118) test1863(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "53) test1863(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str9, "ToStringStyle.DefaultToStringStyle");
// flaky "22) test1863(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
// flaky "230) test1864(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendToString(stringBuffer16, "ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer19, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "[", (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
// flaky "231) test1865(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "119) test1865(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        toStringStyle0.setFieldSeparatorAtStart(true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "232) test1866(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "120) test1866(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "54) test1866(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer14, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "233) test1867(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "121) test1867(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "55) test1867(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "23) test1867(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setContentStart("ToStringStyle.MultiLineToStringStyle");
        boolean boolean12 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str16 = toStringStyle15.getContentStart();
        boolean boolean17 = toStringStyle15.isUseFieldNames();
        boolean boolean18 = toStringStyle15.isUseShortClassName();
        toStringStyle15.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle15.appendSuper(stringBuffer21, "hi!");
        toStringStyle15.setArrayContentDetail(true);
        toStringStyle15.setArrayStart("");
        toStringStyle15.setDefaultFullDetail(false);
        boolean boolean30 = toStringStyle15.isUseFieldNames();
        java.lang.String str31 = toStringStyle15.getSizeStartText();
        java.lang.String str32 = toStringStyle15.getArrayEnd();
        java.lang.String str33 = toStringStyle15.getContentStart();
        boolean boolean35 = toStringStyle15.isFullDetail((java.lang.Boolean) false);
        toStringStyle15.setSummaryObjectEndText("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "234) test1868(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str8, "ToStringStyle.MultiLineToStringStyle");
// flaky "122) test1868(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "56) test1868(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str16, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "24) test1868(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "5) test1868(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "=" + "'", str31, "=");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n  " + "'", str32, "\n  ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str33, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        double[] doubleArray23 = new double[] { '#', (-1L), (byte) 10, ' ', 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "", doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str3, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<size=" + "'", str13, "<size=");
// flaky "235) test1869(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "=" + "'", str15, "=");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 35.0d, (-1.0d), 10.0d, 32.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.String str12 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "236) test1870(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "=" + "'", str12, "=");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer9, "<size=", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "237) test1871(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n  " + "'", str8, "\n  ");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        toStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, ">", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "238) test1872(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setContentEnd("");
        toStringStyle0.setUseClassName(false);
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray9 = new long[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "", longArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "239) test1873(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 10L });
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray14 = new short[] { (byte) -1, (byte) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "<size=", shortArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "240) test1874(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 1, (short) 1 });
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray10 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "\n  ", charArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "241) test1875(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#' });
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray19 = new boolean[] { false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "\n  ", booleanArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { false, false, false });
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        java.lang.String str8 = toStringStyle0.getContentEnd();
        java.lang.String str9 = toStringStyle0.getSizeEndText();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "242) test1877(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
// flaky "123) test1877(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str8, "ToStringStyle.SimpleToStringStyle");
// flaky "57) test1877(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "243) test1878(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray13 = new float[] { (short) 0, 100.0f, (short) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "[", floatArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 0.0f, 100.0f, 1.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setFieldSeparator("");
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str13 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray17 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.MultiLineToStringStyle", byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "244) test1880(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "124) test1880(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1 });
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("=");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "245) test1882(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        toStringStyle0.setSummaryObjectEndText(",");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer18 = null;
// flaky "125) test1882(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendToString(stringBuffer18, "}");
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer21, ",", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean7 = toStringStyle0.isUseClassName();
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle12.setFieldSeparatorAtStart(true);
        boolean boolean15 = toStringStyle12.isUseFieldNames();
        toStringStyle12.setFieldNameValueSeparator("[");
        boolean boolean18 = toStringStyle12.isArrayContentDetail();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str20 = toStringStyle19.getContentStart();
        boolean boolean21 = toStringStyle19.isUseFieldNames();
        boolean boolean22 = toStringStyle19.isUseShortClassName();
        toStringStyle19.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer25 = null;
// flaky "246) test1883(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle19.appendSuper(stringBuffer25, "hi!");
        toStringStyle19.setArrayContentDetail(true);
        toStringStyle19.setArrayStart("");
        java.lang.String str32 = toStringStyle19.getArrayStart();
        toStringStyle19.setFieldNameValueSeparator("[");
        toStringStyle19.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle37 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle37.setFieldSeparatorAtStart(true);
        java.lang.String str40 = toStringStyle37.getFieldSeparator();
        java.lang.String str41 = toStringStyle37.getFieldSeparator();
        toStringStyle37.setUseClassName(true);
        boolean boolean45 = toStringStyle37.isFullDetail((java.lang.Boolean) false);
        boolean boolean46 = toStringStyle37.isArrayContentDetail();
        boolean boolean47 = toStringStyle37.isFieldSeparatorAtStart();
        boolean boolean48 = toStringStyle37.isUseShortClassName();
        toStringStyle37.setNullText("\n  ");
        java.lang.StringBuffer stringBuffer51 = null;
        java.lang.Object obj52 = null;
        toStringStyle37.appendStart(stringBuffer51, obj52);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle54 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle54.setFieldNameValueSeparator("\n  ");
        boolean boolean57 = toStringStyle54.isArrayContentDetail();
        java.lang.String str58 = toStringStyle54.getFieldSeparator();
        boolean boolean59 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle54);
        java.lang.String str60 = toStringStyle54.getSummaryObjectStartText();
        toStringStyle54.setArrayEnd("hi!");
        java.lang.Object[] objArray63 = new java.lang.Object[] { 100, toStringStyle12, "ToStringStyle.DefaultToStringStyle", stringBuffer51, toStringStyle54 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.MultiLineToStringStyle", objArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "126) test1883(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str20, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(toStringStyle37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(toStringStyle54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[" + "'", str58, "[");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<size=" + "'", str60, "<size=");
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
// flaky "247) test1884(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendSuper(stringBuffer7, ",");
        java.lang.String str10 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayStart("ToStringStyle.MultiLineToStringStyle");
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str16 = toStringStyle15.getContentStart();
        boolean boolean17 = toStringStyle15.isUseFieldNames();
        boolean boolean18 = toStringStyle15.isUseShortClassName();
        toStringStyle15.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer21 = null;
// flaky "127) test1884(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle15.appendSuper(stringBuffer21, "hi!");
        toStringStyle15.setArrayContentDetail(true);
        toStringStyle15.setArrayStart("");
        toStringStyle15.setDefaultFullDetail(false);
        boolean boolean30 = toStringStyle15.isUseFieldNames();
        java.lang.String str31 = toStringStyle15.getNullText();
        toStringStyle15.setContentEnd("<size=");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer14, (java.lang.Object) toStringStyle15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "58) test1884(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str10, "ToStringStyle.MultiLineToStringStyle");
// flaky "25) test1884(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str16, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n  " + "'", str31, "\n  ");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray9 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "{", byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "248) test1885(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        java.lang.String str10 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "{", byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "249) test1886(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
// flaky "128) test1886(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.MultiLineToStringStyle", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.MultiLineToStringStyle", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
            toStringStyle11.append(stringBuffer23, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "250) test1889(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle11);
// flaky "129) test1889(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "=" + "'", str17, "=");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{" + "'", str18, "{");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.String str8 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "251) test1891(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
// flaky "130) test1891(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        toStringStyle0.setNullText("\n  ");
        toStringStyle0.setSizeStartText(",");
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setArrayEnd("<size=");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str18 = toStringStyle17.getContentStart();
        boolean boolean19 = toStringStyle17.isUseFieldNames();
        boolean boolean20 = toStringStyle17.isUseShortClassName();
        toStringStyle17.setFieldSeparator("hi!");
        java.lang.String str23 = toStringStyle17.getSizeEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer16, (java.lang.Object) toStringStyle17);
// flaky "252) test1893(org.apache.commons.lang3.builder.RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str18, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "131) test1893(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("=");
        java.lang.StringBuffer stringBuffer9 = null;
// flaky "253) test1894(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendToString(stringBuffer9, "=");
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray21 = new boolean[] { true, false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "hi!", booleanArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, false, true, true, true });
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.Object[] objArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "<null>", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "254) test1895(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        java.lang.StringBuffer stringBuffer17 = null;
        boolean[] booleanArray20 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "", booleanArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "255) test1896(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "132) test1896(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(booleanArray20);
        assertBooleanArrayEquals(booleanArray20, new boolean[] { true });
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        boolean boolean15 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str16 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer17 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap19 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, ">", objMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
// flaky "256) test1897(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str16, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(objMap19);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray11 = new double[] { (-1L), 100.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "ToStringStyle.DefaultToStringStyle", doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
// flaky "257) test1898(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray22 = new double[] { 10.0d, (short) -1, 10.0d, ' ', 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "\n  ", doubleArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "258) test1899(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "133) test1899(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, (-1.0d), 10.0d, 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArraySeparator("hi!");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray17 = new int[] { 0, (byte) 0, (short) 100, '#', (short) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "{", intArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, 0, 100, 35, 10, 1 });
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
// flaky "259) test1901(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendToString(stringBuffer7, "<size=");
        toStringStyle0.setSummaryObjectStartText("=");
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendClassName(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray22 = new double[] { (short) 1, 1L, (byte) 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "<null>", doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 1.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
// flaky "260) test1902(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "ToStringStyle.SimpleToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.DefaultToStringStyle", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
// flaky "261) test1903(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.String str5 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "262) test1904(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "hi!", (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "263) test1905(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
// flaky "134) test1905(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        boolean boolean11 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.DefaultToStringStyle");
        boolean boolean14 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer15 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap17 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "{", objMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "264) test1906(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
// flaky "135) test1906(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objMap17);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        toStringStyle0.setSummaryObjectStartText("\n  ");
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer14 = null;
        long[] longArray18 = new long[] { (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "<null>", longArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { (-1L), 52L });
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        toStringStyle0.setSizeEndText(">");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray11 = new int[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "[", intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32 });
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
// flaky "265) test1909(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendToString(stringBuffer8, "}");
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.SimpleToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setContentStart("\n  ");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle13.setFieldSeparatorAtStart(true);
        boolean boolean16 = toStringStyle13.isUseFieldNames();
        toStringStyle13.setUseIdentityHashCode(false);
        java.lang.String str19 = toStringStyle13.getSummaryObjectEndText();
        java.lang.String str20 = toStringStyle13.getArraySeparator();
        toStringStyle13.setArrayStart("hi!");
        java.lang.String str23 = toStringStyle13.getArrayEnd();
        toStringStyle13.setArrayEnd("[");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer12, (java.lang.Object) "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "266) test1910(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "136) test1910(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str19, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n  " + "'", str23, "\n  ");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "}", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
            toStringStyle0.appendContentStart(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "267) test1912(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        boolean[] booleanArray19 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "[", booleanArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true });
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.SimpleToStringStyle", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray9 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<null>", booleanArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "268) test1915(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str5, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray9);
        assertBooleanArrayEquals(booleanArray9, new boolean[] { false });
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setNullText("[");
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, ",", (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "59) test1917(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "269) test1917(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "=" + "'", str8, "=");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        java.lang.String str19 = toStringStyle0.getFieldSeparator();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "270) test1918(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str12, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "137) test1918(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
// flaky "60) test1918(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n  " + "'", str18, "\n  ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArraySeparator("hi!");
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "}", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "271) test1919(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "138) test1919(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "61) test1919(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.Class<?> wildcardClass8 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "272) test1920(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "\n  ", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("{");
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSizeStartText(">");
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray20 = new boolean[] { false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "\n  ", booleanArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "273) test1922(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        assertBooleanArrayEquals(booleanArray20, new boolean[] { false, false, true });
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray10 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "", booleanArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "274) test1923(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
// flaky "139) test1923(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "62) test1923(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
        org.junit.Assert.assertNotNull(booleanArray10);
        assertBooleanArrayEquals(booleanArray10, new boolean[] { false });
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeEndText(">");
        toStringStyle0.setSizeEndText("hi!");
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "275) test1924(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "140) test1924(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
// flaky "63) test1924(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str5, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayEnd("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray15 = new char[] { 'a', ' ', 'a', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.DefaultToStringStyle", charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<size=" + "'", str5, "<size=");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', 'a', '4', '4' });
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        boolean boolean5 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "[", objMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objMap8);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = toStringStyle3.getContentStart();
        toStringStyle3.setArrayEnd("\n  ");
        boolean boolean7 = toStringStyle3.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) boolean9);
        java.lang.String str11 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray15 = new short[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "ToStringStyle.MultiLineToStringStyle", shortArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
// flaky "276) test1927(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 1 });
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
            toStringStyle0.removeLastFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "hi!", (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "277) test1929(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean2 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSummaryObjectStartText("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setArrayStart("}");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.MultiLineToStringStyle", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        char[] charArray16 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "", charArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "278) test1931(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer12, "{", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle8.setFieldSeparatorAtStart(true);
        java.lang.String str11 = toStringStyle8.getFieldSeparator();
        java.lang.String str12 = toStringStyle8.getFieldSeparator();
        toStringStyle8.setUseClassName(true);
        boolean boolean16 = toStringStyle8.isFullDetail((java.lang.Boolean) false);
        toStringStyle8.setArrayStart(">");
        java.lang.String str19 = toStringStyle8.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle20.setFieldSeparatorAtStart(true);
        boolean boolean23 = toStringStyle20.isUseFieldNames();
        boolean boolean24 = toStringStyle20.isUseShortClassName();
        java.lang.String str25 = toStringStyle20.getArrayEnd();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str28 = toStringStyle27.getContentStart();
        boolean boolean29 = toStringStyle27.isUseFieldNames();
        boolean boolean30 = toStringStyle27.isUseShortClassName();
        toStringStyle27.setDefaultFullDetail(true);
        boolean boolean33 = toStringStyle27.isFieldSeparatorAtEnd();
        java.lang.String str34 = toStringStyle27.getArraySeparator();
        toStringStyle27.setUseFieldNames(false);
        toStringStyle27.setFieldNameValueSeparator("}");
        toStringStyle27.setArrayStart(">");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle41 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle41.setFieldNameValueSeparator("\n  ");
        toStringStyle41.setFieldNameValueSeparator("{");
        boolean boolean46 = toStringStyle41.isUseIdentityHashCode();
        java.lang.String str47 = toStringStyle41.getFieldNameValueSeparator();
        toStringStyle41.setFieldNameValueSeparator("{");
        toStringStyle41.setContentEnd(">");
        java.lang.String str52 = toStringStyle41.getArrayStart();
        java.lang.String str53 = toStringStyle41.getSizeStartText();
        boolean boolean54 = toStringStyle41.isFieldSeparatorAtStart();
        toStringStyle41.setArrayContentDetail(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle57 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle57.setFieldNameValueSeparator("\n  ");
        toStringStyle57.setFieldNameValueSeparator("{");
        boolean boolean62 = toStringStyle57.isUseClassName();
        toStringStyle57.setArrayEnd("");
        toStringStyle57.setSizeStartText(",");
        java.lang.String str67 = toStringStyle57.getFieldNameValueSeparator();
        toStringStyle57.setFieldSeparator("\n  ");
        java.lang.Object[] objArray70 = new java.lang.Object[] { toStringStyle8, toStringStyle20, 100, toStringStyle27, false, toStringStyle57 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "<size=", objArray70, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "279) test1933(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n  " + "'", str25, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle27);
// flaky "141) test1933(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[" + "'", str28, "[");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "64) test1933(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky "26) test1933(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<size=" + "'", str34, "<size=");
        org.junit.Assert.assertNotNull(toStringStyle41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "{" + "'", str47, "{");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
// flaky "6) test1933(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\n  " + "'", str53, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(toStringStyle57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "{" + "'", str67, "{");
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = toStringStyle14.getContentStart();
        boolean boolean16 = toStringStyle14.isUseFieldNames();
        boolean boolean17 = toStringStyle14.isUseShortClassName();
        toStringStyle14.setDefaultFullDetail(true);
        boolean boolean20 = toStringStyle14.isFieldSeparatorAtEnd();
        java.lang.String str21 = toStringStyle14.getArraySeparator();
        toStringStyle14.setUseFieldNames(false);
        java.lang.String str24 = toStringStyle14.getFieldSeparator();
        boolean boolean25 = toStringStyle14.isFieldSeparatorAtStart();
        boolean boolean26 = toStringStyle14.isDefaultFullDetail();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer13, (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "280) test1934(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.SimpleToStringStyle" + "'", str6, "ToStringStyle.SimpleToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "142) test1934(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[" + "'", str15, "[");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "65) test1934(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "27) test1934(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<size=" + "'", str21, "<size=");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "281) test1935(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setNullText("}");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.MultiLineToStringStyle", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.Object[] objArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.NoFieldNameToStringStyle", objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "282) test1937(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        toStringStyle0.setContentStart("<size=");
        toStringStyle0.setArrayStart(">");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer18, "<size=", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "283) test1938(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "284) test1940(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "143) test1940(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray10 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle", byteArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10 });
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentStart("<null>");
        toStringStyle0.setSummaryObjectStartText("");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "=", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray20 = new char[] { '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, ",", charArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "285) test1943(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
// flaky "144) test1943(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str12, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', ' ' });
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        boolean boolean13 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray22 = new boolean[] { true, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "{", booleanArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray22);
        assertBooleanArrayEquals(booleanArray22, new boolean[] { true, false, false, false });
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "\n  ", byteArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 10, (byte) 100 });
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = toStringStyle13.getContentStart();
        boolean boolean15 = toStringStyle13.isUseFieldNames();
        boolean boolean16 = toStringStyle13.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle13);
        toStringStyle13.setDefaultFullDetail(false);
        toStringStyle13.setSummaryObjectEndText(">");
        toStringStyle13.setFieldSeparator("<size=");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "", (java.lang.Object) "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "286) test1946(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "145) test1946(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray15 = new double[] { 1.0d, (byte) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "ToStringStyle.DefaultToStringStyle", doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "287) test1947(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle2.setFieldNameValueSeparator("\n  ");
        toStringStyle2.setFieldNameValueSeparator("{");
        boolean boolean7 = toStringStyle2.isUseIdentityHashCode();
        java.lang.String str8 = toStringStyle2.getFieldNameValueSeparator();
        java.lang.String str9 = toStringStyle2.getFieldSeparator();
        toStringStyle0.appendIdentityHashCode(stringBuffer1, (java.lang.Object) str9);
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "\n  ", (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
// flaky "288) test1948(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=" + "'", str9, "=");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSummaryObjectEndText("hi!");
        java.lang.String str9 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "[", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "289) test1949(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle7.setFieldSeparatorAtStart(true);
        boolean boolean10 = toStringStyle7.isUseFieldNames();
        java.lang.String str11 = toStringStyle7.getArraySeparator();
        toStringStyle7.setContentEnd("[");
        toStringStyle7.setNullText(">");
        boolean boolean16 = toStringStyle7.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle7.appendSuper(stringBuffer17, ",");
        toStringStyle7.setSizeEndText("");
        boolean boolean22 = toStringStyle7.isUseClassName();
// flaky "290) test1950(org.apache.commons.lang3.builder.RegressionTest3)":         toStringStyle0.appendClassName(stringBuffer6, (java.lang.Object) boolean22);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  " + "'", str1, "\n  ");
// flaky "146) test1950(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "66) test1950(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<size=" + "'", str11, "<size=");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        char[] charArray20 = new char[] { ' ', '#', '#', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "{", charArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '#', ' ', '#' });
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setContentEnd("<null>");
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray13 = new double[] { (-1L), 1, 100, 0.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", doubleArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "291) test1952(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldNameValueSeparator("[");
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setFieldSeparator(",");
        java.lang.Class<?> wildcardClass9 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray15 = new boolean[] { false, true, false, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "[", booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { false, true, false, false, false, true });
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendToString(stringBuffer8, "}");
        java.lang.StringBuffer stringBuffer11 = null;
        short[] shortArray16 = new short[] { (byte) 10, (byte) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "[", shortArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "292) test1955(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 10, (short) 0, (short) 10 });
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setContentEnd("{");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "293) test1956(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        boolean[] booleanArray24 = new boolean[] { false, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "=", booleanArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "294) test1957(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        assertBooleanArrayEquals(booleanArray24, new boolean[] { false, true, false, false, true });
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray19 = new boolean[] { true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.NoFieldNameToStringStyle", booleanArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "295) test1958(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, false, false });
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle19.setContentStart("<null>");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str23 = toStringStyle22.getContentStart();
        boolean boolean24 = toStringStyle22.isUseFieldNames();
        java.lang.String str25 = toStringStyle22.getFieldSeparator();
        java.lang.String str26 = toStringStyle22.getContentEnd();
        boolean boolean27 = toStringStyle22.isFieldSeparatorAtEnd();
        boolean boolean28 = toStringStyle22.isFieldSeparatorAtStart();
        java.lang.String str29 = toStringStyle22.getSummaryObjectEndText();
        java.lang.Object[] objArray30 = new java.lang.Object[] { toStringStyle19, str29 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "hi!", objArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertNotNull(toStringStyle22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[" + "'", str23, "[");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{" + "'", str26, "{");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        java.lang.StringBuffer stringBuffer18 = null;
        long[] longArray23 = new long[] { (-1L), (byte) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer18, "ToStringStyle.SimpleToStringStyle", longArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { (-1L), 0L, 52L });
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        boolean boolean17 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer18, "hi!");
// flaky "296) test1961(org.apache.commons.lang3.builder.RegressionTest3)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
// flaky "147) test1961(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "67) test1961(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setContentEnd("\n  ");
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "ToStringStyle.SimpleToStringStyle", byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1 });
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
            toStringStyle0.appendNullText(stringBuffer15, "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "297) test1963(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        toStringStyle0.setSummaryObjectEndText("\n  ");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "=", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray7 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<size=", floatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getArraySeparator();
        java.lang.Class<?> wildcardClass7 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        boolean boolean14 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "\n  ", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "298) test1967(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setDefaultFullDetail(false);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray14 = new short[] { (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.SimpleToStringStyle", shortArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 0, (short) 100 });
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "<null>", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "299) test1969(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayContentDetail(true);
        java.lang.String str9 = toStringStyle0.getSizeStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.SimpleToStringStyle", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setNullText("{");
        boolean boolean12 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSizeStartText(">");
        java.lang.StringBuffer stringBuffer15 = null;
        char[] charArray23 = new char[] { '#', ' ', 'a', '#', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "{", charArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '#', ' ', 'a', '#', '4', 'a' });
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setFieldNameValueSeparator("}");
        java.lang.StringBuffer stringBuffer12 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap14 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.SimpleToStringStyle", objMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(objMap14);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setContentEnd("=");
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray15 = new short[] { (short) -1, (byte) 0, (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", shortArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "300) test1974(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) -1, (short) 0, (short) 0, (short) 1 });
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "ToStringStyle.MultiLineToStringStyle", floatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, (-1.0f), 97.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldNameValueSeparator(",");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, ",", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        java.lang.String str14 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray21 = new boolean[] { true, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, ",", booleanArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, true, false, true });
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean7 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer8 = null;
        boolean[] booleanArray13 = new boolean[] { true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { true, true, false });
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "[", byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "301) test1979(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        toStringStyle0.setUseShortClassName(false);
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{" + "'", str14, "{");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str12 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray17 = new double[] { (byte) -1, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", doubleArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "302) test1981(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "<size=", 10L);
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
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        float[] floatArray8 = new float[] { 1.0f, 100.0f, (byte) -1, (byte) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer1, "<size=", floatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 1.0f, 100.0f, (-1.0f), 0.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("hi!");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray19 = new boolean[] { false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "[", booleanArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "303) test1984(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { false, false, false });
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        toStringStyle0.setContentStart("ToStringStyle.MultiLineToStringStyle");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ",", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str8, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "}");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "304) test1986(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        boolean boolean8 = toStringStyle0.isUseClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray19 = new char[] { '4', '#', '#', '#', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "hi!", charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', '#', '#', '#', '4', 'a' });
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setSizeEndText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "ToStringStyle.NoFieldNameToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "305) test1988(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "148) test1988(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
// flaky "68) test1988(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
// flaky "28) test1988(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, ",");
        toStringStyle0.setArraySeparator("\n  ");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean15 = toStringStyle14.isUseShortClassName();
        boolean boolean16 = toStringStyle14.isUseFieldNames();
        toStringStyle14.setFieldSeparatorAtEnd(false);
        boolean boolean19 = toStringStyle14.isUseClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer12, ",", (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "306) test1989(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeStartText("hi!");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "307) test1990(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle12.setFieldSeparatorAtStart(true);
        java.lang.String str15 = toStringStyle12.getFieldSeparator();
        java.lang.String str16 = toStringStyle12.getFieldSeparator();
        boolean boolean17 = toStringStyle12.isUseIdentityHashCode();
        java.lang.String str18 = toStringStyle12.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle12.appendSuper(stringBuffer19, "=");
        toStringStyle12.setNullText("ToStringStyle.DefaultToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer10, "<size=", (java.lang.Object) "ToStringStyle.DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "308) test1991(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "149) test1991(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
// flaky "69) test1991(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "29) test1991(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "=" + "'", str8, "=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle12);
// flaky "7) test1991(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
// flaky "2) test1991(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "1) test1991(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[" + "'", str18, "[");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        java.lang.StringBuffer stringBuffer19 = null;
        float[] floatArray25 = new float[] { 10.0f, 1L, 100, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer19, ">", floatArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "309) test1992(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 10.0f, 1.0f, 100.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setFieldNameValueSeparator("=");
        boolean boolean12 = toStringStyle0.isUseClassName();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
            toStringStyle0.append(stringBuffer13, "ToStringStyle.DefaultToStringStyle", (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "310) test1994(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setContentEnd("<null>");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "}", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "311) test1995(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, ">", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer28, ">", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "312) test1997(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle19);
// flaky "150) test1997(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{" + "'", str20, "{");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<null>" + "'", str23, "<null>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) "}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray10 = new char[] { '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "<null>", charArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "313) test1999(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "151) test1999(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '#', ' ' });
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str8 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setDefaultFullDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "314) test2000(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "152) test2000(org.apache.commons.lang3.builder.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
    }
}
