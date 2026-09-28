package org.jsoup.nodes;

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
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        attribute3.setKey("hi!");
        boolean boolean8 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute11 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "");
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        org.jsoup.nodes.Attributes attributes16 = attribute15.parent;
        boolean boolean17 = attribute15.isBooleanAttribute();
        boolean boolean18 = attribute15.isDataAttribute();
        org.jsoup.nodes.Attributes attributes19 = null;
        attribute15.parent = attributes19;
        boolean boolean21 = attribute11.equals((java.lang.Object) attribute15);
        org.jsoup.nodes.Attributes attributes22 = attribute15.parent;
        boolean boolean23 = attribute3.equals((java.lang.Object) attribute15);
        boolean boolean24 = attribute15.isBooleanAttribute();
        boolean boolean25 = attribute15.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        java.lang.String str8 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute9.parent = attributes10;
        java.lang.String str12 = attribute9.getValue();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        boolean boolean8 = attribute7.isDataAttribute();
        boolean boolean9 = attribute7.isBooleanAttribute();
        java.lang.String str10 = attribute7.getKey();
        boolean boolean11 = attribute7.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable7, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.html();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.html();
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes7);
        java.lang.String str9 = attribute8.toString();
        boolean boolean10 = attribute8.isBooleanAttribute();
        boolean boolean12 = attribute8.equals((java.lang.Object) '#');
        boolean boolean13 = attribute8.isBooleanAttribute();
        boolean boolean14 = attribute2.equals((java.lang.Object) boolean13);
        org.jsoup.nodes.Attribute attribute15 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.nodes.Attribute attribute19 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", attributes18);
        java.lang.String str20 = attribute19.toString();
        boolean boolean21 = attribute2.equals((java.lang.Object) attribute19);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"" + "'", str20, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.String str5 = attribute2.html();
        boolean boolean7 = attribute2.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes8 = attribute2.parent;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes10);
        java.lang.String str12 = attribute11.toString();
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute11.parent = attributes13;
        boolean boolean16 = attribute11.equals((java.lang.Object) 1L);
        attribute11.setKey("hi!=\"hi!\"");
        java.lang.String str19 = attribute11.getValue();
        boolean boolean20 = attribute11.isBooleanAttribute();
        java.lang.String str21 = attribute11.getKey();
        boolean boolean22 = attribute7.equals((java.lang.Object) attribute11);
        boolean boolean23 = attribute7.isDataAttribute();
        org.jsoup.nodes.Attributes attributes24 = null;
        attribute7.parent = attributes24;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes9);
        org.jsoup.nodes.Attributes attributes11 = attribute10.parent;
        boolean boolean12 = attribute10.isBooleanAttribute();
        boolean boolean13 = attribute10.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute14 = attribute10.clone();
        boolean boolean15 = attribute2.equals((java.lang.Object) attribute14);
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getValue();
        java.lang.String str8 = attribute3.getKey();
        java.lang.String str9 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.Class<?> wildcardClass12 = attribute3.getClass();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "");
        java.lang.String str3 = attribute2.getKey();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute5);
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute5.parent = attributes8;
        attribute5.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute5.html(appendable12, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        org.jsoup.nodes.Attributes attributes9 = attribute8.parent;
        java.lang.String str10 = attribute8.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attribute8.setValue("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute2.shouldCollapseAttribute(outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        boolean boolean10 = attribute3.isBooleanAttribute();
        java.lang.String str11 = attribute3.toString();
        java.lang.String str12 = attribute3.getValue();
        java.lang.String str13 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes16);
        boolean boolean18 = attribute17.isBooleanAttribute();
        boolean boolean19 = attribute17.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.nodes.Attribute attribute23 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes22);
        java.lang.String str24 = attribute23.toString();
        org.jsoup.nodes.Attributes attributes25 = null;
        attribute23.parent = attributes25;
        boolean boolean28 = attribute23.equals((java.lang.Object) 1L);
        boolean boolean29 = attribute23.isBooleanAttribute();
        boolean boolean30 = attribute23.isBooleanAttribute();
        java.lang.String str31 = attribute23.toString();
        boolean boolean32 = attribute17.equals((java.lang.Object) attribute23);
        org.jsoup.nodes.Attribute attribute33 = attribute23.clone();
        boolean boolean34 = attribute3.equals((java.lang.Object) attribute23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"" + "'", str24, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!=\"hi!\"" + "'", str31, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(attribute33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable14, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNull(attributes11);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str10 = attribute9.getValue();
        java.lang.String str11 = attribute9.html();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        java.lang.Class<?> wildcardClass13 = attribute2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"", "", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        java.lang.String str9 = attribute8.toString();
        java.lang.String str10 = attribute8.getValue();
        org.jsoup.nodes.Attribute attribute13 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes16);
        org.jsoup.nodes.Attributes attributes18 = attribute17.parent;
        boolean boolean19 = attribute17.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute20 = attribute17.clone();
        boolean boolean21 = attribute13.equals((java.lang.Object) attribute20);
        boolean boolean22 = attribute8.equals((java.lang.Object) attribute13);
        boolean boolean23 = attribute13.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        boolean boolean8 = attribute2.isBooleanAttribute();
        boolean boolean9 = attribute2.isDataAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes12 = attribute2.parent;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute5.setKey("hi!");
        boolean boolean8 = attribute5.isBooleanAttribute();
        java.lang.String str9 = attribute5.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute5);
        boolean boolean11 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.Class<?> wildcardClass5 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        java.lang.String str10 = attribute9.toString();
        boolean boolean11 = attribute9.isDataAttribute();
        attribute9.setKey("hi!");
        boolean boolean14 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str18 = attribute17.html();
        org.jsoup.nodes.Attribute attribute19 = attribute17.clone();
        org.jsoup.nodes.Attribute attribute20 = attribute19.clone();
        boolean boolean21 = attribute3.equals((java.lang.Object) attribute20);
        org.jsoup.nodes.Attributes attributes22 = attribute20.parent;
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.nodes.Attribute attribute26 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes25);
        org.jsoup.nodes.Attributes attributes27 = attribute26.parent;
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.nodes.Attribute attribute31 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes30);
        boolean boolean32 = attribute26.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean33 = attribute26.isBooleanAttribute();
        boolean boolean34 = attribute20.equals((java.lang.Object) boolean33);
        org.jsoup.nodes.Attributes attributes35 = null;
        attribute20.parent = attributes35;
        java.lang.String str37 = attribute20.html();
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute20.html(appendable38, outputSettings39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str18, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(attributes22);
        org.junit.Assert.assertNull(attributes27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str37, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute3.toString();
        java.lang.String str9 = attribute3.getValue();
        java.lang.String str10 = attribute3.getValue();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getValue();
        java.lang.String str8 = attribute3.getValue();
        java.lang.String str9 = attribute3.getKey();
        boolean boolean10 = attribute3.isDataAttribute();
        java.lang.String str11 = attribute3.toString();
        boolean boolean12 = attribute3.isDataAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        org.jsoup.nodes.Attributes attributes13 = attribute12.parent;
        boolean boolean14 = attribute12.isBooleanAttribute();
        boolean boolean15 = attribute12.isBooleanAttribute();
        java.lang.String str16 = attribute12.getValue();
        java.lang.String str17 = attribute12.getValue();
        java.lang.String str18 = attribute12.html();
        java.lang.String str19 = attribute12.getValue();
        boolean boolean20 = attribute12.isBooleanAttribute();
        java.lang.String str21 = attribute12.getKey();
        boolean boolean22 = attribute12.isBooleanAttribute();
        boolean boolean23 = attribute3.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.equals((java.lang.Object) attribute5);
        boolean boolean7 = attribute5.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        java.lang.String str10 = attribute3.html();
        java.lang.String str11 = attribute3.html();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute11 = attribute10.clone();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        org.jsoup.nodes.Attributes attributes16 = attribute15.parent;
        java.lang.String str17 = attribute15.getKey();
        java.lang.String str18 = attribute15.getKey();
        boolean boolean19 = attribute11.equals((java.lang.Object) attribute15);
        java.lang.Class<?> wildcardClass20 = attribute11.getClass();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isBooleanAttribute();
        boolean boolean5 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", attributes7);
        boolean boolean9 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute10 = attribute2.clone();
        java.lang.Class<?> wildcardClass11 = attribute10.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean10 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute11 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        java.lang.String str12 = attribute3.getKey();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable13, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.html();
        boolean boolean6 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str7 = attribute2.html();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes6);
        java.lang.String str8 = attribute7.toString();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute7.parent = attributes9;
        boolean boolean12 = attribute7.equals((java.lang.Object) 1L);
        boolean boolean13 = attribute7.isBooleanAttribute();
        java.lang.String str14 = attribute7.toString();
        boolean boolean15 = attribute7.isDataAttribute();
        org.jsoup.nodes.Attribute attribute16 = attribute7.clone();
        java.lang.String str17 = attribute16.getKey();
        boolean boolean18 = attribute2.equals((java.lang.Object) str17);
        java.lang.Class<?> wildcardClass19 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.jsoup.nodes.Attribute attribute7 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes8 = attribute4.parent;
        java.lang.String str9 = attribute4.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str9, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        java.lang.String str8 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        boolean boolean9 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        boolean boolean13 = attribute12.isBooleanAttribute();
        boolean boolean14 = attribute12.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes17);
        java.lang.String str19 = attribute18.toString();
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute18.parent = attributes20;
        boolean boolean23 = attribute18.equals((java.lang.Object) 1L);
        boolean boolean24 = attribute18.isBooleanAttribute();
        boolean boolean25 = attribute18.isBooleanAttribute();
        java.lang.String str26 = attribute18.toString();
        boolean boolean27 = attribute12.equals((java.lang.Object) attribute18);
        boolean boolean28 = attribute3.equals((java.lang.Object) boolean27);
        org.jsoup.nodes.Attribute attribute29 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute30 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.nodes.Attribute attribute34 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes33);
        boolean boolean35 = attribute30.equals((java.lang.Object) attributes33);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"" + "'", str19, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"" + "'", str26, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attribute29);
        org.junit.Assert.assertNotNull(attribute30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.getValue();
        java.lang.String str7 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes10);
        java.lang.String str12 = attribute11.toString();
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute11.parent = attributes13;
        boolean boolean16 = attribute11.equals((java.lang.Object) 1L);
        boolean boolean17 = attribute2.equals((java.lang.Object) boolean16);
        java.lang.String str18 = attribute2.toString();
        attribute2.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes21 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str18, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes21);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute10 = attribute9.clone();
        org.jsoup.nodes.Attributes attributes11 = attribute9.parent;
        attribute9.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute9.parent = attributes14;
        org.jsoup.nodes.Attribute attribute16 = attribute9.clone();
        boolean boolean17 = attribute2.equals((java.lang.Object) attribute16);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        java.lang.String str10 = attribute9.toString();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute9.parent = attributes11;
        boolean boolean14 = attribute9.equals((java.lang.Object) 1L);
        boolean boolean15 = attribute9.isBooleanAttribute();
        boolean boolean16 = attribute9.isBooleanAttribute();
        java.lang.String str17 = attribute9.toString();
        boolean boolean18 = attribute3.equals((java.lang.Object) attribute9);
        org.jsoup.nodes.Attribute attribute19 = attribute9.clone();
        java.lang.String str20 = attribute9.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"" + "'", str20, "hi!=\"hi!\"");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", "", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.toString();
        java.lang.String str11 = attribute3.toString();
        java.lang.String str12 = attribute3.html();
        org.jsoup.nodes.Attribute attribute15 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str16 = attribute15.toString();
        boolean boolean17 = attribute3.equals((java.lang.Object) attribute15);
        attribute3.setKey("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = attribute3.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str16, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.String str5 = attribute2.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        java.lang.String str12 = attribute11.getValue();
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str16 = attribute15.getKey();
        boolean boolean17 = attribute11.equals((java.lang.Object) str16);
        org.jsoup.nodes.Attribute attribute18 = attribute11.clone();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute11.html(appendable19, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attribute18);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute7.parent = attributes8;
        boolean boolean10 = attribute7.isBooleanAttribute();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute7.html(appendable11, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        boolean boolean7 = attribute3.isBooleanAttribute();
        boolean boolean8 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str6 = attribute5.html();
        boolean boolean7 = attribute5.isBooleanAttribute();
        java.lang.String str8 = attribute5.html();
        java.lang.String str9 = attribute5.html();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute5);
        attribute5.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean6 = attribute3.equals((java.lang.Object) '4');
        java.lang.String str7 = attribute3.html();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes10);
        org.jsoup.nodes.Attributes attributes12 = attribute11.parent;
        boolean boolean14 = attribute11.equals((java.lang.Object) (short) 0);
        boolean boolean15 = attribute11.isBooleanAttribute();
        boolean boolean16 = attribute11.isDataAttribute();
        boolean boolean17 = attribute3.equals((java.lang.Object) attribute11);
        java.lang.String str18 = attribute11.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = attribute11.shouldCollapseAttribute(outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.getValue();
        java.lang.String str7 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes10);
        java.lang.String str12 = attribute11.toString();
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute11.parent = attributes13;
        boolean boolean16 = attribute11.equals((java.lang.Object) 1L);
        boolean boolean17 = attribute2.equals((java.lang.Object) boolean16);
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.nodes.Attribute attribute21 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes20);
        org.jsoup.nodes.Attributes attributes22 = attribute21.parent;
        boolean boolean23 = attribute21.isBooleanAttribute();
        boolean boolean24 = attribute21.isBooleanAttribute();
        java.lang.String str25 = attribute21.getValue();
        java.lang.String str26 = attribute21.getValue();
        java.lang.String str27 = attribute21.getKey();
        boolean boolean28 = attribute2.equals((java.lang.Object) attribute21);
        org.jsoup.nodes.Attribute attribute29 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes30 = null;
        attribute29.parent = attributes30;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attribute29);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute5.html(appendable6, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.toString();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute3.parent = attributes13;
        java.lang.String str15 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes9 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str14 = attribute13.html();
        boolean boolean15 = attribute13.isBooleanAttribute();
        java.lang.String str16 = attribute13.html();
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute13.parent = attributes17;
        boolean boolean19 = attribute13.isBooleanAttribute();
        boolean boolean20 = attribute13.isDataAttribute();
        attribute13.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str23 = attribute13.html();
        boolean boolean24 = attribute13.isDataAttribute();
        boolean boolean25 = attribute10.equals((java.lang.Object) attribute13);
        org.jsoup.nodes.Attributes attributes26 = attribute10.parent;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str16, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str23, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(attributes26);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", attributes2);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.Class<?> wildcardClass5 = attribute3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        java.lang.String str10 = attribute9.toString();
        boolean boolean11 = attribute9.isDataAttribute();
        attribute9.setKey("hi!");
        boolean boolean14 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str18 = attribute17.html();
        org.jsoup.nodes.Attribute attribute19 = attribute17.clone();
        org.jsoup.nodes.Attribute attribute20 = attribute19.clone();
        boolean boolean21 = attribute3.equals((java.lang.Object) attribute20);
        boolean boolean22 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute23 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute24 = attribute23.clone();
        java.lang.String str25 = attribute24.toString();
        attribute24.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str18, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertNotNull(attribute24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=\"hi!\"" + "'", str25, "hi!=\"hi!\"");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str7 = attribute6.getValue();
        java.lang.String str8 = attribute6.toString();
        org.jsoup.nodes.Attributes attributes9 = attribute6.parent;
        org.jsoup.nodes.Attribute attribute10 = attribute6.clone();
        boolean boolean11 = attribute2.equals((java.lang.Object) attribute6);
        java.lang.String str12 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"\"" + "'", str8, "hi!=\"\"");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str12, "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        java.lang.String str10 = attribute9.toString();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute9.parent = attributes11;
        boolean boolean14 = attribute9.equals((java.lang.Object) 1L);
        boolean boolean15 = attribute9.isBooleanAttribute();
        boolean boolean16 = attribute9.isBooleanAttribute();
        java.lang.String str17 = attribute9.toString();
        boolean boolean18 = attribute3.equals((java.lang.Object) attribute9);
        org.jsoup.nodes.Attribute attribute19 = attribute9.clone();
        java.lang.String str20 = attribute19.getValue();
        java.lang.String str21 = attribute19.html();
        org.jsoup.nodes.Attribute attribute22 = attribute19.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = attribute19.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute22);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        java.lang.String str8 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.Class<?> wildcardClass11 = attribute3.getClass();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", attributes2);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        org.jsoup.nodes.Attributes attributes13 = attribute12.parent;
        boolean boolean15 = attribute12.equals((java.lang.Object) (short) 0);
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute19 = attribute18.clone();
        boolean boolean20 = attribute12.equals((java.lang.Object) attribute18);
        boolean boolean21 = attribute2.equals((java.lang.Object) attribute18);
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.nodes.Attribute attribute25 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!\"", attributes24);
        org.jsoup.nodes.Attributes attributes26 = attribute25.parent;
        boolean boolean27 = attribute18.equals((java.lang.Object) attributes26);
        java.lang.String str28 = attribute18.html();
        java.lang.String str29 = attribute18.getKey();
        org.jsoup.nodes.Attributes attributes30 = attribute18.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str28, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!=\"hi!\"" + "'", str29, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes30);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        boolean boolean11 = attribute10.isBooleanAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attribute10.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.toString();
        java.lang.String str11 = attribute3.html();
        org.jsoup.nodes.Attribute attribute14 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str15 = attribute14.getKey();
        org.jsoup.nodes.Attributes attributes16 = attribute14.parent;
        org.jsoup.nodes.Attribute attribute17 = attribute14.clone();
        java.lang.String str18 = attribute14.getValue();
        attribute14.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
        boolean boolean21 = attribute3.equals((java.lang.Object) attribute14);
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute14.html(appendable22, outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str15, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        java.lang.String str9 = attribute8.toString();
        java.lang.String str10 = attribute8.getValue();
        org.jsoup.nodes.Attribute attribute13 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes16);
        org.jsoup.nodes.Attributes attributes18 = attribute17.parent;
        boolean boolean19 = attribute17.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute20 = attribute17.clone();
        boolean boolean21 = attribute13.equals((java.lang.Object) attribute20);
        boolean boolean22 = attribute8.equals((java.lang.Object) attribute13);
        java.lang.String str23 = attribute8.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.html();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        org.jsoup.nodes.Attribute attribute9 = attribute7.clone();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute9);
        boolean boolean11 = attribute2.isBooleanAttribute();
        java.lang.String str12 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute15 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute15.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean18 = attribute2.equals((java.lang.Object) attribute15);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str12, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes6);
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean9 = attribute3.equals((java.lang.Object) attribute7);
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute3.parent = attributes10;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attribute3.shouldCollapseAttribute(outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"", attributes2);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.getValue();
        boolean boolean5 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes8);
        boolean boolean10 = attribute3.equals((java.lang.Object) attribute9);
        java.lang.String str11 = attribute3.getKey();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable12, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str11, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute2.shouldCollapseAttribute(outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        boolean boolean5 = attribute2.isBooleanAttribute();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str6 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        boolean boolean6 = attribute3.isDataAttribute();
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attribute3.shouldCollapseAttribute(outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.html();
        boolean boolean5 = attribute3.isDataAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean6 = attribute3.equals((java.lang.Object) (short) 0);
        java.lang.String str7 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "");
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute10);
        java.lang.String str12 = attribute3.html();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute3.parent = attributes15;
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        attribute3.setKey("hi!");
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes10);
        org.jsoup.nodes.Attributes attributes12 = attribute11.parent;
        java.lang.String str13 = attribute11.getKey();
        boolean boolean14 = attribute3.equals((java.lang.Object) attribute11);
        java.lang.String str15 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        java.lang.String str7 = attribute2.getValue();
        java.lang.String str8 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str7, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        boolean boolean9 = attribute3.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        boolean boolean13 = attribute12.isBooleanAttribute();
        boolean boolean14 = attribute12.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes17);
        java.lang.String str19 = attribute18.toString();
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute18.parent = attributes20;
        boolean boolean23 = attribute18.equals((java.lang.Object) 1L);
        boolean boolean24 = attribute18.isBooleanAttribute();
        boolean boolean25 = attribute18.isBooleanAttribute();
        java.lang.String str26 = attribute18.toString();
        boolean boolean27 = attribute12.equals((java.lang.Object) attribute18);
        boolean boolean28 = attribute3.equals((java.lang.Object) boolean27);
        java.lang.String str29 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.nodes.Attribute attribute33 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes32);
        java.lang.String str34 = attribute33.getKey();
        java.lang.Class<?> wildcardClass35 = attribute33.getClass();
        boolean boolean36 = attribute3.equals((java.lang.Object) attribute33);
        java.lang.String str37 = attribute3.toString();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"" + "'", str19, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"" + "'", str26, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str34, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!=\"hi!\"" + "'", str37, "hi!=\"hi!\"");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute6.parent = attributes7;
        java.lang.String str9 = attribute6.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute6);
        boolean boolean11 = attribute6.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute12 = attribute6.clone();
        java.lang.Class<?> wildcardClass13 = attribute12.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute2.shouldCollapseAttribute(outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        java.lang.String str5 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.String str5 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        java.lang.String str12 = attribute11.getValue();
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str16 = attribute15.getKey();
        boolean boolean17 = attribute11.equals((java.lang.Object) str16);
        org.jsoup.nodes.Attribute attribute18 = attribute11.clone();
        java.lang.String str19 = attribute18.getValue();
        org.jsoup.nodes.Attribute attribute22 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute23 = attribute22.clone();
        java.lang.String str24 = attribute23.getValue();
        boolean boolean25 = attribute23.isDataAttribute();
        org.jsoup.nodes.Attribute attribute26 = attribute23.clone();
        boolean boolean27 = attribute18.equals((java.lang.Object) attribute26);
        org.jsoup.nodes.Attributes attributes28 = null;
        attribute26.parent = attributes28;
        org.jsoup.nodes.Attributes attributes30 = attribute26.parent;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = attribute26.shouldCollapseAttribute(outputSettings31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str24, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attribute26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(attributes30);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes7);
        boolean boolean9 = attribute2.equals((java.lang.Object) attributes7);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", attributes6);
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes10);
        org.jsoup.nodes.Attribute attribute12 = attribute11.clone();
        boolean boolean13 = attribute12.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute12.parent = attributes14;
        boolean boolean16 = attribute7.equals((java.lang.Object) attribute12);
        boolean boolean17 = attribute3.equals((java.lang.Object) attribute12);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        org.jsoup.nodes.Attributes attributes10 = attribute9.parent;
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes13);
        boolean boolean15 = attribute9.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean16 = attribute9.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute17 = attribute9.clone();
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str21 = attribute20.html();
        boolean boolean22 = attribute20.isBooleanAttribute();
        attribute20.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.nodes.Attribute attribute28 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes27);
        org.jsoup.nodes.Attributes attributes29 = null;
        attribute28.parent = attributes29;
        org.jsoup.nodes.Attribute attribute33 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean34 = attribute28.equals((java.lang.Object) "hi!");
        java.lang.String str35 = attribute28.toString();
        org.jsoup.nodes.Attribute attribute36 = attribute28.clone();
        boolean boolean37 = attribute20.equals((java.lang.Object) attribute28);
        boolean boolean38 = attribute9.equals((java.lang.Object) attribute28);
        org.jsoup.nodes.Attribute attribute39 = attribute28.clone();
        java.lang.Class<?> wildcardClass40 = attribute28.getClass();
        boolean boolean41 = attribute3.equals((java.lang.Object) attribute28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str21, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!=\"hi!\"" + "'", str35, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(attribute39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        boolean boolean13 = attribute12.isBooleanAttribute();
        boolean boolean14 = attribute12.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes17);
        java.lang.String str19 = attribute18.toString();
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute18.parent = attributes20;
        boolean boolean23 = attribute18.equals((java.lang.Object) 1L);
        boolean boolean24 = attribute18.isBooleanAttribute();
        boolean boolean25 = attribute18.isBooleanAttribute();
        java.lang.String str26 = attribute18.toString();
        boolean boolean27 = attribute12.equals((java.lang.Object) attribute18);
        boolean boolean28 = attribute3.equals((java.lang.Object) boolean27);
        org.jsoup.nodes.Attribute attribute29 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute32 = attribute3.clone();
        java.lang.String str33 = attribute3.getKey();
        java.lang.String str34 = attribute3.getValue();
        boolean boolean35 = attribute3.isBooleanAttribute();
        boolean boolean36 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.nodes.Attribute attribute40 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes39);
        java.lang.String str41 = attribute40.toString();
        org.jsoup.nodes.Attributes attributes42 = null;
        attribute40.parent = attributes42;
        boolean boolean45 = attribute40.equals((java.lang.Object) 1L);
        boolean boolean46 = attribute40.isBooleanAttribute();
        boolean boolean47 = attribute40.isBooleanAttribute();
        java.lang.String str48 = attribute40.toString();
        java.lang.String str49 = attribute40.getKey();
        java.lang.String str50 = attribute40.getKey();
        boolean boolean51 = attribute3.equals((java.lang.Object) str50);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"" + "'", str19, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"" + "'", str26, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attribute29);
        org.junit.Assert.assertNotNull(attribute32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str33, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!=\"hi!\"" + "'", str41, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!=\"hi!\"" + "'", str48, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute7.parent = attributes9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attribute7.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getValue();
        java.lang.String str8 = attribute3.getValue();
        java.lang.String str9 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute3.parent = attributes10;
        java.lang.String str12 = attribute3.getValue();
        boolean boolean13 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute14 = attribute3.clone();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute14.html(appendable15, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attribute14);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attribute3.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str11 = attribute3.getValue();
        java.lang.String str12 = attribute3.toString();
        boolean boolean13 = attribute3.isBooleanAttribute();
        java.lang.String str14 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute15 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str12, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str14, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute15);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute2.shouldCollapseAttribute(outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        boolean boolean13 = attribute12.isBooleanAttribute();
        boolean boolean14 = attribute12.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes17);
        java.lang.String str19 = attribute18.toString();
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute18.parent = attributes20;
        boolean boolean23 = attribute18.equals((java.lang.Object) 1L);
        boolean boolean24 = attribute18.isBooleanAttribute();
        boolean boolean25 = attribute18.isBooleanAttribute();
        java.lang.String str26 = attribute18.toString();
        boolean boolean27 = attribute12.equals((java.lang.Object) attribute18);
        boolean boolean28 = attribute3.equals((java.lang.Object) boolean27);
        org.jsoup.nodes.Attribute attribute29 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute30 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes31 = null;
        attribute30.parent = attributes31;
        java.lang.String str33 = attribute30.getValue();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"" + "'", str19, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"" + "'", str26, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attribute29);
        org.junit.Assert.assertNotNull(attribute30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean8 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        java.lang.Object obj7 = null;
        boolean boolean8 = attribute2.equals(obj7);
        java.lang.String str9 = attribute2.html();
        java.lang.String str10 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute4.isDataAttribute();
        java.lang.String str8 = attribute4.html();
        attribute4.setKey("hi!=\"hi!\"=\"\"");
        boolean boolean11 = attribute4.isDataAttribute();
        boolean boolean12 = attribute4.isBooleanAttribute();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attribute4.shouldCollapseAttribute(outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes9);
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute10.parent = attributes11;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean16 = attribute10.equals((java.lang.Object) "hi!");
        java.lang.String str17 = attribute10.toString();
        org.jsoup.nodes.Attribute attribute18 = attribute10.clone();
        boolean boolean19 = attribute2.equals((java.lang.Object) attribute10);
        java.lang.String str20 = attribute10.html();
        org.jsoup.nodes.Attribute attribute21 = attribute10.clone();
        org.jsoup.nodes.Attributes attributes22 = null;
        attribute10.parent = attributes22;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"" + "'", str20, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute21);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes10);
        boolean boolean12 = attribute6.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean13 = attribute6.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute14 = attribute6.clone();
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str18 = attribute17.html();
        boolean boolean19 = attribute17.isBooleanAttribute();
        attribute17.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.nodes.Attribute attribute25 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes24);
        org.jsoup.nodes.Attributes attributes26 = null;
        attribute25.parent = attributes26;
        org.jsoup.nodes.Attribute attribute30 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean31 = attribute25.equals((java.lang.Object) "hi!");
        java.lang.String str32 = attribute25.toString();
        org.jsoup.nodes.Attribute attribute33 = attribute25.clone();
        boolean boolean34 = attribute17.equals((java.lang.Object) attribute25);
        boolean boolean35 = attribute6.equals((java.lang.Object) attribute25);
        org.jsoup.nodes.Attribute attribute36 = attribute25.clone();
        org.jsoup.nodes.Attribute attribute37 = attribute25.clone();
        boolean boolean38 = attribute37.isBooleanAttribute();
        boolean boolean39 = attribute2.equals((java.lang.Object) attribute37);
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = attribute37.shouldCollapseAttribute(outputSettings40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str18, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!=\"hi!\"" + "'", str32, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(attribute36);
        org.junit.Assert.assertNotNull(attribute37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.html();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        java.lang.String str8 = attribute3.getValue();
        java.lang.String str9 = attribute3.getValue();
        java.lang.String str10 = attribute3.getKey();
        java.lang.Object obj11 = null;
        boolean boolean12 = attribute3.equals(obj11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = attribute3.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean7 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean6 = attribute3.equals((java.lang.Object) (short) 0);
        java.lang.String str7 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "");
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attribute attribute12 = attribute10.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attribute12.shouldCollapseAttribute(outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute12);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean7 = attribute3.equals((java.lang.Object) '#');
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean11 = attribute10.isBooleanAttribute();
        java.lang.String str12 = attribute10.getValue();
        org.jsoup.nodes.Attribute attribute13 = attribute10.clone();
        boolean boolean14 = attribute3.equals((java.lang.Object) attribute13);
        attribute13.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        java.lang.String str17 = attribute13.getKey();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute13.html(appendable18, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str17, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getValue();
        java.lang.String str8 = attribute3.getValue();
        java.lang.String str9 = attribute3.html();
        java.lang.String str10 = attribute3.html();
        java.lang.String str11 = attribute3.getValue();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        attribute3.setKey("hi!");
        boolean boolean8 = attribute3.isBooleanAttribute();
        java.lang.String str9 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes10 = attribute3.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = attributes10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        boolean boolean13 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attribute attribute14 = attribute3.clone();
        boolean boolean15 = attribute3.isDataAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"");
        attribute10.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str13 = attribute10.getValue();
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute10.parent = attributes14;
        boolean boolean16 = attribute3.equals((java.lang.Object) attribute10);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"\"" + "'", str13, "hi!=\"\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable3, outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        java.lang.String str7 = attribute6.toString();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute6.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        attribute3.setKey("hi!");
        java.lang.String str8 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean12 = attribute11.isBooleanAttribute();
        java.lang.String str13 = attribute11.getValue();
        org.jsoup.nodes.Attribute attribute14 = attribute11.clone();
        boolean boolean15 = attribute3.equals((java.lang.Object) attribute11);
        boolean boolean16 = attribute11.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"\"");
        boolean boolean8 = attribute3.equals((java.lang.Object) "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        java.lang.String str11 = attribute3.html();
        java.lang.String str12 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes15);
        org.jsoup.nodes.Attributes attributes17 = attribute16.parent;
        boolean boolean18 = attribute16.isBooleanAttribute();
        boolean boolean19 = attribute16.isDataAttribute();
        java.lang.String str20 = attribute16.toString();
        org.jsoup.nodes.Attributes attributes21 = attribute16.parent;
        java.lang.String str22 = attribute16.toString();
        boolean boolean23 = attribute3.equals((java.lang.Object) str22);
        java.lang.String str24 = attribute3.getValue();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"" + "'", str20, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"" + "'", str22, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean7 = attribute3.equals((java.lang.Object) '#');
        boolean boolean8 = attribute3.isBooleanAttribute();
        java.lang.String str9 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.html();
        boolean boolean6 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        java.lang.String str7 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        boolean boolean5 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        java.lang.String str7 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        org.jsoup.nodes.Attribute attribute8 = attribute5.clone();
        java.lang.String str9 = attribute8.html();
        java.lang.String str10 = attribute8.getKey();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute8.parent = attributes11;
        boolean boolean13 = attribute2.equals((java.lang.Object) attribute8);
        java.lang.String str14 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str14, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable7, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.toString();
        java.lang.String str11 = attribute3.toString();
        java.lang.String str12 = attribute3.html();
        java.lang.String str13 = attribute3.html();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute16 = attribute3.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute16);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.Appendable appendable3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable3, outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute4.getKey();
        java.lang.String str6 = attribute4.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        java.lang.String str10 = attribute3.html();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute3.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute6.setKey("hi!");
        org.jsoup.nodes.Attribute attribute9 = attribute6.clone();
        boolean boolean10 = attribute9.isBooleanAttribute();
        java.lang.String str11 = attribute9.toString();
        boolean boolean12 = attribute3.equals((java.lang.Object) str11);
        boolean boolean14 = attribute3.equals((java.lang.Object) "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes15 = attribute3.parent;
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(attributes15);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str11 = attribute3.getValue();
        java.lang.String str12 = attribute3.toString();
        boolean boolean13 = attribute3.isBooleanAttribute();
        java.lang.String str14 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute15 = attribute3.clone();
        java.lang.String str16 = attribute15.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str12, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str14, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str16, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        java.lang.String str5 = attribute2.toString();
        java.lang.String str6 = attribute2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean6 = attribute3.equals((java.lang.Object) (short) 0);
        java.lang.String str7 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "");
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        org.jsoup.nodes.Attributes attributes16 = null;
        attribute15.parent = attributes16;
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean21 = attribute15.equals((java.lang.Object) "hi!");
        java.lang.String str22 = attribute15.toString();
        java.lang.String str23 = attribute15.html();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.nodes.Attribute attribute27 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes26);
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.nodes.Attribute attribute31 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes30);
        org.jsoup.nodes.Attribute attribute32 = attribute31.clone();
        boolean boolean33 = attribute27.equals((java.lang.Object) attribute31);
        boolean boolean34 = attribute15.equals((java.lang.Object) attribute27);
        boolean boolean35 = attribute3.equals((java.lang.Object) attribute27);
        org.jsoup.nodes.Attribute attribute36 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes37 = attribute3.parent;
        java.lang.Class<?> wildcardClass38 = attribute3.getClass();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"" + "'", str22, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(attribute36);
        org.junit.Assert.assertNull(attributes37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        java.lang.String str8 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        boolean boolean7 = attribute6.isBooleanAttribute();
        attribute6.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean10 = attribute6.isDataAttribute();
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        boolean boolean14 = attribute6.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean15 = attribute2.equals((java.lang.Object) attribute6);
        java.lang.String str16 = attribute2.getValue();
        java.lang.String str17 = attribute2.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"" + "'", str16, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"" + "'", str17, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str6 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str6, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute2.setKey("hi!");
        java.lang.String str5 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        org.jsoup.nodes.Attributes attributes10 = attribute9.parent;
        boolean boolean11 = attribute9.isBooleanAttribute();
        boolean boolean12 = attribute9.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute13 = attribute9.clone();
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute13);
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes17);
        boolean boolean19 = attribute18.isBooleanAttribute();
        boolean boolean20 = attribute18.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.nodes.Attribute attribute24 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes23);
        java.lang.String str25 = attribute24.toString();
        org.jsoup.nodes.Attributes attributes26 = null;
        attribute24.parent = attributes26;
        boolean boolean29 = attribute24.equals((java.lang.Object) 1L);
        boolean boolean30 = attribute24.isBooleanAttribute();
        boolean boolean31 = attribute24.isBooleanAttribute();
        java.lang.String str32 = attribute24.toString();
        boolean boolean33 = attribute18.equals((java.lang.Object) attribute24);
        attribute24.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.nodes.Attribute attribute39 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes38);
        org.jsoup.nodes.Attributes attributes40 = attribute39.parent;
        boolean boolean41 = attribute39.isBooleanAttribute();
        boolean boolean42 = attribute39.isDataAttribute();
        org.jsoup.nodes.Attributes attributes43 = null;
        attribute39.parent = attributes43;
        boolean boolean45 = attribute24.equals((java.lang.Object) attributes43);
        boolean boolean46 = attribute2.equals((java.lang.Object) attribute24);
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean49 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=\"hi!\"" + "'", str25, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!=\"hi!\"" + "'", str32, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!\"", attributes7);
        org.jsoup.nodes.Attributes attributes9 = attribute8.parent;
        boolean boolean10 = attribute8.isBooleanAttribute();
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.toString();
        java.lang.String str9 = attribute3.toString();
        boolean boolean10 = attribute3.isDataAttribute();
        java.lang.String str11 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        java.lang.String str5 = attribute2.getValue();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute2.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute5);
        java.lang.String str8 = attribute2.toString();
        boolean boolean9 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.String str6 = attribute3.getValue();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute3.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        java.lang.String str10 = attribute9.toString();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute9.parent = attributes11;
        boolean boolean14 = attribute9.equals((java.lang.Object) 1L);
        boolean boolean15 = attribute9.isBooleanAttribute();
        boolean boolean16 = attribute9.isBooleanAttribute();
        java.lang.String str17 = attribute9.toString();
        boolean boolean18 = attribute3.equals((java.lang.Object) attribute9);
        org.jsoup.nodes.Attribute attribute19 = attribute9.clone();
        java.lang.String str20 = attribute19.getValue();
        java.lang.String str21 = attribute19.html();
        org.jsoup.nodes.Attribute attribute22 = attribute19.clone();
        org.jsoup.nodes.Attributes attributes23 = null;
        attribute19.parent = attributes23;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute22);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute3.shouldCollapseAttribute(outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean6 = attribute3.equals((java.lang.Object) '4');
        attribute3.setKey("hi!");
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute13 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str14 = attribute13.getKey();
        boolean boolean15 = attribute13.isDataAttribute();
        org.jsoup.nodes.Attribute attribute16 = attribute13.clone();
        boolean boolean17 = attribute3.equals((java.lang.Object) attribute16);
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str21 = attribute20.getValue();
        boolean boolean22 = attribute3.equals((java.lang.Object) attribute20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str21, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes10);
        boolean boolean12 = attribute11.isBooleanAttribute();
        boolean boolean13 = attribute11.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes16);
        java.lang.String str18 = attribute17.toString();
        org.jsoup.nodes.Attributes attributes19 = null;
        attribute17.parent = attributes19;
        boolean boolean22 = attribute17.equals((java.lang.Object) 1L);
        boolean boolean23 = attribute17.isBooleanAttribute();
        boolean boolean24 = attribute17.isBooleanAttribute();
        java.lang.String str25 = attribute17.toString();
        boolean boolean26 = attribute11.equals((java.lang.Object) attribute17);
        attribute17.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.nodes.Attribute attribute32 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes31);
        org.jsoup.nodes.Attributes attributes33 = attribute32.parent;
        boolean boolean34 = attribute32.isBooleanAttribute();
        boolean boolean35 = attribute32.isDataAttribute();
        org.jsoup.nodes.Attributes attributes36 = null;
        attribute32.parent = attributes36;
        boolean boolean38 = attribute17.equals((java.lang.Object) attributes36);
        org.jsoup.nodes.Attribute attribute39 = attribute17.clone();
        java.lang.String str40 = attribute39.toString();
        java.lang.String str41 = attribute39.getValue();
        boolean boolean42 = attribute3.equals((java.lang.Object) attribute39);
        org.jsoup.nodes.Attribute attribute43 = attribute39.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=\"hi!\"" + "'", str25, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attribute39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str40, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attribute43);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean6 = attribute3.equals((java.lang.Object) (short) 0);
        java.lang.String str7 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "");
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        org.jsoup.nodes.Attributes attributes16 = null;
        attribute15.parent = attributes16;
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean21 = attribute15.equals((java.lang.Object) "hi!");
        java.lang.String str22 = attribute15.toString();
        java.lang.String str23 = attribute15.html();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.nodes.Attribute attribute27 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes26);
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.nodes.Attribute attribute31 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes30);
        org.jsoup.nodes.Attribute attribute32 = attribute31.clone();
        boolean boolean33 = attribute27.equals((java.lang.Object) attribute31);
        boolean boolean34 = attribute15.equals((java.lang.Object) attribute27);
        boolean boolean35 = attribute3.equals((java.lang.Object) attribute27);
        boolean boolean36 = attribute3.isBooleanAttribute();
        boolean boolean37 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes38 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"" + "'", str22, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(attributes38);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", "");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute5);
        java.lang.String str8 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        java.lang.String str10 = attribute9.getValue();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute9.parent = attributes11;
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str10, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        java.lang.String str11 = attribute3.toString();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        boolean boolean13 = attribute12.isBooleanAttribute();
        boolean boolean14 = attribute12.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes17);
        java.lang.String str19 = attribute18.toString();
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute18.parent = attributes20;
        boolean boolean23 = attribute18.equals((java.lang.Object) 1L);
        boolean boolean24 = attribute18.isBooleanAttribute();
        boolean boolean25 = attribute18.isBooleanAttribute();
        java.lang.String str26 = attribute18.toString();
        boolean boolean27 = attribute12.equals((java.lang.Object) attribute18);
        boolean boolean28 = attribute3.equals((java.lang.Object) boolean27);
        org.jsoup.nodes.Attribute attribute29 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute32 = attribute3.clone();
        java.lang.String str33 = attribute3.getKey();
        java.lang.String str34 = attribute3.getValue();
        java.lang.String str35 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute38 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes39 = attribute38.parent;
        boolean boolean40 = attribute3.equals((java.lang.Object) attributes39);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"" + "'", str19, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"" + "'", str26, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attribute29);
        org.junit.Assert.assertNotNull(attribute32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str33, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"" + "'", str35, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute38);
        org.junit.Assert.assertNull(attributes39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getKey();
        java.lang.String str9 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        java.lang.String str11 = attribute3.html();
        java.lang.String str12 = attribute3.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str6 = attribute5.html();
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        attribute7.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str10 = attribute7.getKey();
        boolean boolean11 = attribute2.equals((java.lang.Object) str10);
        java.lang.String str12 = attribute2.getKey();
        java.lang.String str13 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute6.parent = attributes7;
        java.lang.String str9 = attribute6.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute6);
        boolean boolean11 = attribute6.isDataAttribute();
        java.lang.String str12 = attribute6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes5);
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        boolean boolean5 = attribute3.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute3.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        boolean boolean4 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes7);
        java.lang.String str9 = attribute8.toString();
        boolean boolean10 = attribute8.isDataAttribute();
        attribute8.setKey("hi!");
        java.lang.String str13 = attribute8.getKey();
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean17 = attribute16.isBooleanAttribute();
        java.lang.String str18 = attribute16.getValue();
        org.jsoup.nodes.Attribute attribute19 = attribute16.clone();
        boolean boolean20 = attribute8.equals((java.lang.Object) attribute16);
        boolean boolean21 = attribute2.equals((java.lang.Object) boolean20);
        org.jsoup.nodes.Attribute attribute24 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str25 = attribute24.getValue();
        org.jsoup.nodes.Attributes attributes26 = attribute24.parent;
        boolean boolean27 = attribute2.equals((java.lang.Object) attributes26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = attributes26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str25, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        boolean boolean7 = attribute3.isDataAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.toString();
        java.lang.String str6 = attribute3.getKey();
        boolean boolean7 = attribute3.isBooleanAttribute();
        boolean boolean8 = attribute3.isBooleanAttribute();
        java.lang.String str9 = attribute3.toString();
        java.lang.String str10 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        java.lang.String str12 = attribute11.getValue();
        org.jsoup.nodes.Attributes attributes13 = attribute11.parent;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(attributes13);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        java.lang.Class<?> wildcardClass6 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        java.lang.String str10 = attribute9.toString();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute9.parent = attributes11;
        boolean boolean14 = attribute9.equals((java.lang.Object) 1L);
        boolean boolean15 = attribute9.isBooleanAttribute();
        boolean boolean16 = attribute9.isBooleanAttribute();
        java.lang.String str17 = attribute9.toString();
        boolean boolean18 = attribute3.equals((java.lang.Object) attribute9);
        java.lang.String str19 = attribute3.html();
        java.lang.Class<?> wildcardClass20 = attribute3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"" + "'", str19, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        java.lang.String str11 = attribute3.getKey();
        boolean boolean12 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes13 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute3.parent = attributes14;
        java.lang.String str16 = attribute3.getKey();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable17, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        boolean boolean13 = attribute12.isBooleanAttribute();
        boolean boolean14 = attribute12.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes17);
        java.lang.String str19 = attribute18.toString();
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute18.parent = attributes20;
        boolean boolean23 = attribute18.equals((java.lang.Object) 1L);
        boolean boolean24 = attribute18.isBooleanAttribute();
        boolean boolean25 = attribute18.isBooleanAttribute();
        java.lang.String str26 = attribute18.toString();
        boolean boolean27 = attribute12.equals((java.lang.Object) attribute18);
        boolean boolean28 = attribute3.equals((java.lang.Object) boolean27);
        org.jsoup.nodes.Attribute attribute29 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.String str32 = attribute3.html();
        java.lang.String str33 = attribute3.toString();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"" + "'", str19, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"" + "'", str26, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attribute29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"" + "'", str32, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"" + "'", str33, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean6 = attribute3.equals((java.lang.Object) (short) 0);
        java.lang.String str7 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "");
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute10);
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str14 = attribute3.getKey();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        boolean boolean8 = attribute5.isDataAttribute();
        java.lang.Class<?> wildcardClass9 = attribute5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        java.lang.String str9 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        java.lang.String str5 = attribute2.html();
        boolean boolean6 = attribute2.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute4.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        java.lang.String str5 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes8);
        boolean boolean10 = attribute9.isBooleanAttribute();
        boolean boolean11 = attribute2.equals((java.lang.Object) attribute9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute11 = attribute10.clone();
        java.lang.String str12 = attribute11.html();
        java.lang.String str13 = attribute11.toString();
        org.jsoup.nodes.Attribute attribute14 = attribute11.clone();
        java.lang.String str15 = attribute11.getValue();
        java.lang.String str16 = attribute11.html();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute11.html(appendable17, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"" + "'", str16, "hi!=\"hi!\"");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str10 = attribute9.html();
        org.jsoup.nodes.Attributes attributes11 = attribute9.parent;
        boolean boolean12 = attribute9.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes13 = attribute9.parent;
        java.lang.String str14 = attribute9.html();
        boolean boolean15 = attribute2.equals((java.lang.Object) attribute9);
        boolean boolean16 = attribute2.isDataAttribute();
        java.lang.String str17 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str17, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute9 = attribute8.clone();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute8.html(appendable10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean8 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes9 = attribute2.parent;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        attribute3.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute4.isDataAttribute();
        java.lang.String str8 = attribute4.html();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        org.jsoup.nodes.Attributes attributes13 = attribute12.parent;
        boolean boolean14 = attribute12.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute15 = attribute12.clone();
        boolean boolean16 = attribute4.equals((java.lang.Object) attribute12);
        java.lang.String str17 = attribute4.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.html();
        boolean boolean5 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute3.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!\"");
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        java.lang.String str9 = attribute8.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str9, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.Class<?> wildcardClass6 = attribute5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        java.lang.String str8 = attribute3.getKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.toString();
        java.lang.String str10 = attribute3.getValue();
        boolean boolean11 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute18 = attribute17.clone();
        boolean boolean19 = attribute14.equals((java.lang.Object) attribute17);
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute17.parent = attributes20;
        boolean boolean22 = attribute3.equals((java.lang.Object) attributes20);
        java.lang.String str23 = attribute3.getKey();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable24, outputSettings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        java.lang.String str10 = attribute9.toString();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute9.parent = attributes11;
        boolean boolean14 = attribute9.equals((java.lang.Object) 1L);
        boolean boolean15 = attribute9.isBooleanAttribute();
        boolean boolean16 = attribute9.isBooleanAttribute();
        java.lang.String str17 = attribute9.toString();
        boolean boolean18 = attribute3.equals((java.lang.Object) attribute9);
        org.jsoup.nodes.Attributes attributes19 = attribute3.parent;
        java.lang.String str20 = attribute3.getValue();
        java.lang.String str21 = attribute3.html();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.nodes.Attribute attribute25 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes24);
        org.jsoup.nodes.Attributes attributes26 = attribute25.parent;
        java.lang.String str27 = attribute25.getKey();
        attribute25.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes30 = null;
        attribute25.parent = attributes30;
        boolean boolean32 = attribute3.equals((java.lang.Object) attribute25);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = attribute25.shouldCollapseAttribute(outputSettings33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute4.isDataAttribute();
        java.lang.String str8 = attribute4.html();
        attribute4.setKey("hi!=\"hi!\"=\"\"");
        java.lang.String str11 = attribute4.getValue();
        java.lang.String str12 = attribute4.getKey();
        org.jsoup.nodes.Attributes attributes13 = attribute4.parent;
        boolean boolean14 = attribute4.isDataAttribute();
        org.jsoup.nodes.Attribute attribute17 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute17.setKey("hi!");
        java.lang.String str20 = attribute17.toString();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.nodes.Attribute attribute24 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes23);
        org.jsoup.nodes.Attributes attributes25 = attribute24.parent;
        boolean boolean26 = attribute24.isBooleanAttribute();
        boolean boolean27 = attribute24.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute28 = attribute24.clone();
        boolean boolean29 = attribute17.equals((java.lang.Object) attribute28);
        org.jsoup.nodes.Attributes attributes30 = attribute17.parent;
        org.jsoup.nodes.Attribute attribute31 = attribute17.clone();
        boolean boolean32 = attribute4.equals((java.lang.Object) attribute31);
        org.jsoup.nodes.Attributes attributes33 = null;
        attribute4.parent = attributes33;
        boolean boolean35 = attribute4.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str12, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"" + "'", str20, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attribute28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(attributes30);
        org.junit.Assert.assertNotNull(attribute31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        java.lang.String str7 = attribute6.toString();
        java.lang.String str8 = attribute6.toString();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        java.lang.String str6 = attribute3.html();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!\"");
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute6);
        java.lang.String str8 = attribute6.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attribute3.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        java.lang.String str7 = attribute2.html();
        java.lang.String str8 = attribute2.getKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        boolean boolean6 = attribute5.isDataAttribute();
        java.lang.String str7 = attribute5.getKey();
        boolean boolean8 = attribute5.isDataAttribute();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute5.parent = attributes9;
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getKey();
        java.lang.String str9 = attribute3.toString();
        java.lang.String str10 = attribute3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"=\"hi!=\"hi!\"=\"hi!\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.Class<?> wildcardClass4 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        boolean boolean9 = attribute2.isDataAttribute();
        java.lang.Class<?> wildcardClass10 = attribute2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean9 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"", "", attributes2);
        java.lang.String str4 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.Class<?> wildcardClass5 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute6.isBooleanAttribute();
        java.lang.String str8 = attribute6.getValue();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute6.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", attributes2);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.Class<?> wildcardClass4 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes10);
        boolean boolean12 = attribute6.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean13 = attribute6.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute14 = attribute6.clone();
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str18 = attribute17.html();
        boolean boolean19 = attribute17.isBooleanAttribute();
        attribute17.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.nodes.Attribute attribute25 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes24);
        org.jsoup.nodes.Attributes attributes26 = null;
        attribute25.parent = attributes26;
        org.jsoup.nodes.Attribute attribute30 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean31 = attribute25.equals((java.lang.Object) "hi!");
        java.lang.String str32 = attribute25.toString();
        org.jsoup.nodes.Attribute attribute33 = attribute25.clone();
        boolean boolean34 = attribute17.equals((java.lang.Object) attribute25);
        boolean boolean35 = attribute6.equals((java.lang.Object) attribute25);
        org.jsoup.nodes.Attribute attribute36 = attribute25.clone();
        org.jsoup.nodes.Attribute attribute37 = attribute25.clone();
        boolean boolean38 = attribute37.isBooleanAttribute();
        boolean boolean39 = attribute2.equals((java.lang.Object) attribute37);
        boolean boolean40 = attribute2.isDataAttribute();
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str18, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!=\"hi!\"" + "'", str32, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(attribute36);
        org.junit.Assert.assertNotNull(attribute37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes6);
        boolean boolean8 = attribute7.isBooleanAttribute();
        boolean boolean9 = attribute7.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes12);
        java.lang.String str14 = attribute13.toString();
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute13.parent = attributes15;
        boolean boolean18 = attribute13.equals((java.lang.Object) 1L);
        boolean boolean19 = attribute13.isBooleanAttribute();
        boolean boolean20 = attribute13.isBooleanAttribute();
        java.lang.String str21 = attribute13.toString();
        boolean boolean22 = attribute7.equals((java.lang.Object) attribute13);
        attribute13.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.nodes.Attribute attribute28 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes27);
        org.jsoup.nodes.Attributes attributes29 = attribute28.parent;
        boolean boolean30 = attribute28.isBooleanAttribute();
        boolean boolean31 = attribute28.isDataAttribute();
        org.jsoup.nodes.Attributes attributes32 = null;
        attribute28.parent = attributes32;
        boolean boolean34 = attribute13.equals((java.lang.Object) attributes32);
        org.jsoup.nodes.Attribute attribute35 = attribute13.clone();
        java.lang.String str36 = attribute35.toString();
        boolean boolean37 = attribute35.isDataAttribute();
        boolean boolean38 = attribute35.isBooleanAttribute();
        boolean boolean39 = attribute2.equals((java.lang.Object) attribute35);
        java.lang.Class<?> wildcardClass40 = attribute35.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attribute35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str36, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str7 = attribute2.html();
        boolean boolean8 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute14 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str15 = attribute14.getValue();
        org.jsoup.nodes.Attribute attribute16 = attribute14.clone();
        java.lang.Class<?> wildcardClass17 = attribute14.getClass();
        boolean boolean18 = attribute11.equals((java.lang.Object) wildcardClass17);
        org.jsoup.nodes.Attributes attributes19 = null;
        attribute11.parent = attributes19;
        boolean boolean21 = attribute11.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes22 = attribute11.parent;
        boolean boolean23 = attribute2.equals((java.lang.Object) attribute11);
        java.lang.String str24 = attribute11.getKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str24, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"", "", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        attribute3.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        boolean boolean9 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes10 = attribute3.parent;
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"" + "'", str3, "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"");
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.html();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        boolean boolean8 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attributes attributes9 = attribute2.parent;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean10 = attribute6.equals((java.lang.Object) attribute9);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        boolean boolean8 = attribute6.isBooleanAttribute();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = attribute6.equals(obj9);
        boolean boolean11 = attribute6.isDataAttribute();
        org.jsoup.nodes.Attributes attributes12 = attribute6.parent;
        org.jsoup.nodes.Attribute attribute13 = attribute6.clone();
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute6);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes6);
        java.lang.Class<?> wildcardClass8 = attribute7.getClass();
        boolean boolean9 = attribute3.equals((java.lang.Object) attribute7);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attribute3.shouldCollapseAttribute(outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        boolean boolean8 = attribute7.isDataAttribute();
        boolean boolean9 = attribute4.equals((java.lang.Object) attribute7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attribute4.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getKey();
        java.lang.String str9 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        java.lang.String str11 = attribute3.html();
        java.lang.String str12 = attribute3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        java.lang.String str10 = attribute9.toString();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute9.parent = attributes11;
        boolean boolean14 = attribute9.equals((java.lang.Object) 1L);
        boolean boolean15 = attribute9.isBooleanAttribute();
        boolean boolean16 = attribute9.isBooleanAttribute();
        java.lang.String str17 = attribute9.toString();
        boolean boolean18 = attribute3.equals((java.lang.Object) attribute9);
        org.jsoup.nodes.Attributes attributes19 = attribute3.parent;
        java.lang.String str20 = attribute3.getValue();
        java.lang.String str21 = attribute3.html();
        org.jsoup.nodes.Attribute attribute22 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes23 = attribute3.parent;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertNull(attributes23);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes9);
        org.jsoup.nodes.Attributes attributes11 = attribute10.parent;
        boolean boolean12 = attribute10.isBooleanAttribute();
        boolean boolean13 = attribute10.isDataAttribute();
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute10.parent = attributes14;
        java.lang.String str16 = attribute10.getValue();
        org.jsoup.nodes.Attribute attribute17 = attribute10.clone();
        java.lang.String str18 = attribute17.getValue();
        boolean boolean19 = attribute2.equals((java.lang.Object) str18);
        java.lang.String str20 = attribute2.toString();
        java.lang.String str21 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str20, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str21, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean6 = attribute2.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute2.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes13);
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute14.parent = attributes15;
        org.jsoup.nodes.Attribute attribute19 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean20 = attribute14.equals((java.lang.Object) "hi!");
        java.lang.String str21 = attribute14.getValue();
        org.jsoup.nodes.Attribute attribute22 = attribute14.clone();
        boolean boolean23 = attribute3.equals((java.lang.Object) attribute22);
        java.lang.String str24 = attribute3.html();
        java.lang.String str25 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes26 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str24, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str25, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes26);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.Class<?> wildcardClass5 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute11 = attribute10.clone();
        org.jsoup.nodes.Attribute attribute14 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean15 = attribute10.equals((java.lang.Object) attribute14);
        java.lang.String str16 = attribute14.getValue();
        boolean boolean17 = attribute14.isDataAttribute();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"" + "'", str16, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable7, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        boolean boolean7 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute8);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean7 = attribute3.isDataAttribute();
        java.lang.String str8 = attribute3.html();
        java.lang.String str9 = attribute3.html();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"", "", attributes2);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        boolean boolean8 = attribute5.isDataAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attribute5.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean7 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        boolean boolean10 = attribute9.isBooleanAttribute();
        boolean boolean11 = attribute9.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        java.lang.String str16 = attribute15.toString();
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute15.parent = attributes17;
        boolean boolean20 = attribute15.equals((java.lang.Object) 1L);
        boolean boolean21 = attribute15.isBooleanAttribute();
        boolean boolean22 = attribute15.isBooleanAttribute();
        java.lang.String str23 = attribute15.toString();
        boolean boolean24 = attribute9.equals((java.lang.Object) attribute15);
        attribute15.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.nodes.Attribute attribute30 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes29);
        org.jsoup.nodes.Attributes attributes31 = attribute30.parent;
        boolean boolean32 = attribute30.isBooleanAttribute();
        boolean boolean33 = attribute30.isDataAttribute();
        org.jsoup.nodes.Attributes attributes34 = null;
        attribute30.parent = attributes34;
        boolean boolean36 = attribute15.equals((java.lang.Object) attributes34);
        boolean boolean37 = attribute2.equals((java.lang.Object) boolean36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = attribute2.shouldCollapseAttribute(outputSettings38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"" + "'", str16, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes7 = attribute2.parent;
        java.lang.String str8 = attribute2.getValue();
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        boolean boolean8 = attribute6.isBooleanAttribute();
        boolean boolean9 = attribute6.isDataAttribute();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute6.parent = attributes10;
        java.lang.String str12 = attribute6.getValue();
        org.jsoup.nodes.Attribute attribute13 = attribute6.clone();
        org.jsoup.nodes.Attribute attribute14 = attribute13.clone();
        java.lang.String str15 = attribute13.getValue();
        boolean boolean16 = attribute2.equals((java.lang.Object) str15);
        java.lang.Class<?> wildcardClass17 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"", "");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        boolean boolean6 = attribute3.isBooleanAttribute();
        boolean boolean7 = attribute3.isDataAttribute();
        java.lang.String str8 = attribute3.html();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        attribute3.setKey("hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes12 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute3.parent = attributes13;
        java.lang.String str15 = attribute3.html();
        boolean boolean16 = attribute3.isDataAttribute();
        java.lang.String str17 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str15, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str17, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute2.equals((java.lang.Object) (-1L));
        java.lang.String str6 = attribute2.getKey();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable7, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        attribute6.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean10 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute11 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute4.isDataAttribute();
        java.lang.String str8 = attribute4.html();
        attribute4.setKey("hi!=\"hi!\"=\"\"");
        java.lang.String str11 = attribute4.getValue();
        java.lang.String str12 = attribute4.getKey();
        org.jsoup.nodes.Attributes attributes13 = attribute4.parent;
        attribute4.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str16 = attribute4.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str12, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str16, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean6 = attribute3.equals((java.lang.Object) (short) 0);
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute3.parent = attributes10;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute2.parent = attributes8;
        java.lang.String str10 = attribute2.html();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute2.shouldCollapseAttribute(outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute6.parent = attributes7;
        java.lang.String str9 = attribute6.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute6);
        boolean boolean11 = attribute6.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute12 = attribute6.clone();
        java.lang.String str13 = attribute6.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        boolean boolean8 = attribute6.isBooleanAttribute();
        boolean boolean9 = attribute6.isDataAttribute();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute6.parent = attributes10;
        boolean boolean12 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attribute attribute13 = attribute2.clone();
        java.lang.Object obj14 = null;
        boolean boolean15 = attribute13.equals(obj14);
        org.jsoup.nodes.Attribute attribute16 = attribute13.clone();
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute13.parent = attributes17;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attribute16);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        java.lang.String str14 = attribute3.html();
        java.lang.String str15 = attribute3.getKey();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"" + "'", str14, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"" + "'", str15, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes9);
        org.jsoup.nodes.Attributes attributes11 = attribute10.parent;
        boolean boolean12 = attribute10.isBooleanAttribute();
        boolean boolean13 = attribute10.isDataAttribute();
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute10.parent = attributes14;
        boolean boolean16 = attribute6.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attributes attributes17 = attribute10.parent;
        boolean boolean18 = attribute10.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes19 = attribute10.parent;
        java.lang.String str20 = attribute10.html();
        boolean boolean21 = attribute2.equals((java.lang.Object) attribute10);
        boolean boolean22 = attribute2.isDataAttribute();
        boolean boolean23 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"" + "'", str20, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getKey();
        java.lang.String str9 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        java.lang.String str11 = attribute3.getKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        java.lang.String str7 = attribute6.toString();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute6.parent = attributes8;
        boolean boolean11 = attribute6.equals((java.lang.Object) 1L);
        attribute6.setKey("hi!=\"hi!\"");
        java.lang.String str14 = attribute6.getValue();
        java.lang.String str15 = attribute6.toString();
        boolean boolean16 = attribute6.isBooleanAttribute();
        java.lang.String str17 = attribute6.toString();
        org.jsoup.nodes.Attribute attribute18 = attribute6.clone();
        java.lang.String str19 = attribute6.html();
        boolean boolean20 = attribute2.equals((java.lang.Object) str19);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str15, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str17, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str19, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute5.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute2.shouldCollapseAttribute(outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        boolean boolean9 = attribute8.isBooleanAttribute();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.toString();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.html();
        java.lang.String str5 = attribute3.toString();
        java.lang.Class<?> wildcardClass6 = attribute3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        java.lang.String str8 = attribute3.getValue();
        boolean boolean9 = attribute3.isDataAttribute();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute5.html();
        java.lang.String str7 = attribute5.getKey();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute5.parent = attributes8;
        java.lang.String str10 = attribute5.html();
        boolean boolean11 = attribute5.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attribute2.shouldCollapseAttribute(outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean7 = attribute4.isDataAttribute();
        java.lang.String str8 = attribute4.html();
        attribute4.setKey("hi!=\"hi!\"=\"\"");
        java.lang.String str11 = attribute4.getValue();
        java.lang.String str12 = attribute4.getKey();
        org.jsoup.nodes.Attributes attributes13 = attribute4.parent;
        boolean boolean14 = attribute4.isDataAttribute();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str17 = attribute4.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str12, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str17, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }
}

