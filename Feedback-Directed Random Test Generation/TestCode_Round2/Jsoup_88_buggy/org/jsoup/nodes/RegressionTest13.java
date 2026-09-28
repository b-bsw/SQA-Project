package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.String str8 = attribute2.getKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
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
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", "hi!=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!\"");
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
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
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
        org.jsoup.nodes.Attribute attribute31 = attribute9.clone();
        java.lang.String str32 = attribute31.toString();
        java.lang.String str33 = attribute31.toString();
        java.lang.Class<?> wildcardClass34 = attribute31.getClass();
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
        org.junit.Assert.assertNotNull(attribute31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str32, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str33, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        boolean boolean10 = attribute3.isBooleanAttribute();
        java.lang.Class<?> wildcardClass11 = attribute3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.isDataAttribute();
        boolean boolean7 = attribute2.isDataAttribute();
        java.lang.Class<?> wildcardClass8 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", attributes7);
        attribute8.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
        boolean boolean11 = attribute2.equals((java.lang.Object) attribute8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.html();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        java.lang.String str8 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        java.lang.String str13 = attribute3.getValue();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute4.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
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
        boolean boolean22 = attribute3.isBooleanAttribute();
        java.lang.String str23 = attribute3.getValue();
        java.lang.String str24 = attribute3.html();
        boolean boolean25 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str15, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"" + "'", str24, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.toString();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        java.lang.Object obj7 = null;
        boolean boolean8 = attribute2.equals(obj7);
        boolean boolean9 = attribute2.isBooleanAttribute();
        boolean boolean10 = attribute2.isBooleanAttribute();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable11, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
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
        java.lang.String str17 = attribute3.html();
        java.lang.String str18 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes19 = attribute3.parent;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes19);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes7);
        org.jsoup.nodes.Attributes attributes9 = attribute8.parent;
        java.lang.String str10 = attribute8.getKey();
        attribute8.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str13 = attribute8.toString();
        java.lang.String str14 = attribute8.toString();
        boolean boolean15 = attribute3.equals((java.lang.Object) attribute8);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attribute8.shouldCollapseAttribute(outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str13, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
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
        org.jsoup.nodes.Attribute attribute39 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str40 = attribute39.toString();
        org.jsoup.nodes.Attribute attribute41 = attribute39.clone();
        boolean boolean42 = attribute20.equals((java.lang.Object) attribute41);
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
        org.junit.Assert.assertNotNull(attribute39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str40, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.html();
        java.lang.String str5 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
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
        org.jsoup.nodes.Attribute attribute33 = attribute22.clone();
        java.lang.String str34 = attribute22.toString();
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
        org.junit.Assert.assertNotNull(attribute33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!=\"hi!\"" + "'", str34, "hi!=\"hi!\"");
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        java.lang.String str8 = attribute7.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        org.jsoup.nodes.Attribute attribute8 = attribute5.clone();
        java.lang.String str9 = attribute8.html();
        java.lang.String str10 = attribute8.getValue();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute8.parent = attributes11;
        boolean boolean13 = attribute8.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.html();
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.String str6 = attribute5.getValue();
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute5);
        org.jsoup.nodes.Attribute attribute8 = attribute5.clone();
        attribute8.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute8.html(appendable11, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"" + "'", str6, "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute8);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.getKey();
        boolean boolean5 = attribute2.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        java.lang.String str7 = attribute3.toString();
        boolean boolean8 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"");
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str7, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        attribute6.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str7 = attribute4.getKey();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute4.parent = attributes8;
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute4.parent = attributes10;
        org.jsoup.nodes.Attributes attributes12 = attribute4.parent;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes6);
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str12 = attribute11.html();
        org.jsoup.nodes.Attribute attribute13 = attribute11.clone();
        attribute13.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str16 = attribute13.getKey();
        boolean boolean17 = attribute13.isDataAttribute();
        java.lang.String str18 = attribute13.toString();
        boolean boolean19 = attribute8.equals((java.lang.Object) str18);
        boolean boolean20 = attribute3.equals((java.lang.Object) boolean19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = attribute3.shouldCollapseAttribute(outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str16, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str18, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        java.lang.Class<?> wildcardClass7 = attribute3.getClass();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
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
        java.lang.String str20 = attribute2.html();
        boolean boolean21 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str20, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
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
        java.lang.String str13 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute14 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str17 = attribute3.getKey();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str13, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str17, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        boolean boolean6 = attribute3.isDataAttribute();
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.getValue();
        java.lang.String str11 = attribute3.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.toString();
        java.lang.String str6 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
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
        java.lang.String str14 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes15 = attribute2.parent;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attribute2.shouldCollapseAttribute(outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes15);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        boolean boolean8 = attribute6.isBooleanAttribute();
        boolean boolean9 = attribute6.isDataAttribute();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute6.parent = attributes10;
        java.lang.String str12 = attribute6.getValue();
        org.jsoup.nodes.Attribute attribute13 = attribute6.clone();
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute13);
        java.lang.String str15 = attribute2.getKey();
        java.lang.String str16 = attribute2.html();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str15, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str16, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getKey();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute4.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
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
        java.lang.String str13 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes5 = attribute3.parent;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        attribute5.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute5.toString();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute5.parent = attributes9;
        java.lang.String str11 = attribute5.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str5 = attribute2.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", attributes7);
        boolean boolean9 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean10 = attribute2.isBooleanAttribute();
        java.lang.String str11 = attribute2.getKey();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.String str5 = attribute2.html();
        boolean boolean7 = attribute2.equals((java.lang.Object) (short) -1);
        boolean boolean8 = attribute2.isDataAttribute();
        java.lang.String str9 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.getKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        boolean boolean9 = attribute3.isBooleanAttribute();
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
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.getValue();
        java.lang.String str5 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        java.lang.String str9 = attribute2.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.html();
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute4.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes6);
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean9 = attribute3.equals((java.lang.Object) attribute7);
        org.jsoup.nodes.Attributes attributes10 = attribute7.parent;
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute7.parent = attributes11;
        java.lang.String str13 = attribute7.html();
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str13, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        java.lang.String str6 = attribute5.html();
        java.lang.String str7 = attribute5.getValue();
        java.lang.String str8 = attribute5.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        java.lang.String str6 = attribute3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        boolean boolean7 = attribute6.isBooleanAttribute();
        boolean boolean8 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attribute attribute9 = attribute6.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str11 = attribute3.getValue();
        boolean boolean12 = attribute3.isBooleanAttribute();
        java.lang.String str13 = attribute3.html();
        org.jsoup.nodes.Attribute attribute14 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute14.parent = attributes15;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str13, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute14);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        java.lang.Class<?> wildcardClass7 = attribute2.getClass();
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.getValue();
        java.lang.String str9 = attribute3.html();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute10);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        java.lang.String str5 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes6);
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        boolean boolean9 = attribute7.isBooleanAttribute();
        boolean boolean10 = attribute7.isDataAttribute();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute7.parent = attributes11;
        java.lang.String str13 = attribute7.getValue();
        org.jsoup.nodes.Attribute attribute14 = attribute7.clone();
        org.jsoup.nodes.Attribute attribute15 = attribute14.clone();
        boolean boolean16 = attribute3.equals((java.lang.Object) attribute14);
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute3.parent = attributes17;
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable19, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str7 = attribute6.html();
        org.jsoup.nodes.Attributes attributes8 = attribute6.parent;
        boolean boolean9 = attribute6.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes10 = attribute6.parent;
        java.lang.String str11 = attribute6.html();
        java.lang.Class<?> wildcardClass12 = attribute6.getClass();
        boolean boolean13 = attribute3.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attribute attribute16 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str17 = attribute16.getValue();
        org.jsoup.nodes.Attribute attribute18 = attribute16.clone();
        boolean boolean19 = attribute6.equals((java.lang.Object) attribute18);
        java.lang.String str20 = attribute6.getKey();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"" + "'", str17, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"");
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"" + "'", str20, "hi!=\"hi!\"");
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
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
            java.lang.String str14 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
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
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        java.lang.String str7 = attribute4.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        // The following exception was thrown during execution in test generation
        try {
            attribute2.setKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str7 = attribute4.getKey();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute4.parent = attributes8;
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean12 = attribute4.isBooleanAttribute();
        java.lang.String str13 = attribute4.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str13, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", attributes7);
        boolean boolean9 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean10 = attribute2.isBooleanAttribute();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = attribute3.shouldCollapseAttribute(outputSettings38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        boolean boolean10 = attribute9.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute11 = attribute9.clone();
        attribute9.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
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
        java.lang.String str22 = attribute21.html();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str22, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes6);
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute7.parent = attributes9;
        boolean boolean11 = attribute7.isDataAttribute();
        boolean boolean12 = attribute3.equals((java.lang.Object) boolean11);
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute3.parent = attributes13;
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
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
        org.jsoup.nodes.Attribute attribute31 = attribute9.clone();
        boolean boolean32 = attribute31.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes33 = attribute31.parent;
        org.jsoup.nodes.Attribute attribute34 = attribute31.clone();
        boolean boolean35 = attribute34.isBooleanAttribute();
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
        org.junit.Assert.assertNotNull(attribute31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(attributes33);
        org.junit.Assert.assertNotNull(attribute34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
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
        org.jsoup.nodes.Attributes attributes18 = null;
        attribute14.parent = attributes18;
        boolean boolean20 = attribute14.isDataAttribute();
        org.jsoup.nodes.Attributes attributes21 = null;
        attribute14.parent = attributes21;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str15, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str16, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean6 = attribute2.equals((java.lang.Object) 0.0d);
        java.lang.String str7 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str11 = attribute10.getKey();
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attribute2.shouldCollapseAttribute(outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str11, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute11 = attribute10.clone();
        org.jsoup.nodes.Attribute attribute12 = attribute11.clone();
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str16 = attribute15.html();
        boolean boolean17 = attribute15.isBooleanAttribute();
        attribute15.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.nodes.Attribute attribute23 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes22);
        org.jsoup.nodes.Attributes attributes24 = null;
        attribute23.parent = attributes24;
        org.jsoup.nodes.Attribute attribute28 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean29 = attribute23.equals((java.lang.Object) "hi!");
        java.lang.String str30 = attribute23.toString();
        org.jsoup.nodes.Attribute attribute31 = attribute23.clone();
        boolean boolean32 = attribute15.equals((java.lang.Object) attribute23);
        java.lang.String str33 = attribute23.html();
        java.lang.String str34 = attribute23.getValue();
        boolean boolean35 = attribute11.equals((java.lang.Object) attribute23);
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = attribute23.shouldCollapseAttribute(outputSettings36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str16, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!=\"hi!\"" + "'", str30, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"hi!\"" + "'", str33, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
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
        org.jsoup.nodes.Attributes attributes31 = attribute9.parent;
        boolean boolean32 = attribute9.isDataAttribute();
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
        org.junit.Assert.assertNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = attribute10.shouldCollapseAttribute(outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "", attributes2);
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str6 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
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
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        attribute3.setKey("hi!=\"\"");
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        java.lang.String str8 = attribute3.getKey();
        java.lang.String str9 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"\"" + "'", str8, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"\"" + "'", str9, "hi!=\"\"");
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        java.lang.Class<?> wildcardClass6 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getValue();
        java.lang.String str8 = attribute3.getValue();
        java.lang.String str9 = attribute3.getKey();
        boolean boolean10 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute3.parent = attributes11;
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        java.lang.String str7 = attribute3.toString();
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute3.parent = attributes11;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        attribute2.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        boolean boolean3 = attribute2.isDataAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.Class<?> wildcardClass6 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"=\"hi!=\"hi!\"=\"hi!\"\"", "", attributes2);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.String str6 = attribute3.toString();
        java.lang.String str7 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str7 = attribute2.getKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
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
        org.jsoup.nodes.Attribute attribute18 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = attribute18.shouldCollapseAttribute(outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attribute18);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        java.lang.String str7 = attribute3.toString();
        boolean boolean8 = attribute3.isDataAttribute();
        boolean boolean9 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes10 = attribute3.parent;
        java.lang.String str11 = attribute3.toString();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        boolean boolean6 = attribute5.isDataAttribute();
        java.lang.String str7 = attribute5.getKey();
        org.jsoup.nodes.Attribute attribute8 = attribute5.clone();
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute8);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean6 = attribute3.equals((java.lang.Object) '4');
        java.lang.String str7 = attribute3.html();
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute8.parent = attributes9;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attribute8.shouldCollapseAttribute(outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute8);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        boolean boolean7 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        java.lang.String str10 = attribute3.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str10, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"", attributes2);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        java.lang.String str6 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!\"");
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        java.lang.Class<?> wildcardClass4 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        boolean boolean7 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
        boolean boolean10 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute3.parent = attributes11;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        boolean boolean8 = attribute7.isDataAttribute();
        boolean boolean9 = attribute7.isBooleanAttribute();
        java.lang.String str10 = attribute7.getKey();
        org.jsoup.nodes.Attributes attributes11 = attribute7.parent;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes11);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
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
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.nodes.Attribute attribute28 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes27);
        org.jsoup.nodes.Attributes attributes29 = attribute28.parent;
        java.lang.String str30 = attribute28.getKey();
        org.jsoup.nodes.Attributes attributes31 = null;
        attribute28.parent = attributes31;
        java.lang.String str33 = attribute28.getKey();
        org.jsoup.nodes.Attribute attribute34 = attribute28.clone();
        org.jsoup.nodes.Attributes attributes35 = null;
        attribute34.parent = attributes35;
        java.lang.Class<?> wildcardClass37 = attribute34.getClass();
        boolean boolean38 = attribute15.equals((java.lang.Object) attribute34);
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
        org.junit.Assert.assertNull(attributes29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(attribute34);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
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
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"" + "'", str5, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
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
        org.jsoup.nodes.Attribute attribute18 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str16, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attribute18);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;&quot;\"");
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "", attributes2);
        java.lang.String str4 = attribute3.html();
        java.lang.String str5 = attribute3.html();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
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
        java.lang.String str13 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute14 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes15 = attribute14.parent;
        java.lang.String str16 = attribute14.getValue();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str13, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        java.lang.String str7 = attribute2.getKey();
        boolean boolean8 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        attribute3.setKey("hi!");
        boolean boolean8 = attribute3.isDataAttribute();
        java.lang.String str9 = attribute3.getValue();
        java.lang.Class<?> wildcardClass10 = attribute3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.html();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attribute3.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
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
        boolean boolean48 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = attribute2.shouldCollapseAttribute(outputSettings49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes6);
        java.lang.String str8 = attribute7.getKey();
        attribute7.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str11 = attribute7.toString();
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute7.parent = attributes12;
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute7);
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute7.html(appendable15, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
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
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
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
        boolean boolean13 = attribute3.isDataAttribute();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
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
        java.lang.String str25 = attribute10.html();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=\"hi!\"" + "'", str25, "hi!=\"hi!\"");
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
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
        attribute8.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute25 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str26 = attribute25.getValue();
        boolean boolean27 = attribute25.isDataAttribute();
        boolean boolean28 = attribute8.equals((java.lang.Object) attribute25);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str18, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str19, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str26, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        java.lang.String str8 = attribute2.html();
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", attributes2);
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes9);
        org.jsoup.nodes.Attributes attributes11 = attribute10.parent;
        java.lang.String str12 = attribute10.getKey();
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute10.parent = attributes13;
        org.jsoup.nodes.Attributes attributes15 = attribute10.parent;
        boolean boolean16 = attribute10.isDataAttribute();
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute10.parent = attributes17;
        boolean boolean19 = attribute3.equals((java.lang.Object) attribute10);
        boolean boolean20 = attribute10.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        attribute3.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.toString();
        java.lang.String str8 = attribute3.getValue();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.html();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.getKey();
        java.lang.String str9 = attribute3.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str9, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes6);
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        boolean boolean10 = attribute7.equals((java.lang.Object) (short) 0);
        boolean boolean11 = attribute7.isDataAttribute();
        boolean boolean12 = attribute7.isBooleanAttribute();
        boolean boolean13 = attribute7.isDataAttribute();
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute7);
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute7.parent = attributes15;
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute7.parent = attributes17;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
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
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str6 = attribute5.html();
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        attribute7.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str10 = attribute7.getKey();
        boolean boolean11 = attribute2.equals((java.lang.Object) str10);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        java.lang.String str16 = attribute15.toString();
        boolean boolean17 = attribute15.isDataAttribute();
        java.lang.String str18 = attribute15.html();
        boolean boolean19 = attribute2.equals((java.lang.Object) attribute15);
        org.jsoup.nodes.Attributes attributes20 = attribute2.parent;
        java.lang.String str21 = attribute2.toString();
        java.lang.String str22 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"" + "'", str16, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"" + "'", str22, "hi!=\"hi!\"");
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
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
        java.lang.String str43 = attribute39.getValue();
        java.lang.String str44 = attribute39.html();
        java.lang.Class<?> wildcardClass45 = attribute39.getClass();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str44, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.String str5 = attribute2.html();
        boolean boolean6 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean8 = attribute7.isBooleanAttribute();
        java.lang.String str9 = attribute7.getKey();
        boolean boolean10 = attribute3.equals((java.lang.Object) attribute7);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str9, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", "hi!=\"\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable7, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        attribute5.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean11 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        org.jsoup.nodes.Attributes attributes16 = attribute15.parent;
        boolean boolean17 = attribute15.isBooleanAttribute();
        boolean boolean18 = attribute15.isBooleanAttribute();
        java.lang.String str19 = attribute15.getValue();
        java.lang.String str20 = attribute15.getKey();
        boolean boolean21 = attribute3.equals((java.lang.Object) attribute15);
        org.jsoup.nodes.Attribute attribute24 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!");
        java.lang.String str25 = attribute24.html();
        java.lang.String str26 = attribute24.html();
        boolean boolean27 = attribute15.equals((java.lang.Object) attribute24);
        boolean boolean28 = attribute15.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.nodes.Attribute attribute32 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes31);
        boolean boolean33 = attribute15.equals((java.lang.Object) attributes31);
        java.lang.String str34 = attribute15.getKey();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(attribute24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str25, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str26, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.html();
        java.lang.String str5 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute11 = attribute10.clone();
        org.jsoup.nodes.Attribute attribute12 = attribute11.clone();
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str16 = attribute15.html();
        boolean boolean17 = attribute15.isBooleanAttribute();
        attribute15.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.nodes.Attribute attribute23 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes22);
        org.jsoup.nodes.Attributes attributes24 = null;
        attribute23.parent = attributes24;
        org.jsoup.nodes.Attribute attribute28 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean29 = attribute23.equals((java.lang.Object) "hi!");
        java.lang.String str30 = attribute23.toString();
        org.jsoup.nodes.Attribute attribute31 = attribute23.clone();
        boolean boolean32 = attribute15.equals((java.lang.Object) attribute23);
        java.lang.String str33 = attribute23.html();
        java.lang.String str34 = attribute23.getValue();
        boolean boolean35 = attribute11.equals((java.lang.Object) attribute23);
        boolean boolean36 = attribute11.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str16, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!=\"hi!\"" + "'", str30, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"hi!\"" + "'", str33, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", attributes2);
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str6 = attribute3.toString();
        java.lang.Class<?> wildcardClass7 = attribute3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        java.lang.String str6 = attribute3.html();
        java.lang.String str7 = attribute3.getKey();
        boolean boolean8 = attribute3.isBooleanAttribute();
        boolean boolean9 = attribute3.isDataAttribute();
        java.lang.String str10 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.Class<?> wildcardClass4 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        boolean boolean8 = attribute6.isBooleanAttribute();
        boolean boolean9 = attribute6.isDataAttribute();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute6.parent = attributes10;
        boolean boolean12 = attribute2.equals((java.lang.Object) attribute6);
        boolean boolean13 = attribute2.isBooleanAttribute();
        java.lang.String str14 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute15 = attribute2.clone();
        java.lang.String str16 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
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
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable6, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.getValue();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable6, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes5 = attribute3.parent;
        java.lang.String str6 = attribute3.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"" + "'", str6, "hi!=\"\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute4.getKey();
        org.jsoup.nodes.Attribute attribute6 = attribute4.clone();
        boolean boolean7 = attribute6.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute8 = attribute6.clone();
        boolean boolean9 = attribute6.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        org.jsoup.nodes.Attribute attribute8 = attribute5.clone();
        java.lang.String str9 = attribute8.html();
        org.jsoup.nodes.Attribute attribute10 = attribute8.clone();
        java.lang.Class<?> wildcardClass11 = attribute10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        boolean boolean7 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        java.lang.String str9 = attribute8.toString();
        java.lang.String str10 = attribute8.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attribute8.shouldCollapseAttribute(outputSettings11);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "", attributes2);
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean7 = attribute3.equals((java.lang.Object) attribute6);
        java.lang.Class<?> wildcardClass8 = attribute6.getClass();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        org.jsoup.nodes.Attributes attributes6 = attribute4.parent;
        java.lang.String str7 = attribute4.toString();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str11 = attribute10.html();
        org.jsoup.nodes.Attribute attribute12 = attribute10.clone();
        boolean boolean13 = attribute10.isDataAttribute();
        java.lang.String str14 = attribute10.html();
        java.lang.String str15 = attribute10.getValue();
        org.jsoup.nodes.Attribute attribute16 = attribute10.clone();
        boolean boolean17 = attribute4.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attributes attributes18 = null;
        attribute4.parent = attributes18;
        boolean boolean20 = attribute4.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute23 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str24 = attribute23.html();
        boolean boolean25 = attribute4.equals((java.lang.Object) attribute23);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"" + "'", str15, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"" + "'", str24, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute6.isBooleanAttribute();
        boolean boolean8 = attribute2.equals((java.lang.Object) boolean7);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        org.jsoup.nodes.Attribute attribute9 = attribute7.clone();
        boolean boolean10 = attribute9.isDataAttribute();
        java.lang.Class<?> wildcardClass11 = attribute9.getClass();
        boolean boolean12 = attribute3.equals((java.lang.Object) wildcardClass11);
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str7 = attribute4.getKey();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute4.parent = attributes8;
        org.jsoup.nodes.Attributes attributes10 = attribute4.parent;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
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
        org.jsoup.nodes.Attribute attribute15 = attribute14.clone();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.nodes.Attribute attribute19 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!\"", attributes18);
        org.jsoup.nodes.Attributes attributes20 = attribute19.parent;
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.nodes.Attribute attribute24 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes23);
        org.jsoup.nodes.Attributes attributes25 = attribute24.parent;
        java.lang.String str26 = attribute24.getKey();
        attribute24.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str29 = attribute24.toString();
        java.lang.String str30 = attribute24.toString();
        boolean boolean31 = attribute19.equals((java.lang.Object) attribute24);
        java.lang.String str32 = attribute19.html();
        boolean boolean33 = attribute14.equals((java.lang.Object) str32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertNull(attributes20);
        org.junit.Assert.assertNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str29, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str30, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str32, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "", attributes2);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!\"");
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute8);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
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
        java.lang.String str24 = attribute3.toString();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!\"" + "'", str24, "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isDataAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        java.lang.String str8 = attribute2.getKey();
        java.lang.String str9 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str9, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes9 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        java.lang.String str11 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes12 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(attributes12);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.String str6 = attribute3.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute11 = attribute10.clone();
        org.jsoup.nodes.Attribute attribute12 = attribute11.clone();
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str16 = attribute15.html();
        boolean boolean17 = attribute15.isBooleanAttribute();
        attribute15.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.nodes.Attribute attribute23 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes22);
        org.jsoup.nodes.Attributes attributes24 = null;
        attribute23.parent = attributes24;
        org.jsoup.nodes.Attribute attribute28 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean29 = attribute23.equals((java.lang.Object) "hi!");
        java.lang.String str30 = attribute23.toString();
        org.jsoup.nodes.Attribute attribute31 = attribute23.clone();
        boolean boolean32 = attribute15.equals((java.lang.Object) attribute23);
        java.lang.String str33 = attribute23.html();
        java.lang.String str34 = attribute23.getValue();
        boolean boolean35 = attribute11.equals((java.lang.Object) attribute23);
        org.jsoup.nodes.Attribute attribute36 = attribute23.clone();
        java.lang.String str37 = attribute23.toString();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str16, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!=\"hi!\"" + "'", str30, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"hi!\"" + "'", str33, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attribute36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!=\"hi!\"" + "'", str37, "hi!=\"hi!\"");
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        java.lang.String str6 = attribute3.getKey();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.getValue();
        boolean boolean9 = attribute3.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute9 = attribute8.clone();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes12);
        java.lang.String str14 = attribute13.toString();
        boolean boolean15 = attribute13.isBooleanAttribute();
        boolean boolean17 = attribute13.equals((java.lang.Object) '#');
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean21 = attribute20.isBooleanAttribute();
        java.lang.String str22 = attribute20.getValue();
        org.jsoup.nodes.Attribute attribute23 = attribute20.clone();
        boolean boolean24 = attribute13.equals((java.lang.Object) attribute23);
        attribute23.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean27 = attribute8.equals((java.lang.Object) "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute5);
        attribute5.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attribute3.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"");
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean6 = attribute5.isBooleanAttribute();
        java.lang.String str7 = attribute5.getKey();
        boolean boolean8 = attribute2.equals((java.lang.Object) attribute5);
        java.lang.String str9 = attribute5.toString();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute5.parent = attributes10;
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute5.html(appendable12, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
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
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
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
        org.jsoup.nodes.Attribute attribute21 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "");
        java.lang.String str22 = attribute21.getValue();
        org.jsoup.nodes.Attribute attribute23 = attribute21.clone();
        org.jsoup.nodes.Attribute attribute24 = attribute23.clone();
        boolean boolean25 = attribute9.equals((java.lang.Object) attribute23);
        org.jsoup.nodes.Attribute attribute26 = attribute23.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertNotNull(attribute24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attribute26);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attribute7.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute7);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        java.lang.String str6 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        java.lang.String str8 = attribute3.toString();
        java.lang.String str9 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute7.parent = attributes8;
        java.lang.String str10 = attribute7.html();
        boolean boolean11 = attribute2.equals((java.lang.Object) attribute7);
        java.lang.String str12 = attribute2.getValue();
        boolean boolean13 = attribute2.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"");
        java.lang.String str6 = attribute5.getValue();
        boolean boolean7 = attribute2.equals((java.lang.Object) str6);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"" + "'", str6, "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        boolean boolean10 = attribute3.isBooleanAttribute();
        boolean boolean11 = attribute3.isDataAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isBooleanAttribute();
        java.lang.String str6 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        boolean boolean8 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        boolean boolean11 = attribute10.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute2.setKey("hi!");
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
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
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes10);
        org.jsoup.nodes.Attribute attribute12 = attribute11.clone();
        java.lang.String str13 = attribute11.html();
        boolean boolean14 = attribute3.equals((java.lang.Object) attribute11);
        org.jsoup.nodes.Attributes attributes15 = attribute3.parent;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(attributes15);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"", attributes5);
        java.lang.String str7 = attribute6.toString();
        boolean boolean8 = attribute6.isBooleanAttribute();
        boolean boolean9 = attribute2.equals((java.lang.Object) boolean8);
        java.lang.String str10 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attribute3.setValue("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", attributes2);
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
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        java.lang.String str11 = attribute3.getKey();
        boolean boolean12 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes5 = attribute3.parent;
        attribute3.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        boolean boolean5 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        java.lang.String str8 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "", attributes2);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
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
        java.lang.String str14 = attribute3.getKey();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attribute3.shouldCollapseAttribute(outputSettings15);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.String str5 = attribute3.getKey();
        java.lang.String str6 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
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
        org.jsoup.nodes.Attribute attribute31 = attribute9.clone();
        java.lang.String str32 = attribute31.toString();
        java.lang.String str33 = attribute31.getValue();
        java.lang.String str34 = attribute31.html();
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
        org.junit.Assert.assertNotNull(attribute31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str32, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str34, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        java.lang.String str8 = attribute2.toString();
        java.lang.String str9 = attribute2.getValue();
        java.lang.String str10 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
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
        org.jsoup.nodes.Attribute attribute30 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!\"=\"hi!\"");
        java.lang.String str31 = attribute30.toString();
        boolean boolean32 = attribute30.isBooleanAttribute();
        boolean boolean33 = attribute18.equals((java.lang.Object) attribute30);
        org.jsoup.nodes.Attribute attribute34 = attribute30.clone();
        org.jsoup.nodes.Attribute attribute37 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute38 = attribute37.clone();
        boolean boolean39 = attribute34.equals((java.lang.Object) attribute38);
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
        org.junit.Assert.assertNotNull(attribute30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str31, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attribute34);
        org.junit.Assert.assertNotNull(attribute37);
        org.junit.Assert.assertNotNull(attribute38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
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
        boolean boolean17 = attribute3.isBooleanAttribute();
        boolean boolean18 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!\"", attributes2);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"");
        org.jsoup.nodes.Attribute attribute11 = attribute10.clone();
        boolean boolean12 = attribute2.equals((java.lang.Object) attribute10);
        boolean boolean13 = attribute10.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getKey();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute4.parent = attributes5;
        java.lang.Object obj7 = null;
        boolean boolean8 = attribute4.equals(obj7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.toString();
        java.lang.String str11 = attribute3.html();
        org.jsoup.nodes.Attribute attribute12 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute15 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute15.setKey("hi!");
        boolean boolean18 = attribute15.isBooleanAttribute();
        boolean boolean19 = attribute15.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute20 = attribute15.clone();
        java.lang.String str21 = attribute20.getKey();
        boolean boolean22 = attribute12.equals((java.lang.Object) attribute20);
        attribute12.setKey("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
        org.jsoup.nodes.Attributes attributes25 = attribute12.parent;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(attributes25);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", attributes5);
        boolean boolean7 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute4.setKey("hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.jsoup.nodes.Attribute attribute7 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes8 = attribute4.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = attributes8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"", attributes2);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        java.lang.String str8 = attribute6.getKey();
        attribute6.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str11 = attribute6.toString();
        org.jsoup.nodes.Attribute attribute12 = attribute6.clone();
        java.lang.String str13 = attribute12.getKey();
        boolean boolean14 = attribute2.equals((java.lang.Object) str13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attribute2.shouldCollapseAttribute(outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str13, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!\"");
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute6);
        java.lang.String str8 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute2.parent = attributes9;
        java.lang.String str11 = attribute2.getValue();
        java.lang.Class<?> wildcardClass12 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
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
        java.lang.String str16 = attribute6.toString();
        attribute6.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"" + "'", str16, "hi!=\"hi!\"");
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        java.lang.String str6 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        java.lang.String str6 = attribute3.getKey();
        java.lang.String str7 = attribute3.getKey();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.String str5 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        java.lang.String str8 = attribute3.html();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
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
        java.lang.String str14 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute3.parent = attributes15;
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes19);
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.nodes.Attribute attribute24 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes23);
        org.jsoup.nodes.Attribute attribute25 = attribute24.clone();
        boolean boolean26 = attribute20.equals((java.lang.Object) attribute24);
        org.jsoup.nodes.Attributes attributes27 = null;
        attribute20.parent = attributes27;
        boolean boolean29 = attribute3.equals((java.lang.Object) attribute20);
        org.jsoup.nodes.Attribute attribute30 = attribute3.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(attribute25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(attribute30);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute3.html();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"hi!\"=\"\"");
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute4.getKey();
        org.jsoup.nodes.Attribute attribute6 = attribute4.clone();
        java.lang.String str7 = attribute6.getValue();
        java.lang.String str8 = attribute6.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str6 = attribute5.html();
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        attribute7.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str10 = attribute7.getKey();
        boolean boolean11 = attribute2.equals((java.lang.Object) str10);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        java.lang.String str16 = attribute15.toString();
        boolean boolean17 = attribute15.isDataAttribute();
        java.lang.String str18 = attribute15.html();
        boolean boolean19 = attribute2.equals((java.lang.Object) attribute15);
        org.jsoup.nodes.Attributes attributes20 = attribute2.parent;
        boolean boolean21 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute22 = attribute2.clone();
        java.lang.Class<?> wildcardClass23 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"" + "'", str16, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        java.lang.String str6 = attribute2.html();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        org.jsoup.nodes.Attributes attributes13 = attribute12.parent;
        java.lang.String str14 = attribute12.getKey();
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute12.parent = attributes15;
        org.jsoup.nodes.Attributes attributes17 = attribute12.parent;
        org.jsoup.nodes.Attribute attribute18 = attribute12.clone();
        boolean boolean19 = attribute2.equals((java.lang.Object) attribute18);
        boolean boolean20 = attribute18.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute7.parent = attributes8;
        java.lang.String str10 = attribute7.getValue();
        java.lang.String str11 = attribute7.toString();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str10, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = attribute6.parent;
        boolean boolean8 = attribute6.isBooleanAttribute();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = attribute6.equals(obj9);
        boolean boolean11 = attribute6.isDataAttribute();
        org.jsoup.nodes.Attribute attribute12 = attribute6.clone();
        java.lang.String str13 = attribute12.toString();
        boolean boolean14 = attribute2.equals((java.lang.Object) str13);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute4.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", "hi!=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.html();
        java.lang.String str5 = attribute3.toString();
        java.lang.String str6 = attribute3.getKey();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes6);
        java.lang.String str8 = attribute7.toString();
        boolean boolean10 = attribute7.equals((java.lang.Object) '4');
        attribute7.setKey("hi!");
        boolean boolean13 = attribute2.equals((java.lang.Object) "hi!");
        java.lang.String str14 = attribute2.toString();
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        java.lang.Class<?> wildcardClass4 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"\"");
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str5 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        java.lang.String str8 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\"" + "'", str5, "hi!=\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"" + "'", str8, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        boolean boolean4 = attribute2.isDataAttribute();
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes7 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        attribute6.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str9 = attribute6.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        java.lang.String str5 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str9 = attribute8.html();
        org.jsoup.nodes.Attribute attribute10 = attribute8.clone();
        java.lang.String str11 = attribute10.getKey();
        org.jsoup.nodes.Attribute attribute12 = attribute10.clone();
        boolean boolean13 = attribute10.isBooleanAttribute();
        boolean boolean14 = attribute2.equals((java.lang.Object) attribute10);
        org.jsoup.nodes.Attribute attribute15 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attribute2.shouldCollapseAttribute(outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(attribute15);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", "");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        java.lang.String str7 = attribute3.toString();
        boolean boolean8 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes10 = attribute3.parent;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        attribute6.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean10 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute11 = attribute2.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attribute11.shouldCollapseAttribute(outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
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
        org.jsoup.nodes.Attributes attributes23 = null;
        attribute3.parent = attributes23;
        boolean boolean25 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes26 = attribute3.parent;
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(attributes26);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
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
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable33, outputSettings34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attribute2.shouldCollapseAttribute(outputSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str7, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        java.lang.String str7 = attribute6.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.toString();
        boolean boolean11 = attribute3.isDataAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean14 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute15 = attribute3.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attribute15);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute6 = attribute5.clone();
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute5);
        java.lang.String str8 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        java.lang.String str10 = attribute9.getValue();
        org.jsoup.nodes.Attributes attributes11 = attribute9.parent;
        org.jsoup.nodes.Attribute attribute12 = attribute9.clone();
        org.jsoup.nodes.Attribute attribute13 = attribute12.clone();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str10, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertNotNull(attribute13);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"hi!\"=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
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
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute18.html(appendable20, outputSettings21);
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
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        java.lang.String str6 = attribute3.html();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        java.lang.String str6 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", attributes2);
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str6 = attribute3.toString();
        java.lang.String str7 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str7, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        java.lang.String str7 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes9 = attribute8.parent;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        boolean boolean10 = attribute3.isBooleanAttribute();
        boolean boolean11 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute12 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute12.parent = attributes13;
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute12);
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        java.lang.String str7 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
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
        java.lang.String str17 = attribute3.html();
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.nodes.Attribute attribute21 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes20);
        org.jsoup.nodes.Attributes attributes22 = attribute21.parent;
        java.lang.String str23 = attribute21.getKey();
        org.jsoup.nodes.Attributes attributes24 = null;
        attribute21.parent = attributes24;
        java.lang.String str26 = attribute21.getKey();
        org.jsoup.nodes.Attribute attribute27 = attribute21.clone();
        java.lang.String str28 = attribute27.getKey();
        boolean boolean29 = attribute27.isDataAttribute();
        boolean boolean30 = attribute3.equals((java.lang.Object) boolean29);
        attribute3.setKey("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(attribute27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.String str6 = attribute5.toString();
        org.jsoup.nodes.Attributes attributes7 = attribute5.parent;
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.toString();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes13 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes14 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes15 = attribute3.parent;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertNull(attributes15);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        boolean boolean11 = attribute3.isBooleanAttribute();
        java.lang.String str12 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes15);
        java.lang.String str17 = attribute16.html();
        boolean boolean18 = attribute3.equals((java.lang.Object) str17);
        org.jsoup.nodes.Attributes attributes19 = attribute3.parent;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str17, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(attributes19);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute4.getKey();
        org.jsoup.nodes.Attribute attribute6 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute4.parent = attributes7;
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute4.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute6);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
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
        org.jsoup.nodes.Attribute attribute36 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attribute attribute39 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str40 = attribute39.html();
        org.jsoup.nodes.Attribute attribute41 = attribute39.clone();
        attribute41.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str44 = attribute41.getKey();
        boolean boolean45 = attribute36.equals((java.lang.Object) str44);
        boolean boolean47 = attribute36.equals((java.lang.Object) '4');
        boolean boolean48 = attribute22.equals((java.lang.Object) '4');
        attribute22.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes53 = null;
        org.jsoup.nodes.Attribute attribute54 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", attributes53);
        boolean boolean55 = attribute22.equals((java.lang.Object) attribute54);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str40, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str44, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        java.lang.String str5 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!\"\"" + "'", str5, "hi!=\"hi!\"=\"\"=\"hi!=\"hi!\"=\"hi!\"\"");
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.getValue();
        java.lang.String str5 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
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
        java.lang.String str16 = attribute6.toString();
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute6.parent = attributes17;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"" + "'", str16, "hi!=\"hi!\"");
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.getValue();
        boolean boolean7 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute8);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = attributes3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        boolean boolean11 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str14 = attribute3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str14, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str7 = attribute6.toString();
        boolean boolean8 = attribute2.equals((java.lang.Object) str7);
        boolean boolean9 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute10 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str7, "hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attribute10);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
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
        org.jsoup.nodes.Attribute attribute14 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute15 = attribute14.clone();
        attribute14.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean18 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes19 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(attributes19);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        boolean boolean8 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        java.lang.String str6 = attribute5.getKey();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute5.html(appendable7, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean7 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }
}

