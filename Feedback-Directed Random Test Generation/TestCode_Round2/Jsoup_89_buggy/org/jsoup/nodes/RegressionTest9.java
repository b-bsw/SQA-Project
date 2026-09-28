package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute6.parent = attributes7;
        java.lang.String str9 = attribute6.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute6);
        boolean boolean11 = attribute6.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute12 = attribute6.clone();
        boolean boolean13 = attribute12.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.toString();
        java.lang.String str6 = attribute3.getKey();
        boolean boolean7 = attribute3.isDataAttribute();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable8, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", attributes2);
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
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes7);
        org.jsoup.nodes.Attributes attributes9 = attribute8.parent;
        boolean boolean10 = attribute8.isBooleanAttribute();
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = attribute8.equals(obj11);
        org.jsoup.nodes.Attributes attributes13 = attribute8.parent;
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
        boolean boolean33 = attribute8.equals((java.lang.Object) boolean32);
        org.jsoup.nodes.Attribute attribute34 = attribute8.clone();
        attribute8.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        boolean boolean37 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        boolean boolean38 = attribute2.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"" + "'", str3, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!=\"hi!\"" + "'", str24, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!=\"hi!\"" + "'", str31, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attribute34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute2.setKey("hi!");
        java.lang.String str5 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!");
        java.lang.String str11 = attribute10.html();
        org.jsoup.nodes.Attribute attribute12 = attribute10.clone();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes15);
        java.lang.String str17 = attribute16.toString();
        boolean boolean18 = attribute16.isBooleanAttribute();
        boolean boolean20 = attribute16.equals((java.lang.Object) '#');
        boolean boolean21 = attribute16.isBooleanAttribute();
        boolean boolean22 = attribute10.equals((java.lang.Object) boolean21);
        org.jsoup.nodes.Attribute attribute23 = attribute10.clone();
        boolean boolean24 = attribute2.equals((java.lang.Object) attribute23);
        java.lang.String str25 = attribute23.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str25, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        java.lang.String str12 = attribute11.toString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        java.lang.String str8 = attribute3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "", attributes2);
        java.lang.String str4 = attribute3.html();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        java.lang.String str18 = attribute16.toString();
        attribute16.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attribute16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str18, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str5 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.getValue();
        java.lang.String str7 = attribute2.getKey();
        boolean boolean8 = attribute2.isDataAttribute();
        java.lang.String str9 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute7.parent = attributes8;
        org.jsoup.nodes.Attributes attributes10 = attribute7.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attribute7.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        java.lang.String str6 = attribute5.html();
        java.lang.String str7 = attribute5.getValue();
        boolean boolean8 = attribute5.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str7 = attribute6.toString();
        boolean boolean8 = attribute6.isBooleanAttribute();
        boolean boolean9 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes12);
        org.jsoup.nodes.Attributes attributes14 = attribute13.parent;
        boolean boolean15 = attribute13.isBooleanAttribute();
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = attribute13.equals(obj16);
        org.jsoup.nodes.Attributes attributes18 = attribute13.parent;
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.nodes.Attribute attribute22 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes21);
        boolean boolean23 = attribute22.isBooleanAttribute();
        boolean boolean24 = attribute22.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.nodes.Attribute attribute28 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes27);
        java.lang.String str29 = attribute28.toString();
        org.jsoup.nodes.Attributes attributes30 = null;
        attribute28.parent = attributes30;
        boolean boolean33 = attribute28.equals((java.lang.Object) 1L);
        boolean boolean34 = attribute28.isBooleanAttribute();
        boolean boolean35 = attribute28.isBooleanAttribute();
        java.lang.String str36 = attribute28.toString();
        boolean boolean37 = attribute22.equals((java.lang.Object) attribute28);
        boolean boolean38 = attribute13.equals((java.lang.Object) boolean37);
        org.jsoup.nodes.Attribute attribute39 = attribute13.clone();
        java.lang.String str40 = attribute39.getValue();
        java.lang.String str41 = attribute39.getValue();
        boolean boolean42 = attribute6.equals((java.lang.Object) str41);
        org.jsoup.nodes.Attributes attributes43 = attribute6.parent;
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!=\"hi!\"" + "'", str29, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!=\"hi!\"" + "'", str36, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attribute39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(attributes43);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        attribute4.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.Class<?> wildcardClass8 = attribute4.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute7.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean10 = attribute7.isDataAttribute();
        java.lang.String str11 = attribute7.getValue();
        java.lang.String str12 = attribute7.getKey();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes15);
        java.lang.String str17 = attribute16.toString();
        org.jsoup.nodes.Attributes attributes18 = null;
        attribute16.parent = attributes18;
        boolean boolean21 = attribute16.equals((java.lang.Object) 1L);
        boolean boolean22 = attribute7.equals((java.lang.Object) boolean21);
        java.lang.String str23 = attribute7.toString();
        attribute7.setKey("hi!=\"hi!\"");
        boolean boolean26 = attribute4.equals((java.lang.Object) "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str23, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute3.parent = attributes12;
        java.lang.String str14 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        boolean boolean7 = attribute2.isDataAttribute();
        boolean boolean8 = attribute2.isBooleanAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attribute2.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        // The following exception was thrown during execution in test generation
        try {
            attribute2.setKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        boolean boolean6 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute3.parent = attributes12;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute11);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
        org.jsoup.nodes.Attributes attributes15 = attribute6.parent;
        java.lang.String str16 = attribute6.html();
        org.jsoup.nodes.Attributes attributes17 = null;
        attribute6.parent = attributes17;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"" + "'", str16, "hi!=\"hi!\"");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
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
        org.jsoup.nodes.Attributes attributes15 = attribute2.parent;
        boolean boolean16 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute17 = attribute2.clone();
        java.lang.String str18 = attribute17.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        java.lang.Class<?> wildcardClass17 = attribute2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        boolean boolean10 = attribute3.isBooleanAttribute();
        java.lang.String str11 = attribute3.html();
        boolean boolean12 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute15 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        attribute15.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute18 = attribute15.clone();
        boolean boolean19 = attribute3.equals((java.lang.Object) attribute18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute2.setKey("hi!");
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"");
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
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = attributes4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute2.setKey("hi!");
        boolean boolean5 = attribute2.isBooleanAttribute();
        boolean boolean6 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute7 = attribute2.clone();
        java.lang.String str8 = attribute7.getKey();
        boolean boolean9 = attribute7.isDataAttribute();
        attribute7.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes9 = attribute8.parent;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"");
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
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        boolean boolean7 = attribute6.isDataAttribute();
        java.lang.String str8 = attribute6.html();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        java.lang.String str33 = attribute32.getKey();
        java.lang.Class<?> wildcardClass34 = attribute32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        java.lang.String str15 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str12, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str14, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str15, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        java.lang.String str6 = attribute2.getValue();
        java.lang.String str7 = attribute2.getValue();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean6 = attribute3.equals((java.lang.Object) (short) 0);
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute10 = attribute9.clone();
        boolean boolean11 = attribute3.equals((java.lang.Object) attribute9);
        boolean boolean12 = attribute9.isBooleanAttribute();
        java.lang.String str13 = attribute9.toString();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str13, "hi!=\"hi!\"=\"hi!\"");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 10L);
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        java.lang.String str19 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        java.lang.String str9 = attribute2.toString();
        boolean boolean10 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute11 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.getKey();
        java.lang.String str5 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
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
        java.lang.String str33 = attribute32.getKey();
        boolean boolean34 = attribute32.isDataAttribute();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute4.parent = attributes5;
        java.lang.Class<?> wildcardClass7 = attribute4.getClass();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"", attributes2);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"=\"hi!=\"hi!\"=\"hi!\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        java.lang.String str6 = attribute3.html();
        java.lang.String str7 = attribute3.getKey();
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes9 = attribute3.parent;
        boolean boolean10 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        java.lang.String str11 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute3.parent = attributes12;
        boolean boolean14 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute3.parent = attributes15;
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str7 = attribute6.toString();
        boolean boolean8 = attribute6.isBooleanAttribute();
        boolean boolean9 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes12);
        org.jsoup.nodes.Attributes attributes14 = attribute13.parent;
        boolean boolean15 = attribute13.isBooleanAttribute();
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = attribute13.equals(obj16);
        org.jsoup.nodes.Attributes attributes18 = attribute13.parent;
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.nodes.Attribute attribute22 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes21);
        boolean boolean23 = attribute22.isBooleanAttribute();
        boolean boolean24 = attribute22.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.nodes.Attribute attribute28 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes27);
        java.lang.String str29 = attribute28.toString();
        org.jsoup.nodes.Attributes attributes30 = null;
        attribute28.parent = attributes30;
        boolean boolean33 = attribute28.equals((java.lang.Object) 1L);
        boolean boolean34 = attribute28.isBooleanAttribute();
        boolean boolean35 = attribute28.isBooleanAttribute();
        java.lang.String str36 = attribute28.toString();
        boolean boolean37 = attribute22.equals((java.lang.Object) attribute28);
        boolean boolean38 = attribute13.equals((java.lang.Object) boolean37);
        org.jsoup.nodes.Attribute attribute39 = attribute13.clone();
        java.lang.String str40 = attribute39.getValue();
        java.lang.String str41 = attribute39.getValue();
        boolean boolean42 = attribute6.equals((java.lang.Object) str41);
        boolean boolean43 = attribute6.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!=\"hi!\"" + "'", str29, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!=\"hi!\"" + "'", str36, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attribute39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
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
        java.lang.String str14 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute17 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute18 = attribute17.clone();
        boolean boolean19 = attribute3.equals((java.lang.Object) attribute17);
        attribute17.setKey("hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        attribute17.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str12, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertNotNull(attribute18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str11 = attribute3.getValue();
        java.lang.String str12 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes15);
        org.jsoup.nodes.Attribute attribute17 = attribute16.clone();
        attribute16.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes20 = attribute16.parent;
        org.jsoup.nodes.Attribute attribute21 = attribute16.clone();
        boolean boolean22 = attribute3.equals((java.lang.Object) attribute21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str12, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertNull(attributes20);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.toString();
        java.lang.String str6 = attribute3.getKey();
        boolean boolean7 = attribute3.isBooleanAttribute();
        boolean boolean8 = attribute3.isBooleanAttribute();
        java.lang.Class<?> wildcardClass9 = attribute3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        java.lang.String str22 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes23 = attribute3.parent;
        java.lang.Class<?> wildcardClass24 = attribute3.getClass();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str18, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(attributes23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean9 = attribute5.equals((java.lang.Object) attribute8);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
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
        boolean boolean17 = attribute3.isBooleanAttribute();
        java.lang.String str18 = attribute3.getKey();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"" + "'", str15, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
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
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes16 = null;
        attribute3.parent = attributes16;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        org.jsoup.nodes.Attribute attribute13 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "");
        java.lang.Class<?> wildcardClass14 = attribute13.getClass();
        boolean boolean15 = attribute3.equals((java.lang.Object) attribute13);
        java.lang.String str16 = attribute3.getKey();
        boolean boolean17 = attribute3.isDataAttribute();
        java.lang.String str18 = attribute3.getValue();
        boolean boolean19 = attribute3.isDataAttribute();
        java.lang.Class<?> wildcardClass20 = attribute3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean4 = attribute2.equals((java.lang.Object) 1);
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute2.clone();
        boolean boolean7 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getValue();
        java.lang.Class<?> wildcardClass6 = attribute3.getClass();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        java.lang.String str9 = attribute3.html();
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
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str9, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
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
        // The following exception was thrown during execution in test generation
        try {
            attribute12.setKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str3 = attribute2.getKey();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
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
        org.jsoup.nodes.Attribute attribute22 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes23 = attribute22.parent;
        org.jsoup.nodes.Attribute attribute24 = attribute22.clone();
        boolean boolean25 = attribute3.equals((java.lang.Object) attribute22);
        java.lang.String str26 = attribute22.toString();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute22.html(appendable27, outputSettings28);
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
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertNull(attributes23);
        org.junit.Assert.assertNotNull(attribute24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str26, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
        boolean boolean10 = attribute3.equals((java.lang.Object) "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        java.lang.String str12 = attribute3.getValue();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        org.jsoup.nodes.Attribute attribute8 = attribute5.clone();
        java.lang.String str9 = attribute8.html();
        org.jsoup.nodes.Attributes attributes10 = attribute8.parent;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute6.parent = attributes7;
        java.lang.String str9 = attribute6.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute6);
        java.lang.String str11 = attribute2.getValue();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable12, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes7);
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute8.parent = attributes9;
        boolean boolean11 = attribute2.equals((java.lang.Object) attribute8);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute6.setKey("hi!");
        org.jsoup.nodes.Attribute attribute9 = attribute6.clone();
        boolean boolean10 = attribute9.isBooleanAttribute();
        java.lang.String str11 = attribute9.toString();
        boolean boolean12 = attribute3.equals((java.lang.Object) str11);
        boolean boolean14 = attribute3.equals((java.lang.Object) "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable15, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = attribute6.shouldCollapseAttribute(outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.toString();
        boolean boolean10 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes13 = attribute3.parent;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(attributes13);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
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
        boolean boolean20 = attribute3.equals((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes21 = null;
        attribute3.parent = attributes21;
        boolean boolean23 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute24 = attribute3.clone();
        attribute24.setKey("hi!=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attribute24);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        boolean boolean6 = attribute5.isDataAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute5.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        java.lang.String str8 = attribute3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        java.lang.String str7 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute2.parent = attributes8;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str7, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        java.lang.String str5 = attribute2.getValue();
        java.lang.String str6 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute9 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str10 = attribute9.getValue();
        java.lang.String str11 = attribute9.html();
        attribute9.setKey("hi!=\"hi!\"=\"hi!\"");
        java.lang.String str14 = attribute9.html();
        boolean boolean15 = attribute2.equals((java.lang.Object) str14);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str14, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes7 = attribute2.parent;
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        boolean boolean9 = attribute8.isDataAttribute();
        boolean boolean10 = attribute8.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        boolean boolean11 = attribute7.equals((java.lang.Object) "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.getKey();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
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
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"");
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
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        java.lang.Object obj7 = null;
        boolean boolean8 = attribute2.equals(obj7);
        boolean boolean9 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute10 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes11 = null;
        attribute2.parent = attributes11;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attribute2.shouldCollapseAttribute(outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attribute10);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes12 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute13 = attribute3.clone();
        attribute13.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNotNull(attribute13);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.toString();
        boolean boolean9 = attribute3.isDataAttribute();
        java.lang.String str10 = attribute3.html();
        java.lang.String str11 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes17);
        org.jsoup.nodes.Attributes attributes19 = attribute18.parent;
        boolean boolean20 = attribute18.isBooleanAttribute();
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = attribute18.equals(obj21);
        boolean boolean23 = attribute14.equals((java.lang.Object) boolean22);
        boolean boolean24 = attribute14.isDataAttribute();
        boolean boolean25 = attribute3.equals((java.lang.Object) attribute14);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!");
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
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attributes attributes6 = attribute3.parent;
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(attribute7);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        java.lang.String str11 = attribute3.toString();
        attribute3.setKey("hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes14 = null;
        attribute3.parent = attributes14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = attribute3.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isDataAttribute();
        attribute3.setKey("hi!");
        boolean boolean8 = attribute3.isBooleanAttribute();
        java.lang.String str9 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes10 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes12 = attribute3.parent;
        java.lang.String str13 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
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
        java.lang.String str14 = attribute3.getValue();
        java.lang.Class<?> wildcardClass15 = attribute3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.getValue();
        java.lang.String str5 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str7 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes10);
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute11.parent = attributes12;
        org.jsoup.nodes.Attribute attribute14 = attribute11.clone();
        boolean boolean15 = attribute3.equals((java.lang.Object) attribute14);
        org.jsoup.nodes.Attributes attributes16 = attribute3.parent;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str7, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!\"");
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attribute attribute8 = attribute2.clone();
        boolean boolean9 = attribute2.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.Class<?> wildcardClass5 = attribute4.getClass();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
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
        org.jsoup.nodes.Attributes attributes37 = null;
        attribute3.parent = attributes37;
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
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        boolean boolean10 = attribute9.isDataAttribute();
        java.lang.String str11 = attribute9.toString();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        boolean boolean8 = attribute2.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        attribute9.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"\"", "hi!=\"hi!\"=\"\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
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
        boolean boolean33 = attribute31.isDataAttribute();
        boolean boolean34 = attribute31.isBooleanAttribute();
        boolean boolean35 = attribute31.isBooleanAttribute();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean7 = attribute3.equals((java.lang.Object) '#');
        boolean boolean8 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        java.lang.String str13 = attribute12.toString();
        boolean boolean14 = attribute12.isDataAttribute();
        attribute12.setKey("hi!");
        boolean boolean17 = attribute12.isBooleanAttribute();
        java.lang.String str18 = attribute12.toString();
        org.jsoup.nodes.Attributes attributes19 = attribute12.parent;
        boolean boolean20 = attribute3.equals((java.lang.Object) attribute12);
        java.lang.String str21 = attribute3.toString();
        java.lang.String str22 = attribute3.getKey();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = attribute3.shouldCollapseAttribute(outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str5 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes6 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
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
        java.lang.String str15 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"" + "'", str15, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        java.lang.String str12 = attribute11.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute4.isDataAttribute();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute8.setKey("hi!");
        java.lang.String str11 = attribute8.toString();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        org.jsoup.nodes.Attributes attributes16 = attribute15.parent;
        boolean boolean17 = attribute15.isBooleanAttribute();
        boolean boolean18 = attribute15.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute19 = attribute15.clone();
        boolean boolean20 = attribute8.equals((java.lang.Object) attribute19);
        boolean boolean21 = attribute4.equals((java.lang.Object) attribute8);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = attribute4.shouldCollapseAttribute(outputSettings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", "", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attribute3.shouldCollapseAttribute(outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"", attributes2);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        boolean boolean5 = attribute3.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute2.getKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        boolean boolean6 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        boolean boolean12 = attribute11.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.String str6 = attribute5.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isDataAttribute();
        java.lang.String str6 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
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
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", "", attributes2);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        java.lang.String str6 = attribute3.getKey();
        boolean boolean7 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        boolean boolean10 = attribute3.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute3.parent = attributes9;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute2.getKey();
        boolean boolean9 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes11 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute3.parent = attributes12;
        boolean boolean14 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
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
        org.jsoup.nodes.Attribute attribute13 = attribute3.clone();
        java.lang.Class<?> wildcardClass14 = attribute13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        java.lang.Class<?> wildcardClass4 = attribute3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
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
        org.jsoup.nodes.Attributes attributes32 = null;
        attribute9.parent = attributes32;
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
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
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
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable18, outputSettings19);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean9 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"");
        boolean boolean10 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute11 = attribute2.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.toString();
        java.lang.String str11 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute3.parent = attributes12;
        java.lang.String str14 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        java.lang.String str10 = attribute9.getKey();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attribute9.shouldCollapseAttribute(outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", attributes2);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"\"");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.toString();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute8 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
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
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes6);
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        boolean boolean9 = attribute3.equals((java.lang.Object) attribute7);
        boolean boolean10 = attribute3.isBooleanAttribute();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable11, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attribute3.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.getKey();
        java.lang.String str5 = attribute3.html();
        boolean boolean6 = attribute3.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"", attributes2);
        java.lang.String str4 = attribute3.getKey();
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        java.lang.String str8 = attribute3.html();
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute12 = attribute11.clone();
        boolean boolean14 = attribute12.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute12.parent = attributes15;
        java.lang.String str17 = attribute12.getKey();
        boolean boolean18 = attribute3.equals((java.lang.Object) attribute12);
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute3.html();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!", attributes6);
        org.jsoup.nodes.Attribute attribute8 = attribute7.clone();
        org.jsoup.nodes.Attributes attributes9 = null;
        attribute7.parent = attributes9;
        boolean boolean11 = attribute2.equals((java.lang.Object) attribute7);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes14);
        boolean boolean16 = attribute15.isBooleanAttribute();
        java.lang.String str17 = attribute15.html();
        boolean boolean18 = attribute15.isBooleanAttribute();
        java.lang.String str19 = attribute15.getKey();
        org.jsoup.nodes.Attributes attributes20 = attribute15.parent;
        org.jsoup.nodes.Attribute attribute21 = attribute15.clone();
        org.jsoup.nodes.Attribute attribute22 = attribute15.clone();
        boolean boolean23 = attribute7.equals((java.lang.Object) attribute15);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str17, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str19, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes20);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute4.html();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute4.html(appendable6, outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
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
        org.jsoup.nodes.Attributes attributes36 = null;
        attribute3.parent = attributes36;
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
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        org.jsoup.nodes.Attributes attributes6 = attribute4.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        boolean boolean10 = attribute3.isBooleanAttribute();
        java.lang.String str11 = attribute3.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"\"");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str6 = attribute5.html();
        org.jsoup.nodes.Attribute attribute7 = attribute5.clone();
        boolean boolean8 = attribute2.equals((java.lang.Object) attribute5);
        java.lang.String str9 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes10 = null;
        attribute2.parent = attributes10;
        java.lang.Class<?> wildcardClass12 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes5);
        boolean boolean7 = attribute2.equals((java.lang.Object) attribute6);
        java.lang.String str8 = attribute6.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        java.lang.String str8 = attribute7.toString();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        org.jsoup.nodes.Attributes attributes13 = attribute12.parent;
        boolean boolean14 = attribute12.isBooleanAttribute();
        boolean boolean15 = attribute12.isDataAttribute();
        org.jsoup.nodes.Attributes attributes16 = null;
        attribute12.parent = attributes16;
        java.lang.String str18 = attribute12.getValue();
        org.jsoup.nodes.Attribute attribute19 = attribute12.clone();
        boolean boolean20 = attribute7.equals((java.lang.Object) attribute12);
        boolean boolean21 = attribute12.isDataAttribute();
        java.lang.String str22 = attribute12.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = attribute12.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
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
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str8 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute10 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute11 = attribute10.clone();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        org.jsoup.nodes.Attributes attributes16 = attribute15.parent;
        java.lang.String str17 = attribute15.getKey();
        org.jsoup.nodes.Attributes attributes18 = null;
        attribute15.parent = attributes18;
        java.lang.String str20 = attribute15.getKey();
        org.jsoup.nodes.Attribute attribute21 = attribute15.clone();
        org.jsoup.nodes.Attributes attributes22 = null;
        attribute21.parent = attributes22;
        boolean boolean24 = attribute10.equals((java.lang.Object) attribute21);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str6 = attribute5.html();
        boolean boolean7 = attribute5.isBooleanAttribute();
        java.lang.String str8 = attribute5.html();
        java.lang.String str9 = attribute5.html();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute5);
        boolean boolean11 = attribute5.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
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
        org.jsoup.nodes.Attributes attributes15 = attribute2.parent;
        boolean boolean16 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute17 = attribute2.clone();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute17.html(appendable18, outputSettings19);
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
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attribute17);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.Class<?> wildcardClass4 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute3.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        java.lang.String str10 = attribute9.toString();
        attribute9.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
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
        java.lang.String str12 = attribute9.getValue();
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
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        boolean boolean10 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str14 = attribute13.getValue();
        boolean boolean15 = attribute3.equals((java.lang.Object) attribute13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str14, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        boolean boolean8 = attribute2.isBooleanAttribute();
        boolean boolean9 = attribute2.isDataAttribute();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str12 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.getValue();
        java.lang.String str4 = attribute2.getValue();
        boolean boolean5 = attribute2.isBooleanAttribute();
        java.lang.String str6 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        boolean boolean6 = attribute3.isBooleanAttribute();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.html();
        java.lang.String str9 = attribute3.getKey();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
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
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        boolean boolean10 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes14);
        org.jsoup.nodes.Attributes attributes16 = null;
        attribute15.parent = attributes16;
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean21 = attribute15.equals((java.lang.Object) "hi!");
        java.lang.String str22 = attribute15.toString();
        org.jsoup.nodes.Attribute attribute23 = attribute15.clone();
        java.lang.String str24 = attribute23.getValue();
        org.jsoup.nodes.Attribute attribute27 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        java.lang.String str28 = attribute27.getKey();
        boolean boolean29 = attribute23.equals((java.lang.Object) str28);
        org.jsoup.nodes.Attribute attribute30 = attribute23.clone();
        boolean boolean31 = attribute23.isDataAttribute();
        org.jsoup.nodes.Attribute attribute32 = attribute23.clone();
        boolean boolean33 = attribute3.equals((java.lang.Object) attribute32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"" + "'", str22, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attribute30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attribute32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
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
        org.jsoup.nodes.Attributes attributes13 = attribute3.parent;
        boolean boolean14 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"\"", attributes2);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
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
        java.lang.String str43 = attribute3.html();
        java.lang.String str44 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes45 = null;
        attribute3.parent = attributes45;
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str43, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!=\"hi!\"" + "'", str44, "hi!=\"hi!\"");
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        attribute3.setKey("hi!=\"hi!\"");
        java.lang.String str11 = attribute3.getValue();
        java.lang.String str12 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute3.parent = attributes13;
        org.jsoup.nodes.Attribute attribute15 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean20 = attribute18.equals((java.lang.Object) 1);
        boolean boolean21 = attribute18.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute22 = attribute18.clone();
        boolean boolean23 = attribute22.isDataAttribute();
        java.lang.Class<?> wildcardClass24 = attribute22.getClass();
        boolean boolean25 = attribute3.equals((java.lang.Object) wildcardClass24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str12, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        attribute2.setKey("hi!");
        org.jsoup.nodes.Attributes attributes5 = attribute2.parent;
        java.lang.String str6 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
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
        org.jsoup.nodes.Attributes attributes18 = attribute3.parent;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str15, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str16, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(attributes18);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "");
        boolean boolean3 = attribute2.isDataAttribute();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        java.lang.String str6 = attribute2.html();
        // The following exception was thrown during execution in test generation
        try {
            attribute2.setKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        boolean boolean9 = attribute2.equals((java.lang.Object) "hi!=\"hi!\"");
        java.lang.String str10 = attribute2.getKey();
        java.lang.String str11 = attribute2.html();
        org.jsoup.nodes.Attribute attribute12 = attribute2.clone();
        boolean boolean13 = attribute12.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.getKey();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attribute2.shouldCollapseAttribute(outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", attributes2);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        java.lang.String str5 = attribute2.getValue();
        boolean boolean6 = attribute2.isDataAttribute();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute7);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
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
        java.lang.String str16 = attribute15.getKey();
        boolean boolean17 = attribute15.isBooleanAttribute();
        boolean boolean18 = attribute15.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str12, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str14, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"" + "'", str16, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        boolean boolean10 = attribute3.isDataAttribute();
        boolean boolean11 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.getValue();
        boolean boolean10 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"");
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
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
        org.jsoup.nodes.Attribute attribute22 = attribute21.clone();
        org.jsoup.nodes.Attribute attribute23 = attribute22.clone();
        boolean boolean24 = attribute23.isBooleanAttribute();
        java.lang.String str25 = attribute23.getValue();
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
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertNotNull(attribute23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=\"hi!\"" + "'", str25, "hi!=\"hi!\"");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        attribute5.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute5.toString();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute5.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        java.lang.String str5 = attribute2.getKey();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"", "", attributes2);
        java.lang.String str4 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"");
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.Class<?> wildcardClass4 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
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
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.toString();
        boolean boolean11 = attribute3.isBooleanAttribute();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute3.html(appendable12, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute3.isDataAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.String str6 = attribute3.getKey();
        java.lang.String str7 = attribute3.getValue();
        java.lang.String str8 = attribute3.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str7, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", attributes2);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
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
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
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
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute15.html(appendable28, outputSettings29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        boolean boolean7 = attribute3.isBooleanAttribute();
        java.lang.String str8 = attribute3.html();
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.String str5 = attribute2.html();
        boolean boolean7 = attribute2.equals((java.lang.Object) (short) -1);
        boolean boolean8 = attribute2.isDataAttribute();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attribute2.shouldCollapseAttribute(outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
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
        java.lang.String str12 = attribute3.toString();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute5 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute5.setKey("hi!");
        boolean boolean8 = attribute5.isBooleanAttribute();
        java.lang.String str9 = attribute5.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute5);
        java.lang.String str11 = attribute5.toString();
        java.lang.String str12 = attribute5.getValue();
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
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
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes19);
        java.lang.String str21 = attribute20.toString();
        org.jsoup.nodes.Attributes attributes22 = null;
        attribute20.parent = attributes22;
        boolean boolean25 = attribute20.equals((java.lang.Object) 1L);
        attribute20.setKey("hi!=\"hi!\"");
        java.lang.String str28 = attribute20.getValue();
        boolean boolean29 = attribute20.isBooleanAttribute();
        boolean boolean30 = attribute3.equals((java.lang.Object) attribute20);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertNotNull(attribute15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        java.lang.String str8 = attribute3.html();
        org.jsoup.nodes.Attribute attribute11 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute12 = attribute11.clone();
        boolean boolean14 = attribute12.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes15 = null;
        attribute12.parent = attributes15;
        java.lang.String str17 = attribute12.getKey();
        boolean boolean18 = attribute3.equals((java.lang.Object) attribute12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = attribute3.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"=\"hi!=\"hi!\"=\"hi!\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute6.parent = attributes7;
        java.lang.String str9 = attribute6.getKey();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute6);
        org.jsoup.nodes.Attribute attribute11 = attribute2.clone();
        java.lang.String str12 = attribute2.getValue();
        boolean boolean13 = attribute2.isDataAttribute();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        java.lang.String str8 = attribute3.toString();
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attribute3.setValue("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"" + "'", str8, "hi!=\"hi!\"");
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", attributes2);
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
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
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
        boolean boolean30 = attribute3.isBooleanAttribute();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        java.lang.String str4 = attribute2.html();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        org.jsoup.nodes.Attribute attribute9 = attribute7.clone();
        boolean boolean10 = attribute2.equals((java.lang.Object) attribute9);
        java.lang.String str11 = attribute9.toString();
        attribute9.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"\"");
        attribute2.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute2.parent = attributes5;
        java.lang.String str7 = attribute2.html();
        java.lang.String str8 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"" + "'", str7, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"\"" + "'", str8, "hi!=\"\"");
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
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
        boolean boolean15 = attribute7.isBooleanAttribute();
        attribute7.setKey("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
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
        boolean boolean19 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute20 = attribute3.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!=\"hi!\"" + "'", str17, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attribute20);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
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
        boolean boolean15 = attribute3.isDataAttribute();
        java.lang.String str16 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.toString();
        java.lang.String str5 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        java.lang.String str8 = attribute7.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str8, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
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
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        java.lang.String str6 = attribute2.toString();
        java.lang.String str7 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str6, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
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
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.nodes.Attribute attribute16 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes15);
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes19);
        org.jsoup.nodes.Attribute attribute21 = attribute20.clone();
        boolean boolean22 = attribute16.equals((java.lang.Object) attribute20);
        org.jsoup.nodes.Attributes attributes23 = null;
        attribute16.parent = attributes23;
        java.lang.Class<?> wildcardClass25 = attribute16.getClass();
        boolean boolean26 = attribute3.equals((java.lang.Object) wildcardClass25);
        org.jsoup.nodes.Attributes attributes27 = null;
        attribute3.parent = attributes27;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        boolean boolean7 = attribute2.isBooleanAttribute();
        java.lang.String str8 = attribute2.toString();
        java.lang.String str9 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.getValue();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;&quot;\"");
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        // The following exception was thrown during execution in test generation
        try {
            attribute3.setKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.toString();
        java.lang.String str11 = attribute3.html();
        java.lang.String str12 = attribute3.html();
        boolean boolean13 = attribute3.isDataAttribute();
        boolean boolean14 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", attributes2);
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
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute2.equals((java.lang.Object) (-1L));
        java.lang.String str6 = attribute2.getKey();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute5.parent = attributes6;
        boolean boolean8 = attribute5.isDataAttribute();
        boolean boolean9 = attribute5.isBooleanAttribute();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
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
        org.jsoup.nodes.Attribute attribute35 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.nodes.Attribute attribute39 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes38);
        org.jsoup.nodes.Attributes attributes40 = attribute39.parent;
        boolean boolean41 = attribute39.isBooleanAttribute();
        boolean boolean42 = attribute39.isDataAttribute();
        org.jsoup.nodes.Attributes attributes43 = null;
        attribute39.parent = attributes43;
        java.lang.String str45 = attribute39.getValue();
        org.jsoup.nodes.Attribute attribute46 = attribute39.clone();
        boolean boolean47 = attribute35.equals((java.lang.Object) attribute46);
        boolean boolean48 = attribute30.equals((java.lang.Object) attribute35);
        java.lang.String str49 = attribute35.html();
        java.lang.String str50 = attribute35.getValue();
        java.lang.String str51 = attribute35.html();
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
        org.junit.Assert.assertNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(attribute46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str49, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str50, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"" + "'", str51, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"", attributes2);
        java.lang.String str4 = attribute3.html();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        java.lang.String str6 = attribute3.getKey();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        java.lang.String str8 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str6, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"");
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        attribute9.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute9.parent = attributes12;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attribute9.shouldCollapseAttribute(outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
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
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.html();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        boolean boolean13 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.Object obj14 = null;
        boolean boolean15 = attribute3.equals(obj14);
        org.jsoup.nodes.Attributes attributes16 = attribute3.parent;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.String str5 = attribute2.html();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes4 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"", attributes2);
        boolean boolean4 = attribute3.isDataAttribute();
        java.lang.String str5 = attribute3.getKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute2.parent = attributes6;
        java.lang.String str8 = attribute2.html();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable9, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        java.lang.Class<?> wildcardClass6 = attribute2.getClass();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
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
        java.lang.String str21 = attribute2.toString();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = attribute2.shouldCollapseAttribute(outputSettings22);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str20, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str21, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"\"", attributes2);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute6 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute7 = attribute6.clone();
        attribute6.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean10 = attribute3.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.String str11 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute12 = attribute3.clone();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute12.html(appendable13, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str11, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute12);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        boolean boolean5 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;\"");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=\"hi!\"=\"\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!=\"hi!\"=\"\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"\"\"");
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
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
        attribute3.setKey("hi!=\"hi!\"=\"\"");
        attribute3.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertNotNull(attribute16);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute4.getValue();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        boolean boolean9 = attribute4.equals((java.lang.Object) attribute8);
        attribute8.setKey("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
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
        java.lang.Object obj13 = null;
        boolean boolean14 = attribute3.equals(obj13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = attribute3.setValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        // The following exception was thrown during execution in test generation
        try {
            attribute2.setKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        java.lang.String str7 = attribute3.getKey();
        java.lang.String str8 = attribute3.getValue();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes11);
        java.lang.String str13 = attribute12.toString();
        java.lang.String str14 = attribute12.toString();
        java.lang.String str15 = attribute12.getKey();
        boolean boolean16 = attribute12.isBooleanAttribute();
        boolean boolean17 = attribute12.isBooleanAttribute();
        java.lang.String str18 = attribute12.toString();
        java.lang.String str19 = attribute12.getValue();
        org.jsoup.nodes.Attribute attribute20 = attribute12.clone();
        java.lang.String str21 = attribute12.toString();
        boolean boolean22 = attribute3.equals((java.lang.Object) str21);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!=\"hi!\"" + "'", str18, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(attribute20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
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
        org.jsoup.nodes.Attributes attributes22 = attribute10.parent;
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
        org.junit.Assert.assertNull(attributes22);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"=\"\"", attributes2);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        boolean boolean5 = attribute2.isDataAttribute();
        boolean boolean6 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute2.parent = attributes7;
        java.lang.String str9 = attribute2.toString();
        boolean boolean10 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes13);
        boolean boolean15 = attribute14.isBooleanAttribute();
        boolean boolean16 = attribute14.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes19);
        java.lang.String str21 = attribute20.toString();
        org.jsoup.nodes.Attributes attributes22 = null;
        attribute20.parent = attributes22;
        boolean boolean25 = attribute20.equals((java.lang.Object) 1L);
        boolean boolean26 = attribute20.isBooleanAttribute();
        boolean boolean27 = attribute20.isBooleanAttribute();
        java.lang.String str28 = attribute20.toString();
        boolean boolean29 = attribute14.equals((java.lang.Object) attribute20);
        org.jsoup.nodes.Attributes attributes30 = null;
        attribute14.parent = attributes30;
        boolean boolean32 = attribute2.equals((java.lang.Object) attributes30);
        java.lang.String str33 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"" + "'", str9, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!=\"hi!\"" + "'", str21, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!=\"hi!\"" + "'", str28, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str33, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
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
        org.jsoup.nodes.Attribute attribute32 = attribute9.clone();
        boolean boolean34 = attribute9.equals((java.lang.Object) "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!\"");
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
        org.junit.Assert.assertNotNull(attribute32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getKey();
        boolean boolean8 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute9 = attribute2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute9);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!");
        boolean boolean13 = attribute3.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attribute attribute14 = attribute3.clone();
        java.lang.String str15 = attribute3.html();
        java.lang.String str16 = attribute3.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = attribute3.setValue("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attribute14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!=\"hi!\"" + "'", str15, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;\"", "", attributes2);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
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
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.nodes.Attribute attribute24 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", attributes23);
        boolean boolean25 = attribute17.equals((java.lang.Object) attributes23);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = attribute17.shouldCollapseAttribute(outputSettings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str13, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"");
        org.jsoup.nodes.Attributes attributes3 = attribute2.parent;
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        boolean boolean4 = attribute3.isBooleanAttribute();
        java.lang.String str5 = attribute3.getValue();
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes7 = attribute3.parent;
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str10 = attribute3.toString();
        java.lang.String str11 = attribute3.toString();
        java.lang.String str12 = attribute3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str6, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"" + "'", str11, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"" + "'", str12, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
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
        org.jsoup.nodes.Attribute attribute23 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes24 = attribute3.parent;
        java.lang.String str25 = attribute3.getKey();
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
        org.junit.Assert.assertNull(attributes24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        boolean boolean1 = org.jsoup.nodes.Attribute.isBooleanAttribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"=\"hi!=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;&quot;\"");
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("hi!", "hi!");
        boolean boolean9 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = attribute3.getValue();
        java.lang.String str11 = attribute3.getKey();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean4 = attribute3.isDataAttribute();
        boolean boolean5 = attribute3.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = attribute3.equals(obj6);
        boolean boolean8 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute9 = attribute3.clone();
        java.lang.String str10 = attribute3.html();
        org.jsoup.nodes.Attribute attribute13 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!");
        attribute13.setKey("hi!");
        java.lang.String str16 = attribute13.toString();
        java.lang.Class<?> wildcardClass17 = attribute13.getClass();
        boolean boolean18 = attribute3.equals((java.lang.Object) attribute13);
        org.jsoup.nodes.Attributes attributes19 = attribute3.parent;
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!=\"hi!\"" + "'", str16, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(attributes19);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = attribute2.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;&quot;\"");
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
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"", "hi!=\"hi!\"=\"\"");
        java.lang.String str3 = attribute2.getValue();
        boolean boolean4 = attribute2.isBooleanAttribute();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attribute2.html(appendable5, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str3, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        java.lang.String str5 = attribute4.getKey();
        org.jsoup.nodes.Attribute attribute6 = attribute4.clone();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes9);
        java.lang.String str11 = attribute10.toString();
        org.jsoup.nodes.Attributes attributes12 = null;
        attribute10.parent = attributes12;
        boolean boolean15 = attribute10.equals((java.lang.Object) 1L);
        org.jsoup.nodes.Attributes attributes16 = null;
        attribute10.parent = attributes16;
        boolean boolean18 = attribute10.isBooleanAttribute();
        java.lang.String str19 = attribute10.getValue();
        boolean boolean20 = attribute10.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute23 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute24 = attribute23.clone();
        java.lang.String str25 = attribute23.toString();
        boolean boolean26 = attribute10.equals((java.lang.Object) attribute23);
        boolean boolean27 = attribute4.equals((java.lang.Object) attribute23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attribute24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str25, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
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
        java.lang.String str12 = attribute11.getKey();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attribute11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
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
        org.jsoup.nodes.Attributes attributes14 = attribute2.parent;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"" + "'", str10, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!=\"hi!\"" + "'", str12, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isDataAttribute();
        boolean boolean4 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.toString();
        java.lang.String str5 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"" + "'", str5, "hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"");
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute5 = attribute4.clone();
        boolean boolean6 = attribute4.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute4.parent = attributes7;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.html();
        org.jsoup.nodes.Attribute attribute5 = attribute2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        java.lang.String str5 = attribute3.getKey();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        java.lang.String str8 = attribute3.toString();
        java.lang.String str9 = attribute3.getValue();
        java.lang.String str10 = attribute3.html();
        java.lang.String str11 = attribute3.getValue();
        java.lang.String str12 = attribute3.getValue();
        java.lang.String str13 = attribute3.html();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str10, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"" + "'", str13, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"", attributes2);
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute3.parent = attributes4;
        boolean boolean6 = attribute3.isBooleanAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.toString();
        boolean boolean10 = attribute3.isBooleanAttribute();
        attribute3.setKey("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;\"");
        org.jsoup.nodes.Attributes attributes13 = null;
        attribute3.parent = attributes13;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
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
        boolean boolean28 = attribute18.isDataAttribute();
        boolean boolean29 = attribute18.isBooleanAttribute();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
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
        java.lang.String str23 = attribute12.html();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute4.parent;
        java.lang.String str6 = attribute4.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Attributes attributes4 = null;
        attribute2.parent = attributes4;
        java.lang.String str6 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"" + "'", str3, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        java.lang.String str4 = attribute3.getValue();
        boolean boolean5 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attribute3.setValue("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str9, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"");
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
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"");
        java.lang.Class<?> wildcardClass3 = attribute2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        java.lang.String str4 = attribute3.toString();
        org.jsoup.nodes.Attributes attributes5 = null;
        attribute3.parent = attributes5;
        boolean boolean8 = attribute3.equals((java.lang.Object) 1L);
        boolean boolean9 = attribute3.isBooleanAttribute();
        java.lang.String str10 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute11 = attribute3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attribute3.setValue("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(attribute11);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attributes attributes4 = attribute3.parent;
        boolean boolean5 = attribute3.isBooleanAttribute();
        boolean boolean6 = attribute3.isDataAttribute();
        org.jsoup.nodes.Attributes attributes7 = null;
        attribute3.parent = attributes7;
        java.lang.String str9 = attribute3.toString();
        java.lang.String str10 = attribute3.getValue();
        java.lang.String str11 = attribute3.toString();
        java.lang.Class<?> wildcardClass12 = attribute3.getClass();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!=\"hi!\"" + "'", str9, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"", "hi!=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        boolean boolean5 = attribute3.equals((java.lang.Object) "hi!");
        java.lang.String str6 = attribute3.toString();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes8 = attribute7.parent;
        boolean boolean9 = attribute7.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"", "hi!=\"hi!\"=\"hi!\"");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        attribute2.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"");
        boolean boolean6 = attribute2.isBooleanAttribute();
        java.lang.Object obj7 = null;
        boolean boolean8 = attribute2.equals(obj7);
        boolean boolean9 = attribute2.isBooleanAttribute();
        org.jsoup.nodes.Attribute attribute10 = attribute2.clone();
        boolean boolean11 = attribute10.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
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
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        org.jsoup.nodes.Attributes attributes8 = null;
        attribute3.parent = attributes8;
        java.lang.String str10 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str4, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"" + "'", str10, "hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"");
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.String str5 = attribute3.html();
        java.lang.String str6 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str6, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"=\"hi!=\"hi!\"=\"hi!\"\"");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"=\"hi!=\"hi!\"=\"hi!\"\"" + "'", str3, "hi!=\"hi!\"=\"hi!\"=\"hi!=\"hi!\"=\"\"\"=\"hi!=\"hi!\"=\"hi!\"\"");
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!");
        boolean boolean3 = attribute2.isBooleanAttribute();
        java.lang.String str4 = attribute2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!\"" + "'", str4, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"", attributes2);
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", attributes6);
        boolean boolean8 = attribute7.isDataAttribute();
        boolean boolean9 = attribute3.equals((java.lang.Object) attribute7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attribute3.setValue("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", "hi!=\"hi!\"");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str3, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"" + "'", str4, "hi!=\"hi!\"");
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
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
        java.lang.String str22 = attribute2.html();
        java.lang.String str23 = attribute2.getValue();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"" + "'", str22, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!=\"hi!\"" + "'", str23, "hi!=\"hi!\"");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"", attributes2);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;&quot;\"");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
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
        java.lang.String str13 = attribute3.toString();
        java.lang.String str14 = attribute3.toString();
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!=\"hi!\"" + "'", str14, "hi!=\"hi!\"");
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!\"");
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"");
        boolean boolean3 = attribute2.isBooleanAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!\"");
        boolean boolean3 = attribute2.isDataAttribute();
        org.jsoup.nodes.Attribute attribute4 = attribute2.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attribute4);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!", "hi!", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        java.lang.String str5 = attribute3.html();
        java.lang.String str6 = attribute3.toString();
        java.lang.String str7 = attribute3.html();
        org.jsoup.nodes.Attributes attributes8 = attribute3.parent;
        boolean boolean9 = attribute3.isDataAttribute();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"" + "'", str5, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"hi!\"" + "'", str6, "hi!=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"hi!\"" + "'", str7, "hi!=\"hi!\"");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        java.lang.Appendable appendable2 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute.html("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=\"hi!\"\"\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;=&amp;amp;quot;hi!=&amp;amp;amp;quot;hi!&amp;amp;amp;quot;&amp;amp;quot;&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"", appendable2, outputSettings3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        boolean boolean1 = org.jsoup.nodes.Attribute.isDataAttribute("hi!=\"hi!\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"\"=\"hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"\"=\"hi!=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"" + "'", str4, "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;\"");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jsoup.nodes.Attribute.shouldCollapseAttribute("hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", outputSettings2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!\"", "hi!=\"hi!\"=\"\"", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.String str5 = attribute3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str4, "hi!=\"hi!\"=\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"\"" + "'", str5, "hi!=\"hi!\"=\"\"");
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
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
        java.lang.String str13 = attribute3.toString();
        attribute3.setKey("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!\"=\"hi!=&quot;&quot;\"=\"\"");
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!=\"hi!\"" + "'", str11, "hi!=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!=\"hi!\"" + "'", str13, "hi!=\"hi!\"");
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;&quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;&quot;=&quot;hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;&quot;\"", attributes2);
        org.jsoup.nodes.Attribute attribute4 = attribute3.clone();
        org.jsoup.nodes.Attributes attributes5 = attribute3.parent;
        org.jsoup.nodes.Attributes attributes6 = null;
        attribute3.parent = attributes6;
        java.lang.String str8 = attribute3.html();
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"" + "'", str8, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;&amp;quot;&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;amp;quot;hi!&amp;amp;quot;&amp;quot;&amp;quot;&quot;\"");
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;\"", "hi!=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;=&amp;quot;hi!=&amp;quot;hi!&amp;quot;&amp;quot;=&amp;quot;hi!&amp;quot;&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&amp;quot;hi!&amp;quot;&quot;=&quot;hi!&quot;=&quot;hi!&quot;\"", attributes2);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"hi!=&quot;hi!&quot;=&quot;hi!=&quot;hi!&quot;&quot;=&quot;hi!&quot;\"=\"\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"=\"\"");
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"", "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = null;
        attribute2.parent = attributes3;
        java.lang.String str5 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"" + "'", str5, "hi!=\"hi!\"=\"hi!=&quot;hi!&quot;\"");
    }
}

