package org.apache.commons.lang3.builder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.StringBuffer stringBuffer4 = null;
// flaky "1) test0501(org.apache.commons.lang3.builder.RegressionTest1)":         toStringStyle0.appendFieldStart(stringBuffer4, "<null>");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "[");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray18 = new long[] { (short) 10, 100, 10L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "<size=", longArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "1) test0501(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 10L, 100L, 10L, 10L });
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer8, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "2) test0502(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "{", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "3) test0503(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "2) test0503(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "hi!", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "4) test0504(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "3) test0504(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "1) test0504(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "1) test0504(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "=" + "'", str8, "=");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "\n  ", (java.lang.Object) toStringStyle16);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(toStringStyle16);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "5) test0506(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "4) test0506(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "2) test0506(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer14 = null;
        int[] intArray22 = new int[] { 'a', 100, (short) 100, (short) 100, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "", intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, 100, 100, 100, 1, 0 });
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str11 = toStringStyle10.getContentStart();
        boolean boolean12 = toStringStyle10.isUseFieldNames();
        boolean boolean13 = toStringStyle10.isUseShortClassName();
        toStringStyle10.setFieldSeparator("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "}", (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "6) test0508(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "5) test0508(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "3) test0508(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
// flaky "2) test0508(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "\n  ", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "7) test0509(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "6) test0509(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "8) test0510(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "7) test0510(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "4) test0510(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray10 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "", shortArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] {});
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.String str4 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle7.setNullText(">");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle7.appendSuper(stringBuffer10, "=");
        toStringStyle7.setArrayContentDetail(true);
        toStringStyle7.setUseShortClassName(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "}", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "9) test0512(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "8) test0512(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "10) test0513(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "{", (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "11) test0514(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "9) test0514(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, ">", (int) (short) -1);
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "[", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "12) test0516(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray22 = new boolean[] { false, true, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, ">", booleanArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "13) test0517(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "10) test0517(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(booleanArray22);
        assertBooleanArrayEquals(booleanArray22, new boolean[] { false, true, false, true, false });
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer3 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "{", byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "14) test0518(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10 });
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        long[] longArray3 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer1, "[", longArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] {});
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) str5);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}" + "'", str5, "}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray10 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "{", floatArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "{", doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "15) test0522(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
            toStringStyle0.appendDetail(stringBuffer15, "{", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentStart("<null>");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "\n  ", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray18 = new short[] { (byte) -1, (short) 10, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "[", shortArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "16) test0526(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "11) test0526(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) -1, (short) 10, (short) -1, (short) 0 });
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray12 = new long[] { 0, (byte) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "}", longArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "17) test0527(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "12) test0527(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L, 100L, 100L });
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
            toStringStyle0.appendContentEnd(stringBuffer11);
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setNullText("\n  ");
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.Object obj15 = null;
        toStringStyle0.appendStart(stringBuffer14, obj15);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle7.setFieldSeparatorAtStart(true);
        java.lang.String str10 = toStringStyle7.getFieldSeparator();
        java.lang.String str11 = toStringStyle7.getFieldSeparator();
        toStringStyle7.setUseClassName(true);
        boolean boolean15 = toStringStyle7.isFullDetail((java.lang.Boolean) false);
        boolean boolean16 = toStringStyle7.isArrayContentDetail();
        boolean boolean17 = toStringStyle7.isFieldSeparatorAtStart();
        boolean boolean18 = toStringStyle7.isUseShortClassName();
        toStringStyle7.setArraySeparator("{");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "", (java.lang.Object) toStringStyle7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "hi!", doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "18) test0531(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "13) test0531(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer10, "ToStringStyle.MultiLineToStringStyle");
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        int[] intArray15 = new int[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "", intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "19) test0533(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "14) test0533(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
// flaky "5) test0533(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 10 });
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray20 = new char[] { 'a', ' ', '4', ' ', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", charArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
// flaky "20) test0534(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', ' ', '4', ' ', '4', '#' });
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.MultiLineToStringStyle", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "21) test0535(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<null>", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "22) test0536(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<null>", byteArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "23) test0537(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle8.setFieldNameValueSeparator("\n  ");
        toStringStyle8.setFieldNameValueSeparator("{");
        boolean boolean13 = toStringStyle8.isUseIdentityHashCode();
        java.lang.String str14 = toStringStyle8.getFieldNameValueSeparator();
        toStringStyle8.setFieldNameValueSeparator("{");
        boolean boolean17 = toStringStyle8.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str19 = toStringStyle18.getContentStart();
        boolean boolean20 = toStringStyle18.isUseFieldNames();
        boolean boolean21 = toStringStyle18.isUseShortClassName();
        toStringStyle18.setDefaultFullDetail(true);
        boolean boolean24 = toStringStyle18.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer25 = null;
        toStringStyle18.appendSuper(stringBuffer25, ",");
        java.lang.Object[] objArray28 = new java.lang.Object[] { boolean17, "," };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, ",", objArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "24) test0538(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str5, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{" + "'", str14, "{");
// flaky "15) test0538(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(toStringStyle18);
// flaky "6) test0538(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray28);
// flaky "3) test0538(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[true, ,]");
// flaky "1) test0538(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[true, ,]");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "<size=", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        char[] charArray7 = new char[] { '#', 'a', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "{", charArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a', '4', '4' });
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer5 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<null>", byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = toStringStyle13.getContentStart();
        toStringStyle13.setArrayEnd("\n  ");
        boolean boolean17 = toStringStyle13.isUseIdentityHashCode();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer12, (java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(toStringStyle13);
// flaky "25) test0542(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{" + "'", str14, "{");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.MultiLineToStringStyle", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "<null>", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "26) test0544(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "16) test0544(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayEnd("=");
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray13 = new long[] { (short) 10, (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "{", longArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "27) test0545(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 10L, 0L, 0L });
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.String str7 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray14 = new short[] { (short) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ",", shortArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "28) test0546(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 0, (short) -1 });
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        java.lang.StringBuffer stringBuffer15 = null;
        int[] intArray17 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "[", intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "29) test0547(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "17) test0547(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldSeparator(",");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "ToStringStyle.MultiLineToStringStyle", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "30) test0549(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        toStringStyle0.setSizeEndText(">");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray13 = new int[] { '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 0 });
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "31) test0552(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentStart("<null>");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, ">", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArrayEnd("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray11 = new short[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "hi!", shortArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<size=" + "'", str5, "<size=");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) -1 });
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "[", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "[", (java.lang.Object) (-1L), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "{", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "32) test0558(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray14 = new int[] { (-1), 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", intArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 100 });
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray16 = new float[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 52.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray19 = new double[] { (-1.0d), (-1.0d), 1, (short) 100, 100.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, ">", doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "33) test0561(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), (-1.0d), 1.0d, 100.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "34) test0562(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer9, "", (java.lang.Object) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "35) test0563(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str7 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray11 = new short[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "", shortArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "36) test0564(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "18) test0564(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[" + "'", str7, "[");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 100 });
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer11 = null;
        float[] floatArray16 = new float[] { (short) 1, (-1), 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer11, "<null>", floatArray16);
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
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, (-1.0f), 97.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setSizeEndText("=");
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray17 = new short[] { (short) 0, (short) -1, (byte) 1, (byte) 1, (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", shortArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 0, (short) -1, (short) 1, (short) 1, (short) 1, (short) 0 });
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, ">", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) 100);
// flaky "37) test0568(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<null>", longArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray15 = new int[] { (short) 0, (byte) 10, (byte) -1, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "}", intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 10, (-1), 1, 10 });
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayEnd("}");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "=", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        java.lang.StringBuffer stringBuffer14 = null;
        double[] doubleArray18 = new double[] { ' ', 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "ToStringStyle.MultiLineToStringStyle", doubleArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setContentStart("{");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer9, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "38) test0573(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "19) test0573(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSuper(stringBuffer9, "<size=");
// flaky "39) test0574(org.apache.commons.lang3.builder.RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "20) test0574(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "40) test0575(org.apache.commons.lang3.builder.RegressionTest1)":         toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, ">", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "21) test0575(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{" + "'", str13, "{");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "=", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
// flaky "41) test0576(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "22) test0576(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "{", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "42) test0577(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle5.setFieldNameValueSeparator("\n  ");
        toStringStyle5.setFieldNameValueSeparator("{");
        toStringStyle5.setFieldSeparatorAtStart(false);
        boolean boolean12 = toStringStyle5.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle5);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer3, "<size=", (java.lang.Object) toStringStyle5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "<size=", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setSizeEndText("=");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "}", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "\n  ", obj11, (java.lang.Boolean) false);
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
// flaky "43) test0581(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray10 = new int[] { (byte) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "\n  ", intArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 1, 52 });
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer3 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "[", objMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objMap5);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray15 = new char[] { '4', '#', ' ', ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "{", charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "44) test0584(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', ' ', ' ', '#', 'a' });
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setSummaryObjectEndText("{");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray18 = new short[] { (byte) -1, (short) -1, (short) -1, (byte) -1, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "\n  ", shortArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) -1, (short) -1, (short) -1, (short) -1, (short) 1, (short) 10 });
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray14 = new char[] { 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "\n  ", charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', '4', 'a' });
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray20 = new long[] { 1, 10, 0L, (byte) -1, (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, ">", longArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L, 10L, 0L, (-1L), 100L, 1L });
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle15.setFieldSeparatorAtStart(true);
        java.lang.String str18 = toStringStyle15.getFieldSeparator();
        java.lang.String str19 = toStringStyle15.getFieldSeparator();
        toStringStyle15.setArrayEnd("hi!");
        toStringStyle15.setFieldSeparatorAtStart(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer13, "hi!", (java.lang.Object) toStringStyle15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "\n  ", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str9 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean10 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray17 = new int[] { 100, (byte) 1, (short) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "\n  ", intArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 100, 1, (-1), 10 });
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer4, ",");
// flaky "45) test0592(org.apache.commons.lang3.builder.RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end 0, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "23) test0592(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray13 = new float[] { (short) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<size=", floatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "46) test0593(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 0.0f, (-1.0f), 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray14 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, ">", longArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "47) test0594(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle5.setFieldNameValueSeparator("\n  ");
        toStringStyle5.setFieldNameValueSeparator("{");
        boolean boolean10 = toStringStyle5.isUseIdentityHashCode();
        java.lang.String str11 = toStringStyle5.getFieldNameValueSeparator();
        toStringStyle5.setFieldNameValueSeparator("{");
        toStringStyle5.setSizeStartText(",");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, ">", (java.lang.Object) toStringStyle5, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "hi!", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "48) test0596(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle.register(obj0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray15 = new long[] { (short) -1, '#', (short) 100, 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "hi!", longArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { (-1L), 35L, 100L, 1L, (-1L) });
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray11 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "<size=", doubleArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle8.setFieldNameValueSeparator("\n  ");
        toStringStyle8.setFieldNameValueSeparator("{");
        boolean boolean13 = toStringStyle8.isUseIdentityHashCode();
        java.lang.String str14 = toStringStyle8.getSummaryObjectEndText();
        toStringStyle8.setArrayEnd(",");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer7, (java.lang.Object) ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "=", byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
