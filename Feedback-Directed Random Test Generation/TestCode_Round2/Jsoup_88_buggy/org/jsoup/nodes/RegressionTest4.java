package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        attribute3.setKey("hi!");
        boolean boolean8 = attribute3.isBooleanAttribute();
        java.lang.String str9 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes10 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str15 = attribute14.getValue();
        java.lang.String str16 = attribute14.getValue();
        boolean boolean17 = attribute3.equals((java.lang.Object) attribute14);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = attribute3.shouldCollapseAttribute(outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str15, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str16, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.Class<?> wildcardClass5 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        java.lang.Class<?> wildcardClass6 = attribute4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute3.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable15, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.getValue();
        boolean boolean9 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.String str5 = attribute2.html();
        boolean boolean6 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        java.lang.String str6 = attribute2.html();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        java.lang.Class<?> wildcardClass9 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute7.parent = attributes8;
        boolean boolean10 = attribute7.isBooleanAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attribute7.setValue("hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        boolean boolean22 = attribute2.isBooleanAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute2.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.html();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.getValue();
        java.lang.String str7 = attribute2.getKey();
        java.lang.String str8 = attribute2.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attribute2.shouldCollapseAttribute(outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes5);
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute6);
        java.lang.String str8 = attribute2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes15);
        org.jsoup.nodes.Attribute attribute17 = attribute16.clone();
        boolean boolean18 = attribute12.equals((java.lang.Object) attribute16);
        org.jsoup.nodes.Attributes attributes19 = attribute16.parent;
        org.jsoup.nodes.Attributes attributes20 = null;
        attribute16.parent = attributes20;
        boolean boolean22 = attribute8.equals((java.lang.Object) attribute16);
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute8.html(appendable23, outputSettings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        org.jsoup.nodes.Attribute attribute8 = attribute5.clone();
        java.lang.String str9 = attribute8.html();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute8.html(appendable10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        boolean boolean23 = attribute3.isBooleanAttribute();
        java.lang.String str24 = attribute3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = attribute3.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.jsoup.nodes.Attributes attributes30 = null;
        attribute3.parent = attributes30;
        java.lang.Class<?> wildcardClass32 = attribute3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        org.jsoup.nodes.Attributes attributes12 = attribute9.parent;
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes15);
        org.jsoup.nodes.Attributes attributes17 = attribute16.parent;
        boolean boolean18 = attribute9.equals((java.lang.Object) attributes17);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes6);
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean9 = attribute3.equals((java.lang.Object) attribute7);
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute3.parent = attributes10;
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable12, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        java.lang.String str7 = attribute6.toString();
        java.lang.String str8 = attribute6.html();
        java.lang.String str9 = attribute6.html();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes7);
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean10 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str15 = attribute14.html();
        boolean boolean16 = attribute14.isBooleanAttribute();
        attribute14.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.nodes.Attribute attribute22 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes21);
        org.jsoup.nodes.Attributes attributes23 = null;
        attribute22.parent = attributes23;
        org.jsoup.nodes.Attribute attribute27 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean28 = attribute22.equals((java.lang.Object) "hi!");
        java.lang.String str29 = attribute22.toString();
        org.jsoup.nodes.Attribute attribute30 = attribute22.clone();
        boolean boolean31 = attribute14.equals((java.lang.Object) attribute22);
        boolean boolean32 = attribute3.equals((java.lang.Object) attribute22);
        java.lang.String str33 = attribute22.getKey();
        // The following exception was thrown during execution in test generation
        try {
            attribute22.setKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str15, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!=\"hi!\"" + "'", str29, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attribute3.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        attribute9.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.nodes.Attribute attribute24 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes23);
        org.jsoup.nodes.Attributes attributes25 = attribute24.parent;
        boolean boolean26 = attribute24.isBooleanAttribute();
        boolean boolean27 = attribute24.isDataAttribute();
        org.jsoup.nodes.Attributes attributes28 = null;
        attribute24.parent = attributes28;
        boolean boolean30 = attribute9.equals((java.lang.Object) attributes28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = attribute9.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
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
        org.junit.Assert.assertNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute3.parent = attributes10;
        boolean boolean12 = attribute3.isDataAttribute();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute7 = attribute4.clone();
        java.lang.String str8 = attribute7.getKey();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        org.jsoup.nodes.Attributes attributes13 = attribute12.parent;
        java.lang.String str14 = attribute12.getKey();
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute12.parent = attributes15;
        org.jsoup.nodes.Attributes attributes17 = attribute12.parent;
        boolean boolean18 = attribute7.equals((java.lang.Object) attributes17);
        java.lang.String str19 = attribute7.getValue();
        java.lang.String str20 = attribute7.toString();
        org.jsoup.nodes.Attribute attribute21 = attribute7.clone();
        org.jsoup.nodes.Attributes attributes22 = attribute21.parent;
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.nodes.Attribute attribute26 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes25);
        org.jsoup.nodes.Attribute attribute27 = attribute26.clone();
        org.jsoup.nodes.Attribute attribute30 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        boolean boolean31 = attribute30.isDataAttribute();
        boolean boolean32 = attribute27.equals((java.lang.Object) attribute30);
        boolean boolean33 = attribute21.equals((java.lang.Object) attribute30);
        attribute30.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"" + "'", str19, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str20, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertNull(attributes22);
        org.junit.Assert.assertNotNull(attribute27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"");
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute2.setKey("hi!");
        java.lang.String str5 = attribute2.toString();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute2.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute4.isDataAttribute();
        java.lang.String str6 = attribute4.getKey();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        java.lang.String str7 = attribute6.getValue();
        boolean boolean8 = attribute2.equals((java.lang.Object) str7);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute13 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute13.setKey("hi!");
        boolean boolean16 = attribute3.equals((java.lang.Object) attribute13);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = attribute3.shouldCollapseAttribute(outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        java.lang.String str5 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.toString();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute10 = attribute9.clone();
        java.lang.String str11 = attribute9.getValue();
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute9.parent = attributes12;
        boolean boolean14 = attribute9.isBooleanAttribute();
        java.lang.String str15 = attribute9.getKey();
        boolean boolean16 = attribute3.equals((java.lang.Object) attribute9);
        // The following exception was thrown during execution in test generation
        try {
            attribute3.setKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"" + "'", str15, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        boolean boolean10 = attribute3.isBooleanAttribute();
        java.lang.String str11 = attribute3.toString();
        java.lang.String str12 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes13 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute3.parent = attributes14;
        boolean boolean16 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes7);
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean10 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        boolean boolean29 = attribute2.isDataAttribute();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str8 = attribute7.html();
        org.jsoup.nodes.Attribute attribute9 = attribute7.clone();
        attribute9.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str12 = attribute9.getKey();
        boolean boolean13 = attribute9.isDataAttribute();
        java.lang.String str14 = attribute9.toString();
        boolean boolean15 = attribute4.equals((java.lang.Object) str14);
        java.lang.String str16 = attribute4.getValue();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str16, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"", "", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean6 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = attribute2.parent;
        attribute2.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        java.lang.String str28 = attribute18.getKey();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute18.html(appendable29, outputSettings30);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.toString();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.Class<?> wildcardClass8 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"", attributes2);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        java.lang.String str7 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        java.lang.String str12 = attribute11.getValue();
        boolean boolean13 = attribute11.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        java.lang.String str8 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.Class<?> wildcardClass15 = attribute14.getClass();
        boolean boolean16 = attribute3.equals((java.lang.Object) attribute14);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        java.lang.String str8 = attribute2.html();
        java.lang.String str9 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = attribute3.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes7);
        org.jsoup.nodes.Attributes attributes9 = attribute8.parent;
        boolean boolean10 = attribute8.isBooleanAttribute();
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = attribute8.equals(obj11);
        java.lang.String str13 = attribute8.getValue();
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute8);
        java.lang.String str15 = attribute8.getValue();
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.Object obj6 = null;
        boolean boolean7 = attribute2.equals(obj6);
        boolean boolean8 = attribute2.isDataAttribute();
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "");
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
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attribute6.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        boolean boolean8 = attribute6.isBooleanAttribute();
        boolean boolean9 = attribute6.isDataAttribute();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute6.parent = attributes10;
        boolean boolean12 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attributes attributes13 = attribute6.parent;
        boolean boolean14 = attribute6.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute15 = attribute6.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attribute6.shouldCollapseAttribute(outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attribute15);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        java.lang.String str10 = attribute9.toString();
        org.jsoup.nodes.Attributes attributes11 = attribute9.parent;
        java.lang.String str12 = attribute9.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = attribute9.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.String str6 = attribute3.toString();
        java.lang.Class<?> wildcardClass7 = attribute3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        java.lang.String str8 = attribute7.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str6 = attribute5.getValue();
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        java.lang.Class<?> wildcardClass8 = attribute5.getClass();
        boolean boolean9 = attribute2.equals((java.lang.Object) wildcardClass8);
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute2.parent = attributes10;
        org.jsoup.nodes.Attributes attributes12 = attribute2.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = attributes12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        java.lang.String str8 = attribute7.toString();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        attribute29.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        java.lang.String str32 = attribute29.getKey();
        org.jsoup.nodes.Attributes attributes33 = attribute29.parent;
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str32, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes33);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute7.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(attribute7);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"", "");
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        org.jsoup.nodes.Attributes attributes10 = attribute9.parent;
        boolean boolean11 = attribute9.isBooleanAttribute();
        boolean boolean12 = attribute9.isDataAttribute();
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute9.parent = attributes13;
        java.lang.String str15 = attribute9.getValue();
        org.jsoup.nodes.Attribute attribute18 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute19 = attribute18.clone();
        boolean boolean20 = attribute9.equals((java.lang.Object) attribute18);
        boolean boolean21 = attribute5.equals((java.lang.Object) attribute9);
        boolean boolean22 = attribute2.equals((java.lang.Object) attribute5);
        java.lang.String str23 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str23, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        java.lang.String str6 = attribute3.getKey();
        java.lang.String str7 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str7, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute11.html(appendable15, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute13 = attribute12.clone();
        boolean boolean15 = attribute12.equals((java.lang.Object) (-1L));
        java.lang.String str16 = attribute12.getKey();
        boolean boolean17 = attribute3.equals((java.lang.Object) attribute12);
        boolean boolean18 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str16, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        java.lang.String str11 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
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
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean6 = attribute3.equals((java.lang.Object) '4');
        attribute3.setKey("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attribute3.shouldCollapseAttribute(outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        attribute6.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean10 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute3.parent = attributes11;
        java.lang.String str13 = attribute3.toString();
        java.lang.String str14 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute3.parent = attributes15;
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str13, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str14, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        boolean boolean29 = attribute21.isDataAttribute();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        java.lang.String str12 = attribute10.toString();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes15);
        boolean boolean17 = attribute16.isBooleanAttribute();
        java.lang.String str18 = attribute16.getValue();
        java.lang.String str19 = attribute16.toString();
        org.jsoup.nodes.Attribute attribute20 = attribute16.clone();
        boolean boolean21 = attribute20.isDataAttribute();
        boolean boolean22 = attribute20.isBooleanAttribute();
        java.lang.String str23 = attribute20.getKey();
        boolean boolean24 = attribute10.equals((java.lang.Object) attribute20);
        org.jsoup.nodes.Attributes attributes25 = attribute10.parent;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str19, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(attributes25);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", attributes2);
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str6 = attribute3.toString();
        boolean boolean7 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        org.jsoup.nodes.Attribute attribute9 = attribute7.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"", "hi!");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean6 = attribute2.equals((java.lang.Object) 0.0d);
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        boolean boolean6 = attribute3.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        java.lang.String str7 = attribute3.toString();
        boolean boolean8 = attribute3.isDataAttribute();
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.getKey();
        java.lang.String str11 = attribute3.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attribute3.shouldCollapseAttribute(outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = attributes7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", attributes2);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute3.parent = attributes11;
        org.jsoup.nodes.Attribute attribute13 = attribute3.clone();
        java.lang.String str14 = attribute13.html();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str7 = attribute3.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attribute3.shouldCollapseAttribute(outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        attribute5.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute5.toString();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        java.lang.String str13 = attribute12.toString();
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute12.parent = attributes14;
        boolean boolean17 = attribute12.equals((java.lang.Object) 1L);
        boolean boolean18 = attribute12.isBooleanAttribute();
        java.lang.String str19 = attribute12.toString();
        java.lang.String str20 = attribute12.toString();
        java.lang.String str21 = attribute12.html();
        java.lang.String str22 = attribute12.html();
        boolean boolean23 = attribute5.equals((java.lang.Object) str22);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"" + "'", str19, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"" + "'", str20, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"" + "'", str22, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute2.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attribute3.shouldCollapseAttribute(outputSettings15);
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
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attribute9.shouldCollapseAttribute(outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        java.lang.String str9 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        java.lang.String str11 = attribute3.getKey();
        java.lang.String str12 = attribute3.toString();
        java.lang.String str13 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
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
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute6.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.toString();
        java.lang.String str7 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        attribute6.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean10 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str11 = attribute3.getValue();
        java.lang.String str12 = attribute3.getKey();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute4.shouldCollapseAttribute(outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute5);
        java.lang.String str8 = attribute2.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.Object obj6 = null;
        boolean boolean7 = attribute2.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute2.shouldCollapseAttribute(outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "");
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
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attribute3.shouldCollapseAttribute(outputSettings14);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.toString();
        java.lang.String str6 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes9);
        java.lang.String str11 = attribute10.toString();
        java.lang.String str12 = attribute10.toString();
        boolean boolean13 = attribute3.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attribute attribute14 = attribute10.clone();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute10.html(appendable15, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(attribute14);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        java.lang.String str8 = attribute3.getKey();
        java.lang.Class<?> wildcardClass9 = attribute3.getClass();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.Class<?> wildcardClass6 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        boolean boolean8 = attribute7.isDataAttribute();
        boolean boolean9 = attribute4.equals((java.lang.Object) attribute7);
        java.lang.String str10 = attribute7.getKey();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute6.parent = attributes7;
        java.lang.String str9 = attribute6.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute6);
        java.lang.String str11 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = attribute10.shouldCollapseAttribute(outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        java.lang.String str7 = attribute2.html();
        java.lang.String str8 = attribute2.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"" + "'", str7, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute3.shouldCollapseAttribute(outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.getValue();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
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
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        attribute13.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        org.jsoup.nodes.Attribute attribute13 = attribute3.clone();
        java.lang.Object obj14 = null;
        boolean boolean15 = attribute3.equals(obj14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        boolean boolean22 = attribute3.isDataAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = attribute3.setValue("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.Class<?> wildcardClass5 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        attribute2.setKey("hi!=\"hi!\"");
        java.lang.String str6 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes6);
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean9 = attribute3.equals((java.lang.Object) attribute7);
        org.jsoup.nodes.Attributes attributes10 = attribute7.parent;
        boolean boolean11 = attribute7.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable7, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", attributes2);
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute2.shouldCollapseAttribute(outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute9.html(appendable10, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("", "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes7);
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean10 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str15 = attribute14.html();
        boolean boolean16 = attribute14.isBooleanAttribute();
        attribute14.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.nodes.Attribute attribute22 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes21);
        org.jsoup.nodes.Attributes attributes23 = null;
        attribute22.parent = attributes23;
        org.jsoup.nodes.Attribute attribute27 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean28 = attribute22.equals((java.lang.Object) "hi!");
        java.lang.String str29 = attribute22.toString();
        org.jsoup.nodes.Attribute attribute30 = attribute22.clone();
        boolean boolean31 = attribute14.equals((java.lang.Object) attribute22);
        boolean boolean32 = attribute3.equals((java.lang.Object) attribute22);
        boolean boolean34 = attribute3.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str15, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!=\"hi!\"" + "'", str29, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str5 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(attribute8);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.Class<?> wildcardClass8 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attribute3.shouldCollapseAttribute(outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str18 = attribute17.html();
        org.jsoup.nodes.Attribute attribute19 = attribute17.clone();
        java.lang.String str20 = attribute19.getKey();
        org.jsoup.nodes.Attribute attribute21 = attribute19.clone();
        boolean boolean22 = attribute13.equals((java.lang.Object) attribute21);
        java.lang.String str23 = attribute13.getKey();
        java.lang.Class<?> wildcardClass24 = attribute13.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str18, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"" + "'", str20, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute2.equals((java.lang.Object) (-1L));
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes10 = attribute3.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attribute3.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute9.clone();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute9.html(appendable11, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        java.lang.Class<?> wildcardClass13 = attribute3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute7.parent = attributes8;
        java.lang.String str10 = attribute7.html();
        boolean boolean11 = attribute2.equals((java.lang.Object) attribute7);
        java.lang.String str12 = attribute7.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes12);
        java.lang.String str14 = attribute13.toString();
        boolean boolean15 = attribute13.isDataAttribute();
        attribute13.setKey("hi!");
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute23 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str24 = attribute23.html();
        org.jsoup.nodes.Attribute attribute25 = attribute23.clone();
        attribute25.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str28 = attribute25.getKey();
        boolean boolean29 = attribute20.equals((java.lang.Object) str28);
        boolean boolean31 = attribute20.equals((java.lang.Object) '4');
        boolean boolean32 = attribute13.equals((java.lang.Object) '4');
        boolean boolean33 = attribute3.equals((java.lang.Object) boolean32);
        java.lang.String str34 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes35 = null;
        attribute3.parent = attributes35;
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str24, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str28, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str34, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes7);
        org.jsoup.nodes.Attribute attribute11 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute12 = attribute11.clone();
        attribute11.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean15 = attribute8.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes16 = null;
        attribute8.parent = attributes16;
        java.lang.String str18 = attribute8.toString();
        java.lang.String str19 = attribute8.toString();
        boolean boolean20 = attribute2.equals((java.lang.Object) attribute8);
        boolean boolean21 = attribute8.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str18, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str19, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        java.lang.String str5 = attribute3.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"" + "'", str3, "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute3.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        java.lang.String str7 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "");
        boolean boolean6 = attribute2.equals((java.lang.Object) "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        java.lang.String str7 = attribute6.toString();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute6.parent = attributes8;
        java.lang.String str10 = attribute6.toString();
        boolean boolean11 = attribute6.isBooleanAttribute();
        java.lang.String str12 = attribute6.html();
        boolean boolean13 = attribute2.equals((java.lang.Object) str12);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable14, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute3.getKey();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.toString();
        java.lang.String str6 = attribute3.getKey();
        boolean boolean7 = attribute3.isDataAttribute();
        boolean boolean8 = attribute3.isBooleanAttribute();
        boolean boolean9 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute3.toString();
        java.lang.String str9 = attribute3.getValue();
        java.lang.String str10 = attribute3.html();
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str13 = attribute3.getKey();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attribute3.shouldCollapseAttribute(outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str13, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.Class<?> wildcardClass5 = attribute3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute2.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        java.lang.String str8 = attribute3.getValue();
        java.lang.String str9 = attribute3.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        boolean boolean7 = attribute2.isBooleanAttribute();
        java.lang.String str8 = attribute2.getKey();
        boolean boolean9 = attribute2.isDataAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attribute3.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.getValue();
        java.lang.String str7 = attribute2.getKey();
        java.lang.String str8 = attribute2.toString();
        java.lang.String str9 = attribute2.getValue();
        java.lang.Class<?> wildcardClass10 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        org.jsoup.nodes.Attributes attributes9 = attribute8.parent;
        java.lang.String str10 = attribute8.toString();
        java.lang.String str11 = attribute8.getKey();
        java.lang.String str12 = attribute8.html();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute11 = attribute10.clone();
        org.jsoup.nodes.Attribute attribute12 = attribute11.clone();
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute11.parent = attributes13;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNotNull(attribute12);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute3.parent = attributes11;
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
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        java.lang.String str8 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        java.lang.Class<?> wildcardClass11 = attribute10.getClass();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.toString();
        java.lang.String str6 = attribute3.getKey();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.getKey();
        java.lang.String str9 = attribute3.html();
        java.lang.String str10 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean7 = attribute3.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean6 = attribute3.equals((java.lang.Object) '4');
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getValue();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        java.lang.String str8 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute14 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute14.parent = attributes15;
        boolean boolean17 = attribute3.equals((java.lang.Object) attribute14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = attribute3.setValue("hi!=\"hi!\"=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        java.lang.String str16 = attribute11.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes7);
        org.jsoup.nodes.Attribute attribute9 = attribute8.clone();
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        boolean boolean13 = attribute12.isDataAttribute();
        boolean boolean14 = attribute9.equals((java.lang.Object) attribute12);
        java.lang.String str15 = attribute12.html();
        boolean boolean16 = attribute2.equals((java.lang.Object) str15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str15, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean6 = attribute3.equals((java.lang.Object) '4');
        attribute3.setKey("hi!");
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes11);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute4.getValue();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.getKey();
        java.lang.String str11 = attribute3.getValue();
        boolean boolean12 = attribute3.isDataAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = attribute3.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.String str6 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        java.lang.Class<?> wildcardClass8 = attribute3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str6, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        java.lang.String str6 = attribute3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attribute3.setValue("hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str6, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.html();
        java.lang.String str5 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean7 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        boolean boolean9 = attribute8.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute2.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attribute2.shouldCollapseAttribute(outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        java.lang.String str22 = attribute18.html();
        java.lang.String str23 = attribute18.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str22, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str23, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getValue();
        java.lang.String str8 = attribute3.getValue();
        java.lang.String str9 = attribute3.html();
        java.lang.String str10 = attribute3.getValue();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable11, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.toString();
        boolean boolean11 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute12 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes13 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute16 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"\"");
        boolean boolean17 = attribute3.equals((java.lang.Object) "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean6 = attribute3.equals((java.lang.Object) (short) 0);
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        java.lang.String str47 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute48 = attribute2.clone();
        java.lang.String str49 = attribute48.getKey();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(attribute48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.toString();
        java.lang.String str10 = attribute3.getValue();
        java.lang.String str11 = attribute3.html();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute3.parent = attributes11;
        java.lang.String str13 = attribute3.getKey();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str13, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"\"" + "'", str4, "hi!=\"\"");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.getValue();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", attributes7);
        boolean boolean9 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute10 = attribute2.clone();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable11, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attribute10);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        boolean boolean9 = attribute7.equals((java.lang.Object) "hi!");
        attribute7.setKey("hi!=\"hi!\"");
        java.lang.String str12 = attribute7.toString();
        java.lang.String str13 = attribute7.toString();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.nodes.Attribute attribute17 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!", attributes16);
        boolean boolean18 = attribute17.isBooleanAttribute();
        boolean boolean19 = attribute7.equals((java.lang.Object) attribute17);
        boolean boolean20 = attribute2.equals((java.lang.Object) attribute17);
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str13, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute2.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes6);
        java.lang.String str8 = attribute7.toString();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute7.parent = attributes9;
        boolean boolean12 = attribute7.equals((java.lang.Object) 1L);
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute7.parent = attributes13;
        java.lang.String str15 = attribute7.getKey();
        boolean boolean16 = attribute7.isDataAttribute();
        org.jsoup.nodes.Attributes attributes17 = attribute7.parent;
        java.lang.String str18 = attribute7.getKey();
        org.jsoup.nodes.Attributes attributes19 = null;
        attribute7.parent = attributes19;
        boolean boolean21 = attribute2.equals((java.lang.Object) attributes19);
        java.lang.Class<?> wildcardClass22 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute7 = attribute4.clone();
        boolean boolean8 = attribute4.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        java.lang.String str8 = attribute5.html();
        boolean boolean10 = attribute5.equals((java.lang.Object) (short) -1);
        boolean boolean11 = attribute5.isDataAttribute();
        boolean boolean12 = attribute2.equals((java.lang.Object) attribute5);
        boolean boolean13 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes14 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean17 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes18 = attribute2.parent;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(attributes18);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attribute4.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.getKey();
        java.lang.String str11 = attribute3.getValue();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable12, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getKey();
        java.lang.String str9 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes12);
        java.lang.String str14 = attribute13.html();
        java.lang.String str15 = attribute13.getValue();
        boolean boolean16 = attribute3.equals((java.lang.Object) attribute13);
        org.jsoup.nodes.Attributes attributes17 = attribute3.parent;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str15, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes17);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute5);
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute5.parent = attributes8;
        attribute5.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.Class<?> wildcardClass12 = attribute5.getClass();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "", attributes2);
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
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attribute2.shouldCollapseAttribute(outputSettings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes6);
        boolean boolean8 = attribute7.isDataAttribute();
        boolean boolean9 = attribute3.equals((java.lang.Object) attribute7);
        org.jsoup.nodes.Attributes attributes10 = attribute7.parent;
        java.lang.Class<?> wildcardClass11 = attribute7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute2.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        attribute3.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        boolean boolean9 = attribute3.isBooleanAttribute();
        boolean boolean10 = attribute3.isBooleanAttribute();
        boolean boolean11 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        java.lang.Class<?> wildcardClass7 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        org.jsoup.nodes.Attributes attributes20 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(attributes20);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        boolean boolean12 = attribute11.isBooleanAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = attribute11.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean6 = attribute5.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = attribute5.parent;
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute5.parent = attributes8;
        java.lang.String str10 = attribute5.getValue();
        boolean boolean11 = attribute5.isBooleanAttribute();
        boolean boolean12 = attribute2.equals((java.lang.Object) boolean11);
        java.lang.Class<?> wildcardClass13 = attribute2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute2.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        boolean boolean33 = attribute32.isBooleanAttribute();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.toString();
        java.lang.String str6 = attribute3.getKey();
        java.lang.String str7 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
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
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute2.setKey("hi!");
        boolean boolean5 = attribute2.isBooleanAttribute();
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
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        java.lang.String str10 = attribute3.html();
        java.lang.Class<?> wildcardClass11 = attribute3.getClass();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute4.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute4.parent = attributes6;
        java.lang.String str8 = attribute4.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attribute4.shouldCollapseAttribute(outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean5 = attribute2.isBooleanAttribute();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable6, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "", attributes2);
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
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        java.lang.String str6 = attribute2.getKey();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute2.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes9 = attribute3.parent;
        boolean boolean10 = attribute3.isDataAttribute();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable11, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        boolean boolean10 = attribute3.isDataAttribute();
        java.lang.String str11 = attribute3.getKey();
        boolean boolean12 = attribute3.isDataAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute9 = attribute8.clone();
        org.jsoup.nodes.Attributes attributes10 = attribute8.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute8.parent = attributes11;
        boolean boolean13 = attribute2.equals((java.lang.Object) attributes11);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable14, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean8 = attribute6.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute6.parent = attributes9;
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute6.parent = attributes11;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute16 = attribute15.clone();
        boolean boolean18 = attribute15.equals((java.lang.Object) (-1L));
        java.lang.String str19 = attribute15.getKey();
        boolean boolean20 = attribute6.equals((java.lang.Object) attribute15);
        boolean boolean21 = attribute2.equals((java.lang.Object) attribute6);
        java.lang.String str22 = attribute6.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str19, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str22, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        boolean boolean15 = attribute3.isDataAttribute();
        java.lang.String str16 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.toString();
        java.lang.String str11 = attribute3.html();
        org.jsoup.nodes.Attribute attribute12 = attribute3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attribute12.shouldCollapseAttribute(outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute12);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        boolean boolean7 = attribute2.isDataAttribute();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute2.html();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.getKey();
        boolean boolean6 = attribute3.equals((java.lang.Object) "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.Class<?> wildcardClass5 = attribute3.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str5 = attribute2.toString();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        attribute6.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean10 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute3.parent = attributes11;
        java.lang.String str13 = attribute3.toString();
        java.lang.String str14 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes15 = attribute3.parent;
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str13, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str14, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes15);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        boolean boolean10 = attribute3.isBooleanAttribute();
        java.lang.String str11 = attribute3.getValue();
        java.lang.String str12 = attribute3.getValue();
        boolean boolean13 = attribute3.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes6);
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean9 = attribute3.equals((java.lang.Object) attribute7);
        java.lang.String str10 = attribute7.getKey();
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        boolean boolean13 = attribute3.equals((java.lang.Object) "hi!");
        boolean boolean14 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes15 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute16 = attribute3.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = attribute16.shouldCollapseAttribute(outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertNotNull(attribute16);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean6 = attribute3.equals((java.lang.Object) (short) 0);
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str9 = attribute3.getKey();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str9, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        java.lang.String str6 = attribute2.getValue();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute2.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attribute3.setValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"", attributes2);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes8);
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute9.parent = attributes10;
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean15 = attribute9.equals((java.lang.Object) "hi!");
        java.lang.String str16 = attribute9.toString();
        java.lang.String str17 = attribute9.html();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.nodes.Attribute attribute21 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes20);
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.nodes.Attribute attribute25 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes24);
        org.jsoup.nodes.Attribute attribute26 = attribute25.clone();
        boolean boolean27 = attribute21.equals((java.lang.Object) attribute25);
        boolean boolean28 = attribute9.equals((java.lang.Object) attribute21);
        boolean boolean29 = attribute3.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"" + "'", str16, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes6);
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean9 = attribute3.equals((java.lang.Object) attribute7);
        org.jsoup.nodes.Attributes attributes10 = attribute7.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attribute7.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean6 = attribute3.equals((java.lang.Object) (short) 0);
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute10 = attribute9.clone();
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute9);
        boolean boolean12 = attribute9.isBooleanAttribute();
        attribute9.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes15 = attribute9.parent;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes15);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.toString();
        java.lang.String str9 = attribute3.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attribute3.shouldCollapseAttribute(outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
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
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        java.lang.String str8 = attribute3.toString();
        boolean boolean9 = attribute3.isDataAttribute();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.html();
        boolean boolean7 = attribute2.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean6 = attribute3.equals((java.lang.Object) '4');
        attribute3.setKey("hi!");
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str11 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.toString();
        boolean boolean4 = attribute2.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.html();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable11, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        java.lang.String str7 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        java.lang.String str7 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute13 = attribute12.clone();
        attribute12.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean16 = attribute3.equals((java.lang.Object) attribute12);
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute3.parent = attributes17;
        boolean boolean19 = attribute3.isDataAttribute();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        boolean boolean7 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"");
        java.lang.Class<?> wildcardClass6 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        boolean boolean7 = attribute3.isDataAttribute();
        java.lang.String str8 = attribute3.getValue();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attribute3.shouldCollapseAttribute(outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute2.setKey("hi!");
        boolean boolean5 = attribute2.isBooleanAttribute();
        java.lang.String str6 = attribute2.getKey();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute2.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str6 = attribute5.html();
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        attribute7.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str10 = attribute7.getKey();
        boolean boolean11 = attribute2.equals((java.lang.Object) str10);
        boolean boolean13 = attribute2.equals((java.lang.Object) '4');
        java.lang.String str14 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute4.getKey();
        org.jsoup.nodes.Attribute attribute6 = attribute4.clone();
        boolean boolean7 = attribute6.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute8 = attribute6.clone();
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str12 = attribute11.html();
        boolean boolean13 = attribute11.isBooleanAttribute();
        boolean boolean14 = attribute6.equals((java.lang.Object) attribute11);
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute6.parent = attributes15;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = attribute6.shouldCollapseAttribute(outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
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
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean10 = attribute8.equals((java.lang.Object) "hi!");
        boolean boolean11 = attribute8.isBooleanAttribute();
        java.lang.String str12 = attribute8.getKey();
        boolean boolean13 = attribute2.equals((java.lang.Object) attribute8);
        boolean boolean14 = attribute8.isDataAttribute();
        java.lang.String str15 = attribute8.html();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str15, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable4, outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        boolean boolean13 = attribute11.isDataAttribute();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
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
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