// flaky "49) test0601(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer6, "ToStringStyle.MultiLineToStringStyle", (int) (short) 10);
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
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray16 = new double[] { 10, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, ">", doubleArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray16 = new long[] { '4', 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.MultiLineToStringStyle", longArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "50) test0604(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 52L, 10L });
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendFieldStart(stringBuffer4, "<null>");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean10 = toStringStyle9.isFieldSeparatorAtEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer7, ">", (java.lang.Object) toStringStyle9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray17 = new float[] { 1.0f, 1L, (byte) 1, 0L, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, ",", floatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "51) test0606(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 1.0f, 1.0f, 1.0f, 0.0f, 35.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray14 = new int[] { (short) 0, (byte) 0, 'a', 'a', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, ",", intArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0, 0, 97, 97, 0 });
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "\n  ", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle9.setNullText(">");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle9.appendSuper(stringBuffer12, "=");
        toStringStyle9.setArrayContentDetail(true);
        toStringStyle9.setUseShortClassName(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, ",", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        short[] shortArray19 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "[", shortArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] {});
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str11 = toStringStyle10.getSizeStartText();
        toStringStyle10.setContentStart("[");
        boolean boolean14 = toStringStyle10.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "", (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "52) test0611(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
// flaky "24) test0611(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer9 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "hi!", objMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objMap11);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "<null>", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "53) test0614(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray15 = new boolean[] { false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "<null>", booleanArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { false, true, false });
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setSummaryObjectStartText("[");
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray16 = new float[] { 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "hi!", floatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 0.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText(",");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray17 = new boolean[] { false, true, true, false, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "}", booleanArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { false, true, true, false, true, true });
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText(",");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray17 = new int[] { 0, (byte) -1, 'a', (short) 10, 'a', 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "", intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, (-1), 97, 10, 97, 10 });
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
            toStringStyle0.append(stringBuffer11, "[", 'a');
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "=", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        toStringStyle0.setSizeStartText("=");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer11, "{");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "54) test0621(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setContentEnd(",");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer8);
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "<size=");
        toStringStyle0.setSummaryObjectStartText("=");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray17 = new long[] { (short) 0, 100L, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "}", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L, 100L, (-1L) });
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str13 = toStringStyle12.getContentStart();
        boolean boolean14 = toStringStyle12.isUseFieldNames();
        boolean boolean15 = toStringStyle12.isUseShortClassName();
        toStringStyle12.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle12.appendFieldStart(stringBuffer18, ">");
        toStringStyle12.setNullText(",");
        java.lang.String str23 = toStringStyle12.getSummaryObjectEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "", (java.lang.Object) str23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "55) test0624(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[" + "'", str23, "[");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
            toStringStyle0.append(stringBuffer10, "[", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{" + "'", str4, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) str7);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "{", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        boolean[] booleanArray20 = new boolean[] { false, true, true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "<null>", booleanArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "56) test0628(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
// flaky "25) test0628(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "7) test0628(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray20);
        assertBooleanArrayEquals(booleanArray20, new boolean[] { false, true, true, true, false, false });
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "\n  ", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "57) test0629(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "26) test0629(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        toStringStyle0.setNullText("\n  ");
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle7.setFieldSeparatorAtStart(true);
        java.lang.String str10 = toStringStyle7.getFieldSeparator();
        toStringStyle0.appendIdentityHashCode(stringBuffer6, (java.lang.Object) str10);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "58) test0630(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle0.getArraySeparator();
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ">", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "59) test0631(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}" + "'", str3, "}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n  " + "'", str8, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "{", (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer7, "<null>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "60) test0633(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
// flaky "27) test0633(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
            toStringStyle0.appendFieldEnd(stringBuffer12, "\n  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "61) test0634(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray12 = new double[] { (byte) 0, 100.0f, '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "<size=", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "62) test0635(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
// flaky "28) test0635(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 100.0d, 52.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        char[] charArray19 = new char[] { '#', '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "hi!", charArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "63) test0636(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
// flaky "29) test0636(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', 'a', '#' });
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer4 = null;
        boolean[] booleanArray8 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "<size=", booleanArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(booleanArray8);
        assertBooleanArrayEquals(booleanArray8, new boolean[] { true, true });
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.String str10 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldSeparator("\n  ");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray16 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "}", charArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "64) test0638(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4' });
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray11 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "\n  ", booleanArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "65) test0639(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "30) test0639(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { false, false });
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setArraySeparator("");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "<size=", floatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "66) test0640(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, ",", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "67) test0641(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "=", objMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objMap12);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer8, "ToStringStyle.MultiLineToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "68) test0644(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "31) test0644(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "69) test0645(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "32) test0645(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "8) test0645(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "=", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray12 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "{", booleanArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(booleanArray12);
        assertBooleanArrayEquals(booleanArray12, new boolean[] {});
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseClassName(true);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) true);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) ",");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.lang.String str16 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer17 = null;
        byte[] byteArray19 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer17, "ToStringStyle.MultiLineToStringStyle", byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "70) test0650(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "33) test0650(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendFieldStart(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "[", doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray22 = new long[] { (short) 1, '#', 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "ToStringStyle.MultiLineToStringStyle", longArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{" + "'", str8, "{");
// flaky "71) test0652(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">" + "'", str13, ">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ">" + "'", str14, ">");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 1L, 35L, 0L, 0L });
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray17 = new short[] { (short) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "<null>", shortArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 100, (short) 0, (short) 0 });
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray9 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "ToStringStyle.MultiLineToStringStyle", booleanArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "72) test0655(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(booleanArray9);
        assertBooleanArrayEquals(booleanArray9, new boolean[] { false });
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray14 = new int[] { (byte) 10, (short) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "}", intArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "73) test0656(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 10, 1, 0 });
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
            toStringStyle0.appendNullText(stringBuffer10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setArraySeparator(",");
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "}", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=" + "'", str5, "=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n  " + "'", str8, "\n  ");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray11 = new char[] { '4', '4', ' ', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "<null>", charArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', ' ', 'a', ' ' });
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray11 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "{", booleanArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "74) test0661(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] {});
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray18 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "", longArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "75) test0662(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] {});
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "hi!", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "76) test0663(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        toStringStyle0.setSizeEndText(">");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray9 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "", shortArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray22 = new long[] { (short) 10, 100L, (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "hi!", longArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "77) test0665(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 10L, 100L, (-1L), (-1L) });
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "", objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "78) test0666(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "\n  ", false);
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
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "hi!", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "79) test0668(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<size=" + "'", str10, "<size=");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "<null>", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "80) test0669(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "34) test0669(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle15.setNullText(">");
        toStringStyle15.setSummaryObjectStartText("");
        java.lang.String str20 = toStringStyle15.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer13, "}", (java.lang.Object) str20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "81) test0670(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "35) test0670(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "=" + "'", str20, "=");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendToString(stringBuffer7, "\n  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
            toStringStyle0.append(stringBuffer13, "<size=", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "82) test0672(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "36) test0672(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<size=" + "'", str12, "<size=");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str16 = toStringStyle15.getContentStart();
        boolean boolean17 = toStringStyle15.isUseFieldNames();
        boolean boolean18 = toStringStyle15.isUseShortClassName();
        toStringStyle15.setDefaultFullDetail(true);
        boolean boolean21 = toStringStyle15.isFieldSeparatorAtEnd();
        toStringStyle15.setSummaryObjectStartText("=");
        java.lang.String str24 = toStringStyle15.getFieldNameValueSeparator();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle25.setFieldNameValueSeparator("\n  ");
        boolean boolean28 = toStringStyle25.isArrayContentDetail();
        boolean boolean30 = toStringStyle25.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle32 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle32.setFieldSeparatorAtStart(true);
        boolean boolean35 = toStringStyle32.isUseFieldNames();
        toStringStyle32.setUseIdentityHashCode(false);
        java.lang.String str38 = toStringStyle32.getSummaryObjectEndText();
        java.lang.String str39 = toStringStyle32.getArraySeparator();
        toStringStyle32.setArrayStart("hi!");
        java.lang.String str42 = toStringStyle32.getArrayEnd();
        toStringStyle32.setArrayEnd("[");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle45 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle45.setFieldNameValueSeparator("\n  ");
        toStringStyle45.setFieldNameValueSeparator("{");
        toStringStyle45.setUseIdentityHashCode(false);
        toStringStyle45.setFieldSeparator("");
        toStringStyle45.setSizeEndText("=");
        java.lang.Object[] objArray56 = new java.lang.Object[] { 100L, str24, false, (byte) 100, "[", toStringStyle45 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "=", objArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "83) test0674(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "37) test0674(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "," + "'", str24, ",");
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(toStringStyle32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky "9) test0674(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[" + "'", str38, "[");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "," + "'", str39, ",");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n  " + "'", str42, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle45);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer11, "ToStringStyle.MultiLineToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray9 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "{", booleanArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "84) test0676(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanArray9);
        assertBooleanArrayEquals(booleanArray9, new boolean[] {});
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "\n  ", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentStart("<null>");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray19 = new float[] { 0L, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", floatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "85) test0679(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 0.0f, 1.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("\n  ");
        toStringStyle10.setFieldNameValueSeparator("{");
        boolean boolean15 = toStringStyle10.isUseIdentityHashCode();
        toStringStyle10.setSummaryObjectStartText(">");
        toStringStyle10.setSizeEndText("=");
        toStringStyle10.setFieldSeparator("[");
        toStringStyle10.setFieldSeparator(">");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer8, "{", (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "86) test0680(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "38) test0680(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendFieldStart(stringBuffer4, "{");
        java.lang.String str7 = toStringStyle0.getSizeStartText();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        toStringStyle0.setSizeEndText(">");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray11 = new int[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "}", intArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1), 0 });
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle12.setFieldNameValueSeparator("\n  ");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "\n  ", (java.lang.Object) "\n  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "87) test0683(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(toStringStyle12);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle9.setFieldSeparatorAtStart(true);
        java.lang.String str12 = toStringStyle9.getFieldSeparator();
        java.lang.String str13 = toStringStyle9.getFieldSeparator();
        toStringStyle9.setUseClassName(true);
        boolean boolean17 = toStringStyle9.isFullDetail((java.lang.Boolean) false);
        toStringStyle9.setArrayStart(">");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer8, (java.lang.Object) toStringStyle9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "88) test0684(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray9 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", charArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer4, "[", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle5.setFieldSeparatorAtStart(true);
        java.lang.String str8 = toStringStyle5.getFieldSeparator();
        java.lang.String str9 = toStringStyle5.getFieldSeparator();
        toStringStyle5.setUseClassName(true);
        boolean boolean13 = toStringStyle5.isFullDetail((java.lang.Boolean) false);
        boolean boolean14 = toStringStyle5.isArrayContentDetail();
        boolean boolean15 = toStringStyle5.isFieldSeparatorAtStart();
        toStringStyle5.setSizeEndText("");
        java.lang.String str18 = toStringStyle5.getSummaryObjectEndText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer3, "\n  ", (java.lang.Object) str18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "89) test0687(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[" + "'", str18, "[");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "<size=");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "<size=", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "90) test0689(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "{", charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentEnd("");
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "91) test0691(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer15 = null;
        long[] longArray17 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "{", longArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] {});
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        short[] shortArray21 = new short[] { (byte) 0, (short) 1, (byte) -1, (short) 100, (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "\n  ", shortArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "92) test0693(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "39) test0693(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 0, (short) 1, (short) -1, (short) 100, (short) 10, (short) -1 });
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, ">", charArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "\n  ", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "", (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ">" + "'", str3, ">");
// flaky "93) test0696(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendFieldStart(stringBuffer7, "");
        java.lang.String str10 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, ",", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[" + "'", str10, "[");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        java.lang.String str8 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str12 = toStringStyle11.getContentStart();
        boolean boolean13 = toStringStyle11.isUseFieldNames();
        boolean boolean14 = toStringStyle11.isFieldSeparatorAtEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "", obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<null>", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "94) test0700(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle10.setFieldNameValueSeparator("\n  ");
        toStringStyle10.setFieldNameValueSeparator("{");
        boolean boolean15 = toStringStyle10.isUseIdentityHashCode();
        java.lang.String str16 = toStringStyle10.getFieldNameValueSeparator();
        toStringStyle10.setFieldNameValueSeparator("{");
        toStringStyle10.setContentEnd(">");
        toStringStyle10.setFieldSeparator("=");
        toStringStyle10.setContentEnd("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer9, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "}", byteArray5, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1 });
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer7);
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "=", doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "", (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "\n  ", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
            toStringStyle0.append(stringBuffer11, ">", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "95) test0708(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<size=", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray13 = new long[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ">", longArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 0L });
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "96) test0712(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer11, "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray16 = new short[] { (short) 1, (short) -1, (byte) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", shortArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 1, (short) -1, (short) 10, (short) 1 });
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        java.lang.StringBuffer stringBuffer3 = null;
        float[] floatArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer3, "[", floatArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray15 = new short[] { (short) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "\n  ", shortArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) -1, (short) 0, (short) -1 });
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.Class<?> wildcardClass10 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "97) test0718(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray13 = new float[] { 1, (byte) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "{", floatArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "98) test0719(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "40) test0719(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "10) test0719(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str4, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 1.0f, (-1.0f), 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str16 = toStringStyle15.getContentStart();
        boolean boolean17 = toStringStyle15.isUseFieldNames();
        boolean boolean18 = toStringStyle15.isUseShortClassName();
        toStringStyle15.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle15.appendFieldStart(stringBuffer21, ">");
        java.lang.String str24 = toStringStyle15.getFieldSeparator();
        java.lang.String str25 = toStringStyle15.getSummaryObjectStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<size=", (java.lang.Object) str25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "99) test0720(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "41) test0720(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
// flaky "11) test0720(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "4) test0720(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
// flaky "2) test0720(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
        org.junit.Assert.assertNotNull(toStringStyle15);
// flaky "1) test0720(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<size=" + "'", str16, "<size=");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ">" + "'", str25, ">");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, 100.0d, (short) -1, 10.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", doubleArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 100.0d, (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        boolean boolean14 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean17 = toStringStyle16.isUseShortClassName();
        java.lang.String str18 = toStringStyle16.getFieldSeparator();
        toStringStyle16.setSummaryObjectStartText(">");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer15, (java.lang.Object) ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "100) test0723(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray12 = new int[] { (byte) 0, 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "{", intArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 1, 10 });
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.MultiLineToStringStyle", (short) (byte) -1);
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
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setArrayEnd("ToStringStyle.MultiLineToStringStyle");
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean13 = toStringStyle12.isUseShortClassName();
        toStringStyle12.setContentEnd("");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean17 = toStringStyle16.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle18.setFieldSeparatorAtStart(true);
        java.lang.String str21 = toStringStyle18.getFieldSeparator();
        java.lang.String str22 = toStringStyle18.getFieldSeparator();
        boolean boolean23 = toStringStyle18.isUseIdentityHashCode();
        toStringStyle18.setSummaryObjectStartText("[");
        toStringStyle18.setUseClassName(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle28.setFieldSeparatorAtStart(true);
        java.lang.String str31 = toStringStyle28.getFieldSeparator();
        java.lang.Object[] objArray32 = new java.lang.Object[] { (byte) 1, "", toStringStyle16, true, str31 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ",", objArray32, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(toStringStyle28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        java.lang.StringBuffer stringBuffer14 = null;
        boolean[] booleanArray21 = new boolean[] { true, true, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "hi!", booleanArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
// flaky "101) test0727(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { true, true, false, true, false });
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
            toStringStyle0.append(stringBuffer10, "\n  ", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "102) test0728(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
            toStringStyle0.append(stringBuffer15, ",", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.String str5 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "}", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str5, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str9 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray15 = new short[] { (short) 0, (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "hi!", shortArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 0, (short) 10, (short) 0 });
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        java.lang.StringBuffer stringBuffer16 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, ">", objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "103) test0732(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "[", (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "104) test0733(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ",", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ">", byteArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) boolean2);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "105) test0736(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str17 = toStringStyle16.getSizeStartText();
        toStringStyle16.setContentStart("[");
        boolean boolean20 = toStringStyle16.isUseShortClassName();
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle16.appendSuper(stringBuffer21, "");
        boolean boolean24 = toStringStyle16.isUseClassName();
        java.lang.String str25 = toStringStyle16.getContentStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ">", (java.lang.Object) toStringStyle16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "=" + "'", str17, "=");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[" + "'", str25, "[");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle28.setFieldSeparatorAtStart(true);
        java.lang.String str31 = toStringStyle28.getFieldSeparator();
        java.lang.String str32 = toStringStyle28.getFieldSeparator();
        java.lang.String str33 = toStringStyle28.getSizeStartText();
        toStringStyle28.setContentEnd("<size=");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle36 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle36.setFieldNameValueSeparator("\n  ");
        boolean boolean39 = toStringStyle36.isArrayContentDetail();
        java.lang.String str40 = toStringStyle36.getFieldSeparator();
        boolean boolean41 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle36);
        java.lang.String str42 = toStringStyle36.getSummaryObjectStartText();
        toStringStyle36.setArrayEnd("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle46 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle46.setFieldNameValueSeparator("\n  ");
        toStringStyle46.setFieldNameValueSeparator("{");
        boolean boolean51 = toStringStyle46.isUseIdentityHashCode();
        toStringStyle46.setSummaryObjectStartText(">");
        toStringStyle46.setSizeEndText("=");
        toStringStyle46.setFieldSeparator("[");
        toStringStyle46.setSummaryObjectStartText(",");
        java.lang.String str60 = toStringStyle46.getSummaryObjectStartText();
        boolean boolean61 = toStringStyle46.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle62 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle62.setFieldSeparatorAtStart(true);
        java.lang.Object[] objArray65 = new java.lang.Object[] { boolean27, "<size=", toStringStyle36, 0.0d, boolean61, toStringStyle62 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "{", objArray65, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "106) test0738(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<size=" + "'", str13, "<size=");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(toStringStyle28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
// flaky "42) test0738(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[" + "'", str33, "[");
        org.junit.Assert.assertNotNull(toStringStyle36);
// flaky "12) test0738(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "=" + "'", str40, "=");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "," + "'", str42, ",");
        org.junit.Assert.assertNotNull(toStringStyle46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "," + "'", str60, ",");
// flaky "5) test0738(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(toStringStyle62);
        org.junit.Assert.assertNotNull(objArray65);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "}", (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("\n  ");
        toStringStyle14.setFieldNameValueSeparator("{");
        toStringStyle14.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle14.appendIdentityHashCode(stringBuffer21, (java.lang.Object) 1.0f);
        toStringStyle14.setFieldNameValueSeparator(">");
        java.lang.String str26 = toStringStyle14.getContentEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "=", (java.lang.Object) str26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ">" + "'", str26, ">");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray10 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, ",", charArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ' });
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray13 = new float[] { (short) 100, '4', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "<size=", floatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 100.0f, 52.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray12 = new double[] { (-1.0d), 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, ",", doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "107) test0743(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArraySeparator("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer12, "[");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "108) test0745(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ",", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayStart(">");
        toStringStyle0.setContentEnd("{");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray18 = new short[] { (short) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "[", shortArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 1, (short) -1, (short) 100 });
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.String str6 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray15 = new float[] { (-1L), 1L, 0, (-1L), 100.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "}", floatArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { (-1.0f), 1.0f, 0.0f, (-1.0f), 100.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setFieldSeparator(">");
        toStringStyle0.setFieldNameValueSeparator("");
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray24 = new char[] { ' ', ' ', ' ', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, "\n  ", charArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', ' ', ' ', '4', ' ', '4' });
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "hi!", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray14 = new boolean[] { true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "\n  ", booleanArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, false });
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "[");
        toStringStyle0.setSizeEndText("\n  ");
        java.lang.StringBuffer stringBuffer14 = null;
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "", doubleArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        java.lang.StringBuffer stringBuffer16 = null;
        short[] shortArray22 = new short[] { (byte) 1, (short) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer16, "<size=", shortArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n  " + "'", str14, "\n  ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n  " + "'", str15, "\n  ");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 1, (short) 100, (short) 0, (short) -1 });
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle3.setFieldNameValueSeparator("\n  ");
        boolean boolean6 = toStringStyle3.isArrayContentDetail();
        boolean boolean8 = toStringStyle3.isFullDetail((java.lang.Boolean) false);
        java.lang.String str9 = toStringStyle3.getFieldSeparator();
        toStringStyle3.setDefaultFullDetail(true);
        toStringStyle3.setUseClassName(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) toStringStyle3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertNotNull(toStringStyle3);
// flaky "109) test0755(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "=", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setArrayContentDetail(false);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "110) test0757(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean8 = toStringStyle0.isUseClassName();
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle11.setFieldNameValueSeparator("\n  ");
        boolean boolean14 = toStringStyle11.isArrayContentDetail();
        toStringStyle11.setContentEnd(",");
        boolean boolean17 = toStringStyle11.isUseIdentityHashCode();
        java.lang.String str18 = toStringStyle11.getFieldNameValueSeparator();
        boolean boolean19 = toStringStyle11.isFieldSeparatorAtEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer10, (java.lang.Object) toStringStyle11);
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
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n  " + "'", str18, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSizeStartText(",");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "111) test0759(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "43) test0759(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer5, ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray14 = new long[] { 0L, 10, 0, 0L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "hi!", longArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 0L, 10L, 0L, 0L, (-1L) });
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray14 = new long[] { 'a', 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "=", longArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 97L, 10L });
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray13 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "<size=", doubleArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "112) test0765(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str7 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "113) test0766(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setArrayStart("hi!");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray15 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, ",", charArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
// flaky "114) test0767(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str7, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#' });
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setUseClassName(false);
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray17 = new boolean[] { true, true, false, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "\n  ", booleanArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { true, true, false, true, true, false });
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ">", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<size=" + "'", str6, "<size=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) (-1L));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) str13);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "115) test0771(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "44) test0771(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        java.lang.StringBuffer stringBuffer14 = null;
        long[] longArray20 = new long[] { (short) 10, (-1), (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "=", longArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "116) test0772(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 10L, (-1L), (-1L), 1L });
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentStart("hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "}", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "\n  ", obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle17.setFieldSeparatorAtStart(true);
        boolean boolean20 = toStringStyle17.isUseFieldNames();
        java.lang.String str21 = toStringStyle17.getArraySeparator();
        toStringStyle17.setContentEnd("[");
        toStringStyle17.setDefaultFullDetail(true);
        boolean boolean26 = toStringStyle17.isArrayContentDetail();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle27.setFieldSeparatorAtStart(true);
        java.lang.String str30 = toStringStyle27.getFieldSeparator();
        java.lang.String str31 = toStringStyle27.getFieldSeparator();
        toStringStyle27.setUseClassName(true);
        boolean boolean35 = toStringStyle27.isFullDetail((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass36 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle37 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle37.setFieldNameValueSeparator("\n  ");
        toStringStyle37.setFieldNameValueSeparator("{");
        boolean boolean42 = toStringStyle37.isUseClassName();
        java.lang.String str43 = toStringStyle37.getSizeEndText();
        java.lang.String str44 = toStringStyle37.getFieldNameValueSeparator();
        toStringStyle37.setArraySeparator(">");
        toStringStyle37.setArraySeparator("{");
        java.lang.Object[] objArray49 = new java.lang.Object[] { boolean26, toStringStyle27, "{" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, ",", objArray49, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "117) test0776(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str21, "ToStringStyle.MultiLineToStringStyle");
// flaky "45) test0776(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(toStringStyle37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "=" + "'", str43, "=");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "{" + "'", str44, "{");
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayEnd("}");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "<size=");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[" + "'", str1, "[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        toStringStyle0.setSizeEndText(">");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "\n  ", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = toStringStyle14.getContentStart();
        boolean boolean16 = toStringStyle14.isUseFieldNames();
        boolean boolean17 = toStringStyle14.isUseShortClassName();
        toStringStyle14.setFieldSeparator("hi!");
        toStringStyle14.setNullText("");
        boolean boolean22 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle14);
        java.lang.String str23 = toStringStyle14.getSizeStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer13, (java.lang.Object) str23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[" + "'", str3, "[");
// flaky "118) test0780(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str8, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str15, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "," + "'", str23, ",");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, ">", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "119) test0781(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentStart("[");
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray9 = new long[] { (byte) -1, '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", longArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { (-1L), 52L, 0L });
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "<null>", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "120) test0783(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer8 = null;
        char[] charArray13 = new char[] { ' ', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "hi!", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "121) test0784(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { ' ', 'a', 'a' });
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setArraySeparator("");
        java.lang.String str13 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "[", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "122) test0785(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<null>", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
            toStringStyle0.appendToString(stringBuffer12, "<null>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "123) test0787(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "<size=", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
// flaky "124) test0788(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.String str3 = toStringStyle0.getArraySeparator();
        java.lang.Class<?> wildcardClass4 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer7, "\n  ", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "125) test0790(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray16 = new boolean[] { true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "", booleanArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { true, false });
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "126) test0792(org.apache.commons.lang3.builder.RegressionTest1)":         toStringStyle0.appendFieldStart(stringBuffer6, ">");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        java.lang.String str10 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray16 = new double[] { 100, (short) 0, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "{", doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "46) test0792(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "13) test0792(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray9 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "{", booleanArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "127) test0793(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(booleanArray9);
        assertBooleanArrayEquals(booleanArray9, new boolean[] { false });
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer2, "<null>", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
            toStringStyle0.appendDetail(stringBuffer17, "ToStringStyle.MultiLineToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "128) test0795(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "47) test0795(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "14) test0795(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str16, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.String str8 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "", byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "129) test0796(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "48) test0796(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setNullText("<size=");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, ">", doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText(">");
        toStringStyle0.setSizeEndText("=");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray14 = new int[] { (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", intArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 10 });
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, ",");
        java.lang.String str10 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer11 = null;
        double[] doubleArray18 = new double[] { (-1L), 'a', 1.0d, '#', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "hi!", doubleArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "130) test0799(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "49) test0799(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "15) test0799(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "6) test0799(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 97.0d, 1.0d, 35.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle14.setFieldSeparatorAtStart(true);
        java.lang.String str17 = toStringStyle14.getContentStart();
        toStringStyle14.setNullText(",");
        toStringStyle14.setFieldSeparatorAtStart(true);
        java.lang.String str22 = toStringStyle14.getArraySeparator();
        boolean boolean23 = toStringStyle14.isDefaultFullDetail();
        toStringStyle14.setContentStart("ToStringStyle.MultiLineToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer12, "{", (java.lang.Object) "ToStringStyle.MultiLineToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "131) test0800(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky "50) test0800(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "16) test0800(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "7) test0800(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "3) test0800(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky "2) test0800(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str22, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        boolean boolean13 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        java.util.Map<java.lang.Object, java.lang.Object> objMap19 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "<null>", objMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "132) test0802(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "51) test0802(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "17) test0802(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertNotNull(objMap19);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        java.lang.StringBuffer stringBuffer15 = null;
        long[] longArray19 = new long[] { 1L, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "", longArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
// flaky "133) test0803(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "52) test0803(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L, 0L });
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        java.lang.StringBuffer stringBuffer11 = null;
        long[] longArray13 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "=", longArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "134) test0804(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] {});
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldNameValueSeparator(",");
        toStringStyle0.setSizeStartText("=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "135) test0805(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "136) test0806(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectStartText(">");
        java.lang.StringBuffer stringBuffer5 = null;
        float[] floatArray10 = new float[] { (short) 100, (byte) 10, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "", floatArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 100.0f, 10.0f, 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        toStringStyle0.setArrayStart(",");
        boolean boolean11 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray20 = new short[] { (byte) 1, (short) 0, (short) 1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "<size=", shortArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 1, (short) 0, (short) 1, (short) 100, (short) 1, (short) 0 });
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArraySeparator("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = toStringStyle9.getContentStart();
        toStringStyle9.setArrayEnd("\n  ");
        boolean boolean13 = toStringStyle9.isUseIdentityHashCode();
        toStringStyle9.setFieldNameValueSeparator(">");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer8, (java.lang.Object) ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str10, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "\n  ", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[" + "'", str14, "[");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        toStringStyle0.setSummaryObjectStartText("<null>");
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray16 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, ",", byteArray16, (java.lang.Boolean) true);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ">" + "'", str11, ">");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "137) test0812(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "hi!", 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle9.setContentStart("<null>");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, ",", (java.lang.Object) "<null>", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "138) test0814(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "<size=", floatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str5 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray10 = new double[] { (byte) 1, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, ">", doubleArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "139) test0816(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n  " + "'", str5, "\n  ");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer5 = null;
        int[] intArray9 = new int[] { (short) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "}", intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1 });
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.String str2 = toStringStyle0.getFieldSeparator();
        java.lang.String str3 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "<size=", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<null>" + "'", str3, "<null>");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle22.setFieldNameValueSeparator("\n  ");
        toStringStyle22.setFieldNameValueSeparator("{");
        boolean boolean27 = toStringStyle22.isUseIdentityHashCode();
        toStringStyle22.setSummaryObjectStartText(">");
        toStringStyle22.setSizeEndText("=");
        toStringStyle22.setFieldSeparator("[");
        toStringStyle22.setSummaryObjectStartText(",");
        java.lang.String str36 = toStringStyle22.getSummaryObjectStartText();
        boolean boolean37 = toStringStyle22.isUseFieldNames();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle6.reflectionAppendArrayDetail(stringBuffer20, "\n  ", (java.lang.Object) boolean37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[" + "'", str12, "[");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertNotNull(toStringStyle22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "," + "'", str36, ",");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str17 = toStringStyle16.getSizeStartText();
        toStringStyle16.setContentStart("[");
        boolean boolean20 = toStringStyle16.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "[", (java.lang.Object) toStringStyle16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "140) test0821(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "53) test0821(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "=" + "'", str17, "=");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "141) test0822(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer9 = null;
// flaky "142) test0823(org.apache.commons.lang3.builder.RegressionTest1)":         toStringStyle0.appendSuper(stringBuffer9, "[");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle14.setFieldSeparatorAtStart(true);
        java.lang.String str17 = toStringStyle14.getFieldSeparator();
        java.lang.String str18 = toStringStyle14.getFieldSeparator();
        boolean boolean19 = toStringStyle14.isUseIdentityHashCode();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer12, ",", (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArrayStart("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle0.appendSuper(stringBuffer8, ">");
        java.lang.StringBuffer stringBuffer11 = null;
        int[] intArray16 = new int[] { (byte) 100, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "=", intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 1, 10 });
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "{", (java.lang.Object) "=", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "143) test0825(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer3 = null;
        boolean[] booleanArray7 = new boolean[] { true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "", booleanArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "144) test0826(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { true, false });
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray14 = new int[] { 1, (short) 0, (-1), (short) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "hi!", intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 0, (-1), 10, 100 });
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setArraySeparator(">");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str12 = toStringStyle11.getSizeStartText();
        toStringStyle11.setContentStart("[");
        boolean boolean15 = toStringStyle11.isUseShortClassName();
        toStringStyle11.setContentStart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer10, (java.lang.Object) toStringStyle11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "=" + "'", str12, "=");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        java.lang.String str9 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "ToStringStyle.MultiLineToStringStyle", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        toStringStyle0.setNullText("\n  ");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
            toStringStyle0.appendDetail(stringBuffer13, "{", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentStart("[");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray12 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ",", floatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str1, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.String str9 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ">", (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[" + "'", str9, "[");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle8.setContentStart("<null>");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle11.setFieldSeparatorAtStart(true);
        boolean boolean14 = toStringStyle11.isUseFieldNames();
        toStringStyle11.setUseIdentityHashCode(false);
        java.lang.String str17 = toStringStyle11.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle11);
        toStringStyle11.setSizeEndText("\n  ");
        boolean boolean21 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle11);
        boolean boolean22 = toStringStyle11.isUseClassName();
        java.lang.String str23 = toStringStyle11.getArrayStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str25 = toStringStyle24.getContentStart();
        boolean boolean26 = toStringStyle24.isUseFieldNames();
        boolean boolean27 = toStringStyle24.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = toStringStyle28.getContentStart();
        boolean boolean30 = toStringStyle28.isUseFieldNames();
        boolean boolean31 = toStringStyle28.isUseShortClassName();
        toStringStyle28.setFieldSeparator("hi!");
        toStringStyle28.setNullText("");
        toStringStyle28.setContentStart("[");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle38 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle38.setFieldSeparatorAtStart(true);
        java.lang.String str41 = toStringStyle38.getFieldSeparator();
        java.lang.String str42 = toStringStyle38.getFieldSeparator();
        boolean boolean43 = toStringStyle38.isUseIdentityHashCode();
        toStringStyle38.setSummaryObjectStartText("[");
        toStringStyle38.setSummaryObjectEndText("{");
        java.lang.Object[] objArray48 = new java.lang.Object[] { toStringStyle8, str23, toStringStyle24, "[", toStringStyle38 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "{", objArray48, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "=" + "'", str17, "=");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[" + "'", str25, "[");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(toStringStyle28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[" + "'", str29, "[");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(toStringStyle38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setNullText("[");
        toStringStyle0.setSizeEndText("=");
        toStringStyle0.setContentStart("");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "[", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        java.lang.String str8 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray13 = new long[] { (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "\n  ", longArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[" + "'", str8, "[");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L, 0L });
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray17 = new long[] { 0, 1, 0L, (short) 10, 0L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, ",", longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L, 1L, 0L, 10L, 0L, 100L });
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray15 = new boolean[] { true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, ",", booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "145) test0839(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true, false, false, true });
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle7.setFieldSeparatorAtStart(true);
        java.lang.String str10 = toStringStyle7.getFieldSeparator();
        java.lang.String str11 = toStringStyle7.getFieldSeparator();
        toStringStyle7.setUseClassName(true);
        boolean boolean15 = toStringStyle7.isFullDetail((java.lang.Boolean) false);
        boolean boolean16 = toStringStyle7.isArrayContentDetail();
        boolean boolean17 = toStringStyle7.isFieldSeparatorAtStart();
        boolean boolean18 = toStringStyle7.isUseShortClassName();
        toStringStyle7.setUseShortClassName(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendClassName(stringBuffer6, (java.lang.Object) toStringStyle7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        boolean boolean4 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        boolean[] booleanArray7 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, ">", booleanArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] {});
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer4, "ToStringStyle.MultiLineToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        toStringStyle0.setArrayEnd("");
        toStringStyle0.setSizeStartText(",");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str13 = toStringStyle12.getContentStart();
        toStringStyle12.setArrayEnd("\n  ");
        boolean boolean16 = toStringStyle12.isUseIdentityHashCode();
        toStringStyle12.setFieldNameValueSeparator(">");
        boolean boolean19 = toStringStyle12.isDefaultFullDetail();
        java.lang.Object[] objArray20 = new java.lang.Object[] { boolean19 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "=", objArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "146) test0843(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "54) test0843(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
// flaky "18) test0843(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[false]");
// flaky "8) test0843(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[false]");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray16 = new short[] { (byte) 1, (byte) 0, (short) 1, (short) 1, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "\n  ", shortArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 1, (short) 0, (short) 1, (short) 1, (short) 10, (short) 1 });
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, ",", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "147) test0846(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n  " + "'", str4, "\n  ");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setArrayEnd("ToStringStyle.MultiLineToStringStyle");
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray17 = new double[] { ' ', 1L, (byte) 0, (-1.0f), 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, ">", doubleArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 32.0d, 1.0d, 0.0d, (-1.0d), 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray10 = new char[] { 'a', '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer4, "<null>", charArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', ' ', 'a' });
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str12 = toStringStyle11.getContentStart();
        boolean boolean13 = toStringStyle11.isUseFieldNames();
        boolean boolean14 = toStringStyle11.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle11);
        toStringStyle11.setDefaultFullDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer9, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        toStringStyle0.setUseClassName(false);
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray16 = new long[] { 10, (byte) 10, ' ', 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "=", longArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 10L, 10L, 32L, 10L });
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        boolean boolean6 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str10 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "}", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "148) test0851(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
// flaky "55) test0851(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str10 = toStringStyle0.getSizeStartText();
        toStringStyle0.setNullText("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        java.lang.String str5 = toStringStyle0.getContentEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "\n  ", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "149) test0853(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str11 = toStringStyle0.getFieldSeparator();
        java.lang.Class<?> wildcardClass12 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "150) test0855(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        toStringStyle0.setSizeEndText(">");
        boolean boolean6 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText("{");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "}", (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer9, (java.lang.Object) 1.0f);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "hi!", (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean4 = toStringStyle3.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str7 = toStringStyle6.getContentStart();
        toStringStyle6.setArrayEnd("\n  ");
        boolean boolean10 = toStringStyle6.isUseIdentityHashCode();
        boolean boolean12 = toStringStyle6.isFullDetail((java.lang.Boolean) true);
        toStringStyle3.appendClassName(stringBuffer5, (java.lang.Object) boolean12);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle3);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer1, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object) toStringStyle3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        toStringStyle0.setSummaryObjectEndText("{");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "151) test0859(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "56) test0859(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        java.lang.String str8 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray13 = new boolean[] { false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "[", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "152) test0860(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n  " + "'", str8, "\n  ");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, true });
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
            toStringStyle0.appendFieldEnd(stringBuffer18, "<size=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "153) test0861(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{" + "'", str16, "{");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setSizeStartText("[");
        java.lang.StringBuffer stringBuffer11 = null;
        char[] charArray13 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "hi!", charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.String str4 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer5, "=", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        boolean boolean7 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setSummaryObjectEndText("[");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle11.setFieldSeparatorAtStart(true);
        boolean boolean14 = toStringStyle11.isUseFieldNames();
        toStringStyle11.setUseIdentityHashCode(false);
        toStringStyle11.setUseFieldNames(false);
        java.lang.String str19 = toStringStyle11.getNullText();
        toStringStyle11.setArrayStart(",");
        boolean boolean22 = toStringStyle11.isFieldSeparatorAtStart();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer10, (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(toStringStyle11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str3 = toStringStyle2.getContentStart();
        boolean boolean4 = toStringStyle2.isUseFieldNames();
        boolean boolean5 = toStringStyle2.isUseShortClassName();
        toStringStyle2.setFieldSeparator("hi!");
        toStringStyle2.setNullText("");
        toStringStyle2.setContentEnd("");
        toStringStyle2.setFieldSeparator("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer1, (java.lang.Object) toStringStyle2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        java.lang.StringBuffer stringBuffer26 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle28.setFieldNameValueSeparator("\n  ");
        toStringStyle28.setFieldNameValueSeparator("{");
        boolean boolean33 = toStringStyle28.isUseIdentityHashCode();
        java.lang.String str34 = toStringStyle28.getFieldNameValueSeparator();
        toStringStyle28.setFieldNameValueSeparator("{");
        toStringStyle28.setContentEnd(">");
        toStringStyle28.setFieldSeparator("=");
        toStringStyle28.setContentEnd("<null>");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer26, "}", (java.lang.Object) toStringStyle28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "154) test0867(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "57) test0867(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
        org.junit.Assert.assertNotNull(toStringStyle28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{" + "'", str34, "{");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setNullText("\n  ");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, ",", (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setArrayEnd("ToStringStyle.MultiLineToStringStyle");
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray13 = new double[] { 1.0f, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, ">", doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
            toStringStyle0.appendFieldStart(stringBuffer13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ">" + "'", str12, ">");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        toStringStyle0.setContentEnd("=");
        toStringStyle0.setSummaryObjectEndText("ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer5 = null;
        long[] longArray9 = new long[] { 10L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "=", longArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 10L, (-1L) });
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray13 = new int[] { 100, '4', (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "", intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "155) test0873(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "58) test0873(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 100, 52, 1, 10 });
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendFieldStart(stringBuffer4, "<null>");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "}", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "156) test0874(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
            toStringStyle0.append(stringBuffer15, "}", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray20 = new char[] { '4', '4', '#', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<size=", charArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "157) test0876(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "59) test0876(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "19) test0876(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '4', '4', '#', '4', 'a', 'a' });
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setDefaultFullDetail(false);
        boolean boolean13 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer14 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap16 = org.apache.commons.lang3.builder.ToStringStyle.getRegistry();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "", objMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objMap16);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
            toStringStyle0.appendSummarySize(stringBuffer15, "ToStringStyle.MultiLineToStringStyle", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{" + "'", str10, "{");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        int[] intArray8 = new int[] { (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "<size=", intArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 32 });
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray17 = new double[] { (-1L), (byte) 10, (-1), 0, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, ",", doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 10.0d, (-1.0d), 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
            toStringStyle0.appendContentEnd(stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "158) test0881(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "60) test0881(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        toStringStyle10.setArrayEnd("");
        toStringStyle10.setSizeStartText(",");
        java.lang.String str20 = toStringStyle10.getFieldNameValueSeparator();
        toStringStyle10.setFieldSeparator("\n  ");
        toStringStyle10.setFieldSeparator("<null>");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle25.setFieldNameValueSeparator("\n  ");
        boolean boolean28 = toStringStyle25.isArrayContentDetail();
        boolean boolean30 = toStringStyle25.isFullDetail((java.lang.Boolean) false);
        java.lang.String str31 = toStringStyle25.getSummaryObjectEndText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle32 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str33 = toStringStyle32.getContentStart();
        boolean boolean34 = toStringStyle32.isUseFieldNames();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle35 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle35.setFieldNameValueSeparator("\n  ");
        toStringStyle35.setFieldNameValueSeparator("{");
        boolean boolean40 = toStringStyle35.isUseClassName();
        java.lang.String str41 = toStringStyle35.getSizeEndText();
        java.lang.String str42 = toStringStyle35.getFieldNameValueSeparator();
        java.lang.Object[] objArray43 = new java.lang.Object[] { "<null>", str31, toStringStyle32, str42 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "}", objArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "159) test0882(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{" + "'", str20, "{");
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "61) test0882(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "," + "'", str31, ",");
        org.junit.Assert.assertNotNull(toStringStyle32);
// flaky "20) test0882(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + ">" + "'", str33, ">");
// flaky "9) test0882(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(toStringStyle35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "4) test0882(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{" + "'", str42, "{");
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray15 = new boolean[] { false, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "hi!", booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { false, true, false, false });
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray15 = new long[] { 'a', '#', 0L, 1, (-1L), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", longArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 97L, 35L, 0L, 1L, (-1L), (-1L) });
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendIdentityHashCode(stringBuffer7, (java.lang.Object) 1.0f);
        boolean boolean10 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer11 = null;
        boolean[] booleanArray17 = new boolean[] { true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "<null>", booleanArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray17);
        assertBooleanArrayEquals(booleanArray17, new boolean[] { true, true, false, false });
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.MultiLineToStringStyle", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
            toStringStyle0.appendContentEnd(stringBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "160) test0887(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "62) test0887(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<size=" + "'", str13, "<size=");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("[");
        toStringStyle0.setArrayEnd("hi!");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendFieldStart(stringBuffer6, ">");
        toStringStyle0.setNullText(",");
        java.lang.String str11 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray15 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "hi!", booleanArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "161) test0889(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[" + "'", str11, "[");
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true });
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean2 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer3 = null;
        char[] charArray8 = new char[] { '4', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, ",", charArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', '#' });
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        boolean boolean4 = toStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle7.setFieldSeparatorAtStart(true);
        java.lang.String str10 = toStringStyle7.getFieldSeparator();
        java.lang.String str11 = toStringStyle7.getFieldSeparator();
        toStringStyle7.setUseClassName(true);
        boolean boolean15 = toStringStyle7.isFullDetail((java.lang.Boolean) false);
        boolean boolean16 = toStringStyle7.isArrayContentDetail();
        boolean boolean17 = toStringStyle7.isFieldSeparatorAtStart();
        boolean boolean18 = toStringStyle7.isUseShortClassName();
        toStringStyle7.setSizeEndText(">");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer5, ",", (java.lang.Object) ">");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "162) test0891(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "\n  ", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "163) test0892(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean9 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "{", byteArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 1 });
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray15 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "}", charArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "164) test0894(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ' });
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setContentEnd("");
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "<size=", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str10 = toStringStyle9.getSizeStartText();
        toStringStyle9.setSizeEndText("<size=");
        toStringStyle9.setArrayContentDetail(false);
        toStringStyle9.setSizeStartText("=");
        java.lang.String str17 = toStringStyle9.getFieldSeparator();
        boolean boolean18 = toStringStyle9.isDefaultFullDetail();
        toStringStyle9.setDefaultFullDetail(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer7, "=", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "=" + "'", str10, "=");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
// flaky "165) test0896(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str13 = toStringStyle12.getContentStart();
        boolean boolean14 = toStringStyle12.isUseFieldNames();
        boolean boolean15 = toStringStyle12.isUseShortClassName();
        toStringStyle12.setDefaultFullDetail(true);
        boolean boolean18 = toStringStyle12.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle12.appendSuper(stringBuffer19, ",");
        toStringStyle12.setArraySeparator("\n  ");
        toStringStyle12.setContentEnd("[");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle26 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle26.setFieldSeparatorAtStart(true);
        java.lang.String str29 = toStringStyle26.getFieldSeparator();
        java.lang.String str30 = toStringStyle26.getFieldSeparator();
        toStringStyle26.setUseClassName(true);
        boolean boolean34 = toStringStyle26.isFullDetail((java.lang.Boolean) false);
        toStringStyle26.setArrayStart(">");
        java.lang.String str37 = toStringStyle26.getSizeEndText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle38 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str39 = toStringStyle38.getContentStart();
        boolean boolean40 = toStringStyle38.isUseFieldNames();
        boolean boolean41 = toStringStyle38.isUseShortClassName();
        toStringStyle38.setFieldSeparator("hi!");
        toStringStyle38.setNullText("");
        boolean boolean46 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle38);
        toStringStyle38.setFieldSeparatorAtEnd(false);
        java.lang.Object[] objArray49 = new java.lang.Object[] { toStringStyle12, str37, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "=", objArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "166) test0897(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str6, "ToStringStyle.MultiLineToStringStyle");
// flaky "63) test0897(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertNotNull(toStringStyle12);
// flaky "21) test0897(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=" + "'", str13, "=");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(toStringStyle26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "10) test0897(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str37, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle38);
// flaky "5) test0897(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "=" + "'", str39, "=");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky "3) test0897(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isFieldSeparatorAtEnd();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) boolean3);
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "167) test0898(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + ">" + "'", str1, ">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getContentEnd();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray14 = new short[] { (short) 1, (short) -1, (byte) 1, (short) 0, (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "\n  ", shortArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "168) test0899(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
// flaky "64) test0899(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 1, (short) -1, (short) 1, (short) 0, (short) 0, (short) 0 });
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer1, "ToStringStyle.MultiLineToStringStyle", (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle10.setFieldSeparatorAtStart(true);
        java.lang.String str13 = toStringStyle10.getFieldSeparator();
        java.lang.String str14 = toStringStyle10.getFieldSeparator();
        toStringStyle10.setUseClassName(true);
        boolean boolean18 = toStringStyle10.isFullDetail((java.lang.Boolean) false);
        boolean boolean19 = toStringStyle10.isArrayContentDetail();
        boolean boolean20 = toStringStyle10.isFieldSeparatorAtStart();
        toStringStyle10.setUseFieldNames(true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer8, "", (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "169) test0901(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "65) test0901(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        double[] doubleArray21 = new double[] { 1.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer17, "hi!", doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "170) test0902(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "66) test0902(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setSummaryObjectStartText("[");
        boolean boolean8 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer9);
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setFieldSeparator("");
        toStringStyle0.setSizeEndText("=");
        boolean boolean11 = toStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle14.setFieldSeparatorAtStart(true);
        java.lang.String str17 = toStringStyle14.getFieldSeparator();
        java.lang.String str18 = toStringStyle14.getFieldSeparator();
        toStringStyle14.setUseClassName(true);
        boolean boolean22 = toStringStyle14.isFullDetail((java.lang.Boolean) false);
        boolean boolean23 = toStringStyle14.isArrayContentDetail();
        boolean boolean24 = toStringStyle14.isFieldSeparatorAtStart();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle25.setFieldSeparatorAtStart(true);
        boolean boolean28 = toStringStyle25.isUseFieldNames();
        toStringStyle25.setUseIdentityHashCode(false);
        java.lang.String str31 = toStringStyle25.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle25);
        java.lang.String str33 = toStringStyle25.getSummaryObjectEndText();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle34 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle34.setArrayEnd("hi!");
        toStringStyle34.setFieldNameValueSeparator("[");
        java.lang.String str39 = toStringStyle34.getSizeStartText();
        java.lang.Object[] objArray40 = new java.lang.Object[] { toStringStyle14, str33, str39 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "}", objArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "171) test0904(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[" + "'", str31, "[");
// flaky "67) test0904(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str33, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<size=" + "'", str39, "<size=");
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        int[] intArray21 = new int[] { (byte) -1, 'a', (-1), 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer14, "hi!", intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "172) test0905(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<size=" + "'", str7, "<size=");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 97, (-1), 100, 32 });
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setArraySeparator("[");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "=", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldEnd(stringBuffer5, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "173) test0907(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean8 = toStringStyle0.isUseClassName();
        boolean boolean9 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle12.setFieldSeparatorAtStart(true);
        boolean boolean15 = toStringStyle12.isUseFieldNames();
        java.lang.String str16 = toStringStyle12.getArraySeparator();
        toStringStyle12.setContentEnd("[");
        toStringStyle12.setNullText(">");
        boolean boolean21 = toStringStyle12.isUseIdentityHashCode();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer10, "\n  ", (java.lang.Object) toStringStyle12);
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
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n  " + "'", str16, "\n  ");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "174) test0909(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean9 = toStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldSeparator(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = toStringStyle3.getContentStart();
        toStringStyle3.setArrayEnd("\n  ");
        boolean boolean7 = toStringStyle3.isUseIdentityHashCode();
        boolean boolean9 = toStringStyle3.isFullDetail((java.lang.Boolean) true);
        toStringStyle0.appendClassName(stringBuffer2, (java.lang.Object) boolean9);
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "=", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
// flaky "175) test0911(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setFieldSeparator(",");
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer11, "", (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        toStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "{", (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "176) test0913(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">" + "'", str8, ">");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSizeStartText();
        org.apache.commons.lang3.builder.ToStringStyle.register((java.lang.Object) toStringStyle0);
        toStringStyle0.setSizeEndText("\n  ");
        boolean boolean10 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str11 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray19 = new int[] { 0, '#', 'a', (byte) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<null>", intArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "177) test0914(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 35, 97, 10, 32 });
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "178) test0915(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[" + "'", str5, "[");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "", (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "179) test0916(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.String str5 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str9 = toStringStyle8.getContentStart();
        boolean boolean10 = toStringStyle8.isUseFieldNames();
        boolean boolean11 = toStringStyle8.isUseShortClassName();
        toStringStyle8.setDefaultFullDetail(true);
        boolean boolean14 = toStringStyle8.isFieldSeparatorAtEnd();
        toStringStyle8.setSummaryObjectStartText("=");
        java.lang.String str17 = toStringStyle8.getFieldNameValueSeparator();
        java.lang.String str18 = toStringStyle8.getSizeStartText();
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle8.appendSuper(stringBuffer19, "=");
        java.lang.Object[] objArray22 = new java.lang.Object[] { stringBuffer19 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "", objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "180) test0917(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
// flaky "68) test0917(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "22) test0917(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "11) test0917(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
// flaky "6) test0917(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle8);
// flaky "4) test0917(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
// flaky "1) test0917(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "1) test0917(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[" + "'", str18, "[");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] { null });
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        toStringStyle0.setArrayEnd("hi!");
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray13 = new boolean[] { true, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "ToStringStyle.MultiLineToStringStyle", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<size=" + "'", str5, "<size=");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { true, true, false, false, true });
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
            toStringStyle0.appendDetail(stringBuffer11, "hi!", 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "181) test0919(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
// flaky "69) test0919(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle0);
        toStringStyle0.setFieldSeparator("{");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, ",", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "182) test0920(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
// flaky "70) test0920(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray11 = new int[] { (byte) 1, (short) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer6, "{", intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "183) test0921(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "71) test0921(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 1, 1, 10 });
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        boolean boolean4 = toStringStyle0.isUseIdentityHashCode();
        toStringStyle0.setFieldNameValueSeparator(">");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = toStringStyle9.getContentStart();
        toStringStyle9.setArrayEnd("\n  ");
        boolean boolean13 = toStringStyle9.isUseIdentityHashCode();
        java.lang.Class<?> wildcardClass14 = toStringStyle9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "{", (java.lang.Object) toStringStyle9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "184) test0922(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(toStringStyle9);
// flaky "72) test0922(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "}" + "'", str10, "}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray13 = new long[] { 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer9, "{", longArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "185) test0923(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
// flaky "73) test0923(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 10L, 0L });
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
            toStringStyle0.appendNullText(stringBuffer17, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "186) test0924(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
// flaky "74) test0924(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "23) test0924(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "12) test0924(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "}" + "'", str16, "}");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "<size=", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "187) test0925(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray13 = new boolean[] { false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "[", booleanArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "188) test0926(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "75) test0926(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, true, true, true });
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<size=", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
            toStringStyle0.append(stringBuffer17, "ToStringStyle.MultiLineToStringStyle", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "189) test0928(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
// flaky "76) test0928(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "24) test0928(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "13) test0928(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<size=" + "'", str16, "<size=");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
            toStringStyle0.append(stringBuffer13, "}", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.String str5 = toStringStyle0.getSizeStartText();
        toStringStyle0.setContentEnd("<size=");
        toStringStyle0.setUseFieldNames(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentStart(stringBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "190) test0930(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str5, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        java.lang.String str4 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer5, "}", byteArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "191) test0931(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">" + "'", str4, ">");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 100 });
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle16.setFieldSeparatorAtStart(true);
        boolean boolean19 = toStringStyle16.isUseFieldNames();
        toStringStyle16.setUseIdentityHashCode(false);
        java.lang.String str22 = toStringStyle16.getSummaryObjectEndText();
        boolean boolean24 = toStringStyle16.isFullDetail((java.lang.Boolean) false);
        toStringStyle16.setUseFieldNames(false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendInternal(stringBuffer14, "{", (java.lang.Object) false, false);
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
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "192) test0932(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "}" + "'", str22, "}");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setSizeStartText("=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "hi!", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "<null>", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "193) test0934(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendCyclicObject(stringBuffer2, "=", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        toStringStyle0.setArrayEnd("ToStringStyle.MultiLineToStringStyle");
        boolean boolean8 = toStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendFieldStart(stringBuffer9, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        boolean boolean5 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setArrayEnd("=");
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) "=");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[" + "'", str4, "[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "194) test0937(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">" + "'", str6, ">");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer4, "hi!", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getSizeStartText();
        toStringStyle0.setUseClassName(true);
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray9 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "ToStringStyle.DefaultToStringStyle", intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "195) test0940(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str4, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] {});
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendFieldStart(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle12.setFieldNameValueSeparator("\n  ");
        toStringStyle12.setFieldNameValueSeparator("{");
        boolean boolean17 = toStringStyle12.isUseIdentityHashCode();
        java.lang.String str18 = toStringStyle12.getFieldNameValueSeparator();
        java.lang.String str19 = toStringStyle12.getFieldSeparator();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", (java.lang.Object) str19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "196) test0941(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "77) test0941(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{" + "'", str18, "{");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[" + "'", str19, "[");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer8 = null;
        long[] longArray15 = new long[] { (short) 10, 100, (short) 1, (-1L), 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "<null>", longArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 10L, 100L, 1L, (-1L), 100L });
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        java.lang.String str11 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("\n  ");
        toStringStyle14.setFieldNameValueSeparator("{");
        toStringStyle14.setFieldSeparatorAtStart(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle21.setFieldNameValueSeparator("\n  ");
        toStringStyle21.setFieldNameValueSeparator("{");
        boolean boolean26 = toStringStyle21.isUseIdentityHashCode();
        java.lang.String str27 = toStringStyle21.getFieldNameValueSeparator();
        toStringStyle21.setSizeStartText("<size=");
        java.lang.Object[] objArray30 = new java.lang.Object[] { toStringStyle14, "<size=" };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.DefaultToStringStyle", objArray30, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
// flaky "197) test0943(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{" + "'", str27, "{");
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setContentEnd("");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "=", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        int[] intArray20 = new int[] { ' ', 0, (short) 100, '4', (byte) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "", intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(toStringStyle3);
// flaky "198) test0945(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<size=" + "'", str4, "<size=");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 32, 0, 100, 52, 1, 1 });
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer9, "hi!", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "199) test0946(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendContentEnd(stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "200) test0947(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<size=" + "'", str1, "<size=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n  " + "'", str6, "\n  ");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        java.lang.String str5 = toStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.DefaultToStringStyle", byteArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 0, (byte) 10 });
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setSummaryObjectStartText("");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ">", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "201) test0949(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str1 = toStringStyle0.getSizeStartText();
        toStringStyle0.setSizeEndText("<size=");
        toStringStyle0.setArrayContentDetail(false);
        java.lang.StringBuffer stringBuffer6 = null;
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "}", byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "=" + "'", str1, "=");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
// flaky "202) test0951(org.apache.commons.lang3.builder.RegressionTest1)":         toStringStyle0.appendSuper(stringBuffer6, "hi!");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setArrayStart("");
        java.lang.String str13 = toStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray19 = new float[] { (-1.0f), (byte) 1, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "ToStringStyle.DefaultToStringStyle", floatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "78) test0951(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { (-1.0f), 1.0f, 100.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getFieldNameValueSeparator();
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setContentEnd(">");
        toStringStyle0.setFieldSeparator("=");
        toStringStyle0.setContentEnd("");
        java.lang.Class<?> wildcardClass15 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{" + "'", str6, "{");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<null>", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseClassName();
        java.lang.String str6 = toStringStyle0.getSizeEndText();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str11 = toStringStyle10.getContentStart();
        boolean boolean12 = toStringStyle10.isUseFieldNames();
        boolean boolean13 = toStringStyle10.isUseShortClassName();
        toStringStyle10.setDefaultFullDetail(true);
        boolean boolean16 = toStringStyle10.isFieldSeparatorAtEnd();
        java.lang.String str17 = toStringStyle10.getArraySeparator();
        toStringStyle10.setUseFieldNames(false);
        toStringStyle10.setFieldNameValueSeparator("}");
        java.lang.String str22 = toStringStyle10.getArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "hi!", (java.lang.Object) toStringStyle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "203) test0954(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "79) test0954(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "=" + "'", str6, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "25) test0954(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "14) test0954(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n  " + "'", str17, "\n  ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n  " + "'", str22, "\n  ");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
// flaky "204) test0955(org.apache.commons.lang3.builder.RegressionTest1)":         toStringStyle0.appendToString(stringBuffer13, "=");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer16, ">", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "80) test0955(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str6, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean1 = toStringStyle0.isUseShortClassName();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setContentStart("");
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        boolean boolean8 = toStringStyle7.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str11 = toStringStyle10.getContentStart();
        toStringStyle10.setArrayEnd("\n  ");
        boolean boolean14 = toStringStyle10.isUseIdentityHashCode();
        boolean boolean16 = toStringStyle10.isFullDetail((java.lang.Boolean) true);
        toStringStyle7.appendClassName(stringBuffer9, (java.lang.Object) boolean16);
        org.apache.commons.lang3.builder.ToStringStyle.unregister((java.lang.Object) toStringStyle7);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer5, "<null>", (java.lang.Object) toStringStyle7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "205) test0956(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(toStringStyle7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(toStringStyle10);
// flaky "81) test0956(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        boolean boolean1 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) 1.0f);
// flaky "206) test0957(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "\n  ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "207) test0958(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "}" + "'", str6, "}");
// flaky "82) test0958(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        toStringStyle0.setArrayEnd("\n  ");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendFieldStart(stringBuffer4, "<null>");
        toStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer9 = null;
// flaky "208) test0959(org.apache.commons.lang3.builder.RegressionTest1)":         toStringStyle0.appendToString(stringBuffer9, "[");
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray16 = new short[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "", shortArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "83) test0959(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 0, (short) 0 });
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        boolean[] booleanArray23 = new boolean[] { false, false, false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, ">", booleanArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(booleanArray23);
        assertBooleanArrayEquals(booleanArray23, new boolean[] { false, false, false, true, true, true });
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getContentStart();
        toStringStyle0.setNullText(",");
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean8 = toStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "\n  ", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "209) test0961(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<size=" + "'", str3, "<size=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
            toStringStyle0.appendDetail(stringBuffer13, "hi!", (short) (byte) 1);
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setFieldSeparatorAtEnd(true);
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray13 = new float[] { 100.0f, '4', 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, ">", floatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 100.0f, 52.0f, 10.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        java.lang.String str6 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setDefaultFullDetail(true);
        toStringStyle0.setUseClassName(true);
        toStringStyle0.setSizeStartText("<null>");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, ">", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[" + "'", str6, "[");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        toStringStyle0.setContentEnd("hi!");
        boolean boolean13 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "210) test0965(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setSummaryObjectStartText(",");
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "211) test0966(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle12.appendToString(stringBuffer13, "[");
        toStringStyle12.setSizeEndText(">");
        boolean boolean18 = toStringStyle12.isUseShortClassName();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer10, "}", (java.lang.Object) toStringStyle12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "212) test0967(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "[", byteArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
            toStringStyle0.appendContentEnd(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "213) test0969(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "84) test0969(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "26) test0969(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
// flaky "15) test0969(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.removeLastFieldSeparator(stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setUseFieldNames(false);
        toStringStyle0.setArraySeparator("hi!");
        toStringStyle0.setFieldNameValueSeparator("ToStringStyle.MultiLineToStringStyle");
        java.lang.String str10 = toStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer11 = null;
        byte[] byteArray14 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer11, "}", byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "214) test0971(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "85) test0971(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n  " + "'", str10, "\n  ");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1 });
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArraySeparator();
        toStringStyle0.setContentEnd("[");
        toStringStyle0.setDefaultFullDetail(true);
        java.lang.String str9 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str9, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        java.lang.String str7 = toStringStyle0.getSummaryObjectStartText();
        boolean boolean9 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        toStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = toStringStyle14.getContentStart();
        boolean boolean16 = toStringStyle14.isUseFieldNames();
        boolean boolean17 = toStringStyle14.isUseShortClassName();
        toStringStyle14.setFieldSeparator("hi!");
        toStringStyle14.setNullText("");
        toStringStyle14.setContentEnd("");
        toStringStyle14.setFieldSeparator("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.reflectionAppendArrayDetail(stringBuffer12, "<null>", (java.lang.Object) toStringStyle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "215) test0973(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(toStringStyle14);
// flaky "86) test0973(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        java.lang.StringBuffer stringBuffer14 = null;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, "\n  ", byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray19 = new boolean[] { true, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "{", booleanArray19);
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
        org.junit.Assert.assertNotNull(booleanArray19);
        assertBooleanArrayEquals(booleanArray19, new boolean[] { true, true, false, true });
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        toStringStyle0.setFieldNameValueSeparator("[");
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray13 = new float[] { (-1L), (-1), 1, (byte) -1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "", floatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { (-1.0f), (-1.0f), 1.0f, (-1.0f), (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getArrayStart();
        toStringStyle0.setFieldSeparator("");
        java.lang.String str6 = toStringStyle0.getSummaryObjectStartText();
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray13 = new float[] { 100L, 1, 100.0f, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "\n  ", floatArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "216) test0977(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "87) test0977(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 100.0f, 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        java.lang.String str6 = toStringStyle0.getContentStart();
        toStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "[");
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "<size=", doubleArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "217) test0978(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "88) test0978(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean3 = toStringStyle0.isUseFieldNames();
        java.lang.String str4 = toStringStyle0.getArrayStart();
        boolean boolean5 = toStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = toStringStyle9.getContentStart();
        boolean boolean11 = toStringStyle9.isUseFieldNames();
        boolean boolean12 = toStringStyle9.isUseShortClassName();
        toStringStyle9.setFieldSeparator("hi!");
        toStringStyle9.setNullText("");
        boolean boolean17 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle9);
        java.lang.String str18 = toStringStyle9.getSizeStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object) toStringStyle9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "218) test0979(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "89) test0979(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toStringStyle9);
// flaky "27) test0979(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "16) test0979(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "7) test0979(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str18, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setUseClassName(true);
        boolean boolean8 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean9 = toStringStyle0.isArrayContentDetail();
        boolean boolean10 = toStringStyle0.isFieldSeparatorAtStart();
        toStringStyle0.setUseFieldNames(true);
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle14.setFieldNameValueSeparator("\n  ");
        toStringStyle14.setFieldNameValueSeparator("{");
        toStringStyle14.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle14.appendIdentityHashCode(stringBuffer21, (java.lang.Object) 1.0f);
        toStringStyle14.setNullText("");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer13, (java.lang.Object) toStringStyle14);
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
        org.junit.Assert.assertNotNull(toStringStyle14);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        toStringStyle0.setFieldNameValueSeparator("{");
        boolean boolean5 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = toStringStyle0.getSummaryObjectEndText();
        toStringStyle0.setArrayEnd(",");
        boolean boolean9 = toStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer10, "{", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "219) test0981(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
            toStringStyle0.append(stringBuffer21, "<null>", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "220) test0982(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer7, "hi!", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str18 = toStringStyle17.getContentStart();
        boolean boolean19 = toStringStyle17.isUseFieldNames();
        boolean boolean20 = toStringStyle17.isUseShortClassName();
        toStringStyle17.setFieldSeparator("hi!");
        toStringStyle17.setNullText("");
        toStringStyle17.setContentEnd("");
        java.lang.String str27 = toStringStyle17.getSummaryObjectStartText();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer15, "[", (java.lang.Object) toStringStyle17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "221) test0984(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str14, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle17);
// flaky "90) test0984(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setArrayEnd("hi!");
        java.lang.String str7 = toStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer8 = null;
        double[] doubleArray12 = new double[] { (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, ">", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "222) test0985(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        toStringStyle0.setContentEnd("");
        toStringStyle0.setFieldSeparator("");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer12, "\n  ", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "223) test0986(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "[");
        boolean boolean4 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str5 = toStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = toStringStyle0.isUseClassName();
        toStringStyle0.setSizeEndText("");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ">" + "'", str5, ">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setSummaryObjectEndText("[");
        toStringStyle0.setContentEnd("<size=");
        boolean boolean9 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        boolean boolean11 = toStringStyle0.isFullDetail((java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray18 = new double[] { (-1), 0, (byte) 10, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer12, "=", doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "224) test0988(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 0.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer6, "<size=", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        toStringStyle0.setUseIdentityHashCode(true);
        toStringStyle0.setSizeEndText("<size=");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray11 = new float[] { (byte) -1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer7, "<size=", floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { (-1.0f), 1.0f }, (float) 1.0E-15);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        toStringStyle0.setContentEnd(",");
        boolean boolean6 = toStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = toStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray15 = new short[] { (byte) 100, (short) -1, (short) 1, (short) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer8, "", shortArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n  " + "'", str7, "\n  ");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100, (short) -1, (short) 1, (short) 1, (short) 1 });
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        toStringStyle0.setFieldNameValueSeparator("\n  ");
        boolean boolean3 = toStringStyle0.isArrayContentDetail();
        boolean boolean5 = toStringStyle0.isFullDetail((java.lang.Boolean) false);
        boolean boolean6 = toStringStyle0.isDefaultFullDetail();
        java.lang.String str7 = toStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer8, "", (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "225) test0992(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        toStringStyle0.setContentStart("{");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummarySize(stringBuffer6, ",", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "226) test0993(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        double[] doubleArray17 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer14, ",", doubleArray17);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[" + "'", str13, "[");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        toStringStyle0.setNullText(">");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "=");
        toStringStyle0.setArrayContentDetail(true);
        toStringStyle0.setUseShortClassName(true);
        toStringStyle0.setArrayEnd("}");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendNullText(stringBuffer12, "{");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str3 = toStringStyle0.getFieldSeparator();
        java.lang.String str4 = toStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer5 = null;
        toStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.StringBuffer stringBuffer8 = null;
        float[] floatArray15 = new float[] { (byte) 0, '#', (byte) 1, (byte) 1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "hi!", floatArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
// flaky "227) test0996(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "91) test0996(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 0.0f, 35.0f, 1.0f, 1.0f, (-1.0f) }, (float) 1.0E-15);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        long[] longArray21 = new long[] { ' ', (short) 10, (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer15, "ToStringStyle.MultiLineToStringStyle", longArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "228) test0997(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{" + "'", str14, "{");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 32L, 10L, 1L, 35L });
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        toStringStyle0.setFieldSeparator("[");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer3, "\n  ", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str1 = toStringStyle0.getContentStart();
        boolean boolean2 = toStringStyle0.isUseFieldNames();
        boolean boolean3 = toStringStyle0.isUseShortClassName();
        toStringStyle0.setFieldSeparator("hi!");
        toStringStyle0.setNullText("");
        boolean boolean8 = org.apache.commons.lang3.builder.ToStringStyle.isRegistered((java.lang.Object) toStringStyle0);
        toStringStyle0.setUseShortClassName(true);
        boolean boolean11 = toStringStyle0.isUseShortClassName();
        boolean boolean12 = toStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray20 = new int[] { 100, (byte) 0, '#', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendDetail(stringBuffer13, "}", intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "229) test0999(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "92) test0999(org.apache.commons.lang3.builder.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 100, 0, 35, 97, 32 });
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        java.lang.StringBuffer stringBuffer18 = null;
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendSummary(stringBuffer18, "=", byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{" + "'", str1, "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 10 });
    }
}
